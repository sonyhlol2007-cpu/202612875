void main() {
    final int TEMP = 5;
    Scanner keyboard = new Scanner(System.in);
    int start, end;
    int even, odd;

    for ( ; true; ) {
        System.out.print("어디부터 시작할까요 ? ");
        start = keyboard.nextInt();
        System.out.printf("어디까지 더할까요 ? (최소값 = %d) ", start + 5);
        end = keyboard.nextInt();
        if (end >= start + 5)
            break;
        else {
            System.err.print("ERROR : 사작값(%d)는 마지막 값 (%d)보다 %d가 크거나 같아야 함",
                    start, end, TEMP);
            System.in.read();
        }
    }
}