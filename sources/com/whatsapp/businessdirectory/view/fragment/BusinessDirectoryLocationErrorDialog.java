package com.whatsapp.businessdirectory.view.fragment;

import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass0FM;
import X.AnonymousClass3LW;
import X.C129006Eo;
import X.C132296Sz;
import X.C160407kx;
import X.C36361kB;
import X.C36411kG;
import X.C36421kH;
import X.C39001qm;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class BusinessDirectoryLocationErrorDialog extends Hilt_BusinessDirectoryLocationErrorDialog {
    public C129006Eo A00;
    public C132296Sz A01;
    public C160407kx A02;
    public boolean A03;

    public void A1O(Context context) {
        AnonymousClass00C.A0D(context, 0);
        super.A1O(context);
        AnonymousClass02E r1 = this.A0I;
        if (r1 instanceof C160407kx) {
            this.A02 = (C160407kx) r1;
        }
    }

    public void A1R(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.A1R(bundle);
        bundle.putBoolean("saved_state_settings_clicked", this.A03);
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onCancel(dialogInterface);
        C160407kx r0 = this.A02;
        if (r0 != null) {
            r0.BWz();
        }
    }

    public void A19() {
        super.A19();
        this.A02 = null;
    }

    public void A1L() {
        super.A1L();
        if (this.A03) {
            this.A03 = false;
            C160407kx r0 = this.A02;
            if (r0 != null) {
                r0.BfT();
            }
            A1b();
        }
    }

    public Dialog A1a(Bundle bundle) {
        View A0D = C36421kH.A0D(A1D(), R.layout.f9nameremoved);
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0j(A0D);
        A04.A0r(true);
        AnonymousClass0FM create = A04.create();
        AnonymousClass00C.A08(create);
        View A0G = C36361kB.A0G(A0D, R.id.btn_pick_on_map);
        View A0G2 = C36361kB.A0G(A0D, R.id.btn_settings);
        View A0G3 = C36361kB.A0G(A0D, R.id.btn_cancel);
        create.setCanceledOnTouchOutside(true);
        C36411kG.A1C(A0G, this, create, 26);
        C36361kB.A18(A0G2, this, 47);
        C36411kG.A1C(A0G3, this, create, 27);
        if (bundle != null && bundle.getBoolean("saved_state_settings_clicked", false)) {
            this.A03 = true;
        }
        return create;
    }
}
