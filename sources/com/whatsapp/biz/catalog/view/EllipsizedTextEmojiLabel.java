package com.whatsapp.biz.catalog.view;

import X.AnonymousClass21p;
import X.C18800tq;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36441kJ;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

public class EllipsizedTextEmojiLabel extends TextEmojiLabel {
    public int A00;
    public View.OnClickListener A01;
    public boolean A02;
    public boolean A03;

    public void A0J(CharSequence charSequence, List list, int i, boolean z) {
        CharSequence charSequence2 = charSequence;
        List list2 = list;
        if (i == 0 || !this.A02) {
            super.A0J(charSequence, list, 0, true);
            return;
        }
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        SpannableStringBuilder A0P = C36441kJ.A0P(charSequence);
        if (codePointCount > i) {
            SpannableStringBuilder A0P2 = C36441kJ.A0P(getContext().getString(R.string.f12nameremoved));
            A0P2.setSpan(new AnonymousClass21p(getContext(), this, charSequence2, list2, this.A00), 0, A0P2.length(), 18);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                i2 += Character.charCount(Character.codePointAt(charSequence, i2));
            }
            A0P.delete(i2, A0P.length()).append("... ").append(A0P2);
        }
        super.A0J(A0P, list, 0, true);
    }

    public void A09() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0P = C36361kB.A0P(this);
            C36321k7.A0d(A0P, this);
            C36361kB.A1D(A0P.A00, this);
        }
    }

    public EllipsizedTextEmojiLabel(Context context) {
        super(context);
        A09();
        this.A02 = true;
        C36331k8.A1A(this.A02, this);
        this.A00 = C36341k9.A05(context);
    }

    public void setOnTextExpandClickListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }

    public void setReadMoreColor(int i) {
        this.A00 = i;
    }

    public EllipsizedTextEmojiLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A09();
        this.A02 = true;
        C36331k8.A1A(this.A02, this);
        this.A00 = C36341k9.A05(context);
    }

    public EllipsizedTextEmojiLabel(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A09();
    }

    public EllipsizedTextEmojiLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A09();
        this.A02 = true;
        C36331k8.A1A(this.A02, this);
        this.A00 = C36341k9.A05(context);
    }
}
