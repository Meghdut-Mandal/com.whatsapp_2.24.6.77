package X;

import java.util.Arrays;

/* renamed from: X.9Ty  reason: invalid class name and case insensitive filesystem */
public class C195359Ty {
    public int A00;
    public byte[] A01;

    public C195359Ty(byte[] bArr, int i) {
        this.A01 = AnonymousClass124.A02(bArr);
        this.A00 = i;
    }

    public int hashCode() {
        return this.A00 ^ AnonymousClass124.A00(this.A01);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C195359Ty) {
            C195359Ty r4 = (C195359Ty) obj;
            if (r4.A00 == this.A00) {
                return Arrays.equals(this.A01, r4.A01);
            }
        }
        return false;
    }
}
