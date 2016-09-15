/**
 * This class creates a person object with the details name, age, sex, height, weight, ssn, address, phone number, and date of birth"
 */
public class PersonCreator
{
    // ******************************
    // Field Variables
    // These set the variables for the details of the person
    private String name;
    private int age;
    private String sex;
    private String height;
    private int weight;
    private String ssn;
    private String address;
    private String phoneNum;
    private String dateOfBirth;
    
    // *****************************
    // Constructor
    // Creates a person and acts the user to input a first and last name
    // Also sets all the other details of the person to either 0 or Unknown
    public PersonCreator(String firstName, String lastName)
    {
        name = firstName + " " + lastName;
        age = 0;
        sex = "Unknown";
        height = "Unknown";
        weight = 0;
        ssn = "Unknown";
        address = "Unknown";
        phoneNum = "Unknown";
        dateOfBirth = "Unknown";
    }
    
    // *****************************
    // Methods
    // These let the user input the various details for the perzon.
    // There is also a method that lets the user see what these details are.
    
    // Sets the age of the person
    public void setAge(int getAge)
    {
        age = getAge;
        
        // If the age inputed is less than 0 or greater than 150, an error is given and the age is changed to 0.
        if(age > 150 || age < 0)
        {
            System.err.println("Invalid Age!");
            age = 0;
        }
    }
    
    // Sets the sex of a person
    /**
     * Put "M" for Male or "F" for Female
     */
    public void setSex(String getSex)
    {
        // If "M" is inputed, sex is set to Male
        if(getSex == "M")
        {
            sex = "Male";
        }
        
        // If "F" is inputed, sex is set to Female
        else if(getSex == "F")
        {
            sex = "Female";
        }
        
        // If neither "M" or "F" is inputed, then an error is given and sex is changed to null
        else
        {
            System.err.println("Incorrect input! Input needs to be M or F.");
        }
    }
    
    // Sets the height of the person in feet and inches
    public void setHeight(int getFt, int getIn)
    {
        height = getFt + "'" + getIn;
    }
    
    // Sets the weight of the person
    public void setWeight(int getWeight)
    {
        weight = getWeight;
    }
    
    // Sets the SSN of the person
    public void setSSN(int getssn1, int getssn2, int getssn3)
    {
        // If the first part of the ssn is less than 0 or greater than 999, an error is given
        if(getssn1 < 0 || getssn1 > 999)
        {
            System.err.println("Invalid input! First input must be between 0 and 999."); 
        }
        
        // If the second part of the ssn is less than 0 or greater than 99, an error is given
        else if(getssn2 < 0 || getssn2 > 99)
        {
            System.err.println("Invalid input! Second input must be between 0 and 99."); 
        }
        
        // If the third part of the ssn is less than 0 or greater than 9999, an error is given
        else if(getssn3 < 0 || getssn3 > 9999)
        {
            System.err.println("Invalid input! Third input must be between 0 and 9999."); 
        }
        
        // If every part of the SSN is valid, then the ssn is saved to the person
        else
        {
            ssn = getssn1 + "-" + getssn2 + "-" + getssn3;
        }
    }
    
    
    // Sets the address of the person by asking for house number, street name, city name, and state name
    public void setAddress(int getHouseNum, String getStreet, String getCity, String getState)
    {
        
        address = getHouseNum + " " + getStreet + ", " + getCity + " " + getState;
        
        // If the house number is less than 0 or greater than 99999, then an error is given and the address is chagned to Unknown
        if(getHouseNum < 0 && getHouseNum > 99999)
        {
            System.err.println("Invalid input! House number must be between 0 and 99999."); 
            address = "Unknown";
        }
        
    }
    
    // Sets the phone number of the person
    public void getPhoneNum(int getPhoneNum1, int getPhoneNum2, int getPhoneNum3)
    {
        // If the first part of the number is less than 100 or greater than 999, then an error is given
        if(getPhoneNum1 < 100 && getPhoneNum1 > 999)
        {
            System.err.println("Invalid input! First number must be between 0 and 999.");
        }
        // If the second part of the number is less than 100 or greater than 999, then an error is given
        else if(getPhoneNum2 < 100 && getPhoneNum2 > 999)
        {
            System.err.println("Invalid input! Second number must be between 0 and 999.");
        }
        // If the third part of the number is less than 100 or greater than 999, then an error is given
        else if(getPhoneNum3 < 1000 && getPhoneNum3 > 9999)
        {
            System.err.println("Invalid input! Third number must be between 0 and 9999.");
        }
        // If every part of the number is valid, then the phone number is saved to the person
        else
        {
            phoneNum = getPhoneNum1 + "-" + getPhoneNum2 + "-" + getPhoneNum3;
        }
    }
    
    // Sets the date of birth of the person
    public void getDateOfBirth(int getDay, String getMonth, int getYear)
    {
       
        dateOfBirth = getMonth + " " + getDay + ", " + getYear;
        
        // If the day is less than 0 or greater than 31, then an error is given
        if(getDay < 0 || getDay > 31)
        {
            System.out.println("Invalid day!");
            dateOfBirth = "Unknown";
        }
    }
    
    // Prints out all the info of the person
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
