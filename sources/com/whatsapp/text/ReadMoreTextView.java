package com.whatsapp.text;

import X.AnonymousClass14B;
import X.AnonymousClass1SC;
import X.AnonymousClass242;
import X.AnonymousClass4S9;
import X.C001600r;
import X.C001700s;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36381kD;
import X.C36441kJ;
import X.C79063t7;
import X.C79073t8;
import X.C81253wi;
import X.C88604Ti;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;

public class ReadMoreTextView extends AnonymousClass242 {
    public static final C88604Ti A0B;
    public int A00;
    public int A01;
    public AnonymousClass4S9 A02;
    public CharSequence A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08 = C36341k9.A0H();
    public final C001700s A09 = C36441kJ.A0Z(C36381kD.A0j());
    public final Runnable A0A = new C81253wi(this);

    /* access modifiers changed from: private */
    public void setVisibleText(CharSequence charSequence) {
        this.A07 = true;
        setText(charSequence);
        this.A07 = false;
    }

    static {
        C88604Ti r0;
        if (Build.VERSION.SDK_INT >= 23) {
            r0 = new C79063t7();
        } else {
            r0 = new C79073t8();
        }
        A0B = r0;
    }

    private void A06(Context context, AttributeSet attributeSet) {
        A0B.BsF(this);
        C36331k8.A1A(this.A02, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1SC.A00);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                this.A04 = this.A01.A0B(resourceId);
            }
            this.A01 = obtainStyledAttributes.getResourceId(2, C36341k9.A05(context));
            this.A06 = obtainStyledAttributes.getBoolean(1, false);
            int i = obtainStyledAttributes.getInt(0, 0);
            this.A00 = i;
            if (i != 0) {
                setMaxLines(i);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public boolean A0K() {
        C001700s r1 = this.A09;
        if (r1.A04() == null || !C36351kA.A1W(r1)) {
            return false;
        }
        return true;
    }

    public void setLinesLimit(int i) {
        int i2;
        this.A00 = i;
        if (A0K() || (i2 = this.A00) == 0) {
            i2 = Integer.MAX_VALUE;
        }
        setMaxLines(i2);
    }

    public ReadMoreTextView(Context context) {
        super(context);
        A06(context, (AttributeSet) null);
    }

    public C001600r getExpanded() {
        return this.A09;
    }

    public int getLinesLimit() {
        return this.A00;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A08.removeCallbacks(this.A0A);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Handler handler = this.A08;
        Runnable runnable = this.A0A;
        handler.removeCallbacks(runnable);
        if (this.A00 != 0) {
            handler.post(runnable);
        }
    }

    public void setExpanded(boolean z) {
        int i;
        Boolean valueOf = Boolean.valueOf(z);
        C001700s r1 = this.A09;
        if (!valueOf.equals(r1.A04())) {
            r1.A0D(valueOf);
            if (z || (i = this.A00) == 0) {
                i = Integer.MAX_VALUE;
            }
            setMaxLines(i);
            setText(this.A03);
        }
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence A022 = AnonymousClass14B.A02(charSequence);
        super.setText(A022, bufferType);
        if (!this.A07) {
            this.A03 = A022;
        }
    }

    public void setLinkColor(int i) {
        this.A01 = i;
    }

    public void setLinkIsBold(boolean z) {
        this.A06 = z;
    }

    public void setLinkText(String str) {
        this.A04 = str;
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
    }

    public void setReadMoreClickListener(AnonymousClass4S9 r1) {
        this.A02 = r1;
    }

    public ReadMoreTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A06(context, attributeSet);
    }

    public ReadMoreTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A06(context, attributeSet);
    }
}
