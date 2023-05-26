

class CheckVoice {
    public void Voice(){
        System.out.println("Selected Animal Voice");
    }
}

class Cat extends CheckVoice{

    @Override
    public void Voice() {
        System.out.println("Cat Voice");
    }
}

class Dog extends CheckVoice{

    @Override
    public void Voice() {
        System.out.println("Dog Voice");
    }
}
public class Animal {
    public static void main(String[] args) {
        System.out.println(" This Is Main Class-: ");

      CheckVoice animal=new Cat();
        animal.Voice();

        animal=new Dog();
        animal.Voice();

    }
}
