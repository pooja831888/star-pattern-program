import java.io.*;
public class seven {

    public static void main(String [] args) throws IOException {
        String studentname;
        int rollno;
        float per;

        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter studemt number,rollno,per");
        studentname=dis.readLine();
        rollno=Integer.parseInt(dis.readLine());
        per=Float.parseFloat(dis.readLine());
        
        System.out.println(studentname);
        System.out.println(rollno);
        System.out.println(per);

        
    }
    
}
