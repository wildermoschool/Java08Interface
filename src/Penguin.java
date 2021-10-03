public class Penguin extends Bird implements Swim {

    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void canSwim() {
        System.out.println(getName()+ " is a good swimmer");
    }

    @Override
    public void dive() {
        System.out.println(getName()+" loves diving");
    }

    @Override
    public void fastSwim() {
        System.out.println("oh boy "+ getName() + " is very fast");
    }

    @Override
    public void deepDiving() {
        System.out.println(getName()+" goes not that deep");
    }
}



