package X;

import java.util.Enumeration;

public class B97 implements Enumeration {
    public int A00;
    public Object A01;
    public final int A02;

    public B97(C22645AsB asB, int i) {
        this.A02 = i;
        this.A01 = asB;
        this.A00 = 0;
    }

    public boolean hasMoreElements() {
        int i = this.A02;
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                if (i2 < ((C22656AsM) obj).A00.length) {
                    return true;
                }
                return false;
            case 1:
                if (i2 < ((C22657AsN) obj).A00.length) {
                    return true;
                }
                return false;
            case 2:
                if (i2 < ((C22659AsP) obj).A00.length) {
                    return true;
                }
                return false;
            default:
                if (i2 < ((C22645AsB) obj).A00.length) {
                    return true;
                }
                return false;
        }
    }

    public Object nextElement() {
        switch (this.A02) {
            case 0:
                int i = this.A00;
                C219411z[] r1 = ((C22656AsM) this.A01).A00;
                if (i < r1.length) {
                    this.A00 = i + 1;
                    return r1[i];
                }
                throw C165617ti.A0e();
            case 1:
                int i2 = this.A00;
                C219411z[] r12 = ((C22657AsN) this.A01).A00;
                if (i2 < r12.length) {
                    this.A00 = i2 + 1;
                    return r12[i2];
                }
                throw C165617ti.A0e();
            case 2:
                int i3 = this.A00;
                byte[] bArr = ((C22659AsP) this.A01).A00;
                int length = bArr.length;
                if (i3 < length) {
                    int min = Math.min(length - i3, 1000);
                    byte[] bArr2 = new byte[min];
                    System.arraycopy(bArr, i3, bArr2, 0, min);
                    this.A00 += min;
                    return new C22644AsA(bArr2);
                }
                throw C165617ti.A0e();
            default:
                int i4 = this.A00;
                C22659AsP[] asPArr = ((C22645AsB) this.A01).A00;
                if (i4 < asPArr.length) {
                    this.A00 = i4 + 1;
                    return asPArr[i4];
                }
                throw C165617ti.A0e();
        }
    }

    public B97(C22657AsN asN) {
        this.A02 = 1;
        this.A01 = asN;
        this.A00 = 0;
    }

    public B97(C22656AsM asM) {
        this.A02 = 0;
        this.A01 = asM;
        this.A00 = 0;
    }
}
