package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.util.HashMap;

/* renamed from: X.6WU  reason: invalid class name */
public class AnonymousClass6WU {
    public static final Interpolator A0M = C017907q.A00(0.33f, 1.0f, 0.68f, 1.0f);
    public static final HashMap A0N = AnonymousClass001.A0J();
    public static final HashMap A0O;
    public int A00 = 0;
    public int A01 = 0;
    public Animation A02;
    public Animation A03;
    public CircularProgressBar A04;
    public C121495tE A05;
    public boolean A06 = false;
    public boolean A07;
    public int A08;
    public final Context A09;
    public final View A0A;
    public final View A0B;
    public final View A0C;
    public final TextView A0D;
    public final WaImageView A0E;
    public final WaImageView A0F;
    public final WaImageView A0G;
    public final WaImageView A0H;
    public final WaImageView A0I;
    public final C161087m8 A0J;
    public final boolean A0K;
    public final TextView A0L;

    public static void A01(AnonymousClass6WU r12, float f, float f2) {
        r12.A0H.setActivated(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(220);
        scaleAnimation.setInterpolator(A0M);
        scaleAnimation.setFillAfter(true);
        CircularProgressBar circularProgressBar = r12.A04;
        if (circularProgressBar != null) {
            circularProgressBar.A06 = f2 * 8.0f;
            circularProgressBar.A07 = AnonymousClass00F.A00(r12.A09, R.color.f6nameremoved);
            circularProgressBar.startAnimation(scaleAnimation);
        }
    }

    public static void A00(AnonymousClass6WU r3) {
        C161087m8 r2 = r3.A0J;
        if (r2.getFlashModes().size() <= 1) {
            Boolean bool = C18750th.A01;
            r3.A0F.setVisibility(8);
            return;
        }
        r3.A0F.setVisibility(0);
        r3.A03(r2.getFlashMode());
    }

    public void A02() {
        WaImageView waImageView = this.A0H;
        waImageView.setActivated(false);
        waImageView.clearAnimation();
        Context context = this.A09;
        float A002 = C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved);
        float f = 1.0f;
        if (this.A07) {
            f = 0.6f;
        }
        int i = (int) (A002 / f);
        waImageView.setPadding(i, i, i, i);
        CircularProgressBar circularProgressBar = this.A04;
        if (circularProgressBar != null) {
            circularProgressBar.clearAnimation();
            circularProgressBar.setProgress(0);
            circularProgressBar.A07 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
            circularProgressBar.requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        if (r0 == false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.String r7) {
        /*
            r6 = this;
            java.util.HashMap r0 = A0N
            java.lang.Object r0 = r0.get(r7)
            int r3 = X.AnonymousClass000.A0I(r0)
            java.util.HashMap r0 = A0O
            java.lang.Object r0 = r0.get(r7)
            int r5 = X.AnonymousClass000.A0I(r0)
            X.7m8 r0 = r6.A0J
            java.util.List r2 = r0.getFlashModes()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x007f
            r1 = 0
        L_0x0021:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
            r1 = 2131889631(0x7f120ddf, float:1.9413931E38)
        L_0x0034:
            com.whatsapp.WaImageView r4 = r6.A0F
            X.C33521fV.A03(r4, r1)
            android.content.Context r2 = r6.A09
            X.C36331k8.A0q(r2, r4, r5)
            int r0 = r6.A08
            if (r0 == r3) goto L_0x006c
            if (r0 == 0) goto L_0x006c
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00E.A00(r2, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r2, r3)
            X.4bu r2 = new X.4bu
            r2.<init>(r1, r0)
            int r1 = r2.getIntrinsicHeight()
            int r0 = r4.getPaddingTop()
            int r1 = r1 + r0
            r0 = 120(0x78, float:1.68E-43)
            r2.A00 = r0
            r2.A01 = r1
            r0 = 0
            r2.A02 = r0
            r2.invalidateSelf()
            r4.setImageDrawable(r2)
        L_0x0069:
            r6.A08 = r3
            return
        L_0x006c:
            r4.setImageResource(r3)
            goto L_0x0069
        L_0x0070:
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r1)
            r1 = 2131889624(0x7f120dd8, float:1.9413917E38)
            if (r0 != 0) goto L_0x0034
        L_0x007b:
            r1 = 2131889629(0x7f120ddd, float:1.9413927E38)
            goto L_0x0034
        L_0x007f:
            int r0 = r2.indexOf(r7)
            int r1 = r0 + 1
            int r0 = r2.size()
            int r1 = r1 % r0
            java.lang.Object r1 = r2.get(r1)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WU.A03(java.lang.String):void");
    }

    public void A04(boolean z) {
        if (!z) {
            WaImageView waImageView = this.A0I;
            waImageView.startAnimation(this.A03);
            waImageView.setVisibility(8);
        }
        WaImageView waImageView2 = this.A0F;
        Animation animation = this.A03;
        waImageView2.startAnimation(animation);
        waImageView2.setVisibility(8);
        if (this.A05.A02) {
            WaImageView waImageView3 = this.A0G;
            waImageView3.startAnimation(animation);
            waImageView3.setVisibility(8);
        }
        WaImageView waImageView4 = this.A0E;
        waImageView4.startAnimation(animation);
        waImageView4.setVisibility(8);
        this.A0D.setVisibility(8);
    }

    public void A05(boolean z, int i) {
        View view = this.A0C;
        if (z) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                view.startAnimation(this.A02);
            }
            TextView textView = this.A0L;
            textView.setText(String.valueOf(i));
            Resources resources = textView.getResources();
            Object[] A0L2 = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L2, i, 0);
            textView.setContentDescription(resources.getQuantityString(R.plurals.f10nameremoved, i, A0L2));
        } else if (view.getVisibility() != 8) {
            view.setVisibility(8);
            view.startAnimation(this.A03);
        }
    }

    static {
        HashMap A0J2 = AnonymousClass001.A0J();
        A0O = A0J2;
        Integer valueOf = Integer.valueOf(R.string.f12nameremoved);
        A0J2.put("off", valueOf);
        A0J2.put("on", Integer.valueOf(R.string.f12nameremoved));
        A0J2.put("auto", Integer.valueOf(R.string.f12nameremoved));
        A0J2.put("torch", valueOf);
    }

    public AnonymousClass6WU(View view, C161087m8 r10, C121495tE r11) {
        int i = 0;
        this.A0A = view;
        this.A09 = view.getContext();
        this.A0B = C012005e.A02(view, R.id.fake_flash);
        WaImageView A0X = C36431kI.A0X(view, R.id.flash_btn);
        this.A0F = A0X;
        WaImageView A0X2 = C36431kI.A0X(view, R.id.switch_camera_btn);
        this.A0I = A0X2;
        this.A0H = C36431kI.A0X(view, R.id.shutter);
        WaImageView A0X3 = C36431kI.A0X(view, R.id.gallery_btn);
        this.A0G = A0X3;
        this.A0E = C36431kI.A0X(view, R.id.close_camera_btn);
        this.A0D = C36391kE.A0O(view, R.id.recording_hint);
        this.A0C = C012005e.A02(view, R.id.select_multiple);
        this.A0L = C36391kE.A0O(view, R.id.selected_count);
        this.A05 = r11;
        this.A0J = r10;
        boolean z = false;
        boolean A1T = C90474aD.A1T(r10.getNumberOfCameras(), 1);
        Boolean bool = C18750th.A01;
        z = A1T ? true : z;
        this.A0K = z;
        A0X2.setVisibility(C36351kA.A00(z ? 1 : 0));
        A0X.setVisibility(r10.getStoredFlashModeCount() <= 1 ? 8 : i);
        HashMap hashMap = A0N;
        Integer valueOf = Integer.valueOf(R.drawable.ic_flash_off);
        hashMap.put("off", valueOf);
        hashMap.put("on", Integer.valueOf(R.drawable.ic_flash_on));
        hashMap.put("auto", Integer.valueOf(R.drawable.ic_flash_auto));
        hashMap.put("torch", valueOf);
        this.A02 = new AlphaAnimation(0.0f, 1.0f);
        this.A03 = new AlphaAnimation(1.0f, 0.0f);
        this.A02.setDuration(200);
        this.A03.setDuration(200);
        C161087m8 r5 = this.A0J;
        this.A0I.setContentDescription(C36341k9.A0F(this.A0A).getString(r5.BLt() ? R.string.f12nameremoved : R.string.f12nameremoved));
        WaImageView waImageView = this.A0H;
        waImageView.setEnabled(false);
        this.A0I.setEnabled(false);
        this.A0F.setEnabled(false);
        A03(r5.getFlashMode());
        Context context = this.A09;
        C36391kE.A18(context, waImageView, R.drawable.shutter_button_background);
        this.A0D.setVisibility(8);
        C012005e.A0V(waImageView, new C89064Vc(this, 2));
        C36331k8.A0q(context, waImageView, this.A07 ? R.string.f12nameremoved : R.string.f12nameremoved);
        int dimensionPixelSize = this.A09.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0H.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        CircularProgressBar circularProgressBar = (CircularProgressBar) C012005e.A02(this.A0A, R.id.recording_progress);
        this.A04 = circularProgressBar;
        circularProgressBar.setMax(100);
        this.A04.setProgress(0);
        CircularProgressBar circularProgressBar2 = this.A04;
        circularProgressBar2.A05 = 0.1f;
        circularProgressBar2.A06 = 8.0f;
        WaImageView waImageView2 = this.A0I;
        Context context2 = this.A09;
        AnonymousClass3UF.A0B(context2, waImageView2, R.drawable.ic_flip_camera, R.color.f6nameremoved);
        this.A0E.setImageDrawable(C36381kD.A0H(context2, R.drawable.ic_close_camera));
        A0X3.setVisibility(r11.A00);
    }
}
