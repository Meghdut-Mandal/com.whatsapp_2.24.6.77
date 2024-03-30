package com.whatsapp.group;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass14B;
import X.AnonymousClass1NC;
import X.AnonymousClass3LW;
import X.AnonymousClass3Y2;
import X.AnonymousClass4XN;
import X.C21010yW;
import X.C36321k7;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C39001qm;
import X.C44432Nm;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;

public final class ReportGroupPrivacyTipDialogFragment extends WaDialogFragment {
    public int A00 = 4;
    public final C21010yW A01;
    public final AnonymousClass1NC A02;
    public final boolean A03;

    public Dialog A1a(Bundle bundle) {
        C21010yW r2 = this.A01;
        C44432Nm r1 = new C44432Nm();
        r1.A00 = 1;
        r2.Blv(r1);
        View A0K = C36381kD.A0K(A0c(), R.layout.f9nameremoved);
        AnonymousClass00C.A08(A0K);
        Context A0a = A0a();
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = AnonymousClass14B.A03(A0a(), R.color.f6nameremoved);
        Spanned A012 = AnonymousClass14B.A01(A0a, A0L, R.string.f12nameremoved);
        AnonymousClass00C.A08(A012);
        C36371kC.A1E(A0K, A012, R.id.group_privacy_tip_text);
        AnonymousClass3Y2.A00(A0K.findViewById(R.id.group_privacy_tip_banner), this, 39);
        if (this.A03) {
            C36391kE.A0P(A0K, R.id.report_privacy_tip_dialog_body).setText(R.string.f12nameremoved);
        }
        C39001qm A05 = AnonymousClass3LW.A05(this);
        A05.A0j(A0K);
        A05.setPositiveButton(R.string.f12nameremoved, new AnonymousClass4XN(this, 27));
        return C36371kC.A0O(A05);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        int i = this.A00;
        C21010yW r2 = this.A01;
        C44432Nm r1 = new C44432Nm();
        r1.A00 = Integer.valueOf(i);
        r2.Blv(r1);
    }

    public ReportGroupPrivacyTipDialogFragment(AnonymousClass1NC r2, C21010yW r3, boolean z) {
        C36321k7.A0x(r3, r2);
        this.A01 = r3;
        this.A02 = r2;
        this.A03 = z;
    }
}
