package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.8oS  reason: invalid class name and case insensitive filesystem */
public class C182048oS extends C182128oa {
    public static final Set A04 = C36421kH.A0g(new String[]{"offer", "accept", "reject", "enc_rekey"});
    public final C19730wQ A00;
    public final C19970wo A01;
    public final C231017e A02;
    public final C29111Vj A03;

    public C182048oS(C19700wN r10, C19730wQ r11, C19970wo r12, C20810yC r13, C21010yW r14, C199709fp r15, AnonymousClass1W9 r16, AnonymousClass19A r17, C29111Vj r18, C231017e r19, Map map) {
        super(r10, r13, r14, r15, r16, r17, map);
        this.A01 = r12;
        this.A00 = r11;
        this.A02 = r19;
        this.A03 = r18;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: X.5tq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r3v100, types: [X.5tq] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02fe, code lost:
        if (r7.A00() != null) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0306, code lost:
        throw X.C165617ti.A0Q("Sender receipts must have a recipient or participant jid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0307, code lost:
        if (r14 == false) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0309, code lost:
        if (r12 != null) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0313, code lost:
        if ((X.AnonymousClass143.A00(r7.A02) instanceof X.C28981Uw) != false) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x031b, code lost:
        throw X.C165617ti.A0Q("Read-self receipts must have a recipient jid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x031c, code lost:
        r25 = r7.A02;
        r14 = X.AnonymousClass143.A00(r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0324, code lost:
        if (r12 == null) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x032a, code lost:
        if (X.AnonymousClass143.A0G(r14) != false) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x032e, code lost:
        if ((r14 instanceof X.C177528dw) != false) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0330, code lost:
        X.C18740tg.A06(r12);
        r12 = r12;
        r22 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x033f, code lost:
        if ("delivery".equals(r13) == false) goto L_0x0364;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0341, code lost:
        r14 = r1.A0c("biz");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0347, code lost:
        if (r14 == null) goto L_0x0364;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0349, code lost:
        r15 = new X.C80113ur(r14.A0i("host_storage", (java.lang.String) null), r14.A0i("actual_actors", (java.lang.String) null), r14.A0i("privacy_mode_ts", (java.lang.String) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0364, code lost:
        r13 = r1.A0b(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x036e, code lost:
        if (X.C203399nx.A0I(r13, "participants") == false) goto L_0x0449;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0370, code lost:
        r21 = r13.A0h("key");
        r20 = X.C165617ti.A0R(r12, r21, r4);
        r14 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x037e, code lost:
        if (r14 == null) goto L_0x071d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0380, code lost:
        r1 = r14.length;
        r24 = r1;
        r19 = X.C36441kJ.A14(r24);
        r13 = new java.util.HashSet(r1);
        r3 = X.C19970wo.A00(r2.A01) / 1000;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0399, code lost:
        if (r12 >= r24) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x039b, code lost:
        r15 = r14[r12];
        r1 = r15.A0X(r27, "jid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03a5, code lost:
        if (r1 == null) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03a7, code lost:
        r11 = com.whatsapp.jid.DeviceJid.of(r1);
        r19.add(android.util.Pair.create(r11, java.lang.Long.valueOf(r15.A0V("t", r3) * 1000)));
        r13.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03c3, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03c6, code lost:
        r12 = r2.A02.BQG(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03ce, code lost:
        r1 = X.C36441kJ.A0Q(r19, r13);
        r3 = (java.util.List) r1.first;
        r4 = (java.util.Set) r1.second;
        r28.A03 = r21;
        r28.A04 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03e6, code lost:
        if (r4.size() <= 1) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03e8, code lost:
        r28.A00 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03ea, code lost:
        r28.A04(2);
        r4 = r2.A04;
        r2 = X.AnonymousClass000.A0u();
        r2.append("ConnectionThreadRequestsImpl/receipt-from-multiple-targets id=");
        r2.append(r20.A01);
        X.C165587tf.A1J(r25, "; remoteJid=", r2);
        r2.append(com.whatsapp.jid.DeviceJid.of(r7.A01));
        r2.append("; status=");
        r2.append(r5);
        r2.append("; offline=");
        r2.append(r23);
        r2.append("; targetTimestampPairList=");
        r2.append(r3);
        X.C36321k7.A1K(r22, "; receiptPrivacyMode=", r2);
        r0 = r4.A00;
        r1 = android.os.Message.obtain((android.os.Handler) null, 0, 1, 0, new X.C21220ADc(r25, r20, r22, r7, r3, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x044f, code lost:
        if (X.C203399nx.A0I(r13, "biz") == false) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0451, code lost:
        r11 = new X.C64933Qa[]{X.C165617ti.A0R(r12, r11, r4)};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0459, code lost:
        r3 = X.C203399nx.A02(r1, "t") * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0463, code lost:
        if (r11.length <= 1) goto L_0x0467;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0465, code lost:
        r28.A00 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0467, code lost:
        r28.A04(2);
        r10 = r2.A04;
        r8 = X.AnonymousClass000.A0u();
        r8.append("ConnectionThreadRequestsImpl/receipt-from-target keys=");
        X.C90514aH.A1T(r8, r11);
        X.C165587tf.A1J(r25, "; remoteJid=", r8);
        r2 = r7.A01;
        r8.append(com.whatsapp.jid.DeviceJid.of(r2));
        r8.append("; status=");
        r8.append(r5);
        r8.append("; timestamp=");
        r8.append(r3);
        r8.append("; offline=");
        r8.append(r23);
        X.C36321k7.A1K(r22, "; receiptPrivacyMode=", r8);
        r0 = r10.A00;
        r1 = android.os.Message.obtain((android.os.Handler) null, 0, 1, 0, new X.C21221ADd(com.whatsapp.jid.DeviceJid.of(r2), r25, r22, r7, r11, r5, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04c8, code lost:
        r14 = r1.A02;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04cb, code lost:
        if (r14 == null) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04ce, code lost:
        if (r14.length != 1) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x04d0, code lost:
        r14 = r14[0];
        X.C203399nx.A0A(r14, "list");
        r3 = r14.A02;
        r17 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04db, code lost:
        if (r3 == null) goto L_0x04f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04dd, code lost:
        r15 = r3.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x04de, code lost:
        r14 = new java.lang.String[(r15 + 1)];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04e2, code lost:
        r14[r13] = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04e4, code lost:
        if (r13 >= r15) goto L_0x04ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04e6, code lost:
        r3 = r17[r13];
        X.C203399nx.A0A(r3, "item");
        r11 = X.C36391kE.A0x(r3, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04f9, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04fb, code lost:
        r14 = new java.lang.String[]{r11};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04ff, code lost:
        r13 = r14.length;
        r11 = new X.C64933Qa[r13];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0502, code lost:
        if (r10 >= r13) goto L_0x0459;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0504, code lost:
        r11[r10] = X.C165617ti.A0R(r12, r14[r10], r4);
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0723, code lost:
        throw X.C165617ti.A0Q("ReceiptStanzaHandler/handleSuccessfulMessageReceipt empty participants");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b9, code lost:
        if (r2.A00.A0M(X.AnonymousClass143.A00(r7.A02)) == false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x029b, code lost:
        throw X.C90514aH.A0s("invalid type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02dc, code lost:
        if (r13.equals(r3) == false) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02de, code lost:
        r5 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02df, code lost:
        r12 = r7.A03;
        r14 = "read-self".equals(r13);
        r3 = "sender".equals(r13);
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02ee, code lost:
        if (r12 == null) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02f0, code lost:
        if (r3 == false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02f2, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02f3, code lost:
        if (r14 == false) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02f5, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02f6, code lost:
        if (r3 == false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02f8, code lost:
        if (r12 != null) goto L_0x0307;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x06f5  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x06f9  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x06fd  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0701  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02d6  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C203399nx r47, java.lang.Integer r48, java.util.Map r49) {
        /*
            r46 = this;
            long r44 = android.os.SystemClock.uptimeMillis()
            java.lang.Class<com.whatsapp.jid.Jid> r27 = com.whatsapp.jid.Jid.class
            java.lang.String r2 = "from"
            r1 = r47
            r0 = r27
            com.whatsapp.jid.Jid r15 = r1.A0X(r0, r2)
            java.lang.String r26 = "id"
            r0 = r26
            java.lang.String r11 = r1.A0h(r0)
            java.lang.String r25 = "type"
            java.lang.String r24 = "delivery"
            r2 = r25
            r0 = r24
            java.lang.String r5 = r1.A0i(r2, r0)
            java.lang.String r22 = "category"
            r3 = 0
            r0 = r22
            java.lang.String r21 = r1.A0i(r0, r3)
            java.lang.String r13 = "participant"
            r0 = r27
            com.whatsapp.jid.Jid r7 = r1.A0X(r0, r13)
            java.lang.Class<com.whatsapp.jid.UserJid> r20 = com.whatsapp.jid.UserJid.class
            java.lang.String r19 = "recipient"
            r2 = r20
            r0 = r19
            com.whatsapp.jid.Jid r10 = r1.A0X(r2, r0)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            java.lang.String r0 = "edit"
            java.lang.String r18 = r1.A0i(r0, r3)
            java.lang.String r17 = "offline"
            r0 = r17
            java.lang.String r4 = r1.A0i(r0, r3)
            if (r4 == 0) goto L_0x0062
            java.lang.Integer r23 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0058 }
            goto L_0x0064
        L_0x0058:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "connection/handleReceipt: got bad offline="
            X.C90464aC.A1L(r0, r4, r2, r3)
        L_0x0062:
            r23 = 0
        L_0x0064:
            X.11F r4 = X.AnonymousClass143.A00(r15)
            if (r10 == 0) goto L_0x0701
            boolean r0 = X.AnonymousClass143.A0G(r4)
            if (r0 != 0) goto L_0x0701
            r4 = r10
        L_0x0071:
            java.lang.String r12 = "retry"
            boolean r16 = r12.equals(r5)
            if (r16 == 0) goto L_0x06fd
            X.9nx r3 = r1.A0d(r12)
            java.lang.String r2 = "v"
            java.lang.String r0 = "1"
            java.lang.String r39 = r3.A0i(r2, r0)
        L_0x0085:
            int r41 = X.AnonymousClass3UK.A04(r4)
            if (r7 == 0) goto L_0x06f9
            r0 = 1
            com.whatsapp.jid.Jid[] r2 = new com.whatsapp.jid.Jid[r0]
            r0 = 0
            r2[r0] = r7
            java.util.HashSet r40 = X.AnonymousClass02N.A01(r2)
        L_0x0095:
            r2 = r46
            X.1Vj r3 = r2.A03
            if (r5 != 0) goto L_0x06f5
            java.lang.String r38 = ""
        L_0x009d:
            java.util.concurrent.atomic.AtomicLong r0 = r3.A06
            long r42 = r0.getAndIncrement()
            X.0wo r0 = r3.A01
            r30 = r0
            X.0yC r14 = r3.A03
            X.0wN r8 = r3.A00
            X.0yW r6 = r3.A04
            X.19L r4 = r3.A05
            X.11g r3 = r3.A02
            r9 = 1
            X.8eQ r0 = new X.8eQ
            r36 = r48
            r28 = r0
            r29 = r8
            r31 = r3
            r32 = r14
            r33 = r6
            r34 = r4
            r35 = r23
            r37 = r11
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44)
            r4.A05(r0)
            long r3 = r0.A03
            r37 = r3
            r8 = 2
            java.lang.Integer r32 = java.lang.Integer.valueOf(r8)
            r6 = 0
            java.lang.Integer r34 = java.lang.Integer.valueOf(r41)
            r29 = r6
            r35 = r6
            r30 = r2
            r31 = r23
            r33 = r6
            r36 = r5
            r30.A02(r31, r32, r33, r34, r35, r36)
            X.9YT r15 = X.AnonymousClass9YT.A00(r15)
            java.lang.String r14 = "receipt"
            r15.A05 = r14
            r15.A07 = r11
            r15.A08 = r5
            r3 = r21
            r15.A04 = r3
            r15.A01 = r7
            r15.A03 = r10
            r3 = r18
            r15.A06 = r3
            r3 = r37
            r15.A00 = r3
            X.9uj r7 = r15.A01()
            r3 = r24
            boolean r3 = r3.equals(r5)
            java.lang.String r4 = "error"
            if (r3 == 0) goto L_0x016b
            r3 = 0
            X.9nx r10 = r1.A0b(r3)
            if (r10 == 0) goto L_0x0289
            java.util.Set r4 = A04
            java.lang.String r3 = r10.A00
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0289
            r0.A04(r8)
            com.whatsapp.jid.Jid r3 = r7.A02
            com.whatsapp.jid.DeviceJid r5 = com.whatsapp.jid.DeviceJid.of(r3)
            if (r5 == 0) goto L_0x070e
            com.whatsapp.protocol.VoipStanzaChildNode r1 = com.whatsapp.protocol.VoipStanzaChildNode.fromProtocolTreeNode(r10)
            X.9fp r4 = r2.A04
            java.lang.String r0 = r7.A07
            X.C18740tg.A06(r0)
            X.5r2 r3 = new X.5r2
            r3.<init>(r5, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-call-incoming-receipt tag="
            r1.append(r0)
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r3.A01
            java.lang.String r0 = r0.tag
            r1.append(r0)
            java.lang.String r0 = " from="
            r1.append(r0)
            com.whatsapp.jid.DeviceJid r0 = r3.A00
            r1.append(r0)
            java.lang.String r0 = " type=delivery"
            X.C36321k7.A1a(r1, r0)
            X.Ayz r1 = r4.A00
            r0 = 197(0xc5, float:2.76E-43)
            X.C165577te.A18(r1, r3, r0)
        L_0x0165:
            X.19A r0 = r2.A01
            r0.A0H(r7)
            return
        L_0x016b:
            java.lang.String r3 = "inactive"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0289
            java.lang.String r3 = "sender"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0289
            java.lang.String r3 = "played"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0289
            java.lang.String r3 = "played-self"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0289
            java.lang.String r3 = "read"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0289
            java.lang.String r3 = "read-self"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0289
            java.lang.String r3 = "server-error"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x050f
            java.lang.String r3 = "rmr"
            X.9nx r12 = r1.A0c(r3)
            r11 = 1
            if (r12 != 0) goto L_0x01bb
            r11 = 0
            X.0wQ r9 = r2.A00
            com.whatsapp.jid.Jid r3 = r7.A02
            X.11F r3 = X.AnonymousClass143.A00(r3)
            boolean r3 = r9.A0M(r3)
            if (r3 != 0) goto L_0x06d8
        L_0x01bb:
            com.whatsapp.jid.Jid r15 = r7.A02
            r10 = r15
            X.C18740tg.A06(r15)
            com.whatsapp.jid.UserJid r3 = r7.A00()
            if (r11 == 0) goto L_0x0286
            java.lang.String r9 = "jid"
            r3 = r27
            com.whatsapp.jid.Jid r15 = r12.A0X(r3, r9)
            java.lang.String r3 = "from_me"
            java.lang.String r9 = r12.A0i(r3, r6)
            java.lang.String r3 = "true"
            boolean r9 = r3.equals(r9)
            r3 = r20
            com.whatsapp.jid.Jid r3 = r12.A0X(r3, r13)
        L_0x01e1:
            if (r15 == 0) goto L_0x06d8
            java.lang.String r4 = "encrypt"
            X.9nx r4 = r1.A0c(r4)
            r0.A04(r8)
            X.9fp r1 = r2.A04
            java.lang.String r0 = "enc_p"
            r5 = 0
            if (r4 == 0) goto L_0x01fb
            X.9nx r0 = r4.A0c(r0)
            if (r0 == 0) goto L_0x01fb
            byte[] r6 = r0.A01
        L_0x01fb:
            java.lang.String r8 = "enc_iv"
            if (r4 == 0) goto L_0x0207
            X.9nx r0 = r4.A0c(r8)
            if (r0 == 0) goto L_0x0207
            byte[] r5 = r0.A01
        L_0x0207:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/server-error-for-target remote_jid = "
            r2.append(r0)
            r2.append(r15)
            java.lang.String r0 = "; id="
            r2.append(r0)
            java.lang.String r14 = r7.A07
            r2.append(r14)
            java.lang.String r0 = "; participant="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = "; recipient="
            r2.append(r0)
            com.whatsapp.jid.UserJid r12 = r7.A03
            r2.append(r12)
            java.lang.String r0 = "; fromMe="
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = "; isMdRmr="
            X.C36321k7.A1X(r0, r2, r11)
            X.Ayz r2 = r1.A00
            java.lang.String r4 = r7.A04
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            X.C1900296p.A00(r1, r3, r13)
            java.lang.String r0 = "msgid"
            r1.putString(r0, r14)
            java.lang.String r0 = "remote_jid"
            X.C1900296p.A00(r1, r15, r0)
            java.lang.String r0 = "from_me"
            r1.putBoolean(r0, r9)
            r0 = r19
            X.C1900296p.A00(r1, r12, r0)
            java.lang.String r0 = "enc_data"
            r1.putByteArray(r0, r6)
            r1.putByteArray(r8, r5)
            java.lang.String r0 = "is_md_rmr"
            r1.putBoolean(r0, r11)
            r0 = r22
            r1.putString(r0, r4)
            java.lang.String r0 = "requester"
            X.C1900296p.A00(r1, r10, r0)
            r0 = 69
            X.C165577te.A18(r2, r1, r0)
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "stanzaKey"
            r1.putParcelable(r0, r7)
            r0 = 85
            X.C165577te.A18(r2, r1, r0)
            return
        L_0x0286:
            r9 = 1
            goto L_0x01e1
        L_0x0289:
            java.lang.String r13 = r7.A08
            X.C18740tg.A06(r13)
            int r3 = r13.hashCode()
            switch(r3) {
                case -1159650013: goto L_0x029c;
                case -985752877: goto L_0x02a7;
                case -905962955: goto L_0x02b2;
                case 3496342: goto L_0x02b5;
                case 24665195: goto L_0x02c0;
                case 110109190: goto L_0x02cb;
                case 823466996: goto L_0x02d6;
                default: goto L_0x0295;
            }
        L_0x0295:
            java.lang.String r0 = "invalid type"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x029c:
            java.lang.String r3 = "read-self"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x0295
            r5 = 17
            goto L_0x02df
        L_0x02a7:
            java.lang.String r3 = "played"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x0295
            r5 = 8
            goto L_0x02df
        L_0x02b2:
            java.lang.String r3 = "sender"
            goto L_0x02d8
        L_0x02b5:
            java.lang.String r3 = "read"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x0295
            r5 = 13
            goto L_0x02df
        L_0x02c0:
            java.lang.String r3 = "inactive"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x0295
            r5 = 15
            goto L_0x02df
        L_0x02cb:
            java.lang.String r3 = "played-self"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x0295
            r5 = 18
            goto L_0x02df
        L_0x02d6:
            java.lang.String r3 = "delivery"
        L_0x02d8:
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x0295
            r5 = 5
        L_0x02df:
            com.whatsapp.jid.UserJid r12 = r7.A03
            java.lang.String r3 = "read-self"
            boolean r14 = r3.equals(r13)
            java.lang.String r3 = "sender"
            boolean r3 = r3.equals(r13)
            r10 = 0
            if (r12 == 0) goto L_0x02f2
            if (r3 == 0) goto L_0x02f5
        L_0x02f2:
            r4 = 1
            if (r14 == 0) goto L_0x02f6
        L_0x02f5:
            r4 = 0
        L_0x02f6:
            if (r3 == 0) goto L_0x0307
            if (r12 != 0) goto L_0x0307
            com.whatsapp.jid.UserJid r3 = r7.A00()
            if (r3 != 0) goto L_0x0307
            java.lang.String r0 = "Sender receipts must have a recipient or participant jid"
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        L_0x0307:
            if (r14 == 0) goto L_0x031c
            if (r12 != 0) goto L_0x031c
            com.whatsapp.jid.Jid r3 = r7.A02
            X.11F r3 = X.AnonymousClass143.A00(r3)
            boolean r3 = r3 instanceof X.C28981Uw
            if (r3 != 0) goto L_0x031c
            java.lang.String r0 = "Read-self receipts must have a recipient jid"
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        L_0x031c:
            com.whatsapp.jid.Jid r3 = r7.A02
            r25 = r3
            X.11F r14 = X.AnonymousClass143.A00(r25)
            if (r12 == 0) goto L_0x03c6
            boolean r3 = X.AnonymousClass143.A0G(r14)
            if (r3 != 0) goto L_0x03c6
            boolean r3 = r14 instanceof X.C177528dw
            if (r3 != 0) goto L_0x03c6
        L_0x0330:
            X.C18740tg.A06(r12)
            X.11F r12 = (X.AnonymousClass11F) r12
            r22 = 0
            r3 = r24
            boolean r3 = r3.equals(r13)
            java.lang.String r17 = "biz"
            if (r3 == 0) goto L_0x0364
            r3 = r17
            X.9nx r14 = r1.A0c(r3)
            if (r14 == 0) goto L_0x0364
            java.lang.String r3 = "host_storage"
            java.lang.String r16 = r14.A0i(r3, r6)
            java.lang.String r3 = "actual_actors"
            java.lang.String r13 = r14.A0i(r3, r6)
            java.lang.String r3 = "privacy_mode_ts"
            java.lang.String r3 = r14.A0i(r3, r6)
            X.3ur r22 = new X.3ur
            r15 = r22
            r14 = r16
            r15.<init>((java.lang.String) r14, (java.lang.String) r13, (java.lang.String) r3)
        L_0x0364:
            X.9nx r13 = r1.A0b(r10)
            java.lang.String r3 = "participants"
            boolean r3 = X.C203399nx.A0I(r13, r3)
            if (r3 == 0) goto L_0x0449
            java.lang.String r1 = "key"
            java.lang.String r21 = r13.A0h(r1)
            r1 = r21
            X.3Qa r20 = X.C165617ti.A0R(r12, r1, r4)
            X.9nx[] r14 = r13.A02
            if (r14 == 0) goto L_0x071d
            int r1 = r14.length
            r24 = r1
            java.util.ArrayList r19 = X.C36441kJ.A14(r24)
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>(r1)
            X.0wo r1 = r2.A01
            long r3 = X.C19970wo.A00(r1)
            r17 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r17
            r12 = 0
        L_0x0397:
            r1 = r24
            if (r12 >= r1) goto L_0x03ce
            r15 = r14[r12]
            java.lang.String r11 = "jid"
            r1 = r27
            com.whatsapp.jid.Jid r1 = r15.A0X(r1, r11)
            if (r1 == 0) goto L_0x03c3
            com.whatsapp.jid.DeviceJid r11 = com.whatsapp.jid.DeviceJid.of(r1)
            java.lang.String r1 = "t"
            long r15 = r15.A0V(r1, r3)
            long r15 = r15 * r17
            java.lang.Long r1 = java.lang.Long.valueOf(r15)
            android.util.Pair r15 = android.util.Pair.create(r11, r1)
            r1 = r19
            r1.add(r15)
            r13.add(r11)
        L_0x03c3:
            int r12 = r12 + 1
            goto L_0x0397
        L_0x03c6:
            X.17e r3 = r2.A02
            X.11F r12 = r3.BQG(r14)
            goto L_0x0330
        L_0x03ce:
            r1 = r19
            android.util.Pair r1 = X.C36441kJ.A0Q(r1, r13)
            java.lang.Object r3 = r1.first
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r1.second
            java.util.Set r4 = (java.util.Set) r4
            r1 = r21
            r0.A03 = r1
            r0.A04 = r4
            int r1 = r4.size()
            if (r1 <= r9) goto L_0x03ea
            r0.A00 = r8
        L_0x03ea:
            r0.A04(r8)
            X.9fp r4 = r2.A04
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/receipt-from-multiple-targets id="
            r2.append(r0)
            r0 = r20
            java.lang.String r0 = r0.A01
            r2.append(r0)
            java.lang.String r1 = "; remoteJid="
            r0 = r25
            X.C165587tf.A1J(r0, r1, r2)
            com.whatsapp.jid.Jid r0 = r7.A01
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r0)
            r2.append(r0)
            java.lang.String r0 = "; status="
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = "; offline="
            r2.append(r0)
            r0 = r23
            r2.append(r0)
            java.lang.String r0 = "; targetTimestampPairList="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r1 = "; receiptPrivacyMode="
            r0 = r22
            X.C36321k7.A1K(r0, r1, r2)
            X.Ayz r0 = r4.A00
            X.ADc r1 = new X.ADc
            r11 = r1
            r12 = r25
            r13 = r20
            r14 = r22
            r15 = r7
            r16 = r3
            r17 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17)
            android.os.Message r1 = android.os.Message.obtain(r6, r10, r9, r10, r1)
            goto L_0x05f2
        L_0x0449:
            r3 = r17
            boolean r3 = X.C203399nx.A0I(r13, r3)
            if (r3 == 0) goto L_0x04c8
            X.3Qa r3 = X.C165617ti.A0R(r12, r11, r4)
            X.3Qa[] r11 = new X.C64933Qa[r9]
            r11[r10] = r3
        L_0x0459:
            java.lang.String r3 = "t"
            long r3 = X.C203399nx.A02(r1, r3)
            r12 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r12
            int r1 = r11.length
            if (r1 <= r9) goto L_0x0467
            r0.A00 = r9
        L_0x0467:
            r0.A04(r8)
            X.9fp r10 = r2.A04
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/receipt-from-target keys="
            r8.append(r0)
            X.C90514aH.A1T(r8, r11)
            java.lang.String r1 = "; remoteJid="
            r0 = r25
            X.C165587tf.A1J(r0, r1, r8)
            com.whatsapp.jid.Jid r2 = r7.A01
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r2)
            r8.append(r0)
            java.lang.String r0 = "; status="
            r8.append(r0)
            r8.append(r5)
            java.lang.String r0 = "; timestamp="
            r8.append(r0)
            r8.append(r3)
            java.lang.String r0 = "; offline="
            r8.append(r0)
            r0 = r23
            r8.append(r0)
            java.lang.String r1 = "; receiptPrivacyMode="
            r0 = r22
            X.C36321k7.A1K(r0, r1, r8)
            X.Ayz r0 = r10.A00
            com.whatsapp.jid.DeviceJid r13 = com.whatsapp.jid.DeviceJid.of(r2)
            X.ADd r2 = new X.ADd
            r12 = r2
            r14 = r25
            r15 = r22
            r16 = r7
            r17 = r11
            r18 = r5
            r19 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r1 = 0
            android.os.Message r1 = android.os.Message.obtain(r6, r1, r9, r1, r2)
            goto L_0x05f2
        L_0x04c8:
            X.9nx[] r14 = r1.A02
            r13 = 0
            if (r14 == 0) goto L_0x04fb
            int r3 = r14.length
            if (r3 != r9) goto L_0x04fb
            r14 = r14[r10]
            java.lang.String r3 = "list"
            X.C203399nx.A0A(r14, r3)
            X.9nx[] r3 = r14.A02
            r17 = r3
            if (r3 == 0) goto L_0x04f9
            int r15 = r3.length
        L_0x04de:
            int r3 = r15 + 1
            java.lang.String[] r14 = new java.lang.String[r3]
        L_0x04e2:
            r14[r13] = r11
            if (r13 >= r15) goto L_0x04ff
            r16 = r17[r13]
            java.lang.String r3 = "item"
            r11 = r3
            r3 = r16
            X.C203399nx.A0A(r3, r11)
            r11 = r26
            java.lang.String r11 = X.C36391kE.A0x(r3, r11)
            int r13 = r13 + 1
            goto L_0x04e2
        L_0x04f9:
            r15 = 0
            goto L_0x04de
        L_0x04fb:
            java.lang.String[] r14 = new java.lang.String[r9]
            r14[r10] = r11
        L_0x04ff:
            int r13 = r14.length
            X.3Qa[] r11 = new X.C64933Qa[r13]
        L_0x0502:
            if (r10 >= r13) goto L_0x0459
            r3 = r14[r10]
            X.3Qa r3 = X.C165617ti.A0R(r12, r3, r4)
            r11[r10] = r3
            int r10 = r10 + 1
            goto L_0x0502
        L_0x050f:
            if (r16 == 0) goto L_0x05f8
            X.9nx r3 = r1.A0d(r12)
            java.lang.String r11 = "registration"
            X.9nx r11 = r1.A0d(r11)
            byte[] r12 = r11.A01
            if (r12 == 0) goto L_0x072b
            int r13 = r12.length
            r11 = 4
            if (r13 != r11) goto L_0x072b
            java.lang.String r11 = "v"
            java.lang.String r13 = "1"
            java.lang.String r11 = r3.A0i(r11, r13)
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x06d8
            java.lang.String r4 = "count"
            int r30 = r3.A0S(r4, r9)
            java.lang.String r5 = "t"
            java.lang.String r4 = r3.A0h(r5)
            long r4 = r3.A0W(r4, r5)
            r31 = 1000(0x3e8, double:4.94E-321)
            long r31 = r31 * r4
            r4 = r26
            java.lang.String r5 = r3.A0h(r4)
            if (r10 != 0) goto L_0x0553
            com.whatsapp.jid.Jid r4 = r7.A02
            X.11F r10 = X.AnonymousClass143.A00(r4)
        L_0x0553:
            X.3Qa r22 = X.C165617ti.A0R(r10, r5, r9)
            java.lang.String r4 = "mediareason"
            r10 = 0
            r3.A0i(r4, r6)
            java.lang.String r3 = "keys"
            X.9nx r11 = r1.A0c(r3)
            r13 = 0
            if (r11 == 0) goto L_0x05f6
            java.lang.String r3 = "identity"
            X.9nx r4 = r11.A0d(r3)
            r3 = r25
            X.9nx r3 = r11.A0d(r3)
            byte[] r3 = r3.A01
            if (r3 == 0) goto L_0x0724
            int r3 = r3.length
            if (r3 != r9) goto L_0x0724
            byte[] r14 = r4.A01
            java.lang.String r3 = "key"
            X.9nx r4 = r11.A0d(r3)
            r3 = r26
            X.9nx r5 = r4.A0d(r3)
            java.lang.String r3 = "value"
            X.9nx r4 = r4.A0d(r3)
            byte[] r5 = r5.A01
            byte[] r4 = r4.A01
            X.5tq r10 = new X.5tq
            r10.<init>(r5, r4, r6)
            java.lang.String r4 = "skey"
            X.9nx r9 = r11.A0d(r4)
            r4 = r26
            X.9nx r5 = r9.A0d(r4)
            X.9nx r4 = r9.A0d(r3)
            java.lang.String r3 = "signature"
            X.9nx r3 = r9.A0d(r3)
            byte[] r9 = r5.A01
            byte[] r5 = r4.A01
            byte[] r4 = r3.A01
            X.5tq r3 = new X.5tq
            r3.<init>(r9, r5, r4)
            java.lang.String r4 = "device-identity"
            X.9nx r4 = r11.A0c(r4)
            if (r4 == 0) goto L_0x05c1
            byte[] r13 = r4.A01
        L_0x05c1:
            r29 = r13
            r13 = r3
        L_0x05c4:
            r0.A04(r8)
            X.9fp r2 = r2.A04
            r0 = r17
            java.lang.String r0 = r1.A0i(r0, r6)
            boolean r33 = X.AnonymousClass000.A1V(r0)
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-message-retry-by-target"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.Ayz r0 = r2.A00
            X.9OM r2 = new X.9OM
            r23 = r13
            r24 = r10
            r25 = r7
            r26 = r21
            r27 = r12
            r28 = r14
            r21 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33)
            r1 = 0
            android.os.Message r1 = android.os.Message.obtain(r6, r1, r8, r1, r2)
        L_0x05f2:
            r0.Bkm(r1)
            return
        L_0x05f6:
            r14 = r6
            goto L_0x05c4
        L_0x05f8:
            java.lang.String r3 = "enc_rekey_retry"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x065e
            java.lang.String r3 = "registration"
            X.9nx r3 = r1.A0d(r3)
            byte[] r4 = r3.A01
            if (r4 == 0) goto L_0x0732
            int r5 = r4.length
            r3 = 4
            if (r5 != r3) goto L_0x0732
            java.lang.String r3 = "enc_rekey"
            X.9nx r3 = r1.A0d(r3)
            java.lang.String r1 = "call-id"
            java.lang.String r6 = r3.A0h(r1)
            java.lang.String r1 = "count"
            int r1 = X.C203399nx.A00(r3, r1)
            byte r5 = (byte) r1
            r0.A04(r8)
            X.9fp r3 = r2.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-call-rekey stanzaKey="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " callId="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " retry="
            X.C36321k7.A1T(r0, r1, r5)
            X.Ayz r3 = r3.A00
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "stanzaKey"
            r1.putParcelable(r0, r7)
            java.lang.String r0 = "callId"
            r1.putString(r0, r6)
            java.lang.String r0 = "registrationId"
            r1.putByteArray(r0, r4)
            r1.putByte(r12, r5)
            r0 = 150(0x96, float:2.1E-43)
            X.C165577te.A18(r3, r1, r0)
            goto L_0x0165
        L_0x065e:
            boolean r3 = r4.equals(r5)
            if (r3 == 0) goto L_0x068c
            X.9nx r3 = r1.A0d(r4)
            r0 = r25
            java.lang.String r1 = r3.A0h(r0)
            java.lang.String r0 = "enc-v2-unknown-tags"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0165
            java.lang.String r8 = "feature-incapable"
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x06d8
            java.lang.String r0 = "reason"
            java.lang.String r3 = r3.A0i(r0, r6)
            X.0wN r1 = r2.A01
            r0 = 0
            r1.A0E(r8, r3, r0)
            goto L_0x0165
        L_0x068c:
            java.lang.String r1 = "peer_msg"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x06b2
            r0.A04(r8)
            X.9fp r2 = r2.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-peer-message-receipt stanza-id="
            r1.append(r0)
            java.lang.String r0 = r7.A07
            X.C36321k7.A1a(r1, r0)
            X.Ayz r0 = r2.A00
            r2 = 0
            r1 = 221(0xdd, float:3.1E-43)
            android.os.Message r1 = android.os.Message.obtain(r6, r2, r1, r2, r7)
            goto L_0x05f2
        L_0x06b2:
            java.lang.String r1 = "hist_sync"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x06d8
            r0.A04(r8)
            X.9fp r2 = r2.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-history-sync-receipt stanza-id="
            r1.append(r0)
            java.lang.String r0 = r7.A07
            X.C36321k7.A1a(r1, r0)
            X.Ayz r0 = r2.A00
            r2 = 0
            r1 = 212(0xd4, float:2.97E-43)
            android.os.Message r1 = android.os.Message.obtain(r6, r2, r1, r2, r7)
            goto L_0x05f2
        L_0x06d8:
            X.9YT r1 = r7.A02()
            java.lang.String r0 = "487"
            r1.A08(r4, r0)
            X.9uj r7 = r1.A01()
            X.8bs r1 = new X.8bs
            r1.<init>()
            r1.A00 = r14
            r1.A01 = r5
            X.0yW r0 = r2.A03
            r0.Bly(r1)
            goto L_0x0165
        L_0x06f5:
            r38 = r5
            goto L_0x009d
        L_0x06f9:
            r40 = 0
            goto L_0x0095
        L_0x06fd:
            r39 = 0
            goto L_0x0085
        L_0x0701:
            if (r4 != 0) goto L_0x0071
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ChatJid is null, receipt id="
            X.19b r0 = X.C165567td.A0G(r0, r11, r1)
            throw r0
        L_0x070e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CallReceipt from invalid jid "
            java.lang.String r0 = X.AnonymousClass000.A0l(r3, r0, r1)
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        L_0x071d:
            java.lang.String r0 = "ReceiptStanzaHandler/handleSuccessfulMessageReceipt empty participants"
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        L_0x0724:
            java.lang.String r0 = "type node should contain exactly 1 byte"
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        L_0x072b:
            java.lang.String r0 = "invalid registration node"
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        L_0x0732:
            java.lang.String r0 = "invalid registration node"
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C182048oS.A04(X.9nx, java.lang.Integer, java.util.Map):void");
    }
}
