package X;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: X.9pG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C203979pG implements DialogInterface.OnClickListener {
    public final /* synthetic */ C179128jE A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C203979pG(C179128jE r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C179128jE r6 = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        dialogInterface.dismiss();
        C19770wU r2 = r6.A04;
        C50282kV r0 = r6.A0T;
        if (r0 != null && r0.A06() == 1) {
            r6.A0T.A0D(false);
        }
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("com.whatsapp.support.DescribeProblemActivity.from", str);
        C20050ww r9 = r6.A05;
        C50282kV r4 = new C50282kV(A07, r6, r6.A04, r6.A06, r9, r6.A00, (C207249un) null, (C202319lY) null, r6.A0D, r6.A0N, str);
        r6.A0T = r4;
        C36331k8.A1F(r4, r2);
        r6.A0S.BOm(C36361kB.A0i(), C165597tg.A0d(), str2, (String) null);
    }
}
