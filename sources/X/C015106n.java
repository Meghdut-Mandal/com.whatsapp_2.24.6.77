package X;

import android.content.res.Resources;

/* renamed from: X.06n  reason: invalid class name and case insensitive filesystem */
public final class C015106n {
    public final Resources.Theme A00;
    public final Resources A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C015106n r5 = (C015106n) obj;
            if (!this.A01.equals(r5.A01) || !C014106d.A01(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C014106d.A00(this.A01, this.A00);
    }

    public C015106n(Resources.Theme theme, Resources resources) {
        this.A01 = resources;
        this.A00 = theme;
    }
}
