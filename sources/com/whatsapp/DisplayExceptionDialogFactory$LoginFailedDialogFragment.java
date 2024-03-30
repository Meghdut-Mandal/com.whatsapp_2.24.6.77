package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1N3;
import X.AnonymousClass1RU;
import X.AnonymousClass3LW;
import X.AnonymousClass3U8;
import X.AnonymousClass4XS;
import X.AnonymousClass6RR;
import X.AnonymousClass6YV;
import X.C012005e;
import X.C19420v0;
import X.C19730wQ;
import X.C19900wh;
import X.C19970wo;
import X.C20810yC;
import X.C21060yb;
import X.C24801Dv;
import X.C29501Ww;
import X.C32691e2;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C39001qm;
import X.C66923Xv;
import X.C82303yU;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class DisplayExceptionDialogFactory$LoginFailedDialogFragment extends Hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment {
    public C24801Dv A00;
    public AnonymousClass17Y A01;
    public C32691e2 A02;
    public C19730wQ A03;
    public AnonymousClass1N3 A04;
    public AnonymousClass1RU A05;
    public C21060yb A06;
    public C19970wo A07;
    public C19420v0 A08;
    public C19900wh A09;
    public C29501Ww A0A;

    public static void A03(Activity activity, DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment) {
        String A0h = displayExceptionDialogFactory$LoginFailedDialogFragment.A08.A0h();
        String A0f = displayExceptionDialogFactory$LoginFailedDialogFragment.A08.A0f();
        Intent A022 = AnonymousClass190.A02(activity);
        if (C19970wo.A00(displayExceptionDialogFactory$LoginFailedDialogFragment.A07) < C36341k9.A0B(C36341k9.A0E(displayExceptionDialogFactory$LoginFailedDialogFragment.A08), "post_reg_notification_time") + 1800000) {
            A022.putExtra("com.whatsapp.registration.RegisterPhone.phone_number", A0h);
            A022.putExtra("com.whatsapp.registration.RegisterPhone.country_code", A0f);
            A022.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", false);
        }
        displayExceptionDialogFactory$LoginFailedDialogFragment.A0A.A03();
        C29501Ww.A02(displayExceptionDialogFactory$LoginFailedDialogFragment.A0A, 0, true);
        activity.startActivity(A022);
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A052;
        boolean z = true;
        if (this.A05.A0A()) {
            String A042 = AnonymousClass3U8.A04(C36351kA.A0j(C36381kD.A0T(this.A03)));
            View A0K = C36381kD.A0K(LayoutInflater.from(A0i()), R.layout.f9nameremoved);
            A052 = AnonymousClass3LW.A05(this);
            A052.A0r(false);
            A052.A0j(A0K);
            TextEmojiLabel A0O = C36401kF.A0O(A0K, R.id.dialog_message);
            View A022 = C012005e.A02(A0K, R.id.log_back_in_button);
            View A023 = C012005e.A02(A0K, R.id.remove_account_button);
            String A0v = C36391kE.A0v(A0a(), this.A01.A0H(A042), new Object[1], 0, R.string.f12nameremoved);
            A0O.setText(A0v);
            Context context = A0K.getContext();
            C20810yC r12 = this.A02;
            AnonymousClass6YV.A0G(context, this.A00, this.A01, A0O, this.A06, r12, A0v, new C82303yU(this));
            C36421kH.A14(A022, this, A042, 0);
            C66923Xv.A01(A023, this, 12);
        } else {
            String A0t = C36371kC.A0t(C36341k9.A0E(this.A08), "logout_message_locale");
            if (A0t == null || !this.A01.A06().equals(A0t)) {
                z = false;
            }
            A052 = AnonymousClass3LW.A05(this);
            A052.A0r(false);
            String A0t2 = C36371kC.A0t(C36341k9.A0E(this.A08), "main_button_text");
            if (!z || AnonymousClass6RR.A00(A0t2)) {
                A0t2 = A0a().getString(R.string.f12nameremoved);
            }
            A052.A0i(new AnonymousClass4XS(0, this, z), A0t2);
            String A0t3 = C36371kC.A0t(C36341k9.A0E(this.A08), "secondary_button_text");
            if (!z || AnonymousClass6RR.A00(A0t3)) {
                A0t3 = A0a().getString(R.string.f12nameremoved);
            }
            A052.A00.A0Q(new AnonymousClass4XS(1, this, z), A0t3);
            String string = C36341k9.A0E(this.A08).getString("logout_message_header", (String) null);
            String string2 = C36341k9.A0E(this.A08).getString("logout_message_subtext", (String) null);
            if (!z || AnonymousClass6RR.A00(string)) {
                string = A0a().getString(R.string.f12nameremoved);
            } else if (!AnonymousClass6RR.A00(string2)) {
                string = AnonymousClass000.A0p("\n\n", string2, AnonymousClass000.A0v(string));
            }
            A052.A0p(string);
        }
        return A052.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C36341k9.A15(this);
    }
}
