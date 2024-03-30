package X;

import com.whatsapp.R;

/* renamed from: X.5QB  reason: invalid class name */
public final class AnonymousClass5QB extends AnonymousClass61O {
    public final float A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5QB) && Float.compare(this.A00, ((AnonymousClass5QB) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public AnonymousClass5QB(float f) {
        super(R.dimen.f7nameremoved);
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Large(strokeWidth=");
        return C90464aC.A0g(A0u, this.A00);
    }
}
