package com.whatsapp.status;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass02E;
import X.AnonymousClass02N;
import X.AnonymousClass0FM;
import X.AnonymousClass17Y;
import X.AnonymousClass1A1;
import X.AnonymousClass1H2;
import X.AnonymousClass1X4;
import X.AnonymousClass331;
import X.AnonymousClass3LW;
import X.AnonymousClass3T1;
import X.AnonymousClass3UJ;
import X.C17730rw;
import X.C36321k7;
import X.C36331k8;
import X.C39001qm;
import X.C55432uc;
import X.C64933Qa;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public final class StatusDeleteDialogFragment extends Hilt_StatusDeleteDialogFragment {
    public AnonymousClass17Y A00;
    public AnonymousClass1X4 A01;
    public AnonymousClass1H2 A02;
    public AnonymousClass1A1 A03;
    public C17730rw A04;

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C17730rw r0 = this.A04;
        if (r0 != null) {
            r0.BVg(this, false);
        }
    }

    public Dialog A1a(Bundle bundle) {
        C17730rw r0 = this.A04;
        if (r0 != null) {
            r0.BVg(this, true);
        }
        C64933Qa A042 = AnonymousClass3UJ.A04(this);
        AnonymousClass1A1 r02 = this.A03;
        if (r02 != null) {
            AnonymousClass3T1 A032 = r02.A03(A042);
            AnonymousClass01I A0h = A0h();
            if (A0h != null) {
                AnonymousClass17Y r6 = this.A00;
                if (r6 != null) {
                    AnonymousClass1H2 r8 = this.A02;
                    if (r8 != null) {
                        AnonymousClass1X4 r7 = this.A01;
                        if (r7 != null) {
                            AnonymousClass0FM A002 = C55432uc.A00(A0h, r6, r7, r8, (AnonymousClass331) null, AnonymousClass02N.A02(A032));
                            if (A002 != null) {
                                return A002;
                            }
                            AnonymousClass01I A0h2 = A0h();
                            if (A0h2 != null) {
                                C39001qm A003 = AnonymousClass3LW.A00(A0h2);
                                A003.A0c(R.string.f12nameremoved);
                                return A003.create();
                            }
                            throw AnonymousClass001.A08("Required value was null.");
                        }
                        throw C36331k8.A0d("userActions");
                    }
                    throw C36331k8.A0d("emojiLoader");
                }
                throw C36321k7.A06();
            }
            throw AnonymousClass001.A08("Required value was null.");
        }
        throw C36331k8.A0d("fMessageDatabase");
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        try {
            AnonymousClass02E A0f = A0f();
            AnonymousClass00C.A0E(A0f, "null cannot be cast to non-null type com.whatsapp.status.StatusDeleteDialogFragment.Host");
            this.A04 = (C17730rw) A0f;
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }
}
