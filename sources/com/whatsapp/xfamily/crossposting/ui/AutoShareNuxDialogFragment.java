package com.whatsapp.xfamily.crossposting.ui;

import X.AnonymousClass00C;
import X.AnonymousClass1UM;
import X.AnonymousClass1US;
import X.AnonymousClass3F7;
import X.AnonymousClass3LW;
import X.AnonymousClass4XQ;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C39001qm;
import X.C601036m;
import X.C606638w;
import X.C90264Zs;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class AutoShareNuxDialogFragment extends Hilt_AutoShareNuxDialogFragment {
    public static final AnonymousClass1US A03 = AnonymousClass1US.CROSSPOST_AUTO_SHARE_NUX_DIALOG_FRAGMENT;
    public AnonymousClass1UM A00;
    public boolean A01;
    public final C606638w A02;

    public AutoShareNuxDialogFragment(C606638w r1) {
        this.A02 = r1;
    }

    public Dialog A1a(Bundle bundle) {
        AnonymousClass3F7 r5 = new AnonymousClass3F7(A0a());
        r5.A06 = A0n(R.string.f12nameremoved);
        r5.A05 = A0n(R.string.f12nameremoved);
        r5.A04 = Integer.valueOf(C36351kA.A02(A1D(), A0a(), R.attr.f4nameremoved, R.color.f6nameremoved));
        String A0n = A0n(R.string.f12nameremoved);
        AnonymousClass1UM r1 = this.A00;
        if (r1 != null) {
            boolean A1Z = C36341k9.A1Z(r1.A01(A03));
            r5.A07.add(new C601036m(new C90264Zs(this, 2), A0n, A1Z));
            r5.A01 = 28;
            r5.A02 = 16;
            C39001qm A05 = AnonymousClass3LW.A05(this);
            A05.A0j(r5.A00());
            A05.setNegativeButton(R.string.f12nameremoved, new AnonymousClass4XQ(this, 36));
            AnonymousClass4XQ.A00(A05, this, 35, R.string.f12nameremoved);
            A1g(false);
            AnonymousClass00C.A0D("AutoShareNuxDialogFragment Opening auto share nux dialog", 0);
            return C36371kC.A0O(A05);
        }
        throw C36331k8.A0d("fbAccountManager");
    }
}
