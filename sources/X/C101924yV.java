package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.4yV  reason: invalid class name and case insensitive filesystem */
public final class C101924yV extends C109815Zf {
    public final int A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && C36381kD.A1Y(this, obj) && this.A00 == ((C101924yV) obj).A00;
        }
        return true;
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        AnonymousClass000.A1J(objArr, this.A00);
        return C90494aF.A0e(locale, "BackupPreparationStatus/progress %d%%", Arrays.copyOf(objArr, 1));
    }

    public C101924yV(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }
}
