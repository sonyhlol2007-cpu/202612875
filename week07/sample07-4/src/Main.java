void main() {
    Scanner keyboard = new Scanner(System.in);
    int salary;
    int tax;
    String result;
    final int MIN = 2000000;
    final int MAX = 30000000;

    System.out.print("당신의 급여를 입력 : ");
    salary = keyboard.nextInt();

    if (salary <= 2000000) {
        tax = 0;
    } else if (salary <= 4000000) {
        tax = (int) ((salary - 2000000) * (10.0f / 100));
    } else if (salary <= 6000000) {
        tax = (int) ((salary - 2000000) * (8.0f / 100));
    } else if (salary <= 20000000) {
        tax = (int) ((salary - 2000000) * (6.0f / 100));
    } else {
        tax = (int) ((salary - 2000000) * (5.0f / 100));
    System.out.printf("급여액이 %,d 원이면 %,d원의 세금을 납부하세요.\n", salary, tax);
    } else {
        result = "ERROR : 급여액은 0 ~ 30000000 임";
    }

    System.out.printf("급여액이 %,d 원이면 %,d원의 세금을 납부하세요.\n", salary, tax);
}
