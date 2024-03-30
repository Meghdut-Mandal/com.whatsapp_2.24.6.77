package X;

import android.os.Handler;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.1FZ  reason: invalid class name */
public final class AnonymousClass1FZ {
    public static final Set A08;
    public final AnonymousClass163 A00;
    public final C220412q A01;
    public final AnonymousClass1DQ A02;
    public final C24561Cx A03;
    public final AnonymousClass16J A04;
    public final AnonymousClass12P A05;
    public final C25121Fb A06;
    public final AnonymousClass1A1 A07;

    public AnonymousClass1FZ(AnonymousClass163 r2, C220412q r3, AnonymousClass1DQ r4, C24561Cx r5, AnonymousClass16J r6, AnonymousClass12P r7, C25121Fb r8, AnonymousClass1A1 r9) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r9, 4);
        AnonymousClass00C.A0D(r6, 5);
        AnonymousClass00C.A0D(r5, 6);
        AnonymousClass00C.A0D(r7, 7);
        AnonymousClass00C.A0D(r8, 8);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A07 = r9;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r7;
        this.A06 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass3T1 r9) {
        /*
            r8 = this;
            r6 = 0
            r0 = 16
            boolean r0 = r9.A1R(r0)
            if (r0 == 0) goto L_0x007c
            X.12P r0 = r8.A05
            X.1M0 r4 = r0.get()
            X.14e r5 = r4.A02     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = "\n          SELECT \n            message_row_id,\n            number_of_comments,\n            last_comment_ts,\n            last_comment_message_row_id\n          FROM message_comment_parent\n          WHERE message_row_id = ?    \n        "
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0075 }
            long r0 = r9.A1N     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0075 }
            r2[r6] = r0     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "SELECT_PARENT_MESSAGE_COMMENT_INFO"
            android.database.Cursor r6 = r5.A09(r3, r0, r2)     // Catch:{ all -> 0x0075 }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x006e }
            r7 = 0
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "number_of_comments"
            int r2 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "last_comment_ts"
            int r1 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "last_comment_message_row_id"
            int r5 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006e }
            int r3 = r6.getInt(r2)     // Catch:{ all -> 0x006e }
            boolean r0 = r6.isNull(r1)     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0049
            r2 = r7
            goto L_0x0051
        L_0x0049:
            long r0 = r6.getLong(r1)     // Catch:{ all -> 0x006e }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x006e }
        L_0x0051:
            boolean r0 = r6.isNull(r5)     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x005f
            long r0 = r6.getLong(r5)     // Catch:{ all -> 0x006e }
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x006e }
        L_0x005f:
            X.2bC r0 = new X.2bC     // Catch:{ all -> 0x006e }
            r0.<init>(r7, r2, r3)     // Catch:{ all -> 0x006e }
            r9.A0u(r0)     // Catch:{ all -> 0x006e }
        L_0x0067:
            r6.close()     // Catch:{ all -> 0x0075 }
            r4.close()
            return
        L_0x006e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FZ.A01(X.3T1):void");
    }

    public final void A02(AnonymousClass3T1 r7, boolean z) {
        Long A042;
        AnonymousClass1A1 r4;
        AnonymousClass3T1 A012;
        int i;
        int A002;
        C195759Vv A013;
        if (r7.A1T(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)) {
            C64933Qa r5 = null;
            if (r7.A0P() == null) {
                this.A06.A00(new AnonymousClass3IP(A08, false), r7);
                r4 = this.A07;
                C63663Kx A0P = r7.A0P();
                if (!(A0P == null || (A013 = A0P.A01()) == null)) {
                    r5 = A013.A01;
                }
                A012 = r4.A03(r5);
            } else {
                C63663Kx A0P2 = r7.A0P();
                if (A0P2 != null && (A042 = A0P2.A04()) != null) {
                    long longValue = A042.longValue();
                    r4 = this.A07;
                    A012 = r4.A01.A01(longValue);
                } else {
                    return;
                }
            }
            if (A012 != null) {
                if (!A012.A1R(16)) {
                    A012.A0h(16);
                    r4.A05(A012, -1);
                }
                C63663Kx A0P3 = A012.A0P();
                if (A0P3 == null) {
                    A01(A012);
                }
                if (z) {
                    i = -1;
                } else {
                    i = 1;
                    if (r7.A1T(65536)) {
                        i = 0;
                    }
                }
                C63663Kx A0P4 = A012.A0P();
                if (A0P4 != null) {
                    A002 = A0P4.A00() + i;
                } else {
                    A002 = this.A03.A00(A012);
                }
                A012.A0u(new AnonymousClass2bC(Long.valueOf(r7.A1N), Long.valueOf(r7.A0I), A002));
                A00(A012);
                Handler handler = this.A02.A02;
                int i2 = 17;
                if (A0P3 == null) {
                    i2 = 16;
                }
                handler.post(new C35701j7(this, A012, i2));
            }
        }
    }

    static {
        C25111Fa[] values = C25111Fa.values();
        ArrayList arrayList = new ArrayList();
        for (C25111Fa r1 : values) {
            if (r1 != C25111Fa.SKIP_COMMENT_INFO) {
                arrayList.add(r1);
            }
        }
        A08 = C007103b.A0f(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass3T1 r8) {
        /*
            r7 = this;
            X.3Kx r3 = r8.A0P()
            r0 = 16
            boolean r0 = r8.A1R(r0)
            if (r0 == 0) goto L_0x007f
            if (r3 == 0) goto L_0x007f
            X.12P r0 = r7.A05
            X.1M0 r4 = r0.A05()
            X.71s r5 = r4.B1k()     // Catch:{ all -> 0x0078 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0071 }
            r6.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "message_row_id"
            long r0 = r8.A1N     // Catch:{ all -> 0x0071 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0071 }
            r6.put(r2, r0)     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "chat_row_id"
            X.3Qa r0 = r8.A1J     // Catch:{ all -> 0x0071 }
            X.11F r1 = r0.A00     // Catch:{ all -> 0x0071 }
            r0 = 0
            if (r1 == 0) goto L_0x003b
            X.163 r0 = r7.A00     // Catch:{ all -> 0x0071 }
            long r0 = r0.A08(r1)     // Catch:{ all -> 0x0071 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0071 }
        L_0x003b:
            r6.put(r2, r0)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = "number_of_comments"
            int r0 = r3.A00()     // Catch:{ all -> 0x0071 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0071 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = "last_comment_ts"
            java.lang.Long r0 = r3.A03()     // Catch:{ all -> 0x0071 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = "last_comment_message_row_id"
            java.lang.Long r0 = r3.A02()     // Catch:{ all -> 0x0071 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0071 }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "message_comment_parent"
            r1 = 5
            java.lang.String r0 = "insertIntoCommentParentTable/INSERT_COMMENT_PARENT_MESSAGE_INFO"
            r3.A08(r2, r0, r6, r1)     // Catch:{ all -> 0x0071 }
            r5.A00()     // Catch:{ all -> 0x0071 }
            r5.close()     // Catch:{ all -> 0x0078 }
            r4.close()
            return
        L_0x0071:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007a }
        L_0x007a:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x007f:
            java.lang.String r1 = "MessageCommentParentStore/insertCommentParentMessageData message does not contain comments"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FZ.A00(X.3T1):void");
    }
}
