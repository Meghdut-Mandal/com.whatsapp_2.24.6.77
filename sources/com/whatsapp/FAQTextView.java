package com.whatsapp;

import X.AnonymousClass17Y;
import X.AnonymousClass2xF;
import X.AnonymousClass4P1;
import X.AnonymousClass6YV;
import X.C18800tq;
import X.C18830tt;
import X.C20380xT;
import X.C21060yb;
import X.C24791Du;
import X.C32691e2;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36441kJ;
import X.C429721s;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;

public class FAQTextView extends TextEmojiLabel {
    public AnonymousClass17Y A00;
    public C32691e2 A01;
    public C20380xT A02;
    public boolean A03;

    public void setEducationText(Spannable spannable, String str, String str2, AnonymousClass4P1 r10) {
        setEducationText(spannable, str, str2, 0, r10);
    }

    public void A09() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0P = C36361kB.A0P(this);
            C36321k7.A0d(A0P, this);
            C18830tt r1 = A0P.A00;
            C36361kB.A1D(r1, this);
            this.A00 = C36351kA.A0M(A0P);
            this.A02 = C18830tt.ACx(r1);
            this.A01 = C36371kC.A0R(A0P);
        }
    }

    public void setEducationTextFromArticleID(Spannable spannable, String str, String str2) {
        setEducationText(spannable, this.A02.A05(str), str2, (AnonymousClass4P1) null);
    }

    public void setEducationTextFromNamedArticle(Spannable spannable, String str, String str2) {
        setEducationText(spannable, this.A02.A04(str, str2).toString(), (String) null, (AnonymousClass4P1) null);
    }

    public FAQTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A09();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C36361kB.A09(this).obtainStyledAttributes(attributeSet, AnonymousClass2xF.A07, 0, 0);
            try {
                String A0F = this.A01.A0F(obtainStyledAttributes, 1);
                String string = obtainStyledAttributes.getString(0);
                if (!(A0F == null || string == null)) {
                    setEducationTextFromArticleID(C36441kJ.A0P(A0F), string);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        C36331k8.A16(this, this.A02);
        setClickable(true);
    }

    public FAQTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setEducationTextFromArticleID(Spannable spannable, String str) {
        setEducationText(spannable, this.A02.A05(str), (String) null, (AnonymousClass4P1) null);
    }

    public void setEducationText(Spannable spannable, String str, String str2, int i, AnonymousClass4P1 r17) {
        C429721s r5;
        setLinksClickable(true);
        setFocusable(false);
        C36331k8.A1A(this.A02, this);
        if (str2 == null) {
            str2 = getContext().getString(R.string.f12nameremoved);
        }
        SpannableStringBuilder A0P = C36441kJ.A0P(str2);
        Context context = getContext();
        AnonymousClass17Y r8 = this.A00;
        C21060yb r9 = this.A02;
        C32691e2 r7 = this.A01;
        String str3 = str;
        int i2 = i;
        if (i != 0) {
            r5 = new C429721s(context, (C24791Du) r7, r8, r9, str3, i2);
        }
        A0P.setSpan(r5, 0, str2.length(), 33);
        setText(AnonymousClass6YV.A04(getContext().getString(R.string.f12nameremoved), spannable, A0P));
        AnonymousClass4P1 r0 = r17;
        if (r17 != null) {
            r5.A02 = r0;
        }
    }
}
