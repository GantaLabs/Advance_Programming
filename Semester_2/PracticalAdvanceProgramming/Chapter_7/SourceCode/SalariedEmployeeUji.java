package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_7.SourceCode;

class SalariedEmployeeUji extends Employee {

    private double weeklySalary;

    SalariedEmployeeUji(String name, String noKTP, int bulanLahir, double salary) {
        super(name, noKTP);
        setTanggalLahir(bulanLahir);
        weeklySalary = salary;
    }

    public double earnings() {
        return weeklySalary;
    }

}

class HourlyEmployeeUji extends Employee {

    private double wage;
    private double hours;

    HourlyEmployeeUji(String name, String noKTP, int bulanLahir, double wage, double hours) {
        super(name, noKTP);
        setTanggalLahir(bulanLahir);
        this.wage = wage;
        this.hours = hours;
    }

    public double earnings() {

        if(hours <= 40) {
            return wage * hours;
        }

        return 40 * wage + (hours-40) * wage * 1.5;
    }

}

class CommissionEmployeeUji extends Employee {

    private double grossSales;
    private double commissionRate;

    CommissionEmployeeUji(String name, String noKTP, int bulanLahir, double sales, double rate) {
        super(name, noKTP);
        setTanggalLahir(bulanLahir);
        grossSales = sales;
        commissionRate = rate;
    }

    public double earnings() {
        return grossSales * commissionRate;
    }

}


class BasePlusCommissionEmployeeUji extends CommissionEmployeeUji {

    private double baseSalary;

    BasePlusCommissionEmployeeUji(String name, String noKTP, int bulanLahir, double sales, double rate, double salary) {
        super(name, noKTP, bulanLahir, sales, rate);
        baseSalary = salary;
    }

    public double earnings() {
        return baseSalary + super.earnings();
    }

}

class MainUji {

    public static void main(String[] args) {

        int bulanIni = 4;

        Employee[] employees = {

            new SalariedEmployeeUji("Daniel","135",4,800000),

            new HourlyEmployeeUji("Karina","234",7,16750,40),

            new CommissionEmployeeUji("Keanu","145",4,10000,0.06),

            new BasePlusCommissionEmployeeUji("Bondan","234",9,5000,0.04,300000)

        };

        for(Employee e : employees) {

            double gaji = e.earnings();

            if(e.getTanggalLahir() == bulanIni) {
                gaji += 100000;
            }

            System.out.println(e.getName() + " gaji = " + gaji);

        }

    }

}
