package Lesson15.Ex1;

import java.util.Objects;

public class ComplexNumber {

    private  double re;
    private  double im;
    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public double getRe() {
        return re;
    }
    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return  true;
        }
        if (!(obj instanceof  ComplexNumber)){
            return false;
        }
        ComplexNumber complexNumber = (ComplexNumber) obj;
        return Objects.equals(re, complexNumber.re) &&
                        Objects.equals(im, complexNumber.im);

               // re == complexNumber.re  &&
               // im == complexNumber.im;
    }

    @Override
    public int hashCode() {
       int result = 10;
       Double value = new Double(re);
       Double value1 = new Double(im);

       int output = value.hashCode();
       int output1 = value1.hashCode();

       result =  10 * result + output;
       result =  10 * result + output1;

       return result;
       // return Objects.hashCode(Double.doubleToLongBits(re), Double.doubleToLongBits(im));
    }
}
