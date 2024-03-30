package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.0CY  reason: invalid class name */
public abstract class AnonymousClass0CY {
    public int A00 = Integer.MIN_VALUE;
    public final Rect A01 = new Rect();
    public final AnonymousClass0CP A02;

    public static AnonymousClass0CY A00(AnonymousClass0CP r2, int i) {
        int i2 = 0;
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                throw new IllegalArgumentException("invalid orientation");
            }
        }
        return new C18180sk(r2, i2);
    }

    public abstract int A01();

    public abstract int A02();

    public abstract int A03();

    public abstract int A04();

    public abstract int A05();

    public abstract int A06(View view);

    public abstract int A07(View view);

    public abstract int A08(View view);

    public abstract int A09(View view);

    public abstract int A0A(View view);

    public abstract int A0B(View view);

    public abstract void A0C(int i);

    public AnonymousClass0CY(AnonymousClass0CP r2) {
        this.A02 = r2;
    }
}
