package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass11F;
import X.AnonymousClass21S;
import X.AnonymousClass3L5;
import X.C235718z;
import X.C34301gn;
import X.C36331k8;
import X.C36361kB;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public final class ChatLockConfirmUnlockClearDialog extends Hilt_ChatLockConfirmUnlockClearDialog {
    public C235718z A00;
    public AnonymousClass3L5 A01;
    public int A02;
    public DialogInterface.OnClickListener A03;

    public Dialog A1a(Bundle bundle) {
        AnonymousClass3L5 r4 = this.A01;
        if (r4 != null) {
            r4.A04((AnonymousClass11F) null, Integer.valueOf(this.A02), C36361kB.A0i(), 16);
            this.A04 = C34301gn.DESTRUCTIVE;
            AnonymousClass21S A002 = AnonymousClass21S.A00(A0a());
            A002.A0e(R.string.f12nameremoved);
            A002.A0h(A0n(R.string.f12nameremoved));
            A002.A0g(this.A03, R.string.f12nameremoved);
            A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            return A002.create();
        }
        throw C36331k8.A0d("chatLockLogger");
    }

    public ChatLockConfirmUnlockClearDialog(DialogInterface.OnClickListener onClickListener, int i) {
        this.A02 = i;
        this.A03 = onClickListener;
    }
}
