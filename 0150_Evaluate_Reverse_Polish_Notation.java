class Solution {
    public int evalRPN(String[] tokens) {
        Stack < String > stack = new Stack < > ();
        int ans = 0;
        String op = "+-*/";
        for (String s: tokens) {
            if (op.indexOf(s) == -1) {
                stack.push(s);
            } else {
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                switch (s) {
                    case "+":
                        ans = num1 + num2;
                        break;
                    case "-":
                        ans = num1 - num2;
                        break;
                    case "*":
                        ans = num1 * num2;
                        break;
                    case "/":
                        ans = num1 / num2;
                        break;
                }
            stack.push(String.valueOf(ans));
            }
        }

        return Integer.parseInt(stack.peek());
    }
}