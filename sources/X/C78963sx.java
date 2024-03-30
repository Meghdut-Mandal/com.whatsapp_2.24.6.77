package X;

import com.whatsapp.util.Log;

/* renamed from: X.3sx  reason: invalid class name and case insensitive filesystem */
public class C78963sx implements C88594Th {
    public final AnonymousClass005 A00;

    public /* synthetic */ void BRJ() {
    }

    public void BRI() {
        C21360z5 r5 = (C21360z5) this.A00.get();
        Log.i("Roadblocks/onAppUpdated");
        C19420v0 r4 = r5.A02;
        C36341k9.A0w(C19420v0.A00(r4), "software_forced_expiration", 0);
        Log.i("wa-shared-prefs/clear-client-expiration-time");
        C36341k9.A0u(C19420v0.A00(r4), "client_expiration_time");
        r5.A01 = false;
    }

    public C78963sx(AnonymousClass005 r1) {
        this.A00 = r1;
    }
}
