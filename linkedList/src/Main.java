import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LLStack<Integer> stack = new LLStack<>();

        int scelta;
        int value;

        do {
            System.out.println("\n===== STACK MENU =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Count");
            System.out.println("5. Print Stack");
            System.out.println("0. Exit");
            System.out.print("Scelta: ");

            scelta = input.nextInt();

            switch (scelta) {

                case 1:
                    System.out.print("Value to push: ");
                    value = input.nextInt();
                    stack.push(value);
                    System.out.println("Elemento inserito.");
                    break;

                case 2:
                    Integer popped = stack.pop();
                    if (popped == null)
                        System.out.println("Stack vuoto!");
                    else
                        System.out.println("Elemento rimosso: " + popped);
                    break;

                case 3:
                    Integer top = stack.peek();
                    if (top == null)
                        System.out.println("Stack vuoto!");
                    else
                        System.out.println("Elemento in cima: " + top);
                    break;

                case 4:
                    System.out.println("Numero elementi: " + stack.count());
                    break;

                case 5:
                    System.out.println(stack.toString());
                    break;

                case 0:
                    System.out.println("Uscita...");
                    break;

                default:
                    System.out.println("Opzione non valida!");
            }

        } while (scelta != 0);

        input.close();
    }
}