public static boolean isBalanced(String expression) {
        
        Map<Character, Character> map = new HashMap<>(3);
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        
        
        
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            Character c = expression.charAt(i);
            if (map.containsValue(c)) {
                stack.push(c); //push all opens to stack
                continue;
            }
            try {
                if (stack.pop()!=map.get(c)) { //if stacktop != corresponding closing bracket
                    return false;
                }
            } catch (EmptyStackException e) {
                return false;
            }

        }
        return stack.empty();
    }