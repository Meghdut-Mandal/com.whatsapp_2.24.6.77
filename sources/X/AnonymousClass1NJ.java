package X;

import android.database.Cursor;
import android.os.ConditionVariable;

/* renamed from: X.1NJ  reason: invalid class name */
public final class AnonymousClass1NJ {
    public final C19970wo A00;
    public final C220412q A01;
    public final C20310xM A02;
    public final C20810yC A03;
    public final C21010yW A04;

    public AnonymousClass1NJ(C19970wo r2, C220412q r3, C20310xM r4, C20810yC r5, C21010yW r6) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r4, 5);
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
    }

    public final void A03(AnonymousClass141 r9, AnonymousClass11F r10) {
        C65073Qp A09;
        boolean z;
        AnonymousClass00C.A0D(r10, 0);
        if (C20800yB.A01(C21000yV.A02, this.A03, 5245) && (A09 = this.A01.A09(r10, false)) != null) {
            long longValue = A09.A07().longValue();
            AnonymousClass2R2 r5 = new AnonymousClass2R2();
            r5.A04 = r10.getRawString();
            if (r9 == null || (r9.A0F == null && r9.A0G == null)) {
                z = false;
            } else {
                z = true;
            }
            r5.A00 = Boolean.valueOf(z);
            r5.A03 = Double.valueOf(A00(C19970wo.A00(this.A00) - this.A02.A0K(longValue)));
            r5.A01 = Double.valueOf(A01(this, longValue));
            r5.A02 = Double.valueOf(A02(this, longValue));
            this.A04.Bly(r5);
        }
    }

    public static final double A00(long j) {
        ConditionVariable conditionVariable = C18740tg.A00;
        return ((double) j) * (((double) 1) + (Math.pow((((double) 2) * Math.random()) - 1.0d, 5.0d) * 0.5d));
    }

    public static final double A01(AnonymousClass1NJ r8, long j) {
        Cursor A09;
        long j2;
        C20310xM r1 = r8.A02;
        C224214g r4 = new C224214g("CoreMessageStore/getNumOfMessagesReceivedFromJid");
        try {
            AnonymousClass1M0 A042 = r1.A0c.get();
            try {
                A09 = A042.A02.A09("SELECT COUNT(*) as count FROM (SELECT * FROM available_message_view WHERE chat_row_id = ? AND from_me = ? AND (message_type != '7') AND (message_type != '8') LIMIT ?)", "GET_NON_SYSTEM_MESSAGES_COUNT_IN_CHAT_FROM_ME_OR_OTHERS_SQL", new String[]{String.valueOf(j), "0", String.valueOf(1000)});
                if (A09.moveToFirst()) {
                    j2 = A09.getLong(A09.getColumnIndexOrThrow("count"));
                } else {
                    j2 = -1;
                }
                A09.close();
                A042.close();
                r4.A01();
                if (j2 < 1000) {
                    return A00(j2);
                }
                return 2000.0d;
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            r4.A01();
            throw th2;
        }
    }

    public static final double A02(AnonymousClass1NJ r8, long j) {
        Cursor A09;
        long j2;
        C20310xM r1 = r8.A02;
        C224214g r4 = new C224214g("CoreMessageStore/getNumOfMessagesSentToJid");
        try {
            AnonymousClass1M0 A042 = r1.A0c.get();
            try {
                A09 = A042.A02.A09("SELECT COUNT(*) as count FROM (SELECT * FROM available_message_view WHERE chat_row_id = ? AND from_me = ? AND (message_type != '7') AND (message_type != '8') LIMIT ?)", "GET_NON_SYSTEM_MESSAGES_COUNT_IN_CHAT_FROM_ME_OR_OTHERS_SQL", new String[]{String.valueOf(j), "1", String.valueOf(1000)});
                if (A09.moveToFirst()) {
                    j2 = A09.getLong(A09.getColumnIndexOrThrow("count"));
                } else {
                    j2 = -1;
                }
                A09.close();
                A042.close();
                r4.A01();
                if (j2 < 1000) {
                    return A00(j2);
                }
                return 2000.0d;
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            r4.A01();
            throw th2;
        }
    }
}
