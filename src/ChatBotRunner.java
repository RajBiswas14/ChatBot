public class ChatBotRunner {
    public static void main(String [] args) {
        ChatBot debbie = new ChatBot ("debbie", 14);
        debbie.greeting ("Raj Biswas");
        debbie.favoriteNumber(15);
        debbie.weather();
        debbie.Bday( "January");
        double meters = debbie.convertFeetToMeters(32);
        System.out.println("There are " + meters + " in 32 feet");
        int sum = debbie.addNumbers(14, 12, 42);
        System.out.println("The sum is: " + sum);
        String mes = debbie.goodbye();
        System.out.println(mes);
        int inches = debbie.convertFeetToInches(10);
        System.out.println("There are " + inches + " in 10 feet");
    }
}
