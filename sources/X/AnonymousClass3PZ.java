package X;

/* renamed from: X.3PZ  reason: invalid class name */
public class AnonymousClass3PZ {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public static String A00(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            int length = str.length();
            if (i >= length) {
                return stringBuffer.toString();
            }
            char charAt = str.charAt(i);
            if (charAt != '\\' || i >= length - 3) {
                stringBuffer.append(charAt);
            } else if (str.charAt(i + 1) == 'r' && str.charAt(i + 2) == '\\') {
                int i2 = i + 3;
                if (str.charAt(i2) == 'n') {
                    stringBuffer.append(10);
                    i = i2;
                }
            }
            i++;
        }
    }

    public String A01() {
        StringBuilder A0u = AnonymousClass000.A0u();
        String str = this.A03;
        if (str != null) {
            A0u.append(str);
        }
        A0u.append(";");
        String str2 = this.A00;
        if (str2 != null) {
            A0u.append(str2);
        }
        A0u.append(";");
        String str3 = this.A02;
        if (str3 != null) {
            A0u.append(str3);
        }
        A0u.append(";");
        String str4 = this.A04;
        if (str4 != null) {
            A0u.append(str4);
        }
        A0u.append(";");
        String str5 = this.A01;
        if (str5 != null) {
            A0u.append(str5);
        }
        return A0u.toString();
    }

    public String toString() {
        String A002;
        StringBuilder A0u = AnonymousClass000.A0u();
        String str = this.A03;
        if (str == null) {
            A002 = null;
        } else {
            A002 = A00(str);
        }
        A0u.append(A002);
        A0u.append(" ");
        A0u.append(this.A00);
        A0u.append(" ");
        A0u.append(this.A02);
        A0u.append(" ");
        A0u.append(this.A04);
        A0u.append(" ");
        return AnonymousClass000.A0q(this.A01, A0u);
    }
}
