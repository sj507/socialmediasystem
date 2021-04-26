import java.util.ArrayList;
/**
 * Write a description of class Comment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Comment
{
    private int id;
    
    private String content;
    
    private ArrayList<Comment> comments = new ArrayList<Comment>();
    
    private ArrayList<Endorsement> endorsements = new ArrayList<Endorsement>();
    
    private int postID;
         
       
    public Comment( int i, String c, ArrayList<Comment> co, ArrayList<Endorsement> e, int pID ) {
        this.id = i;
        this.content = c;
        this.comments = co;
        this.endorsements = e;
        this.postID = pID;
    }
}
