package com.whatsapp;

import X.AnonymousClass280;
import X.AnonymousClass3M1;
import X.AnonymousClass3T3;
import X.AnonymousClass4VD;
import X.C012005e;
import X.C015006m;
import X.C36361kB;
import X.C36441kJ;
import X.C37221m1;
import X.C39231rY;
import X.C53562rW;
import X.C66843Xn;
import X.C66923Xv;
import X.C68603cA;
import X.C87424Ot;
import X.C88294Sd;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;

public final class CodeInputField extends AnonymousClass280 {
    public static Typeface A07;
    public static Typeface A08;
    public char A00;
    public char A01;
    public int A02;
    public C66843Xn A03;
    public boolean A04;
    public ValueAnimator A05;
    public final Context A06;

    public void A0F(C88294Sd r10, int i) {
        A0H(r10, new AnonymousClass3M1(this, 1), (String) null, (String) null, 8211, 8226, i);
    }

    public void A0E() {
        ValueAnimator valueAnimator = this.A05;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        } else {
            float x = getX();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{x, C36441kJ.A00(getResources(), R.dimen.f7nameremoved) + x});
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(3);
            ofFloat.setRepeatMode(2);
            ofFloat.setDuration(50);
            C53562rW.A00(ofFloat, this, 0);
            ofFloat.addListener(new AnonymousClass4VD(this, x, 0));
            this.A05 = ofFloat;
        }
        this.A05.start();
        AnonymousClass3T3.A03(this.A02);
    }

    public void A0G(C88294Sd r11, int i, int i2) {
        C68603cA r4 = new C68603cA(this, i2);
        setPasswordTransformationEnabled(true);
        setOnClickListener(new C66923Xv(this, 10));
        setCursorVisible(false);
        A0H(r11, r4, "pin_font", (String) null, ')', '(', i);
    }

    public void A0H(C88294Sd r3, C87424Ot r4, String str, String str2, char c, char c2, int i) {
        Typeface typeface;
        this.A02 = i;
        this.A01 = c;
        this.A00 = c2;
        C66843Xn r0 = new C66843Xn(r3, r4, this);
        this.A03 = r0;
        addTextChangedListener(r0);
        setCode("");
        if (TextUtils.equals(str, "pin_font")) {
            typeface = A07;
            if (typeface == null) {
                typeface = C015006m.A03(getContext(), R.font.payment_icons_regular);
                A07 = typeface;
            }
        } else {
            typeface = A08;
            if (typeface == null) {
                typeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/RobotoMono-Regular.ttf");
                A08 = typeface;
            }
        }
        setTypeface(typeface);
        setTextDirection(3);
        if (str2 != null) {
            C012005e.A0V(this, new C39231rY(this, str2));
        }
    }

    public void onDetachedFromWindow() {
        removeTextChangedListener(this.A03);
        super.onDetachedFromWindow();
    }

    public void onSelectionChanged(int i, int i2) {
        int indexOf;
        if (i == i2 && (indexOf = C36361kB.A0n(this).indexOf(this.A01)) > -1 && i > indexOf) {
            setSelection(indexOf);
        }
        super.onSelectionChanged(i, i2);
    }

    public void setCode(String str) {
        StringBuilder sb = new StringBuilder(str);
        int i = this.A02;
        int length = str.length();
        int i2 = length;
        if (i > 4) {
            while (length < i + 1) {
                sb.append(this.A01);
                length++;
            }
            sb.insert(i / 2, 160);
        } else {
            while (length < i) {
                sb.append(this.A01);
                length++;
            }
        }
        this.A03.A00 = true;
        setText(sb);
        if (this.A02 > 4) {
            setSelection(i2 + 1);
        } else {
            setSelection(i2);
        }
        this.A03.A00 = false;
    }

    public void setErrorState(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            setCode("");
        }
    }

    public void setPasswordTransformationEnabled(boolean z) {
        C37221m1 r0;
        if (z) {
            r0 = new C37221m1(this);
        } else {
            r0 = null;
        }
        setTransformationMethod(r0);
    }

    public CodeInputField(Context context) {
        super(context);
        this.A06 = context;
    }

    public String getCode() {
        return C36361kB.A0n(this).replaceAll("[^0-9]", "");
    }

    public boolean getErrorState() {
        return this.A04;
    }

    public void setRegistrationVoiceCodeLength(int i) {
        this.A02 = i;
    }

    public CodeInputField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = context;
    }

    public CodeInputField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = context;
    }
}
