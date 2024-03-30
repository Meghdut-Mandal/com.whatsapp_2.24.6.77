package X;

import android.content.res.Resources;
import com.whatsapp.R;

/* renamed from: X.2Z8  reason: invalid class name */
public class AnonymousClass2Z8 extends AnonymousClass3LF implements AnonymousClass4RM {
    public AnonymousClass3K6 A00;
    public final AnonymousClass1FZ A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2Z8(X.C19700wN r16, X.C19730wQ r17, X.C21100yf r18, X.AnonymousClass16D r19, X.AnonymousClass171 r20, X.C21060yb r21, X.C19630wG r22, X.C18820ts r23, X.AnonymousClass3K6 r24, X.AnonymousClass1FZ r25, X.AnonymousClass1TA r26, X.C20810yC r27, X.C20600xp r28, X.C23971Ao r29) {
        /*
            r15 = this;
            r0 = r24
            X.3T1 r13 = r0.A03
            r11 = r27
            r10 = r26
            r14 = r29
            r2 = r16
            r12 = r28
            r1 = r15
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A00 = r0
            r0 = r25
            r15.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Z8.<init>(X.0wN, X.0wQ, X.0yf, X.16D, X.171, X.0yb, X.0wG, X.0ts, X.3K6, X.1FZ, X.1TA, X.0yC, X.0xp, X.1Ao):void");
    }

    public static String A00(AnonymousClass2Z8 r9) {
        AnonymousClass3K6 r1 = r9.A00;
        Integer num = r1.A01;
        if (num == null) {
            return "";
        }
        int intValue = num.intValue() - 1;
        if (intValue <= 0) {
            return r9.A05.A00.getString(R.string.f12nameremoved);
        }
        int i = R.plurals.f10nameremoved;
        if (r1.A05.size() > 1) {
            i = R.plurals.f10nameremoved;
        }
        Resources A0B = C36421kH.A0B(r9.A05);
        Object[] A0M = AnonymousClass001.A0M();
        C20600xp r2 = r9.A07;
        AnonymousClass3T1 r0 = r9.A00;
        A0M[0] = r2.A0I(r0.A0J(), r0.A1J.A00);
        C36431kI.A1O(A0M, intValue, 1);
        return A0B.getQuantityString(i, intValue, A0M);
    }

    public static String A01(AnonymousClass2Z8 r5, String str) {
        Integer num = r5.A00.A01;
        if (num == null) {
            return "";
        }
        int intValue = num.intValue() - 1;
        if (intValue <= 0) {
            return str;
        }
        Resources A0B = C36421kH.A0B(r5.A05);
        Object[] A1Z = C36431kI.A1Z(str, 2);
        AnonymousClass000.A1L(A1Z, intValue, 1);
        return A0B.getQuantityString(R.plurals.f10nameremoved, intValue, A1Z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C07700Yy r10, androidx.core.app.NotificationCompat$MessagingStyle r11, X.AnonymousClass141 r12) {
        /*
            r9 = this;
            X.3K6 r5 = r9.A00
            java.lang.Integer r0 = r5.A01
            if (r0 != 0) goto L_0x00ba
            X.1FZ r4 = r9.A01
            r6 = 0
            X.3Qa r0 = r5.A04
            X.11F r1 = r0.A00
            if (r1 == 0) goto L_0x00ba
            X.12q r0 = r4.A01
            long r0 = r0.A07(r1)
            java.util.Set r3 = r5.A05
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x00ae
            int r7 = r3.size()
            r2 = 10
            if (r7 > r2) goto L_0x00ae
            java.lang.String[] r2 = X.C36441kJ.A1R()
            X.C36351kA.A1V(r2, r6, r0)
            java.util.ArrayList r7 = X.AnonymousClass03T.A03(r2)
            java.util.ArrayList r8 = X.C36351kA.A0z(r3)
            java.util.Iterator r2 = r3.iterator()
        L_0x0038:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004a
            long r0 = X.C36391kE.A0D(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.add(r0)
            goto L_0x0038
        L_0x004a:
            r7.addAll(r8)
            int r1 = r3.size()
            java.lang.String r0 = X.C56792wt.A02
            r0 = 1
            if (r1 < r0) goto L_0x00b1
            r0 = 10
            if (r1 > r0) goto L_0x00b1
            java.lang.String r2 = X.AnonymousClass1M2.A00(r1)
            X.AnonymousClass00C.A08(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "\n          SELECT \n            COUNT(DISTINCT sender_jid_row_id) as sender_count\n          FROM message_comment JOIN available_message_view \n          WHERE\n            message_row_id = available_message_view._id  \n            AND message_row_id > ?\n        AND parent_message_row_id in "
            java.lang.String r3 = X.AnonymousClass000.A0p(r0, r2, r1)
            if (r3 == 0) goto L_0x00b1
            X.12P r0 = r4.A05
            X.1M0 r4 = r0.get()
            X.14e r2 = r4.A02     // Catch:{ all -> 0x00a7 }
            java.lang.String[] r1 = X.C36371kC.A1b(r7, r6)     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "SELECT_UNSEEN_COMMENT_SENDER_COUNT_NOTIFICATION"
            android.database.Cursor r3 = r2.A09(r3, r0, r1)     // Catch:{ all -> 0x00a7 }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x00a0 }
            r2 = 0
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "sender_count"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a0 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x00a0 }
            if (r0 != 0) goto L_0x009a
            int r0 = r3.getInt(r1)     // Catch:{ all -> 0x00a0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a0 }
        L_0x009a:
            r5.A01 = r2     // Catch:{ all -> 0x00a0 }
        L_0x009c:
            r3.close()     // Catch:{ all -> 0x00a7 }
            goto L_0x00b7
        L_0x00a0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x00a7 }
            throw r0     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x00ae:
            java.lang.String r0 = "MessageCommentParentStore/populateSenderDataForParents/too many parents to parse"
            goto L_0x00b3
        L_0x00b1:
            java.lang.String r0 = "MessageCommentParentStore/populateSenderDataForParents/failed to make a query"
        L_0x00b3:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00ba
        L_0x00b7:
            r4.close()
        L_0x00ba:
            super.A0A(r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Z8.A0A(X.0Yy, androidx.core.app.NotificationCompat$MessagingStyle, X.141):void");
    }

    public C64933Qa BF8() {
        return this.A00.A04;
    }
}
