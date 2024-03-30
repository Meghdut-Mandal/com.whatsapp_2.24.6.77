package X;

import android.view.WindowInsetsAnimation;

/* renamed from: X.0Y8  reason: invalid class name */
public final class AnonymousClass0Y8 {
    public final AnonymousClass09T A00;
    public final AnonymousClass09T A01;

    public static AnonymousClass0Y8 A00(WindowInsetsAnimation.Bounds bounds) {
        return new AnonymousClass0Y8(bounds);
    }

    public AnonymousClass0Y8(AnonymousClass09T r1, AnonymousClass09T r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public WindowInsetsAnimation.Bounds A01() {
        return AnonymousClass0Gy.A00(this);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Bounds{lower=");
        A0u.append(this.A00);
        A0u.append(" upper=");
        A0u.append(this.A01);
        return AnonymousClass000.A0q("}", A0u);
    }

    public AnonymousClass0Y8(WindowInsetsAnimation.Bounds bounds) {
        this.A00 = AnonymousClass0Gy.A02(bounds);
        this.A01 = AnonymousClass0Gy.A01(bounds);
    }
}
