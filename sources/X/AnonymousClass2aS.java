package X;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2aS  reason: invalid class name */
public final class AnonymousClass2aS extends AnonymousClass6FH {
    public final AnonymousClass16D A00;
    public final C19420v0 A01;

    public int A00(boolean z) {
        return z ? 227 : 228;
    }

    public String A03() {
        return C36371kC.A0t(C36341k9.A0E(this.A01), "group_add_blacklist_hash");
    }

    public HashSet A04() {
        Cursor A03;
        AnonymousClass1M0 A032 = this.A00.A05.A00.get();
        try {
            A03 = C229416o.A03(A032, "SELECT jid FROM wa_group_add_black_list", "CONTACT_GROUP_ADD_BLACK_LIST", (String[]) null);
            HashSet A08 = C229516p.A08(A03, "contact-mgr-db/unable to get group add block list");
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
        C229516p.A0E(r2, "wa_group_add_black_list", set);
        A0g.A00();
        C19420v0 r3 = this.A01;
        C36341k9.A0x(C36331k8.A05(r3), "group_add_blacklist_hash", str);
        if (z) {
            C36341k9.A0v(C19420v0.A00(r3), "privacy_groupadd", 3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2aS(AnonymousClass16D r2, C19420v0 r3, AnonymousClass19A r4, AnonymousClass3MB r5, C19770wU r6) {
        super(r4, r5, r6, "groupadd");
        C36321k7.A18(r6, r4, r2, r3);
        this.A00 = r2;
        this.A01 = r3;
    }
}
