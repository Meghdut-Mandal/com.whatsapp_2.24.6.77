package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.util.Log;

/* renamed from: X.3ch  reason: invalid class name and case insensitive filesystem */
public class C68933ch implements AnonymousClass1ZW {
    public final /* synthetic */ DeleteAccountConfirmation A00;

    public C68933ch(DeleteAccountConfirmation deleteAccountConfirmation) {
        this.A00 = deleteAccountConfirmation;
    }

    public void Ba9() {
        Intent A02;
        DeleteAccountConfirmation deleteAccountConfirmation = this.A00;
        AnonymousClass3SJ.A00(deleteAccountConfirmation, 1);
        C223313w A08 = deleteAccountConfirmation.A02.A08();
        if (!deleteAccountConfirmation.A08.A0A() || A08 == null) {
            A02 = AnonymousClass190.A02(deleteAccountConfirmation);
        } else {
            Log.i("DeleteAccountConfirmation/onLocalAccountDeletionEnded/remove current account");
            A02 = AnonymousClass190.A1G(deleteAccountConfirmation, A08.getRawString(), deleteAccountConfirmation.A0A.A01(), deleteAccountConfirmation.A09.A0I(), 13, SystemClock.elapsedRealtime());
        }
        deleteAccountConfirmation.A33(A02, true);
    }

    public void BaA() {
        DeleteAccountConfirmation deleteAccountConfirmation = this.A00;
        AnonymousClass1UA r0 = deleteAccountConfirmation.A09;
        AnonymousClass6P0 r3 = C113395fT.A00;
        if (r0.A00(r3) != null) {
            deleteAccountConfirmation.A09.A05(new C90064Yy(deleteAccountConfirmation, 0), r3, (C128936Ee) null, (String) null);
        }
        deleteAccountConfirmation.A01.removeMessages(0);
        C19460v5 r1 = deleteAccountConfirmation.A04;
        if (r1.A05()) {
            r1.A02();
            throw AnonymousClass001.A0A("deleteWhatsappBAccount");
        }
    }
}
