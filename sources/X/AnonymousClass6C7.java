package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.6C7  reason: invalid class name */
public final class AnonymousClass6C7 {
    public final Drawable A00;
    public final C157977fb A01;
    public final C119065pB A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6C7) {
                AnonymousClass6C7 r5 = (AnonymousClass6C7) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A01, C36381kD.A08(this.A03, AnonymousClass000.A0H(this.A00) * 31) * 31 * 31) + C36411kG.A09(this.A02);
    }

    public AnonymousClass6C7(Drawable drawable, C157977fb r2, C119065pB r3, String str) {
        this.A00 = drawable;
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CategoryThumbnail(iconDrawable=");
        A0u.append(this.A00);
        A0u.append(", text=");
        A0u.append(this.A03);
        A0u.append(", contentDescription=");
        A0u.append((String) null);
        A0u.append(", transitionName=");
        A0u.append((String) null);
        A0u.append(", clickListener=");
        A0u.append(this.A01);
        A0u.append(", fetchListener=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
