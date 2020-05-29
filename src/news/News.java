package news;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class News {

    private String title;
    private Calendar dateCreation;
    private Calendar dateChange;


   public String getTitle() {
       return title;
   }


    public Calendar getDateCreation() {
        return dateCreation;
    }

    public Calendar getDateChange() {
        return dateChange;
    }

    public void changeNews(String title) {
       this.title = title;
       this.dateChange = new GregorianCalendar();
    }

    public News(String title){
       this.title = title;
        this.dateCreation = new GregorianCalendar();
        this.dateChange = new GregorianCalendar();
    }
    public String getNews(){
        return title;
    }

}
