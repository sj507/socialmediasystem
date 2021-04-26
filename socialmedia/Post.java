import java.util.ArrayList;
/**
 * Account class, for creating and storing account data.
 */
public class Post
{
    private int id;
    
    private String content;
    
    private ArrayList<Comment> comments = new ArrayList<Comment>();
    
    private ArrayList<Endorsement> endorsements = new ArrayList<Endorsement>();
	
	private String author;
         
       
    public Post( int i, String c, ArrayList<Comment> co, ArrayList<Endorsement> e, String a ) {
        this.id = i;
        this.content = c;
        this.comments = co;
        this.endorsements = e;
		this.author = a;
    }
}

