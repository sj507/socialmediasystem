import java.util.ArrayList;
/**
 * Post class for storing post data
 *
 * @author Sam Judges, Tim Hake
 * @version 29/04/2021
 */
public class Post
{
    private int id;
    
    private String content;
    
    private String author;
    
    private ArrayList<Comment> comments = new ArrayList<Comment>();
    
    private ArrayList<Endorsement> endorsements = new ArrayList<Endorsement>();
    
    private int EndorsementCount;
    
    public int calculateEndorsments(){
        endorsements.forEach( en -> {
            EndorsementCount++;
        });
        return EndorsementCount;
    }
    
    public void addOneToComments(Comment c) {
        this.comments.add(c);
    }
    
    public void addOneToEndorsements(Endorsement e) {
        this.endorsements.add(e);
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getContent(){
        return this.content;
    }
    
    public ArrayList<Comment> getComments() {
        return this.comments;
    }
    
    public ArrayList<Endorsement> getEndorsements() {
        return this.endorsements;
    }
       
    public Post( int i, String c, ArrayList<Comment> co, ArrayList<Endorsement> e, String a) {
        this.id = i;
        this.content = c;
        this.comments = co;
        this.endorsements = e;
        this.author = a;
    }
}

