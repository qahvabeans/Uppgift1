/**
 * Author: Jonas Borgström
 *
 */
package deluppgift1;

public class Note {

    String heading;
    String text;
    String signed;

    int numberOfWords;
    int numberOfChars;
    int priceClass;

    public Note(String heading, String text, String signed) {
        this.heading = heading;
        this.text = text;
        this.signed = signed;
        numberOfChars = text.length() + heading.length() + signed.length();

    }

    public String getHeading() {
        return heading;
    }

    public String getText() {
        return text;
    }

    public String getSigned() {
        return signed;
    }

    public int getNumberOfWords() {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.split("\\s+");
        numberOfWords = words.length;
        return numberOfWords;
    }

    public int getNumberOfChars() {
        return numberOfChars;
    }

    public int getPriceClass() {
        if (numberOfChars >= 500) {
            priceClass = 3;
        } else if (numberOfChars < 500 && numberOfChars >= 250) {
            priceClass = 2;
        } else if (numberOfChars < 250) {
            priceClass = 1;
        }

        return priceClass;
    }
}
