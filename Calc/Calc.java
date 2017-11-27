package calc;

public class Calc {

        private int firstDigit;
	private int secondDigit;
	
	
	public Calc(int firstDigit,int secondDigit)
	{
		this.firstDigit=firstDigit;
		this.secondDigit=secondDigit;
	}

        public Calc() {}
        
	public int add(int firstDigit,int secondDigit)
	{
		return firstDigit+secondDigit;
	}
        public int multiply(int firstDigit,int secondDigit)
	{
		return firstDigit*secondDigit;
	}
        public int share(int firstDigit,int secondDigit)
        {
 		return firstDigit/secondDigit;
 	}
	
	public void setFirstDigit(int firstDigit) {
		this.firstDigit = firstDigit;
	}
	public void setSecondDigit(int secondDigit) {
		this.secondDigit = secondDigit;
	}

        public int getFirstDigit() {
            return firstDigit;
        }

        public int getSecondDigit() {
            return secondDigit;
        }
        
   
        public boolean czyRowne(int firstDigit,int secondDigit)
        {
            return this.firstDigit==this.secondDigit;
        }
        
        
}
    

