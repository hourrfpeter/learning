public class ts6 {
    class Employee{
        String name;
        int Employeemonth;
        double allSalary;
        public double getSalary(int month){
            if (month==Employeemonth) {
                allSalary = allSalary + 100;
                return allSalary;}
            else{
                return 0;
            }
        }
        class SalariedEmployee extends Employee{
            double salary;
            public void setSalary(double salary) {
                salary = 5000;
                this.salary = salary;
            }
            @Override
            public double getSalary(int month) {
                return super.getSalary(month);
            }
        }
        class HourlyEmployee extends Employee{
            double hourlySalary;
            int hours;
            public void setHourlySalary(double hourlySalary) {
                if (hours<=160){
                    allSalary = hourlySalary*hours;
                } else if (hours>160) {
                    allSalary = hourlySalary*160+(hours-160)*1.5*hourlySalary;
                }
                this.hourlySalary = allSalary;
            }
        }
        class SalesEmployee extends Employee{
            double sales;
            double rate;
            class BasePlusSalesEmployee extends SalesEmployee{
                double baseSalary;
                public double getBaseSalary() {
                    baseSalary = 5000;
                    return baseSalary;
                }
            }
        }
    }
}
