package com.whatsapp.dialogs;

import X.AnonymousClass11F;
import X.AnonymousClass17Y;
import X.AnonymousClass1X4;
import X.AnonymousClass3LW;
import X.AnonymousClass3UW;
import X.AnonymousClass3UX;
import X.AnonymousClass3V7;
import X.AnonymousClass3Y0;
import X.C012005e;
import X.C18740tg;
import X.C19770wU;
import X.C220412q;
import X.C220712t;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36421kH;
import X.C39001qm;
import X.C66033Uk;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog$Builder;
import com.whatsapp.R;

public final class DeleteOrArchiveChatDialog extends Hilt_DeleteOrArchiveChatDialog {
    public AnonymousClass17Y A00;
    public AnonymousClass1X4 A01;
    public C220712t A02;
    public C220412q A03;
    public C19770wU A04;

    public Dialog A1a(Bundle bundle) {
        AnonymousClass11F A0N = C36421kH.A0N(A0b().getString("arg_chat_jid", (String) null));
        C18740tg.A06(A0N);
        View A0E = C36361kB.A0E(LayoutInflater.from(A1D()), (ViewGroup) null, R.layout.f9nameremoved);
        View A0G = C36361kB.A0G(A0E, R.id.checkbox);
        C39001qm A042 = AnonymousClass3LW.A04(this);
        A042.A0j(A0E);
        A042.A0m(this, new AnonymousClass3UX(A0G, this, A0N, 5), R.string.f12nameremoved);
        C220412q r0 = this.A03;
        if (r0 != null) {
            if (r0.A0N(A0N)) {
                A042.A0l(this, new C66033Uk(this, 36), R.string.f12nameremoved);
            } else {
                A042.A0l(this, new AnonymousClass3UW(A0N, this, 17), R.string.f12nameremoved);
                C66033Uk r3 = new C66033Uk(this, 35);
                AlertDialog$Builder alertDialog$Builder = A042.A00;
                String string = alertDialog$Builder.getContext().getString(R.string.f12nameremoved);
                AnonymousClass3V7 r02 = A042.A01;
                alertDialog$Builder.A0R(r02, string);
                r02.A01.A08(this, r3);
            }
            C36341k9.A0M(A0E, R.id.dialog_title).setText(C36341k9.A0G(this).getQuantityString(R.plurals.f10nameremoved, 1));
            C36341k9.A0M(A0E, R.id.dialog_message).setText(R.string.f12nameremoved);
            AnonymousClass3Y0.A01(C012005e.A02(A0E, R.id.checkbox_container), A0G, 12);
            return C36371kC.A0O(A042);
        }
        throw C36331k8.A0d("chatsCache");
    }
}
