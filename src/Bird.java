public abstract class Bird {

    private String name;
    private int age;

    public Bird (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int descend() {
        return 0;
    }

    public int ascend() {
        return 0;
    }

/*    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {return age;}

    public void setAge(int age) {
        this.age = age;
    }


    } */
}
