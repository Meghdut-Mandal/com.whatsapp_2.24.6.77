package com.whatsapp.conversation.delegate;

import X.AnonymousClass012;
import X.AnonymousClass01P;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.C70803fk;
import androidx.fragment.app.DialogFragment;

public class ConversationDelegate$52 implements AnonymousClass01Y {
    public final /* synthetic */ C70803fk A00;

    public ConversationDelegate$52(C70803fk r1) {
        this.A00 = r1;
    }

    public void BhM(AnonymousClass05R r4, AnonymousClass012 r5) {
        DialogFragment dialogFragment;
        if (r4.A01() == AnonymousClass01P.RESUMED) {
            C70803fk r2 = this.A00;
            r2.A2l.getLifecycle().A05(this);
            if (r2.A3j != null && (dialogFragment = (DialogFragment) C70803fk.A06(r2).A0N("expressions_search_dialog_fragment")) != null && dialogFragment.A12()) {
                dialogFragment.A1b();
                C70803fk.A0e(r2);
            }
        }
    }
}
