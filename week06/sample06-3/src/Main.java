void main() {
    final int radius = 6400;
    final float PI = 3.121592f;
    final int KOREA = 100505;

    double surface = 4 *  PI * radius * radius;

    double ratio = KOREA / surface;

    System.out.printf("지구의 반지름 %d Km, 표면적 %.2f ㎢\n", radius, surface);
    System.out.printf("대한민국 면적 %,d ㎢ 은 %f %% 입니다.\n", KOREA, ratio);
}