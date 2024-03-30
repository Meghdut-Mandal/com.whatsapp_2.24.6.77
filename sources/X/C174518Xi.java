package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8Xi  reason: invalid class name and case insensitive filesystem */
public class C174518Xi extends C141646na {
    public final float A00;
    public final float A01;
    public final Resources A02;
    public final View A03;
    public final ViewGroup.LayoutParams A04;
    public final ViewGroup.MarginLayoutParams A05;
    public final TextView A06;
    public final C001700s A07 = C36431kI.A0S();
    public final TextEmojiLabel A08;
    public final AZ4 A09;
    public final AZ4 A0A;
    public final AZ4 A0B;
    public final AZ4 A0C;
    public final AZ4 A0D;
    public final AZ4 A0E;
    public final AZ4 A0F;
    public final View A0G;
    public final TextView A0H;
    public final TextEmojiLabel A0I;
    public final C18820ts A0J;
    public final AZ4 A0K;
    public final AZ4 A0L;
    public final AZ4 A0M;
    public final AZ4 A0N;
    public final AZ4 A0O;
    public final AZ4 A0P;
    public final AZ4 A0Q;
    public final AZ4 A0R;

    public C174518Xi(View view, View view2, TextView textView, TextView textView2, TextEmojiLabel textEmojiLabel, TextEmojiLabel textEmojiLabel2, C18820ts r19) {
        C18820ts r10 = r19;
        this.A0J = r10;
        this.A0G = (View) view2.getParent();
        this.A02 = view2.getResources();
        this.A03 = view2;
        TextEmojiLabel textEmojiLabel3 = textEmojiLabel;
        this.A08 = textEmojiLabel3;
        this.A0I = textEmojiLabel2;
        this.A06 = textView;
        this.A0H = textView2;
        this.A05 = AnonymousClass000.A0a(textEmojiLabel3);
        this.A01 = textEmojiLabel3.getTextSize();
        this.A04 = textView.getLayoutParams();
        this.A00 = textView.getTextSize();
        this.A09 = new AZ4((Object) null, new BAU(view, this, 3));
        this.A0D = AZ4.A02(view2, this, 4);
        this.A0A = AZ4.A02(view2, this, 1);
        this.A0M = new AZ4((Object) null, new BAQ(view2, view, this, r10, 0));
        this.A0N = AZ4.A02(view2, this, 2);
        this.A0F = new AZ4((Object) null, new C165307tD(textEmojiLabel3, 5));
        this.A0C = AZ4.A01(this, 17);
        this.A0L = new AZ4((Object) null, new BAT(view, this, r10, 1));
        this.A0Q = AZ4.A01(this, 18);
        this.A0R = AZ4.A01(this, 19);
        this.A0E = new AZ4((Object) null, new C165307tD(textView, 4));
        this.A0B = AZ4.A01(this, 14);
        this.A0K = new AZ4((Object) null, new BAT(view, this, r10, 0));
        this.A0O = AZ4.A01(this, 15);
        this.A0P = AZ4.A01(this, 16);
    }

    public void A09(AppBarLayout appBarLayout, float f, int i, int i2) {
        if (i2 == 1) {
            View view = this.A03;
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            TextEmojiLabel textEmojiLabel = this.A08;
            textEmojiLabel.setScaleX(1.0f);
            textEmojiLabel.setScaleY(1.0f);
            textEmojiLabel.setTranslationY(0.0f);
            textEmojiLabel.setAlpha(1.0f);
            textEmojiLabel.setMaxLines(3);
            textEmojiLabel.setTextSize(0, this.A01);
            textEmojiLabel.A0I(textEmojiLabel.getText());
            textEmojiLabel.setLayoutParams(this.A05);
            textEmojiLabel.setGravity(1);
            TextView textView = this.A06;
            textView.setScaleX(1.0f);
            textView.setScaleY(1.0f);
            textView.setTranslationY(0.0f);
            textView.setAlpha(1.0f);
            textView.setMaxLines(3);
            AnonymousClass088.A03(textView, 0);
            textView.setLayoutParams(this.A04);
            textView.setTextSize(0, this.A00);
            textView.setGravity(1);
        } else {
            A01(i, f);
            A07(appBarLayout, f, i);
            A06(appBarLayout, f, i);
        }
        this.A07.A0D(new AnonymousClass36D(2, f, i2));
    }

