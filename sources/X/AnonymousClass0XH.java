package X;

import android.os.Build;
import android.view.DisplayCutout;

/* renamed from: X.0XH  reason: invalid class name */
public final class AnonymousClass0XH {
    public final DisplayCutout A00;

    public static AnonymousClass0XH A00(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new AnonymousClass0XH(displayCutout);
    }

    public int A01() {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass0YN.A00(this.A00);
        }
        return 0;
    }

    public int A02() {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass0YN.A01(this.A00);
        }
        return 0;
    }

    public int A03() {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass0YN.A02(this.A00);
        }
        return 0;
    }

    public int A04() {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass0YN.A03(this.A00);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C014106d.A01(this.A00, ((AnonymousClass0XH) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass0XH(DisplayCutout displayCutout) {
        this.A00 = displayCutout;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DisplayCutoutCompat{");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("}", A0u);
    }
}
