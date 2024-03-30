package X;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.6BZ  reason: invalid class name */
public final class AnonymousClass6BZ {
    public final ArrayList A00;
    public final int A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BZ) {
                AnonymousClass6BZ r5 = (AnonymousClass6BZ) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, ((C36341k9.A09(this.A02) * 31) + this.A01) * 31);
    }

    public AnonymousClass6BZ(ArrayList arrayList, int i, String str) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = arrayList;
    }

    public String toString() {
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[3];
        objArr[0] = this.A02;
        AnonymousClass000.A1K(objArr, this.A01);
        return C90494aF.A0e(locale, "ModelMetadata: name=%s version=%d assets=%s", C90524aI.A0x(this.A00, objArr, 2, 3));
    }
}
