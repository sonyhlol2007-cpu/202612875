void main() {
    Scanner keyboard = new Scanner(System.in);
    final float DON = 3.75f;
    final int GOLD = 775000;
    float weight;

    System.out.print("당신의 몸무게는 ? ");
    weight = keyboard.nextFloat();

    /* int weight1 = (int) weight;
    float remainder = weight - weight1;

    int gram = weight1 * 1000 + remainder * 1000; */

    int gram1 = (int) (weight * 1000);
    float donofweight = gram / DON;

    System.out.printf("%.1f Kg = %,d (%,d) gram\n", weight, gram, gram1);
    System.out.printf("%.1f Kg = %,.2f 돈\n", weight, donofweight);
    System.out.printf("%.1f Kg = %,d 원(금 1돈 가격 = %,d원)\n", weight, money, GOLD);
}