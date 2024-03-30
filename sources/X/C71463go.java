package X;

import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.util.Log;

/* renamed from: X.3go  reason: invalid class name and case insensitive filesystem */
public final class C71463go implements C159417jK {
    public final WfalManager A00;
    public final AnonymousClass1UA A01;
    public final AnonymousClass005 A02;

    public void BV1() {
        Log.w("WaffleDailyLogger/ Skip logging as feature is disabled");
    }

    public C71463go(WfalManager wfalManager, AnonymousClass1UA r2, AnonymousClass005 r3) {
        C36321k7.A11(r3, wfalManager, r2);
        this.A02 = r3;
        this.A00 = wfalManager;
        this.A01 = r2;
    }
}
