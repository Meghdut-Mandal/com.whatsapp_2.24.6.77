package com.whatsapp.payments.ui.widget;

import X.AnonymousClass000;
import X.AnonymousClass16U;
import X.AnonymousClass16V;
import X.AnonymousClass17Y;
import X.AnonymousClass2Z9;
import X.AnonymousClass3LT;
import X.AnonymousClass6US;
import X.AnonymousClass6Yh;
import X.C110505am;
import X.C114025gW;
import X.C1497372o;
import X.C157457cz;
import X.C160147kX;
import X.C162337oQ;
import X.C162647ov;
import X.C18800tq;
import X.C18820ts;
import X.C33511fU;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36441kJ;
import X.C90484aE;
import X.C90514aH;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import com.whatsapp.R;
import java.math.BigDecimal;
import java.util.HashSet;

public class PaymentAmountInputField extends AnonymousClass2Z9 {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public View A04;
    public Animation A05;
    public TextView A06;
    public AnonymousClass17Y A07;
    public C18820ts A08;
    public C18820ts A09;
    public AnonymousClass16U A0A;
    public C160147kX A0B;
    public C157457cz A0C;
    public boolean A0D;
    public boolean A0E;
    public int A0F;
    public ValueAnimator A0G;
    public ValueAnimator A0H;
    public TextPaint A0I;
    public String A0J;
    public BigDecimal A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final Runnable A0O;

