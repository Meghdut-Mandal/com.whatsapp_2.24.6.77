package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Set;

public final class AX0 implements Runnable {
    public final long A00;
    public final long A01;
    public final Jid A02;
    public final UserJid A03;
    public final Set A04;
    public final boolean A05;
    public final boolean A06;
    public final long A07;
    public final C19700wN A08;
    public final C19730wQ A09;
    public final AnonymousClass1QJ A0A;
    public final AnonymousClass1FN A0B;
    public final C20810yC A0C;
    public final AnonymousClass3T1 A0D;
    public final AnonymousClass777 A0E;
    public final Runnable A0F;
    public final boolean A0G;
    public final C19460v5 A0H;
    public final AnonymousClass1DT A0I;
    public final AnonymousClass164 A0J;
    public final C19970wo A0K;
    public final AnonymousClass189 A0L;
    public final AnonymousClass187 A0M;
    public final AnonymousClass17S A0N;
    public final AnonymousClass17X A0O;
    public final C25151Fe A0P;
    public final C28291Sb A0Q;
    public final C236419g A0R;
    public final C25121Fb A0S;
    public final C20520xh A0T;
    public final C29871Yh A0U;
    public final C26271Jn A0V;
    public final AnonymousClass1A1 A0W;
    public final AnonymousClass005 A0X;

