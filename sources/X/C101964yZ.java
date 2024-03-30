package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.4yZ  reason: invalid class name and case insensitive filesystem */
public final class C101964yZ extends C109815Zf {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C36381kD.A1Y(this, obj)) {
                return false;
            }
            C101964yZ r7 = (C101964yZ) obj;
            if (!(this.A00 == r7.A00 && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        int i;
        long j = this.A01;
        if (j > 0) {
            i = (int) ((((long) 100) * this.A00) / j);
        } else {
            i = 0;
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[3];
        AnonymousClass000.A1M(objArr, 0, this.A00);
        AnonymousClass000.A1M(objArr, 1, j);
        AnonymousClass000.A1L(objArr, i, 2);
        return C90494aF.A0e(locale, "MediaRestoreProgressStatus/progress %d/%d (%d%%)", Arrays.copyOf(objArr, 3));
    }

    public C101964yZ(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        C90474aD.A1S(A0M, this.A00);
        C36421kH.A1P(A0M, this.A01);
        return Arrays.hashCode(A0M);
    }
}
