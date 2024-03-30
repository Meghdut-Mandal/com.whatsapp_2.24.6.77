package X;

import java.util.Hashtable;

/* renamed from: X.AZx  reason: case insensitive filesystem */
public class C21764AZx implements B3H {
    public static Hashtable A07;
    public int A00;
    public int A01;
    public B3G A02;
    public byte[] A03;
    public byte[] A04;
    public B21 A05;
    public B21 A06;

    public int B5n(byte[] bArr, int i) {
        B3G b3g = this.A02;
        byte[] bArr2 = this.A04;
        int i2 = this.A00;
        b3g.B5n(bArr2, i2);
        B21 b21 = this.A06;
        if (b21 != null) {
            ((B21) b3g).BoU(b21);
            b3g.update(bArr2, i2, b3g.BB8());
        } else {
            b3g.update(bArr2, 0, bArr2.length);
        }
        int B5n = b3g.B5n(bArr, i);
        while (i2 < bArr2.length) {
            bArr2[i2] = 0;
            i2++;
        }
        B21 b212 = this.A05;
        if (b212 != null) {
            ((B21) b3g).BoU(b212);
            return B5n;
        }
        byte[] bArr3 = this.A03;
        b3g.update(bArr3, 0, bArr3.length);
        return B5n;
    }

    public int BDk() {
        return this.A01;
    }

    public void BwT(byte b) {
        this.A02.BwT(b);
    }

    public void reset() {
        B3G b3g = this.A02;
        b3g.reset();
        byte[] bArr = this.A03;
        b3g.update(bArr, 0, bArr.length);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.A02.update(bArr, i, i2);
    }

    static {
        Hashtable hashtable = new Hashtable();
        A07 = hashtable;
        hashtable.put("GOST3411", 32);
        A07.put("MD2", 16);
        A07.put("MD4", 64);
        A07.put("MD5", 64);
        A07.put("RIPEMD128", 64);
        A07.put("RIPEMD160", 64);
        A07.put("SHA-1", 64);
        A07.put("SHA-224", 64);
        A07.put("SHA-256", 64);
        A07.put("SHA-384", 128);
        A07.put("SHA-512", 128);
        A07.put("Tiger", 64);
        A07.put("Whirlpool", 64);
    }

    public C21764AZx(B3G b3g) {
        int intValue;
        if (b3g instanceof C23129B6k) {
            intValue = ((C23129B6k) b3g).B96();
        } else {
            Number number = (Number) A07.get(b3g.B8R());
            if (number != null) {
                intValue = number.intValue();
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("unknown digest passed: ");
                throw AnonymousClass000.A0c(b3g.B8R(), A0u);
            }
        }
        this.A02 = b3g;
        int BB8 = b3g.BB8();
        this.A01 = BB8;
        this.A00 = intValue;
        this.A03 = new byte[intValue];
        this.A04 = new byte[(intValue + BB8)];
    }

    public void BKO(C16590pl r9) {
        byte[] bArr;
        int length;
        B3G b3g = this.A02;
        b3g.reset();
        byte[] bArr2 = ((AZr) r9).A00;
        int length2 = bArr2.length;
        int i = this.A00;
        if (length2 > i) {
            b3g.update(bArr2, 0, length2);
            bArr = this.A03;
            b3g.B5n(bArr, 0);
            length2 = this.A01;
        } else {
            bArr = this.A03;
            System.arraycopy(bArr2, 0, bArr, 0, length2);
        }
        while (true) {
            length = bArr.length;
            if (length2 >= length) {
                break;
            }
            bArr[length2] = 0;
            length2++;
        }
        byte[] bArr3 = this.A04;
        System.arraycopy(bArr, 0, bArr3, 0, i);
        for (int i2 = 0; i2 < i; i2 = C165617ti.A07(bArr, bArr[i2] ^ 54, i2)) {
        }
        for (int i3 = 0; i3 < i; i3 = C165617ti.A07(bArr3, bArr3[i3] ^ 92, i3)) {
        }
        boolean z = b3g instanceof B21;
        if (z) {
            B21 B3i = ((B21) b3g).B3i();
            this.A06 = B3i;
            ((B3G) B3i).update(bArr3, 0, i);
        }
        b3g.update(bArr, 0, length);
        if (z) {
            this.A05 = ((B21) b3g).B3i();
        }
    }
}
