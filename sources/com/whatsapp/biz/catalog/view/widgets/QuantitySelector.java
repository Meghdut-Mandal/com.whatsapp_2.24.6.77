package com.whatsapp.biz.catalog.view.widgets;

import X.AnonymousClass088;
import X.AnonymousClass1QZ;
import X.AnonymousClass2x6;
import X.AnonymousClass3DZ;
import X.C012005e;
import X.C023109s;
import X.C111545cS;
import X.C157997fd;
import X.C158007fe;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C20810yC;
import X.C21060yb;
import X.C224514j;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36421kH;
import X.C36441kJ;
import X.C90504aG;
import X.C92264dP;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;

public class QuantitySelector extends FrameLayout implements C18700tb {
    public long A00;
    public long A01;
    public ValueAnimator A02;
    public C157997fd A03;
    public C158007fe A04;
    public AnonymousClass3DZ A05;
    public C21060yb A06;
    public C18820ts A07;
    public C20810yC A08;
    public AnonymousClass1QZ A09;
    public Integer A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Handler A0E;
    public final TextView A0F;
    public final WaImageButton A0G;
    public final WaImageButton A0H;

    public void setLimit(int i) {
        this.A00 = (long) i;
    }

    public static void A00(QuantitySelector quantitySelector) {
        int measuredWidth = quantitySelector.A0G.getMeasuredWidth();
        int measuredWidth2 = (measuredWidth * 2) + quantitySelector.A0F.getMeasuredWidth();
        int[] A1O = C36441kJ.A1O();
        A1O[0] = measuredWidth;
        A1O[1] = measuredWidth2;
        ValueAnimator ofInt = ValueAnimator.ofInt(A1O);
        quantitySelector.A02 = ofInt;
        ofInt.addUpdateListener(new C111545cS(quantitySelector, measuredWidth, measuredWidth2, 1));
        C36391kE.A13(quantitySelector.A02);
        quantitySelector.A02.setDuration(250);
        quantitySelector.A02.start();
    }

    public static void A01(QuantitySelector quantitySelector) {
        quantitySelector.A0A = C023109s.A00;
        WaImageButton waImageButton = quantitySelector.A0G;
        waImageButton.setImageResource(0);
        waImageButton.setBackgroundResource(R.drawable.btn_default);
        C36421kH.A10(waImageButton, quantitySelector, 46);
        TextView textView = quantitySelector.A0F;
        C36331k8.A0r(textView.getContext(), textView, R.color.f6nameremoved);
        A03(quantitySelector);
    }

