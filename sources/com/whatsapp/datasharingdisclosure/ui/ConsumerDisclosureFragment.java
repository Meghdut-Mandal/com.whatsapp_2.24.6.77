package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass11F;
import X.AnonymousClass2PT;
import X.AnonymousClass3N9;
import X.AnonymousClass4BI;
import X.C21010yW;
import X.C30951b2;
import X.C36331k8;
import X.C36431kI;
import X.C51332ne;
import X.C51612o6;
import android.content.DialogInterface;
import android.os.Bundle;

public final class ConsumerDisclosureFragment extends Hilt_ConsumerDisclosureFragment {
    public C30951b2 A00;
    public AnonymousClass3N9 A01;
    public final AnonymousClass11F A02;
    public final Boolean A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(new AnonymousClass4BI(this));

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onCancel(dialogInterface);
        AnonymousClass3N9 r1 = this.A01;
        if (r1 != null) {
            C51612o6 A1m = A1m();
            if (A1m != C51612o6.BLOCKING_DISCLOSURE) {
                C21010yW r2 = r1.A00;
                AnonymousClass2PT r12 = new AnonymousClass2PT();
                r12.A01 = Integer.valueOf(AnonymousClass3N9.A00(A1m));
                AnonymousClass2PT.A00(r2, r12, 5);
                return;
            }
            return;
        }
        throw C36331k8.A0d("dataSharingCtwaDisclosureLogger");
    }

    public ConsumerDisclosureFragment(AnonymousClass11F r2, Boolean bool) {
        this.A02 = r2;
        this.A03 = bool;
    }

    public void A1Q(Bundle bundle) {
        C51612o6[] values = C51612o6.values();
        Bundle bundle2 = this.A0A;
        int i = 0;
        if (bundle2 != null) {
            i = bundle2.getInt("blocking_key", 0);
        }
        C51612o6 r1 = values[i];
        AnonymousClass00C.A0D(r1, 0);
        this.A06 = r1;
        if (bundle == null) {
            AnonymousClass3N9 r12 = this.A01;
            if (r12 != null) {
                C51612o6 A1m = A1m();
                if (A1m != C51612o6.BLOCKING_DISCLOSURE) {
                    C21010yW r2 = r12.A00;
                    AnonymousClass2PT r13 = new AnonymousClass2PT();
                    r13.A01 = Integer.valueOf(AnonymousClass3N9.A00(A1m));
                    AnonymousClass2PT.A00(r2, r13, 0);
                }
                if (A1m() != C51612o6.INFO) {
                    C30951b2 r14 = this.A00;
                    if (r14 != null) {
                        r14.A00(C51332ne.CTWA);
                    } else {
                        throw C36331k8.A0d("consumerDisclosureCooldownManager");
                    }
                }
            } else {
                throw C36331k8.A0d("dataSharingCtwaDisclosureLogger");
            }
        }
        super.A1Q(bundle);
    }
}
