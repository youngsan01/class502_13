package exam01;

public class Ex01 {
    public class Employee {
        public String name;
        public String grade;
        public Employee(String name) {
            this.name = name
        }
    }
    public class Engineer extends Employee {
        private String skillset;
        public String getSkillSet() {
            return skillset;
        }
       public void setSkillSet(Strin skillset)
         this.skillSet = skillset;
    }

