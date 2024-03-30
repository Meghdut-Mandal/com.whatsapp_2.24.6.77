package com.whatsapp.payments.ui;

import X.AE9;
import X.AnonymousClass000;
import X.AnonymousClass0FM;
import X.AnonymousClass155;
import X.AnonymousClass6PS;
import X.AnonymousClass8h5;
import X.AnonymousClass9SB;
import X.AnonymousClass9TJ;
import X.B7Y;
import X.C147166wm;
import X.C165567td;
import X.C165587tf;
import X.C165607th;
import X.C173908Tp;
import X.C178798ha;
import X.C180358ld;
import X.C18800tq;
import X.C18830tt;
import X.C199109ei;
import X.C201469jf;
import X.C203399nx;
import X.C27111My;
import X.C32691e2;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class BrazilDyiReportActivity extends C178798ha {
    public C147166wm A00;
    public AE9 A01;
    public AnonymousClass6PS A02;
    public C199109ei A03;
    public boolean A04;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r3 = A0L.A5g;
            C165567td.A11(r3, this);
            C18830tt r2 = r3.A00;
            C165567td.A0v(r3, r2, this, C36321k7.A05(r3, r2, this));
            this.A03 = (C32691e2) r3.A4R.get();
            this.A0H = (C201469jf) r2.A72.get();
            this.A0N = C36331k8.A0I(r3);
            this.A08 = C36341k9.A0T(r3);
            this.A0M = C165587tf.A0Z(r3);
            this.A0F = C36381kD.A0f(r3);
            C173908Tp.A01(r3, r2, C36371kC.A0Z(r3), this);
            this.A00 = (C147166wm) r2.A5F.get();
            this.A02 = C165607th.A0Z(r3);
            this.A01 = C27111My.A2m(A0L);
            this.A03 = C27111My.A2x(A0L);
        }
    }

    public void A3j(String str) {
        String str2 = this.A0O;
        String str3 = str;
        if (str2.equals("business")) {
            C180358ld r3 = this.A0L;
            r3.A0V(new AnonymousClass9SB((AnonymousClass155) null, (PinBottomSheetDialogFragment) null, r3, (String) null, -1), (C203399nx) null, str3);
        } else if (!str2.equals("personal")) {
            C36321k7.A1P("PAY: DyiReportBaseActivity/dyiReportButtonContainer::onClick - This payment account type is not supported. PaymentAccount = ", str2, AnonymousClass000.A0u());
        } else {
            PinBottomSheetDialogFragment A002 = AnonymousClass9TJ.A00();
            FingerprintBottomSheet fingerprintBottomSheet = null;
            if (Build.VERSION.SDK_INT >= 23) {
                fingerprintBottomSheet = FingerprintBottomSheet.A0A.A01();
            }
            this.A0L.A0T(this, fingerprintBottomSheet, new AnonymousClass8h5(this.A02, this.A07, this.A0C, this.A0I, this, str3), A002, str3, "DYIREPORT", this.A0V);
        }
    }

    public Dialog onCreateDialog(int i) {
        AnonymousClass0FM A012 = this.A03.A01((Bundle) null, this, i);
        if (A012 == null) {
            return super.onCreateDialog(i);
        }
        return A012;
    }

    public BrazilDyiReportActivity(int i) {
        this.A04 = false;
        B7Y.A00(this, 33);
    }

    public BrazilDyiReportActivity() {
        this(0);
    }
}
