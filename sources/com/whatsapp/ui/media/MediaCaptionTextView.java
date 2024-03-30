package com.whatsapp.ui.media;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass1DU;
import X.AnonymousClass3TB;
import X.AnonymousClass3UG;
import X.AnonymousClass3Y9;
import X.AnonymousClass6YV;
import X.C05250Oz;
import X.C20800yB;
import X.C21000yV;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C37211m0;
import X.C37441mN;
import X.C55812vE;
import X.C79053t6;
import X.C87414Os;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.text.ReadMoreTextView;

public final class MediaCaptionTextView extends ReadMoreTextView {
    public AnonymousClass1DU A00;
    public boolean A01;
    public final boolean A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaCaptionTextView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void A0L(C87414Os r13, CharSequence charSequence, boolean z) {
        float A002;
        CharSequence A08;
        int length;
        CharSequence charSequence2 = charSequence;
        if (charSequence == null || charSequence.length() == 0) {
            setVisibility(8);
            return;
        }
        int A003 = AnonymousClass3TB.A00(charSequence);
        if (1 <= A003) {
            float A004 = C36441kJ.A00(C36341k9.A0F(this), R.dimen.f7nameremoved);
            float A005 = (C36341k9.A00(getContext()) * A004) / C36341k9.A0F(this).getDisplayMetrics().scaledDensity;
            float f = A004;
            if (A004 > A005) {
                f = A005;
            }
            float f2 = f * 1.5f;
            float f3 = A004;
            if (A004 < f2) {
                f3 = f2;
            }
            A002 = A004 + (((f3 - A004) * ((float) (4 - A003))) / ((float) 3));
        } else {
            Resources A0F = C36341k9.A0F(this);
            int length2 = charSequence.length();
            int i = R.dimen.f7nameremoved;
            if (length2 < 96) {
                i = R.dimen.f7nameremoved;
            }
            A002 = C36441kJ.A00(A0F, i);
        }
        int i2 = 8388611;
        if (charSequence.length() < 96) {
            i2 = 17;
        }
        setGravity(i2);
        setTextSize(0, A002);
        if (this.A02) {
            int A006 = AnonymousClass00F.A00(getContext(), R.color.f6nameremoved);
            int A007 = AnonymousClass00F.A00(getContext(), R.color.f6nameremoved);
            TextPaint paint = getPaint();
            AnonymousClass00C.A08(paint);
            Pair A05 = AnonymousClass6YV.A05(paint, this.A02, this.A05, charSequence2, A006, A007, false);
            if (A05 != null) {
                if (C36371kC.A1X(A05.second, true)) {
                    getLayoutParams().width = -2;
                    setGravity(8388611);
                }
                A08 = (CharSequence) A05.first;
            }
            setVisibility(0);
            if (z && r13 != null) {
                SpannableStringBuilder A0P = C36441kJ.A0P(getText());
                getLinkifyWeb().A06(A0P);
                URLSpan[] A1a = C36381kD.A1a(A0P, 0);
                if (A1a != null && (length = A1a.length) != 0) {
                    int i3 = 0;
                    do {
                        URLSpan uRLSpan = A1a[i3];
                        String url = uRLSpan.getURL();
                        AnonymousClass00C.A0B(url);
                        String A008 = C55812vE.A00(url);
                        int spanStart = A0P.getSpanStart(uRLSpan);
                        A0P.replace(spanStart, A0P.getSpanEnd(uRLSpan), A008);
                        int A09 = C36441kJ.A09(A008, spanStart);
                        A0P.removeSpan(uRLSpan);
                        A0P.setSpan(new C37441mN(r13, this, url), spanStart, A09, 0);
                        i3++;
                    } while (i3 < length);
                    setLinkTextColor(AnonymousClass00F.A00(getContext(), R.color.f6nameremoved));
                    setMovementMethod(new C37211m0());
                    setText(A0P);
                    requestLayout();
                    return;
                }
                return;
            }
        }
        A08 = AnonymousClass6YV.A08(this.A02, this.A05, charSequence);
        setText(AnonymousClass3UG.A03(getContext(), getPaint(), this.A04, A08));
        setVisibility(0);
        if (z) {
        }
    }

    public final void setCaptionText(CharSequence charSequence) {
        A0L((C87414Os) null, charSequence, false);
    }

    public final void setLinkifyWeb(AnonymousClass1DU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass1DU getLinkifyWeb() {
        AnonymousClass1DU r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("linkifyWeb");
    }

    public /* synthetic */ MediaCaptionTextView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCaptionTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A09();
        setOnClickListener(new AnonymousClass3Y9(this, 8));
        this.A02 = C79053t6.A00;
        this.A02 = C20800yB.A01(C21000yV.A01, getAbProps(), 4093);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaCaptionTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
