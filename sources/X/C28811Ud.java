package X;

import com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher;
import com.whatsapp.messaging.offline.DelayedStanzasFetcher$onAppForegrounded$1;
import com.whatsapp.util.Log;

/* renamed from: X.1Ud  reason: invalid class name and case insensitive filesystem */
public final class C28811Ud implements AnonymousClass0z8 {
    public final AnonymousClass00T A00;
    public final AnonymousClass00T A01;
    public final AnonymousClass040 A02;
    public volatile boolean A03 = true;

    public C28811Ud(C20810yC r3, AnonymousClass19A r4, AnonymousClass040 r5) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r5, 3);
        this.A02 = r5;
        this.A00 = new AnonymousClass00U(new C28821Ue(r4));
        this.A01 = new AnonymousClass00U(new C28831Uf(r3));
    }

    public void BRC() {
        this.A03 = false;
        if (((DelayedStanzasFetcher$StanzaFetcher) this.A00.getValue()).A00.get() && ((Boolean) this.A01.getValue()).booleanValue()) {
            Log.i("DelayedStanzasManager/onAppForegrounded pulling delayed notifications");
            AnonymousClass040 r3 = this.A02;
            DelayedStanzasFetcher$onAppForegrounded$1 delayedStanzasFetcher$onAppForegrounded$1 = new DelayedStanzasFetcher$onAppForegrounded$1(this, (C023509x) null);
            AnonymousClass0A2.A02(C023109s.A00, C008903u.A00, delayedStanzasFetcher$onAppForegrounded$1, r3);
        }
    }

    public void onAppBackgrounded() {
        this.A03 = true;
    }
}