    public static void A00(AnonymousClass144 r3, AX0 ax0, AnonymousClass8NL r5) {
        C19730wQ r0 = ax0.A09;
        r0.A0G();
        C223413x r02 = r0.A02;
        C18740tg.A06(r02);
        byte[] bArr = ax0.A0L.A0C(new AnonymousClass6EU(C133256Xm.A02(r02), r3.getRawString())).A01;
        C18740tg.A06(bArr);
        AnonymousClass8PE r03 = ((AnonymousClass8SX) r5.A00).senderKeyDistributionMessage_;
        if (r03 == null) {
            r03 = AnonymousClass8PE.DEFAULT_INSTANCE;
        }
        AnonymousClass8N4 r1 = (AnonymousClass8N4) r03.A0q();
        r1.A0V(r3.getRawString());
        r1.A0U(C165607th.A0O(bArr));
        r5.A0e(r1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.1Fu} */
    /* JADX WARNING: type inference failed for: r5v24, types: [java.util.AbstractMap] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02a1, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        com.whatsapp.util.Log.e("send message error building sender key distribution message", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03bb, code lost:
        if (r24 != false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03d9, code lost:
        if (r23 != false) goto L_0x03db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04b7, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04b8, code lost:
        X.C90464aC.A1L("send message runnable failed to build message; messageId=", r6, X.AnonymousClass000.A0u(), r5);
        r9 = r5 instanceof X.C25311Fu;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04c3, code lost:
        if (r9 != false) goto L_0x04c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04c5, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04cf, code lost:
        if (r0.A0C.A0E(5024) == false) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04d1, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04d3, code lost:
        r7 = r0.A0I;
        r12 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04d6, code lost:
        if (r9 != false) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04d8, code lost:
        r12 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04da, code lost:
        r6 = r1.A1f;
        r4 = r1.A0B;
        r15 = r0.A0B.A00(r8).size();
        r3 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04ea, code lost:
        if (r9 != false) goto L_0x04ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04ec, code lost:
        r2 = r5.e2eFailureReason;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04f1, code lost:
        r7.A0P(r1, r2, r12, r6, r4, r15, 0, 0, 0, r19, false, false, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0505, code lost:
        if (r19 != false) goto L_0x0507;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0507, code lost:
        r0.A0Q.A01((X.C06120Sj) null, r8, 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x050f, code lost:
        r0.A0F.run();
        r0 = r0.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0516, code lost:
        if (r0 != null) goto L_0x0518;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0518, code lost:
        r0.BVM(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x051b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x051c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x051e, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0522, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0543, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0544, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0547, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0127, code lost:
        r12 = r0.A0A;
        r15 = r1.A1N;
        r13 = r12.A00.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r14 = r13.A02;
        r5 = X.AnonymousClass001.A0M();
        X.C90494aF.A1H(java.lang.Long.valueOf(r15), r7, r5);
        r14.A0E("INSERT OR REPLACE INTO message_broadcast_ephemeral (message_row_id, shared_secret) VALUES (?, ?)", "INSERT_MESSAGE_SQL", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0188, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0060, code lost:
        if ((r10 instanceof X.C177528dw) != false) goto L_0x0062;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04b7 A[ExcHandler: 1Fu | NullPointerException (r5v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:85:0x0239] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r50 = this;
            r0 = r50
            com.whatsapp.jid.Jid r1 = r0.A02
            r27 = r1
            boolean r1 = r1 instanceof X.C28981Uw
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L_0x0014
            X.0wN r1 = r0.A08
            java.lang.String r0 = "Attempting to send message with invalid jid"
            r1.A0E(r0, r7, r2)
        L_0x0013:
            return
        L_0x0014:
            if (r27 == 0) goto L_0x0549
            boolean r1 = r27.isProtocolCompliant()
            if (r1 == 0) goto L_0x0549
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "send message runnable running; messageId="
            r3.append(r1)
            X.3T1 r1 = r0.A0D
            X.3Qa r8 = r1.A1J
            java.lang.String r6 = r8.A01
            r3.append(r6)
            java.lang.String r2 = "; resend="
            r3.append(r2)
            boolean r2 = r0.A06
            r26 = r2
            r3.append(r2)
            java.lang.String r2 = "; targetDevices="
            r3.append(r2)
            java.util.Set r2 = r0.A04
            r25 = r2
            X.C36321k7.A1N(r2, r3)
            X.11F r10 = r8.A00
            X.0wo r2 = r0.A0K
            r28 = r2
            long r2 = X.C19970wo.A00(r28)
            boolean r24 = X.AnonymousClass143.A0G(r10)
            boolean r4 = r10 instanceof X.C177618e5
            r23 = r4
            boolean r11 = r10 instanceof X.C177538dx
            if (r11 != 0) goto L_0x0062
            boolean r4 = r10 instanceof X.C177528dw
            r22 = 0
            if (r4 == 0) goto L_0x0064
        L_0x0062:
            r22 = 1
        L_0x0064:
            X.0wQ r9 = r0.A09
            com.whatsapp.jid.DeviceJid r4 = com.whatsapp.jid.DeviceJid.of(r27)
            if (r4 == 0) goto L_0x008e
            com.whatsapp.jid.UserJid r4 = r4.userJid
            boolean r4 = r9.A0M(r4)
            if (r4 == 0) goto L_0x008e
            X.19g r4 = r0.A0R
            java.util.ArrayList r4 = r4.A09()
            boolean r4 = X.C36411kG.A1a(r4)
            if (r4 != 0) goto L_0x008e
            java.lang.String r1 = "skip scheduling send message job for self-thread, as there are no paired devices."
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x0085:
            X.777 r1 = r0.A0E
            if (r1 == 0) goto L_0x0013
            r0 = 0
            r1.BVO(r0)
            return
        L_0x008e:
            int r13 = r1.A01
            java.util.concurrent.ConcurrentHashMap r12 = com.whatsapp.jobqueue.job.SendE2EMessageJob.A1E
            java.lang.String r5 = r27.getRawString()
            X.9UO r4 = new X.9UO
            r4.<init>(r5, r6, r7, r13)
            boolean r12 = r12.containsKey(r4)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "send message runnable checking scheduling; messageId="
            r5.append(r4)
            r5.append(r6)
            java.lang.String r4 = "; jobAlreadyScheduled="
            X.C36321k7.A1X(r4, r5, r12)
            if (r26 == 0) goto L_0x00e6
            if (r12 == 0) goto L_0x00cc
            X.777 r1 = r0.A0E
            if (r1 == 0) goto L_0x00bb
            r1.BVO(r7)
        L_0x00bb:
            X.1DT r3 = r0.A0I
            int r2 = r6.hashCode()
            r1 = 5
            boolean r0 = r3.A0a
            if (r0 == 0) goto L_0x0013
            X.1EE r0 = r3.A0N
            r0.A03(r2, r1)
            return
        L_0x00cc:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "recreating e2e message job because it's not in the scheduled list; message.key="
            r5.append(r4)
            r5.append(r8)
            java.lang.String r4 = " edit="
            r5.append(r4)
            int r4 = r1.A01
            java.lang.String r4 = X.C36381kD.A10(r5, r4)
            com.whatsapp.util.Log.w((java.lang.String) r4)
        L_0x00e6:
            boolean r4 = r1 instanceof X.C46902br
            if (r4 == 0) goto L_0x0133
            r4 = r1
            X.2br r4 = (X.C46902br) r4
            int r4 = r4.A00
            if (r4 <= 0) goto L_0x0133
            java.lang.Integer r21 = java.lang.Integer.valueOf(r4)
        L_0x00f5:
            if (r11 == 0) goto L_0x020c
            boolean r4 = r1 instanceof X.AnonymousClass2bO
            if (r4 != 0) goto L_0x020c
            int r4 = r1.A0C
            if (r4 != 0) goto L_0x014b
            r4 = 32
            byte[] r7 = new byte[r4]
            java.security.SecureRandom r4 = new java.security.SecureRandom
            r4.<init>()
            r4.nextBytes(r7)
            X.1FN r4 = r0.A0B
            java.util.HashSet r4 = r4.A00(r8)
            java.util.Iterator r5 = r4.iterator()
        L_0x0115:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x018b
            java.lang.Object r4 = r5.next()
            com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
            boolean r4 = r9.A0N(r4)
            if (r4 == 0) goto L_0x0115
            X.1QJ r12 = r0.A0A
            long r4 = r1.A1N
            r15 = r4
            X.12P r4 = r12.A00
            X.1M0 r13 = r4.A05()
            goto L_0x0136
        L_0x0133:
            r21 = r7
            goto L_0x00f5
        L_0x0136:
            X.14e r14 = r13.A02     // Catch:{ all -> 0x051e }
            java.lang.String r12 = "INSERT OR REPLACE INTO message_broadcast_ephemeral (message_row_id, shared_secret) VALUES (?, ?)"
            java.lang.Object[] r5 = X.AnonymousClass001.A0M()     // Catch:{ all -> 0x051e }
            java.lang.Long r4 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x051e }
            X.C90494aF.A1H(r4, r7, r5)     // Catch:{ all -> 0x051e }
            java.lang.String r4 = "INSERT_MESSAGE_SQL"
            r14.A0E(r12, r4, r5)     // Catch:{ all -> 0x051e }
            goto L_0x0188
        L_0x014b:
            X.1QJ r7 = r0.A0A
            long r4 = r1.A1N
            X.12P r7 = r7.A00
            X.1M0 r12 = r7.get()
            X.14e r14 = r12.A02     // Catch:{ all -> 0x053e }
            java.lang.String r13 = "SELECT shared_secret FROM message_broadcast_ephemeral WHERE message_row_id = ?"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ all -> 0x053e }
            r15 = 0
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x053e }
            r7[r15] = r4     // Catch:{ all -> 0x053e }
            java.lang.String r4 = "GET_SHARED_SECRET_BY_ROW_ID_SQL"
            android.database.Cursor r5 = r14.A09(r13, r4, r7)     // Catch:{ all -> 0x053e }
            boolean r4 = r5.moveToNext()     // Catch:{ all -> 0x0532 }
            if (r4 == 0) goto L_0x0180
            java.lang.String r4 = "shared_secret"
            int r4 = r5.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0532 }
            byte[] r7 = r5.getBlob(r4)     // Catch:{ all -> 0x0532 }
            r5.close()     // Catch:{ all -> 0x053e }
            r12.close()
            goto L_0x018b
        L_0x0180:
            r5.close()     // Catch:{ all -> 0x053e }
            r12.close()
            r7 = 0
            goto L_0x018b
        L_0x0188:
            r13.close()
        L_0x018b:
            java.util.Map r4 = r1.A0y
            r20 = r4
            if (r4 != 0) goto L_0x0214
            X.17S r14 = r0.A0N
            X.C18740tg.A0C(r11)
            java.util.HashMap r20 = X.AnonymousClass001.A0J()
            X.17W r4 = r14.A06
            X.00I r12 = r4.A03(r1)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "SELECT chat_row_id, duration FROM message_view LEFT JOIN message_ephemeral ON _id = message_row_id"
            r5.append(r4)
            java.lang.Object r4 = r12.A00
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r11 = X.AnonymousClass000.A0q(r4, r5)
            java.lang.Object r4 = r12.A01
            X.00I r5 = new X.00I
            r5.<init>(r11, r4)
            X.12P r4 = r14.A04
            X.1M0 r19 = r4.get()
            r4 = r19
            X.14e r12 = r4.A02     // Catch:{ all -> 0x052d }
            java.lang.Object r11 = r5.A00     // Catch:{ all -> 0x052d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x052d }
            java.lang.Object r5 = r5.A01     // Catch:{ all -> 0x052d }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x052d }
            X.C18740tg.A06(r5)     // Catch:{ all -> 0x052d }
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x052d }
            java.lang.Object[] r5 = r5.toArray(r4)     // Catch:{ all -> 0x052d }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ all -> 0x052d }
            java.lang.String r4 = "GET_BROADCAST_ROW_IDS_AND_EPHEMERAL_SETTINGS_SQL"
            android.database.Cursor r13 = r12.A09(r11, r4, r5)     // Catch:{ all -> 0x052d }
            if (r13 == 0) goto L_0x0211
        L_0x01de:
            boolean r4 = r13.moveToNext()     // Catch:{ all -> 0x0523 }
            if (r4 == 0) goto L_0x0208
            X.163 r4 = r14.A01     // Catch:{ all -> 0x0523 }
            X.11F r11 = r4.A0B(r13)     // Catch:{ all -> 0x0523 }
            java.lang.String r4 = "duration"
            int r5 = X.C36351kA.A03(r13, r4)     // Catch:{ all -> 0x0523 }
            com.whatsapp.jid.DeviceJid r18 = com.whatsapp.jid.DeviceJid.of(r11)     // Catch:{ all -> 0x0523 }
            X.3un r12 = new X.3un     // Catch:{ all -> 0x0523 }
            r4 = 0
            r16 = 0
            r15 = r5
            r11 = r4
            r4 = r16
            r12.<init>(r15, r4, r11)     // Catch:{ all -> 0x0523 }
            r5 = r20
            r4 = r18
            r5.put(r4, r12)     // Catch:{ all -> 0x0523 }
            goto L_0x01de
        L_0x0208:
            r13.close()     // Catch:{ all -> 0x052d }
            goto L_0x0211
        L_0x020c:
            r20 = r7
            r19 = r7
            goto L_0x021e
        L_0x0211:
            r19.close()
        L_0x0214:
            X.17X r4 = r0.A0O
            if (r23 == 0) goto L_0x0236
            X.12q r4 = r4.A04
            java.lang.String r19 = r4.A0D(r10)
        L_0x021e:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "send message runnable loading thumbs; messageId="
            X.C36321k7.A1Q(r4, r6, r5)
            X.1Fb r4 = r0.A0S
            r4.A02(r1)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "send message runnable building message; messageId="
            X.C36321k7.A1Q(r4, r6, r5)
            goto L_0x0239
        L_0x0236:
            r19 = 0
            goto L_0x021e
        L_0x0239:
            X.8NL r11 = X.C170918Hz.A0D()     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            boolean r4 = r1 instanceof X.AnonymousClass0p5     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            if (r4 == 0) goto L_0x0254
            X.1Fe r4 = r0.A0P     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            java.util.HashSet r5 = r4.A05(r1)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            if (r5 == 0) goto L_0x04a4
            boolean r4 = r5.isEmpty()     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            if (r4 != 0) goto L_0x04a4
            r4 = r25
            r4.addAll(r5)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
        L_0x0254:
            boolean r4 = r1 instanceof X.AnonymousClass5J0     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            r18 = r4
            if (r4 == 0) goto L_0x02a8
            X.189 r4 = r0.A0L     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            boolean r4 = r4.A0X()     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            if (r4 == 0) goto L_0x028e
            X.13q r4 = X.AnonymousClass11F.A00     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            X.144 r4 = X.AnonymousClass6H4.A00(r10)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            X.C18740tg.A06(r4)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            A00(r4, r0, r11)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
        L_0x026e:
            X.8SX r17 = X.AnonymousClass8NN.A0D(r11)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            java.util.ArrayList r11 = X.C202839mk.A01(r17)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            X.0yC r4 = r0.A0C     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            r30 = r4
            X.0wN r4 = r0.A08     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            r49 = r4
            r10 = r4
            r5 = r30
            r4 = r17
            boolean r4 = X.C202839mk.A03(r10, r5, r4, r11)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            if (r4 != 0) goto L_0x02f5
            boolean r4 = X.C165597tg.A1R(r30)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            goto L_0x02f1
        L_0x028e:
            X.187 r12 = r0.A0M     // Catch:{ InterruptedException | ExecutionException -> 0x02a1, 1Fu | NullPointerException -> 0x04b7 }
            r4 = 12
            X.736 r5 = new X.736     // Catch:{ InterruptedException | ExecutionException -> 0x02a1, 1Fu | NullPointerException -> 0x04b7 }
            r5.<init>(r0, r10, r11, r4)     // Catch:{ InterruptedException | ExecutionException -> 0x02a1, 1Fu | NullPointerException -> 0x04b7 }
            java.util.concurrent.ThreadPoolExecutor r4 = r12.A00     // Catch:{ InterruptedException | ExecutionException -> 0x02a1, 1Fu | NullPointerException -> 0x04b7 }
            java.util.concurrent.Future r4 = r4.submit(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x02a1, 1Fu | NullPointerException -> 0x04b7 }
            r4.get()     // Catch:{ InterruptedException | ExecutionException -> 0x02a1, 1Fu | NullPointerException -> 0x04b7 }
            goto L_0x026e
        L_0x02a1:
            r5 = move-exception
            java.lang.String r4 = "send message error building sender key distribution message"
            com.whatsapp.util.Log.e(r4, r5)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            goto L_0x026e
        L_0x02a8:
            boolean r4 = X.AnonymousClass143.A0H(r10)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            if (r4 == 0) goto L_0x02c6
            X.1Yh r12 = r0.A0U     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            r4 = 0
            X.AnonymousClass00C.A0D(r11, r4)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            X.9Hk r4 = new X.9Hk     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            r4.<init>(r11)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            X.8NL r10 = r4.A01     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            boolean r5 = r4.A00     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            X.9Hl r4 = new X.9Hl     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            r4.<init>(r10, r5)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            r12.A00(r4, r1)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            goto L_0x026e
        L_0x02c6:
            X.1A1 r12 = r0.A0W     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            X.1Jn r5 = r0.A0V     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            X.1DT r4 = r0.A0I     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            X.C202839mk.A02(r4, r1, r5, r12)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            X.17X r4 = r0.A0O     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            boolean r12 = r4.A0B(r10)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            X.0xh r10 = r0.A0T     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            X.9Si r5 = X.C1899396e.A00(r11)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            X.3un r4 = r1.A0R()     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            r5.A00 = r4     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            r5.A07 = r7     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            r4 = 1
            r5.A01 = r4     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            r5.A05 = r12     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            X.9Xy r4 = r5.A00()     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            r10.A02(r4, r1)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            goto L_0x026e
        L_0x02f1:
            if (r4 == 0) goto L_0x02f5
            goto L_0x048c
        L_0x02f5:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "send message runnable creating e2e message job; messageId="
            X.C36321k7.A1Q(r4, r6, r5)
            boolean r16 = X.C66013Ui.A0s(r1)
            boolean r4 = r25.isEmpty()
            if (r4 == 0) goto L_0x037c
            if (r24 != 0) goto L_0x030c
            if (r22 == 0) goto L_0x037c
        L_0x030c:
            X.1FN r11 = r0.A0B
            java.util.HashSet r5 = r11.A00(r8)
            boolean r10 = r0.A0G
            if (r10 == 0) goto L_0x0376
            X.8du r4 = r9.A07()
        L_0x031a:
            r5.add(r4)
            java.lang.String r15 = X.AnonymousClass6UD.A03(r5)
            if (r24 != 0) goto L_0x0325
            if (r22 == 0) goto L_0x037d
        L_0x0325:
            java.util.HashSet r5 = r11.A00(r8)
            if (r10 == 0) goto L_0x0370
            X.8du r4 = r9.A07()
        L_0x032f:
            r5.add(r4)
            r4 = r49
            java.util.Set r4 = X.AnonymousClass143.A09(r4, r5)
            java.lang.String r14 = X.AnonymousClass6X6.A01(r4)
        L_0x033c:
            r4 = r30
            long r4 = X.C66013Ui.A01(r4, r1)
            long r2 = r2 + r4
            long r4 = r0.A07
            r10 = 0
            int r9 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x034f
            long r2 = java.lang.Math.min(r4, r2)
        L_0x034f:
            boolean r4 = r25.isEmpty()
            r47 = r4 ^ 1
            if (r47 == 0) goto L_0x037f
            X.005 r4 = r0.A0X
            r4.get()
            boolean r4 = X.C63903Lw.A00(r1)
            if (r4 == 0) goto L_0x037f
            X.9wx r5 = X.C207769wx.A00
            r4 = r25
            X.AnonymousClass6XG.A01(r5, r4)
            boolean r4 = r25.isEmpty()
            if (r4 == 0) goto L_0x037f
            return
        L_0x0370:
            r9.A0G()
            X.13x r4 = r9.A02
            goto L_0x032f
        L_0x0376:
            r9.A0G()
            X.13x r4 = r9.A02
            goto L_0x031a
        L_0x037c:
            r15 = 0
        L_0x037d:
            r14 = 0
            goto L_0x033c
        L_0x037f:
            long r10 = android.os.SystemClock.uptimeMillis()
            long r40 = X.C19970wo.A00(r28)
            long r4 = r0.A00
            long r40 = r40 - r4
            if (r47 == 0) goto L_0x0486
            r38 = r40
        L_0x038f:
            X.0v5 r12 = r0.A0H
            X.9T1 r9 = new X.9T1
            r28 = r9
            r29 = r12
            r31 = r27
            r32 = r17
            r33 = r6
            r34 = r25
            r28.<init>(r29, r30, r31, r32, r33, r34)
            com.whatsapp.jid.UserJid r6 = r0.A03
            r9.A0A = r6
            int r6 = r1.A0C
            r9.A03 = r6
            int r6 = r1.A1I
            r9.A01 = r6
            boolean r12 = r0.A05
            r9.A0J = r12
            r9.A05 = r10
            r9.A0D = r15
            r9.A0E = r14
            if (r23 != 0) goto L_0x03bd
            r6 = 0
            if (r24 == 0) goto L_0x03be
        L_0x03bd:
            r6 = 1
        L_0x03be:
            r9.A0H = r6
            r9.A04 = r2
            r9.A06 = r4
            long r2 = r0.A01
            r9.A07 = r2
            int r2 = r1.A0F()
            r9.A02 = r2
            int r2 = r1.A01
            r9.A00 = r2
            r2 = r21
            r9.A0B = r2
            if (r24 != 0) goto L_0x03db
            r2 = 0
            if (r23 == 0) goto L_0x03dc
        L_0x03db:
            r2 = 1
        L_0x03dc:
            r9.A0L = r2
            r2 = r16
            r9.A0I = r2
            boolean r3 = r0.A0G
            r9.A0K = r3
            r9.A0M = r7
            r2 = r20
            r9.A0F = r2
            r2 = r19
            r9.A0C = r2
            r2 = r18
            r9.A0G = r2
            X.005 r2 = r0.A0X
            java.lang.Object r4 = r2.get()
            X.1HX r4 = (X.AnonymousClass1HX) r4
            boolean r2 = r1.A1E()
            if (r2 == 0) goto L_0x0484
            java.util.List r2 = r1.A0w
            com.whatsapp.jid.UserJid r2 = r4.A01(r2)
        L_0x0408:
            r9.A09 = r2
            com.whatsapp.jobqueue.job.SendE2EMessageJob r2 = r9.A00()
            X.164 r5 = r0.A0J
            org.whispersystems.jobqueue.JobParameters r4 = r2.parameters
            java.lang.String r6 = r4.groupId
            X.650 r4 = X.AnonymousClass164.A00(r5)
            X.6OM r4 = r4.A05
            int r35 = r4.A01(r6)
            X.650 r4 = X.AnonymousClass164.A00(r5)
            java.util.concurrent.atomic.AtomicInteger r4 = r4.A03
            int r36 = r4.get()
            if (r24 != 0) goto L_0x047b
            if (r22 != 0) goto L_0x047b
            r25 = 0
        L_0x042e:
            X.1DT r9 = r0.A0I
            r30 = 5
            int r8 = r1.A1f
            int r7 = r1.A0C
            r4 = 0
            int r6 = r1.A0B
            r33 = 0
            r34 = 0
            r45 = 0
            r48 = 0
            r27 = r9
            r28 = r1
            r29 = r25
            r31 = r8
            r32 = r7
            r37 = r6
            r42 = r40
            r44 = r12
            r46 = r26
            r27.A0Q(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r45, r46, r47, r48)
            if (r24 == 0) goto L_0x0476
            if (r3 != 0) goto L_0x0476
            if (r25 == 0) goto L_0x0476
            java.util.Iterator r3 = r25.iterator()
        L_0x0460:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0476
            java.lang.Object r1 = r3.next()
            boolean r1 = r1 instanceof X.C177508du
            if (r1 == 0) goto L_0x0460
            r6 = 0
            java.lang.String r3 = "unexpected-lid-in-non-incognito group"
            r1 = r49
            r1.A0E(r3, r6, r4)
        L_0x0476:
            r5.A01(r2)
            goto L_0x0085
        L_0x047b:
            if (r47 != 0) goto L_0x042e
            X.1FN r4 = r0.A0B
            java.util.HashSet r25 = r4.A00(r8)
            goto L_0x042e
        L_0x0484:
            r2 = 0
            goto L_0x0408
        L_0x0486:
            long r12 = r1.A1S
            long r38 = r10 - r12
            goto L_0x038f
        L_0x048c:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            java.lang.String r2 = "SendMessageRunnable/invalid protobuf; message.key="
            r3.append(r2)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            r3.append(r8)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            java.lang.String r2 = " messageTypes="
            X.C36321k7.A1L(r11, r2, r3)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            r2 = 12
            X.1Fu r2 = X.C165567td.A0K(r2)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            throw r2     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
        L_0x04a4:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            java.lang.String r2 = "send message runnable skip sending transient message: "
            X.C36321k7.A1K(r8, r2, r3)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            X.777 r3 = r0.A0E     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            if (r3 == 0) goto L_0x0013
            r2 = 0
            r3.BVO(r2)     // Catch:{ 1Fu | NullPointerException -> 0x04b7 }
            goto L_0x0548
        L_0x04b7:
            r5 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "send message runnable failed to build message; messageId="
            X.C90464aC.A1L(r2, r6, r3, r5)
            boolean r9 = r5 instanceof X.C25311Fu
            if (r9 == 0) goto L_0x04d1
            X.0yC r3 = r0.A0C
            r2 = 5024(0x13a0, float:7.04E-42)
            boolean r2 = r3.A0E(r2)
            r19 = 1
            if (r2 != 0) goto L_0x04d3
        L_0x04d1:
            r19 = 0
        L_0x04d3:
            X.1DT r7 = r0.A0I
            r12 = 3
            if (r9 == 0) goto L_0x04da
            r12 = 13
        L_0x04da:
            int r6 = r1.A1f
            int r4 = r1.A0B
            X.1FN r2 = r0.A0B
            java.util.HashSet r2 = r2.A00(r8)
            int r15 = r2.size()
            boolean r3 = r0.A05
            if (r9 == 0) goto L_0x051c
            r2 = r5
            X.1Fu r2 = (X.C25311Fu) r2
            java.lang.Integer r2 = r2.e2eFailureReason
        L_0x04f1:
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r9 = r7
            r10 = r1
            r11 = r2
            r13 = r6
            r14 = r4
            r22 = r3
            r9.A0P(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r19 == 0) goto L_0x050f
            X.1Sb r3 = r0.A0Q
            r2 = 20
            r1 = 0
            r3.A01(r1, r8, r2)
        L_0x050f:
            java.lang.Runnable r1 = r0.A0F
            r1.run()
            X.777 r0 = r0.A0E
            if (r0 == 0) goto L_0x0013
            r0.BVM(r5)
            return
        L_0x051c:
            r2 = 0
            goto L_0x04f1
        L_0x051e:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0543 }
            throw r1
        L_0x0523:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0528 }
            goto L_0x052c
        L_0x0528:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x052d }
        L_0x052c:
            throw r1     // Catch:{ all -> 0x052d }
        L_0x052d:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0543 }
            throw r1
        L_0x0532:
            r1 = move-exception
            if (r5 == 0) goto L_0x053d
            r5.close()     // Catch:{ all -> 0x0539 }
            goto L_0x053d
        L_0x0539:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x053e }
        L_0x053d:
            throw r1     // Catch:{ all -> 0x053e }
        L_0x053e:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0543 }
            throw r1
        L_0x0543:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0548:
            return
        L_0x0549:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "Attempting to send message with invalid jid: "
            r0 = r27
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0P(r0, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AX0.run():void");
    }

    public AX0(C19460v5 r4, C19700wN r5, C19730wQ r6, AnonymousClass1DT r7, AnonymousClass164 r8, C19970wo r9, AnonymousClass189 r10, AnonymousClass187 r11, AnonymousClass17S r12, AnonymousClass17X r13, AnonymousClass1QJ r14, C25151Fe r15, C28291Sb r16, AnonymousClass1FN r17, C236419g r18, C20810yC r19, C25181Fh r20, C25121Fb r21, C20520xh r22, Jid jid, UserJid userJid, C29871Yh r25, AnonymousClass3T1 r26, C26271Jn r27, AnonymousClass1A1 r28, AnonymousClass777 r29, AnonymousClass005 r30, Runnable runnable, Set set, long j, long j2, long j3, boolean z, boolean z2) {
        this.A0K = r9;
        this.A0C = r19;
        this.A08 = r5;
        this.A09 = r6;
        this.A0J = r8;
        this.A0X = r30;
        this.A0I = r7;
        this.A0M = r11;
        this.A0W = r28;
        this.A0L = r10;
        this.A0Q = r16;
        this.A0B = r17;
        this.A0N = r12;
        this.A0R = r18;
        this.A0V = r27;
        this.A0H = r4;
        this.A0S = r21;
        this.A0O = r13;
        this.A0T = r22;
        this.A0P = r15;
        this.A0A = r14;
        this.A0U = r25;
        AnonymousClass3T1 r2 = r26;
        this.A0D = r2;
        this.A02 = jid;
        this.A03 = userJid;
        this.A04 = set;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = j;
        this.A01 = j2;
        this.A07 = j3;
        this.A0F = runnable;
        this.A0E = r29;
        this.A0G = r20.A00(r2);
    }
}
