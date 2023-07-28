import java.util.Scanner;
import java.util.Stack;
class ReverseString{
    public static void main(String args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }
        System.out.println("Reversed string: ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}

/*
Create a program that reads a string from the user and prints it out in reverse order using a stack. After processing the string print it.
 */