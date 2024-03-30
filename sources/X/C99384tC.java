package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.whatsapp.R;

/* renamed from: X.4tC  reason: invalid class name and case insensitive filesystem */
public class C99384tC extends C129176Fq {
    public long A00 = Long.MAX_VALUE;
    public ValueAnimator A01;
    public ValueAnimator A02;
    public AccessibilityManager A03;
    public AutoCompleteTextView A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final TimeInterpolator A0A;
    public final View.OnClickListener A0B = new C66923Xv(this, 5);
    public final View.OnFocusChangeListener A0C = new C163347q3(this, 1);
    public final C16700pw A0D = new C138356hj(this);

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r4 > 300) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C99384tC r6) {
        /*
            android.widget.AutoCompleteTextView r0 = r6.A04
            if (r0 == 0) goto L_0x0037
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r6.A00
            long r4 = r4 - r0
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0018
            r2 = 300(0x12c, double:1.48E-321)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            r1 = 0
            if (r0 == 0) goto L_0x001e
            r6.A05 = r1
        L_0x001e:
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.A07
            r0 = r0 ^ 1
            A01(r6, r0)
            boolean r1 = r6.A07
            android.widget.AutoCompleteTextView r0 = r6.A04
            if (r1 == 0) goto L_0x0038
            r0.requestFocus()
            android.widget.AutoCompleteTextView r0 = r6.A04
            r0.showDropDown()
        L_0x0037:
            return
        L_0x0038:
            r0.dismissDropDown()
            return
        L_0x003c:
            r6.A05 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99384tC.A00(X.4tC):void");
    }

    public static void A01(C99384tC r1, boolean z) {
        if (r1.A07 != z) {
            r1.A07 = z;
            r1.A01.cancel();
            r1.A02.start();
        }
    }

    public C99384tC(C93014fP r4) {
        super(r4);
        this.A08 = C014506h.A00(r4.getContext(), R.attr.f4nameremoved, 67);
        this.A09 = C014506h.A00(r4.getContext(), R.attr.f4nameremoved, 50);
        this.A0A = C017807p.A01(AnonymousClass064.A03, r4.getContext(), R.attr.f4nameremoved);
    }
}
