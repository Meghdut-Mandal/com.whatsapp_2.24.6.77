package X;

import android.view.View;

/* renamed from: X.3Lj  reason: invalid class name and case insensitive filesystem */
public abstract class C63773Lj {
    public static final int A00(View[] viewArr, int i) {
        boolean z;
        int i2 = 0;
        int i3 = 0;
        do {
            if (viewArr[i2] != null) {
                i3++;
            }
            i2++;
            z = true;
        } while (i2 < 4);
        if (i3 <= 0) {
            z = false;
        }
        C18740tg.A0D(z, "MessageBadgeDrawables/getNextAvailableViewIndex Require >1 non-null badgeViews");
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            if (viewArr[i5] != null) {
                i4++;
            }
        }
        return i4;
    }
}
