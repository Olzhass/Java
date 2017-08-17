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
public class BookDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bookpack.Book books[]=new bookpack.Book[5];
        books[0]=new bookpack.Book("Alban", "Olzhas", 1993);
        books[1]=new bookpack.Book("Ayazhan", "Asel", 1983);
        books[2]=new bookpack.Book("Togzhan", "Assem", 1957);
        books[3]=new bookpack.Book("Fariza", "Assem", 2014);
        books[4]=new bookpack.Book("Enlik", "Bakosh", 1955);
        
        for(int i=0;i<books.length;i++) {
            books[i].show();
            
        }
    }
    
}
