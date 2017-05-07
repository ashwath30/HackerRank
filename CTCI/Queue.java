public class Solution {
    public static class MyQueue<T> {
        Stack<T> stack1 = new Stack<T>();
        Stack<T> stack2 = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stack1.push(value);
        }

        public T peek() {
            push_to_stack2();
             return stack2.peek();
        }

        public T dequeue() {
            push_to_stack2();
            return stack2.pop();
        }
        void push_to_stack2()
        {
            if(stack2.empty()){
                    while(!stack1.empty()){
                        stack2.push(stack1.pop());
					}
			}
    }
        
    }
}