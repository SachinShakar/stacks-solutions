package stacks;

public class StackWithMin extends MyStack<DataWithMin> {
	
	public void push(DataWithMin item) {
		if(!super.isEmpty()) 
			item.min = Math.min(item.value, peek().min);
		
		super.push(item);
		
	}
	
	
	public static void main(String[] args){
		StackWithMin stackWithMin = new StackWithMin();
		
		DataWithMin item1 = new DataWithMin(10, 10);
		DataWithMin item2 = new DataWithMin(20);
		DataWithMin item3 = new DataWithMin(8);
		DataWithMin item4 = new DataWithMin(6);
		
		stackWithMin.push(item1);
		stackWithMin.push(item2);
		stackWithMin.push(item3);
		stackWithMin.push(item4);
		
		DataWithMin resultDataWithMin = stackWithMin.pop();
		System.out.println(resultDataWithMin.value + "   " + resultDataWithMin.min);
		
		
		resultDataWithMin = stackWithMin.pop();
		System.out.println(resultDataWithMin.value + "   " + resultDataWithMin.min);
		
		resultDataWithMin = stackWithMin.pop();
		System.out.println(resultDataWithMin.value + "   " + resultDataWithMin.min);
	}
}


class DataWithMin{
	int value;
	int min;
	
	public DataWithMin(int v, int m) {
		// TODO Auto-generated constructor stub
		value = v;
		min = m;
	}
	
	public DataWithMin(int v) {
		value = v;
	}
}
