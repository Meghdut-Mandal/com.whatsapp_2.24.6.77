package X;

import java.util.Objects;

/* renamed from: X.9VL  reason: invalid class name */
public final class AnonymousClass9VL {
    public final C199759fu A00;
    public final C199759fu A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass9VL r5 = (AnonymousClass9VL) obj;
            if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public AnonymousClass9VL(C199759fu r1, C199759fu r2) {
        Objects.requireNonNull(r1);
        this.A00 = r1;
        Objects.requireNonNull(r2);
        this.A01 = r2;
    }

    public String toString() {
        String A0l;
        StringBuilder A0p = C90484aE.A0p();
        C199759fu r0 = this.A00;
        A0p.append(r0);
        C199759fu r2 = this.A01;
        if (r0.equals(r2)) {
            A0l = "";
        } else {
            A0l = AnonymousClass000.A0l(r2, ", ", AnonymousClass000.A0u());
        }
        return C165567td.A0Y(A0l, A0p);
    }
}
