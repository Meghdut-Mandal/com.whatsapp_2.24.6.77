package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.whatsapp.R;

/* renamed from: X.1R8  reason: invalid class name */
public class AnonymousClass1R8 {
    public int A00 = 1;
    public TextView A01;
    public C225915a A02 = C225915a.UNDEFINED;
    public boolean A03;
    public final ImageView A04;
    public final ImageView A05;
    public final MaterialButton A06;
    public final C18820ts A07;
    public final C19650wI A08;
    public final ViewStub A09;
    public final C19970wo A0A;
    public final C19420v0 A0B;
    public final AnonymousClass1NA A0C;

    public static Drawable A00(Drawable drawable, Drawable drawable2) {
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() > 0) {
                drawable = layerDrawable.getDrawable(layerDrawable.getNumberOfLayers() - 1);
            }
        }
        if (drawable == null || Build.VERSION.SDK_INT < 23) {
            return drawable2;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(50);
        A01(drawable, transitionDrawable, 0);
        A01(drawable2, transitionDrawable, 1);
        return transitionDrawable;
    }

    public void A03() {
        TextView textView = this.A01;
        if (textView != null && textView.getVisibility() != 8) {
            C19420v0 r4 = this.A0B;
            long j = ((SharedPreferences) r4.A00.get()).getLong("create_group_tool_tip_nudge_show_time", 0);
            C19420v0.A00(r4).putLong("create_group_tool_tip_nudge_last_impression_time", System.currentTimeMillis() - j).apply();
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(100);
            this.A08.Bp3(new C35621iz(this, alphaAnimation, 3));
        }
    }

    public void A05(AnonymousClass1RK r5, boolean z) {
        MaterialButton materialButton = this.A06;
        if (materialButton != null && r5 != null) {
            C017607n r2 = new C017607n();
            r2.A08(materialButton);
            r2.A06(300);
            if (z) {
                r2.A0A(new C97284ol(r5, this));
            }
            C018607y.A02((ViewGroup) materialButton.getParent(), r2);
            int dimensionPixelSize = materialButton.getContext().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            materialButton.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            materialButton.setIconPadding(0);
            materialButton.setText("");
        }
    }

    public AnonymousClass1R8(ViewStub viewStub, ImageView imageView, ImageView imageView2, MaterialButton materialButton, C19970wo r8, C19420v0 r9, C18820ts r10, C20810yC r11, AnonymousClass1NA r12, C19650wI r13) {
        this.A0A = r8;
        this.A0C = r12;
        this.A07 = r10;
        this.A08 = r13;
        this.A0B = r9;
        C18740tg.A04(imageView);
        this.A04 = imageView;
        C18740tg.A04(imageView2);
        this.A05 = imageView2;
        this.A06 = materialButton;
        this.A09 = viewStub;
        if (materialButton != null && !AnonymousClass1MI.A02(r11, (C21000yV) null, 4997)) {
            Context context = materialButton.getContext();
            materialButton.setCornerRadius(context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved) / 2);
            materialButton.setBackgroundTintList(AnonymousClass00F.A04(context, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved)));
            materialButton.setTextColor(AnonymousClass00F.A04(context, R.color.f6nameremoved));
            materialButton.setIconTint(AnonymousClass00F.A04(context, R.color.f6nameremoved));
        }
    }

    public static void A01(Drawable drawable, TransitionDrawable transitionDrawable, int i) {
        int intrinsicHeight = drawable.getIntrinsicHeight();
        transitionDrawable.setLayerWidth(i, drawable.getIntrinsicWidth());
        transitionDrawable.setLayerHeight(i, intrinsicHeight);
        transitionDrawable.setLayerGravity(i, 17);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        if (r6 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (r11 == null) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AnonymousClass1RK r14, X.AnonymousClass1R8 r15) {
        /*
            android.graphics.drawable.Drawable r11 = r14.BDm()
            java.lang.String r3 = r14.BDl()
            android.graphics.drawable.Drawable r6 = r14.BH6()
            java.lang.String r4 = r14.BH5()
            android.widget.ImageView r7 = r15.A04
            r1 = 0
            X.1i9 r0 = new X.1i9
            r0.<init>(r14, r15, r1)
            r7.setOnClickListener(r0)
            android.widget.ImageView r0 = r15.A05
            r2 = 1
            X.1i9 r1 = new X.1i9
            r1.<init>(r14, r15, r2)
            r0.setOnClickListener(r1)
            if (r3 == 0) goto L_0x002b
            r7.setContentDescription(r3)
        L_0x002b:
            if (r11 == 0) goto L_0x0038
            android.graphics.drawable.Drawable r1 = r7.getDrawable()
            android.graphics.drawable.Drawable r1 = A00(r1, r11)
            r7.setImageDrawable(r1)
        L_0x0038:
            boolean r1 = r15.A03
            r3 = 0
            r10 = 8
            if (r1 != 0) goto L_0x0042
            r5 = 0
            if (r11 != 0) goto L_0x0044
        L_0x0042:
            r5 = 8
        L_0x0044:
            X.15a r2 = r15.A02
            X.15a r1 = X.C225915a.RAIL
            if (r2 == r1) goto L_0x00fe
            com.google.android.material.button.MaterialButton r9 = r15.A06
            if (r9 == 0) goto L_0x00fe
            java.lang.String r8 = r14.BDn()
            if (r8 == 0) goto L_0x00fe
            r2 = 2
            X.1i9 r1 = new X.1i9
            r1.<init>(r14, r15, r2)
            r9.setOnClickListener(r1)
            r7.setVisibility(r10)
            r9.setVisibility(r5)
            if (r5 != 0) goto L_0x0084
            r9.setIcon(r11)
            java.lang.CharSequence r1 = r9.getText()
            java.lang.String r1 = r1.toString()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0084
            X.0wI r5 = r15.A08
            X.1il r7 = new X.1il
            r7.<init>(r2, r8, r15)
            r1 = 3000(0xbb8, double:1.482E-320)
            android.os.Handler r5 = r5.A00
            r5.postDelayed(r7, r1)
        L_0x0084:
            r9.setContentDescription(r8)
        L_0x0087:
            if (r6 == 0) goto L_0x0094
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            android.graphics.drawable.Drawable r1 = A00(r1, r6)
            r0.setImageDrawable(r1)
        L_0x0094:
            boolean r1 = r15.A03
            if (r1 != 0) goto L_0x009b
            r2 = 0
            if (r6 != 0) goto L_0x009d
        L_0x009b:
            r2 = 8
        L_0x009d:
            int r1 = r0.getVisibility()
            if (r2 == r1) goto L_0x00c3
            r0.setVisibility(r2)
            int r1 = r15.A00
            if (r2 != 0) goto L_0x00e7
            float r11 = (float) r1
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            float r11 = r11 * r1
            r6 = 1
            r7 = 0
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r8 = 1
            r9 = 0
            r10 = 1
            r12 = 1
            r13 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 100
            r5.setDuration(r1)
        L_0x00c0:
            r0.startAnimation(r5)
        L_0x00c3:
            if (r4 == 0) goto L_0x00c8
            r0.setContentDescription(r4)
        L_0x00c8:
            boolean r0 = r15.A03
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = r14.BIO()
            if (r0 != 0) goto L_0x00d4
        L_0x00d2:
            r3 = 8
        L_0x00d4:
            android.widget.TextView r0 = r15.A01
            if (r0 != 0) goto L_0x00e2
            r0 = 8
        L_0x00da:
            if (r3 == r0) goto L_0x00e1
            if (r3 != 0) goto L_0x0125
            r15.A04(r14)
        L_0x00e1:
            return
        L_0x00e2:
            int r0 = r0.getVisibility()
            goto L_0x00da
        L_0x00e7:
            float r13 = (float) r1
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            float r13 = r13 * r1
            r6 = 1
            r7 = 0
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r8 = 1
            r9 = 0
            r10 = 1
            r11 = 0
            r12 = 1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 100
            r5.setDuration(r1)
            goto L_0x00c0
        L_0x00fe:
            com.google.android.material.button.MaterialButton r1 = r15.A06
            if (r1 == 0) goto L_0x0105
            r1.setVisibility(r10)
        L_0x0105:
            int r1 = r7.getVisibility()
            if (r5 == r1) goto L_0x0087
            r7.setVisibility(r5)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            if (r5 != 0) goto L_0x0116
            r2 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0116:
            android.view.animation.AlphaAnimation r5 = new android.view.animation.AlphaAnimation
            r5.<init>(r2, r1)
            r1 = 100
            r5.setDuration(r1)
            r7.startAnimation(r5)
            goto L_0x0087
        L_0x0125:
            r15.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R8.A02(X.1RK, X.1R8):void");
    }

    public void A04(AnonymousClass1RK r5) {
        ViewStub viewStub;
        if (r5.BIO() != null && (viewStub = this.A09) != null && !this.A0C.A00()) {
            TextView textView = this.A01;
            if (textView == null) {
                textView = (TextView) viewStub.inflate();
                this.A01 = textView;
            }
            textView.setText(r5.BIO());
            TextView textView2 = this.A01;
            textView2.setBackground(new C100744vb(AnonymousClass00E.A00(textView2.getContext(), R.drawable.tooltip_ptt), this.A07));
            this.A01.setVisibility(0);
            TextView textView3 = this.A01;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(100);
            textView3.startAnimation(alphaAnimation);
        }
    }
}
