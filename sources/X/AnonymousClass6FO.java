package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6FO  reason: invalid class name */
public class AnonymousClass6FO {
    public final C19890wg A00;
    public final AnonymousClass005 A01 = C165307tD.A00(this, 14);
    public final C19700wN A02;

    public C123895xG A00() {
        SharedPreferences A0H = C36391kE.A0H(this.A01);
        String string = A0H.getString("/export/enc/active/owner", (String) null);
        String string2 = A0H.getString("/export/enc/active/version", (String) null);
        String string3 = A0H.getString("/export/enc/active/account_hash", (String) null);
        String string4 = A0H.getString("/export/enc/active/server_salt", (String) null);
        long A0B = C36341k9.A0B(A0H, "/export/enc/active/last_fetch_time");
        String string5 = A0H.getString("/export/enc/active/seed", (String) null);
        if (!(string == null || string2 == null || string3 == null || string4 == null || string5 == null)) {
            try {
                C222813r r0 = UserJid.Companion;
                return new C123895xG(C222813r.A01(string), string2, string3, string4, string5, A0B);
            } catch (C19740wR e) {
                this.A02.A0D("xpm-export-preferences-active", AnonymousClass000.A0p("invalid jid: ", string, AnonymousClass000.A0u()), e);
            }
        }
        return null;
    }

    public C123895xG A01() {
        SharedPreferences A0H = C36391kE.A0H(this.A01);
        String string = A0H.getString("/export/enc/prefetched/owner", (String) null);
        String string2 = A0H.getString("/export/enc/prefetched/version", (String) null);
        String string3 = A0H.getString("/export/enc/prefetched/account_hash", (String) null);
        String string4 = A0H.getString("/export/enc/prefetched/server_salt", (String) null);
        long A0B = C36341k9.A0B(A0H, "/export/enc/prefetched/last_fetch_time");
        String string5 = A0H.getString("/export/enc/prefetched/seed", (String) null);
        if (!(string == null || string2 == null || string3 == null || string4 == null || string5 == null)) {
            try {
                C222813r r0 = UserJid.Companion;
                return new C123895xG(C222813r.A01(string), string2, string3, string4, string5, A0B);
            } catch (C19740wR e) {
                this.A02.A0D("xpm-export-preferences-prefetched", AnonymousClass000.A0p("invalid jid: ", string, AnonymousClass000.A0u()), e);
            }
        }
        return null;
    }

    public String A02() {
        AnonymousClass005 r3 = this.A01;
        String A0t = C36371kC.A0t(C36391kE.A0H(r3), "/export/logging/funnelId");
        if (A0t != null) {
            return A0t;
        }
        String A0l = C36361kB.A0l();
        C36341k9.A0x(C90464aC.A0C(r3), "/export/logging/funnelId", A0l);
        return A0l;
    }

    public void A03() {
        C36341k9.A0u(C90464aC.A0C(this.A01), "/export/logging/funnelId");
    }

    public void A04() {
        C36341k9.A0u(C90464aC.A0C(this.A01).remove("/export/enc/prefetched/owner").remove("/export/enc/prefetched/version").remove("/export/enc/prefetched/account_hash").remove("/export/enc/prefetched/server_salt").remove("/export/enc/prefetched/last_fetch_time"), "/export/enc/prefetched/seed");
    }

    public boolean A05() {
        return C36371kC.A1U(C36391kE.A0H(this.A01), "/export/usingDbForTransfer");
    }

    public AnonymousClass6FO(C19700wN r2, C19890wg r3) {
        this.A02 = r2;
        this.A00 = r3;
    }
}
