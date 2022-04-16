public class StudentComputer
{
    public static void main(String[] args)
    {

        coputer c1=new coputer();
        c1.pingpai="美帝良心想";
        c1.jiage=9999;
        coputer c2=new coputer();
        c2.pingpai="one美帝良心想";
        c2.jiage=9998;
        coputer c3=new coputer();
        c3.pingpai="two美帝良心想";
        c3.jiage=9997;
        coputer c4=new coputer();
        c4.pingpai="three美帝良心想";
        c4.jiage=9997;

        StudentComputer student01=new StudentComputer();
        student01.studentID=1;
        student01.age=18;
        student01.coputer=c1;
        StudentComputer student02=new StudentComputer();
        student02.studentID=2;
        student02.age=19;
        student02.coputer=c2;
        StudentComputer student03=new StudentComputer();
        student03.studentID=1;
        student03.age=18;
        student03.coputer=c3;

        student01.study();




    }
    int studentID;
    int age;
    String studentName;
    coputer coputer;

    void study()
    {
        System.out.println("I am studying"+"use computer is"+coputer.pingpai);
    }


}
