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
    ArrayList<Account> allAccounts = new ArrayList<Account>();
    @Override
    public int createAccount(String handle) throws IllegalHandleException, InvalidHandleException {
        // TODO Auto-generated method stub
        ArrayList<Post> p = new ArrayList<Post>();
        Account temp = new Account(allAccounts.size()+1, handle, "n/a", p );
        allAccounts.add(temp);
        return 0;
    }

    @Override
    public int createAccount(String handle, String description) throws IllegalHandleException, InvalidHandleException {
        // TODO Auto-generated method stub
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
				System.out.println("ID: "+acc.getID());
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
        return 0;
    }

    @Override
    public int endorsePost(String handle, int id)
            throws HandleNotRecognisedException, PostIDNotRecognisedException, NotActionablePostException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int commentPost(String handle, int id, String message) throws HandleNotRecognisedException,
            PostIDNotRecognisedException, NotActionablePostException, InvalidPostException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deletePost(int id) throws PostIDNotRecognisedException {
        // TODO Auto-generated method stub

    }

    @Override
    public String showIndividualPost(int id) throws PostIDNotRecognisedException {
        // TODO Auto-generated method stub
        return null;
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
        return 0;
    }

    @Override
    public int getTotalOriginalPosts() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getTotalEndorsmentPosts() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getTotalCommentPosts() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getMostEndorsedPost() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getMostEndorsedAccount() {
        // TODO Auto-generated method stub
        return 0;
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
