package nobles.christopher;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * Created by christophernobles on 10/25/16.
 */
public class TimeCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Employee employee;
    private Integer hours;
    private Integer payAmount;
    private Integer deductions;
    private Integer yearToDate;

    public TimeCard(Employee employee){

    }


    public TimeCard(){}

    public Integer getHours(){
        return hours;
    }

    public void setHours(Integer hours){
        this.hours = hours;
    }

    public Integer getPayAmount(){
        return payAmount;
    }

    public void setPayAmount(Integer amount){
        this.payAmount = amount;
    }

    public Integer getDeductions(){
        return deductions;
    }

    public void setDeductions(Integer deductions){
        this.deductions = deductions;
    }

    public Integer getYearToDate(){
        return yearToDate;
    }

    public void setYearToDate(Integer YTD){
        this.yearToDate = YTD;
    }



}
