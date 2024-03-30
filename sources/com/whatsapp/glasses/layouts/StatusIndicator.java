package com.whatsapp.glasses.layouts;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass9QU;
import X.C05250Oz;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Map;

public final class StatusIndicator extends RelativeLayout {
    public int A00;
    public int A01;
    public Bitmap A02;
    public ImageView A03;
    public LinearLayout A04;
    public Map A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public GradientDrawable A0C;
    public View A0D;
    public final float A0E;
    public final int A0F;
    public final int A0G;
    public final View A0H;
    public final ImageView A0I;
    public final ImageView A0J;
    public final TextView A0K;
    public final TextView A0L;
    public final TextView A0M;
    public final String A0N;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StatusIndicator(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public static final void A01(StatusIndicator statusIndicator) {
        statusIndicator.A0I.setVisibility(8);
        statusIndicator.A0J.setVisibility(8);
        statusIndicator.A0K.setVisibility(8);
        statusIndicator.A0M.setVisibility(8);
        TextView textView = statusIndicator.A0L;
        if (!AnonymousClass00C.A0J(textView.getText(), statusIndicator.A0N)) {
            textView.setVisibility(8);
        }
    }

    private final void setStatusIndicatorCollapsedDimensions(boolean z) {
        int i;
        int i2;
        if (z) {
            i = this.A09;
            i2 = this.A07;
        } else {
            i = this.A0A;
            i2 = this.A08;
        }
        GradientDrawable gradientDrawable = this.A0C;
        if (gradientDrawable == null) {
            throw C36331k8.A0d("statusIndicatorCollapsedOutlineDrawable");
        }
        gradientDrawable.setSize(i, i);
        ImageView imageView = this.A03;
        if (imageView == null) {
            throw C36331k8.A0d("statusIndicatorCollapsedOutline");
        }
        imageView.setPadding(i2, i2, i2, i2);
    }

    private final void setStatusIndicatorCollapsedOutlineColor(int i) {
        GradientDrawable gradientDrawable = this.A0C;
        if (gradientDrawable == null) {
            throw C36331k8.A0d("statusIndicatorCollapsedOutlineDrawable");
        }
        gradientDrawable.setStroke(this.A0B, i);
    }

    public final void A02() {
        LinearLayout linearLayout = this.A04;
        linearLayout.measure(0, 0);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = linearLayout.getMeasuredHeight();
        layoutParams.width = linearLayout.getMeasuredWidth();
    }

    public final void A04(AnonymousClass9QU r4, boolean z) {
        ImageView imageView;
        int i;
        setVisibility(8);
        int intValue = r4.A01.intValue();
        if (intValue == 1) {
            setStatusIndicatorCollapsedOutlineColor(this.A0F);
            setStatusIndicatorCollapsedDimensions(z);
            imageView = this.A03;
            if (imageView == null) {
                throw C36331k8.A0d("statusIndicatorCollapsedOutline");
            }
        } else if (intValue != 2) {
            imageView = this.A03;
            if (imageView == null) {
                throw C36331k8.A0d("statusIndicatorCollapsedOutline");
            }
            i = 8;
            imageView.setVisibility(i);
        } else {
            setStatusIndicatorCollapsedOutlineColor(this.A06);
            setStatusIndicatorCollapsedDimensions(z);
            imageView = this.A03;
            if (imageView == null) {
                throw C36331k8.A0d("statusIndicatorCollapsedOutline");
            }
        }
        i = 0;
        imageView.setVisibility(i);
    }

    public final void setDoublePressPromptVisibility(boolean z) {
        int i;
        TextView textView = this.A0L;
        if (z) {
            textView.setText(R.string.f12nameremoved);
            i = 0;
        } else {
            C36391kE.A1K(textView);
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setParentView(View view) {
        this.A0D = view;
        if (view != null) {
            ImageView A0L2 = C36341k9.A0L(view, R.id.status_indicator_collapsed_outline);
            this.A03 = A0L2;
            if (A0L2 == null) {
                throw C36331k8.A0d("statusIndicatorCollapsedOutline");
            }
            Drawable drawable = A0L2.getDrawable();
            AnonymousClass00C.A0E(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            this.A0C = (GradientDrawable) drawable;
        }
    }

    private final void A00(Bitmap bitmap, ImageView imageView, Integer num) {
        imageView.setImageBitmap(bitmap);
        if (num != null) {
            imageView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            imageView.clearColorFilter();
        }
        imageView.setVisibility(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass9QU r5) {
        /*
            r4 = this;
            A01(r4)
            boolean r0 = r5 instanceof X.C169678Ag
            if (r0 == 0) goto L_0x0032
            android.widget.ImageView r2 = r4.A0I
            int r1 = r4.A06
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            r0 = 0
            r2.setVisibility(r0)
            android.widget.TextView r1 = r4.A0M
            r0 = 2131886100(0x7f120014, float:1.940677E38)
        L_0x0019:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x002e
            int r0 = r0.intValue()
            r1.setText(r0)
        L_0x0026:
            r0 = 0
            r1.setVisibility(r0)
        L_0x002a:
            r4.A02()
            return
        L_0x002e:
            X.C36391kE.A1K(r1)
            goto L_0x0026
        L_0x0032:
            boolean r0 = r5 instanceof X.C169688Ah
            if (r0 == 0) goto L_0x0055
            android.widget.ImageView r2 = r4.A0I
            int r1 = r4.A0F
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            r0 = 0
            r2.setVisibility(r0)
            android.widget.TextView r1 = r4.A0M
            r0 = 2131886102(0x7f120016, float:1.9406773E38)
            r1.setText(r0)
            r0 = 0
            r1.setVisibility(r0)
            android.widget.TextView r1 = r4.A0L
            r0 = 2131886099(0x7f120013, float:1.9406767E38)
            goto L_0x0019
        L_0x0055:
            boolean r0 = r5 instanceof X.C169708Aj
            if (r0 == 0) goto L_0x0073
            java.util.Map r1 = r4.A05
            if (r1 == 0) goto L_0x006d
            X.5Tk r0 = X.C108415Tk.SG_BATTERY_ZERO_ICON
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x006d
            android.widget.ImageView r1 = r4.A0J
            r0 = 0
            r4.A00(r2, r1, r0)
        L_0x006d:
            android.widget.TextView r1 = r4.A0M
            r0 = 2131886105(0x7f120019, float:1.940678E38)
            goto L_0x0019
        L_0x0073:
            boolean r0 = r5 instanceof X.C169618Aa
            if (r0 == 0) goto L_0x009f
            java.util.Map r1 = r4.A05
            if (r1 == 0) goto L_0x008d
            X.5Tk r0 = X.C108415Tk.SG_BATTERY_LOW_ICON
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x008d
            android.widget.ImageView r1 = r4.A0J
            r0 = 0
            r4.A00(r2, r1, r0)
            r4.A02 = r2
        L_0x008d:
            android.widget.TextView r2 = r4.A0M
            r0 = 2131886101(0x7f120015, float:1.9406771E38)
            r2.setText(r0)
            r1 = 0
            r2.setVisibility(r1)
            android.widget.TextView r0 = r4.A0K
            r0.setVisibility(r1)
            goto L_0x002a
        L_0x009f:
            boolean r0 = r5 instanceof X.C169718Ak
            if (r0 == 0) goto L_0x00da
            java.util.Map r1 = r4.A05
            if (r1 == 0) goto L_0x00b3
            X.5Tk r0 = X.C108415Tk.SG_BATTERY_MID_ICON
        L_0x00a9:
            java.lang.Object r0 = r1.get(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x00b3
            r4.A02 = r0
        L_0x00b3:
            android.widget.ImageView r3 = r4.A0I
            int r1 = r4.A0G
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r3.setColorFilter(r1, r0)
            android.widget.TextView r0 = r4.A0L
            java.lang.CharSequence r1 = r0.getText()
            java.lang.String r0 = r4.A0N
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x002a
            android.graphics.Bitmap r2 = r4.A02
            if (r2 == 0) goto L_0x00d4
            android.widget.ImageView r1 = r4.A0J
            r0 = 0
            r4.A00(r2, r1, r0)
        L_0x00d4:
            r0 = 0
            r3.setVisibility(r0)
            goto L_0x002a
        L_0x00da:
            boolean r0 = r5 instanceof X.C169748An
            if (r0 == 0) goto L_0x00e5
            java.util.Map r1 = r4.A05
            if (r1 == 0) goto L_0x00b3
            X.5Tk r0 = X.C108415Tk.SG_BATTERY_FULL_ICON
            goto L_0x00a9
        L_0x00e5:
            boolean r0 = r5 instanceof X.C169658Ae
            if (r0 == 0) goto L_0x0104
            java.util.Map r1 = r4.A05
            if (r1 == 0) goto L_0x00fd
            X.5Tk r0 = X.C108415Tk.SG_THERMAL_HIGH_ICON
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x00fd
            android.widget.ImageView r1 = r4.A0J
            r0 = 0
            r4.A00(r2, r1, r0)
        L_0x00fd:
            android.widget.TextView r1 = r4.A0M
            r0 = 2131886095(0x7f12000f, float:1.940676E38)
            goto L_0x0019
        L_0x0104:
            boolean r0 = r5 instanceof X.C169668Af
            if (r0 == 0) goto L_0x0123
            java.util.Map r1 = r4.A05
            if (r1 == 0) goto L_0x011c
            X.5Tk r0 = X.C108415Tk.SG_THERMAL_MID_ICON
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x011c
            android.widget.ImageView r1 = r4.A0J
            r0 = 0
            r4.A00(r2, r1, r0)
        L_0x011c:
            android.widget.TextView r1 = r4.A0M
            r0 = 2131886097(0x7f120011, float:1.9406763E38)
            goto L_0x0019
        L_0x0123:
            boolean r0 = r5 instanceof X.C98664rn
            if (r0 == 0) goto L_0x0147
            java.util.Map r1 = r4.A05
            if (r1 == 0) goto L_0x0140
            X.5Tk r0 = X.C108415Tk.SG_ERROR_ICON
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x0140
            android.widget.ImageView r1 = r4.A0J
            int r0 = r4.A0F
        L_0x0139:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A00(r2, r1, r0)
        L_0x0140:
            android.widget.TextView r1 = r4.A0M
            r0 = 2131886093(0x7f12000d, float:1.9406755E38)
            goto L_0x0019
        L_0x0147:
            boolean r0 = r5 instanceof X.C169648Ad
            if (r0 == 0) goto L_0x015e
            java.util.Map r1 = r4.A05
            if (r1 == 0) goto L_0x0140
            X.5Tk r0 = X.C108415Tk.SG_ERROR_ICON
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x0140
            android.widget.ImageView r1 = r4.A0J
            int r0 = r4.A06
            goto L_0x0139
        L_0x015e:
            boolean r0 = r5 instanceof X.C169698Ai
            if (r0 == 0) goto L_0x0182
            java.util.Map r1 = r4.A05
            if (r1 == 0) goto L_0x017b
            X.5Tk r0 = X.C108415Tk.SG_ERROR_ICON
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x017b
            android.widget.ImageView r1 = r4.A0J
            int r0 = r4.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A00(r2, r1, r0)
        L_0x017b:
            android.widget.TextView r1 = r4.A0M
            r0 = 2131886103(0x7f120017, float:1.9406775E38)
            goto L_0x0019
        L_0x0182:
            boolean r0 = r5 instanceof X.C169638Ac
            if (r0 == 0) goto L_0x00b3
            java.util.Map r1 = r4.A05
            if (r1 == 0) goto L_0x019f
            X.5Tk r0 = X.C108415Tk.SG_ERROR_ICON
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x019f
            android.widget.ImageView r1 = r4.A0J
            int r0 = r4.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A00(r2, r1, r0)
        L_0x019f:
            android.widget.TextView r1 = r4.A0M
            r0 = 2131886092(0x7f12000c, float:1.9406753E38)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.glasses.layouts.StatusIndicator.A03(X.9QU):void");
    }

    public final Map getImageBitmaps() {
        return this.A05;
    }

    public final View getParentView() {
        return this.A0D;
    }

    public final void setImageBitmaps(Map map) {
        this.A05 = map;
    }

    public /* synthetic */ StatusIndicator(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        AnonymousClass00C.A08(inflate);
        this.A0H = inflate;
        this.A04 = (LinearLayout) C36361kB.A0G(this, R.id.sup_toggle_status_indicator_information);
        this.A0M = C36341k9.A0M(this, R.id.status_text);
        this.A0L = C36341k9.A0M(this, R.id.status_additional_text);
        this.A0N = C36381kD.A0s(getResources(), R.string.f12nameremoved);
        this.A0B = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A09 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A07 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0A = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A08 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0E = C36441kJ.A00(inflate.getResources(), R.dimen.f7nameremoved);
        this.A0F = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A06 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A01 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A0G = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A00 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A0J = C36341k9.A0L(this, R.id.status_indicator_icon);
        this.A0I = C36341k9.A0L(this, R.id.bluetooth_icon);
        this.A0K = C36341k9.A0M(this, R.id.battery_percent_textview);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StatusIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
