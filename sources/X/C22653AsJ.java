package X;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.AsJ  reason: case insensitive filesystem */
public class C22653AsJ extends AnonymousClass121 {
    public static final C22653AsJ A01 = new C22653AsJ((byte) 0);
    public static final C22653AsJ A02 = new C22653AsJ((byte) -1);
    public final byte A00;

    public C22653AsJ(byte b) {
        this.A00 = b;
    }

    public int A0A() {
        return 3;
    }

    public boolean A0E() {
        return false;
    }

    public static C22653AsJ A01(Object obj) {
        if (obj == null || (obj instanceof C22653AsJ)) {
            return (C22653AsJ) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C22653AsJ) AnonymousClass121.A00((byte[]) obj);
            } catch (IOException e) {
                throw AnonymousClass001.A08(C36331k8.A0i("failed to construct boolean from byte[]: ", AnonymousClass000.A0u(), e));
            }
        } else {
            throw C165567td.A0N(obj, "illegal object in getInstance: ", AnonymousClass000.A0u());
        }
    }

    public AnonymousClass121 A0B() {
        if (this.A00 != 0) {
            return A02;
        }
        return A01;
    }

    public void A0D(C200179gm r4, boolean z) {
        byte b = this.A00;
        if (z) {
            r4.A00.write(1);
        }
        OutputStream outputStream = r4.A00;
        outputStream.write((byte) 1);
        outputStream.write(b);
    }

    public boolean A0F(AnonymousClass121 r4) {
        if (!(r4 instanceof C22653AsJ) || AnonymousClass000.A1P(this.A00) != AnonymousClass000.A1P(((C22653AsJ) r4).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A1P(this.A00) ? 1 : 0;
    }

    public String toString() {
        if (this.A00 != 0) {
            return "TRUE";
        }
        return "FALSE";
    }

    public static C22653AsJ A02(C22658AsO asO) {
        AnonymousClass121 A012 = C22658AsO.A01(asO);
        if (A012 instanceof C22653AsJ) {
            return A01(A012);
        }
        byte[] A03 = C22659AsP.A03(A012);
        if (A03.length == 1) {
            byte b = A03[0];
            if (b == -1) {
                return A02;
            }
            if (b != 0) {
                return new C22653AsJ(b);
            }
            return A01;
        }
        throw AnonymousClass001.A08("BOOLEAN value should have 1 byte in it");
    }
}
