package X;

import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.19A  reason: invalid class name */
public class AnonymousClass19A {
    public AnonymousClass612 A00;
    public final AnonymousClass19J A01;
    public final C20810yC A02;
    public final AnonymousClass19I A03;
    public final AnonymousClass19B A04;
    public final AnonymousClass19H A05;
    public final C235819a A06;
    public final AnonymousClass19L A07;
    public final C21690ze A08;
    public final C19700wN A09;
    public final AnonymousClass19Z A0A;
    public final AnonymousClass19M A0B;
    public final AtomicInteger A0C = new AtomicInteger();
    public volatile C31901cZ A0D;

    public AnonymousClass19A(C19700wN r2, AnonymousClass19J r3, C20810yC r4, AnonymousClass19I r5, AnonymousClass19Z r6, AnonymousClass19B r7, AnonymousClass19H r8, C235819a r9, AnonymousClass19M r10, AnonymousClass19L r11, C21690ze r12) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r7, 3);
        AnonymousClass00C.A0D(r8, 4);
        AnonymousClass00C.A0D(r5, 5);
        AnonymousClass00C.A0D(r3, 6);
        AnonymousClass00C.A0D(r12, 7);
        AnonymousClass00C.A0D(r11, 8);
        AnonymousClass00C.A0D(r10, 9);
        AnonymousClass00C.A0D(r6, 10);
        AnonymousClass00C.A0D(r9, 11);
        this.A02 = r4;
        this.A09 = r2;
        this.A04 = r7;
        this.A05 = r8;
        this.A03 = r5;
        this.A01 = r3;
        this.A08 = r12;
        this.A07 = r11;
        this.A0B = r10;
        this.A0A = r6;
        this.A06 = r9;
    }

    public static final void A03(AnonymousClass19A r8, C236119d r9, C203399nx r10, String str, int i, long j, boolean z) {
        AnonymousClass19A r2 = r8;
        C236119d r4 = r9;
        String str2 = str;
        if (r8.A0I()) {
            StringBuilder sb = new StringBuilder();
            sb.append("MessageClient/sendIqWithCallbackIfConnectedInternal/add-to-pending type: ");
            int i2 = i;
            sb.append(i);
            sb.append(" id: ");
            sb.append(str);
            Log.i(sb.toString());
            r8.A06.A04(r4, str2, i2, j, false);
            boolean z2 = false;
            if (j > 0) {
                z2 = true;
            }
            A02(C54772tW.A00(r10, Boolean.valueOf(z2), str2, i2, z, true), r2, false);
            return;
        }
        r8.A06.A05(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MessageClient/sendIqWithCallback ready:");
        AnonymousClass19J r1 = r8.A01;
        sb2.append(r1.A06);
        sb2.append(" connected:");
        boolean z3 = false;
        if (r1.A04 == 2) {
            z3 = true;
        }
        sb2.append(z3);
        sb2.append(" iqId=");
        sb2.append(str);
        Log.i(sb2.toString());
        r9.BVN(str);
    }

    public static final boolean A04(AnonymousClass19A r11, C236119d r12, C203399nx r13, String str, int i, long j, boolean z) {
        AnonymousClass19A r4 = r11;
        boolean z2 = r11.A01.A06;
        boolean z3 = false;
        String str2 = str;
        if (!z2 || r4.A0D == null) {
            r4.A06.A05(str);
            StringBuilder sb = new StringBuilder();
            sb.append("MessageClient/sendIqWithCallback not ready, iqId=");
            sb.append(str);
            Log.i(sb.toString());
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MessageClient/sendIqWithCallbackInternal/add-to-pending type: ");
        int i2 = i;
        sb2.append(i);
        sb2.append(" id: ");
        sb2.append(str);
        Log.i(sb2.toString());
        r4.A06.A04(r12, str2, i2, j, false);
        if (j > 0) {
            z3 = true;
        }
        A02(C54772tW.A00(r13, Boolean.valueOf(z3), str2, i2, z, false), r4, true);
        return true;
    }

    public final AnonymousClass777 A05(Message message, C207209uj r5) {
        AnonymousClass00C.A0D(message, 1);
        C18740tg.A07(r5, "MessageClient/sendAckableMessage: stanzaKey is null");
        C207209uj A002 = A00(r5);
        AnonymousClass777 r1 = new AnonymousClass777();
        this.A0A.A00(A002, r1);
        A02(message, this, false);
        return r1;
    }

    public final AnonymousClass777 A06(Message message, String str) {
        AnonymousClass00C.A0D(message, 1);
        C18740tg.A07(str, "MessageClient/sendIq: id is null");
        AnonymousClass777 r2 = new AnonymousClass777();
        Map map = this.A0A.A04;
        synchronized (map) {
            map.put(str, r2);
        }
        A02(message, this, false);
        this.A06.A05(str);
        return r2;
    }

    public final void A0C(Message message, String str) {
        AnonymousClass00C.A0D(message, 0);
        A01(message, this, str, false);
    }

    public final void A0E(C236119d r9, C203399nx r10, String str, int i, long j) {
        AnonymousClass00C.A0D(str, 1);
        AnonymousClass00C.A0D(r10, 2);
        C236119d r1 = r9;
        A03(this, r1, r10, str, i, j, false);
    }

    public final void A0F(C236119d r19, C203399nx r20, String str, int i, long j) {
        String str2 = str;
        AnonymousClass00C.A0D(str2, 1);
        C236119d r5 = r19;
        C203399nx r6 = r20;
        int i2 = i;
        long j2 = j;
        if (!A0K(r5, r6, str2, i2, j2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("MessageClient/sendIqWithCallback/add-to-pending type: ");
            sb.append(i2);
            sb.append(" id: ");
            sb.append(str2);
            Log.i(sb.toString());
            this.A06.A04(r5, str2, i2, j2, true);
            AnonymousClass19I r52 = this.A03;
            boolean z = false;
            if (j > 0) {
                z = true;
            }
            r52.A00(C54772tW.A00(r6, Boolean.valueOf(z), str2, i2, false, false), str2, false);
        }
    }

    public final void A0H(C207209uj r4) {
        AnonymousClass00C.A0D(r4, 0);
        this.A07.A03(r4.A00);
        Message A022 = C203429o0.A02(this.A09, this.A02, r4);
        AnonymousClass00C.A08(A022);
        A0J(A022);
    }

    public final boolean A0J(Message message) {
        AnonymousClass00C.A0D(message, 0);
        if (!this.A01.A06) {
            return false;
        }
        A02(message, this, false);
        return true;
    }

    public final boolean A0K(C236119d r9, C203399nx r10, String str, int i, long j) {
        AnonymousClass00C.A0D(r10, 2);
        C236119d r1 = r9;
        AnonymousClass00C.A0D(r9, 3);
        return A04(this, r1, r10, str, i, j, false);
    }

    public static final C207209uj A00(C207209uj r3) {
        Jid jid = r3.A02;
        AnonymousClass9YT r2 = null;
        if (jid instanceof DeviceJid) {
            DeviceJid deviceJid = (DeviceJid) jid;
            if (deviceJid.getDevice() == 0) {
                r2 = r3.A02();
                r2.A02 = deviceJid.userJid;
            }
        }
        DeviceJid of = DeviceJid.of(r3.A01);
        if (of != null && of.getDevice() == 0) {
            if (r2 == null) {
                r2 = r3.A02();
            }
            r2.A01 = of.userJid;
        } else if (r2 == null) {
            return r3;
        }
        return r2.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d7, code lost:
        if (r0 != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (r8 != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.os.Message r6, X.AnonymousClass19A r7, boolean r8) {
        /*
            X.1cZ r0 = r7.A0D
            if (r0 != 0) goto L_0x0016
            X.19J r1 = r7.A01
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x00f0
            int r1 = r1.A03
            r0 = 12
            if (r1 != r0) goto L_0x00f0
            java.lang.String r0 = "MessageClient/sendXmpp/drop the stanza if xmpp is not ready for a good reason"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0015:
            return
        L_0x0016:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageClient/sendXmpp; type="
            r1.append(r0)
            int r0 = X.C1900396q.A00(r6)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = X.C1900396q.A00(r6)
            switch(r0) {
                case 4: goto L_0x0037;
                case 8: goto L_0x0037;
                case 12: goto L_0x0037;
                case 25: goto L_0x0037;
                case 27: goto L_0x0037;
                case 35: goto L_0x0037;
                case 38: goto L_0x0037;
                case 59: goto L_0x0037;
                case 60: goto L_0x0037;
                case 71: goto L_0x0037;
                case 72: goto L_0x0037;
                case 73: goto L_0x0037;
                case 77: goto L_0x0037;
                case 89: goto L_0x0037;
                case 118: goto L_0x0037;
                case 119: goto L_0x0037;
                case 157: goto L_0x0037;
                case 194: goto L_0x0037;
                case 206: goto L_0x0037;
                case 220: goto L_0x0037;
                case 255: goto L_0x0037;
                case 273: goto L_0x0037;
                case 327: goto L_0x0037;
                case 371: goto L_0x0037;
                case 381: goto L_0x0037;
                case 402: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            if (r8 == 0) goto L_0x003f
        L_0x0037:
            X.612 r0 = r7.A00
            X.C18740tg.A06(r0)
            r0.A00()
        L_0x003f:
            X.0yC r0 = r7.A02
            X.9WB r3 = X.C203429o0.A07(r6, r0)
            if (r3 != 0) goto L_0x005b
            r2 = 0
        L_0x0048:
            X.1cZ r1 = r7.A0D
            if (r1 == 0) goto L_0x0015
            if (r2 != 0) goto L_0x0052
            android.os.Message r2 = android.os.Message.obtain(r6)
        L_0x0052:
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 4
            r2.what = r0
            r1.sendMessage(r2)
            return
        L_0x005b:
            X.19L r2 = r7.A07
            long r0 = r3.A00
            X.9ju r2 = r2.A01(r0)
            if (r2 == 0) goto L_0x00c2
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x00fb }
            if (r0 != 0) goto L_0x008d
            X.0wN r5 = r2.A05     // Catch:{ all -> 0x00fb }
            java.lang.String r4 = "loggable_stanza_already_acked"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r1.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "tag="
            r1.append(r0)     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = r2.A03()     // Catch:{ all -> 0x00fb }
            r1.append(r0)     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = " method=onStanzaProcessed"
            r1.append(r0)     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fb }
            r0 = 1
            r5.A0E(r4, r1, r0)     // Catch:{ all -> 0x00fb }
            goto L_0x00c1
        L_0x008d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r1.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "LoggableStanza/onStanzaProcessed/stanzaId="
            r1.append(r0)     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = r2.A09     // Catch:{ all -> 0x00fb }
            r1.append(r0)     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00fb }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00fb }
            X.19L r4 = r2.A06     // Catch:{ all -> 0x00fb }
            monitor-enter(r4)     // Catch:{ all -> 0x00fb }
            X.19K r0 = r4.A01     // Catch:{ all -> 0x00f8 }
            java.lang.Iterable r0 = r0.getObservers()     // Catch:{ all -> 0x00f8 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00f8 }
        L_0x00b0:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00f8 }
            X.19N r0 = (X.AnonymousClass19N) r0     // Catch:{ all -> 0x00f8 }
            r0.Bh5(r2)     // Catch:{ all -> 0x00f8 }
            goto L_0x00b0
        L_0x00c0:
            monitor-exit(r4)     // Catch:{ all -> 0x00fb }
        L_0x00c1:
            monitor-exit(r2)
        L_0x00c2:
            X.19B r2 = r7.A04
            X.9nx r0 = r3.A01
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "ack"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = "receipt"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            r1 = 0
            if (r0 == 0) goto L_0x00da
        L_0x00d9:
            r1 = 1
        L_0x00da:
            java.lang.String r0 = "Only ack/receipt can be pre-acked."
            X.C18740tg.A0E(r1, r0)
            monitor-enter(r2)
            X.02g r0 = r2.A06     // Catch:{ all -> 0x00fb }
            r0.add(r3)     // Catch:{ all -> 0x00fb }
            monitor-exit(r2)
            r2 = 0
            r1 = 0
            r0 = 43
            android.os.Message r2 = android.os.Message.obtain(r2, r1, r0, r1, r3)
            goto L_0x0048
        L_0x00f0:
            java.lang.String r0 = "sendXmpp called before sending channel is ready"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x00f8:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00fb }
            throw r0     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19A.A02(android.os.Message, X.19A, boolean):void");
    }

    public final Object A08(C203399nx r22, String str, C023509x r24, int i, long j, boolean z) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AnonymousClass0AR.A02;
        boolean z2 = true;
        AnonymousClass0AR r1 = new AnonymousClass0AR(1, AnonymousClass0AA.A01(r24));
        r1.A0J();
        BAY bay = new BAY(r1, 0);
        C203399nx r8 = r22;
        String str2 = str;
        int i2 = i;
        long j2 = j;
        if (z) {
            A03(this, bay, r8, str2, i2, j2, false);
        } else if (!A04(this, bay, r8, str2, i2, j2, false)) {
            StringBuilder sb = new StringBuilder();
            sb.append("MessageClient/sendIq/add-to-pending type: ");
            sb.append(i2);
            sb.append(" id: ");
            sb.append(str2);
            Log.i(sb.toString());
            String str3 = str2;
            int i3 = i2;
            this.A06.A04(bay, str3, i3, j2, true);
            AnonymousClass19I r4 = this.A03;
            if (j <= 0) {
                z2 = false;
            }
            r4.A00(C54772tW.A00(r8, Boolean.valueOf(z2), str3, i3, false, false), str2, false);
        }
        return r1.A0G();
    }

    public final String A09() {
        String obj;
        C235819a r6 = this.A06;
        synchronized (r6.A0A) {
            StringBuilder sb = new StringBuilder();
            sb.append("0");
            int i = r6.A00;
            r6.A00 = i + 1;
            sb.append(Integer.toHexString(i));
            obj = sb.toString();
            boolean z = false;
            if (r6.A0D.put(obj, r6.A09) == null) {
                z = true;
            }
            C18740tg.A0C(z);
            if (r6.A00 == 65536) {
                r6.A04.A0E("iqId too large", (String) null, false);
                r6.A00 = 0;
            }
        }
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public final String A0A() {
        StringBuilder sb = new StringBuilder();
        sb.append('n');
        sb.append(Integer.toHexString(this.A0C.getAndIncrement()));
        return sb.toString();
    }

    public final void A0D(C19970wo r27, C236119d r28, C203399nx r29, String str, int i, int i2, long j) {
        C203399nx r12 = r29;
        int i3 = i;
        long j2 = j;
        C76823pV r8 = new C76823pV(r27, this, r28, r12, i3, i2, j2);
        boolean z = true;
        boolean z2 = false;
        String str2 = str;
        if (!this.A01.A06 || this.A0D == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("MessageClient/sendIqWithRetryInternal/add-to-pending inFlightMessages type: ");
            sb.append(i3);
            sb.append(" id: ");
            sb.append(str2);
            Log.i(sb.toString());
            this.A06.A04(r8, str2, i3, j2, false);
            AnonymousClass19I r2 = this.A03;
            if (j <= 0) {
                z = false;
            }
            r2.A00(C54772tW.A00(r12, Boolean.valueOf(z), str2, i3, false, false), str2, false);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MessageClient/sendIqWithRetryInternal/add-to-pending type: ");
        sb2.append(i3);
        sb2.append(" id: ");
        sb2.append(str2);
        Log.i(sb2.toString());
        this.A06.A04(r8, str2, i3, j2, false);
        if (j > 0) {
            z2 = true;
        }
        A02(C54772tW.A00(r12, Boolean.valueOf(z2), str2, i3, false, false), this, true);
    }

    public final void A0G(C203399nx r7, int i) {
        if (this.A01.A06) {
            A02(C54772tW.A00(r7, (Boolean) null, (String) null, i, false, false), this, false);
        }
    }

    public final boolean A0I() {
        AnonymousClass19J r1 = this.A01;
        if (!r1.A06 || r1.A04 != 2) {
            return false;
        }
        return true;
    }

    public static final void A01(Message message, AnonymousClass19A r5, String str, boolean z) {
        int A002 = C1900396q.A00(message);
        if (r5.A01.A06) {
            if (z) {
                AnonymousClass19H r2 = r5.A05;
                C18740tg.A06(str);
                StringBuilder sb = new StringBuilder();
                sb.append("Ackable message with null id not allowed:");
                sb.append(message);
                C18740tg.A07(str, sb.toString());
                LinkedHashMap linkedHashMap = r2.A00;
                synchronized (linkedHashMap) {
                    int i = 1;
                    if (linkedHashMap.containsKey(str)) {
                        i = 1 + ((Integer) ((Pair) linkedHashMap.get(str)).second).intValue();
                    }
                    linkedHashMap.put(str, Pair.create(message, Integer.valueOf(i)));
                }
            }
            A02(message, r5, false);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MessageClient/sendMessageWhenReady/add-to-pending type: ");
        sb2.append(A002);
        sb2.append(" id: ");
        sb2.append(str);
        Log.i(sb2.toString());
        r5.A03.A00(message, str, z);
    }

    public final AnonymousClass777 A07(C203399nx r10, C207209uj r11, int i) {
        C207209uj A002 = A00(r11);
        AnonymousClass777 r2 = new AnonymousClass777();
        AnonymousClass19J r1 = this.A01;
        if (!r1.A06 || r1.A04 != 2) {
            r2.BVM(new IOException("MessageClient not ready, user not registered likely"));
            return r2;
        }
        this.A0A.A00(A002, r2);
        A02(C54772tW.A00(r10, (Boolean) null, (String) null, i, false, false), this, false);
        return r2;
    }

    public final void A0B(long j) {
        C18740tg.A00();
        AnonymousClass19J r2 = this.A01;
        if (r2.A04 != 2) {
            if (this.A00 != null) {
                Log.i("app/msghandler-not-connected/connecting-now");
                AnonymousClass612 r0 = this.A00;
                if (r0 != null) {
                    r0.A00();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                Log.i("app/msghandler-not-connected/too-early-to-connect");
            }
            Log.i("app/waiting-for-msghandler-to-be-connected");
            C18740tg.A00();
            if (!r2.A02.block(j)) {
                Log.i("gdrive-service/backup-map/timeout-while-waiting-for-msghandler-to-be-connected/abort");
                throw new C33111ej();
            }
        }
        Log.i("app/msghandler-connected/true");
    }
}
