public class SubTask extends Task {
    private Epic epic;
    public SubTask(String name, String description) {
        super(name, description);
    }

    public Epic getEpic() {
        return epic;
    }

    public void setEpic() {
        this.epic = epic;
    }
}
