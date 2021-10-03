public interface Fly {

    void takeoff();

    void ascend (int meters);

    void descend (int meters);

    void land();

    default void glide() {
        System.out.println("glides into the air");
    }

}
