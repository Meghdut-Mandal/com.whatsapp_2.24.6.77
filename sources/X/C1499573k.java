package X;

/* renamed from: X.73k  reason: invalid class name and case insensitive filesystem */
public class C1499573k implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public C1499573k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, long j) {
        this.A06 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = j;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x010b, code lost:
        if (X.AnonymousClass3T2.A00(r8.A0G, r8.A1W, r2) == false) goto L_0x010d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x007b */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r29 = this;
            r10 = r29
            int r0 = r10.A06
            switch(r0) {
                case 0: goto L_0x016d;
                case 1: goto L_0x00a2;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r10.A01
            X.5yF r2 = (X.C124475yF) r2
            java.lang.Object r4 = r10.A02
            java.io.File r4 = (java.io.File) r4
            java.lang.Object r5 = r10.A03
            javax.crypto.Cipher r5 = (javax.crypto.Cipher) r5
            java.lang.Object r3 = r10.A04
            android.os.ParcelFileDescriptor r3 = (android.os.ParcelFileDescriptor) r3
            java.lang.Object r1 = r10.A05
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0096 }
            java.io.FileInputStream r6 = X.C90524aI.A0U(r4)     // Catch:{ OperationCanceledException -> 0x0082, IOException -> 0x007b }
            if (r5 != 0) goto L_0x0028
            r8 = r6
            goto L_0x002d
        L_0x0028:
            javax.crypto.CipherInputStream r8 = new javax.crypto.CipherInputStream     // Catch:{ all -> 0x0071 }
            r8.<init>(r6, r5)     // Catch:{ all -> 0x0071 }
        L_0x002d:
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r9 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ all -> 0x0067 }
            r9.<init>(r3)     // Catch:{ all -> 0x0067 }
            X.AnonymousClass6T9.A01(r1, r8, r9, r0)     // Catch:{ IOException -> 0x0036 }
            goto L_0x0053
        L_0x0036:
            r7 = move-exception
            java.lang.String r0 = "ExportMigrationApi/Failed while writing to a remote stream "
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x005d }
            X.0wN r5 = r2.A00     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "xpm-export-api-remote-write"
            java.lang.String r0 = r7.getMessage()     // Catch:{ all -> 0x005d }
            r5.A0D(r1, r0, r7)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "Failed to write data."
            r3.closeWithError(r0)     // Catch:{ IOException -> 0x004d }
            goto L_0x0053
        L_0x004d:
            r1 = move-exception
            java.lang.String r0 = "ExportMigrationApi/Failed to close the pipe after an error."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x005d }
        L_0x0053:
            r9.close()     // Catch:{ all -> 0x0067 }
            r8.close()     // Catch:{ all -> 0x0071 }
            r6.close()     // Catch:{ OperationCanceledException -> 0x0082, IOException -> 0x007b }
            goto L_0x008b
        L_0x005d:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0067 }
        L_0x0066:
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x006c }
            goto L_0x0070
        L_0x006c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0071 }
        L_0x0070:
            throw r1     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0076 }
            goto L_0x007a
        L_0x0076:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OperationCanceledException -> 0x0082, IOException -> 0x007b }
        L_0x007a:
            throw r1     // Catch:{ OperationCanceledException -> 0x0082, IOException -> 0x007b }
        L_0x007b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "ExportMigrationApi/Failed to close stream for "
            goto L_0x0088
        L_0x0082:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "ExportMigrationApi/Cancelled by remote peer while streaming "
        L_0x0088:
            X.C36321k7.A1L(r4, r0, r1)     // Catch:{ all -> 0x0096 }
        L_0x008b:
            monitor-enter(r2)
            java.util.Set r0 = r2.A04     // Catch:{ all -> 0x0093 }
            r0.remove(r3)     // Catch:{ all -> 0x0093 }
            monitor-exit(r2)     // Catch:{ all -> 0x0093 }
            return
        L_0x0093:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0093 }
            throw r0
        L_0x0096:
            r1 = move-exception
            monitor-enter(r2)
            java.util.Set r0 = r2.A04     // Catch:{ all -> 0x009f }
            r0.remove(r3)     // Catch:{ all -> 0x009f }
            monitor-exit(r2)     // Catch:{ all -> 0x009f }
            throw r1
        L_0x009f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009f }
            throw r0
        L_0x00a2:
            java.lang.Object r8 = r10.A01
            X.2IR r8 = (X.AnonymousClass2IR) r8
            java.lang.Object r9 = r10.A02
            java.util.List r9 = (java.util.List) r9
            long r14 = r10.A00
            java.lang.Object r7 = r10.A03
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.Object r6 = r10.A04
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r11 = r10.A05
            java.util.Iterator r18 = r9.iterator()
            r16 = 0
            r26 = 0
            r10 = 0
        L_0x00bf:
            boolean r0 = r18.hasNext()
            r12 = 1
            if (r0 == 0) goto L_0x00f7
            X.2bU r0 = X.C36441kJ.A0r(r18)
            X.3Qj r5 = X.AnonymousClass2bU.A00(r0)
            X.1D5 r13 = r8.A1V
            long r3 = r0.A00
            boolean r0 = r5.A0c
            if (r0 == 0) goto L_0x00e8
            r1 = 0
        L_0x00d8:
            long r3 = r3 - r1
            long r26 = r26 + r3
            X.1D5 r1 = r8.A1V
            java.lang.String r0 = r5.A0L
            X.5z2 r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x00f7
            int r10 = r10 + 1
            goto L_0x00bf
        L_0x00e8:
            java.lang.String r0 = r5.A0L
            r1 = 0
            if (r0 == 0) goto L_0x00d8
            X.5z2 r0 = r13.A00(r0)
            if (r0 == 0) goto L_0x00d8
            long r1 = r0.A0A
            goto L_0x00d8
        L_0x00f7:
            int r0 = r9.size()
            if (r0 != r12) goto L_0x010d
            X.3T1 r2 = r8.getFMessage()
            X.1E2 r1 = r8.A1W
            X.0yC r0 = r8.A0G
            boolean r0 = X.AnonymousClass3T2.A00(r0, r1, r2)
            r20 = 1
            if (r0 != 0) goto L_0x010f
        L_0x010d:
            r20 = 0
        L_0x010f:
            int r0 = r9.size()
            if (r10 != r0) goto L_0x0132
            int r0 = (r26 > r16 ? 1 : (r26 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x011b
            r26 = r14
        L_0x011b:
            X.17Y r1 = r8.A0R
            X.74o r0 = new X.74o
            r25 = 0
            r21 = r0
            r22 = r8
            r23 = r7
            r24 = r6
            r28 = r20
            r21.<init>(r22, r23, r24, r25, r26, r28)
            r1.A0H(r0)
        L_0x0131:
            return
        L_0x0132:
            java.lang.Object r0 = r7.getTag()
            if (r0 != r11) goto L_0x0131
            X.17Y r1 = r8.A0R
            X.74o r0 = new X.74o
            r25 = 1
            r21 = r0
            r22 = r8
            r23 = r7
            r24 = r6
            r26 = r14
            r28 = r20
            r21.<init>(r22, r23, r24, r25, r26, r28)
            r1.A0H(r0)
            X.1D5 r2 = r8.A1V
            X.0ts r0 = r8.A0E
            android.content.Context r12 = r8.getContext()
            X.5MU r1 = new X.5MU
            r16 = r6
            r17 = r9
            r18 = r14
            r11 = r1
            r13 = r7
            r14 = r0
            r15 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r20)
            X.0wU r0 = r8.A21
            X.C36391kE.A1Q(r1, r0)
            return
        L_0x016d:
            java.lang.Object r0 = r10.A01
            X.1A1 r0 = (X.AnonymousClass1A1) r0
            long r5 = r10.A00
            java.lang.Object r4 = r10.A02
            X.1SR r4 = (X.AnonymousClass1SR) r4
            java.lang.Object r3 = r10.A03
            X.2bJ r3 = (X.AnonymousClass2bJ) r3
            java.lang.Object r1 = r10.A04
            X.3KV r1 = (X.AnonymousClass3KV) r1
            java.lang.Object r2 = r10.A05
            X.0xM r2 = (X.C20310xM) r2
            X.3T1 r0 = X.C36421kH.A0R(r0, r5)
            if (r0 == 0) goto L_0x018e
            r0 = 0
            r4.A03(r3, r0)
            return
        L_0x018e:
            java.lang.String r0 = r1.A06
            r3.A02 = r0
            int r0 = r1.A00
            r3.A00 = r0
            long r0 = r1.A03
            r3.A01 = r0
            r2.A0h(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1499573k.run():void");
    }
}
