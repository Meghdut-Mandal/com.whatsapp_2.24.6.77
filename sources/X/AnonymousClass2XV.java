package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2XV  reason: invalid class name */
public class AnonymousClass2XV extends AnonymousClass3U9 {
    public final MediaViewBaseFragment A00;
    public final AnonymousClass3CG A01;

    public void A0B() {
    }

    public void A0C(Bundle bundle) {
        PhotoView A1a;
        String str;
        MediaViewBaseFragment mediaViewBaseFragment = this.A00;
        Object A1e = mediaViewBaseFragment.A1e(mediaViewBaseFragment.A08.getCurrentItem());
        if (A1e != null) {
            C36431kI.A0N(mediaViewBaseFragment).setSharedElementsUseOverlay(true);
            int childCount = mediaViewBaseFragment.A08.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = mediaViewBaseFragment.A08.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    if (viewGroup.getChildCount() > 0 && (A1a = mediaViewBaseFragment.A1a(viewGroup)) != null) {
                        if (A1e.equals(viewGroup.getTag())) {
                            str = AnonymousClass000.A0p("thumb-transition-", A1e.toString(), AnonymousClass000.A0u());
                        } else {
                            str = null;
                        }
                        C011004s.A08(A1a, str);
                    }
                }
            }
            if (mediaViewBaseFragment.A1d() != null && !A1e.equals(mediaViewBaseFragment.A1d())) {
                mediaViewBaseFragment.A0i().A20(new C89054Vb(bundle, this, 1));
            }
            if (mediaViewBaseFragment.A1p()) {
                AnonymousClass0PG.A00(mediaViewBaseFragment.A0i());
                return;
            }
        }
        mediaViewBaseFragment.A1g();
    }

    public void A0D(Bundle bundle, AnonymousClass4R6 r13) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A00;
        C36431kI.A0N(mediaViewBaseFragment).setSharedElementsUseOverlay(false);
        mediaViewBaseFragment.A02.setVisibility(4);
        mediaViewBaseFragment.A1n(false, 0);
        mediaViewBaseFragment.A03.setVisibility(0);
        mediaViewBaseFragment.A0G = false;
        View A0C = C36361kB.A0C(mediaViewBaseFragment.A0i());
        C89924Yk.A00(A0C.getViewTreeObserver(), A0C, 6);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        AnonymousClass3CG r5 = this.A01;
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setInterpolator(linearInterpolator);
        Context context = r5.A00;
        changeBounds.excludeTarget(C36401kF.A0o(context, R.string.f12nameremoved), true);
        changeBounds.excludeTarget(C36401kF.A0o(context, R.string.f12nameremoved), true);
        ChangeTransform changeTransform = new ChangeTransform();
        changeTransform.setInterpolator(linearInterpolator);
        ChangeImageTransform changeImageTransform = new ChangeImageTransform();
        changeImageTransform.setInterpolator(linearInterpolator);
        C92024d0 r2 = new C92024d0(mediaViewBaseFragment.A0a(), r5, true);
        r2.setInterpolator(linearInterpolator);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setInterpolator(linearInterpolator);
        transitionSet.setDuration(220);
        transitionSet.addTransition(changeBounds);
        transitionSet.addTransition(changeTransform);
        transitionSet.addTransition(changeImageTransform);
        transitionSet.addTransition(r2);
        C92024d0 r22 = new C92024d0(mediaViewBaseFragment.A0a(), r5, false);
        r22.setInterpolator(linearInterpolator);
        TransitionSet transitionSet2 = new TransitionSet();
        transitionSet2.setInterpolator(linearInterpolator);
        transitionSet2.setDuration(220);
        transitionSet2.addTransition(changeBounds);
        transitionSet2.addTransition(changeTransform);
        transitionSet2.addTransition(changeImageTransform);
        transitionSet2.addTransition(r22);
        Fade fade = new Fade();
        fade.excludeTarget(16908335, true);
        fade.excludeTarget(16908336, true);
        fade.excludeTarget(R.id.insets_view, true);
        Fade fade2 = new Fade();
        fade2.excludeTarget(16908335, true);
        fade2.excludeTarget(16908336, true);
        fade2.excludeTarget(R.id.insets_view, true);
        if (mediaViewBaseFragment.A1p()) {
            AnonymousClass01I A0i = mediaViewBaseFragment.A0i();
            Window window = A0i.getWindow();
            A0i.A1p();
            window.setSharedElementEnterTransition(transitionSet);
            window.setSharedElementReturnTransition(transitionSet2);
            window.setEnterTransition(fade);
            window.setReturnTransition(fade2);
            transitionSet.addListener(new AnonymousClass28h(mediaViewBaseFragment, r13));
            transitionSet2.addListener(new C89284Vy(r13, 1));
            return;
        }
        AnonymousClass02E.A01(mediaViewBaseFragment).A0A = transitionSet;
        AnonymousClass02E.A01(mediaViewBaseFragment).A0B = transitionSet2;
        AnonymousClass02E.A01(mediaViewBaseFragment).A07 = fade;
        AnonymousClass02E.A01(mediaViewBaseFragment).A09 = fade2;
        fade.addListener(new AnonymousClass28h(mediaViewBaseFragment, r13));
        fade2.addListener(new C89284Vy(r13, 1));
    }

    public AnonymousClass2XV(AnonymousClass3CG r1, MediaViewBaseFragment mediaViewBaseFragment) {
        this.A01 = r1;
        this.A00 = mediaViewBaseFragment;
    }

    public static AnonymousClass09Y A00(View view, AnonymousClass01L r3, AnonymousClass01z r4, AnonymousClass3CG r5, String str) {
        Object obj;
        ArrayList A012 = A01(view, r3, r5, str);
        AnonymousClass09Y r52 = new AnonymousClass09Y(r4);
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            AnonymousClass00I r0 = (AnonymousClass00I) it.next();
            Object obj2 = r0.A00;
            if (!(obj2 == null || (obj = r0.A01) == null)) {
                String str2 = (String) obj;
                AnonymousClass0YI r02 = C06990Vx.A00;
                String A03 = C011004s.A03((View) obj2);
                if (A03 != null) {
                    if (r52.A0D == null) {
                        r52.A0D = AnonymousClass001.A0I();
                        r52.A0E = AnonymousClass001.A0I();
                    } else if (r52.A0E.contains(str2)) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        AnonymousClass000.A1D("A shared element with the target name '", str2, "' has already been added to the transaction.", A0u);
                        throw AnonymousClass000.A0b(A0u);
                    } else if (r52.A0D.contains(A03)) {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        AnonymousClass000.A1D("A shared element with the source name '", A03, "' has already been added to the transaction.", A0u2);
                        throw AnonymousClass000.A0b(A0u2);
                    }
                    r52.A0D.add(A03);
                    r52.A0E.add(str2);
                } else {
                    throw AnonymousClass001.A08("Unique transitionNames are required for all sharedElements");
                }
            }
        }
        return r52;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0090, code lost:
        if (r2 == 0) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0096, code lost:
        if (r6 != r10.getHeight()) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0098, code lost:
        X.AnonymousClass0VN.A01(r10, new android.graphics.Rect(0, r2, r10.getWidth(), r6));
        r10.postDelayed(new X.C1497272n(r10, 4), (long) r11.getResources().getInteger(17694721));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b9, code lost:
        r3.addAll(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bc, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A01(android.view.View r10, X.AnonymousClass01L r11, X.AnonymousClass3CG r12, java.lang.String r13) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            X.C011004s.A08(r10, r13)
            java.lang.String r0 = r10.getTransitionName()
            X.C36341k9.A1H(r10, r0, r3)
            r0 = 16908335(0x102002f, float:2.387736E-38)
            android.view.View r1 = r11.findViewById(r0)
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = "statusBar"
            X.C011004s.A08(r1, r0)
            X.C36341k9.A1H(r1, r0, r3)
        L_0x001f:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            int r6 = r10.getHeight()
            r8 = 2
            int[] r7 = new int[r8]
            r10.getLocationOnScreen(r7)
            r0 = 2131434884(0x7f0b1d84, float:1.8491595E38)
            android.view.View r2 = r11.findViewById(r0)
            r9 = 1
            if (r2 == 0) goto L_0x006b
            r1 = 2131897110(0x7f122b16, float:1.94291E38)
            android.content.Context r0 = r12.A00
            java.lang.String r0 = X.C36401kF.A0o(r0, r1)
            X.C011004s.A08(r2, r0)
            X.C36341k9.A1H(r2, r0, r4)
            int[] r5 = new int[r8]
            r2.getLocationOnScreen(r5)
            r0 = r7[r9]
            int r1 = X.C36431kI.A04(r10, r0)
            r0 = r5[r9]
            int r0 = X.C36431kI.A04(r2, r0)
            if (r1 <= r0) goto L_0x006b
            r0 = r7[r9]
            int r1 = X.C36431kI.A04(r10, r0)
            r0 = r5[r9]
            int r0 = X.C36431kI.A04(r2, r0)
            int r1 = r1 - r0
            int r6 = r10.getHeight()
            int r6 = r6 - r1
        L_0x006b:
            r0 = 2131434885(0x7f0b1d85, float:1.8491597E38)
            android.view.View r2 = r11.findViewById(r0)
            r5 = 0
            if (r2 == 0) goto L_0x00bd
            r1 = 2131897111(0x7f122b17, float:1.9429102E38)
            android.content.Context r0 = r12.A00
            java.lang.String r0 = X.C36401kF.A0o(r0, r1)
            X.C011004s.A08(r2, r0)
            X.C36341k9.A1H(r2, r0, r4)
            int[] r1 = new int[r8]
            r2.getLocationOnScreen(r1)
            r0 = r7[r9]
            r2 = r1[r9]
            if (r0 >= r2) goto L_0x00bd
            int r2 = r2 - r0
            if (r2 != 0) goto L_0x0098
        L_0x0092:
            int r0 = r10.getHeight()
            if (r6 == r0) goto L_0x00b9
        L_0x0098:
            int r1 = r10.getWidth()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r5, r2, r1, r6)
            X.AnonymousClass0VN.A01(r10, r0)
            r0 = 4
            X.72n r2 = new X.72n
            r2.<init>(r10, r0)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 17694721(0x10e0001, float:2.6081284E-38)
            int r0 = r1.getInteger(r0)
            long r0 = (long) r0
            r10.postDelayed(r2, r0)
        L_0x00b9:
            r3.addAll(r4)
            return r3
        L_0x00bd:
            r2 = 0
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2XV.A01(android.view.View, X.01L, X.3CG, java.lang.String):java.util.ArrayList");
    }

    public static void A02(Intent intent, View view, AnonymousClass01L r4, AnonymousClass3CG r5, String str) {
        C03540Gb A012 = AnonymousClass0YW.A01(r4, (AnonymousClass00I[]) A01(view, r4, r5, str).toArray(new AnonymousClass00I[0]));
        r4.setExitSharedElementCallback(new C36591kY(r4));
        C05290Pd.A00(r4, intent, A012.A00.toBundle());
    }
}
