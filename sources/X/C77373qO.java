package X;

import com.whatsapp.registration.phonenumberentry.RegisterPhone;
import com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel;

/* renamed from: X.3qO  reason: invalid class name and case insensitive filesystem */
public class C77373qO implements AnonymousClass4UD {
    public final /* synthetic */ RegisterPhone A00;

    public void Bu0() {
    }

    public C77373qO(RegisterPhone registerPhone) {
        this.A00 = registerPhone;
    }

    public void BKB() {
        this.A00.A05.Bp3(new C81153wY((Object) this, 11));
    }

    public void BX8(AnonymousClass3OL r4, String str, String str2, int i, long j) {
        int i2;
        RegisterPhone registerPhone = this.A00;
        registerPhone.A3j();
        ExistViewModel existViewModel = registerPhone.A0P;
        if (r4 != null) {
            i2 = r4.A07;
        } else {
            i2 = 0;
        }
        C36341k9.A16(existViewModel.A0G, i2);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RegisterPhone/retryExistCall/onExistCheckResponse/device switching eligibility ");
        C36321k7.A1Y(A0u, AnonymousClass24S.A01(registerPhone));
        RegisterPhone.A0o(registerPhone, false);
    }
}
