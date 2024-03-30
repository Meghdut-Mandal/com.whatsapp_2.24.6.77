package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1Cv  reason: invalid class name and case insensitive filesystem */
public class C24541Cv {
    public final AnonymousClass163 A00;
    public final C220412q A01;
    public final AnonymousClass12g A02;
    public final C220612s A03;
    public final AnonymousClass12P A04;
    public final C20810yC A05;
    public final C24551Cw A06;
    public final AnonymousClass1A1 A07;
    public final C19970wo A08;
    public final AnonymousClass176 A09;

    public AnonymousClass3T1 A03(AnonymousClass11F r4) {
        if (r4 == null) {
            Log.e("LastMessageStore/getCachedLastChatsListDisplayedMessage/jid is null");
            return null;
        }
        C65073Qp A092 = this.A01.A09(r4, false);
        if (A092 != null) {
            return A092.A0d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LastMessageStore/getCachedLastChatsListDisplayedMessage/no chat for ");
        sb.append(r4);
        Log.w(sb.toString());
        return null;
    }

    @Deprecated
    public AnonymousClass3T1 A04(AnonymousClass11F r2) {
        return A06(r2, true);
    }

    public AnonymousClass3T1 A06(AnonymousClass11F r7, boolean z) {
        if (r7 == null) {
            Log.e("msgstore/last/message/jid is null");
            return null;
        }
        C220412q r1 = this.A01;
        if (r1.A09(r7, false) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/last/message/no chat for ");
            sb.append(r7);
            Log.w(sb.toString());
            return null;
        }
        C65073Qp A092 = r1.A09(r7, false);
        if (A092 == null) {
            return null;
        }
        long j = A092.A0N;
        if (j == 1) {
            return null;
        }
        AnonymousClass3T1 r0 = A092.A0c;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3T1 A002 = A00(r7, j, z);
        A092.A0c = A002;
        return A002;
    }

    public boolean A08(AnonymousClass11F r7, long j) {
        Cursor A092;
        boolean z = false;
        String[] strArr = {String.valueOf(this.A00.A08(r7)), String.valueOf(j)};
        AnonymousClass1M0 A042 = this.A04.get();
        try {
            A092 = A042.A02.A09("SELECT  1  FROM available_message_view WHERE chat_row_id = ? AND timestamp >= ? AND message_type NOT IN ('7') AND from_me = 1 LIMIT 1", "OUTGOING_MESSAGE_EXISTS_SINCE_TIMESTAMP_RAW_SQL", strArr);
            if (A092 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/get/no outgoing message for: ");
                sb.append(r7);
                sb.append(" after ");
                sb.append(j);
                Log.i(sb.toString());
            } else {
                if (A092.getCount() > 0) {
                    z = true;
                }
                A092.close();
            }
            A042.close();
            return z;
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

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass3T1 A00(X.AnonymousClass11F r13, long r14, boolean r16) {
        /*
            r12 = this;
            X.1A1 r0 = r12.A07
            if (r16 == 0) goto L_0x003d
            X.175 r0 = r0.A01
            X.3T1 r6 = r0.A01(r14)
        L_0x000a:
            boolean r0 = r13 instanceof X.AnonymousClass146
            if (r0 == 0) goto L_0x003c
            boolean r0 = r6 instanceof X.AnonymousClass2bI
            if (r0 == 0) goto L_0x003c
            r4 = r6
            X.2bI r4 = (X.AnonymousClass2bI) r4
            int r1 = r4.A00
            r0 = 2
            if (r1 != r0) goto L_0x003c
            java.lang.String r0 = "msgstore/initialize/update-group-create-failed-msg"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = r4
            X.8nz r3 = (X.C181758nz) r3
            X.3Qa r2 = r4.A1J
            long r0 = r4.A0I
            X.2cR r6 = new X.2cR
            r6.<init>(r2, r0)
            java.lang.String r0 = r4.A0b()
            r6.A16(r0)
            java.util.List r0 = r3.A01
            r6.A19(r0)
            X.176 r0 = r12.A09
            r0.A0B(r6)
        L_0x003c:
            return r6
        L_0x003d:
            r7 = 0
            X.AnonymousClass00C.A0D(r13, r7)
            X.175 r2 = r0.A01
            java.lang.String r4 = "CachedMessageStore/getMessageWithoutComments/rowId"
            long r10 = android.os.SystemClock.uptimeMillis()
            X.12P r0 = r2.A06     // Catch:{ all -> 0x00aa }
            X.1M0 r3 = r0.get()     // Catch:{ all -> 0x00aa }
            X.14e r9 = r3.A02     // Catch:{ all -> 0x00a3 }
            java.lang.String r6 = X.AnonymousClass2xD.A0C     // Catch:{ all -> 0x00a3 }
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x00a3 }
            X.163 r8 = r2.A01     // Catch:{ all -> 0x00a3 }
            long r0 = r8.A08(r13)     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00a3 }
            r5[r7] = r0     // Catch:{ all -> 0x00a3 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x00a3 }
            r5[r1] = r0     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "GET_MESSAGE_BY_ROW_ID_WITHOUT_COMMENTS_SQL"
            android.database.Cursor r5 = r9.A09(r6, r0, r5)     // Catch:{ all -> 0x00a3 }
            boolean r0 = r5.moveToLast()     // Catch:{ all -> 0x009c }
            r6 = 0
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = "chat_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009c }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x009c }
            X.11F r0 = r8.A0A(r0)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x008a
            X.3T1 r6 = r2.A02(r5, r0, r7)     // Catch:{ all -> 0x009c }
        L_0x008a:
            r5.close()     // Catch:{ all -> 0x00a3 }
            r3.close()     // Catch:{ all -> 0x00aa }
            X.12g r2 = r2.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r10
            r2.A01(r4, r0)
            goto L_0x000a
        L_0x009c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x00a3 }
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x00aa }
            throw r0     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r3 = move-exception
            X.12g r2 = r2.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r10
            r2.A01(r4, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24541Cv.A00(X.11F, long, boolean):X.3T1");
    }

    public static ArrayList A01(C24541Cv r8, AnonymousClass11F r9, int i, boolean z, boolean z2) {
        String str;
        Cursor A092;
        ArrayList arrayList = new ArrayList();
        if (z && z2) {
            str = AnonymousClass2xD.A06;
        } else if (z) {
            str = AnonymousClass2xD.A05;
        } else {
            str = AnonymousClass2xD.A04;
        }
        try {
            AnonymousClass1M0 A042 = r8.A04.get();
            try {
                A092 = A042.A02.A09(str, "GET_LAST_SIGNIFICANT_INCOMING_MESSAGES_SQL", new String[]{String.valueOf(r8.A00.A08(r9)), String.valueOf(i)});
                while (A092.moveToNext()) {
                    AnonymousClass3T1 A012 = r8.A07.A01(A092, r9);
                    if (A012 != null) {
                        arrayList.add(A012);
                    }
                }
                A092.close();
                A042.close();
                return arrayList;
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            r8.A03.A03();
            return arrayList;
        } catch (IllegalStateException e2) {
            Log.i("msgstore/getlastsignificantincomingmessages/IllegalStateException ", e2);
            return arrayList;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public static void A02(Cursor cursor, C24541Cv r4, AnonymousClass11F r5, ArrayList arrayList) {
        if (cursor != null) {
            while (cursor.moveToNext()) {
                try {
                    AnonymousClass3T1 A012 = r4.A07.A01(cursor, r5);
                    if (A012 != null) {
                        if ((A012 instanceof C46812bi) && A012.A09 == 1) {
                            C65013Qj r0 = ((C46812bi) A012).A01;
                            if (r0 != null) {
                                if (!r0.A0V) {
                                }
                            }
                        } else if (!(A012 instanceof AnonymousClass2bO)) {
                        }
                        arrayList.add(A012);
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e((Throwable) e);
                    r4.A03.A03();
                } catch (IllegalStateException e2) {
                    Log.i("msgstore/getlastmessagesfornotification/IllegalStateException ", e2);
                } catch (Throwable th) {
                    cursor.close();
                    throw th;
                }
            }
            cursor.close();
        }
    }

    public C24541Cv(C19970wo r1, AnonymousClass163 r2, C220412q r3, AnonymousClass12g r4, AnonymousClass176 r5, C220612s r6, AnonymousClass12P r7, C20810yC r8, C24551Cw r9, AnonymousClass1A1 r10) {
        this.A08 = r1;
        this.A05 = r8;
        this.A00 = r2;
        this.A01 = r3;
        this.A07 = r10;
        this.A06 = r9;
        this.A02 = r4;
        this.A09 = r5;
        this.A04 = r7;
        this.A03 = r6;
    }

    @Deprecated
    public AnonymousClass3T1 A05(AnonymousClass11F r10) {
        AnonymousClass3T1 r4;
        AnonymousClass3T1 A032 = A03(r10);
        if (A032 != null) {
            return A032;
        }
        C220412q r1 = this.A01;
        C65073Qp A092 = r1.A09(r10, false);
        if (A092 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/last/message/no chat for ");
            sb.append(r10);
            Log.w(sb.toString());
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        C65073Qp A093 = r1.A09(r10, false);
        if (A093 != null) {
            long j = A093.A0U;
            if (j != 1) {
                r4 = A00(r10, j, true);
                this.A02.A01("LastMessageStore/getLastChatsListDisplayedMessageFromDb", SystemClock.uptimeMillis() - uptimeMillis);
                A092.A0d = r4;
                return r4;
            }
        }
        r4 = null;
        A092.A0d = r4;
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r0 != false) goto L_0x0027;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A07(X.AnonymousClass11F r12, int r13) {
        /*
            r11 = this;
            long r9 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r8 = 1
            if (r13 != r8) goto L_0x0068
            X.3T1 r2 = r11.A05(r12)
            if (r2 == 0) goto L_0x0057
            X.3Qa r0 = r2.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0027
            X.1Cw r0 = r11.A06
            boolean r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x0027
            boolean r0 = r2 instanceof X.AnonymousClass2bI
            if (r0 != 0) goto L_0x0058
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x0068
        L_0x0027:
            boolean r0 = r2 instanceof X.AnonymousClass5J5
            if (r0 != 0) goto L_0x0068
            boolean r0 = r2 instanceof X.AnonymousClass2bK
            if (r0 != 0) goto L_0x0068
            boolean r0 = r2 instanceof X.AnonymousClass2bO
            if (r0 != 0) goto L_0x0068
            boolean r0 = r2 instanceof X.AnonymousClass2bY
            if (r0 != 0) goto L_0x0068
            boolean r0 = r2 instanceof X.AnonymousClass2bH
            if (r0 != 0) goto L_0x0068
            int r1 = r2.A1I
            r0 = 90
            if (r1 == r0) goto L_0x0068
            boolean r0 = r2 instanceof X.C46812bi
            if (r0 == 0) goto L_0x0054
            int r0 = r2.A09
            if (r0 != r8) goto L_0x0054
            r0 = r2
            X.2bU r0 = (X.AnonymousClass2bU) r0
            X.3Qj r0 = r0.A01
            if (r0 == 0) goto L_0x0057
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x0057
        L_0x0054:
            r4.add(r2)
        L_0x0057:
            return r4
        L_0x0058:
            r0 = r2
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r0 = r0.A00
            java.util.Set r1 = X.C56672wh.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            goto L_0x0025
        L_0x0068:
            X.12P r0 = r11.A04
            X.1M0 r3 = r0.get()
            X.14e r7 = r3.A02     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = X.C56882x2.A04     // Catch:{ all -> 0x00b2 }
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x00b2 }
            r2 = 0
            X.163 r0 = r11.A00     // Catch:{ all -> 0x00b2 }
            long r0 = r0.A08(r12)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00b2 }
            r5[r2] = r0     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x00b2 }
            r5[r8] = r0     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "GET_NOTIFICATION_MESSAGES_SQL"
            android.database.Cursor r0 = r7.A09(r6, r0, r5)     // Catch:{ all -> 0x00b2 }
            A02(r0, r11, r12, r4)     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0096
            r0.close()     // Catch:{ all -> 0x00b2 }
        L_0x0096:
            r3.close()
            X.12g r3 = r11.A02
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r9
            java.lang.String r0 = "LastMessageStore/getLastMessagesForNotification"
            r3.A01(r0, r1)
            return r4
        L_0x00a6:
            r1 = move-exception
            if (r0 == 0) goto L_0x00b1
            r0.close()     // Catch:{ all -> 0x00ad }
            goto L_0x00b1
        L_0x00ad:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00b2 }
        L_0x00b1:
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00b7 }
            throw r1
        L_0x00b7:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24541Cv.A07(X.11F, int):java.util.ArrayList");
    }
}
