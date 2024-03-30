package X;

import android.content.Intent;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.3vF  reason: invalid class name and case insensitive filesystem */
public class C80343vF implements Runnable {
    public long A00;
    public long A01;
    public Object A02;
    public final int A03;

    public C80343vF(Object obj, int i, long j, long j2) {
        this.A03 = i;
        this.A02 = obj;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void run() {
        Intent A0I;
        switch (this.A03) {
            case 0:
                ExportMigrationActivity.A07((ExportMigrationActivity) this.A02, this.A00 - this.A01);
                return;
            case 1:
                IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel = (IndiaUpiPauseMandateViewModel) this.A02;
                long j = this.A00;
                long j2 = this.A01;
                C175708av r0 = indiaUpiPauseMandateViewModel.A01.A0A;
                C18740tg.A06(r0);
                C201599jw r2 = ((C175928bI) r0).A0G;
                C18740tg.A06(r2);
                C201169iz r1 = new C201169iz();
                r1.A02 = "PAUSE";
                r1.A03 = "PENDING";
                r1.A01 = j;
                r1.A00 = j2;
                r2.A0B = r1;
                AnonymousClass1EU r02 = indiaUpiPauseMandateViewModel.A09;
                AnonymousClass1EU.A00(r02);
                r02.A05.A0a(indiaUpiPauseMandateViewModel.A01);
                indiaUpiPauseMandateViewModel.A03.A0H(new C1497372o(indiaUpiPauseMandateViewModel, 5));
                return;
            default:
                VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A02;
                long j3 = this.A00;
                long j4 = this.A01;
                if (!C36431kI.A1U(verifyPhoneNumber)) {
                    AnonymousClass3SJ.A00(verifyPhoneNumber, 43);
                }
                if (verifyPhoneNumber.A02 == 0) {
                    A0I = AnonymousClass190.A19(verifyPhoneNumber, (String) null, -1, 0, 0, j3, j4, 0, 0, verifyPhoneNumber.A1V, C36431kI.A1U(verifyPhoneNumber), verifyPhoneNumber.A1H, false, false);
                } else {
                    A0I = AnonymousClass190.A0I(verifyPhoneNumber, 0, 3, j3, j4, 0, verifyPhoneNumber.A1H, verifyPhoneNumber.A1V);
                }
                C29501Ww.A02(verifyPhoneNumber.A0r, verifyPhoneNumber.A3i(), true);
                verifyPhoneNumber.finish();
                verifyPhoneNumber.startActivity(A0I);
                return;
        }
    }
}
