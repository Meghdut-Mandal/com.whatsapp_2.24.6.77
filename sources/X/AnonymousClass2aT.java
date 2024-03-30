package X;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2aT  reason: invalid class name */
public final class AnonymousClass2aT extends AnonymousClass6FH {
    public final AnonymousClass16D A00;
    public final C19420v0 A01;

    public int A00(boolean z) {
        return z ? 288 : 289;
    }

    public String A03() {
        return C36371kC.A0t(C36341k9.A0E(this.A01), "last_seen_block_list_hash");
    }

    public HashSet A04() {
        Cursor A03;
        AnonymousClass1M0 A032 = this.A00.A05.A00.get();
        try {
            A03 = C229416o.A03(A032, "SELECT jid FROM wa_last_seen_block_list", "CONTACT_LAST_SEEN_BLOCK_LIST", (String[]) null);
            HashSet A08 = C229516p.A08(A03, "contact-mgr-db/unable to get last seen block list");
            if (A03 != null) {
                A03.close();
            }
            A032.close();
            return A08;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A05(String str, Set set, boolean z) {
        C229516p r2 = this.A00.A05;
        C224214g A0g = C36361kB.A0g();
        C229516p.A0E(r2, "wa_last_seen_block_list", set);
        A0g.A00();
        C19420v0 r3 = this.A01;
        C36341k9.A0x(C36331k8.A05(r3), "last_seen_block_list_hash", str);
        if (z) {
            C36341k9.A0v(C19420v0.A00(r3), "privacy_last_seen", 3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2aT(AnonymousClass16D r2, C19420v0 r3, AnonymousClass19A r4, AnonymousClass3MB r5, C19770wU r6) {
        super(r4, r5, r6, "last");
        C36321k7.A18(r6, r4, r2, r3);
        this.A00 = r2;
        this.A01 = r3;
    }
}
