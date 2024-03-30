package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass11F;
import X.AnonymousClass21S;
import X.AnonymousClass3L5;
import X.C34301gn;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public final class ChatLockPrivacySettingsUnlockClearDialog extends Hilt_ChatLockPrivacySettingsUnlockClearDialog {
    public AnonymousClass3L5 A00;
    public DialogInterface.OnClickListener A01;

    public Dialog A1a(Bundle bundle) {
        AnonymousClass3L5 r1 = this.A00;
        if (r1 != null) {
            Integer A0p = C36371kC.A0p();
            Integer A0i = C36361kB.A0i();
            r1.A04((AnonymousClass11F) null, A0p, A0i, 7);
            AnonymousClass3L5 r12 = this.A00;
            if (r12 != null) {
                r12.A04((AnonymousClass11F) null, A0p, A0i, 16);
                this.A04 = C34301gn.DESTRUCTIVE;
                AnonymousClass21S A002 = AnonymousClass21S.A00(A0a());
                A002.A0e(R.string.f12nameremoved);
                A002.A0h(A0n(R.string.f12nameremoved));
                A002.A0g(this.A01, R.string.f12nameremoved);
                A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
                return A002.create();
            }
            throw C36331k8.A0d("chatLockLogger");
        }
        throw C36331k8.A0d("chatLockLogger");
    }

    public ChatLockPrivacySettingsUnlockClearDialog(DialogInterface.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }
}
