package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* renamed from: X.6LD  reason: invalid class name */
public final class AnonymousClass6LD {
    public FrameLayout A00;
    public final Context A01;
    public final Handler A02 = C36341k9.A0H();
    public final C56912xJ A03;
    public final C1271967i A04;
    public final boolean A05;

    public static final void A00(FrameLayout frameLayout, AnonymousClass6LD r20) {
        int i;
        AnonymousClass6LD r9 = r20;
        Context context = r9.A01;
        boolean A012 = AnonymousClass6GU.A01(context, r9.A04);
        Interpolator interpolator = C91324bp.A09;
        int i2 = -16751392;
        if (A012) {
            i2 = -12081670;
        }
        C91324bp r2 = new C91324bp(context, i2, (int) C109525Xx.A00(context, (float) 32));
        C92964fF r4 = new C92964fF(context);
        C91324bp r0 = null;
        if (r2 instanceof Animatable) {
            r0 = r2;
        }
        r4.A00 = r0;
        r4.setImageDrawable(r2);
        FrameLayout frameLayout2 = r9.A00;
        if (frameLayout2 == null) {
            frameLayout2 = new FrameLayout(context);
            r9.A00 = frameLayout2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (!r9.A05) {
            C134596bI r7 = new AnonymousClass69V(new C134596bI(-3419431, -12166551), 1).A01;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C109525Xx.A00(context, (float) 22));
            if (A012) {
                i = r7.A00;
            } else {
                i = r7.A01;
            }
            gradientDrawable.setStroke(1, i);
            gradientDrawable.setColor(16777215);
            new C128466Cj("Text", "Optimistic Text App Medium", 0.3f, 1.05f, 16);
            Button button = new Button(context);
            button.setBackgroundDrawable(gradientDrawable);
            button.setText(C108815Va.dialog_cancel);
            float f = (float) 16;
            button.setTextSize(f);
            int i3 = -14931149;
            if (A012) {
                i3 = -1;
            }
            button.setTextColor(i3);
            button.setHeight((int) C109525Xx.A00(context, (float) 44));
            button.setLineSpacing(0.0f, 1.05f);
            button.setTypeface(AnonymousClass6NR.A00().A03.A00(context, "Optimistic Text App Medium"));
            button.setLetterSpacing(0.3f / (f / AnonymousClass000.A0X(context).scaledDensity));
            C66923Xv.A01(button, r9, 2);
            button.setAlpha(0.0f);
            AnonymousClass0V7 A07 = C012005e.A07(button);
            View A0Y = AnonymousClass000.A0Y(A07.A00);
            if (A0Y != null) {
                A0Y.animate().setStartDelay(3000);
            }
            A07.A02(1.0f);
            A07.A07(200);
            A07.A08(new LinearInterpolator());
            A07.A01();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setGravity(80);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins((int) C109525Xx.A00(context, 20.0f), 0, (int) C109525Xx.A00(context, 20.0f), (int) C109525Xx.A00(context, 20.0f));
            layoutParams2.weight = 1.0f;
            linearLayout.addView(button, layoutParams2);
            frameLayout2.addView(linearLayout);
        }
        frameLayout2.addView(r4, layoutParams);
        frameLayout.addView(frameLayout2);
        Animatable animatable = r4.A00;
        if (animatable != null) {
            animatable.start();
        }
        r4.A01 = true;
    }

    public AnonymousClass6LD(Context context, C56912xJ r3, C1271967i r4, boolean z) {
        this.A01 = context;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = z;
    }
}
