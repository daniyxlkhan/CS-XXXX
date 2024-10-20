import java.io.*;

public class file2 {
    public static void main (String[] args) {
        try {
            FileInputStream f2 = new FileInputStream("File2.bin");
            ObjectInputStream inStream = new ObjectInputStream(f2);

            while (true) {
                try {
                    char c = inStream.readChar();
                    if (c == 'G') {
                        c = '7';
                    }
                    System.out.print(c);
                } catch (EOFException eofe) {
                    break;
                }
            } 
            inStream.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }   
    }    
}

/*
 * C o n g r a t s   o n   f i n i s h i n g   p a r t   2 !  
 *  T h e   t i m e   o f   t h e   s e c r e t   m e e t i n g   w i l l   b e   1 0 : 0 0 A M   o n   T h u r s d a y .
 *  F i l e   3   c o n t a i n s   2   d o u b l e s   w h i c h   r e p r e s e n t   t h e   l o n g i t u d e
 *    a n d   l a t i t u d e   o f   t h e   m e e t i n g .
 */