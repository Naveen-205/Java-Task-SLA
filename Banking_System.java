package task;

class InsufficientBalanceException extends Exception 
{
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}

public class Banking_System {

	public static void main(String[] args) {
		
		int withdraw = 10000;
		int avl_balance = 7000;
		
		try {
			if(withdraw > avl_balance) 
			{
				throw new InsufficientBalanceException("Insufficient Balance");
			}
			else
			{
				System.out.println("Transaction Successfull");
			}
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
