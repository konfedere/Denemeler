package Week4;

public class Teacher {
    private String designation;
    private String collegeName;
    private String departmentName;
    private String Name;
    private String SurName;

    Teacher(){

    }


    Teacher (String n, String s){
        setDesignation("Teacher");
        setCollegeName("Aydin University");
        setName(n);
        setSurName(s);

    }

    public void setDesignation(String d) {
        this.designation = d;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setCollegeName(String c){
        this.collegeName = c;
    }

    public String getCollegeName(){
        return this.collegeName;
    }
    public void setDepartName(String dn){
        this.departmentName = dn;
    }

    public String getDepartName(){
        return this.departmentName;
    }

    public void setName(String n){
        this.Name = n;
    }

    public String getName(){
        return this.Name;
    }

    public void setSurName(String s){
        this.SurName = s;
    }

    public String getSurName(){
        return this.SurName;
    }

    public void printProperties(){
        /*System.out.println("Designation: " + this.designation);
        System.out.println("College Name:" + this.collegeName);
        System.out.println("Name: "+this.Name);
        System.out.println("Surname: ")+this.SurName);*/
        System.out.println("Designation: " + this.getDesignation());
        System.out.println("College Name:" + this.getCollegeName());
        System.out.println("Name: "+this.getName());
        System.out.println("Surname: "+this.getSurName());

    }
}
