package com.wmora.hackerrank.algorithms.implementation;

class Encryption {

    static String encrypt(String message) {
        message = trim(message);

        int rows = calculateRows(message);
        int columns = calculateColumns(message);

        while (rows * columns < message.length()) {
            ++rows;
        }

        StringBuilder stringBuilder = new StringBuilder();

        String[] encryptedMessage = new String[rows];

        int index = 0;
        int i = 0;

        while (index < message.length()) {
            int nextIndex = (index + columns) < message.length() ? (index + columns) : message.length();
            encryptedMessage[i] = message.substring(index, nextIndex);
            index = nextIndex;
            i++;
        }

        for (int j = 0; j < columns; j++) {
            for (int k = 0; k < rows; k++) {
                if (j >= encryptedMessage[k].length()) {
                    break;
                }
                stringBuilder.append(encryptedMessage[k].charAt(j));
            }
            if (j < columns - 1) {
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString();
    }

    private static int calculateRows(String message) {
        return (int) Math.floor(Math.sqrt(message.length()));
    }

    private static int calculateColumns(String message) {
        return (int) Math.ceil(Math.sqrt(message.length()));
    }

    private static String trim(String message) {
        return message.replaceAll(" ", "");
    }
}
