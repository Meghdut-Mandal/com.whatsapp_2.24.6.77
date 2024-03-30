package com.whatsapp.conversation.comments;

import X.AnonymousClass00C;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.C05250Oz;
import X.C18800tq;
import X.C220412q;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C63193Jc;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;

public final class ContactNamePrimary extends TextEmojiLabel {
    public AnonymousClass171 A00;
    public C63193Jc A01;
    public C220412q A02;
    public AnonymousClass17X A03;
    public boolean A04;

    public final void setChatsCache(C220412q r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setConversationFont(C63193Jc r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setGroupParticipantsManager(AnonymousClass17X r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setWaContactNames(AnonymousClass171 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public void A09() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0P = C36361kB.A0P(this);
            C36321k7.A0d(A0P, this);
            C36361kB.A1D(A0P.A00, this);
            this.A02 = C36351kA.A0a(A0P);
            this.A00 = C36341k9.A0S(A0P);
            this.A01 = C36371kC.A0V(A0P);
            this.A03 = C36351kA.A0b(A0P);
        }
    }

    public final C220412q getChatsCache() {
        C220412q r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatsCache");
    }

    public final C63193Jc getConversationFont() {
        C63193Jc r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("conversationFont");
    }

    public final AnonymousClass17X getGroupParticipantsManager() {
        AnonymousClass17X r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupParticipantsManager");
    }

    public final AnonymousClass171 getWaContactNames() {
        AnonymousClass171 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0c();
    }

    public ContactNamePrimary(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A09();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactNamePrimary(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A09();
    }

    public /* synthetic */ ContactNamePrimary(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }
}
