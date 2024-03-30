package X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.AsF  reason: case insensitive filesystem */
public abstract class C22649AsF extends AnonymousClass121 {
    public final int A00;
    public final boolean A01;
    public final byte[] A02;

    public C22649AsF(byte[] bArr, int i, boolean z) {
        this.A01 = z;
        this.A00 = i;
        this.A02 = AnonymousClass124.A02(bArr);
    }

    public int A0A() {
        int A002 = C201849kY.A00(this.A00);
        int length = this.A02.length;
        return A002 + C201849kY.A01(length) + length;
    }

    public boolean A0E() {
        return this.A01;
    }

    public int hashCode() {
        return (this.A01 ^ this.A00) ^ AnonymousClass124.A00(this.A02) ? 1 : 0;
    }

    public static C22649AsF A01(Object obj) {
        if (obj == null || (obj instanceof C22649AsF)) {
            return (C22649AsF) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return A01(AnonymousClass121.A00((byte[]) obj));
            } catch (IOException e) {
                throw AnonymousClass001.A08(C36331k8.A0i("Failed to construct object from byte[]: ", AnonymousClass000.A0u(), e));
            }
        } else {
            throw C165567td.A0N(obj, "unknown object in getInstance: ", AnonymousClass000.A0u());
        }
    }

    public boolean A0F(AnonymousClass121 r4) {
        if (!(r4 instanceof C22649AsF)) {
            return false;
        }
        C22649AsF asF = (C22649AsF) r4;
        if (this.A01 == asF.A01 && this.A00 == asF.A00 && Arrays.equals(this.A02, asF.A02)) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuffer A0x = C165607th.A0x();
        A0x.append("[");
        if (this.A01) {
            A0x.append("CONSTRUCTED ");
        }
        A0x.append("APPLICATION ");
        A0x.append(Integer.toString(this.A00));
        A0x.append("]");
        byte[] bArr = this.A02;
        if (bArr != null) {
            A0x.append(" #");
            str = C202439lp.A00(bArr, bArr.length);
        } else {
            str = " #null";
        }
        A0x.append(str);
        return C165597tg.A0n(" ", A0x);
    }
}
