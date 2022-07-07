import java.util.Scanner;

public class untitled {
    public static void main(String[] args) {
    String[] student = {"A","B","C","D","E"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name's student : ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length;i++){
            if (student[i].equals(input_name)){
                System.out.println("Position of the students in the list " + input_name +"is: " + (i + 1 ));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found" + input_name + "int the list.");
    }
}
