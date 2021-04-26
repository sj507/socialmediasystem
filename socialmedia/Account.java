import java.util.ArrayList;
/**
 * Account class, for creating and storing account data.
 */
public class Account
{
    private int id;
    
    private String handle;
    
    private String description;
    
    private ArrayList<Post> posts = new ArrayList<Post>();
	
	private ArrayList<Comment> comments = new ArrayList<Comment>();
	
	private ArrayList<Endorse> endorsements = new ArrayList<Endorse>();
	
	private int endorseCount;
	
	public void endorseCalc(){
		for 
    
    public int getId() {
        return id;
    }
    
    public String getHandle() {
        return handle;
    }
	
	public String getDescription() {
		return description;
	}
	
	public int getPostCount() {
		return posts.size();
	}
	
	public int getEndorseCount() {
		return endorseCount;
	}
	
	public void setHandle(String newH){
		this.handle = newH;
	}
	
	public void setDescription(String newD){
		this.description = newD;
	}
       
    public Account( int i, String h, String d,ArrayList<Post> p ) {
        this.id = i;
        this.handle = h;
        this.description = d;
        this.posts = p;
    }
}
