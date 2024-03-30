package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.6LC  reason: invalid class name */
public final class AnonymousClass6LC {
    public FrameLayout A00;
    public final Context A01;
    public final Handler A02 = C36341k9.A0H();
    public final C114505hM A03;
    public final C56912xJ A04;
    public final C1271967i A05;

    public static final void A00(FrameLayout frameLayout, C114505hM r24, AnonymousClass6LC r25) {
        FrameLayout frameLayout2;
        int i;
        AnonymousClass6LC r2 = r25;
        FrameLayout frameLayout3 = r2.A00;
        if (frameLayout3 == null) {
            r2.A00 = new FrameLayout(r2.A01);
        } else if (!(frameLayout3.getParent() == null || (frameLayout2 = r2.A00) == null)) {
            ViewParent parent = frameLayout2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(frameLayout2);
            }
            frameLayout2.removeAllViews();
        }
        Context context = r2.A01;
        boolean A012 = AnonymousClass6GU.A01(context, r2.A05);
        ViewParent viewParent = null;
        C010804n A002 = C010804n.A00((Resources.Theme) null, context.getResources(), R.drawable.ic_error_outline_96_rev);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(A002);
        imageView.setPadding(0, 0, 0, (int) C109525Xx.A00(context, (float) 14));
        int i2 = -12166551;
        if (A012) {
            i2 = -3419431;
        }
        imageView.setColorFilter(i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        float f = (float) 16;
        linearLayout.setPadding((int) C109525Xx.A00(context, f), 0, (int) C109525Xx.A00(context, f), 0);
        linearLayout.addView(imageView, layoutParams);
        new C128466Cj("Header", "Optimistic Display App", 0.12f, 0.96f, 24);
        TextView textView = new TextView(context);
        textView.setText(C108815Va.__external__failed_loading_title);
        int i3 = -14931149;
        if (A012) {
            i3 = -1;
        }
        textView.setTextColor(i3);
        float f2 = (float) 24;
        textView.setTextSize(f2);
        textView.setLineSpacing(0.0f, 0.96f);
        textView.setLetterSpacing(0.12f / (f2 / AnonymousClass000.A0X(context).scaledDensity));
        textView.setTypeface(AnonymousClass6NR.A00().A03.A00(context, "Optimistic Display App"));
        textView.setMaxLines(3);
        textView.setPadding(0, 0, 0, (int) C109525Xx.A00(context, (float) 20));
        new C128466Cj("Text", "Optimistic Text App Regular", -0.02f, 1.04f, 15);
        TextView textView2 = new TextView(context);
        textView2.setText(C108815Va.__external__failed_loading_message);
        int i4 = -14931149;
        if (A012) {
            i4 = -1;
        }
        textView2.setTextColor(i4);
        float f3 = (float) 15;
        textView2.setTextSize(f3);
        textView2.setLineSpacing(0.0f, 1.04f);
        AnonymousClass6NR.A00();
        Typeface create = Typeface.create("Optimistic Text App Regular", 0);
        AnonymousClass00C.A08(create);
        textView.setTypeface(create);
        textView2.setLetterSpacing(-0.02f / (f3 / AnonymousClass000.A0X(context).scaledDensity));
        textView2.setTextSize(15.0f);
        textView2.setMaxLines(7);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        AnonymousClass69V r9 = new AnonymousClass69V(new C134596bI(-14931149, -14931149), 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C109525Xx.A00(context, (float) 22));
        gradientDrawable.setColor(-16751392);
        C134596bI r8 = r9.A01;
        if (A012) {
            i = r8.A00;
        } else {
            i = r8.A01;
        }
        gradientDrawable.setStroke(0, i);
        new C128466Cj("Text", "Optimistic Text App Medium", 0.3f, 1.05f, 16);
        Button button = new Button(context);
        button.setBackground(gradientDrawable);
        button.setText(C108815Va.__external__failed_loading_refresh);
        button.setTextSize(f);
        button.setTextColor(-1);
        button.setHeight((int) C109525Xx.A00(context, (float) 44));
        button.setLineSpacing(0.0f, 1.05f);
        button.setTypeface(AnonymousClass6NR.A00().A03.A00(context, "Optimistic Text App Medium"));
        button.setLetterSpacing(0.3f / (f / AnonymousClass000.A0X(context).scaledDensity));
        button.setPadding(20, 0, 20, 0);
        C36411kG.A1C(button, r24, r2, 0);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(80);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins((int) C109525Xx.A00(context, 20.0f), 0, (int) C109525Xx.A00(context, 20.0f), (int) C109525Xx.A00(context, 20.0f));
        layoutParams2.weight = 1.0f;
        linearLayout2.addView(button, layoutParams2);
        FrameLayout frameLayout4 = r2.A00;
        if (frameLayout4 != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(AnonymousClass5VY.company_layer_icons_close_outline_24);
            int i5 = -14931149;
            if (A012) {
                i5 = -1;
            }
            imageView2.setColorFilter(i5);
            C66923Xv.A01(imageView2, r2, 1);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) C109525Xx.A00(context, 24.0f), (int) C109525Xx.A00(context, 24.0f));
            layoutParams3.setMargins((int) C109525Xx.A00(context, 20.0f), (int) C109525Xx.A00(context, 30.0f), 0, 0);
            layoutParams3.gravity = 51;
            frameLayout4.addView(imageView2, layoutParams3);
        }
        FrameLayout frameLayout5 = r2.A00;
        if (frameLayout5 != null) {
            frameLayout5.addView(linearLayout);
        }
        FrameLayout frameLayout6 = r2.A00;
        if (frameLayout6 != null) {
            frameLayout6.addView(linearLayout2);
        }
        FrameLayout frameLayout7 = r2.A00;
        if (!(frameLayout7 == null || frameLayout7.getParent() == null)) {
            FrameLayout frameLayout8 = r2.A00;
            if (frameLayout8 != null) {
                viewParent = frameLayout8.getParent();
            }
            AnonymousClass00C.A0E(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) viewParent).removeView(r2.A00);
        }
        frameLayout.addView(r2.A00);
    }

    public AnonymousClass6LC(Context context, C114505hM r3, C56912xJ r4, C1271967i r5) {
        this.A01 = context;
        this.A05 = r5;
        this.A04 = r4;
        this.A03 = r3;
    }
}
