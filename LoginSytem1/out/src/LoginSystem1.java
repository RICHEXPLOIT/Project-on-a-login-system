import java.util.Scanner;

public class LoginSystem1 {
            public static void main(String[] args) {

                //Declaring and initializing an array of users
                String[] users = {"Charles", "Richard", "Gloria", "Emmanuel", "Robert", "Prosper", "Romeo", "Mary", "Martha"};

                //creating an object of the scanner class
                Scanner name = new Scanner(System.in);

                //prompting the user to enter Name
                System.out.println("Enter your user name: ");

                //accepting the input
                String inputUserName = name.nextLine();

                //checking if the username is in the list
                boolean user = linearSearch(users, inputUserName);

                //giving the variable user found a condition
                if (user) {
                    System.out.println("UserName found: " + inputUserName);
                } else {
                    System.out.println("UserName not found.");
                }
                name.close();
            }

            public static boolean linearSearch(String[] users, String target) {
                for (String user : users) {
                    if (user.equals(target)) {
                        return true;//user found
                    }
                }
                return false;//user not found

            }
        }


