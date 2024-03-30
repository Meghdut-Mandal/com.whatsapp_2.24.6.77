package X;

/* renamed from: X.9ag  reason: invalid class name and case insensitive filesystem */
public abstract class C196879ag {
    public static final char[] A00 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String A00(byte[] bArr) {
        StringBuffer A0x = C165607th.A0x();
        for (byte b : bArr) {
            A0x.append("(byte)0x");
            char[] cArr = A00;
            A0x.append(cArr[(b >> 4) & 15]);
            A0x.append(cArr[b & 15]);
            A0x.append(", ");
        }
        return A0x.toString();
    }
}
