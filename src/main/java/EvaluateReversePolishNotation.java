import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> operand = new Stack<>();
        Stack<String> operator = new Stack<>();
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int right = operand.pop();
                int left = operand.pop();
                int res = 0;
                switch (token){
                    case "+":
                        res = left + right;
                        break;
                    case "-":
                        res = left - right;
                        break;
                    case "*":
                        res = left * right;
                        break;
                    case "/":
                        res = left / right;
                        break;
                }
                operand.push(res);
            }
            else
                operand.push(Integer.parseInt(token));
        }

        return operand.peek();
    }

}
