package X;

/* renamed from: X.8rN  reason: invalid class name and case insensitive filesystem */
public final class C183798rN extends C19950wm {
    public final C19700wN A00;
    public final C22821AwW A01;
    public final C201609jx A02;

    public C183798rN(C19700wN r2, C22821AwW awW, C201609jx r4) {
        super("ReaderThread");
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = awW;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (X.C203399nx.A0I(r4, "notification") != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            java.lang.String r17 = "ReaderThread/error"
            r8 = 1
            android.os.Process.setThreadPriority(r8)
        L_0x0006:
            r7 = 0
            r6 = r18
            X.9jx r5 = r6.A02     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            X.1Va r13 = r5.A0E     // Catch:{ 19b | IOException -> 0x0185, RuntimeException -> 0x0179 }
            X.9nx r4 = r13.A08()     // Catch:{ 19b | IOException -> 0x0185, RuntimeException -> 0x0179 }
            if (r4 != 0) goto L_0x0015
            goto L_0x016b
        L_0x0015:
            boolean r0 = r5.A0C     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            if (r0 != 0) goto L_0x00b4
            java.lang.String r10 = "message"
            boolean r16 = X.C203399nx.A0I(r4, r10)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            if (r16 != 0) goto L_0x0032
            java.lang.String r0 = "receipt"
            boolean r0 = X.C203399nx.A0I(r4, r0)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "notification"
            boolean r1 = X.C203399nx.A0I(r4, r0)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            r0 = 0
            if (r1 == 0) goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            java.lang.String r12 = "notification"
            java.lang.String r11 = "receipt"
            java.lang.String r9 = "offline"
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = X.C36391kE.A0x(r4, r9)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            if (r0 == 0) goto L_0x0073
            java.lang.String r2 = "t"
            r0 = -1
            long r2 = r4.A0V(r2, r0)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x0058
            long r0 = r5.A08     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r14
            long r0 = java.lang.Math.min(r0, r2)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            r5.A08 = r0     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
        L_0x0058:
            r2 = 1
            if (r16 == 0) goto L_0x0062
            long r0 = r5.A04     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            long r0 = r0 + r2
            r5.A04 = r0     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            goto L_0x006d
        L_0x0062:
            boolean r0 = X.C203399nx.A0I(r4, r11)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            if (r0 == 0) goto L_0x00ce
            long r0 = r5.A06     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            long r0 = r0 + r2
            r5.A06 = r0     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
        L_0x006d:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            r5.A03 = r0     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
        L_0x0073:
            java.lang.String r0 = "ib"
            boolean r0 = X.C203399nx.A0I(r4, r0)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            if (r0 == 0) goto L_0x00b4
            X.9nx r2 = r4.A0b(r7)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            java.lang.String r0 = "offline_preview"
            boolean r0 = X.C203399nx.A0I(r2, r0)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            if (r0 == 0) goto L_0x00c5
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            r5.A07 = r0     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            int r0 = r2.A0S(r10, r7)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            long r0 = (long) r0     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            r5.A00 = r0     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            int r0 = r2.A0S(r11, r7)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            long r0 = (long) r0     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            r5.A02 = r0     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            int r0 = r2.A0S(r12, r7)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            long r0 = (long) r0     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            r5.A01 = r0     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            X.19O r1 = r5.A0F     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0E     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            boolean r0 = r0.getAndSet(r8)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            if (r0 != 0) goto L_0x00af
            X.AnonymousClass19O.A01(r1)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
        L_0x00af:
            java.lang.String r0 = "XmppConnectionMetrics/onOfflineResumeStarted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
        L_0x00b4:
            java.util.Map r1 = r5.A0A     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            java.lang.String r0 = r4.A00     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            X.9Wz r0 = (X.C195969Wz) r0     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            if (r0 == 0) goto L_0x00da
            r0.A01(r4)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            goto L_0x0006
        L_0x00c5:
            boolean r0 = X.C203399nx.A0I(r2, r9)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            if (r0 == 0) goto L_0x00b4
            r5.A0B = r8     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            goto L_0x00b4
        L_0x00ce:
            boolean r0 = X.C203399nx.A0I(r4, r12)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            if (r0 == 0) goto L_0x006d
            long r0 = r5.A05     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            long r0 = r0 + r2
            r5.A05 = r0     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            goto L_0x006d
        L_0x00da:
            r0 = 488(0x1e8, float:6.84E-43)
            r5.A05(r4, r0)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            java.lang.String r0 = "ConnectionReader/read tag found in map, but canHandleStanzaType returned false"
            X.C18740tg.A0D(r7, r0)     // Catch:{ 19b -> 0x0105, Exception -> 0x00e6 }
            goto L_0x0006
        L_0x00e6:
            r9 = move-exception
            java.lang.String r0 = "ConnectionReader/read/next-tree"
            com.whatsapp.util.Log.e(r0, r9)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            r13.A09()     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            boolean r0 = r9 instanceof X.C21822Aay     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            if (r0 != 0) goto L_0x0178
            java.lang.String r1 = r4.A00     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            if (r0 == 0) goto L_0x0102
            r0 = 10
            X.C201609jx.A01(r4, r5, r0)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
        L_0x0102:
            r0 = 500(0x1f4, float:7.0E-43)
            goto L_0x0166
        L_0x0105:
            r9 = move-exception
            java.lang.String r3 = r4.A00     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.lang.String r11 = X.C201609jx.A00(r3)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            if (r11 == 0) goto L_0x0178
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.lang.String r0 = "ConnectionReader/maybeSendCorruptStreamExceptionResolutionAck STANZA_PARSING_ERROR id="
            r2.append(r0)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.lang.String r0 = "id"
            r1 = 0
            java.lang.String r0 = r4.A0i(r0, r1)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            X.C36351kA.A1P(r0, r2, r9)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.lang.String r0 = "cls:"
            r10.append(r0)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            r10.append(r11)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.lang.String r2 = " "
            r10.append(r2)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.lang.String r0 = "type"
            java.lang.String r1 = r4.A0i(r0, r1)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            if (r1 == 0) goto L_0x013f
            java.lang.String r0 = "type:"
            X.AnonymousClass000.A1D(r0, r1, r2, r10)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
        L_0x013f:
            X.0wN r2 = r5.A0D     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.lang.String r0 = "source=ConnectionReader debug="
            r1.append(r0)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            r1.append(r10)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.lang.String r0 = " message="
            java.lang.String r1 = X.C36331k8.A0i(r0, r1, r9)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.lang.String r0 = "CorruptStreamException"
            r2.A0E(r0, r1, r7)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            if (r0 == 0) goto L_0x0164
            r0 = 4
            X.C201609jx.A01(r4, r5, r0)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
        L_0x0164:
            r0 = 487(0x1e7, float:6.82E-43)
        L_0x0166:
            r5.A05(r4, r0)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            goto L_0x0006
        L_0x016b:
            java.lang.String r0 = "ReaderThread/logout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AwW r0 = r6.A01
            android.os.Handler r0 = (android.os.Handler) r0
            r0.sendEmptyMessage(r8)
            return
        L_0x0178:
            throw r9     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
        L_0x0179:
            r3 = move-exception
            X.1Va r1 = r5.A0E     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.lang.String r0 = "ConnectionReader/read/next-tree"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            r1.A09()     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            goto L_0x01a4
        L_0x0185:
            r3 = move-exception
            java.lang.String r0 = "ConnectionReader/read/next-tree"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.util.Map r2 = r5.A09     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            java.util.Iterator r1 = X.AnonymousClass000.A0y(r2)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
        L_0x0191:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            if (r0 == 0) goto L_0x01a1
            java.lang.Object r0 = X.C36351kA.A0u(r1)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            X.9Xg r0 = (X.C196019Xg) r0     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            r0.A04(r3)     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
            goto L_0x0191
        L_0x01a1:
            r2.clear()     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
        L_0x01a4:
            throw r3     // Catch:{ IOException -> 0x01cb, 19b -> 0x01a5 }
        L_0x01a5:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "ReaderThread/corrupt-stream-error/stanza "
            r1.append(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = r4.bufString     // Catch:{ all -> 0x01e5 }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "ReaderThread/corrupt-stream-error"
            com.whatsapp.util.Log.i(r0, r4)     // Catch:{ all -> 0x01e5 }
            X.0wN r3 = r6.A00     // Catch:{ all -> 0x01e5 }
            java.lang.String r2 = "CorruptStreamException"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "source=ReaderThread message="
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r4)     // Catch:{ all -> 0x01e5 }
            r3.A0E(r2, r0, r7)     // Catch:{ all -> 0x01e5 }
            goto L_0x01d2
        L_0x01cb:
            r1 = move-exception
            java.lang.String r0 = "ReaderThread/io-error"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x01e5 }
            goto L_0x01d3
        L_0x01d2:
            r8 = 2
        L_0x01d3:
            com.whatsapp.util.Log.i((java.lang.String) r17)
            X.AwW r1 = r6.A01
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 2
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.arg1 = r8
            r0.sendToTarget()
            return
        L_0x01e5:
            r2 = move-exception
            com.whatsapp.util.Log.i((java.lang.String) r17)
            X.AwW r1 = r6.A01
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 2
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.arg1 = r7
            r0.sendToTarget()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183798rN.run():void");
    }
}
