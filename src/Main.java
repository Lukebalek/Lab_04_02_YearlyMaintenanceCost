public class Main {
    public static void main(String[] args) {
        double summer = 1500;
        double fall = 1390;
        double winter = 2200;
        double spring = 1850;
        double totalCost = 0;

        System.out.println("Your home maintenance for summer is " + summer);
        System.out.println("Your home maintenance for fall is " + fall);
        System.out.println("Your home maintenance for winter is "+ winter);
        System.out.println("Your home maintenance for spring is " + spring);

        totalCost = summer + fall + winter + spring;
        System.out.println("The yearly home maintenance is " + totalCost);
    }
}