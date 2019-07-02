public class MovementPattern {
    private String Pattern;

    public MovementPattern(String pattern) {
        Pattern = pattern;
    }

    public String getPattern() {
        return Pattern;
    }
    public int getSize(){
        return Pattern.length();
    }
    public char getPattern(int n) {
        return Pattern.charAt(n);
    }
    public void setPattern(String pattern) {
        Pattern = pattern;
    }

    @Override
    public String toString() {
        return Pattern;
    }
}
