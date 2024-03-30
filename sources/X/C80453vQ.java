package X;

import android.content.Intent;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.3vQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80453vQ implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ VerifyPhoneNumber A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C80453vQ(VerifyPhoneNumber verifyPhoneNumber, long j, long j2, boolean z) {
        this.A02 = verifyPhoneNumber;
        this.A03 = z;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void run() {
        Intent A0I;
        VerifyPhoneNumber verifyPhoneNumber = this.A02;
        boolean z = this.A03;
        long j = this.A00;
        long j2 = this.A01;
        AnonymousClass3SJ.A00(verifyPhoneNumber, 44);
        boolean z2 = verifyPhoneNumber.A1H;
        if (z) {
            A0I = AnonymousClass190.A0N(verifyPhoneNumber, j, j2, z2, verifyPhoneNumber.A1V);
        } else {
            A0I = AnonymousClass190.A0I(verifyPhoneNumber, 0, 1, j, j2, 0, z2, verifyPhoneNumber.A1V);
        }
        verifyPhoneNumber.finish();
        verifyPhoneNumber.startActivity(A0I);
        verifyPhoneNumber.overridePendingTransition(0, 0);
    }
}
