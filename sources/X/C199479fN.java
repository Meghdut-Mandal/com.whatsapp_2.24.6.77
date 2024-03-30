package X;

import java.util.Arrays;

/* renamed from: X.9fN  reason: invalid class name and case insensitive filesystem */
public final class C199479fN {
    public static final AnonymousClass7c0 A03 = C208899z1.A00;
    public final C206389tK A00;
    public final int[] A01;
    public final boolean[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C199479fN r5 = (C199479fN) obj;
            if (!this.A00.equals(r5.A00) || !Arrays.equals(this.A01, r5.A01) || !Arrays.equals(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((C36391kE.A0A(this.A00) * 31) + Arrays.hashCode(this.A01)) * 31) + Arrays.hashCode(this.A02);
    }

    public C199479fN(C206389tK r2, int[] iArr, boolean[] zArr) {
        this.A00 = r2;
        this.A01 = (int[]) iArr.clone();
        this.A02 = (boolean[]) zArr.clone();
    }
}
