package X;

import com.whatsapp.service.RestoreChatConnectionWorker;
import com.whatsapp.util.Log;

/* renamed from: X.1JV  reason: invalid class name */
public class AnonymousClass1JV {
    public final C21060yb A00;
    public final C19630wG A01;
    public final C21570zS A02;

    public void A00() {
        Log.i("Scheduling job to restore chat connection");
        Integer num = C023109s.A01;
        C97384pE r1 = new C97384pE(RestoreChatConnectionWorker.class);
        C1271667f r0 = new C1271667f();
        r0.A00 = num;
        r1.A03(r0.A00());
        ((AnonymousClass6VR) this.A02.get()).A07((C97404pG) r1.A00(), num, "com.whatsapp.service.restoreChatConnection");
    }

    public AnonymousClass1JV(C21060yb r1, C19630wG r2, C21570zS r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
