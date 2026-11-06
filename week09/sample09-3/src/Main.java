void main() {
    Scanner keyboard = new Scanner(System.in)
    final int START = 1;
    final int END = 100;
    int total = 0;

    for (int i = START; i <= END; i++){
        total += i;
    }
    System.out.printf("%d + %d + .... + %d + %d = &,d\n",
            START, START + 1, END = 1, END, totla);

    System.out.print("어디부터 시작 할까요 ? ");
    first = keyboard.nextInt();
    System.out.print("어디부터 더할까요 ? ");
    last = keyboard.nextInt();
    for (int i = first; i <= last; i++) {
        total += i;
    }
}