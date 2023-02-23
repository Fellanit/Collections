package Homework_1;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public class InputNumbers extends InputStream {


    public Queue<Byte> bytes = new ArrayDeque<>();

    public InputNumbers(String sourceNumbers) {
        byte[] numbers = sourceNumbers.getBytes();
        for (byte number : numbers) {
            bytes.add(number);
        }
    }

    @Override
    public int read() throws IOException {
        String regex = "^([/(]\\d{3}[/)])+(\\s\\d{3}[-]\\d{4})|(\\d{3}[-]\\d{3}[-]\\d{4})";
        if (available() > 0) {
            if (bytes.contains(regex)) {
                return bytes.poll();
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    @Override
    public int available() throws IOException {
        return bytes.size();
    }
}
