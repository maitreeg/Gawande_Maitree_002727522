
package com.aed.model;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author mg
 */
public class Employee {
    //https://www.javatpoint.com/java-regex
	//Use Exception classes and create a code which provides validations

    
    private String name;
    private int employeeID;
    private int age;
    private String gender; // can be enum// can be boolean
    private String startDate;
    private String level; // can be int on use cases
    private String teamInfo;
    private String positionTitle;
    private Contact_Info contactInfo;
    private ImageIcon photo;

	/*
	 * URL iconURL = new URL(""); // iconURL is null when not found ImageIcon icon =
	 * new ImageIcon(iconURL); Image i = icon.getImage();
	 */

    public Employee(int employeeID, String name, int age, String gender,
                String startDate, String level, String teamInfo, 
                String positionTitle, Contact_Info contactInfo,ImageIcon photo) {
        this.name = name;
        this.employeeID = employeeID;
        this.age = age;
        this.gender = gender;
        this.startDate = startDate;
        this.level = level;
        this.teamInfo = teamInfo;
        this.positionTitle = positionTitle;
        this.contactInfo = contactInfo;
        this.photo = photo;
    }


    /**
     *
     * @param args
     */

//	public Employee(int employeeID, String name, int age, 
//                String startDate, String level, String teamInfo, 
//                String positionTitle, Contact_Info contactInfo,ImageIcon photo ){
//		super();
//		this.employeeID = employeeID;
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//		this.startDate = startDate;
//		this.level = level;
//		this.teamInfo = teamInfo;
//		this.positionTitle = positionTitle;
//		this.contactInfo = contactInfo;
//                this.photo = photo;
//        }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getTeamInfo() {
        return teamInfo;
        }

        public void setTeamInfo(String teamInfo) {
            this.teamInfo = teamInfo;
        }

	public String getPositionTitle() {
		return positionTitle;
	}

	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}

	public Contact_Info getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(Contact_Info contactInfo) {
		this.contactInfo = contactInfo;
	}

	public ImageIcon getPhoto() {
		return photo;
	}

	public void setPhoto(ImageIcon photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
            return "Employee [name=" + name + ", employeeID=" + employeeID 
            + ", age=" + age + ", gender=" + gender + ", startDate=" 
            + startDate + ", level=" + level + ", teamInfo=" + teamInfo 
            + ", positionTitle=" + positionTitle + ", contactInfo=" 
            + contactInfo + ", photo=" + photo + "]";
	}
        
     
}
