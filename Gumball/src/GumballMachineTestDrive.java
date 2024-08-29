
public class GumballMachineTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine gumballMachine = new GumballMachine(5);
		
		gumballMachine.ejectQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);

	}

}
//You haven't inserted a quarter
//You inserted a quarter
//You can't insert another quarter
//You turned...
//A gumball comes rolling out the slot...
//You turned, but there's no quarter
//You need to pay first
