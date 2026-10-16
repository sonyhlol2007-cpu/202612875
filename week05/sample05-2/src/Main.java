void main() {
    Scanner keyboard = new Scanner(System.in);
    int price;
    char grade;
    String gradeType;
    int discountRate;
    int discount;
     lastPayment;

    System.out.print("제품 가격 입력 : ");
    price = keyboard.nextInt();
    System.out.print("회원 등급 입력 (V, G, S, N) : ");
    grade = keyboard.next().charAt(0);

    gradeType = grade == 'V' ? "VIP" : (grade == 'G' ? "GOLD" : (grade == 'S' ? "SILVER" : "NONE"));
    discountRate = grade == 'v' ? 20 : (grade == 'G' ? 15 : (grade == 'S' ? 10 : 0));

    discount = (int) (price - (price * discountRate / 100.0));
    lastPayment = discount >= 100000 ? discount - (discount * 10.0 / 100) : discount;
    System.out.printf("물품 가격 : %,d 원\n", price);
    System.out.printf("회원 등급 : %s (%d %% 할인\n", gradeType, discountRate);
    System.out.printf("할인 가격 : %,d원\n", discount);
    System.out.printf("할인 가격 : %,d 원\n", lastPayment);
}
