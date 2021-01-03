package q6;

import java.io.*;
import java.util.Scanner;


public class Application {

    public static void main(String[] args) throws IOException {
		writeStudent();
		readFile();
    }

    public static void writeStudent() throws IOException {
        FileWriter write = new FileWriter("student.txt");
        Scanner scan = new Scanner(System.in);

        System.out.println("NO");
        String studentNo = scan.nextLine();
        write.write(studentNo + "\n");


        System.out.println("İsim");
        String studentName = scan.nextLine();
        write.write(studentName + "\n");


        System.out.println("Soyisim ");
        String studentSurname = scan.nextLine();
        write.write(studentSurname + "\n");

        System.out.println(" Yaş");
        String StudentAge = scan.nextLine();

        write.write(StudentAge + "\n");

        System.out.println(" Departman");
        String studentDepartment = scan.next();
        write.write(studentDepartment + "\n");


        write.close();
        System.out.println("Kayıt Tamamlandı");
    }

    public static void readFile() throws FileNotFoundException {
        FileReader file = new FileReader("student.txt");
        System.out.println(file.toString());

        Scanner read = new Scanner(file);
        while (read.hasNextLine()) {
            String data = read.nextLine();
            System.out.println(data);
        }
		read.close();
    }

}
