package X;

/* renamed from: X.9ki  reason: invalid class name and case insensitive filesystem */
public abstract class C201919ki {
    public static final AZH A00 = new AZH();
    public static final AZI A01 = new AZI();
    public static final AZE A02 = new AZE();
    public static final AZF A03 = new AZF();
    public static final AZG A04 = new AZG();

    public static boolean A00(char c) {
        return c == '{' || c == '[' || c == ',' || c == '}' || c == ']' || c == ':' || c == '\'' || c == '\"';
    }

    public static boolean A01(char c) {
        if (c < 0) {
            return false;
        }
        if (c <= 31) {
            return true;
        }
        if (c < 127) {
            return false;
        }
        if (c > 159) {
            return c >= 8192 && c <= 8447;
        }
        return true;
    }

    public static boolean A02(String str) {
        String str2;
        if (str.length() >= 3) {
            char charAt = str.charAt(0);
            if (charAt == 'n') {
                str2 = "null";
            } else if (charAt == 't') {
                str2 = "true";
            } else if (charAt == 'f') {
                str2 = "false";
            } else if (charAt == 'N') {
                str2 = "NaN";
            }
            return str.equals(str2);
        }
        return false;
    }
}
