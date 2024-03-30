package X;

import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.3qL  reason: invalid class name and case insensitive filesystem */
public class C77343qL implements C23045B1q {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ VerifyPhoneNumber A02;

    public C77343qL(VerifyPhoneNumber verifyPhoneNumber, long j, long j2) {
        this.A02 = verifyPhoneNumber;
        this.A00 = j;
        this.A01 = j2;
    }

    public void BmG() {
        VerifyPhoneNumber verifyPhoneNumber = this.A02;
        if (verifyPhoneNumber.A0c.A02("android.permission.RECEIVE_SMS") == 0) {
            VerifyPhoneNumber.A1K(verifyPhoneNumber, this.A00, this.A01);
        } else {
            C65983Uf.A0N(verifyPhoneNumber, 701);
        }
    }

    public void Bus() {
        VerifyPhoneNumber verifyPhoneNumber = this.A02;
        verifyPhoneNumber.A1V = true;
        VerifyPhoneNumber.A1K(verifyPhoneNumber, this.A00, this.A01);
    }
}
