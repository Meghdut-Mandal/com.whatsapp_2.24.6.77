package X;

import java.lang.reflect.Array;

/* renamed from: X.3DX  reason: invalid class name */
public final class AnonymousClass3DX {
    public final int A00;
    public final int A01;
    public final byte[][] A02;

    public String toString() {
        String str;
        int i = this.A01;
        int i2 = this.A00;
        StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = this.A02[i3];
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4];
                if (b == 0) {
                    str = " 0";
                } else if (b != 1) {
                    str = "  ";
                } else {
                    str = " 1";
                }
                sb.append(str);
            }
            sb.append(10);
        }
        return sb.toString();
    }

    public AnonymousClass3DX(int i, int i2) {
        int[] A1O = C36441kJ.A1O();
        A1O[1] = i;
        A1O[0] = i2;
        this.A02 = (byte[][]) Array.newInstance(byte.class, A1O);
        this.A01 = i;
        this.A00 = i2;
    }
}
