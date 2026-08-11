public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first value");

    int a = sc.nextInt();
    System.out.println(" Enter the second value");
    int b = sc.nextInt();
    System.out.println(" Enter the third value");
    int c = sc.nextInt();
    System.out.println(" Enter the fourth value");
    int d = sc.nextInt();

    if (a > b && a > c && a > d)
        System.out.println("a is greater");
    else if (b > a && b > c &&
            b > d)
        System.out.println(" b is greater");
    else if (c > a && c > b && c > d)
        System.out.println("c is greater");
    else {
        System.out.println(" d is greater");

    }
}
