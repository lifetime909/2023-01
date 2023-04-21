package class_school.polymorphism;

public class Test4 {
    public static void main(String[] args) {
        Professor[] professors = new Professor[3];

        professors[0] = new Professor("박상철 교수님", "123456789");
        professors[1] = new Professor("정영철 교수님", "741852963");
        professors[2] = new Professor("류은영 교수님", "159487623");
    
        Util.selectionSort(professors);

        for (Professor psf : professors) {
            System.out.println(psf);
        }
    }
}
