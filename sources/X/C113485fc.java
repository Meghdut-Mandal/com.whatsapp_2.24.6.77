package X;

/* renamed from: X.5fc  reason: invalid class name and case insensitive filesystem */
public abstract class C113485fc {
    public static final String A00;
    public static final String A01;

    static {
        int i = 0;
        String str = "";
        int length = "H".length();
        if (length != 0) {
            if (length != 1) {
                StringBuilder A0h = C90524aI.A0h(length * 10);
                C13590k7 A002 = new C15020mZ(1, 10).iterator();
                while (A002.hasNext()) {
                    A002.A00();
                    A0h.append("H");
                }
                str = A0h.toString();
                AnonymousClass00C.A0B(str);
            } else {
                char charAt = "H".charAt(0);
                char[] cArr = new char[10];
                do {
                    cArr[i] = charAt;
                    i++;
                } while (i < 10);
                str = new String(cArr);
            }
        }
        A00 = str;
        A01 = C90464aC.A0f(str, AnonymousClass000.A0v(str), 10);
    }
}
