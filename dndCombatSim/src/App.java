public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        DiceSet TwoDSix = new DiceSet(new int[]{6,6}, 0);
        System.out.println(TwoDSix.largestDice());
        System.out.println(TwoDSix.toString());

        DiceUser user = new DiceUser();
        DiceSet dice1 = new DiceSet(new int[]{10,10}, 10);
        DiceSet dice2 = new DiceSet(new int[]{10,10}, 13);

        System.out.println(dice1.toString());
        System.out.println(dice2.toString());

        System.out.println(user.chanceToBeat(dice1, dice2, 100000000));
    }
}
