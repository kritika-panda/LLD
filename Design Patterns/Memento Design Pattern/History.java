// Caretaker class
class History {
    private final List<TextMemento> savedStates = new ArrayList<>();

    public void save(TextMemento memento) {
        savedStates.add(memento);
    }

    public TextMemento get(int index) {
        return savedStates.get(index);
    }
}

