package X;

import java.util.Arrays;

/* renamed from: X.0US  reason: invalid class name */
public final class AnonymousClass0US {
    public final C06190Sq A00;
    public final int A01;
    public final C17370rB A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof AnonymousClass0US) {
                    AnonymousClass0US r5 = (AnonymousClass0US) obj;
                    if (!AnonymousClass0QM.A00(this.A00, r5.A00) || !AnonymousClass0QM.A00(this.A02, r5.A02) || !AnonymousClass0QM.A00(this.A03, r5.A03)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01;
    }

    public AnonymousClass0US(C17370rB r2, C06190Sq r3, String str) {
        this.A00 = r3;
        this.A02 = r2;
        this.A03 = str;
        Object[] objArr = new Object[3];
        AnonymousClass000.A19(r3, r2, str, objArr);
        this.A01 = Arrays.hashCode(objArr);
    }
}
