package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8Xh  reason: invalid class name and case insensitive filesystem */
public class C174508Xh extends C141646na {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Resources A03;
    public final View A04;
    public final ViewGroup.LayoutParams A05;
    public final ViewGroup.LayoutParams A06;
    public final ViewGroup.LayoutParams A07;
    public final TextView A08;
    public final TextEmojiLabel A09;
    public final AZ4 A0A;
    public final AZ4 A0B;
    public final AZ4 A0C;
    public final AZ4 A0D;
    public final AZ4 A0E;
    public final AZ4 A0F;
    public final AZ4 A0G;
    public final AZ4 A0H;
    public final AZ4 A0I;
    public final AZ4 A0J;
    public final AZ4 A0K;
    public final AZ4 A0L;
    public final AZ4 A0M;
    public final AZ4 A0N;

    public void A09(AppBarLayout appBarLayout, float f, int i, int i2) {
        if (i2 == 1) {
            A00(this.A04, this.A05, this.A0F);
            TextEmojiLabel textEmojiLabel = this.A09;
            A00(textEmojiLabel, this.A07, this.A0H);
            textEmojiLabel.setTextSize(0, this.A01);
            AnonymousClass088.A03(textEmojiLabel, 0);
            TextView textView = this.A08;
            A00(textView, this.A06, this.A0G);
            AnonymousClass088.A03(textView, 0);
            textView.setTextSize(0, this.A00);
            return;
        }
        A02(this, f, i);
    }

    public void A0B(AppBarLayout appBarLayout, int i) {
    }

    public C174508Xh(View view, View view2, TextView textView, TextEmojiLabel textEmojiLabel, C18820ts r26) {
        View view3 = view2;
        Resources resources = view3.getResources();
        this.A03 = resources;
        this.A04 = view3;
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        this.A09 = textEmojiLabel2;
        TextView textView2 = textView;
        this.A08 = textView2;
        this.A07 = textEmojiLabel2.getLayoutParams();
        this.A01 = textEmojiLabel2.getTextSize();
        this.A06 = textView2.getLayoutParams();
        this.A05 = view3.getLayoutParams();
        this.A00 = textView2.getTextSize();
        this.A02 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0F = new AZ4((Object) null, new C165307tD(view3, 6));
        this.A0H = new AZ4((Object) null, new C165307tD(textEmojiLabel2, 6));
        this.A0G = new AZ4((Object) null, new C165307tD(textView2, 6));
        AZ4 A012 = AZ4.A01(this, 20);
        this.A0B = A012;
        AZ4 A013 = AZ4.A01(this, 21);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        View view4 = view;
        AZ4 A022 = AZ4.A02(new AZ4((Object) null, new BAR(view4, dimensionPixelSize, 2)), view3, 5);
        this.A0C = A022;
        this.A0A = AZ4.A02(A022, view3, 6);
        C18820ts r14 = r26;
        this.A0D = new AZ4((Object) null, new BAQ(view3, view4, this, r14, 1));
        this.A0E = new AZ4((Object) null, new BAR(view3, dimensionPixelSize, 0));
        AZ4 A023 = AZ4.A02(A012, textEmojiLabel2, 5);
        this.A0L = A023;
        this.A0N = new AZ4((Object) null, new BAR(textEmojiLabel2, dimensionPixelSize));
        AZ4 A024 = AZ4.A02(A023, textEmojiLabel2, 6);
        AZ4 A025 = AZ4.A02(A013, textView2, 5);
        this.A0I = A025;
        AZ4 A026 = AZ4.A02(A025, textView2, 6);
        this.A0M = new AZ4((Object) null, new AZ1(view4, textEmojiLabel2, this, r14, A024));
        this.A0J = new AZ4((Object) null, new AZ1(view4, textView2, this, r14, A026));
        this.A0K = new AZ4((Object) null, new AZ0(textView2, this, dimensionPixelSize));
    }

    public static void A00(View view, ViewGroup.LayoutParams layoutParams, AZ4 az4) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
        view.setLayoutParams(layoutParams);
        view.setX((float) ((Rect) az4.get()).left);
        view.setY((float) ((Rect) az4.get()).top);
    }

    public static void A02(C174508Xh r6, float f, int i) {
        float f2 = f;
        int i2 = i;
        A01(r6.A04, r6.A0D, r6.A0E, r6.A0C, f2, i2);
        A01(r6.A09, r6.A0M, r6.A0N, r6.A0L, f2, i2);
        A01(r6.A08, r6.A0J, r6.A0K, r6.A0I, f2, i2);
    }

    public void A0A(AppBarLayout appBarLayout, float f, int i, int i2) {
        View view = this.A04;
        C165577te.A0z(view, (float) view.getWidth());
        TextEmojiLabel textEmojiLabel = this.A09;
        C165577te.A0z(textEmojiLabel, (float) textEmojiLabel.getWidth());
        TextView textView = this.A08;
        C165577te.A0z(textView, (float) textView.getWidth());
    }

    public static void A01(View view, AZ4 az4, AZ4 az42, AZ4 az43, float f, int i) {
        float A002 = 1.0f - (AZ4.A00(az43) * f);
        view.setScaleX(A002);
        view.setScaleY(A002);
        float A003 = ((float) (-i)) + (AZ4.A00(az42) * f);
        float f2 = 1.0f - A002;
        view.setTranslationX((AZ4.A00(az4) * f) - ((((float) view.getWidth()) / 2.0f) * f2));
        view.setTranslationY(A003 - ((((float) view.getHeight()) / 2.0f) * f2));
    }

    public void A08(AppBarLayout appBarLayout, float f, int i) {
        A02(this, f, i);
    }
}
