package X;

import java.io.OutputStream;

/* renamed from: X.ArE  reason: case insensitive filesystem */
public class C22586ArE extends C22667AsX {
    public C22586ArE(byte[] bArr) {
        super(bArr, 0);
    }

    public C22586ArE(byte[] bArr, int i) {
        super(bArr, i);
    }

    public int A0A() {
        int length = this.A01.length;
        return C201849kY.A01(length + 1) + 1 + length + 1;
    }

    public AnonymousClass121 A0B() {
        return this;
    }

    public boolean A0E() {
        return false;
    }

    public static C22586ArE A01(Object obj) {
        if (obj == null || (obj instanceof C22586ArE)) {
            return (C22586ArE) obj;
        }
        if (obj instanceof C22585ArD) {
            C22667AsX asX = (C22667AsX) obj;
            return new C22586ArE(asX.A01, asX.A00);
        } else if (obj instanceof byte[]) {
            try {
                return (C22586ArE) AnonymousClass121.A00((byte[]) obj);
            } catch (Exception e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                throw AnonymousClass000.A0c(C90494aF.A0c(e, "encoding error in getInstance: ", A0u), A0u);
            }
        } else {
            throw C165567td.A0N(obj, "illegal object in getInstance: ", AnonymousClass000.A0u());
        }
    }

    public void A0D(C200179gm r8, boolean z) {
        int i;
        byte[] bArr = this.A01;
        int length = bArr.length;
        if (!(length == 0 || (i = this.A00) == 0)) {
            int i2 = length - 1;
            byte b = bArr[i2];
            byte b2 = (byte) ((255 << i) & b);
            if (b != b2) {
                byte b3 = (byte) i;
                if (z) {
                    r8.A00.write(3);
                }
                r8.A01(i2 + 2);
                OutputStream outputStream = r8.A00;
                outputStream.write(b3);
                outputStream.write(bArr, 0, i2);
                outputStream.write(b2);
                return;
            }
        }
        byte b4 = (byte) this.A00;
        if (z) {
            r8.A00.write(3);
        }
        r8.A01(length + 1);
        OutputStream outputStream2 = r8.A00;
        outputStream2.write(b4);
        outputStream2.write(bArr, 0, length);
    }

    public static C22586ArE A02(C22658AsO asO) {
        AnonymousClass121 A01 = C22658AsO.A01(asO);
        if (A01 instanceof C22586ArE) {
            return A01(A01);
        }
        byte[] A03 = C22659AsP.A03(A01);
        int length = A03.length;
        if (length >= 1) {
            byte b = A03[0];
            int i = length - 1;
            byte[] bArr = new byte[i];
            if (i != 0) {
                System.arraycopy(A03, 1, bArr, 0, i);
            }
            return new C22586ArE(bArr, b);
        }
        throw AnonymousClass001.A08("truncated BIT STRING detected");
    }
}
