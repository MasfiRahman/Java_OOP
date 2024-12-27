public class Teacher2 extends Person2{
    
    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    void display3(){
        System.out.println("Gender : "+getGender());
        System.out.println("ID : "+getId());
        System.out.println("Skill : "+getSkill());
}
}
