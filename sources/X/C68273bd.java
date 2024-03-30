package X;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.3bd  reason: invalid class name and case insensitive filesystem */
public class C68273bd implements AnonymousClass02G {
    public final /* synthetic */ C18820ts A00;
    public final /* synthetic */ C1261362r A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C65923Tz A03;
    public final /* synthetic */ C19890wg A04;

    public void BcA(int i) {
        C65923Tz r1;
        boolean z = true;
        if (i == 1) {
            r1 = this.A03;
        } else if (i == 0) {
            r1 = this.A03;
            z = false;
        } else {
            return;
        }
        int i2 = C65923Tz.A0Z;
        r1.A05 = z;
    }

    public void BcB(int i, float f, int i2) {
    }

    public C68273bd(Context context, C65923Tz r2, C18820ts r3, C1261362r r4, C19890wg r5) {
        this.A03 = r2;
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = context;
        this.A04 = r5;
    }

    public void BcC(int i) {
        C65923Tz r4 = this.A03;
        int i2 = C65923Tz.A0Z;
        ViewPager viewPager = r4.A0K;
        View findViewWithTag = viewPager.findViewWithTag(Integer.valueOf(r4.A00));
        if (findViewWithTag != null) {
            ((AbsListView) findViewWithTag).setOnScrollListener((AbsListView.OnScrollListener) null);
        }
        boolean z = r4.A05;
        C1261362r r1 = this.A01;
        int i3 = 5;
        if (z) {
            i3 = 6;
        }
        r1.A00(0, 0, i3);
        if (C36351kA.A1Y(this.A00)) {
            r4.A00 = i;
        } else {
            int length = (r4.A0P.length - 1) - i;
            i = length;
            r4.A00 = length;
        }
        C65923Tz.A03(r4, i);
        View findViewWithTag2 = viewPager.findViewWithTag(Integer.valueOf(r4.A00));
        if (findViewWithTag2 != null) {
            ((AbsListView) findViewWithTag2).setOnScrollListener(r4.A0I);
            findViewWithTag2.getViewTreeObserver().addOnPreDrawListener(new C90004Ys(findViewWithTag2, this, 0));
        }
    }
}