    private ViewGroup.MarginLayoutParams A00(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.A05;
        if (marginLayoutParams instanceof RelativeLayout.LayoutParams) {
            return new RelativeLayout.LayoutParams(i, i2);
        }
        if (marginLayoutParams instanceof C03400El) {
            return new C03400El(i, i2);
        }
        if (marginLayoutParams instanceof LinearLayout.LayoutParams) {
            return new LinearLayout.LayoutParams(i, i2);
        }
        if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
            return new FrameLayout.LayoutParams(i, i2);
        }
        throw AnonymousClass001.A09("Title view parent is of an unsupported type. Provide a custom LayoutParams factory.");
    }

    private void A01(int i, float f) {
        A03(this.A03, 0.0f, 0.0f, AZ4.A00(this.A0M) * f, ((float) (-i)) + (AZ4.A00(this.A0N) * f), 1.0f - (AZ4.A00(this.A0D) * f));
    }

    private void A02(Rect rect, ViewGroup.MarginLayoutParams marginLayoutParams, AppBarLayout appBarLayout) {
        if (C36351kA.A1Y(this.A0J)) {
            marginLayoutParams.leftMargin = rect.left;
        } else {
            marginLayoutParams.rightMargin = appBarLayout.getWidth() - rect.right;
        }
        marginLayoutParams.topMargin = rect.top;
    }

    private void A04(AppBarLayout appBarLayout) {
        Rect rect = (Rect) this.A0K.get();
        ViewGroup.MarginLayoutParams A002 = A00(rect.width(), rect.height());
        A02(rect, A002, appBarLayout);
        TextView textView = this.A0H;
        if (textView.getWidth() != rect.width()) {
            textView.setLayoutParams(A002);
        }
    }

    private void A05(AppBarLayout appBarLayout) {
        Rect rect = (Rect) this.A0L.get();
        ViewGroup.MarginLayoutParams A002 = A00(rect.width(), rect.height());
        A02(rect, A002, appBarLayout);
        TextEmojiLabel textEmojiLabel = this.A0I;
        if (textEmojiLabel.getWidth() != rect.width()) {
            textEmojiLabel.setLayoutParams(A002);
        }
    }

    private void A06(AppBarLayout appBarLayout, float f, int i) {
        int i2 = i;
        if (((double) f) < 0.5d) {
            this.A0H.setVisibility(8);
            float A002 = 1.0f - (AZ4.A00(this.A0O) * f);
            TextView textView = this.A06;
            A03(textView, ((float) textView.getWidth()) / 2.0f, ((float) textView.getHeight()) / 2.0f, 0.0f, ((float) (-i2)) + (AZ4.A00(this.A0P) * f), A002);
            textView.setAlpha(1.0f - (f * 2.0f));
            return;
        }
        TextView textView2 = this.A0H;
        textView2.setVisibility(0);
        TextView textView3 = this.A06;
        textView3.setAlpha(0.0f);
        A04(appBarLayout);
        C18820ts r5 = this.A0J;
        int i3 = 51;
        if (C36401kF.A1X(r5)) {
            i3 = 53;
        }
        textView2.setGravity(i3);
        int i4 = -1;
        if (C36401kF.A1X(r5)) {
            i4 = 1;
        }
        float f2 = (f - 0.5f) * 2.0f;
        textView2.setTranslationX((((float) (i4 * textView3.getLeft())) / 4.0f) * (1.0f - f2));
        textView2.setTranslationY((float) (-i2));
        textView2.setAlpha(f2);
    }

    private void A07(AppBarLayout appBarLayout, float f, int i) {
        int i2 = i;
        if (((double) f) < 0.5d) {
            this.A0I.setVisibility(8);
            float A002 = 1.0f - (AZ4.A00(this.A0Q) * f);
            TextEmojiLabel textEmojiLabel = this.A08;
            A03(textEmojiLabel, ((float) textEmojiLabel.getWidth()) / 2.0f, ((float) textEmojiLabel.getHeight()) / 2.0f, 0.0f, ((float) (-i2)) + (AZ4.A00(this.A0R) * f), A002);
            textEmojiLabel.setAlpha(1.0f - (f * 2.0f));
            return;
        }
        TextEmojiLabel textEmojiLabel2 = this.A0I;
        textEmojiLabel2.setVisibility(0);
        this.A08.setAlpha(0.0f);
        A05(appBarLayout);
        C18820ts r5 = this.A0J;
        int i3 = 51;
        if (C36401kF.A1X(r5)) {
            i3 = 53;
        }
        textEmojiLabel2.setGravity(i3);
        int i4 = -1;
        if (C36401kF.A1X(r5)) {
            i4 = 1;
        }
        float f2 = (f - 0.5f) * 2.0f;
        textEmojiLabel2.setTranslationX((((float) (i4 * textEmojiLabel2.getLeft())) / 4.0f) * (1.0f - f2));
        textEmojiLabel2.setTranslationY((float) (-i2));
        textEmojiLabel2.setAlpha(f2);
    }

    public void A0A(AppBarLayout appBarLayout, float f, int i, int i2) {
        View view = this.A03;
        C165577te.A0z(view, (float) view.getWidth());
        TextEmojiLabel textEmojiLabel = this.A08;
        C165577te.A0z(textEmojiLabel, (float) textEmojiLabel.getWidth());
        TextView textView = this.A06;
        C165577te.A0z(textView, (float) textView.getWidth());
        this.A07.A0D(new AnonymousClass36D(0, f, i2));
    }

    public void A0B(AppBarLayout appBarLayout, int i) {
        View view = this.A0G;
        int height = view.getHeight();
        this.A0L.A00 = null;
        this.A0K.A00 = null;
        if (view.getLayoutParams().height != height) {
            view.getLayoutParams().height = height;
        }
        if (i == 2) {
            this.A0F.get();
            this.A0E.get();
            A05(appBarLayout);
            A04(appBarLayout);
        }
    }

    public static void A03(View view, float f, float f2, float f3, float f4, float f5) {
        view.setScaleX(f5);
        view.setScaleY(f5);
        float f6 = 1.0f - f5;
        view.setTranslationX(f3 - (((((float) view.getWidth()) / 2.0f) - f) * f6));
        view.setTranslationY(f4 - (((((float) view.getHeight()) / 2.0f) - f2) * f6));
    }

    public void A08(AppBarLayout appBarLayout, float f, int i) {
        A01(i, f);
        A07(appBarLayout, f, i);
        A06(appBarLayout, f, i);
        this.A07.A0D(new AnonymousClass36D(1, f, 1));
    }
}
