package java_fundamentals;

public class Java_fundamentals_Mini_Project {
	 public static void main(String[] args) {
	        int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
	        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
	        String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
	        char[] desigCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
	        String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
	        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
	        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
	        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

	        // Designation details
	        char[] dCodes = {'e', 'c', 'k', 'r', 'm'};
	        String[] designations = {"Engineer", "Consultant", "Clerk", "Receptionist", "Manager"};
	        int[] da = {20000, 32000, 12000, 15000, 40000};

	        if (args.length == 0) {
	            System.out.println("Please enter employee ID as a command-line argument.");
	            return;
	        }

	        int id = Integer.parseInt(args[0]);
	        boolean found = false;

	        for (int i = 0; i < empNo.length; i++) {
	            if (empNo[i] == id) {
	                found = true;
	                int index = -1;
	                for (int j = 0; j < dCodes.length; j++) {
	                    if (desigCode[i] == dCodes[j]) {
	                        index = j;
	                        break;
	                    }
	                }

	                if (index != -1) {
	                    int salary = basic[i] + hra[i] + da[index] - it[i];
	                    System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
	                    System.out.println(empNo[i] + "\t" + empName[i] + "\t" + department[i] + "\t\t" +
	                                       designations[index] + "\t" + salary);
	                } else {
	                    System.out.println("Invalid Designation Code for employee id: " + id);
	                }
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("There is no employee with empid : " + id);
	        }
	    }


}