    public static void A02(QuantitySelector quantitySelector) {
        quantitySelector.A0A = C023109s.A01;
        A03(quantitySelector);
        TextView textView = quantitySelector.A0F;
        C36351kA.A15(quantitySelector.getResources(), textView, C224514j.A00(textView.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        WaImageButton waImageButton = quantitySelector.A0G;
        waImageButton.setImageResource(R.drawable.vec_ic_add_control_wds_v2);
        waImageButton.setBackgroundResource(R.drawable.quantity_button_selector);
        C36421kH.A10(waImageButton, quantitySelector, 47);
        C36421kH.A10(quantitySelector.A0H, quantitySelector, 48);
    }

    public static void A03(QuantitySelector quantitySelector) {
        TextView textView = quantitySelector.A0F;
        textView.setClickable(false);
        if (quantitySelector.A01 > 0) {
            textView.setText(quantitySelector.A07.A0M().format(quantitySelector.A01));
            if (quantitySelector.A0A == C023109s.A01) {
                textView.setClickable(true);
                return;
            }
            return;
        }
        C36391kE.A1K(textView);
    }

    public void A04(long j, long j2) {
        long j3 = this.A01;
        this.A00 = j2;
        this.A01 = j;
        if (this.A0C) {
            if (this.A0A == C023109s.A00 || j3 == 0) {
                if (j > 0) {
                    A01(this);
                    return;
                }
            } else if (this.A0B) {
                return;
            }
        }
        A02(this);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A09;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C92264dP r5 = (C92264dP) parcelable;
        super.onRestoreInstanceState(r5.getSuperState());
        this.A0C = r5.A02;
        this.A0A = C023109s.A00;
        A04(r5.A01, r5.A00);
    }

    public void setCollapsible(boolean z) {
        this.A0C = z;
        if (z && C90504aG.A1V(this.A06)) {
            this.A0C = false;
        }
    }

    public void setQuantity(long j) {
        A04(j, this.A00);
    }

    /* JADX INFO: finally extract failed */
    public QuantitySelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0D) {
            this.A0D = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A07 = C36341k9.A0T(A0W);
            this.A06 = C36351kA.A0U(A0W);
            this.A08 = C36341k9.A0V(A0W);
        }
        this.A0E = C36341k9.A0H();
        this.A0B = false;
        this.A0A = C023109s.A00;
        View inflate = View.inflate(getContext(), R.layout.f9nameremoved, this);
        this.A0F = C36391kE.A0O(inflate, R.id.quantity_count);
        this.A0H = (WaImageButton) C012005e.A02(inflate, R.id.minus_button);
        this.A0G = (WaImageButton) C012005e.A02(inflate, R.id.plus_button);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass2x6.A07, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                AnonymousClass088.A06(this.A0F, resourceId);
            }
            setCollapsible(obtainStyledAttributes.getBoolean(1, false));
            obtainStyledAttributes.recycle();
            A04(0, 99);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public long getQuantity() {
        return this.A01;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int left;
        int top;
        int left2;
        int left3;
        super.onLayout(z, i, i2, i3, i4);
        WaImageButton waImageButton = this.A0G;
        int measuredWidth = waImageButton.getMeasuredWidth();
        TextView textView = this.A0F;
        int measuredWidth2 = (measuredWidth - textView.getMeasuredWidth()) / 2;
        if (C36351kA.A1Y(this.A07)) {
            int left4 = waImageButton.getLeft();
            WaImageButton waImageButton2 = this.A0H;
            if (left4 >= waImageButton2.getMeasuredWidth() - measuredWidth2) {
                left = waImageButton2.getRight();
                top = textView.getTop();
                left2 = waImageButton2.getRight();
            }
            left = waImageButton.getLeft() + measuredWidth2;
            top = textView.getTop();
            left2 = waImageButton.getLeft() + measuredWidth2;
        } else {
            WaImageButton waImageButton3 = this.A0H;
            if (waImageButton3.getLeft() >= waImageButton3.getMeasuredWidth() - measuredWidth2) {
                left = waImageButton3.getLeft() - textView.getMeasuredWidth();
                top = textView.getTop();
                left3 = waImageButton3.getLeft();
                textView.layout(left, top, left3, textView.getBottom());
            }
            left = waImageButton.getLeft() + measuredWidth2;
            top = textView.getTop();
            left2 = waImageButton.getLeft() + measuredWidth2;
        }
        left3 = left2 + textView.getMeasuredWidth();
        textView.layout(left, top, left3, textView.getBottom());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        if (r8.A01 != 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        if (r3 != X.C023109s.A00) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        setMeasuredDimension(r6, getMeasuredHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004b, code lost:
        if (r3 == r0) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            com.whatsapp.WaImageButton r3 = r8.A0G
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            int r0 = r8.getMeasuredHeight()
            r1.width = r0
            r3.setLayoutParams(r1)
            com.whatsapp.WaImageButton r2 = r8.A0H
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = r8.getMeasuredHeight()
            r1.width = r0
            r2.setLayoutParams(r1)
            super.onMeasure(r9, r10)
            int r6 = r3.getMeasuredWidth()
            int r7 = r6 * 2
            android.widget.TextView r0 = r8.A0F
            int r0 = r0.getMeasuredWidth()
            int r7 = r7 + r0
            boolean r0 = r8.A0B
            r4 = 0
            if (r0 != 0) goto L_0x005f
            java.lang.Integer r3 = r8.A0A
            java.lang.Integer r0 = X.C023109s.A01
            if (r3 != r0) goto L_0x004b
            long r1 = r8.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x004d
            int r0 = r8.getMeasuredHeight()
            r8.setMeasuredDimension(r7, r0)
            return
        L_0x004b:
            if (r3 != r0) goto L_0x0053
        L_0x004d:
            long r1 = r8.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0057
        L_0x0053:
            java.lang.Integer r0 = X.C023109s.A00
            if (r3 != r0) goto L_0x005f
        L_0x0057:
            int r0 = r8.getMeasuredHeight()
            r8.setMeasuredDimension(r6, r0)
            return
        L_0x005f:
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.view.widgets.QuantitySelector.onMeasure(int, int):void");
    }

    public Parcelable onSaveInstanceState() {
        C92264dP r2 = new C92264dP(super.onSaveInstanceState());
        r2.A01 = this.A01;
        r2.A00 = this.A00;
        r2.A02 = this.A0C;
        return r2;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A0F.setEnabled(z);
        this.A0G.setEnabled(z);
        this.A0H.setEnabled(z);
    }

    public void setOnLimitReachedListener(C157997fd r1) {
        this.A03 = r1;
    }

    public void setOnQuantityChanged(C158007fe r1) {
        this.A04 = r1;
    }

    public QuantitySelector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QuantitySelector(Context context) {
        this(context, (AttributeSet) null);
    }
}
