import java.util.ArrayList;
import java.io.IOException;



/**
 * BadSocialMedia is a minimally compiling, but non-functioning implementor of
 * the SocialMediaPlatform interface.
 * 
 * @author Diogo Pacheco
 * @version 1.0
 */
public class SocialMedia implements SocialMediaPlatform {
    int postPointer = 0;
    int endorsementPointer = 0;
    int commentPointer = 0;
    int accountTotal = 0;
    
    String printMessage;
    
    ArrayList<Account> allAccounts = new ArrayList<Account>();
    
    
    @Override
    public int createAccount(String handle) throws IllegalHandleException, InvalidHandleException {
        // TODO Auto-generated method stub
        //concern: we dont have a check for unique handles which could complicate things later
        ArrayList<Post> p = new ArrayList<Post>();
        Account temp = new Account(allAccounts.size()+1, handle, "n/a", p );
        allAccounts.add(temp);
        return temp.getId();
    }

    @Override
    public int createAccount(String handle, String description) throws IllegalHandleException, InvalidHandleException {
        // TODO Auto-generated method stub
        //concern: we dont have a check for unique handles which could complicate things later
        ArrayList<Post> p = new ArrayList<Post>();
        Account temp = new Account(allAccounts.size()+1, handle, description, p );
        allAccounts.add(temp);
        return 0;
    }

    @Override
    public void removeAccount(int id) throws AccountIDNotRecognisedException {
        // TODO Auto-generated method stub
        allAccounts.forEach( acc -> {
                    if (acc.getId() == id) {
                        allAccounts.remove(acc);
                    }
                });
    }

    @Override
    public void removeAccount(String handle) throws HandleNotRecognisedException {
        // TODO Auto-generated method stub
        allAccounts.forEach( acc -> {
                    if (acc.getHandle() == handle) {
                        allAccounts.remove(acc);
                    }
                });
    }

    @Override
    public void changeAccountHandle(String oldHandle, String newHandle)
            throws HandleNotRecognisedException, IllegalHandleException, InvalidHandleException {
        // TODO Auto-generated method stub
        allAccounts.forEach( acc -> {
            if (acc.getHandle() == oldHandle) {
                acc.setHandle(newHandle);
            }
        });

    }

    @Override
    public void updateAccountDescription(String handle, String description) throws HandleNotRecognisedException {
        // TODO Auto-generated method stub
        allAccounts.forEach( acc -> {
            if (acc.getHandle() == handle) {
                acc.setDescription(description);
            }
        });

    }

    @Override
    public String showAccount(String handle) throws HandleNotRecognisedException {
        // TODO Auto-generated method stub
        allAccounts.forEach( acc -> {
            if (acc.getHandle() == handle) {
                System.out.println("ID: "+acc.getId());
                System.out.println("Handle: "+acc.getHandle());
                System.out.println("Description: "+acc.getDescription());
                System.out.println("Post Count: "+acc.getPostCount());
                System.out.println("Endorse Count: "+acc.getEndorseCount());
            }
        });
        return null;
    }

    @Override
    public int createPost(String handle, String message) throws HandleNotRecognisedException, InvalidPostException {
        // TODO Auto-generated method stub
        postPointer = postPointer + 1;
        
        ArrayList<Comment> c = new ArrayList<Comment>();
        ArrayList<Endorsement> e = new ArrayList<Endorsement>();
        
        
        Post temp = new Post(postPointer, message, c, e, handle);
        
        allAccounts.forEach( acc -> {
            if (acc.getHandle() == handle) {
                acc.addPost(temp);
            }
        });
        
        return 0;
    }

    @Override
    public int endorsePost(String handle, int id)
            throws HandleNotRecognisedException, PostIDNotRecognisedException, NotActionablePostException {
        // TODO Auto-generated method stub
        
        endorsementPointer = endorsementPointer + 1;
        
        allAccounts.forEach( acc -> {
            acc.getPosts().forEach( post -> {
                if (post.getId() == id) {
                    String cont = "EP@" + post.getAuthor() + ": " + post.getContent();
                    
                    Endorsement temp = new Endorsement(endorsementPointer, cont, post.getId(), post.getContent(), handle);
                    
                    post.addOneToEndorsements(temp);
                }
            });
        });
        
        return endorsementPointer;
    }

    @Override
    public int commentPost(String handle, int id, String message) throws HandleNotRecognisedException,
            PostIDNotRecognisedException, NotActionablePostException, InvalidPostException {
        // TODO Auto-generated method stub
        commentPointer = commentPointer + 1;
        
        allAccounts.forEach( acc -> {
            acc.getPosts().forEach( post -> {
                if (post.getId() == id) {
                    String cont = message;
                    
                    Comment temp = new Comment(commentPointer, cont, id, handle);
                    
                    post.addOneToComments(temp);
                }
            });
        });
        
        return commentPointer;
    }

    @Override
    public void deletePost(int id) throws PostIDNotRecognisedException {
        // TODO Auto-generated method stub
        allAccounts.forEach( acc -> {
            acc.getPosts().forEach( post -> {
                if (post.getId() == id) {
                    post = null;
                    System.gc();
                }
            });
        });
    }

    @Override
    public String showIndividualPost(int id) throws PostIDNotRecognisedException {
        // TODO Auto-generated method stub
        printMessage = "";
        
        allAccounts.forEach( acc -> {
            acc.getPosts().forEach( post -> {
                if (post.getId() == id) {
                        printMessage = "ID: " + id + "\n" + "Account: " + post.getAuthor() + "\n" + "No. endorsements: "; 
                        printMessage = printMessage + post.calculateEndorsments() + "\n" + post.getContent();
                }
            });
        });
        
        return printMessage;
    }

    @Override
    public StringBuilder showPostChildrenDetails(int id)
            throws PostIDNotRecognisedException, NotActionablePostException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getNumberOfAccounts() {
        // TODO Auto-generated method stub
        accountTotal = 0;
        allAccounts.forEach( acc -> {
            accountTotal = accountTotal + 1;
        });
        return accountTotal;
    }

    @Override
    public int getTotalOriginalPosts() {
        // TODO Auto-generated method stub
		totalPosts = 0;
		allAccounts.forEach( acc -> {
			totalPosts = totalPosts + acc.getPostCount();
		});
        return totalPosts;
    }

    @Override
    public int getTotalEndorsmentPosts() {
        // TODO Auto-generated method stub
		totalEndorsement = 0;
		allAccounts.forEach( acc -> {
			totalEndorsement = totalEndorsement + acc.getEndorseCount();
		});
        return totalEndorsement;
    }

    @Override
    public int getTotalCommentPosts() {
        // TODO Auto-generated method stub
		totalComments = 0;
		allAccounts.forEach( acc -> {
			totalComments = totalComments + acc.getCommentCount();
		});
        return totalComments;
    }

    @Override
    public int getMostEndorsedPost() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getMostEndorsedAccount() {
        // TODO Auto-generated method stub
		mostEndorsed = 0;
		mostEndorsedID = 0;
		allAccounts.forEach( acc -> {
			if(acc.getEndorseCount() > mostEndorsed)
			{
				mostEndorsed = acc.getEndorseCount();
				mostEndorsedID = acc.getId();
			}
		});		
        return mostEndorsedID;
    }

    @Override
    public void erasePlatform() {
        // TODO Auto-generated method stub

    }

    @Override
    public void savePlatform(String filename) throws IOException {
        // TODO Auto-generated method stub

    }

    @Override
    public void loadPlatform(String filename) throws IOException, ClassNotFoundException {
        // TODO Auto-generated method stub

    }

}
