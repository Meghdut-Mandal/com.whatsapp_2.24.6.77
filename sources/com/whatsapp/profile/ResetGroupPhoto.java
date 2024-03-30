package com.whatsapp.profile;

import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass3LW;
import X.C224914p;
import X.C27111My;
import X.C36331k8;
import X.C36341k9;
import X.C36421kH;
import X.C39001qm;
import X.C89354Wf;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class ResetGroupPhoto extends C224914p {
    public boolean A00;

    public class ConfirmDialogFragment extends Hilt_ResetGroupPhoto_ConfirmDialogFragment {
        public static ConfirmDialogFragment A03(boolean z) {
            ConfirmDialogFragment confirmDialogFragment = new ConfirmDialogFragment();
            Bundle A07 = AnonymousClass001.A07();
            A07.putBoolean("IS_COMMUNITY_KEY", z);
            confirmDialogFragment.A17(A07);
            return confirmDialogFragment;
        }

        public Dialog A1a(Bundle bundle) {
            boolean z = A0b().getBoolean("IS_COMMUNITY_KEY", false);
            int i = R.string.f12nameremoved;
            if (z) {
                i = R.string.f12nameremoved;
            }
            C39001qm A04 = AnonymousClass3LW.A04(this);
            C39001qm.A08(A04, i);
            C39001qm.A0C(A04, this, 2, R.string.f12nameremoved);
            C39001qm.A0D(A04, this, 3, R.string.f12nameremoved);
            return A04.create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            AnonymousClass01I A0h = A0h();
            if (A0h != null) {
                A0h.finish();
                A0h.overridePendingTransition(17432576, 17432577);
            }
        }
    }

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            this.A04 = C36341k9.A0Z(((C27111My) C36421kH.A0H(this)).A5g);
        }
    }

    public ResetGroupPhoto(int i) {
        this.A00 = false;
        C89354Wf.A00(this, 28);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        boolean A1T = C36421kH.A1T(getIntent(), "IS_COMMUNITY_KEY");
        if (bundle == null) {
            C36331k8.A12(ConfirmDialogFragment.A03(A1T), this);
        }
    }

    public ResetGroupPhoto() {
        this(0);
    }
}
