public class Nature {

    public static void main(String[] args) {
        Eagle neo = new Eagle("ludwig", 10 );
        System.out.printf("\n%s:%n", neo.getName());
        neo.takeoff();
        neo.ascend(20);
        neo.descend(10);
        neo.land();
        neo.glide();

        Penguin fio = new Penguin("fiora",4);
        System.out.printf("\n%s:%n", fio.getName());
        fio.canSwim();
        fio.deepDiving();
        fio.dive();
        fio.fastSwim();
    }
}
