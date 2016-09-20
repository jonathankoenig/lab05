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
    
    /**
     * Description: Sets the age of the person to what the user inputs. If the age is over 150 or less than 0, then an error is given.
     * Input: getAge int
     * Purpose: Lets the user set the age of the person.
     * Example: If 20 is inputed, then the person's age will be set to 20.
     */
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
    
    /**
     * Description: Sets the sex of a person. If the user inputs "M", the person's sex will be male. IF the user inputs "F", the person's sex will be female. If something else is inputted, an error will be given.
     * Input: getSex String
     * Purpose: Lets the user change the sex of the person.
     * Example: If the user inputs "M", then the person's sex will be male. If the user inputs "t", then an error is given and the person's sex will be unknown.
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
    
    /**
     * Description: Sets the height of the person in feet and inches.
     * Input: getFt int
     *        getIn int
     * Purpose: Lets the user input the height of the person in feet and inches.
     * Example: If getFt is 5 and getIn is 10, then the height of the person will be 5'10.
     */
    public void setHeight(int getFt, int getIn)
    {
        height = getFt + "'" + getIn;
    }
    
    /**
     * Description: Sets the weight of the person.
     * Input: getWeight int
     * Purpose: Lets the user input the weight of the person.
     * Example: If the user inputs 150, then the person's weight will be 150.
     */
    public void setWeight(int getWeight)
    {
        weight = getWeight;
    }
    
    /**
     * Description: Sets the SSN of the person. If any part of the SSN is an invalid number, an error is given.
     * Input: getssn1 int
     *        getssn2 int
     *        getssn3 int
     * Purpose: Lets the user set the SSN of the person.
     * Example: If the user inputs 20, then 10, then 2453, the SSN of the person will be 20-10-2453.
     */
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
    
    /**
     * Description: Sets the address of the person by asking for house number, street name, city name, and state name. If house number is negative or greater than 99,999, then an error will be given.
     * Input: getHouseNum int
     *        getStreet String
     *        getCity String
     *        getState String
     * Purpose: Lets the user input the address of the person.
     * Example: If the user inputs 1 for getHouseNum, Blue Lane for getStreet, Levittown for getCity, and NY for getState, then the person's address will be 1 Blue Lane, Levittown NY.
     */
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
    
    /**
     * Description: Sets the phone number of the person. If any part of the phone number is wrong, an error is given.
     * Input: getPhoneNum1 int
     *        getPhoneNum2 int
     *        getPhoneNum3 int
     * Purpose: Lets the user input the phone number of the person.
     * Example: If th user inputs 200 for getPhoneNum1, 230 for getPhoneNum2, and 1456 for getPhoneNum3, then the person's phone number will be 200-230-1456.
     */
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
    
    /**
     * Description: Sets the date of birth of the person. If the input for the day is invalid, then an error is given.
     * Input: getDay int
     *        getMonth String
     *        getYear String
     * Purpose: Lets the user set the date of birth of the person.
     * Example: If the user inputs 10 for getDay, July for getMonth, and 2006 for getYear, then the person's dateOfBirth will be set to July 10, 2006.
     */
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
    
    /**
     * Description: Prints out all the info of the person.
     * Purpose: Lets the user see all the info of the person.
     * Example: If the user sets values for all the field variables and uses the function, the function will print out all the info the user inputed for the person.
     */
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
