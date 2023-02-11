package HW_7;

public class Main {

       public static void main(String[] args) {

            ListOfUsers.addUser(new UserCategory("Dmitriy",31,"demetrius.belkin@gmail.com", TypeOfUsers.Модератор));

            ListOfUsers.printUsersList();
            View.run();
    }
    
}