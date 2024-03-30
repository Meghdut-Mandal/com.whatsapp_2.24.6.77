package X;

/* renamed from: X.1DO  reason: invalid class name */
public class AnonymousClass1DO {
    public final AnonymousClass163 A00;
    public final C220412q A01;
    public final AnonymousClass12T A02;
    public final C220612s A03;
    public final AnonymousClass12P A04;
    public final AnonymousClass16E A05;
    public final AnonymousClass1C5 A06;
    public final AnonymousClass1A1 A07;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r6.A03.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass11F r7, long r8, long r10) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/setchatreadreceiptssent/"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.12q r1 = r6.A01
            r0 = 0
            X.3Qp r3 = r1.A09(r7, r0)
            if (r3 != 0) goto L_0x003a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/setchatreadreceiptssent/no chat for "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0039:
            return
        L_0x003a:
            long r1 = r3.A0S
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r3.A0R = r8
            r3.A0S = r10
            X.163 r5 = r6.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, Error | RuntimeException -> 0x006b }
            monitor-enter(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, Error | RuntimeException -> 0x006b }
            r0 = 3
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0068 }
            r4.<init>(r0)     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = "last_read_receipt_sent_message_row_id"
            long r0 = r3.A0R     // Catch:{ all -> 0x0068 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0068 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = "last_read_receipt_sent_message_sort_id"
            long r0 = r3.A0S     // Catch:{ all -> 0x0068 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0068 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0068 }
            monitor-exit(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, Error | RuntimeException -> 0x006b }
            r5.A0K(r4, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, Error | RuntimeException -> 0x006b }
            return
        L_0x0068:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, Error | RuntimeException -> 0x006b }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, Error | RuntimeException -> 0x006b }
        L_0x006b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x0070:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r6.A03
            r0.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DO.A00(X.11F, long, long):void");
    }

    public AnonymousClass1DO(AnonymousClass163 r1, C220412q r2, AnonymousClass12T r3, C220612s r4, AnonymousClass12P r5, AnonymousClass16E r6, AnonymousClass1C5 r7, AnonymousClass1A1 r8) {
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A07 = r8;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }
}
