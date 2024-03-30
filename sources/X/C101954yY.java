package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.4yY  reason: invalid class name and case insensitive filesystem */
public final class C101954yY extends C109815Zf {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C36381kD.A1Y(this, obj)) {
                return false;
            }
            C101954yY r7 = (C101954yY) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        int i;
        long j = this.A00;
        if (j > 0) {
            i = (int) ((((long) 100) * this.A01) / j);
        } else {
            i = 0;
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[3];
        AnonymousClass000.A1M(objArr, 0, this.A01);
        AnonymousClass000.A1M(objArr, 1, j);
        AnonymousClass000.A1L(objArr, i, 2);
        return C90494aF.A0e(locale, "BackupProgressStatus/progress %d/%d (%d%%)", Arrays.copyOf(objArr, 3));
    }

    public C101954yY(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        C90474aD.A1S(A0M, this.A01);
        C36421kH.A1P(A0M, this.A00);
        return Arrays.hashCode(A0M);
    }
}
