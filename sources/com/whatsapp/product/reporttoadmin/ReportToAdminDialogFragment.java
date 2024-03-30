package com.whatsapp.product.reporttoadmin;

import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass17Y;
import X.AnonymousClass1A1;
import X.AnonymousClass3T1;
import X.AnonymousClass3UJ;
import X.C188648zz;
import X.C26151Jb;
import X.C36331k8;
import X.C61623Cu;
import X.C64933Qa;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;

public final class ReportToAdminDialogFragment extends Hilt_ReportToAdminDialogFragment {
    public AnonymousClass17Y A00;
    public C26151Jb A01;
    public AnonymousClass3T1 A02;
    public C61623Cu A03;
    public RtaXmppClient A04;
    public AnonymousClass1A1 A05;
    public boolean A06;

    public void onDismiss(DialogInterface dialogInterface) {
        String rawString;
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass3T1 r0 = this.A02;
        if (r0 == null) {
            throw C36331k8.A0d("selectedMessage");
        }
        AnonymousClass11F r02 = r0.A1J.A00;
        if (r02 != null && (rawString = r02.getRawString()) != null) {
            boolean z = this.A06;
            C61623Cu r1 = this.A03;
            if (r1 != null) {
                int i = 3;
                if (z) {
                    i = 2;
                }
                r1.A00(i, rawString);
                return;
            }
            throw C36331k8.A0d("rtaLoggingUtils");
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        C64933Qa A042 = AnonymousClass3UJ.A04(this);
        AnonymousClass1A1 r0 = this.A05;
        if (r0 != null) {
            AnonymousClass3T1 A032 = r0.A03(A042);
            if (A032 == null) {
                C26151Jb r2 = this.A01;
                if (r2 != null) {
                    r2.A00(C188648zz.A0P, (String) null);
                    return;
                }
                throw C36331k8.A0d("crashLogsWrapper");
            }
            this.A02 = A032;
            return;
        }
        throw C36331k8.A0d("fMessageDatabase");
    }
}
