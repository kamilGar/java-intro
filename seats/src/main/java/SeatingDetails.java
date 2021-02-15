class Details {
    private boolean isEmpty;
    private int nr;
    private int rowNr;

    public Details(boolean isEmpty, int nr, int rowNr) {
        this.isEmpty = isEmpty;
        this.nr = nr;
        this.rowNr = rowNr;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
