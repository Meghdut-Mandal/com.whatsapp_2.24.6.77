package X;

import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.6na  reason: invalid class name and case insensitive filesystem */
public abstract class C141646na implements C17650rm {
    public float A00 = 0.0f;
    public int A01 = 0;

    public abstract void A08(AppBarLayout appBarLayout, float f, int i);

    public abstract void A09(AppBarLayout appBarLayout, float f, int i, int i2);

    public abstract void A0A(AppBarLayout appBarLayout, float f, int i, int i2);

    public abstract void A0B(AppBarLayout appBarLayout, int i);

    public void Bbs(AppBarLayout appBarLayout, int i) {
        float A02 = ((float) i) / (C36441kJ.A02(appBarLayout) - ((float) appBarLayout.getMinimumHeight()));
        if (!Float.isNaN(A02) && !Float.isInfinite(A02)) {
            float f = this.A00;
            if (A02 != f) {
                if (f == 0.0f) {
                    A0A(appBarLayout, f, this.A01, 2);
                } else if (f == -1.0f) {
                    A0A(appBarLayout, -f, this.A01, 1);
                }
                if (A02 == 0.0f) {
                    A09(appBarLayout, A02, i, 1);
                } else {
                    float f2 = -A02;
                    if (A02 == -1.0f) {
                        A09(appBarLayout, f2, i, 2);
                    } else {
                        A08(appBarLayout, f2, i);
                    }
                }
            }
            if (A02 == 0.0f) {
                A0B(appBarLayout, 1);
            } else if (A02 == -1.0f) {
                A0B(appBarLayout, 2);
            }
            this.A00 = A02;
            this.A01 = i;
        }
    }
}
