package com.whatsapp.chatinfo;

import X.AnonymousClass01I;
import X.AnonymousClass3LW;
import X.C36381kD;
import X.C39001qm;
import X.C67853aw;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import com.whatsapp.R;

public class ChatMediaVisibilityOffDialog extends Hilt_ChatMediaVisibilityOffDialog {
    public Dialog A1a(Bundle bundle) {
        int i;
        AnonymousClass01I A0i = A0i();
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            i = bundle2.getInt("reason");
        } else {
            i = 0;
        }
        C39001qm A00 = AnonymousClass3LW.A00(A0i);
        TextView textView = (TextView) C36381kD.A0K(A0i.getLayoutInflater(), R.layout.f9nameremoved);
        if (i != 1) {
            textView.setText(R.string.f12nameremoved);
            A00.A0c(R.string.f12nameremoved);
        } else {
            textView.setText(R.string.f12nameremoved);
            C39001qm.A02(A0a(), A00, R.string.f12nameremoved);
        }
        AlertDialog$Builder alertDialog$Builder = A00.A00;
        alertDialog$Builder.A0Y(textView);
        alertDialog$Builder.A0Y(textView);
        A00.A0o(this, C67853aw.A00, A0n(R.string.f12nameremoved));
        return A00.create();
    }
}
