package com.whatsapp.mediacomposer.doodle.textentry;

import X.AnonymousClass00C;
import X.AnonymousClass3PW;
import X.AnonymousClass4OH;
import X.C36331k8;
import X.C36371kC;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C54762tV;
import X.C66873Xq;
import X.C75633nY;
import X.C75643nZ;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.whatsapp.WaEditText;

public final class DoodleEditText extends WaEditText {
    public AnonymousClass4OH A00;
    public boolean A01;
    public int A02;
    public int A03;
    public C66873Xq A04;
    public final AnonymousClass3PW A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DoodleEditText(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A0A();
        this.A05 = new AnonymousClass3PW();
        setLayerType(1, (Paint) null);
    }

    public static /* synthetic */ void getAlignment$annotations() {
    }

    public static /* synthetic */ void getFontStyle$annotations() {
    }

    public final void setupBackgroundSpan(String str) {
        AnonymousClass00C.A0D(str, 0);
        Context A0B = C36371kC.A0B(this);
        AnonymousClass3PW r0 = this.A05;
        this.A04 = new C66873Xq(A0B, this, r0.A00, r0.A01);
        SpannableStringBuilder A0P = C36441kJ.A0P(str);
        A0P.setSpan(this.A04, 0, A0P.length(), 18);
        setShadowLayer(getTextSize() / ((float) 2), 0.0f, 0.0f, 0);
        C36431kI.A1M(this, A0P);
    }

    public final void A0E(int i) {
        int i2;
        if (this.A02 != i) {
            this.A02 = i;
            if (i != 0) {
                i2 = 8388627;
                if (i != 1) {
                    if (i == 2) {
                        i2 = 8388629;
                    }
                    setTextAlignment(1);
                    setTextDirection(5);
                    clearFocus();
                }
            } else {
                i2 = 17;
            }
            setGravity(i2);
            setTextAlignment(1);
            setTextDirection(5);
            clearFocus();
        }
    }

    public final void A0F(int i) {
        AnonymousClass3PW r2 = this.A05;
        r2.A03 = i;
        r2.A01(i, r2.A02);
        C66873Xq r1 = this.A04;
        if (r1 != null) {
            r1.A00 = r2.A00;
            r1.A01 = r2.A01;
        }
        setTextColor(r2.A04);
    }

    public final int getBackgroundStyle() {
        return this.A05.A02;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        AnonymousClass4OH r3 = this.A00;
        if (r3 != null) {
            C75633nY r32 = (C75633nY) r3;
            if (i == 4 && keyEvent != null && keyEvent.getAction() == 1) {
                C75643nZ r2 = r32.A00;
                DoodleEditText doodleEditText = r32.A01.A03;
                if (doodleEditText == null) {
                    throw C36331k8.A0d("doodleEditText");
                }
                String A0Z = C36421kH.A0Z(doodleEditText);
                AnonymousClass00C.A0D(A0Z, 0);
                r2.A03.A04 = A0Z;
                r2.dismiss();
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public final void setBackgroundStyle(int i) {
        AnonymousClass3PW r1 = this.A05;
        r1.A02 = i;
        r1.A01(r1.A03, i);
        A0F(r1.A03);
    }

    public final void setFontStyle(int i) {
        if (this.A03 != i) {
            this.A03 = i;
            setTypeface(C54762tV.A00(C36371kC.A0B(this), i));
            setAllCaps(false);
        }
    }

    public final AnonymousClass4OH getOnKeyPreImeListener() {
        return this.A00;
    }

    public final void setOnKeyPreImeListener(AnonymousClass4OH r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DoodleEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A0A();
        this.A05 = new AnonymousClass3PW();
        setLayerType(1, (Paint) null);
    }

    public DoodleEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0A();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DoodleEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A0A();
        this.A05 = new AnonymousClass3PW();
        setLayerType(1, (Paint) null);
    }
}
