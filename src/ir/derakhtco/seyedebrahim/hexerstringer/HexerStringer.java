package ir.derakhtco.seyedebrahim.hexerstringer;

public class HexerStringer {
    private static HexerStringer hexStringConverter = null;

    private HexerStringer() {
    }

    public static HexerStringer getHexStringConverterInstance() {
        if (hexStringConverter == null) hexStringConverter = new HexerStringer();
        return hexStringConverter;
    }

    public String stringToHex(String input) {
        if (input == null) throw new NullPointerException();
        return asHex(input.getBytes());
    }

    public String hexToString(String hex) {
        String digital = "0123456789ABCDEF";
        char[] hex2char = hex.toCharArray();
        byte[] bytes = new byte[hex.length() / 2];
        int temp;
        for (int i = 0; i < bytes.length; i++) {
            temp = digital.indexOf(hex2char[2 * i]) * 16;
            temp += digital.indexOf(hex2char[2 * i + 1]);
            bytes[i] = (byte) (temp & 0xff);
        }
        return new String(bytes);
    }

    private String asHex(byte[] bs) {
        char[] digital = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder();
        int bit;
        for (byte b : bs) {
            bit = (b & 0x0f0) >> 4;
            sb.append(digital[bit]);
            bit = b & 0x0f;
            sb.append(digital[bit]);
        }
        return sb.toString();
    }

}