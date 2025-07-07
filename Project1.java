public class Project1 {
    public static void main(String[] args) {
        int[] empNo = {1001,1002,1003,1004,1005,1006,1007};
        String[] empName = {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
        String[] dept = {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
        char[] desigCode = {'e','c','k','r','m','e','c'};
        int[] basic = {20000,30000,10000,12000,50000,23000,29000};
        int[] hra = {8000,12000,8000,6000,20000,9000,12000};
        int[] it = {3000,9000,1000,2000,20000,4400,10000};

        char[] dCode = {'e','c','k','r','m'};
        String[] desig = {"Engineer","Consultant","Clerk","Receptionist","Manager"};
        int[] da = {20000,32000,12000,15000,40000};

        if (args.length == 0) {
            System.out.println("Please provide employee ID.");
            return;
        }

        int id = Integer.parseInt(args[0]);
        boolean found = false;

        for (int i = 0; i < empNo.length; i++) {
            if (empNo[i] == id) {
                found = true;
                int dIndex = -1;
                for (int j = 0; j < dCode.length; j++) {
                    if (desigCode[i] == dCode[j]) {
                        dIndex = j;
                        break;
                    }
                }
                int salary = basic[i] + hra[i] + da[dIndex] - it[i];

            
                System.out.printf("%-8s %-10s %-15s %-15s %-10s\n", "Emp No.", "Emp Name", "Department", "Designation", "Salary");
                System.out.printf("%-8d %-10s %-15s %-15s %-10d\n",
                        empNo[i], empName[i], dept[i], desig[dIndex], salary);
                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + id);
        }
    }
}
