public class Stack {
    public static void main(String[] args) {
        java.util.Stack<String> stack = new java.util.Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Borderlands");
        stack.push("FFVII");
        stack.push("Doom");

//        String myFavGame = stack.pop();

        System.out.println(stack.peek());
        System.out.println("Games: "+stack);

        System.out.println(stack.search("Skyrim"));

        // Why stacks?
        // 1. undo/redo
        // 2. back/forward browser history
        // 3. backtracking algorithms (maze, file system)
        // 4. function calls (call stack)
    }
}