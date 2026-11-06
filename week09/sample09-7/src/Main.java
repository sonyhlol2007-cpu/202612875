void main() {
    final int MONEY = 100000000;
    int month = 1;
    int life = MONEY;

    for (int i = month; true; i++) {
        life -= 2000000;
        if (i % 12 == 0){
            life = (int) (life + (life * (5 / 100.0f)));
        }
        System.out.printf("%d개월 후 원금 : %,11d원\n", i, life);
        if (life <= 0)
            break;
    }


}