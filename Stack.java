public class MyStack
{
	static Card stack[];
	static int top;
	static int capacity;

	// Constructor to initialize stack
	MyStack(int size)
	{
		stack = new Card[size];
		capacity = size;
		top = -1;
    }
 
    public static void Push(Card c){
        if(top == capacity - 1){
            System.out.println("Stack is already full.");
            
        }
        stack[++top] = c;
    }

    public static Card Pop(){
        if(top == -1){
            System.out.println("Stack is already empty.");  
        }
        
        return stack[top--];
    }

    public static int Size(){
        return top;
    }
    public static Boolean isEmpty(){
        if(top == -1){
            System.out.println("Empty stack");
            return true;
        }
        return false;
    }
    public static Card Peek(){
        if(top == -1){
            System.out.println("Trying to peek from empty stack.");
              
        }
        
        return stack[top];
    }
    
    public boolean Full(){
        if(top == capacity){
            return true;
        }
        else{
            return false;
        }
     }
}