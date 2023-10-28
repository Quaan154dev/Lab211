/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;
import java.util.ArrayList;
/**
 *
 * @author quandba
 */

public class TypeOfNumber {
    private ArrayList<Double> odd;
    private ArrayList<Double> even;
    private ArrayList<Double> perfect;

    public TypeOfNumber() {
        super();
        this.odd = new ArrayList<Double>();
        this.even = new ArrayList<Double>();
        this.perfect = new ArrayList<Double>();
    }

    public void setOdd(Double odd) {
        this.odd.add(odd);
    }

    public void setEven(Double even) {
        this.even.add(even);
    }

    public void setPerfect(Double perfect) {
        this.perfect.add(perfect);
    }

    public ArrayList<Double> getEven() {
        return even;
    }

    public ArrayList<Double> getPerfect() {
        return perfect;
    }


    @Override
    public String toString() {
        return "Odd " + (this.odd.size() == 1 ? "number is: " : "numbers are: ") + (this.odd.isEmpty() ? "Empty" : this.odd) + "\n"
            +  "Even " + (this.even.size() == 1 ? "number is: " : "numbers are: ") + (this.even.isEmpty() ? "Empty" : this.even) + "\n"
            +  "Perfect Square " + (this.perfect.size() == 1 ? "number is: " : "numbers are: ") + (this.perfect.isEmpty() ? "Empty" : this.perfect);
    }
    
}   
