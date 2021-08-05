package day39_CustomClass_Statics.salaryCalculatorTask;

import java.text.DecimalFormat;

public class SalaryCalculator {
public double hourlyrate;
public double stateTaxRate;
public double federalTaxRate;
public double weeklyHours;

    public void setInfo(double hourlyrate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyrate = hourlyrate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }
    public double salary(){
        return hourlyrate*weeklyHours*52;
    }
    public double stateTax(){
        return salary() * stateTaxRate;
    }

    public double federalTax(){
        return salary() * federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary() - stateTax() - federalTax();
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        return "SalaryCalculator{" +
                "hourlyrate=" + hourlyrate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }
}
/*
SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours
        Actions:
            setInfo(): sets all the fields of SalaryCalculator
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
            stateTax(): calculates the totalstateTax
            federalTax(): calculates the total federal tax
            salaryAfterTax(): calculates the salary after tax
            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */