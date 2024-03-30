package X;

import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import com.whatsapp.WaImageView;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;

/* renamed from: X.6OU  reason: invalid class name */
public class AnonymousClass6OU {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03 = false;
    public int A04 = 0;
    public final int A05;
    public final int A06;
    public final int A07;
    public final C117435mG A08;
    public final C1265564m A09;
    public final AnonymousClass65u A0A;
    public final AnonymousClass622 A0B;

    public static void A00(AnonymousClass6OU r6, boolean z) {
        Interpolator r0;
        AnonymousClass65u r1 = r6.A0A;
        boolean A1a = C36401kF.A1a(r6.A0B.A01.A03.A00);
        C90694aZ r4 = r1.A00;
        WaImageView waImageView = r4.A05;
        if (waImageView == null) {
            throw C36331k8.A0d("undoButton");
        }
        int i = 4;
        boolean z2 = true;
        boolean A1S = AnonymousClass000.A1S(waImageView.getVisibility(), 4);
        WaImageView waImageView2 = r4.A05;
        if (waImageView2 == null) {
            throw C36331k8.A0d("undoButton");
        }
        if (waImageView2.getVisibility() != 0) {
            z2 = false;
        }
        if (!A1a) {
            if (A1S) {
                return;
            }
        } else if (z2) {
            return;
        }
        WaImageView waImageView3 = r4.A05;
        if (waImageView3 == null) {
            throw C36331k8.A0d("undoButton");
        }
        if (A1a) {
            i = 0;
        }
        waImageView3.setVisibility(i);
        if (z) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(A1a ^ true ? 1.0f : 0.0f, A1a ? 1.0f : 0.0f);
            if (A1a) {
                r0 = new AnonymousClass02K();
            } else {
                r0 = new AnonymousClass066();
            }
            alphaAnimation.setInterpolator(r0);
            alphaAnimation.setDuration(100);
            WaImageView waImageView4 = r4.A05;
            if (waImageView4 == null) {
                throw C36331k8.A0d("undoButton");
            }
            waImageView4.startAnimation(alphaAnimation);
        }
    }

    public void A01(int i, int i2) {
        int i3;
        this.A00 = i2;
        this.A0A.A01(i2);
        if (this.A01 != i || this.A03) {
            if (this.A03) {
                i3 = this.A04;
            } else {
                i3 = 0;
            }
            A02(i3, i);
        }
    }

    public void A02(int i, int i2) {
        if (!this.A02) {
            AnonymousClass65u r2 = this.A0A;
            r2.A00(i);
            this.A04 = i;
            this.A01 = i2;
            ColorPickerComponent colorPickerComponent = r2.A00.A06;
            if (colorPickerComponent == null) {
                throw C36331k8.A0d("colorPicker");
            }
            colorPickerComponent.setSizeAndInvalidate((float) i2);
            if (this.A03) {
                r2.A01(this.A00);
                this.A03 = false;
            }
        }
    }

    public AnonymousClass6OU(C117435mG r2, C1265564m r3, AnonymousClass65u r4, AnonymousClass622 r5, int i, int i2, int i3) {
        this.A05 = i;
        this.A07 = i2;
        this.A06 = i3;
        this.A09 = r3;
        this.A0B = r5;
        this.A08 = r2;
        this.A0A = r4;
        r3.A02 = true;
        r3.A00 = new C146696w1(this);
    }
}
