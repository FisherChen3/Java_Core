package designpattern.templatemethod;

/**
 * Created by Fisher on 4/4/2017.
 */
public abstract class BasicEngineering {
    public void Papers(){
        // common papers
        math();
        softSkill();
        // specialized paper
        specialPaper();
    }
    //Non-Abstract method Math(), SoftSkills() are //already implemented by Template class
    private void math(){
        System.out.println("Mathematics");
    }
    private void softSkill(){
        System.out.println("SoftSkills");
    }
    //Abstract method SpecialPaper() must be implemented in derived classes
    public abstract void specialPaper();
}