    private void A05(AttributeSet attributeSet) {
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C114025gW.A02);
            boolean z2 = obtainStyledAttributes.getBoolean(0, false);
            this.A0D = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
            z = z2;
        } else {
            this.A0D = false;
        }
        this.A09 = this.A08;
        this.A0J = C36361kB.A0n(this);
        this.A02 = -1;
        this.A0F = C36341k9.A04(getContext());
        setInputType(2);
        A04();
        setFilterTouchesWhenObscured(true);
        setCursorVisible(true);
        setFocusable(true);
        setSingleLine(true);
        addTextChangedListener(this);
        setAutoScaleTextSize(z);
        this.A0E = true;
    }

    private void A04() {
        String str = "0123456789";
        if (this.A0L) {
            str = AnonymousClass000.A0t(AnonymousClass000.A0v(str), C110505am.A00(this.A09).charAt(0));
        }
        setKeyListener(DigitsKeyListener.getInstance(str));
    }

    private void setAmount(String str, String str2) {
        if (this.A0D) {
            char charAt = C110505am.A00(this.A09).charAt(0);
            int indexOf = TextUtils.indexOf(str, charAt);
            AnonymousClass16U r0 = this.A0A;
            if (r0 != null) {
                C18820ts r4 = this.A09;
                BigDecimal B7j = r0.B7j(r4, str2);
                AnonymousClass16V r02 = (AnonymousClass16V) r0;
                this.A0J = AnonymousClass6US.A02(r4, r02.A02, r02.A03, B7j, false);
            }
            if (indexOf != -1) {
                int indexOf2 = TextUtils.indexOf(this.A0J, charAt);
                StringBuilder A0u = AnonymousClass000.A0u();
                String str3 = this.A0J;
                if (indexOf2 != -1) {
                    str3 = C90514aH.A0z(str3, indexOf2);
                }
                A0u.append(str3);
                str = AnonymousClass000.A0q(str.substring(indexOf), A0u);
            } else {
                return;
            }
        }
        this.A0J = str;
    }

    public void A0A() {
        if (!this.A0N) {
            this.A0N = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            AnonymousClass3LT.A00(this, C36341k9.A0T(A0W));
            this.A02 = C36351kA.A0U(A0W);
            this.A07 = C36351kA.A0M(A0W);
            this.A08 = C36341k9.A0T(A0W);
        }
    }

    public void A0E() {
        if (this.A04 != null) {
            ValueAnimator valueAnimator = this.A0G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else {
                float A002 = C36441kJ.A00(getResources(), R.dimen.f7nameremoved);
                View view = this.A04;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setInterpolator(new AccelerateInterpolator());
                ofFloat.setRepeatCount(3);
                ofFloat.setRepeatMode(2);
                ofFloat.setDuration(65);
                ofFloat.addUpdateListener(new AnonymousClass6Yh(view, A002));
                this.A0G = ofFloat;
                C162337oQ.A00(ofFloat, this, 26);
            }
            this.A0G.start();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i = configuration.orientation;
        if (i != this.A0F) {
            this.A0F = i;
            this.A02 = -1;
        }
        super.onConfigurationChanged(configuration);
    }

    public void setAllowDecimal(boolean z) {
        this.A0L = z;
        A04();
    }

    public void setAutoScaleTextSize(boolean z) {
        this.A0M = z;
        if (z) {
            float textSize = getTextSize();
            this.A00 = textSize;
            this.A01 = textSize * 0.7f;
        }
    }

    public void setErrorTextView(TextView textView) {
        this.A06 = textView;
        AlphaAnimation A0L2 = C36371kC.A0L();
        this.A05 = A0L2;
        A0L2.setDuration(500);
        this.A05.setAnimationListener(new C162647ov(textView, this, 1));
    }

    public PaymentAmountInputField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0A();
        this.A0O = new C1497372o(this, 11);
        this.A0E = false;
        this.A0L = true;
        A05(attributeSet);
    }

    public static float A02(PaymentAmountInputField paymentAmountInputField, String str, float f) {
        String str2;
        String str3;
        float f2 = 0.0f;
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        if (paymentAmountInputField.A0I == null) {
            TextPaint textPaint = new TextPaint();
            paymentAmountInputField.A0I = textPaint;
            paymentAmountInputField.getContext();
            textPaint.setTypeface(C33511fU.A02());
        }
        int indexOf = TextUtils.indexOf(str, C110505am.A00(paymentAmountInputField.A09).charAt(0));
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf);
            str3 = str.substring(indexOf);
        } else {
            str2 = str;
            str3 = "";
        }
        paymentAmountInputField.A0I.setTextSize(f);
        float measureText = paymentAmountInputField.A0I.measureText(str2);
        if (!TextUtils.isEmpty(str3)) {
            paymentAmountInputField.A0I.setTextSize(f * 1.0f);
            f2 = paymentAmountInputField.A0I.measureText(str3);
        }
        return measureText + f2;
    }

    public static String A03(C18820ts r2) {
        String A002 = C110505am.A00(r2);
        String str = ",";
        String str2 = str;
        if (A002.contains(str)) {
            str = ".";
        }
        if (str.equals(".")) {
            return "\\.";
        }
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A06(java.lang.String r7) {
        /*
            r6 = this;
            float r4 = r6.getTextSize()
            boolean r0 = r6.A0E
            if (r0 == 0) goto L_0x007b
            int r0 = r6.A02
            if (r0 <= 0) goto L_0x007b
            r5 = 0
        L_0x000d:
            float r3 = r6.A00
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r5
            r0 = 1041865114(0x3e19999a, float:0.15)
            float r1 = r1 * r0
            float r2 = r2 - r1
            float r3 = r3 * r2
            float r2 = A02(r6, r7, r3)
            if (r5 != 0) goto L_0x0066
            int r0 = r6.A02
            float r1 = (float) r0
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x0023:
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x006f
        L_0x0028:
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            android.animation.ValueAnimator r0 = r6.A0H
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x003b
            android.animation.ValueAnimator r0 = r6.A0H
            r0.cancel()
        L_0x003b:
            float[] r0 = X.C90524aI.A0v()
            X.C90484aE.A1O(r0, r4, r3)
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r6.A0H = r2
            r1 = 1073741824(0x40000000, float:2.0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r1)
            r2.setInterpolator(r0)
            android.animation.ValueAnimator r2 = r6.A0H
            r0 = 100
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r6.A0H
            r0 = 33
            X.C111565cU.A00(r1, r6, r0)
            android.animation.ValueAnimator r0 = r6.A0H
            r0.start()
        L_0x0065:
            return
        L_0x0066:
            r0 = 1
            if (r5 != r0) goto L_0x006f
            int r0 = r6.A02
            float r1 = (float) r0
            r0 = 1061158912(0x3f400000, float:0.75)
            goto L_0x0023
        L_0x006f:
            int r5 = r5 + 1
            r0 = 2
            if (r5 <= r0) goto L_0x000d
            float r0 = r6.A01
            float r3 = java.lang.Math.max(r3, r0)
            goto L_0x0028
        L_0x007b:
            float r3 = r6.A00
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.PaymentAmountInputField.A06(java.lang.String):void");
    }

    private ViewGroup getFirstNonWrapContentParent() {
        if (getParent() != null) {
            ViewParent parent = getParent();
            while (true) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup == null) {
                    break;
                } else if (viewGroup.getLayoutParams().width != -2) {
                    return viewGroup;
                } else {
                    parent = viewGroup.getParent();
                }
            }
        }
        return null;
    }

    public /* synthetic */ void A0F(ValueAnimator valueAnimator) {
        super.setTextSize(0, AnonymousClass000.A00(valueAnimator));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (r5 != false) goto L_0x007e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r11) {
        /*
            r10 = this;
            java.lang.String r1 = r11.toString()
            java.lang.String r0 = r10.A0J
            boolean r0 = r1.equals(r0)
            r6 = 0
            if (r0 != 0) goto L_0x0127
            X.7cz r0 = r10.A0C
            if (r0 == 0) goto L_0x0127
            java.lang.String r7 = r11.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r5 = 1
            if (r0 == 0) goto L_0x00a4
            r10.A0J = r7
            java.lang.String r0 = "0"
            r10.setHint(r0)
        L_0x0023:
            r5 = 0
        L_0x0024:
            java.lang.String r1 = r10.A0J
            X.0ts r0 = r10.A09
            java.lang.String r0 = X.C110505am.A00(r0)
            char r0 = r0.charAt(r6)
            int r3 = android.text.TextUtils.indexOf(r1, r0)
            java.lang.String r2 = r10.A0J
            r0 = -1
            if (r3 == r0) goto L_0x0055
            android.text.SpannableStringBuilder r2 = X.C36441kJ.A0P(r2)
            int r0 = r2.length()
            java.lang.CharSequence r0 = r2.subSequence(r3, r0)
            java.lang.String r0 = r0.toString()
            X.4cx r1 = new X.4cx
            r1.<init>(r0)
            int r0 = r2.length()
            r2.setSpan(r1, r3, r0, r6)
        L_0x0055:
            r10.setText(r2)
            java.lang.String r0 = r10.A0J
            int r0 = r0.length()
            r10.setSelection(r0)
            boolean r0 = r10.A0M
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = r10.A0J
            r10.A06(r0)
        L_0x006a:
            if (r5 != 0) goto L_0x007e
        L_0x006c:
            X.7kX r1 = r10.A0B
            if (r1 == 0) goto L_0x007e
            android.text.Editable r0 = r10.getText()
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.toString()
            r1.BR5(r0)
        L_0x007e:
            android.widget.TextView r0 = r10.A06
            if (r0 == 0) goto L_0x00a3
            if (r5 != 0) goto L_0x0086
            r6 = 8
        L_0x0086:
            r0.setVisibility(r6)
            X.17Y r0 = r10.A07
            java.lang.Runnable r3 = r10.A0O
            r0.A0G(r3)
            if (r5 == 0) goto L_0x00a3
            android.view.animation.Animation r0 = r10.A05
            r0.cancel()
            android.view.animation.Animation r0 = r10.A05
            r0.reset()
            X.17Y r2 = r10.A07
            r0 = 1200(0x4b0, double:5.93E-321)
            r2.A0I(r3, r0)
        L_0x00a3:
            return
        L_0x00a4:
            X.0ts r0 = r10.A09
            java.lang.String r0 = A03(r0)
            java.lang.String r8 = ""
            java.lang.String r4 = r7.replaceAll(r0, r8)
            java.lang.String r1 = r10.A0J
            X.0ts r0 = r10.A09
            java.lang.String r0 = A03(r0)
            java.lang.String r0 = r1.replaceAll(r0, r8)
            X.7cz r9 = r10.A0C
            int r3 = r10.A03
            int r1 = r4.length()
            int r0 = r0.length()
            boolean r2 = X.AnonymousClass000.A1T(r1, r0)
            X.6x8 r9 = (X.C147386x8) r9
            java.lang.String r0 = "^([0]([.,]\\d{0,2})?|[1-9]\\d*([.,]\\d{0,2})?)"
            boolean r0 = r4.matches(r0)
            if (r0 == 0) goto L_0x00ed
            X.16U r1 = r9.A03
            X.0ts r0 = r9.A02
            java.math.BigDecimal r0 = r1.B7j(r0, r4)
            if (r0 == 0) goto L_0x00ed
            X.5qs r2 = X.C147386x8.A00(r9, r4, r0, r3, r2)
        L_0x00e4:
            int r1 = r2.A00
            if (r1 != 0) goto L_0x00f3
            r10.setAmount(r7, r4)
            goto L_0x0023
        L_0x00ed:
            X.5qs r2 = new X.5qs
            r2.<init>(r5, r8)
            goto L_0x00e4
        L_0x00f3:
            r10.A0E()
            r0 = 3
            if (r1 != r0) goto L_0x0023
            java.lang.String r3 = r2.A01
            if (r3 == 0) goto L_0x0023
            android.widget.TextView r0 = r10.A06
            if (r0 == 0) goto L_0x0109
            r0.setText(r3)
            X.0yb r0 = r10.A02
            X.AnonymousClass3T3.A03(r0)
        L_0x0109:
            java.math.BigDecimal r2 = r10.A0K
            if (r2 == 0) goto L_0x011e
            X.16U r1 = r10.A0A
            X.0ts r0 = r10.A09
            java.math.BigDecimal r0 = r1.B7j(r0, r4)
            int r0 = r2.compareTo(r0)
            if (r0 <= 0) goto L_0x011e
            r10.setAmount(r7, r4)
        L_0x011e:
            X.7kX r0 = r10.A0B
            if (r0 == 0) goto L_0x0024
            r0.BWo(r3)
            goto L_0x0024
        L_0x0127:
            r5 = 0
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.PaymentAmountInputField.afterTextChanged(android.text.Editable):void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.A0K = this.A0A.B7j(this.A09, charSequence.toString());
        }
    }

    public int getCursorColor() {
        return C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
    }

    public int getCursorVerticalPadding() {
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public int getCursorWidth() {
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public C18820ts getWhatsAppLocale() {
        return this.A09;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.A0M && this.A02 == -1) {
            if (getLayoutParams().width == -2) {
                ViewGroup firstNonWrapContentParent = getFirstNonWrapContentParent();
                if (firstNonWrapContentParent == null) {
                    width = C90484aE.A0P().widthPixels;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    HashSet A16 = C36441kJ.A16();
                    i5 = firstNonWrapContentParent.getWidth();
                    while (!A16.contains(firstNonWrapContentParent)) {
                        for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                            View childAt = viewGroup.getChildAt(i6);
                            if (childAt != this && !A16.contains(childAt)) {
                                ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(childAt);
                                i5 -= (childAt.getWidth() + A0a.rightMargin) + A0a.leftMargin;
                                A16.add(childAt);
                            }
                        }
                        ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(viewGroup);
                        i5 -= ((A0a2.leftMargin + A0a2.rightMargin) + viewGroup.getPaddingRight()) + viewGroup.getPaddingLeft();
                        A16.add(viewGroup);
                        viewGroup = (ViewGroup) viewGroup.getParent();
                    }
                    this.A02 = i5;
                }
            } else {
                width = getWidth();
            }
            i5 = (width - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            this.A02 = i5;
        }
    }

    public void onSelectionChanged(int i, int i2) {
        Editable text = getText();
        if (TextUtils.isEmpty(text) || (i == text.length() && i2 == text.length())) {
            super.onSelectionChanged(i, i2);
        } else {
            setSelection(text.length(), text.length());
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if ((i == 4 || i == 8) && this.A06 != null) {
            this.A07.A0G(this.A0O);
            this.A05.cancel();
            this.A05.reset();
            this.A06.setVisibility(8);
        }
    }

    public void setTextSize(float f) {
        super.setTextSize(f);
        if (this.A0M) {
            float textSize = getTextSize();
            this.A00 = textSize;
            this.A01 = textSize * 0.7f;
            A06(this.A0J);
        }
    }

    public void setCurrency(AnonymousClass16U r1) {
        this.A0A = r1;
    }

    public void setFormatWithCommas(boolean z) {
        this.A0D = z;
    }

    public void setInputAmountType(int i) {
        this.A03 = i;
    }

    public void setInputAmountValidator(C157457cz r1) {
        this.A0C = r1;
    }

    public void setOnAmountChangedLister(C160147kX r1) {
        this.A0B = r1;
    }

    public void setPaymentAmountContainer(View view) {
        this.A04 = view;
    }

    public void setWhatsAppLocale(C18820ts r1) {
        this.A09 = r1;
    }

    public PaymentAmountInputField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0A();
    }

    public PaymentAmountInputField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0A();
        this.A0O = new C1497372o(this, 11);
        this.A0E = false;
        this.A0L = true;
        A05(attributeSet);
    }

    public PaymentAmountInputField(Context context) {
        super(context);
        A0A();
        this.A0O = new C1497372o(this, 11);
        this.A0E = false;
        this.A0L = true;
        A05((AttributeSet) null);
    }
}
