import java.util.StringTokenizer;

public class TwoDimArray {

	public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
	
	public static void main(String[] args) {
		myArray=fillArray("twodimension8.txt"); // args[0] represents the file name
		printArray(myArray);
		printArrayEven(myArray);
	}
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}
	private static void display (int num){
		if(num<10)// single digit number, then put one more space
		System.out.print(num+" ");
		else //two digits number
			System.out.print(num+" "); //for the two digits number, only put one space
	}
	private static void printArrayEven(int[][] theArray){
		for (int i=0; i<theArray.length; i++) { //row: theArray, length
			for (int j=0; j<theArray[i].length;j++) { //col:theArray[i].length
				if(theArray[i][j]%2==0) //even
				display(theArray[i][j]);
			    else //odd
			    	System.out.print("*  "); // it should have two white space
			}
			System.out.println();
		}
	}
	
	public static int[][] fillArray(String myFile){
		TextFileInput tfi = new TextFileInput(myFile);
		String line=tfi.readLine(); //read the first line
		StringTokenizer myTokens = new StringTokenizer(line, ",");
		int row=Integer.parseInt(myTokens.nextToken()); //"4"
		int col=Integer.parseInt(myTokens.nextToken()); //"6"
		
		
		int[][] arr= new int[row][col]; // create a 2D array
		
		
		for(int i=0; i<row; i++) { //row
			line=tfi.readLine(); //read new line 
			myTokens = new StringTokenizer(line,","); //update the tokenizer object
			
			for(int j=0; j<col; j++) { //col
				
				arr[i][j]=Integer.parseInt(myTokens.nextToken());
			}
		}
		return arr;
	}
	
	
}
