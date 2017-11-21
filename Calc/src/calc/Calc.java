package calc;

public class Calc {

        private int firstDigit;
	private int secondDigit;
	private int result;
	
	public Calc(int firstDigit,int secondDigit)
	{
		this.firstDigit=firstDigit;
		this.secondDigit=secondDigit;
	}
	public void add()
	{
		this.result=this.firstDigit+this.secondDigit;
	}
        public void multiply()
	{
		this.result=this.firstDigit*this.secondDigit;
	}
        public void share()
        {
 		this.result=this.firstDigit/this.secondDigit;
 	}
	public int getResult()
	{
		return this.result;
	}
	public void setFirstDigit(int firstDigit) {
		this.firstDigit = firstDigit;
	}
	public void setSecondDigit(int secondDigit) {
		this.secondDigit = secondDigit;
	}
}
    

