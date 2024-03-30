package X;

import android.database.Cursor;

/* renamed from: X.3Re  reason: invalid class name and case insensitive filesystem */
public final class C65213Re {
    public static final int[] A04 = {-1, 7, 11, 15, 35, 36, 38, 39, 50, 56, 58, 64, 68, 69, 70, 71, 74, 75, 76, 77, 79, 84, 87};
    public long A00 = System.currentTimeMillis();
    public final C19760wT A01;
    public final AnonymousClass17T A02;
    public final AnonymousClass1A1 A03;

    public static final Integer A00(C65213Re r10, AnonymousClass11F r11, long j) {
        Cursor A09;
        long j2;
        int A1P;
        AnonymousClass17T r2 = r10.A02;
        long j3 = j - 86400000;
        int[] iArr = A04;
        C224214g r5 = new C224214g(false);
        r5.A04("rowidstore/getFirstSentOrReceivedRowIdInTimeWindowExcludingTypes");
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SELECT _id FROM available_message_view WHERE chat_row_id = ? AND ");
        A0u.append(AnonymousClass000.A0p(AnonymousClass17W.A00(iArr), " AND ", AnonymousClass000.A0u()));
        A0u.append("(");
        A0u.append("from_me = 1");
        A0u.append(" AND ");
        A0u.append("timestamp BETWEEN ? AND ?");
        A0u.append(" OR ");
        A0u.append("from_me = 0");
        A0u.append(" AND ");
        A0u.append("received_timestamp BETWEEN ? AND ?");
        String A0q = AnonymousClass000.A0q(") ORDER BY sort_id ASC LIMIT 1", A0u);
        AnonymousClass1M0 A042 = r2.A01.get();
        try {
            C224114e r4 = A042.A02;
            String[] strArr = new String[5];
            C36331k8.A19(r2.A00, r11, strArr, 0);
            String l = Long.toString(j3);
            strArr[1] = l;
            String l2 = Long.toString(j);
            strArr[2] = l2;
            strArr[3] = l;
            strArr[4] = l2;
            A09 = r4.A09(A0q, "GET_FIRST_IN_TIME_WINDOW_EXCLUDE_TYPES", strArr);
            if (A09.moveToNext()) {
                j2 = C36351kA.A07(A09, "_id");
            } else {
                j2 = 1;
            }
            A09.close();
            A042.close();
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("rowidstore/getFirstSentOrReceivedRowIdInTimeWindowExcludingTypes ");
            A0u2.append("");
            C36321k7.A0t(r5, " | time spent:", A0u2);
            if (j2 == 1) {
                A1P = 2;
            } else {
                AnonymousClass3T1 A0R = C36421kH.A0R(r10.A03, j2);
                if (A0R == null) {
                    C36341k9.A1M("calculateConversationInitiator: cannot load FMessage for rowId=", AnonymousClass000.A0u(), j2);
                    return null;
                }
                A1P = AnonymousClass000.A1P(A0R.A1J.A02 ? 1 : 0);
            }
            return Integer.valueOf(A1P);
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C65213Re(C19760wT r3, AnonymousClass17T r4, AnonymousClass1A1 r5) {
        C36321k7.A11(r3, r4, r5);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }
}
