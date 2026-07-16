package Employee_p;

public class Mp1 {
	public static void main(String[] args) {

		String[][] emp = {
                {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
                {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
                {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
                {"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
                {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
                {"1006", "Suman", "01/01/2000", "e", "Manufacturing", "23000", "9000", "4400"},
                {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
        };

        String id = args[0];

        for (int i = 0; i < emp.length; i++) {

            if (emp[i][0].equals(id)) {

                String designation = "";
                int da = 0;

                switch (emp[i][3].charAt(0)) {

                    case 'e':
                        designation = "Engineer";
                        da = 20000;
                        break;

                    case 'c':
                        designation = "Consultant";
                        da = 32000;
                        break;

                    case 'k':
                        designation = "Clerk";
                        da = 12000;
                        break;

                    case 'r':
                        designation = "Receptionist";
                        da = 15000;
                        break;

                    case 'm':
                        designation = "Manager";
                        da = 40000;
                        break;
                }

                int basic = Integer.parseInt(emp[i][5]);
                int hra = Integer.parseInt(emp[i][6]);
                int it = Integer.parseInt(emp[i][7]);

                int salary = basic + hra + da - it;

                System.out.printf("%-15s%-15s%-15s%-15s%-15s%n",
                        "Emp No", "Emp Name", "Department", "Designation", "Salary");

                System.out.printf("%-15s%-15s%-15s%-15s%-15d%n",
                        emp[i][0],
                        emp[i][1],
                        emp[i][4],
                        designation,
                        salary);

                return;
            }
        }

        System.out.println("There is no employee with empid : " + id);
	}
}
