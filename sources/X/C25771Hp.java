package X;

import com.whatsapp.companiondevice.sync.HistorySyncWorker;
import com.whatsapp.util.Log;

/* renamed from: X.1Hp  reason: invalid class name and case insensitive filesystem */
public class C25771Hp {
    public final C21570zS A00;

    public void A00() {
        Log.i("HistorySyncWorkManager/startHistorySync");
        Integer num = C023109s.A01;
        C97384pE r1 = new C97384pE(HistorySyncWorker.class);
        r1.A04(C023109s.A00);
        C1271667f r0 = new C1271667f();
        r0.A00 = num;
        r1.A03(r0.A00());
        ((AnonymousClass6VR) this.A00.get()).A07((C97404pG) r1.A00(), num, "HISTORY_SYNC_WORK_UNIQUE_NAME");
    }

    public C25771Hp(C21570zS r1) {
        this.A00 = r1;
    }
}
