package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;
import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.3M5  reason: invalid class name */
public abstract class AnonymousClass3M5 {
    public static final void A00(View view, WaFragment waFragment, AnonymousClass1N2 r9, boolean z) {
        int i;
        AnonymousClass22g r4;
        View view2 = waFragment.A0F;
        if (view2 != null) {
            View view3 = null;
            if (z) {
                AnonymousClass01I A0i = waFragment.A0i();
                if ((A0i instanceof NewsletterInfoActivity) && (r4 = (AnonymousClass22g) A0i) != null) {
                    int childCount = r4.getListView().getChildCount();
                    for (int i2 = 0; i2 < childCount && view3 == null; i2++) {
                        View childAt = r4.getListView().getChildAt(i2);
                        if (childAt.getTag() != null) {
                            view3 = childAt;
                        }
                    }
                }
            }
            View findViewById = view2.findViewById(R.id.search_holder);
            if (findViewById != null) {
                findViewById.setVisibility(8);
                View A0G = C36361kB.A0G(findViewById, R.id.search_view);
                if (r9 != null) {
                    r9.A01(A0G);
                }
            }
            if (view3 != null) {
                if (findViewById != null) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(240);
                    findViewById.startAnimation(alphaAnimation);
                }
                int top = view3.getTop();
                if (view != null) {
                    i = view.getPaddingTop();
                } else {
                    i = 0;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (top - i));
                translateAnimation.setDuration(240);
                C89234Vt.A00(translateAnimation, waFragment, 15);
                if (view != null) {
                    view.startAnimation(translateAnimation);
                    return;
                }
                return;
            }
            waFragment.A0l().A0W();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r3 == null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.view.View r6, com.whatsapp.base.WaFragment r7, X.AnonymousClass00S r8, boolean r9) {
        /*
            if (r9 == 0) goto L_0x0030
            X.01I r5 = r7.A0i()
            boolean r0 = r5 instanceof com.whatsapp.newsletter.NewsletterInfoActivity
            if (r0 == 0) goto L_0x0030
            X.22g r5 = (X.AnonymousClass22g) r5
            if (r5 == 0) goto L_0x0030
            android.widget.ListView r0 = r5.getListView()
            int r4 = r0.getChildCount()
            r3 = 0
            r2 = 0
        L_0x0018:
            if (r2 >= r4) goto L_0x002e
            if (r3 != 0) goto L_0x0034
            android.widget.ListView r0 = r5.getListView()
            android.view.View r1 = r0.getChildAt(r2)
            java.lang.Object r0 = r1.getTag()
            if (r0 == 0) goto L_0x002b
            r3 = r1
        L_0x002b:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x002e:
            if (r3 != 0) goto L_0x0034
        L_0x0030:
            r8.invoke()
            return
        L_0x0034:
            int r1 = r3.getTop()
            int r0 = r6.getPaddingTop()
            int r1 = r1 - r0
            float r1 = (float) r1
            r0 = 0
            android.view.animation.TranslateAnimation r2 = new android.view.animation.TranslateAnimation
            r2.<init>(r0, r0, r1, r0)
            r0 = 240(0xf0, double:1.186E-321)
            r2.setDuration(r0)
            r0 = 16
            X.C89234Vt.A00(r2, r8, r0)
            r6.startAnimation(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3M5.A01(android.view.View, com.whatsapp.base.WaFragment, X.00S, boolean):void");
    }
}
