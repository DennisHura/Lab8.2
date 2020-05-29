package controllerNews;;

import news.News;

import java.util.Calendar;

public class ControllerNews {

    private News[] arrayNews;

    public void view(int id){
        System.out.println("Заголовок: " + this.arrayNews[id].getNews());
        System.out.println("Дата создания: " + this.arrayNews[id].getDateCreation().get(Calendar.DAY_OF_MONTH) + "." +
                this.arrayNews[id].getDateCreation().get(Calendar.MONTH) + "." +
                this.arrayNews[id].getDateCreation().get(Calendar.YEAR) + " " +
                this.arrayNews[id].getDateCreation().get(Calendar.HOUR) + ": " +
                this.arrayNews[id].getDateCreation().get(Calendar.MINUTE) + ": " +
                this.arrayNews[id].getDateCreation().get(Calendar.SECOND) + ": " +
                this.arrayNews[id].getDateCreation().get(Calendar.MILLISECOND)
        );

        System.out.println("Дата изменения: " + this.arrayNews[id].getDateChange().get(Calendar.DAY_OF_MONTH) + "." +
                this.arrayNews[id].getDateChange().get(Calendar.MONTH) + "." +
                this.arrayNews[id].getDateChange().get(Calendar.YEAR) + " " +
                this.arrayNews[id].getDateChange().get(Calendar.HOUR) + ": " +
                this.arrayNews[id].getDateChange().get(Calendar.MINUTE) + ": " +
                this.arrayNews[id].getDateChange().get(Calendar.SECOND) + ": " +
                this.arrayNews[id].getDateChange().get(Calendar.MILLISECOND)
        );
    }

    public void edit(int id, String title) {
        this.arrayNews[id].changeNews(title);
        this.view(id);
    }

    public ControllerNews(News[] arrayNews) {
        this.arrayNews = arrayNews;
    }

}
