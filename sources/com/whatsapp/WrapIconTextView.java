package com.whatsapp;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass481;
import X.C05250Oz;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C37331mC;
import X.C65783Tl;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import java.util.List;

public final class WrapIconTextView extends TextEmojiLabel {
    public final AnonymousClass00T A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WrapIconTextView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void A0K(Drawable drawable, Drawable drawable2, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        CharSequence A0D = A0D((C65783Tl) null, charSequence2, (List) null, 1.0f, 0, true);
        if ((drawable == null && drawable2 == null) || A0D == null) {
            super.A0H((C65783Tl) null, charSequence2, (List) null, 0, true);
            return;
        }
        SpannableStringBuilder A0P = C36441kJ.A0P(A0D);
        A0P.insert(0, " ");
        A06(drawable, A0P);
        A06(drawable2, A0P);
        setText(A0P);
    }

    private final void A06(Drawable drawable, SpannableStringBuilder spannableStringBuilder) {
        if (drawable != null) {
            AnonymousClass00T r0 = this.A00;
            drawable.setBounds(0, 0, C36331k8.A02(r0), C36331k8.A02(r0));
            C37331mC r2 = new C37331mC(drawable);
            spannableStringBuilder.insert(0, " ");
            spannableStringBuilder.setSpan(r2, 0, 1, 33);
        }
    }

    private final int getIconWidth() {
        return C36331k8.A02(this.A00);
    }

    public /* synthetic */ WrapIconTextView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapIconTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        this.A00 = C36431kI.A1I(new AnonymousClass481(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WrapIconTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
