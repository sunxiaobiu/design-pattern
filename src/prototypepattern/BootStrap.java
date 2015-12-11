package prototypepattern;

/**
 * Created by sun on 15/12/11.
 */
public class BootStrap {

    public static void main(String[] args) {
        Resume resume = new Resume("sxy");
        resume.setAge("23");
        resume.setCompany("DP");
        resume.setHobbies("love");
        resume.setSelfIntroduction("hi,I'm a super girl!");

        Resume resume1 = (Resume)resume.clone();
        resume1.setName("tc");
        resume1.setSelfIntroduction("hi,I'm a super man!");

        resume.Display();
        resume1.Display();
    }
}
