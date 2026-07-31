package Greedy;

public class CoinChange {

    public static void main(String[] args) {

        int[] coins = {2000, 500, 100, 50, 20, 10, 5, 2, 1};

        int amount = 2893;

        System.out.println("Coins Used:");

        for (int coin : coins) {

            while (amount >= coin) {
                System.out.println(coin);
                amount -= coin;
            }
        }
    }
}