package X;

import android.database.Cursor;

/* renamed from: X.3vZ  reason: invalid class name and case insensitive filesystem */
public class C80543vZ implements Runnable {
    public final long A00;
    public final C24571Cy A01;
    public final C19970wo A02;
    public final C19420v0 A03;
    public final C20310xM A04;

    public void run() {
        Cursor A09;
        long j;
        long A002 = C19970wo.A00(this.A02);
        long A003 = this.A01.A00((C198959eT) null, 2, false);
        long j2 = this.A00;
        long j3 = (long) 210;
        C20310xM r8 = this.A04;
        C224214g r7 = new C224214g("CoreMessageStore/getNumMessagesSince");
        String[] strArr = new String[3];
        C36341k9.A1W(strArr, A002 - (86400000 * A003));
        strArr[1] = String.valueOf(A002);
        strArr[2] = String.valueOf((j2 / j3) + 1);
        try {
            AnonymousClass1M0 A042 = r8.A0c.get();
            try {
                A09 = A042.A02.A09("SELECT COUNT(*) as count FROM (SELECT _id FROM available_message_view WHERE timestamp >= ?  AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  LIMIT ?)", "SELECT_NUM_MESSAGES_SINCE_TIMESTAMP_SQL", strArr);
                if (!A09.moveToFirst()) {
                    j = -1;
                } else {
                    j = C36351kA.A07(A09, "count");
                }
                A09.close();
                A042.close();
                r7.A01();
                C36341k9.A0w(C19420v0.A00(this.A03), "md_initial_sync_estimate_bytes", Math.min(j * j3, j2));
                return;
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            r7.A01();
            throw th2;
        }
    }

    public C80543vZ(C24571Cy r1, C19970wo r2, C19420v0 r3, C20310xM r4, long j) {
        this.A02 = r2;
        this.A04 = r4;
        this.A00 = j;
        this.A03 = r3;
        this.A01 = r1;
    }
}
