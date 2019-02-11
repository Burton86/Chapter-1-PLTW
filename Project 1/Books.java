
/**
 * Write a description of class Books here.
 *
 * @author (Kyle Burton)
 * @version (2/8/19)
 */
public class Books
{
    private int rating;
    private String title;
    private boolean favorite;
    
    public Books()
    {    
        rating = 0;
        title = "";
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String t){
        title = t;
    }
    public Integer getRating(){
        return rating;
    }
    public void setRating(int r){
        rating = r;
    }
    public void addToFavorites(){
        favorite = true;
    }
}
