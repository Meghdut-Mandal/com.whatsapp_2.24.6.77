package X;

/* renamed from: X.ArH  reason: case insensitive filesystem */
public class C22589ArH extends C22655AsL {
    public C22589ArH(String str) {
        super(str);
    }

    public C22589ArH(byte[] bArr) {
        super(bArr);
    }

    public static byte[] A01(C22589ArH arH) {
        byte[] bArr;
        byte[] bArr2;
        byte[] A03;
        int i;
        byte[] bArr3 = arH.A00;
        int length = bArr3.length;
        int i2 = length - 1;
        if (bArr3[i2] != 90) {
            return bArr3;
        }
        if (!arH.A0K()) {
            bArr = new byte[(length + 4)];
            System.arraycopy(bArr3, 0, bArr, 0, i2);
            A03 = AnonymousClass11q.A03("0000Z");
            i = 5;
        } else if (!arH.A0L()) {
            bArr = new byte[(length + 2)];
            System.arraycopy(bArr3, 0, bArr, 0, i2);
            A03 = AnonymousClass11q.A03("00Z");
            i = 3;
        } else {
            bArr = bArr3;
            if (arH.A0J()) {
                int i3 = length - 2;
                while (i3 > 0 && bArr3[i3] == 48) {
                    i3--;
                }
                if (bArr3[i3] == 46) {
                    bArr2 = new byte[(i3 + 1)];
                } else {
                    bArr2 = new byte[(i3 + 2)];
                    i3++;
                }
                System.arraycopy(bArr3, 0, bArr2, 0, i3);
                bArr2[i3] = 90;
                return bArr2;
            }
            return bArr;
        }
        System.arraycopy(A03, 0, bArr, i2, i);
        return bArr;
    }

    public AnonymousClass121 A0B() {
        return this;
    }
}
