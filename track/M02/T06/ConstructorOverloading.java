
class ConstructorOverloading {

    public static void main(String[] args) {
        Constructor s1 = new Constructor();
        s1.display();
        Constructor s2 = new Constructor("Manu");
        s2.display();
        Constructor s3 = new Constructor("Ram", 18, 5.5);
        s3.display();
    }
}

class Constructor {

    String name;
    int age;
    double height;

    Constructor() {
        name = "Anu";
        age = 19;
        height = 5.0;
    }

    Constructor(String name) {
        this.name = name;
    }

    Constructor(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
