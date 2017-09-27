/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package showfile;

import java.io.*;

public class ShowFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        FileInputStream fin;
        if(args.length!=1) {
            System.out.println("Using: ShowFile");
            return;
        }
        
        try{
            fin=new FileInputStream(args[0]);
        }catch(FileNotFoundException ex) {
                System.out.println("File not found!");
        }
        
        try{
            do{
                i=fin.read();
                if(i!=-1) System.out.print((char)i);
                }   while(i!=-1);
        } catch(IOException ex) {
            System.out.println("Error read file");
        }
        try{
            fin.close();
        }catch(IOException ex) {
            System.out.println("Error closing file");
        }
    }
    
}
