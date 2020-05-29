package com.company;

import controllerNews.ControllerNews;
import news.News;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        News[] news = new News[3];
        news[0] = new News("Страшне! Неймовірне!");
        news[1] = new News("Нова дорога в місті");
        news[2] = new News("Відома людина зробила це...");

        String [] path =  { "edit/0" , "view/1" , "view/2" };
        ControllerNews controllerNews = new ControllerNews(news);


        for(String s: path) {
            StringTokenizer st = new StringTokenizer(s, " /");
            if(st.nextToken().toString().equals("view")){
                controllerNews.view(Integer.parseInt(st.nextToken()));
            }else{
                System.out.print("Ведите новый заголовок: ");
                controllerNews.edit(Integer.parseInt(st.nextToken()),new Scanner(System.in).next());
            }
        }
    }
}

