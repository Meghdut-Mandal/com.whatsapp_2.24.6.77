package X;

/* renamed from: X.1aP  reason: invalid class name and case insensitive filesystem */
public final class C30561aP {
    public final AnonymousClass005 A00;
    public final AnonymousClass12P A01;

    public C30561aP(AnonymousClass12P r2, AnonymousClass005 r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A01 = r2;
        this.A00 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0086, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.util.Set r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageOrphanResolverManager/deleteMessageOrphans count = "
            r1.append(r0)
            int r0 = r9.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r9.size()
            java.lang.String[] r6 = new java.lang.String[r0]
            java.util.Iterator r5 = r9.iterator()
            r4 = 0
        L_0x0023:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r5.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            int r1 = r4 + 1
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r6[r4] = r0
            r4 = r1
            goto L_0x0023
        L_0x003d:
            r0 = 100
            X.72Z r1 = new X.72Z
            r1.<init>(r6, r0)
            X.12P r0 = r8.A01
            X.1M0 r6 = r0.A05()
            java.util.Iterator r7 = r1.iterator()     // Catch:{ all -> 0x008f }
        L_0x004e:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x008b
            java.lang.Object r5 = r7.next()     // Catch:{ all -> 0x008f }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ all -> 0x008f }
            X.71s r4 = r6.B1k()     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r1.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "_id IN "
            r1.append(r0)     // Catch:{ all -> 0x0084 }
            int r0 = r5.length     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = X.AnonymousClass1M2.A00(r0)     // Catch:{ all -> 0x0084 }
            r1.append(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0084 }
            X.14e r2 = r6.A02     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = "message_orphan"
            java.lang.String r0 = "MessageOrphanResolverManager/deleteMessageOrphans"
            r2.A03(r1, r3, r0, r5)     // Catch:{ all -> 0x0084 }
            r4.A00()     // Catch:{ all -> 0x0084 }
            r4.close()     // Catch:{ all -> 0x008f }
            goto L_0x004e
        L_0x0084:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x008f }
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008b:
            r6.close()
            return
        L_0x008f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30561aP.A00(java.util.Set):void");
    }
}
