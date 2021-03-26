package poong.basic.day08;

public class Inheritance2 {

    public void speak() {};
    public void eat() {};
    public void walk() {};
    public void sleep() {};

}

class Student extends Inheritance2 {
    public void study() {};
}

class StudentWorker extends Inheritance2 {
    public void study() {};
    public void work() {};
}

class Researcher extends Inheritance2 {
    public void research() {};
}

class Professor extends Inheritance2 {
    public void research() {};
    public void teach() {};
}

