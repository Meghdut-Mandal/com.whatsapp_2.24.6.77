package com.whatsapp.profile;

import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass3LW;
import X.AnonymousClass3SJ;
import X.C19460v5;
import X.C19470v6;
import X.C224914p;
import X.C36331k8;
import X.C36341k9;
import X.C36431kI;
import X.C39001qm;
import X.C89354Wf;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class ResetPhoto extends C224914p {
    public C19460v5 A00;
    public boolean A01;

    public class ConfirmDialogFragment extends Hilt_ResetPhoto_ConfirmDialogFragment {
        public C19460v5 A00;

        public Dialog A1a(Bundle bundle) {
            Bundle bundle2 = this.A0A;
            int i = 0;
            if (bundle2 != null) {
                i = bundle2.getInt("photo_type", 0);
            }
            C39001qm A04 = AnonymousClass3LW.A04(this);
            if (i == 1) {
                this.A00.A02();
                throw AnonymousClass001.A0A("getRemoveCoverPhotoConfirmationStringId");
            }
            A04.A0c(R.string.f12nameremoved);
            A04.A0r(true);
            C39001qm.A0C(A04, this, 4, R.string.f12nameremoved);
            C39001qm.A0D(A04, this, 5, R.string.f12nameremoved);
            return A04.create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            AnonymousClass01I A0h = A0h();
            if (A0h != null && !AnonymousClass3SJ.A04(A0h)) {
                A0h.finish();
                A0h.overridePendingTransition(17432576, 17432577);
            }
        }
    }

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            this.A04 = C36341k9.A0Z(C36331k8.A0B(this));
            this.A00 = C19470v6.A00;
        }
    }

    public ResetPhoto(int i) {
        this.A01 = false;
        C89354Wf.A00(this, 29);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int A02 = C36431kI.A02(getIntent(), "photo_type");
        if (A02 == 1) {
            this.A00.A02();
            throw AnonymousClass001.A0A("getRemoveCoverPhotoStringId");
        }
        setTitle(R.string.f12nameremoved);
        if (bundle == null) {
            ConfirmDialogFragment confirmDialogFragment = new ConfirmDialogFragment();
            Bundle A07 = AnonymousClass001.A07();
            A07.putInt("photo_type", A02);
            confirmDialogFragment.A17(A07);
            C36331k8.A12(confirmDialogFragment, this);
        }
    }

    public ResetPhoto() {
        this(0);
    }
}
