public class Student {
    private String name;
    private int id;
    private double gpa;
    private String dormRoom;
    private int classCount;
    private boolean isEnrolled;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public Student(String name) {   // overloading constructors; constructors have the same name
        this.name = name;           //but have different parameters, so their signatures are different
    }


    //now will create public methods for getting and setting the values for the objects of the student class
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        if(gpa <= 4) {
            this.gpa = gpa;
        }
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDormRoom()  {
        return this.dormRoom;
    }

    public void setDormRoom(String dormRoom) {
        if(dormRoom.length() > 0) {
            this.dormRoom = dormRoom;
        }
    }
    //following method is not a getter or a setter; but every student would have to register for classes
    //this is an action that is performed;
    public void register() {
        this.classCount++;
        this.isEnrolled = true;
    }

    public void unRegister() {
        this.classCount--;
        if(this.classCount <=0) {
            this.isEnrolled = false;
        }
    }

    public int getClassCount(){
        return this.classCount;
    }

    public void setClassCount(int classCount){
        this.classCount = classCount;
    }
}
