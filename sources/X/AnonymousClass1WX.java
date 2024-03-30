package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* renamed from: X.1WX  reason: invalid class name */
public final class AnonymousClass1WX extends HandlerThread {
    public C200139gg A00;
    public boolean A01 = true;
    public final AnonymousClass1WV A02;
    public final AnonymousClass1WW A03;
    public final AnonymousClass1WT A04;
    public final ArrayDeque A05 = new ArrayDeque();
    public final C20810yC A06;
    public final AnonymousClass19B A07;
    public final AnonymousClass1WZ A08 = new AnonymousClass1WZ(this);
    public final AnonymousClass19L A09;

    public AnonymousClass1WX(C20810yC r3, AnonymousClass1WV r4, AnonymousClass1WW r5, AnonymousClass19B r6, AnonymousClass1WT r7, AnonymousClass19L r8) {
        super("WriterThread", 1);
        this.A06 = r3;
        this.A07 = r6;
        this.A09 = r8;
        this.A04 = r7;
        this.A02 = r4;
        this.A03 = r5;
    }

    public void onLooperPrepared() {
        ((Handler) this.A04).obtainMessage(0, new C29291Wb(getLooper(), this)).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r0 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.os.Message r12) {
        /*
            r11 = this;
            android.os.Bundle r2 = r12.getData()
            java.lang.String r0 = "messageClient:iqId"
            java.lang.String r10 = r2.getString(r0)
            java.lang.String r0 = "messageClient:checkCallback"
            boolean r0 = r2.getBoolean(r0)
            if (r0 == 0) goto L_0x002e
            X.1WT r0 = r11.A04
            X.C18740tg.A06(r10)
            X.1WU r0 = (X.AnonymousClass1WU) r0
            X.1WK r0 = r0.A00
            X.19a r0 = r0.A0s
            java.util.Map r1 = r0.A0D
            monitor-enter(r1)
            boolean r0 = r1.containsKey(r10)     // Catch:{ all -> 0x0028 }
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            r1 = 1
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            int r5 = X.C1900396q.A00(r12)
            r0 = 43
            if (r5 != r0) goto L_0x0079
            java.lang.Object r4 = r12.obj
            X.9WB r4 = (X.AnonymousClass9WB) r4
        L_0x003b:
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x0056
            switch(r5) {
                case 0: goto L_0x0068;
                case 4: goto L_0x0068;
                case 5: goto L_0x0068;
                case 8: goto L_0x0068;
                case 13: goto L_0x0068;
                case 14: goto L_0x0068;
                case 18: goto L_0x0068;
                case 21: goto L_0x0068;
                case 22: goto L_0x0068;
                case 23: goto L_0x0068;
                case 24: goto L_0x0068;
                case 29: goto L_0x0068;
                case 38: goto L_0x0068;
                case 43: goto L_0x0068;
                case 69: goto L_0x0068;
                case 70: goto L_0x0068;
                case 74: goto L_0x0068;
                case 77: goto L_0x0068;
                case 85: goto L_0x0068;
                case 86: goto L_0x0068;
                case 87: goto L_0x0068;
                case 89: goto L_0x0068;
                case 105: goto L_0x0068;
                case 106: goto L_0x0068;
                case 118: goto L_0x0068;
                case 119: goto L_0x0068;
                case 124: goto L_0x0068;
                case 132: goto L_0x0068;
                case 133: goto L_0x0068;
                case 162: goto L_0x0068;
                case 164: goto L_0x0068;
                case 183: goto L_0x0068;
                case 184: goto L_0x0068;
                case 189: goto L_0x0068;
                case 192: goto L_0x0068;
                case 193: goto L_0x0068;
                case 196: goto L_0x0068;
                case 214: goto L_0x0068;
                case 215: goto L_0x0068;
                case 216: goto L_0x0068;
                case 222: goto L_0x0068;
                case 223: goto L_0x0068;
                case 226: goto L_0x0068;
                case 229: goto L_0x0068;
                case 230: goto L_0x0068;
                case 231: goto L_0x0068;
                case 232: goto L_0x0068;
                case 241: goto L_0x0068;
                case 248: goto L_0x0068;
                case 251: goto L_0x0068;
                case 261: goto L_0x0068;
                case 263: goto L_0x0068;
                case 270: goto L_0x0068;
                case 271: goto L_0x0068;
                case 274: goto L_0x0068;
                case 275: goto L_0x0068;
                case 277: goto L_0x0068;
                case 279: goto L_0x0068;
                case 296: goto L_0x0068;
                case 327: goto L_0x0068;
                case 332: goto L_0x0068;
                case 342: goto L_0x0068;
                case 363: goto L_0x0068;
                case 368: goto L_0x0068;
                case 369: goto L_0x0068;
                case 370: goto L_0x0068;
                case 377: goto L_0x0068;
                case 378: goto L_0x0068;
                case 404: goto L_0x0068;
                case 405: goto L_0x0068;
                default: goto L_0x0042;
            }
        L_0x0042:
            java.lang.String r0 = "messageClient:dropIfOffline"
            boolean r0 = r2.getBoolean(r0)
            if (r0 != 0) goto L_0x0068
            if (r1 != 0) goto L_0x0068
            java.util.ArrayDeque r1 = r11.A05
            android.os.Message r0 = android.os.Message.obtain(r12)
            r1.add(r0)
        L_0x0055:
            return
        L_0x0056:
            if (r1 != 0) goto L_0x0068
            if (r10 == 0) goto L_0x00df
            X.1WT r0 = r11.A04
            X.1WU r0 = (X.AnonymousClass1WU) r0
            X.1WK r0 = r0.A00
            X.19a r8 = r0.A0s
            java.lang.Object r3 = r8.A0A
            monitor-enter(r3)
            goto L_0x007b
        L_0x0068:
            X.1WT r0 = r11.A04
            X.1WU r0 = (X.AnonymousClass1WU) r0
            X.1WK r0 = r0.A00
            X.19a r0 = r0.A0s
            if (r10 == 0) goto L_0x0055
            java.lang.Object r3 = r0.A0A
            monitor-enter(r3)
            goto L_0x011a
        L_0x0079:
            r4 = 0
            goto L_0x003b
        L_0x007b:
            java.util.Map r7 = r8.A0D     // Catch:{ all -> 0x00dc }
            boolean r0 = r7.containsKey(r10)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00da
            java.util.Map r6 = r8.A0C     // Catch:{ all -> 0x00dc }
            boolean r0 = r6.containsKey(r10)     // Catch:{ all -> 0x00dc }
            r2 = 0
            if (r0 != 0) goto L_0x008d
            r2 = 1
        L_0x008d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r1.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "Unhandled iq-response for id:"
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            r1.append(r10)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00dc }
            X.C18740tg.A0F(r2, r0)     // Catch:{ all -> 0x00dc }
            java.lang.Object r0 = r7.remove(r10)     // Catch:{ all -> 0x00dc }
            X.19d r0 = (X.C236119d) r0     // Catch:{ all -> 0x00dc }
            r6.put(r10, r0)     // Catch:{ all -> 0x00dc }
            X.19c r8 = r8.A05     // Catch:{ all -> 0x00dc }
            java.util.concurrent.ConcurrentHashMap r0 = r8.A01     // Catch:{ all -> 0x00dc }
            java.lang.Object r9 = r0.get(r10)     // Catch:{ all -> 0x00dc }
            X.9Nt r9 = (X.C194009Nt) r9     // Catch:{ all -> 0x00dc }
            if (r9 == 0) goto L_0x00da
            long r1 = r9.A07     // Catch:{ all -> 0x00dc }
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00da
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00dc }
            r9.A07 = r0     // Catch:{ all -> 0x00dc }
            X.0zf r1 = X.C236019c.A00(r8)     // Catch:{ all -> 0x00dc }
            int r2 = r10.hashCode()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "iq_queue"
            r1.A01(r2, r0)     // Catch:{ all -> 0x00dc }
            X.0zf r1 = X.C236019c.A00(r8)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "iq_send"
            r1.A02(r2, r0)     // Catch:{ all -> 0x00dc }
        L_0x00da:
            monitor-exit(r3)     // Catch:{ all -> 0x00dc }
            goto L_0x00df
        L_0x00dc:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00dc }
            throw r0
        L_0x00df:
            if (r4 == 0) goto L_0x00eb
            X.1WZ r3 = r11.A08     // Catch:{ 1WY -> 0x0113, IOException -> 0x00f1 }
            long r1 = r4.A00     // Catch:{ 1WY -> 0x0113, IOException -> 0x00f1 }
            X.9nx r0 = r4.A01     // Catch:{ 1WY -> 0x0113, IOException -> 0x00f1 }
            r3.A01(r0, r5, r1)     // Catch:{ 1WY -> 0x0113, IOException -> 0x00f1 }
            return
        L_0x00eb:
            X.1WZ r0 = r11.A08     // Catch:{ 1WY -> 0x0113, IOException -> 0x00f1 }
            X.C203429o0.A0A(r12, r0, r0)     // Catch:{ 1WY -> 0x0113, IOException -> 0x00f1 }
            return
        L_0x00f1:
            r1 = move-exception
            java.lang.String r0 = "WriterThread/handleXmppSend unknown I/O error writing to the chat connection"
            com.whatsapp.util.Log.e(r0, r1)
            r2 = 1
            r11.A01 = r2
            android.os.Handler r1 = r12.getTarget()
            android.os.Message r0 = android.os.Message.obtain(r12)
            r1.sendMessageAtFrontOfQueue(r0)
            X.1WT r1 = r11.A04
            X.9gg r0 = r11.A00
            android.os.Handler r1 = (android.os.Handler) r1
            android.os.Message r0 = r1.obtainMessage(r2, r0)
            r0.sendToTarget()
            return
        L_0x0113:
            r1 = move-exception
            java.lang.String r0 = "WriterThread/handleXmppSend tried to write too large of a buffer to the chat connection"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x011a:
            X.19k r2 = r0.A08     // Catch:{ all -> 0x0132 }
            java.util.concurrent.ConcurrentMap r0 = r2.A00     // Catch:{ all -> 0x0132 }
            java.lang.Object r1 = r0.remove(r10)     // Catch:{ all -> 0x0132 }
            if (r1 == 0) goto L_0x0128
            r0 = 4
            r2.removeMessages(r0, r1)     // Catch:{ all -> 0x0132 }
        L_0x0128:
            r0 = 5
            android.os.Message r0 = r2.obtainMessage(r0, r10)     // Catch:{ all -> 0x0132 }
            r0.sendToTarget()     // Catch:{ all -> 0x0132 }
            monitor-exit(r3)     // Catch:{ all -> 0x0132 }
            return
        L_0x0132:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0132 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WX.A00(android.os.Message):void");
    }
}
