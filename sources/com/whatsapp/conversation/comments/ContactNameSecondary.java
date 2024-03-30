package com.whatsapp.conversation.comments;

import X.AnonymousClass00C;
import X.AnonymousClass3CR;
import X.C05250Oz;
import X.C18800tq;
import X.C27851Qb;
import X.C27861Qc;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36381kD;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;

public final class ContactNameSecondary extends TextEmojiLabel {
    public AnonymousClass3CR A00;
    public boolean A01;

    public final void setElevatedProfileNameHelper(AnonymousClass3CR r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public void A09() {
        if (!this.A01) {
            this.A01 = true;
            C27861Qc r1 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r0 = r1.A0M;
            C36321k7.A0d(r0, this);
            C36361kB.A1D(r0.A00, this);
            this.A00 = r1.A0L.A1M();
        }
    }

    public final AnonymousClass3CR getElevatedProfileNameHelper() {
        AnonymousClass3CR r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("elevatedProfileNameHelper");
    }

    public ContactNameSecondary(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A09();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactNameSecondary(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A09();
    }

    public /* synthetic */ ContactNameSecondary(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }
}
