public enum MenuOptions {
    BYPASS("0"), NEWSTUDENT("1"), DELETESTUDENT("2"), STUDENTLIST("3"), EDITSTUDENT("4"), CLEARLIST("5"),PRINTSTUDENT("6"), SORTLIST("7"), SORTBYNAME("8");

    private String numVal;

    MenuOptions(String numVal) {
        this.numVal = numVal;
    }

    public String get() {
        return numVal;
    }
}