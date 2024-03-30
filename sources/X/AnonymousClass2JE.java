package X;

import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;

/* renamed from: X.2JE  reason: invalid class name */
public abstract class AnonymousClass2JE extends AnonymousClass2JG {
    public boolean A00 = false;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            StarredMessagesActivity starredMessagesActivity = (StarredMessagesActivity) this;
            C27111My r4 = (C27111My) C36421kH.A0H(this);
            C18800tq r2 = r4.A5g;
            C36321k7.A0c(r2, starredMessagesActivity);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, starredMessagesActivity, C36321k7.A05(r2, r1, starredMessagesActivity));
            AnonymousClass22g.A0H(r4, r2, r1, new C62503Gk(), starredMessagesActivity);
            starredMessagesActivity.A02 = C36391kE.A0Z(r2);
            starredMessagesActivity.A01 = (C57222xt) r4.A18.get();
            starredMessagesActivity.A04 = (AnonymousClass1NO) r2.A7t.get();
            starredMessagesActivity.A03 = r2.A7p();
        }
    }

    public AnonymousClass2JE() {
        C89334Wd.A00(this, 0);
    }
}
