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
    
    private int postID;
    
    private String postContent;
    
    private String author;
         
       
    public Endorsement( int i, String c, int pID, String pc, String a ) {
        this.id = i;
        this.content = c;
        this.postID = pID;
        this.postContent = pc;
        this.author = a;
    }
}
