/*Create classes Student and Sports. Create another class Result inherited from Student and 
Sports. Display the academic and sports score of a student.  */

interface student
{
    public static final double acaScore=93.0;
    public abstract void academicScore(String studName);
}


interface Sports
{
    public abstract void SportsScore(double score);
}

class Result implements student,Sports{

    public void academicScore(String studName)
    {
       // double acaScore=score;
        System.out.println("The academic detais:"+studName+"\n Score:"+acaScore);
    }

    public void SportsScore(double score)
    {
        System.out.println("Sports Score:"+score);

    }

}

class SportMain
{
    public static void main(String args[])
    {
        Result res = new Result();
        res.academicScore("Ann");
        res.SportsScore(55.5);
    }

}