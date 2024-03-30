package X;

import com.whatsapp.R;

/* renamed from: X.68u  reason: invalid class name and case insensitive filesystem */
public final class C1275668u {
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1275668u) && AnonymousClass00C.A0J(this.A00, ((C1275668u) obj).A00));
    }

    public C1275668u(Integer num) {
        this.A00 = num;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, 929613632);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RowColor(iconColorRes=");
        A0u.append(R.color.f6nameremoved);
        A0u.append(", textColorRes=");
        A0u.append(R.color.f6nameremoved);
        A0u.append(", titleTextColorRes=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
