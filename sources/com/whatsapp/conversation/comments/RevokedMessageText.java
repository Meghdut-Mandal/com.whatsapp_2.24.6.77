package com.whatsapp.conversation.comments;

import X.AnonymousClass00C;
import X.AnonymousClass171;
import X.AnonymousClass2c8;
import X.AnonymousClass3T1;
import X.AnonymousClass6XV;
import X.C05250Oz;
import X.C18800tq;
import X.C19730wQ;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;

public final class RevokedMessageText extends TextEmojiLabel {
    public C19730wQ A00;
    public AnonymousClass171 A01;
    public boolean A02;

    public final void setMeManager(C19730wQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setWaContactNames(AnonymousClass171 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    private final void setAdminRevokeText(AnonymousClass3T1 r6) {
        int i;
        AnonymousClass00C.A0E(r6, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageAdminRevoked");
        UserJid userJid = ((AnonymousClass2c8) r6).A00;
        if (getMeManager().A0M(userJid)) {
            i = R.string.f12nameremoved;
        } else if (userJid == null) {
            i = R.string.f12nameremoved;
        } else {
            String A0X = getWaContactNames().A0X(AnonymousClass6XV.newArrayList(userJid), -1);
            AnonymousClass00C.A08(A0X);
            A0I(C36351kA.A0w(getContext(), A0X, 1, R.string.f12nameremoved));
            return;
        }
        setText(i);
    }

    private final void setSenderRevokeText(AnonymousClass3T1 r3) {
        boolean z = r3.A1J.A02;
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        setText(i);
    }

    public void A09() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0P = C36361kB.A0P(this);
            C36321k7.A0d(A0P, this);
            C36361kB.A1D(A0P.A00, this);
            this.A00 = C36351kA.A0N(A0P);
            this.A01 = C36341k9.A0S(A0P);
        }
    }

    public final void A0K(AnonymousClass3T1 r3) {
        if (r3.A1I == 64) {
            setAdminRevokeText(r3);
        } else {
            setSenderRevokeText(r3);
        }
    }

    public final C19730wQ getMeManager() {
        C19730wQ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("meManager");
    }

    public final AnonymousClass171 getWaContactNames() {
        AnonymousClass171 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0c();
    }

    public RevokedMessageText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A09();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RevokedMessageText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A09();
    }

    public /* synthetic */ RevokedMessageText(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }
}
