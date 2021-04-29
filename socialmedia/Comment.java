import java.util.ArrayList;
/**
 * Comment class for storing comment data.
 *
 * @author Sam Judges, Tim Hake
 * @version 29/04/2021
 */
public class Comment				/*Encapsulated attributes of the Comment class*/
{
    private int id;
    
    private String content;
    
    private ArrayList<Comment> comments = new ArrayList<Comment>();
    
    private ArrayList<Endorsement> endorsements = new ArrayList<Endorsement>();
    
    private int postID;
    
    private String author;
    
    private int EndorsementCount;
    
    public void calculateEndorsments(){		/*Method to count the endorsements each comment has*/
        endorsements.forEach( en -> {
            EndorsementCount++;
        });
    }
         
    public Comment( int i, String c, int pID, String a) {		/*Method to instantiate comment objects without setting comments and endorsements*/
        this.id = i;
        this.content = c;
        this.postID = pID;
        this.author = a;
    }
    public Comment( int i, String c, ArrayList<Comment> co, ArrayList<Endorsement> e, int pID, String a) {		/*Method to instantiate comment objects*/
        this.id = i;
        this.content = c;
        this.comments = co;
        this.endorsements = e;
        this.postID = pID;
        this.author = a;
    }
}
