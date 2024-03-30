package X;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: X.0ew  reason: invalid class name and case insensitive filesystem */
public class C10680ew implements C17650rm {
    public final /* synthetic */ CollapsingToolbarLayout A00;

    public C10680ew(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.A00 = collapsingToolbarLayout;
    }

    public void Bbs(AppBarLayout appBarLayout, int i) {
        int i2;
        int height;
        CollapsingToolbarLayout collapsingToolbarLayout = this.A00;
        collapsingToolbarLayout.A00 = i;
        AnonymousClass09H r0 = collapsingToolbarLayout.A09;
        if (r0 != null) {
            i2 = r0.A05();
        } else {
            i2 = 0;
        }
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = collapsingToolbarLayout.getChildAt(i3);
            C03400El r2 = (C03400El) childAt.getLayoutParams();
            C06540Tz A002 = CollapsingToolbarLayout.A00(childAt);
            int i4 = r2.A00;
            if (i4 == 1) {
                int i5 = -i;
                height = ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.A00(childAt).A01) - childAt.getHeight()) - AnonymousClass000.A0a(childAt).bottomMargin;
                if (i5 < 0) {
                    height = 0;
                } else if (i5 <= height) {
                    height = i5;
                }
            } else if (i4 == 2) {
                height = Math.round(((float) (-i)) * r2.A01);
            }
            if (A002.A02 != height) {
                A002.A02 = height;
                A002.A00();
            }
        }
        collapsingToolbarLayout.A05();
        if (collapsingToolbarLayout.A01 != null && i2 > 0) {
            C011504z.A05(collapsingToolbarLayout);
        }
        int height2 = collapsingToolbarLayout.getHeight();
        int A01 = (height2 - C011504z.A01(collapsingToolbarLayout)) - i2;
        AnonymousClass0Z1 r4 = collapsingToolbarLayout.A0U;
        float f = (float) A01;
        float min = Math.min(1.0f, ((float) (height2 - collapsingToolbarLayout.getScrimVisibleHeightTrigger())) / f);
        r4.A0N = min;
        r4.A0O = min + ((1.0f - min) * 0.5f);
        r4.A0S = collapsingToolbarLayout.A00 + A01;
        r4.A08(((float) Math.abs(i)) / f);
    }
}
