package com.whatsapp.groupenforcements.ui;

import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass147;
import X.AnonymousClass3LW;
import X.AnonymousClass4XI;
import X.C32681e1;
import X.C36331k8;
import X.C36401kF;
import X.C39001qm;
import X.C61793Dl;
import X.C80293vA;
import X.C89714Xp;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import com.whatsapp.R;

public class CreateGroupSuspendDialog extends Hilt_CreateGroupSuspendDialog {
    public C61793Dl A00;
    public C32681e1 A01;

    public static CreateGroupSuspendDialog A03(AnonymousClass147 r2, boolean z) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("hasMe", z);
        A07.putParcelable("suspendedEntityId", r2);
        CreateGroupSuspendDialog createGroupSuspendDialog = new CreateGroupSuspendDialog();
        createGroupSuspendDialog.A17(A07);
        return createGroupSuspendDialog;
    }

    public void A1M() {
        super.A1M();
        TextView textView = (TextView) A1Z().findViewById(16908299);
        if (textView != null) {
            C36331k8.A10(textView, this.A02);
        }
    }

    public Dialog A1a(Bundle bundle) {
        AnonymousClass01I A0i = A0i();
        boolean z = A0b().getBoolean("hasMe");
        Parcelable parcelable = A0b().getParcelable("suspendedEntityId");
        C39001qm A002 = AnonymousClass3LW.A00(A0i);
        AnonymousClass4XI r6 = new AnonymousClass4XI(parcelable, A0i, this, 11);
        C89714Xp r1 = new C89714Xp(A0i, this, 18);
        if (z) {
            A002.A0Z(this.A01.A02(A0i, new C80293vA(this, A0i, 11), C36401kF.A0q(this, "learn-more", AnonymousClass001.A0L(), 0, R.string.f12nameremoved), "learn-more"));
            A002.setNegativeButton(R.string.f12nameremoved, r6);
        } else {
            A002.A0K(R.string.f12nameremoved);
            A002.setNegativeButton(R.string.f12nameremoved, r1);
        }
        A002.setPositiveButton(R.string.f12nameremoved, (DialogInterface.OnClickListener) null);
        return A002.create();
    }
}
