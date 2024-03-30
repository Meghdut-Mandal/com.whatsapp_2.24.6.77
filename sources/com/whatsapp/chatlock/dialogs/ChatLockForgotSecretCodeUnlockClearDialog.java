package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass11F;
import X.AnonymousClass21S;
import X.AnonymousClass3L5;
import X.AnonymousClass4XL;
import X.C34301gn;
import X.C36331k8;
import X.C36361kB;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public final class ChatLockForgotSecretCodeUnlockClearDialog extends Hilt_ChatLockForgotSecretCodeUnlockClearDialog {
    public int A00;
    public DialogInterface.OnClickListener A01;
    public AnonymousClass3L5 A02;

    public Dialog A1a(Bundle bundle) {
        AnonymousClass3L5 r4 = this.A02;
        if (r4 != null) {
            r4.A04((AnonymousClass11F) null, Integer.valueOf(this.A00), C36361kB.A0i(), 7);
            this.A04 = C34301gn.DESTRUCTIVE;
            AnonymousClass21S A002 = AnonymousClass21S.A00(A0a());
            A002.A0e(R.string.f12nameremoved);
            A002.A0d(R.string.f12nameremoved);
            A002.A0g(AnonymousClass4XL.A00(this, 41), R.string.f12nameremoved);
            A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            return A002.create();
        }
        throw C36331k8.A0d("chatLockLogger");
    }

    public ChatLockForgotSecretCodeUnlockClearDialog(DialogInterface.OnClickListener onClickListener, int i) {
        this.A00 = i;
        this.A01 = onClickListener;
    }
}
