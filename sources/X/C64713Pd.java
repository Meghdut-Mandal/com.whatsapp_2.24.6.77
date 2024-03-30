package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.3Pd  reason: invalid class name and case insensitive filesystem */
public class C64713Pd {
    public int A00 = 2;
    public AnonymousClass11F A01;
    public Double A02;
    public Double A03;
    public String A04;
    public boolean A05;
    public final Rect A06;
    public final AnonymousClass11F A07;
    public final Integer A08;

    public static C64713Pd A00(View view, AnonymousClass11F r3, Integer num) {
        C64713Pd r1 = new C64713Pd(view, r3, num);
        r1.A04 = C011004s.A03(view);
        return r1;
    }

    public void A02(Activity activity) {
        if (activity != null) {
            C05290Pd.A00(activity, A01(activity), AnonymousClass0YW.A02().A03());
            activity.overridePendingTransition(0, 0);
        }
    }

    public C64713Pd(View view, AnonymousClass11F r9, Integer num) {
        this.A07 = r9;
        this.A08 = num;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect A062 = AnonymousClass001.A06();
        int i = iArr[0];
        A062.left = (int) ((((float) i) * 1.0f) + 0.5f);
        A062.top = (int) ((((float) iArr[1]) * 1.0f) + 0.5f);
        A062.right = (int) ((((float) (i + view.getWidth())) * 1.0f) + 0.5f);
        A062.bottom = (int) ((((float) C36431kI.A04(view, iArr[1])) * 1.0f) + 0.5f);
        this.A06 = A062;
    }

    public Intent A01(Activity activity) {
        Integer num;
        Integer valueOf = Integer.valueOf(activity.getWindow().getStatusBarColor());
        if (C19550w8.A04()) {
            num = Integer.valueOf(activity.getWindow().getNavigationBarColor());
        } else {
            num = null;
        }
        Integer num2 = this.A08;
        String str = this.A04;
        Rect rect = this.A06;
        boolean z = this.A05;
        AnonymousClass11F r9 = this.A01;
        Double d = this.A02;
        Double d2 = this.A03;
        AnonymousClass11F r4 = this.A07;
        int i = this.A00;
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(activity.getPackageName(), "com.whatsapp.quickcontact.QuickContactActivity");
        if (num2 != null) {
            A0D.putExtra("profile_entry_point", num2);
        }
        if (str != null) {
            A0D.putExtra("transition_name", str);
        }
        if (valueOf != null) {
            A0D.putExtra("status_bar_color", valueOf);
        }
        if (num != null) {
            A0D.putExtra("navigation_bar_color", num);
        }
        if (r9 != null) {
            A0D.putExtra("gjid", r9.getRawString());
        }
        if (d != null) {
            A0D.putExtra("location_latitude", d);
        }
        if (d2 != null) {
            A0D.putExtra("location_longitude", d2);
        }
        A0D.putExtra("show_get_direction", z);
        C36421kH.A0m(A0D, r4);
        A0D.putExtra("animation_style", i);
        A0D.setSourceBounds(rect);
        return A0D;
    }

    public C64713Pd(Rect rect, AnonymousClass11F r3, Integer num) {
        this.A07 = r3;
        this.A08 = num;
        this.A06 = rect;
    }
}
