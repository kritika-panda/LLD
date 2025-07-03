// Client
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hello ");
        history.save(editor.save());

        editor.write("World!");
        history.save(editor.save());

        System.out.println("Current Content: " + editor.getContent());

        editor.restore(history.get(0));
        System.out.println("After Undo: " + editor.getContent());
    }
}

