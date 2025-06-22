public class operator{

    int num1, num2;

    operator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public String add(){
        return "The result is: " + (this.num1 + this.num2);
    }
    public String minus(){
        return "The result is: " + (this.num1 - this.num2);
    }
    public String multiply(){
        return "The result is: " + (this.num1 * this.num2);
    }    
    public String divide(){
        return "The result is: " + (this.num1 / this.num2);
    }
}