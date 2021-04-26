import java.util.ArrayList;
/**
 * Write a description of class Endorsement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Endorsement
{
	private int id;
    
    private String content;
    
    private ArrayList<Comment> comments = new ArrayList<Comment>();
    
    private ArrayList<Endorsement> endorsements = new ArrayList<Endorsement>();
	
	private int postID;
	
	private String postContent;
         
       
    public Endorsement( int i, String c, ArrayList<Comment> co, ArrayList<Endorsement> e, int pID, String pc ) {
        this.id = i;
        this.content = c;
        this.comments = co;
        this.endorsements = e;
		this.postID = pID;
		this.postContent = pc;
    }
}
