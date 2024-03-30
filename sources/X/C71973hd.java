package X;

import com.whatsapp.util.Log;

/* renamed from: X.3hd  reason: invalid class name and case insensitive filesystem */
public class C71973hd implements AnonymousClass4T3 {
    public final /* synthetic */ C20260xH A00;
    public final /* synthetic */ boolean A01;

    public C71973hd(C20260xH r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void Bi3(C20760y7 r6) {
        Log.i("companion/deregister/sendCompanionDeviceLogoutRequest/onSuccess");
        C20260xH r4 = this.A00;
        r4.A0H.post(new C35231iM(1, (Object) r4, this.A01));
    }

    public void BWc(C20760y7 r6, int i) {
        C36321k7.A1T("companion/deregister/sendCompanionDeviceLogoutRequest/onError: ", AnonymousClass000.A0u(), i);
        C20260xH r4 = this.A00;
        r4.A0H.post(new C35231iM(1, (Object) r4, this.A01));
    }
}
