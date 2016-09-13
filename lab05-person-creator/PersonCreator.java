
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{
    // Your class begins here!
    private String name;
    private int age;
    private String sex;
    private String height;
    private int weight;
    private String ssn;
    private String address;
    private String phoneNum;
    private String dateOfBirth;
    
    public PersonCreator(String firstName, String lastName)
    {
        name = firstName + " " + lastName;
    }
    
    public void setAge(int getAge)
    {
        age = getAge;
        
        if(age > 150)
        {
            System.out.println("Invalid Age!");
            age = 0;
        }
    }
    
    /**
     * Put M for Male or F for Female
     */
    public void setSex(String getSex)
    {
        if(getSex == "M")
        {
            sex = "Male";
        }
        
        if(getSex == "F")
        {
            sex = "Female";
        }
        
        if(getSex != "M" || getSex != "F")
        {
            System.out.println("Incorrect input! Input needs to be M or F.");
            sex = "null";
        }
    }
    
    public void setHeight(int getFt, int getIn)
    {
        height = getFt + "'" + getIn;
    }
    
    public void setWeight(int getWeight)
    {
        weight = getWeight;
    }
    
    public void setSSN(int getssn1, int getssn2, int getssn3)
    {
        
        ssn = getssn1 + "-" + getssn2 + "-" + getssn3;
        
        if(getssn1 < 0 || getssn1 > 999)
        {
            System.out.println("Invalid input! First input must be between 0 and 999."); 
            ssn = "null";
        }
        
        if(getssn2 < 0 || getssn2 > 99)
        {
            System.out.println("Invalid input! Second input must be between 0 and 99."); 
            ssn = "null";
        }
        
        if(getssn3 < 0 || getssn3 > 9999)
        {
            System.out.println("Invalid input! Third input must be between 0 and 9999."); 
            ssn = "null";
        }
        
    }
    
    public void setAddress(int getHouseNum, String getStreet, String getCity, String getState)
    {
        
        address = getHouseNum + " " + getStreet + ", " + getCity + " " + getState;
        
        if(getHouseNum < 0 && getHouseNum > 99999)
        {
            System.out.println("Invalid input! House number must be between 0 and 99999."); 
            address = "null";
        }
        
    }
    
    public void getPhoneNum(int getPhoneNum1, int getPhoneNum2, int getPhoneNum3)
    {
        
        phoneNum = getPhoneNum1 + "-" + getPhoneNum2 + "-" + getPhoneNum3;
        
        if(getPhoneNum1 < 0 && getPhoneNum1 > 999)
        {
            System.out.println("Invalid input! First number must be between 0 and 999.");
            phoneNum = "null";
        }
        
        if(getPhoneNum2 < 0 && getPhoneNum2 > 999)
        {
            System.out.println("Invalid input! Second number must be between 0 and 999.");
            phoneNum = "null";
        }
        
        if(getPhoneNum3 < 0 && getPhoneNum3 > 9999)
        {
            System.out.println("Invalid input! Third number must be between 0 and 9999.");
            phoneNum = "null";
        }
    }
    
    public void getDateOfBirth(int getDay, String getMonth, int getYear)
    {
       
        dateOfBirth = getMonth + " " + getDay + ", " + getYear;
        
        if(getYear < 1850 || getYear > 2016)
        {
            System.out.println("Invalid year!");
;
        }
        
        if(getDay < 0 || getYear > 31)
        {
            System.out.println("Invalid day!");
            dateOfBirth = "null";
        }
    }
    
    public void printInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight + "lb");
        System.out.println("SSN: " + ssn);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNum);
        System.out.println("Date Of Birth: " + dateOfBirth);
        System.out.println();
    }
}
