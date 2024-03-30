package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Oz  reason: invalid class name and case insensitive filesystem */
public final class C27621Oz {
    public final C19970wo A00;
    public final C20810yC A01;
    public final C21010yW A02;
    public final AnonymousClass1P0 A03;

    public C27621Oz(C19970wo r2, C20810yC r3, C21010yW r4, AnonymousClass1P0 r5) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public final void A00(UserJid userJid, Integer num, Integer num2, Long l, String str, int i) {
        if (userJid instanceof PhoneUserJid) {
            C20810yC r5 = this.A01;
            C21000yV r4 = C21000yV.A02;
            if (C20800yB.A01(r4, r5, 2249)) {
                boolean z = false;
                if (!((num == null || num.intValue() == 200) && (num2 == null || num2.intValue() == 200))) {
                    z = true;
                }
                AnonymousClass2SJ r2 = new AnonymousClass2SJ();
                long j = 1L;
                r2.A05 = 1L;
                boolean z2 = true;
                if ((C20800yB.A00(r4, r5, 2250) & 1) != 1) {
                    z2 = false;
                }
                r2.A00 = Boolean.valueOf(z2);
                r2.A09 = "status";
                if (l != null) {
                    long longValue = l.longValue();
                    long A002 = C19970wo.A00(this.A00);
                    r2.A07 = Long.valueOf(longValue);
                    r2.A02 = Long.valueOf(A002);
                    r2.A01 = Long.valueOf(A002 - longValue);
                }
                if (z) {
                    j = 0L;
                }
                r2.A06 = j;
                if (num != null) {
                    r2.A03 = Long.valueOf((long) num.intValue());
                }
                if (num2 != null) {
                    r2.A04 = Long.valueOf((long) num2.intValue());
                }
                if (str != null) {
                    r2.A08 = str;
                }
                this.A02.Bly(r2);
                StringBuilder sb = new StringBuilder();
                sb.append("mexmigrationperftracker/requeststopped ");
                sb.append(i);
                Log.i(sb.toString());
            }
        }
    }
}
