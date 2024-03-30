package X;

import android.database.Cursor;
import android.os.SystemClock;

/* renamed from: X.3qi  reason: invalid class name and case insensitive filesystem */
public class C77573qi implements C88094Rj {
    public final C19970wo A00;
    public final AnonymousClass163 A01;
    public final AnonymousClass12g A02;
    public final C20650xu A03;
    public final AnonymousClass12P A04;

    public Cursor BE9(C02680Bk r10, AnonymousClass11F r11, AnonymousClass1S3 r12) {
        AnonymousClass1M0 A042;
        C36721lC r3;
        if (r11 == null) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            A042 = this.A04.get();
            if (C36391kE.A1a(r12)) {
                String A0E = this.A03.A0E(r10, r12, (Integer) null);
                r3 = A042.A02.A0B(r10, AnonymousClass2x9.A08, "SEARCH_KEPT_MESSAGES_FOR_JID_FTS_SQL", new String[]{A0E});
            } else {
                C224114e r32 = A042.A02;
                String str = AnonymousClass2xD.A00;
                String[] strArr = new String[1];
                C36331k8.A19(this.A01, r11, strArr, 0);
                r3 = r32.A0B(r10, str, "GET_ALL_KEPT_MESSAGES_FOR_JID_START_SQL", strArr);
            }
            A042.close();
            this.A02.A01("KeptMessageStore/getKeptMessagesForJid", SystemClock.uptimeMillis() - uptimeMillis);
            return r3;
        } catch (Throwable th) {
            this.A02.A01("KeptMessageStore/getKeptMessagesForJid", SystemClock.uptimeMillis() - uptimeMillis);
            throw th;
        }
        throw th;
    }

    public C77573qi(C19970wo r1, AnonymousClass163 r2, AnonymousClass12g r3, C20650xu r4, AnonymousClass12P r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }
}
