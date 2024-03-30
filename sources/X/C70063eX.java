package X;

import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.3eX  reason: invalid class name and case insensitive filesystem */
public class C70063eX implements AnonymousClass193 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C608439o A01;
    public final /* synthetic */ C65623Sv A02;

    public C70063eX(C65623Sv r1, C608439o r2, long j) {
        this.A02 = r1;
        this.A00 = j;
        this.A01 = r2;
    }

    public void Bec() {
        C65623Sv r0 = this.A02;
        AnonymousClass17Y r2 = r0.A03;
        C88884Uk r1 = r0.A0D;
        Objects.requireNonNull(r1);
        C81093wS.A00(r2, r1, 36);
    }

    public void Biq() {
        Log.i("CompanionDeviceQrHandler/handleSyncdDirty onSyncdDataDeleted");
        C65623Sv r4 = this.A02;
        r4.A0A.A0A(this.A00, true);
        r4.A08.unregisterObserver(this);
        r4.A03.A0H(new C80263v7(this, this.A01, 30));
    }

    public void Bir() {
        Log.e("CompanionDeviceQrHandler/handleSyncdDirty onSyncdDataDeletionFailed");
        C65623Sv r4 = this.A02;
        r4.A0A.A0A(this.A00, false);
        r4.A08.unregisterObserver(this);
        C81093wS.A00(r4.A03, this, 35);
    }
}
