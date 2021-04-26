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
    
    public int getId() {
        return id;
    }
    
    public String getHandle() {
        return handle;
    }
       
    public Account( int i, String h, String d,ArrayList<Post> p ) {
        this.id = i;
        this.handle = h;
        this.description = d;
        this.posts = p;
    }
}
