import java.util.ArrayList;
/**
 * Endorsement class for storing endorsement data
 *
 * @author Sam Judges, Tim Hake
 * @version 29/04/2021
 */
public class Endorsement			/*Encapsulated attributes of the endorsement class*/
{
    private int id;
    
    private String content;
    
    private int postID;
    
    private String postContent;
    
    private String author;
         
       
    public Endorsement( int i, String c, int pID, String pc, String a ) {		/*Endorsement method for instantiating endorsement objects*/
        this.id = i;
        this.content = c;
        this.postID = pID;
        this.postContent = pc;
        this.author = a;
    }
}
