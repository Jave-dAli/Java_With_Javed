package MiscDSA.TextEditor;

import java.util.Stack;

public class TextEditor {
    private Stack<String> userActions;

    public TextEditor() {
        userActions = new Stack<>();
    }

    // Task 2: Implement a function to push a new user action onto the stack.
    public void pushUserAction(String action) {
        userActions.push(action);
    }

    // Task 3: Write a function to pop the last user action from the stack (undo operation).
    public void undo() {
        if (!userActions.isEmpty()) {
            String undoneAction = userActions.pop();
            System.out.println("Undo: " + undoneAction);
        } else {
            System.out.println("Nothing to undo. Stack is empty.");
        }
    }

    // Task 4: Develop a function to display the entire history of user actions.
    public void displayHistory() {
        System.out.println("User Action History:");
        for (String action : userActions) {
            System.out.println(action);
        }
    }

    // Task 5: Implement a function to clear the entire history stack.
    public void clearHistory() {
        userActions.clear();
        System.out.println("User action history cleared.");
    }

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        // Task 1: Create a stack to store user actions.

        // Task 2: Push new user actions onto the stack.
        textEditor.pushUserAction("Type: Hello");
        textEditor.pushUserAction("Delete: World");
        textEditor.pushUserAction("Insert: OpenAI");

        // Task 4: Display the entire history of user actions.
        textEditor.displayHistory();

        // Task 3: Perform an undo operation.
        textEditor.undo();

        // Task 4: Display the history again.
        textEditor.displayHistory();

        // Task 5: Clear the entire history stack.
        textEditor.clearHistory();

        // Task 4: Display the history after clearing.
        textEditor.displayHistory();
    }
}
