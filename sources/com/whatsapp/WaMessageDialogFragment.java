package com.whatsapp;

import X.AnonymousClass00C;
import X.AnonymousClass011;
import X.AnonymousClass01z;
import X.AnonymousClass21S;
import X.C05430Pr;
import X.C135046c2;
import X.C163437qC;
import X.C36341k9;
import X.C36381kD;
import X.C36401kF;
import X.C90464aC;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.base.WaDialogFragment;
import java.util.List;

public final class WaMessageDialogFragment extends WaDialogFragment {
    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        C135046c2 r1;
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass01z A0l = A0l();
        AnonymousClass011[] r2 = new AnonymousClass011[2];
        C36341k9.A1J("action_type", "message_dialog_dismissed", r2, 0);
        Parcelable parcelable = A0b().getParcelable("message_dialog_parameters");
        if (!(parcelable instanceof C135046c2) || (r1 = (C135046c2) parcelable) == null) {
            str = null;
        } else {
            str = r1.A04;
        }
        C90464aC.A1F("dialog_tag", str, r2);
        A0l.A0o("message_dialog_action", C05430Pr.A00(r2));
    }

    public Dialog A1a(Bundle bundle) {
        C135046c2 r4;
        Parcelable parcelable = A0b().getParcelable("message_dialog_parameters");
        if (!(parcelable instanceof C135046c2) || (r4 = (C135046c2) parcelable) == null) {
            throw C36381kD.A0k();
        }
        AnonymousClass21S r3 = new AnonymousClass21S(A0a(), R.style.f13nameremoved);
        r3.A0c();
        Integer num = r4.A03;
        if (num != null) {
            r3.A0e(num.intValue());
        }
        Integer num2 = r4.A01;
        if (num2 != null) {
            int intValue = num2.intValue();
            List list = r4.A06;
            if (list == null || list.isEmpty()) {
                r3.A0d(intValue);
            } else {
                r3.A0h(C36401kF.A0q(this, list, new Object[1], 0, intValue));
            }
        }
        String str = r4.A05;
        if (str != null) {
            r3.A0h(str);
        }
        r3.setPositiveButton(r4.A00, new C163437qC(r4, this, 1));
        Integer num3 = r4.A02;
        if (num3 != null) {
            r3.setNegativeButton(num3.intValue(), new C163437qC(r4, this, 2));
        }
        return r3.create();
    }
}
