import java.util.Scanner;
public class Studens {

    Scanner in = new Scanner(System.in);

    // Marks of student project
    private  int [][][]marks = new int[2][2][3];
    public void setMarks() {

        for(int i=0;i<marks.length;i++) {
            System.out.println("School:"+(i+1));
            for(int j=0;j<marks[i].length;j++) {

                System.out.println("Class "+(j+1)+" of school "+(i+1));
                for(int k=0;k<marks[i][j].length;k++) {

                    System.out.println("Enter the marks of School "+(i+1)+" Class "+(j+1)+" student "+(k+1));
                    marks[i][j][k] = in.nextInt();
                }

            }
        }

    }

    public void showMarks() {

        for(int i=0;i<marks.length;i++) {
            System.out.println("School:"+(i+1));
            for(int j=0;j<marks[i].length;j++) {

                System.out.println("Class "+(j+1)+" of school "+(i+1));
                for(int k=0;k<marks[i][j].length;k++) System.out.print(marks[i][j][k] + " ");
                System.out.println();
            }
        }

    }
}
