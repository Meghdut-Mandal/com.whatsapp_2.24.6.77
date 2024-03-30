package X;

/* renamed from: X.1CI  reason: invalid class name */
public abstract class AnonymousClass1CI {
    public static final byte[][] A00;

    static {
        byte[][] bArr = new byte[3][];
        A00 = bArr;
        bArr[0] = new byte[]{87, 65, 77, 3};
        bArr[1] = new byte[]{87, 65, 77, 4};
        bArr[2] = new byte[]{87, 65, 77, 5};
    }

    public static byte[] A00(int i) {
        if (i >= 0) {
            return A00[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid version: ");
        sb.append(i);
        throw new RuntimeException(sb.toString());
    }
}
