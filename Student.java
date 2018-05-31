

/**
 *
 * @author Hasee Amarathunga
 */
public class Student {
    String Reg_No,gender,name,DOB;
    int CS,stat,maths;
    double avg;
    char grade;
    
    public Student(String reg,String name,String Gender,String dob){
        this.Reg_No=reg;
	this.name=name;
	this.gender=Gender;
	this.DOB=dob;
    }
    
    public double calculateStudentAverage(){
        avg=(CS+stat+maths)/3.0;
        return avg;
    }
    
    public void AddMarks(int cs,int stats,int math){
        CS=cs;
        stat=stats;
        maths=math;
    }
    public char findGrade(){
        if (avg >=75 && avg<=100){
            grade= 'A';
	    return grade;
        }
        else if (avg>=65){
            grade= 'B';
	    return grade;
        }
        else if (avg>=55){
            grade= 'C';
	    return grade;
        }
        else if (avg>=45){
            grade= 'D';
	    return grade;
        }
        else{
            grade= 'F';
	    return grade;
        }
    }
    
    public void displayInformation(){
	System.out.println("Name : "+Reg_No+"\nName :"+name+"\nGender :"+gender+"\nDOB"+DOB);
	System.out.println("Marks :"+"\nCS : "+CS+"\tStatics : "+stat+"\tMaths : "+maths);
	System.out.println("Average : "+avg+"\nGrade :"+grade);
} 
    public static void main(String[] args){
        Student s1=new Student("2016cs023","A.H.V Darshana","Male","1996 June 18");
        s1.AddMarks(75,70,55);
       	s1.calculateStudentAverage();
	s1.findGrade();
	s1.displayInformation();
        
    }
    }
