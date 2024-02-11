public class ExampleStringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // append(String str): Appends the specified string to the current string
        stringBuffer.append(" World");
        System.out.println("StringBuffer after append: " + stringBuffer.toString());

        // insert(int offset, String str): Inserts the specified string at the specified position
        stringBuffer.insert(5, " beautiful");
        System.out.println("StringBuffer after insert: " + stringBuffer.toString());

        // delete(int start, int end): Removes the characters in the specified range
        stringBuffer.delete(5, 14);
        System.out.println("StringBuffer after delete: " + stringBuffer.toString());

        // reverse(): Reverses the characters in the StringBuffer
        stringBuffer.reverse();
        System.out.println("StringBuffer after reverse: " + stringBuffer.toString());

        // length(): Returns the length (number of characters) of the StringBuffer
        int length = stringBuffer.length();
        System.out.println("Length of the StringBuffer: " + length);

        // setCharAt(int index, char ch): Sets the character at the specified index to the specified value
        stringBuffer.setCharAt(0, 'h');
        System.out.println("StringBuffer after setCharAt: " + stringBuffer.toString());

        // substring(int start): Returns a new string that is a substring of the StringBuffer from the specified start index to the end
        String substring = stringBuffer.substring(6);
        System.out.println("Substring of the StringBuffer: " + substring);

        // toString(): Returns the string representation of the StringBuffer
        String stringRepresentation = stringBuffer.toString();
        System.out.println("String representation of the StringBuffer: " + stringRepresentation);
    }
}
