/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bookpack;

/**
 *
 * @author OOtumbay
 */
public class Book {
    protected String title;
    protected String author;
    protected int pubDate;
    
    public Book(String t,String a,int p) {
        title=t;
        author=a;
        pubDate=p;
        
    }
    
   public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
    
}
