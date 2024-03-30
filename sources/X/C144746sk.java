package X;

import android.content.SharedPreferences;

/* renamed from: X.6sk  reason: invalid class name and case insensitive filesystem */
public class C144746sk implements C159417jK {
    public final AnonymousClass636 A00;

    public void BV1() {
        long j;
        long j2;
        long j3;
        long A08;
        AnonymousClass636 r10 = this.A00;
        SharedPreferences A002 = r10.A01.A00("ntp-scheduler");
        long j4 = A002.getLong("/ntp/last_event_timestamp", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (j4 == 0) {
            synchronized (r10) {
                C36341k9.A0w(A002.edit(), "/ntp/last_event_timestamp", currentTimeMillis);
            }
            return;
        }
        long j5 = currentTimeMillis - j4;
        synchronized (r10) {
            j = (long) A002.getInt("/ntp/started", 0);
            j2 = (long) A002.getInt("/ntp/succeeded", 0);
            j3 = (long) A002.getInt("/ntp/failed", 0);
            A08 = C36371kC.A08(A002, "/ntp/work_manager_init");
            C36341k9.A0w(A002.edit().remove("/ntp/started").remove("/ntp/succeeded").remove("/ntp/failed"), "/ntp/last_event_timestamp", currentTimeMillis);
        }
        C1040257z r1 = new C1040257z();
        r1.A02 = Long.valueOf(j);
        r1.A03 = Long.valueOf(j2);
        r1.A01 = Long.valueOf(j3);
        r1.A00 = Long.valueOf(j5);
        r1.A04 = Long.valueOf(A08);
        r10.A00.Bly(r1);
    }

    public C144746sk(AnonymousClass636 r1) {
        this.A00 = r1;
    }
}
