class NegativeNumberException extends Exception {
    private double value;

    NegativeNumberException(double _value) {
        value = _value;
    }

    public String toString() {
        String msg = "Exception: " + value + " is a negative number!!!";
        return msg;
    }
}