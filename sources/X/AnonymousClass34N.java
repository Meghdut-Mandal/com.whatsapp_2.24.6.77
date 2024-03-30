package X;

import android.os.Handler;
import com.whatsapp.account.delete.DeleteAccountActivity;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.phonematching.MatchPhoneNumberFragment;
import com.whatsapp.registration.phonenumberentry.ChangeNumber;

/* renamed from: X.34N  reason: invalid class name */
public class AnonymousClass34N implements AnonymousClass4TQ {
    public Object A00;
    public final int A01;

    public AnonymousClass34N(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bbm(int i) {
        C61573Co r0;
        Handler handler;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                r0 = ((DeleteAccountActivity) obj).A05;
                break;
            case 1:
                r0 = ((C46502Ya) obj).A03;
                break;
            default:
                handler = ((ChangeNumber) obj).A0L;
                break;
        }
        if (r0 != null) {
            handler = r0.A00.A02;
            handler.sendEmptyMessage(3);
        }
    }

    public void Bbn(String str) {
        C61573Co r0;
        Handler handler;
        int i;
        String str2;
        switch (this.A01) {
            case 0:
                r0 = ((DeleteAccountActivity) this.A00).A05;
                break;
            case 1:
                r0 = ((C46502Ya) this.A00).A03;
                break;
            default:
                ChangeNumber changeNumber = (ChangeNumber) this.A00;
                PhoneUserJid A0j = C36411kG.A0j(changeNumber);
                if (A0j == null || (str2 = A0j.user) == null || !str2.equals(str)) {
                    handler = changeNumber.A0L;
                    i = 2;
                } else {
                    handler = changeNumber.A0L;
                    i = 1;
                }
                handler.sendEmptyMessage(i);
                return;
        }
        if (r0 != null) {
            MatchPhoneNumberFragment matchPhoneNumberFragment = r0.A00;
            String str3 = C36371kC.A0e(matchPhoneNumberFragment.A00).user;
            C18740tg.A06(str3);
            matchPhoneNumberFragment.A02.sendEmptyMessage(C36391kE.A00(str3.equals(str) ? 1 : 0));
        }
    }
}
