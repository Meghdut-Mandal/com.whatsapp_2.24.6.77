package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.19k  reason: invalid class name and case insensitive filesystem */
public class C236819k extends Handler {
    public final ConcurrentMap A00 = new ConcurrentHashMap();
    public final /* synthetic */ C235819a A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C236819k(Looper looper, C235819a r3) {
        super(looper);
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r5 >= r3.A0B.size()) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r4 = 0
            switch(r0) {
                case 1: goto L_0x0007;
                case 2: goto L_0x0118;
                case 3: goto L_0x012c;
                case 4: goto L_0x0231;
                case 5: goto L_0x0246;
                case 6: goto L_0x00be;
                default: goto L_0x0006;
            }
        L_0x0006:
            return
        L_0x0007:
            X.19a r3 = r10.A01
            int r6 = r11.arg1
            android.util.SparseIntArray r1 = r3.A03
            r0 = -1
            int r5 = r1.get(r6, r0)
            if (r5 < 0) goto L_0x001d
            java.util.List r0 = r3.A0B
            int r1 = r0.size()
            r0 = 1
            if (r5 < r1) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            X.C18740tg.A0C(r0)
            java.util.List r2 = r3.A0B     // Catch:{ 19b -> 0x0052 }
            java.lang.Object r0 = r2.get(r5)     // Catch:{ 19b -> 0x0052 }
            X.19f r0 = (X.C236319f) r0     // Catch:{ 19b -> 0x0052 }
            boolean r0 = r0.BJl(r11, r6)     // Catch:{ 19b -> 0x0052 }
            if (r0 != 0) goto L_0x0006
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 19b -> 0x0052 }
            r1.<init>()     // Catch:{ 19b -> 0x0052 }
            java.lang.String r0 = "Registered handler:"
            r1.append(r0)     // Catch:{ 19b -> 0x0052 }
            java.lang.Object r0 = r2.get(r5)     // Catch:{ 19b -> 0x0052 }
            r1.append(r0)     // Catch:{ 19b -> 0x0052 }
            java.lang.String r0 = " can't handle message of type:"
            r1.append(r0)     // Catch:{ 19b -> 0x0052 }
            r1.append(r6)     // Catch:{ 19b -> 0x0052 }
            java.lang.String r1 = r1.toString()     // Catch:{ 19b -> 0x0052 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 19b -> 0x0052 }
            r0.<init>(r1)     // Catch:{ 19b -> 0x0052 }
            throw r0     // Catch:{ 19b -> 0x0052 }
        L_0x0052:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "XmppIncomingMessageRouter/handleIncomingXmppMessage/corrupt-stream-error/stanza "
            r1.append(r0)
            java.lang.String r0 = r5.bufString
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r0 = "XmppIncomingMessageRouter/handleIncomingXmppMessage/corrupt-stream-error"
            com.whatsapp.util.Log.w(r0, r5)
            X.0wN r2 = r3.A04
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "source=XmppIncomingMessageRouter recvType="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " error="
            r1.append(r0)
            java.lang.String r0 = r5.getMessage()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "CorruptStreamException"
            r2.A0E(r0, r1, r4)
            android.os.Bundle r1 = r11.getData()
            java.lang.String r0 = "stanzaKey"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            X.9uj r0 = (X.C207209uj) r0
            if (r0 == 0) goto L_0x0006
            X.19A r5 = r3.A01
            if (r5 == 0) goto L_0x0006
            X.9YT r4 = r0.A02()
            java.lang.String r3 = "error"
            r2 = 487(0x1e7, float:6.82E-43)
            java.util.Map r1 = r4.A09
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r3, (int) r2)
            r1.put(r3, r0)
            X.9uj r0 = r4.A01()
            r5.A0H(r0)
            return
        L_0x00be:
            java.lang.Object r4 = r11.obj
            X.9uj r4 = (X.C207209uj) r4
            X.19a r5 = r10.A01
            X.19Z r3 = r5.A06
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "received ack; stanzaKey="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Map r2 = r3.A03
            monitor-enter(r2)
            java.lang.Object r1 = r2.remove(r4)     // Catch:{ all -> 0x0250 }
            X.B1r r1 = (X.C23046B1r) r1     // Catch:{ all -> 0x0250 }
            monitor-exit(r2)     // Catch:{ all -> 0x0250 }
            if (r1 == 0) goto L_0x00ea
            r0 = 0
            r1.BVO(r0)
        L_0x00ea:
            if (r4 == 0) goto L_0x0103
            java.lang.String r1 = r4.A05
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = "receipt"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0103
        L_0x00fe:
            X.19O r0 = r3.A02
            r0.A05()
        L_0x0103:
            X.19H r2 = r5.A07
            java.lang.String r1 = r4.A07
            java.lang.String r0 = "message acked with null id"
            X.C18740tg.A07(r1, r0)
            boolean r0 = r2.A00(r1)
            if (r0 == 0) goto L_0x0006
            java.util.LinkedHashMap r0 = r2.A00
            r0.size()
            return
        L_0x0118:
            android.os.Bundle r1 = r11.getData()
            java.lang.String r0 = "iqId"
            java.lang.String r2 = r1.getString(r0)
            X.19a r1 = r10.A01
            java.lang.Object r0 = r11.obj
            X.9nx r0 = (X.C203399nx) r0
            X.C235819a.A00(r1, r0, r2)
            return
        L_0x012c:
            X.19a r7 = r10.A01
            java.lang.Object r3 = r7.A0A
            monitor-enter(r3)
            java.util.Map r2 = r7.A0C     // Catch:{ all -> 0x022e }
            java.util.Set r1 = r2.entrySet()     // Catch:{ all -> 0x022e }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x022e }
            r0.<init>(r1)     // Catch:{ all -> 0x022e }
            r2.clear()     // Catch:{ all -> 0x022e }
            monitor-exit(r3)     // Catch:{ all -> 0x022e }
            java.util.Iterator r6 = r0.iterator()
        L_0x0144:
            boolean r0 = r6.hasNext()
            r5 = 4
            if (r0 == 0) goto L_0x016d
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            X.19c r2 = r7.A05
            r1 = 0
            r2.A01(r1, r3, r5)
            r2.A02(r3)
            java.lang.Object r0 = r0.getValue()
            X.19d r0 = (X.C236119d) r0
            r0.BVN(r3)
            r2.A03(r3, r1)
            goto L_0x0144
        L_0x016d:
            X.19Z r6 = r7.A06
            java.util.Map r3 = r6.A03
            monitor-enter(r3)
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x022b }
            r5.<init>()     // Catch:{ all -> 0x022b }
            java.util.Set r0 = r3.keySet()     // Catch:{ all -> 0x0229 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0229 }
        L_0x017f:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0229 }
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x0229 }
            X.9uj r8 = (X.C207209uj) r8     // Catch:{ all -> 0x0229 }
            java.lang.String r1 = "message"
            java.lang.String r0 = r8.A05     // Catch:{ all -> 0x0229 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0229 }
            if (r0 == 0) goto L_0x017f
            java.lang.String r1 = r8.A06     // Catch:{ all -> 0x0229 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0229 }
            r7 = 0
            if (r0 == 0) goto L_0x01a0
            r1 = 0
            goto L_0x01a4
        L_0x01a0:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0229 }
        L_0x01a4:
            com.whatsapp.jid.Jid r0 = r8.A02     // Catch:{ all -> 0x0229 }
            X.11F r2 = X.AnonymousClass143.A00(r0)     // Catch:{ all -> 0x0229 }
            r0 = 8
            if (r1 == r0) goto L_0x01af
            r7 = 1
        L_0x01af:
            java.lang.String r1 = r8.A07     // Catch:{ all -> 0x0229 }
            X.3Qa r0 = new X.3Qa     // Catch:{ all -> 0x0229 }
            r0.<init>(r2, r1, r7)     // Catch:{ all -> 0x0229 }
            r5.add(r0)     // Catch:{ all -> 0x0229 }
            goto L_0x017f
        L_0x01ba:
            X.1WP r2 = r6.A00     // Catch:{ all -> 0x022b }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x022b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x022b }
            r1.<init>()     // Catch:{ all -> 0x022b }
            java.lang.String r0 = "message-handler-callback/onMessageHandlerAckTimeout/keys:"
            r1.append(r0)     // Catch:{ all -> 0x022b }
            r1.append(r5)     // Catch:{ all -> 0x022b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x022b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x022b }
            X.0wU r1 = r2.A0r     // Catch:{ all -> 0x022b }
            X.1iP r0 = new X.1iP     // Catch:{ all -> 0x022b }
            r0.<init>((X.AnonymousClass1WP) r2, (java.util.List) r5)     // Catch:{ all -> 0x022b }
            r1.Boy(r0)     // Catch:{ all -> 0x022b }
            java.lang.String r0 = "disconnected"
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x022b }
            r5.<init>(r0)     // Catch:{ all -> 0x022b }
            java.util.Set r0 = r3.entrySet()     // Catch:{ all -> 0x022b }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x022b }
        L_0x01ec:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x022b }
            if (r0 == 0) goto L_0x0205
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x022b }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x022b }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x022b }
            X.B1r r0 = (X.C23046B1r) r0     // Catch:{ all -> 0x022b }
            r0.BVM(r5)     // Catch:{ all -> 0x022b }
            r1.getKey()     // Catch:{ all -> 0x022b }
            goto L_0x01ec
        L_0x0205:
            r3.clear()     // Catch:{ all -> 0x022b }
            X.19O r0 = r6.A02     // Catch:{ all -> 0x022b }
            java.util.concurrent.atomic.AtomicInteger r2 = r0.A0G     // Catch:{ all -> 0x022b }
            r2.set(r4)     // Catch:{ all -> 0x022b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x022b }
            r1.<init>()     // Catch:{ all -> 0x022b }
            java.lang.String r0 = "XmppConnectionMetrics all outgoing stanza processing finished counter:"
            r1.append(r0)     // Catch:{ all -> 0x022b }
            int r0 = r2.get()     // Catch:{ all -> 0x022b }
            r1.append(r0)     // Catch:{ all -> 0x022b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x022b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x022b }
            monitor-exit(r3)     // Catch:{ all -> 0x022b }
            return
        L_0x0229:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x022b }
        L_0x022b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x022b }
            throw r0
        L_0x022e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x022e }
            throw r0
        L_0x0231:
            java.lang.Object r3 = r11.obj
            java.lang.String r3 = (java.lang.String) r3
            X.19a r2 = r10.A01
            int r1 = r11.arg1
            r0 = 1
            if (r1 != r0) goto L_0x023d
            r4 = 1
        L_0x023d:
            X.C235819a.A01(r2, r3, r4)
            java.util.concurrent.ConcurrentMap r0 = r10.A00
            r0.remove(r3)
            return
        L_0x0246:
            java.lang.Object r1 = r11.obj
            java.lang.String r1 = (java.lang.String) r1
            X.19a r0 = r10.A01
            X.C235819a.A01(r0, r1, r4)
            return
        L_0x0250:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0250 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C236819k.handleMessage(android.os.Message):void");
    }
}
