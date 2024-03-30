package com.whatsapp.conversation.comments;

import X.AnonymousClass00C;
import X.C05250Oz;
import X.C18800tq;
import X.C19970wo;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;

public final class MessageDate extends WaTextView {
    public C19970wo A00;
    public boolean A01;

    public final void setTime(C19970wo r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public void A09() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0P = C36361kB.A0P(this);
            C36321k7.A0e(A0P, this);
            this.A00 = C36351kA.A0V(A0P);
        }
    }

    public final C19970wo getTime() {
        C19970wo r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("time");
    }

    public MessageDate(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A09();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageDate(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A09();
    }

    public /* synthetic */ MessageDate(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }
}
