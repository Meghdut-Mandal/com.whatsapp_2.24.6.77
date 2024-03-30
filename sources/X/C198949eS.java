package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9eS  reason: invalid class name and case insensitive filesystem */
public class C198949eS {
    public final AnonymousClass1X4 A00;
    public final C21158AAs A01;
    public final AnonymousClass1G5 A02;
    public final C19970wo A03;
    public final C20310xM A04;
    public final AnonymousClass1NO A05;
    public final AnonymousClass1A1 A06;
    public final C26191Jf A07;

    public void A01(C202679mP r26, AnonymousClass11F r27, boolean z, boolean z2) {
        Throwable th;
        boolean z3;
        AnonymousClass2bI r3;
        int i;
        C202679mP r13 = r26;
        long j = r13.A00;
        long max = Math.max(j, r13.A01);
        C20310xM r4 = this.A04;
        AnonymousClass11F r6 = r27;
        long A0L = r4.A0L(r6, max);
        String[] strArr = new String[4];
        C36341k9.A1W(strArr, r4.A0H.A08(r6));
        strArr[1] = String.valueOf(A0L);
        strArr[2] = String.valueOf(C19970wo.A00(r4.A0C));
        strArr[3] = String.valueOf(1000);
        AnonymousClass1M0 A042 = r4.A0c.get();
        try {
            Cursor A09 = A042.A02.A09("   SELECT _id, sort_id, key_id, from_me, timestamp, receipt_server_timestamp, starred, media_size, status FROM available_message_view WHERE chat_row_id = ? AND sort_id <= ? AND (message_type != '7') AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC  LIMIT ? ", "SELECT_INCOMING_AND_SENT_MESSAGE_KEYS_OLDER_THAN_SORT_ID_IN_CHAT_SQL", strArr);
            A042.close();
            try {
                ArrayList A0I = AnonymousClass001.A0I();
                if (A09 != null) {
                    while (A09.moveToNext()) {
                        A0I.add(new C193389Lg(A09, r6));
                    }
                    A09.close();
                }
                Iterator it = A0I.iterator();
                long j2 = Long.MAX_VALUE;
                while (it.hasNext()) {
                    C193389Lg r1 = (C193389Lg) it.next();
                    long j3 = r1.A00;
                    if (j3 < j2 && r1.A01 >= j) {
                        j2 = j3;
                    }
                }
                long j4 = -1;
                Iterator it2 = A0I.iterator();
                while (it2.hasNext()) {
                    C193389Lg r7 = (C193389Lg) it2.next();
                    long j5 = r7.A00;
                    if (j5 < j2 && j5 > j4 && r7.A01 < j) {
                        j4 = j5;
                    }
                }
                A09 = r4.A0O(r6, j4, A0L, max);
                ArrayList A0I2 = AnonymousClass001.A0I();
                if (A09 != null) {
                    while (A09.moveToNext()) {
                        A0I2.add(new C193389Lg(A09, r6));
                    }
                    A09.close();
                }
                ArrayList A0I3 = AnonymousClass001.A0I();
                ArrayList A0I4 = AnonymousClass001.A0I();
                Iterator it3 = A0I.iterator();
                while (true) {
                    z3 = z2;
                    if (!it3.hasNext()) {
                        break;
                    }
                    C193389Lg r72 = (C193389Lg) it3.next();
                    if (r72.A00 > j4 && ((!r72.A03 || z2) && r72.A01 < j)) {
                        A0I4.add(this.A06.A03(r72.A02));
                    }
                }
                A0I3.addAll(A0I4);
                ArrayList A0I5 = AnonymousClass001.A0I();
                Iterator it4 = A0I2.iterator();
                while (it4.hasNext()) {
                    C193389Lg r8 = (C193389Lg) it4.next();
                    long j6 = r8.A01;
                    if (!(j6 > max || (r3 = (AnonymousClass2bI) this.A06.A03(r8.A02)) == null || (i = r3.A00) == 67)) {
                        if (!AnonymousClass000.A1Z((Set) C56672wh.A00.get(), i) || j6 < C19970wo.A00(this.A03) - C90484aE.A0K(TimeUnit.DAYS)) {
                            A0I5.add(r3);
                        }
                    }
                }
                A0I3.addAll(A0I5);
                A0I3.addAll(A00(r6, r13.A02, z3));
                A0I3.addAll(A00(r6, r13.A03, z3));
                boolean z4 = z;
                if (j4 != -1) {
                    Long valueOf = Long.valueOf(j4);
                    if (z2) {
                        this.A05.A03(r6, valueOf);
                    }
                    r4.A0g(r6, true);
                    r4.A0d(r6, valueOf, true, z4);
                }
                if (!A0I3.isEmpty()) {
                    r4.A0u(A0I3, z4 ? 1 : 0);
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            A042.close();
            throw th;
        }
    }

    public C198949eS(AnonymousClass1X4 r1, C21158AAs aAs, AnonymousClass1G5 r3, C19970wo r4, C20310xM r5, AnonymousClass1NO r6, C26191Jf r7, AnonymousClass1A1 r8) {
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A06 = r8;
        this.A01 = aAs;
        this.A07 = r7;
        this.A05 = r6;
        this.A02 = r3;
    }

    private ArrayList A00(AnonymousClass11F r6, Set set, boolean z) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C196099Xq r0 = (C196099Xq) it.next();
            AnonymousClass3T1 A032 = this.A06.A03(this.A07.A01(C165617ti.A0R(r6, r0.A03, r0.A04)));
            if (A032 != null && (!A032.A15 || z)) {
                A0I.add(A032);
            }
        }
        return A0I;
    }
}
