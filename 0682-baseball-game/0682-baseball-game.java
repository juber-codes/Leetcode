class Solution {

    

    public int calPoints(String[] operations) {


        Deque<Integer> stack = new ArrayDeque<>();

        for( String op :operations ){

            if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("D")){
                stack.push(stack.peek() * 2);
            }
            else if(op.equals("+")){
                int first = stack.pop();
                int second = stack.pop();
                int sum = first + second;

                stack.push(second);
                stack.push(first);
                stack.push(sum);
            }
            else{
              //  stack.push(Integer.parseInt(op));
              stack.push(Integer.parseInt(op));
            }
        }

        

    int ans =0;

    while(!stack.isEmpty()){
        ans = ans + stack.pop();
    }


     return ans;   
    }
}