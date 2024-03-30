package com.whatsapp.growthlock;

import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass0FM;
import X.AnonymousClass3LW;
import X.C33751fs;
import X.C36341k9;
import X.C39001qm;
import X.C89714Xp;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import com.whatsapp.R;

public class InviteLinkUnavailableDialogFragment extends Hilt_InviteLinkUnavailableDialogFragment {
    public C33751fs A00;

    public static InviteLinkUnavailableDialogFragment A03(boolean z, boolean z2) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("finishCurrentActivity", z);
        A07.putBoolean("isGroupStillLocked", z2);
        InviteLinkUnavailableDialogFragment inviteLinkUnavailableDialogFragment = new InviteLinkUnavailableDialogFragment();
        inviteLinkUnavailableDialogFragment.A17(A07);
        return inviteLinkUnavailableDialogFragment;
    }

    public Dialog A1a(Bundle bundle) {
        AnonymousClass01I A0h = A0h();
        boolean z = A0b().getBoolean("isGroupStillLocked");
        C89714Xp r4 = new C89714Xp(A0h, this, 19);
        TextView textView = (TextView) A0c().inflate(R.layout.f9nameremoved, (ViewGroup) null);
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        textView.setText(i);
        C39001qm A002 = AnonymousClass3LW.A00(A0h);
        AlertDialog$Builder alertDialog$Builder = A002.A00;
        alertDialog$Builder.A0Y(textView);
        alertDialog$Builder.A0Y(textView);
        int i2 = R.string.f12nameremoved;
        if (z) {
            i2 = R.string.f12nameremoved;
        }
        A002.A0c(i2);
        A002.A0r(true);
        A002.A0f(r4, R.string.f12nameremoved);
        A002.A0h((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
        AnonymousClass0FM create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (A0b().getBoolean("finishCurrentActivity")) {
            C36341k9.A15(this);
        }
    }
}
