package prototypepattern;

/**
 * Created by sun on 15/12/11.
 */
public class Resume implements Cloneable{

    private String name;
    private String sex;
    private String age;
    private String selfIntroduction;
    private String company;
    private String hobbies;

    public Resume(String name){
        this.name = name;
    }

    public void Display(){
        System.out.println("这是"+name+"的简历\n"+
                "年龄:"+age+"\n"+
                "性别:"+sex+"\n"+
                "自我介绍:"+selfIntroduction+"\n"+
                "应聘公司:"+company+"\n"+
                "兴趣爱好:"+hobbies);
    }

    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
}
