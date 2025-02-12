import java.util.*;

class TextState{
    String content;
    TextState prev, next;

    TextState(String content){
        this.content = content;
        this.prev = this.next = null;
    }
}

class TextEditor{
    TextState current;
    int maxHistorySize = 10;
    int historyCount = 0;

    void addState(String content){
        TextState newState = new TextState(content);
        
        if(current == null){
            current = newState;
        }
		else{
            newState.prev = current;
            current.next = newState;
            current = newState;
        }

        if(historyCount < maxHistorySize){
            historyCount++;
        }
		else{
            trimHistory();
        }
    }

    void trimHistory(){
        TextState temp = current;
        while(temp.prev != null){
            temp = temp.prev;
        }
        temp.next.prev = null;
    }

    void undo(){
        if(current != null && current.prev != null){
            current = current.prev;
        }
		else{
            System.out.println("Undo not possible!");
        }
    }

    void redo(){
        if(current != null && current.next != null){
            current = current.next;
        }
		else{
            System.out.println("Redo not possible!");
        }
    }

    void displayCurrentState(){
        if(current != null){
            System.out.println("Current State: " + current.content);
        }
		else{
            System.out.println("No text available.");
        }
    }
}

public class UndoRedo{
    public static void main(String[] args){
        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello, My name is");
        editor.addState("Hello, My name is Dhanraj.");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();
    }
}
