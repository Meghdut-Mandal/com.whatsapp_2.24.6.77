package X;

/* renamed from: X.9kn  reason: invalid class name and case insensitive filesystem */
public class C201969kn {
    public static final C201969kn A01 = new C201969kn(33023);
    public int A00;

    public C201969kn() {
        this(0);
    }

    public C201969kn(int i) {
        this.A00 = i;
    }

    public C201969kn(C22683Asn asn) {
        byte[] bArr = asn.A01;
        int min = Math.min(4, bArr.length - 1);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i |= (255 & bArr[i2]) << (i2 * 8);
        }
        if (min >= 0 && min < 4) {
            i |= (((byte) (bArr[min] & (255 << asn.A00))) & 255) << (min * 8);
        }
        this.A00 = i;
    }
}
