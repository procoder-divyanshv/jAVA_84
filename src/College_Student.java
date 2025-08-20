public class College_Student extends Student_1 {
    public College_Student(String name, int roll_no) {
        super(name, roll_no);
    }

    public void attend_class(){
        System.out.println(name+" attend class on Smart Board");
    }
    public void give_class(){
        System.out.println(roll_no+" give exam in online mode");

    }

}
