package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass3LW;
import X.AnonymousClass3UW;
import X.C34301gn;
import X.C36371kC;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class ChatsAreLockedDialogFragment extends Hilt_ChatsAreLockedDialogFragment {
    public static final void A03(Bundle bundle, ChatsAreLockedDialogFragment chatsAreLockedDialogFragment) {
        AnonymousClass00C.A0D(bundle, 0);
        bundle.putBoolean("result", false);
        chatsAreLockedDialogFragment.A0l().A0o("request_key", bundle);
        chatsAreLockedDialogFragment.A1b();
    }

    public static final void A05(Bundle bundle, ChatsAreLockedDialogFragment chatsAreLockedDialogFragment) {
        AnonymousClass00C.A0D(bundle, 0);
        bundle.putBoolean("result", true);
        chatsAreLockedDialogFragment.A0l().A0o("request_key", bundle);
        chatsAreLockedDialogFragment.A1b();
    }

    public Dialog A1a(Bundle bundle) {
        this.A04 = C34301gn.DESTRUCTIVE;
        Bundle A07 = AnonymousClass001.A07();
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0d(R.string.f12nameremoved);
        A04.A0c(R.string.f12nameremoved);
        A04.A0l(this, new AnonymousClass3UW(this, A07, 1), R.string.f12nameremoved);
        A04.A0m(this, new AnonymousClass3UW(this, A07, 2), R.string.f12nameremoved);
        return C36371kC.A0O(A04);
    }
}
