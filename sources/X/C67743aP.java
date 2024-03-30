package X;

import android.os.Bundle;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.3aP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67743aP implements AnonymousClass05T {
    public final /* synthetic */ ConversationsFragment A00;

    public /* synthetic */ C67743aP(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public final void BYP(String str, Bundle bundle) {
        ConversationsFragment conversationsFragment = this.A00;
        if ("request_bottom_sheet_fragment".equals(str)) {
            conversationsFragment.A1T.A00();
        }
        conversationsFragment.A0l().A0m("request_bottom_sheet_fragment");
    }
}
