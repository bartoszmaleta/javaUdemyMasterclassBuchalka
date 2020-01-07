package controlFlowStatements;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println("----------------------");
        System.out.println(canPack(1, 0, 5));
        System.out.println("----------------------");
        System.out.println(canPack(0, 5, 4));
        System.out.println("----------------------");
        System.out.println(canPack(2, 2, 11));
        System.out.println("----------------------");
        System.out.println(canPack(-3, 2, 12));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        int sum = bigCount * 5 + smallCount * 1;
        if (sum < goal) {
            return false;
        }
        if (sum == goal) {
            return true;
        }
        while (sum > goal && bigCount > 0) {
            if ((sum - 5) < goal)
                break;
            sum -= 5;
            bigCount--;
        }
        return sum - smallCount <= goal;
    }
}