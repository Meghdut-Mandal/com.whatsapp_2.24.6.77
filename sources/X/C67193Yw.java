package X;

import android.view.KeyEvent;
import android.view.View;
import com.whatsapp.conversation.ConversationEntryActionButton;

/* renamed from: X.3Yw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67193Yw implements View.OnKeyListener {
    public final /* synthetic */ C88824Ue A00;
    public final /* synthetic */ ConversationEntryActionButton A01;

    public /* synthetic */ C67193Yw(C88824Ue r1, ConversationEntryActionButton conversationEntryActionButton) {
        this.A01 = conversationEntryActionButton;
        this.A00 = r1;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C90314Zx r1 = (C90314Zx) this.A00;
        if (r1.A01 != 0) {
            return false;
        }
        C70803fk r12 = (C70803fk) r1.A00;
        if (!r12.A6K || i != 23 || keyEvent.getAction() != 0 || r12.A2a()) {
            return false;
        }
        AnonymousClass2MC r0 = r12.A3s;
        if (r0 != null && r0.A02()) {
            return false;
        }
        C70803fk.A0p(r12);
        C70803fk.A0j(r12);
        if (r12.A2a()) {
            return false;
        }
        AnonymousClass6YP r02 = r12.A5Z;
        C18740tg.A06(r02);
        r02.A0W();
        return true;
    }
}
