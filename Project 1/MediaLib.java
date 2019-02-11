
/**
 * Write a description of class MediaLib here.
 *
 * @author (Kyle Burton)
 * @version (2/8/19)
 */
public class MediaLib
{
   public static void main(){
   System.out.println("Welcome to your Media Library");
   
   Song song1 = new Song();
   System.out.println(song1);
   song1.setTitle("Johnny B. Goode");
   System.out.println(song1.getTitle());
   
   Movies movie1 = new Movies();
   System.out.println(movie1);
   movie1.setTitle("Movie Title" + movie1.getTitle());
   System.out.println(song1.getTitle());
       
   Books book1 = new Books();
   System.out.println(book1);
   book1.setTitle("Book Title" + song1.getTitle());
   System.out.println(song1.getTitle());  
   }
}
  
