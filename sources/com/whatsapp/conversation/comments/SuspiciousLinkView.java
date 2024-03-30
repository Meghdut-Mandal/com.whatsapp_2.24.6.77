package com.whatsapp.conversation.comments;

import X.AnonymousClass00C;
import X.C05250Oz;
import X.C33511fU;
import X.C36321k7;
import X.C36361kB;
import X.C36381kD;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;

public final class SuspiciousLinkView extends WaTextView {
    public boolean A00;

    public void A09() {
        if (!this.A00) {
            this.A00 = true;
            C36321k7.A0e(C36361kB.A0P(this), this);
        }
    }

    public SuspiciousLinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A09();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspiciousLinkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A09();
        C33511fU.A03(this);
    }

    public /* synthetic */ SuspiciousLinkView(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }
}
