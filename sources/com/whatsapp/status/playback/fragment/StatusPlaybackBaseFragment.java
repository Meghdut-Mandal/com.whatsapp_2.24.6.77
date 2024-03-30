package com.whatsapp.status.playback.fragment;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass17Y;
import X.AnonymousClass332;
import X.AnonymousClass3BI;
import X.AnonymousClass3LC;
import X.AnonymousClass3S6;
import X.AnonymousClass4Y9;
import X.C18820ts;
import X.C20810yC;
import X.C21060yb;
import X.C36321k7;
import X.C36331k8;
import X.C48772i1;
import X.C67123Yp;
import X.C81173wa;
import X.C88164Rq;
import X.C88584Tg;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import java.util.Iterator;
import java.util.List;

public abstract class StatusPlaybackBaseFragment extends Hilt_StatusPlaybackBaseFragment {
    public AnonymousClass17Y A00;
    public C21060yb A01;
    public C18820ts A02;
    public C20810yC A03;
    public AnonymousClass3BI A04;
    public AnonymousClass3S6 A05;
    public boolean A06;
    public final Runnable A07 = new C81173wa((Object) this, 38);
    public final C88584Tg A08 = new AnonymousClass4Y9(this, 1);

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        AnonymousClass00C.A0B(inflate);
        this.A04 = new AnonymousClass3BI(inflate);
        return inflate;
    }

    public void A1P(Bundle bundle) {
        StatusPlaybackFragment A3j;
        this.A0Y = true;
        A1f(this.A01);
        C88164Rq r3 = (C88164Rq) A0h();
        if (r3 != null) {
            String A1Z = A1Z();
            StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) r3;
            AnonymousClass332 r1 = (AnonymousClass332) statusPlaybackActivity.A0D.A01.get(statusPlaybackActivity.A08.getCurrentItem());
            if (r1.A00.A09.getRawString().equals(A1Z) && (A3j = statusPlaybackActivity.A3j(r1)) != null) {
                A3j.A1b();
                A3j.A1d(1);
            }
        }
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        AnonymousClass01I A0i = A0i();
        C48772i1 r4 = new C48772i1(this, 7);
        AnonymousClass3BI r3 = this.A04;
        if (r3 != null) {
            ImageView imageView = r3.A0A;
            C18820ts r1 = this.A02;
            if (r1 != null) {
                C36321k7.A0L(A0i, imageView, r1, R.drawable.ic_cam_back);
                r3.A0A.setOnClickListener(r4);
                View view2 = r3.A03;
                C18820ts r7 = this.A02;
                if (r7 != null) {
                    C20810yC r8 = this.A03;
                    if (r8 != null) {
                        view2.setOnClickListener(new C67123Yp(A0i, view2, r7, r8, this));
                        return;
                    }
                    throw C36321k7.A07();
                }
                throw C36321k7.A09();
            }
            throw C36321k7.A09();
        }
    }

    public void A1e(Rect rect) {
        super.A1e(rect);
        A1f(rect);
        Rect rect2 = this.A01;
        AnonymousClass00C.A0D(rect2, 0);
        Iterator A0z = AnonymousClass000.A0z(((StatusPlaybackContactFragment) this).A0w.A06());
        while (A0z.hasNext()) {
            ((AnonymousClass3LC) A0z.next()).A0B(rect2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016a, code lost:
        if (r0 != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1f(android.graphics.Rect r8) {
        /*
            r7 = this;
            r6 = 0
            X.AnonymousClass00C.A0D(r8, r6)
            X.3BI r3 = r7.A04
            if (r3 == 0) goto L_0x00d1
            X.01I r0 = r7.A0h()
            if (r0 == 0) goto L_0x001b
            X.0yb r2 = r7.A01
            if (r2 == 0) goto L_0x016f
            android.view.Window r1 = r0.getWindow()
            android.widget.FrameLayout r0 = r3.A09
            X.AnonymousClass6YG.A00(r0, r1, r2)
        L_0x001b:
            android.view.View r5 = r3.A06
            int r4 = r8.left
            int r2 = r5.getPaddingTop()
            int r1 = r8.right
            int r0 = r5.getPaddingBottom()
            r5.setPadding(r4, r2, r1, r0)
            android.view.View r1 = r3.A01
            int r0 = r8.top
            r1.setPadding(r6, r0, r6, r6)
            r2 = 5
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0113
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "SM-G960"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "SM-G955"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "SM-G950"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0104
            r1 = 1084437299(0x40a33333, float:5.1)
        L_0x005b:
            android.content.res.Resources r0 = X.C36341k9.A0G(r7)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r6 = android.util.TypedValue.applyDimension(r2, r1, r0)
            android.content.res.Resources r1 = X.C36341k9.A0G(r7)
            r0 = 2131168424(0x7f070ca8, float:1.795115E38)
            r4 = 2131168424(0x7f070ca8, float:1.795115E38)
            float r5 = X.C36441kJ.A00(r1, r0)
            r2 = 0
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0094
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x00f5
            com.whatsapp.status.playback.widget.StatusPlaybackProgressView r0 = r3.A0F
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L_0x00f5
            android.view.DisplayCutout r0 = r0.getDisplayCutout()
            if (r0 == 0) goto L_0x00f5
            int r0 = r0.getSafeInsetTop()
            if (r0 <= 0) goto L_0x00f5
        L_0x0094:
            android.content.res.Resources r0 = X.C36341k9.A0G(r7)
            int r5 = r0.getDimensionPixelSize(r4)
            double r0 = (double) r2
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            int r5 = r5 + r0
            com.whatsapp.status.playback.widget.StatusPlaybackProgressView r4 = r3.A0F
            int r2 = r8.left
            int r2 = r2 + r5
            int r1 = r4.getPaddingTop()
            int r0 = r8.right
            int r5 = r5 + r0
            int r0 = r4.getPaddingBottom()
            r4.setPadding(r2, r1, r5, r0)
            android.view.ViewStub r4 = r3.A08
            android.view.ViewGroup$MarginLayoutParams r3 = X.C36371kC.A0K(r4)
            android.content.Context r0 = r7.A0a()
            int r1 = X.C36341k9.A04(r0)
            r0 = 1
            if (r1 == r0) goto L_0x00d2
            r0 = 2
            if (r1 == r0) goto L_0x00e9
            int r2 = r3.bottomMargin
        L_0x00cc:
            r3.bottomMargin = r2
            r4.setLayoutParams(r3)
        L_0x00d1:
            return
        L_0x00d2:
            android.graphics.Rect r0 = r7.A01
            int r2 = r0.bottom
            android.content.res.Resources r1 = X.C36341k9.A0G(r7)
            if (r2 <= 0) goto L_0x00e5
            r0 = 2131165283(0x7f070063, float:1.7944779E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            int r2 = r2 + r0
            goto L_0x00cc
        L_0x00e5:
            r0 = 2131165281(0x7f070061, float:1.7944775E38)
            goto L_0x00f0
        L_0x00e9:
            android.content.res.Resources r1 = X.C36341k9.A0G(r7)
            r0 = 2131165282(0x7f070062, float:1.7944777E38)
        L_0x00f0:
            int r2 = r1.getDimensionPixelOffset(r0)
            goto L_0x00cc
        L_0x00f5:
            r0 = 2
            float r0 = (float) r0
            float r0 = r0 * r5
            float r0 = r0 * r6
            float r5 = r5 * r5
            float r0 = r0 - r5
            double r0 = (double) r0
            double r1 = java.lang.Math.sqrt(r0)
            float r0 = (float) r1
            float r2 = r6 - r0
            goto L_0x0094
        L_0x0104:
            java.lang.String r0 = "SM-G965"
            boolean r0 = r1.startsWith(r0)
            r1 = 1085695590(0x40b66666, float:5.7)
            goto L_0x016a
        L_0x010e:
            r1 = 1084856730(0x40a9999a, float:5.3)
            goto L_0x005b
        L_0x0113:
            java.lang.String r0 = "Google"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x012a
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Pixel 2 XL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0161
            r1 = 1082759578(0x4089999a, float:4.3)
            goto L_0x005b
        L_0x012a:
            java.lang.String r0 = "LGE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x016c
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "H87"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x015c
            java.lang.String r0 = "G600"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x015c
            java.lang.String r0 = "LS993"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x015c
            java.lang.String r0 = "AS993"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x015c
            java.lang.String r0 = "VS998"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x016c
        L_0x015c:
            r1 = 1084919644(0x40aa8f5c, float:5.33)
            goto L_0x005b
        L_0x0161:
            java.lang.String r0 = "Pixel 3"
            boolean r0 = r1.equals(r0)
            r1 = 1082340147(0x40833333, float:4.1)
        L_0x016a:
            if (r0 != 0) goto L_0x005b
        L_0x016c:
            r1 = 0
            goto L_0x005b
        L_0x016f:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment.A1f(android.graphics.Rect):void");
    }

    public void A1J() {
        super.A1J();
        this.A04 = null;
    }

    public void A1K() {
        super.A1K();
        AnonymousClass3S6 r2 = this.A05;
        if (r2 != null) {
            C88584Tg r1 = this.A08;
            AnonymousClass00C.A0D(r1, 0);
            List list = r2.A02;
            if (list != null) {
                list.remove(r1);
                return;
            }
            return;
        }
        throw C36331k8.A0d("statusPlaybackAudioManager");
    }

    public void A1L() {
        super.A1L();
        AnonymousClass3S6 r2 = this.A05;
        if (r2 != null) {
            C88584Tg r1 = this.A08;
            AnonymousClass00C.A0D(r1, 0);
            List list = r2.A02;
            if (list == null) {
                list = AnonymousClass001.A0I();
                r2.A02 = list;
            }
            list.add(r1);
            return;
        }
        throw C36331k8.A0d("statusPlaybackAudioManager");
    }
}
