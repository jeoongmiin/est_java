package java_0611;

public class Student {
    int level;
    public Student(int level) {
        this.level = level;
    }
    public void levelUp() {
        level++;
        System.out.println("Level up " + level);
    }
    public void levelDown() {
        if (level > 1) {
            level--;
            System.out.println("Level down " + level);
        }
        else System.out.println("레벨 감소 불가");
    }
}