package com.whatsapp.conversation;

import X.AnonymousClass141;
import X.AnonymousClass22g;
import X.AnonymousClass27v;
import X.C18800tq;
import X.C18830tt;
import X.C235618y;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36401kF;
import X.C62463Gg;
import X.C89324Wc;
import com.whatsapp.TextEmojiLabel;

public class EditBroadcastRecipientsSelector extends AnonymousClass27v {
    public C235618y A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            AnonymousClass22g.A0l(this);
            AnonymousClass22g.A0h(r2, r1, this);
            AnonymousClass22g.A0L(A0L, r2, this);
            this.A00 = C36401kF.A0U(r2);
        }
    }

    public void A3w(C62463Gg r4, AnonymousClass141 r5) {
        if (this.A00.A00(C36351kA.A0l(r5))) {
            if (r5.A0x) {
                super.B2c(r5);
            }
            TextEmojiLabel textEmojiLabel = r4.A02;
            textEmojiLabel.setSingleLine(false);
            textEmojiLabel.setMaxLines(2);
            r4.A00("You can't add this business to a Broadcast list.", false);
            return;
        }
        super.A3w(r4, r5);
    }

    public EditBroadcastRecipientsSelector(int i) {
        this.A01 = false;
        C89324Wc.A00(this, 41);
    }

    public EditBroadcastRecipientsSelector() {
        this(0);
    }
}
