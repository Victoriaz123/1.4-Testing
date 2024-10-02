public class CalculateDni {

    private static final char[] LETTERS_DNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
            'L', 'C', 'K', 'E'};

    public char calculateLetter(int dni) {
        if (dni < 0 || dni > 99999999) {
            throw new IllegalArgumentException("El número de DNI ha de ser entre 0 i 99999999.");
        }
        return LETTERS_DNI[dni % 23];
    }
}

