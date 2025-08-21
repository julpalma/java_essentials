package handling_exceptions;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    // -------------- EXCEPTION HANDLING ---------------------------------------
    // Exception is an event that occurs at runtime that disrupts the normal flow of the program due to an error.
    // checked exception: is verified by the compiler before the code is executed.
    // unchecked exception: not verified by the compiler. Ex. Runtime exceptions.
    // Polymorphism: handles a hierarchy of exceptions.
    // series of try/catch: handles multiple exceptions in different ways.
    // Finally block is executed even if an exception is thrown.
    // If the method has the potential to throw a checked exception, we must either catch the exception or rethrow.

    public void catchingExceptions() {
        File file = new File("resources/nonexistent.txt");
        Scanner fileReader = null;

        try{
            //file.createNewFile();
            fileReader = new Scanner(file);
            while(fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }
        } catch(IOException e) {
            System.out.println("Sorry, an error has occured while creating a new file." + e.getMessage());
            // prints the stack trace, history of the call made in the code.
            // the last line of the stack trace is where the code that caused the error begins.
            e.printStackTrace();
        } catch (InputMismatchException en) {
            System.out.println("Handling InputMismatchException. " + en.getMessage());
        } finally {
            // code that is executed even if an exception is thrown
            assert fileReader != null;
            fileReader.close();
        }
    }

    public void rethrowingExceptions() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();

    }

    public void throwingExceptions() {
        double hours;
        double payRate;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many hours did you work?");
        hours = scanner.nextInt();

        System.out.println("HWhat is your payRate?");
        payRate = scanner.nextInt();

        if(hours > 40) {
            throw new IllegalArgumentException("Hours must be less than 40 hours");
        }

        if(hours <0 || payRate < 0) {
            throw new NegativeArraySizeException("Hours and payRate must be more than 0 hours");
        }
    }
}
