package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass3LW;
import X.AnonymousClass4XL;
import X.C36331k8;
import X.C36371kC;
import X.C39001qm;
import X.C586430m;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.jid.UserJid;

public final class CommunityAdminDialogFragment extends WaDialogFragment {
    public int A00;
    public C586430m A01;
    public UserJid A02;

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onCancel(dialogInterface);
        UserJid userJid = this.A02;
        if (userJid != null) {
            C586430m r0 = this.A01;
            if (r0 == null) {
                throw C36331k8.A0d("callback");
            }
            C586430m.A00(this, r0, userJid);
        }
    }

    public Dialog A1a(Bundle bundle) {
        String string;
        String string2;
        Bundle A0b = A0b();
        if (A0b.containsKey("dialog_id")) {
            this.A00 = A0b.getInt("dialog_id");
            UserJid A022 = UserJid.Companion.A02(A0b.getString("user_jid"));
            this.A02 = A022;
            if (A022 != null) {
                C39001qm A04 = AnonymousClass3LW.A04(this);
                if (A0b.containsKey("title")) {
                    A04.A0q(A0b.getString("title"));
                }
                if (A0b.containsKey("message")) {
                    A04.A0p(A0b.getCharSequence("message"));
                }
                if (A0b.containsKey("positive_button") && (string2 = A0b.getString("positive_button")) != null) {
                    A04.A0i(AnonymousClass4XL.A00(this, 43), string2);
                }
                if (A0b.containsKey("negative_button") && (string = A0b.getString("negative_button")) != null) {
                    A04.A00.A0Q(AnonymousClass4XL.A00(this, 42), string);
                }
                return C36371kC.A0O(A04);
            }
            throw AnonymousClass001.A08("CommunityAdminDialogFragment/user jid must be passed in");
        }
        throw AnonymousClass001.A09("CommunityAdminDialogFragment/dialog_id should be provided.");
    }
}
