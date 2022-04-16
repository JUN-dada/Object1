public class student
{
    public static void main(String[] args)
    {
        student student01 =new student();
        student01.studentID=10;
        student01.studentName="张三";
        student01.studentAge=10;
        student01.score=99;
        student student02 =new student();
        student02.studentID=11;
        student02.studentName="张四";
        student02.studentAge=18;
        student02.score=90;
        student student03 =new student();
        student03.studentID=12;
        student03.studentName="张五";
        student03.studentAge=19;
        student03.score=93;

        student01.studying();
        student02.studying();
        student03.studying();
    }

    /*############################## */
    int studentID;
    String studentName;
    int studentAge;
    int score;

    public void studying()
    {
        System.out.println("正在学习"+studentName);
    }


}
