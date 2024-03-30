package X;

import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public final class AAF implements C22934Ayk {
    public boolean A00;
    public final C19460v5 A01;
    public final C19700wN A02;
    public final AnonymousClass17Y A03;
    public final C19730wQ A04;
    public final AnonymousClass1DT A05;
    public final AnonymousClass164 A06;
    public final C195399Ud A07;
    public final AnonymousClass1CL A08;
    public final AnonymousClass16D A09;
    public final AnonymousClass185 A0A;
    public final C19970wo A0B;
    public final C19630wG A0C;
    public final AnonymousClass6EZ A0D;
    public final AnonymousClass189 A0E;
    public final C220412q A0F;
    public final C20310xM A0G;
    public final C25241Fn A0H;
    public final C24881Ed A0I;
    public final AnonymousClass1FV A0J;
    public final AnonymousClass1OD A0K;
    public final C25301Ft A0L;
    public final AnonymousClass1DW A0M;
    public final C20810yC A0N;
    public final C45832Sw A0O;
    public final C20520xh A0P;
    public final C65913Ty A0Q;
    public final AnonymousClass1CF A0R;
    public final AnonymousClass11F A0S;
    public final Jid A0T;
    public final C30571aQ A0U;
    public final C198309dF A0V;
    public final C30121Zh A0W;
    public final AnonymousClass1DL A0X;
    public final AnonymousClass1C4 A0Y;
    public final C177808eP A0Z;
    public final AnonymousClass2ZN A0a;
    public final C24601Db A0b;
    public final AnonymousClass1DR A0c;
    public final AnonymousClass1XB A0d;
    public final AnonymousClass1EV A0e;
    public final C23084B3s A0f;
    public final C31551c0 A0g;
    public final AnonymousClass1AW A0h;
    public final AnonymousClass1EO A0i;
    public final AnonymousClass1A1 A0j;
    public final C19770wU A0k;
    public final C24961El A0l;
    public final AnonymousClass005 A0m;
    public final boolean A0n;
    public final AnonymousClass17Z A0o;
    public final C194359Pj A0p;
    public final AnonymousClass1VN A0q;
    public final AnonymousClass1WF A0r;
    public final Integer A0s;

    public static void A00(C195399Ud r4, C19630wG r5, UserJid userJid, AnonymousClass2bZ r7) {
        C206819u1 r0;
        C207219uk r2 = r7.A00;
        if (r2 != null) {
            int i = r2.A00;
            if ((i == 2 || i == 6) && (r0 = r2.A05) != null) {
                ArrayList A0I2 = AnonymousClass001.A0I();
                for (C206579td r02 : r0.A02) {
                    for (C206509tW r03 : r02.A01) {
                        A0I2.add(r03.A00);
                    }
                }
                String valueOf = String.valueOf(C36441kJ.A05(C36421kH.A0B(r5), R.dimen.f7nameremoved));
                r4.A01(new C199899gC(userJid, valueOf, valueOf, A0I2));
            }
        }
    }

    public static void A01(AnonymousClass9T0 r1, C21337AHp aHp, int i) {
        r1.A00 = i;
        r1.A06 = aHp.A0c;
        r1.A01 = aHp.A01;
        r1.A0C = aHp.A0w;
        r1.A0E = aHp.A0s;
        r1.A09 = aHp.A0n;
        r1.A08 = aHp.A0k;
        r1.A0A = aHp.A0p;
        r1.A0D = aHp.A0r;
        r1.A0B = aHp.A0q;
        r1.A02 = aHp.A08;
        r1.A07 = aHp.A0j;
        r1.A05 = aHp.A0K;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0070 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.AnonymousClass8SX r6) {
        /*
            r5 = this;
            X.B3s r4 = r5.A0f
            X.3Qa r0 = r4.BE4()
            X.11F r3 = r0.A00
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L_0x0072
            X.0wQ r1 = r5.A04
            com.whatsapp.jid.Jid r0 = r5.A0T
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r0)
            boolean r0 = r1.A0P(r0)
            if (r0 == 0) goto L_0x0070
            boolean r0 = r6.A0y()
            if (r0 == 0) goto L_0x0071
            X.8SQ r0 = r6.protocolMessage_
            r1 = r0
            if (r0 != 0) goto L_0x0029
            X.8SQ r0 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x0029:
            int r0 = r0.bitField0_
            r0 = r0 & 32
            if (r0 != 0) goto L_0x0070
            r0 = r1
            if (r1 != 0) goto L_0x0034
            X.8SQ r0 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x0034:
            int r0 = r0.bitField0_
            r0 = r0 & 64
            if (r0 != 0) goto L_0x0070
            r0 = r1
            if (r1 != 0) goto L_0x003f
            X.8SQ r0 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x003f:
            int r0 = r0.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0070
            r0 = r1
            if (r1 != 0) goto L_0x004a
            X.8SQ r0 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x004a:
            int r0 = r0.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0070
            r0 = r1
            if (r1 != 0) goto L_0x0055
            X.8SQ r0 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x0055:
            int r0 = r0.bitField0_
            r0 = r0 & 16
            if (r0 != 0) goto L_0x0070
            r0 = r1
            if (r1 != 0) goto L_0x0060
            X.8SQ r0 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x0060:
            int r0 = r0.bitField0_
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 != 0) goto L_0x0070
            if (r1 != 0) goto L_0x006a
            X.8SQ r1 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x006a:
            int r0 = r1.bitField0_
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0071
        L_0x0070:
            r2 = 0
        L_0x0071:
            return r2
        L_0x0072:
            boolean r0 = r3 instanceof X.AnonymousClass144
            if (r0 == 0) goto L_0x0093
            com.whatsapp.jid.Jid r0 = r4.BFE()
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r0)
            X.0wQ r0 = r5.A04
            boolean r0 = r0.A0P(r1)
            if (r0 == 0) goto L_0x0070
            X.630 r0 = r4.BHJ()
            if (r0 != 0) goto L_0x0070
            X.630 r0 = r4.BCe()
            if (r0 == 0) goto L_0x0070
            return r2
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AAF.A03(X.8SX):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: X.2bK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.2bK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: X.3T1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: X.2bZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v300, resolved type: X.2bZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v92, resolved type: X.B1o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v179, resolved type: X.2bK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v180, resolved type: X.2bK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: X.2bK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: X.2bK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: X.2bK} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03fd, code lost:
        if (r10 != r9) goto L_0x03ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x066a, code lost:
        if (r10.A03 != r0.A06) goto L_0x066c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c2, code lost:
        if (X.C222713q.A01(r2).equals(r16.BE4().A00) != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f0, code lost:
        if (((X.AnonymousClass8SV) r3.format_).interactiveMessageCase_ == 7) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x0d34, code lost:
        if (r4 != r5) goto L_0x0d36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0155, code lost:
        if (r3 != null) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:758:0x0f5e, code lost:
        if (r11 == 200) goto L_0x0f60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a9, code lost:
        if (r0.contains(r2) != false) goto L_0x00f2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1015:0x13dc A[Catch:{ all -> 0x13c2, 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3, Exception -> 0x13e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1035:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1037:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01fb A[Catch:{ 186 -> 0x1406 }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x058c A[Catch:{ all -> 0x13c2, 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3, Exception -> 0x13e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x05b9 A[SYNTHETIC, Splitter:B:283:0x05b9] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x061f A[Catch:{ all -> 0x13c2, 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3, Exception -> 0x13e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x06ad A[Catch:{ all -> 0x13c2, 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3, Exception -> 0x13e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x06b9 A[Catch:{ all -> 0x13c2, 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3, Exception -> 0x13e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x06ba A[Catch:{ all -> 0x13c2, 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3, Exception -> 0x13e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x07b2 A[Catch:{ all -> 0x13c2, 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3, Exception -> 0x13e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x07cd A[Catch:{ all -> 0x13c2, 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3, Exception -> 0x13e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x07d2 A[Catch:{ all -> 0x13c2, 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3, Exception -> 0x13e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x07db A[SYNTHETIC, Splitter:B:387:0x07db] */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x09dd A[Catch:{ all -> 0x13c2, 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3, Exception -> 0x13e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:955:0x12ec A[Catch:{ all -> 0x13c2, 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3, Exception -> 0x13e4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BJg(byte[] r37) {
        /*
            r36 = this;
            r23 = r37
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DecryptionCallbackV2/handlePlaintext message="
            r2.append(r0)
            r1 = r36
            X.B3s r0 = r1.A0f
            r16 = r0
            r2.append(r0)
            java.lang.String r0 = " sendReceipt="
            r2.append(r0)
            boolean r0 = r1.A0n
            r17 = r0
            X.C36331k8.A1S(r2, r0)
            java.lang.Integer r0 = r1.A0s
            int r2 = r0.intValue()
            r0 = 4
            if (r2 == r0) goto L_0x0033
            X.2Sw r3 = r1.A0O
            X.8eP r2 = r1.A0Z
            r0 = r23
            byte[] r23 = X.C200429hO.A02(r3, r2, r0)
        L_0x0033:
            if (r23 != 0) goto L_0x0049
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext axolotl derived invalid plaintext; message.key="
            r0 = r16
            X.3Qa r0 = X.C165607th.A0g(r0, r2, r3)
            X.C36351kA.A1L(r0, r3)
            r3 = 0
        L_0x0045:
            A02(r1, r3)
        L_0x0048:
            return
        L_0x0049:
            X.8SX r4 = X.AnonymousClass8SX.A0i(r23)     // Catch:{ 186 -> 0x1406 }
            boolean r0 = r1.A03(r4)     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x0071
            int r2 = r4.bitField0_     // Catch:{ 186 -> 0x1406 }
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 & r0
            boolean r0 = X.AnonymousClass000.A1P(r2)     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x0071
            X.1DT r3 = r1.A05     // Catch:{ 186 -> 0x1406 }
            com.whatsapp.jid.Jid r0 = r1.A0T     // Catch:{ 186 -> 0x1406 }
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r0)     // Catch:{ 186 -> 0x1406 }
            r0 = 2
            r3.A0H(r2, r0)     // Catch:{ 186 -> 0x1406 }
            java.lang.String r0 = "Peers must use DeviceSentMessage proto"
            X.186 r0 = X.C165617ti.A0L(r0)     // Catch:{ 186 -> 0x1406 }
        L_0x0070:
            throw r0     // Catch:{ 186 -> 0x1406 }
        L_0x0071:
            boolean r0 = r1.A03(r4)     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x0095
            int r2 = r4.bitField0_     // Catch:{ 186 -> 0x1406 }
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 & r0
            boolean r0 = X.AnonymousClass000.A1P(r2)     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x0095
            X.1DT r3 = r1.A05     // Catch:{ 186 -> 0x1406 }
            com.whatsapp.jid.Jid r0 = r1.A0T     // Catch:{ 186 -> 0x1406 }
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r0)     // Catch:{ 186 -> 0x1406 }
            r0 = 1
            r3.A0H(r2, r0)     // Catch:{ 186 -> 0x1406 }
            java.lang.String r0 = "DeviceSentMessage proto only allowed from peer device"
            X.186 r0 = X.C165617ti.A0L(r0)     // Catch:{ 186 -> 0x1406 }
            goto L_0x0070
        L_0x0095:
            int r2 = r4.bitField0_     // Catch:{ 186 -> 0x1406 }
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 & r0
            boolean r0 = X.AnonymousClass000.A1P(r2)     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x00c4
            X.8Pv r3 = r4.deviceSentMessage_     // Catch:{ 186 -> 0x1406 }
            if (r3 != 0) goto L_0x00a6
            X.8Pv r3 = X.C172958Pv.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x1406 }
        L_0x00a6:
            int r2 = r3.bitField0_     // Catch:{ 186 -> 0x1406 }
            r0 = r2 & 2
            if (r0 == 0) goto L_0x0241
            r0 = r2 & 1
            if (r0 == 0) goto L_0x0241
            java.lang.String r2 = r3.destinationJid_     // Catch:{ 186 -> 0x1406 }
            X.13q r0 = X.AnonymousClass11F.A00     // Catch:{ 0wR -> 0x0241 }
            X.11F r2 = X.C222713q.A01(r2)     // Catch:{ 0wR -> 0x0241 }
            X.3Qa r0 = r16.BE4()     // Catch:{ 186 -> 0x1406 }
            X.11F r0 = r0.A00     // Catch:{ 186 -> 0x1406 }
            boolean r0 = r2.equals(r0)     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x0241
        L_0x00c4:
            r0 = r16
            boolean r8 = r0 instanceof X.C21337AHp     // Catch:{ 186 -> 0x1406 }
            if (r8 == 0) goto L_0x0255
            r6 = r16
            X.AHp r6 = (X.C21337AHp) r6     // Catch:{ 186 -> 0x1406 }
            boolean r0 = r1.A04(r4, r6)     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x0239
            X.8SX r5 = X.C200429hO.A00(r4)     // Catch:{ 186 -> 0x1406 }
            boolean r0 = r5.A10()     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x0114
            X.8SL r3 = r5.templateMessage_     // Catch:{ 186 -> 0x1406 }
            if (r3 != 0) goto L_0x00e4
            X.8SL r3 = X.AnonymousClass8SL.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x1406 }
        L_0x00e4:
            int r2 = r3.formatCase_     // Catch:{ 186 -> 0x1406 }
            r0 = 5
            if (r2 != r0) goto L_0x0114
            java.lang.Object r0 = r3.format_     // Catch:{ 186 -> 0x1406 }
            X.8SV r0 = (X.AnonymousClass8SV) r0     // Catch:{ 186 -> 0x1406 }
            int r2 = r0.interactiveMessageCase_     // Catch:{ 186 -> 0x1406 }
            r0 = 7
            if (r2 != r0) goto L_0x0114
        L_0x00f2:
            X.005 r0 = r1.A0m     // Catch:{ 186 -> 0x1406 }
            java.lang.Object r2 = r0.get()     // Catch:{ 186 -> 0x1406 }
            X.1am r2 = (X.C30791am) r2     // Catch:{ 186 -> 0x1406 }
            r0 = 1
            X.AnonymousClass00C.A0D(r6, r0)     // Catch:{ 186 -> 0x1406 }
            X.9Yd r0 = r2.A01(r5)     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x0255
            java.lang.String r9 = r0.A05()     // Catch:{ 186 -> 0x1406 }
            if (r9 == 0) goto L_0x0255
            X.1ao r7 = r2.A01     // Catch:{ 186 -> 0x1406 }
            X.8SV r0 = r5.interactiveMessage_     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x01fd
            X.8SV r0 = X.AnonymousClass8SV.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x1406 }
            goto L_0x01fd
        L_0x0114:
            boolean r0 = r16.BLE()     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x012f
            r2 = 4194304(0x400000, float:5.877472E-39)
            int r0 = r6.A03     // Catch:{ 186 -> 0x1406 }
            r0 = r0 & r2
            boolean r0 = X.AnonymousClass000.A1S(r0, r2)     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x012f
            int r0 = r5.bitField1_     // Catch:{ 186 -> 0x1406 }
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1P(r0)     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x00f2
        L_0x012f:
            X.005 r7 = r1.A0m     // Catch:{ 186 -> 0x1406 }
            java.lang.Object r0 = r7.get()     // Catch:{ 186 -> 0x1406 }
            X.1am r0 = (X.C30791am) r0     // Catch:{ 186 -> 0x1406 }
            java.lang.String r3 = r6.A0r     // Catch:{ 186 -> 0x1406 }
            X.9Yd r0 = r0.A01(r5)     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x0144
            java.lang.String r2 = r0.A05()     // Catch:{ 186 -> 0x1406 }
            goto L_0x0145
        L_0x0144:
            r2 = 0
        L_0x0145:
            if (r3 == 0) goto L_0x014d
            int r0 = r3.length()     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x0157
        L_0x014d:
            if (r2 == 0) goto L_0x00f2
            int r0 = r2.length()     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x00f2
            if (r3 == 0) goto L_0x0164
        L_0x0157:
            int r0 = r3.length()     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x0164
            boolean r0 = r3.equals(r2)     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x0164
            goto L_0x00f2
        L_0x0164:
            java.lang.Object r7 = r7.get()     // Catch:{ 186 -> 0x1406 }
            X.1am r7 = (X.C30791am) r7     // Catch:{ 186 -> 0x1406 }
            java.lang.String r3 = r6.A0r     // Catch:{ 186 -> 0x1406 }
            X.9Yd r0 = r7.A01(r5)     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x0177
            java.lang.String r2 = r0.A05()     // Catch:{ 186 -> 0x1406 }
            goto L_0x0178
        L_0x0177:
            r2 = 0
        L_0x0178:
            if (r3 == 0) goto L_0x0183
            int r0 = r3.length()     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x0183
            if (r2 == 0) goto L_0x01ab
            goto L_0x018d
        L_0x0183:
            if (r2 == 0) goto L_0x00f2
            int r0 = r2.length()     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x018d
            goto L_0x00f2
        L_0x018d:
            int r0 = r2.length()     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x01ab
            if (r3 == 0) goto L_0x01ab
            int r0 = r3.length()     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x01ab
            java.util.Map r0 = r7.A00     // Catch:{ 186 -> 0x1406 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ 186 -> 0x1406 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x01ab
            boolean r0 = r0.contains(r2)     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x00f2
        L_0x01ab:
            java.lang.String r0 = "mixed"
            boolean r0 = r0.equals(r3)     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x01bb
            java.lang.String r0 = "quick_reply"
            boolean r0 = r0.equals(r3)     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x0231
        L_0x01bb:
            java.lang.String r0 = "cta_url"
            boolean r0 = r0.equals(r2)     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = "cta_call"
            boolean r0 = r0.equals(r2)     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = "voice_call"
            boolean r0 = r0.equals(r2)     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = "cta_copy"
            boolean r0 = r0.equals(r2)     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = "menu_options"
            boolean r0 = r0.equals(r2)     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = "cta_reminder"
            boolean r0 = r0.equals(r2)     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = "view_product"
            boolean r0 = r0.equals(r2)     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x00f2
            if (r2 == 0) goto L_0x00f2
            int r0 = r2.length()     // Catch:{ 186 -> 0x1406 }
            if (r0 != 0) goto L_0x0231
            goto L_0x00f2
        L_0x01fd:
            r3 = 0
            if (r0 == 0) goto L_0x021d
            X.8Q1 r0 = r0.A0u()     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x021d
            X.B6c r0 = r0.buttons_     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x021d
            java.lang.Object r0 = X.C007103b.A0M(r0)     // Catch:{ 186 -> 0x1406 }
            X.8P5 r0 = (X.AnonymousClass8P5) r0     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x021d
            java.lang.String r2 = r0.buttonParamsJson_     // Catch:{ 186 -> 0x1406 }
            if (r2 == 0) goto L_0x021d
            int r0 = r2.length()     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x021d
            r3 = r2
        L_0x021d:
            X.9Yd r0 = r7.A00(r9, r3)     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x0255
            boolean r0 = r0.A0E(r5, r6)     // Catch:{ 186 -> 0x1406 }
            if (r0 == 0) goto L_0x0255
            java.lang.String r0 = "Extensions Flow id is not owned by the sender jid"
            X.186 r0 = X.C165617ti.A0L(r0)     // Catch:{ 186 -> 0x1406 }
            goto L_0x0070
        L_0x0231:
            java.lang.String r0 = "Native flow name in envelope and proto must be consistent or an identified pair"
            X.186 r0 = X.C165617ti.A0L(r0)     // Catch:{ 186 -> 0x1406 }
            goto L_0x0070
        L_0x0239:
            java.lang.String r0 = "Message type for list/button/template in envelope and proto must be consistent"
            X.186 r0 = X.C165617ti.A0L(r0)     // Catch:{ 186 -> 0x1406 }
            goto L_0x0070
        L_0x0241:
            X.1DT r3 = r1.A05     // Catch:{ 186 -> 0x1406 }
            com.whatsapp.jid.Jid r0 = r1.A0T     // Catch:{ 186 -> 0x1406 }
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r0)     // Catch:{ 186 -> 0x1406 }
            r0 = 3
            r3.A0H(r2, r0)     // Catch:{ 186 -> 0x1406 }
            java.lang.String r0 = "invalid DeviceSentMessage"
            X.186 r0 = X.C165617ti.A0L(r0)     // Catch:{ 186 -> 0x1406 }
            goto L_0x0070
        L_0x0255:
            X.8Ri r2 = r4.messageContextInfo_     // Catch:{ 186 -> 0x1406 }
            if (r2 != 0) goto L_0x025b
            X.8Ri r2 = X.C173348Ri.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x1406 }
        L_0x025b:
            X.8SX r3 = X.C200429hO.A00(r4)     // Catch:{ 186 -> 0x1406 }
            if (r2 == 0) goto L_0x026e
            X.8NN r0 = r3.A0q()     // Catch:{ 186 -> 0x1406 }
            X.8NL r0 = (X.AnonymousClass8NL) r0     // Catch:{ 186 -> 0x1406 }
            r0.A0j(r2)     // Catch:{ 186 -> 0x1406 }
            X.8SX r3 = X.AnonymousClass8NN.A0D(r0)     // Catch:{ 186 -> 0x1406 }
        L_0x026e:
            java.util.ArrayList r24 = X.C202839mk.A01(r3)
            int r4 = X.C202839mk.A00(r3)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DecryptionCallbackV2/handlePlaintext messageTypes = "
            r2.append(r0)
            r0 = r24
            r2.append(r0)
            java.lang.String r0 = " : numUnknownTags = "
            X.C36321k7.A1T(r0, r2, r4)
            r0 = 2
            if (r4 < r0) goto L_0x02ab
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext axolotl received several unknown tags; message.key="
            r0 = r16
            X.3Qa r0 = X.C165607th.A0g(r0, r2, r3)
            r3.append(r0)
            java.lang.String r0 = " numUnknownTags="
            X.C36321k7.A1U(r0, r3, r4)
            X.2Sw r2 = r1.A0O
            X.8eP r0 = r1.A0Z
            r3 = 18
            X.C200429hO.A01(r2, r0, r3)
            goto L_0x0045
        L_0x02ab:
            X.0yC r12 = r1.A0N
            X.0wN r0 = r1.A02
            r35 = r0
            r2 = r24
            boolean r0 = X.C202839mk.A03(r0, r12, r3, r2)
            if (r0 != 0) goto L_0x02d3
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext received an invalid protobuf; message.key="
            r0 = r16
            X.3Qa r0 = X.C165607th.A0g(r0, r2, r3)
            r3.append(r0)
            java.lang.String r2 = " messageTypes="
            r0 = r24
            X.C36321k7.A1L(r0, r2, r3)
            r3 = 12
            goto L_0x0045
        L_0x02d3:
            X.8Ri r4 = r3.messageContextInfo_     // Catch:{ Exception -> 0x13e4 }
            if (r4 != 0) goto L_0x02d9
            X.8Ri r4 = X.C173348Ri.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x02d9:
            com.whatsapp.jid.Jid r2 = r1.A0T     // Catch:{ Exception -> 0x13e4 }
            com.whatsapp.jid.DeviceJid r7 = com.whatsapp.jid.DeviceJid.of(r2)     // Catch:{ Exception -> 0x13e4 }
            if (r7 != 0) goto L_0x02ec
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r0 = "DecryptionCallbackV2/processIcdcData sender is not a userJid jid="
            X.C36321k7.A1J(r2, r0, r4)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x0419
        L_0x02ec:
            if (r4 == 0) goto L_0x02f7
            int r0 = r4.bitField0_     // Catch:{ Exception -> 0x13e4 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x02f7
            X.8Rq r0 = r4.deviceListMetadata_     // Catch:{ Exception -> 0x13e4 }
            goto L_0x0344
        L_0x02f7:
            int r4 = r3.bitField0_     // Catch:{ Exception -> 0x13e4 }
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r4 = r4 & r0
            boolean r0 = X.AnonymousClass000.A1P(r4)     // Catch:{ Exception -> 0x13e4 }
            if (r0 == 0) goto L_0x0403
            X.8Pv r0 = r3.deviceSentMessage_     // Catch:{ Exception -> 0x13e4 }
            r4 = r0
            if (r0 != 0) goto L_0x0309
            X.8Pv r0 = X.C172958Pv.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x0309:
            X.8SX r0 = r0.message_     // Catch:{ Exception -> 0x13e4 }
            if (r0 != 0) goto L_0x030f
            X.8SX r0 = X.AnonymousClass8SX.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x030f:
            boolean r0 = r0.A0x()     // Catch:{ Exception -> 0x13e4 }
            if (r0 == 0) goto L_0x0403
            if (r4 != 0) goto L_0x0319
            X.8Pv r4 = X.C172958Pv.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x0319:
            X.8SX r0 = r4.message_     // Catch:{ Exception -> 0x13e4 }
            if (r0 != 0) goto L_0x031f
            X.8SX r0 = X.AnonymousClass8SX.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x031f:
            X.8Ri r0 = r0.messageContextInfo_     // Catch:{ Exception -> 0x13e4 }
            if (r0 != 0) goto L_0x0325
            X.8Ri r0 = X.C173348Ri.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x0325:
            int r0 = r0.bitField0_     // Catch:{ Exception -> 0x13e4 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0403
            java.lang.String r0 = "DecryptionCallbackV2/processIcdcData in deviceSentMessage!"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x13e4 }
            X.8Pv r0 = r3.deviceSentMessage_     // Catch:{ Exception -> 0x13e4 }
            if (r0 != 0) goto L_0x0336
            X.8Pv r0 = X.C172958Pv.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x0336:
            X.8SX r0 = r0.message_     // Catch:{ Exception -> 0x13e4 }
            if (r0 != 0) goto L_0x033c
            X.8SX r0 = X.AnonymousClass8SX.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x033c:
            X.8Ri r0 = r0.messageContextInfo_     // Catch:{ Exception -> 0x13e4 }
            if (r0 != 0) goto L_0x0342
            X.8Ri r0 = X.C173348Ri.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x0342:
            X.8Rq r0 = r0.deviceListMetadata_     // Catch:{ Exception -> 0x13e4 }
        L_0x0344:
            if (r0 != 0) goto L_0x0348
            X.8Rq r0 = X.C173428Rq.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x0348:
            X.0wQ r5 = r1.A04     // Catch:{ Exception -> 0x13e4 }
            com.whatsapp.jid.UserJid r4 = r7.userJid     // Catch:{ Exception -> 0x13e4 }
            boolean r4 = r5.A0M(r4)     // Catch:{ Exception -> 0x13e4 }
            if (r4 == 0) goto L_0x0359
            com.whatsapp.jid.UserJid r6 = r16.BGZ()     // Catch:{ Exception -> 0x13e4 }
        L_0x0356:
            int r4 = r0.bitField0_     // Catch:{ Exception -> 0x13e4 }
            goto L_0x035e
        L_0x0359:
            com.whatsapp.jid.PhoneUserJid r6 = X.C36441kJ.A0n(r5)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x0356
        L_0x035e:
            boolean r5 = X.C165577te.A1W(r4)
            r11 = 0
            if (r5 == 0) goto L_0x0366
            goto L_0x0368
        L_0x0366:
            r13 = r11
            goto L_0x036a
        L_0x0368:
            X.AUx r13 = r0.senderKeyHash_     // Catch:{ Exception -> 0x13e4 }
        L_0x036a:
            long r9 = r0.senderTimestamp_     // Catch:{ Exception -> 0x13e4 }
            int r5 = r0.senderAccountType_     // Catch:{ Exception -> 0x13e4 }
            X.2q9 r28 = X.C52772q9.A00(r5)     // Catch:{ Exception -> 0x13e4 }
            if (r28 != 0) goto L_0x0376
            X.2q9 r28 = X.C52772q9.E2EE     // Catch:{ Exception -> 0x13e4 }
        L_0x0376:
            r4 = r4 & 16
            if (r4 == 0) goto L_0x037c
            X.AUx r11 = r0.recipientKeyHash_     // Catch:{ Exception -> 0x13e4 }
        L_0x037c:
            long r4 = r0.recipientTimestamp_     // Catch:{ Exception -> 0x13e4 }
            X.B62 r14 = r0.recipientKeyIndexes_     // Catch:{ Exception -> 0x13e4 }
            java.util.HashSet r30 = X.C90524aI.A0k(r14)     // Catch:{ Exception -> 0x13e4 }
            int r0 = r0.receiverAccountType_     // Catch:{ Exception -> 0x13e4 }
            X.2q9 r29 = X.C52772q9.A00(r0)     // Catch:{ Exception -> 0x13e4 }
            if (r29 != 0) goto L_0x038e
            X.2q9 r29 = X.C52772q9.E2EE     // Catch:{ Exception -> 0x13e4 }
        L_0x038e:
            X.9Na r0 = new X.9Na     // Catch:{ Exception -> 0x13e4 }
            r25 = r0
            r26 = r13
            r27 = r11
            r31 = r9
            r33 = r4
            r25.<init>(r26, r27, r28, r29, r30, r31, r33)     // Catch:{ Exception -> 0x13e4 }
            X.1OD r11 = r1.A0K     // Catch:{ Exception -> 0x13e4 }
            com.whatsapp.jid.UserJid r14 = r7.userJid     // Catch:{ Exception -> 0x13e4 }
            X.2q9 r13 = r0.A04     // Catch:{ Exception -> 0x13e4 }
            X.2q9 r10 = X.C52772q9.HOSTED     // Catch:{ Exception -> 0x13e4 }
            if (r13 == r10) goto L_0x03c2
            X.2q9 r4 = r0.A05     // Catch:{ Exception -> 0x13e4 }
            if (r4 == r10) goto L_0x03c2
        L_0x03ab:
            X.0wU r5 = r1.A0k     // Catch:{ Exception -> 0x13e4 }
            r30 = 2
            X.73N r4 = new X.73N     // Catch:{ Exception -> 0x13e4 }
            r25 = r4
            r26 = r1
            r27 = r0
            r28 = r7
            r29 = r6
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x13e4 }
            r5.Boy(r4)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x0419
        L_0x03c2:
            if (r6 == 0) goto L_0x03e1
            X.0wQ r4 = r11.A02     // Catch:{ Exception -> 0x13e4 }
            boolean r4 = r4.A0M(r6)     // Catch:{ Exception -> 0x13e4 }
            if (r4 != 0) goto L_0x03e1
            if (r13 != r10) goto L_0x03e1
            X.17i r4 = r11.A0B     // Catch:{ Exception -> 0x13e4 }
            X.2q9 r9 = r4.A06(r6)     // Catch:{ Exception -> 0x13e4 }
            long r18 = r4.A01(r6)     // Catch:{ Exception -> 0x13e4 }
            long r4 = r0.A00     // Catch:{ Exception -> 0x13e4 }
            int r15 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r15 <= 0) goto L_0x03e1
            if (r9 == r13) goto L_0x03e1
            goto L_0x03ff
        L_0x03e1:
            X.0wQ r4 = r11.A02     // Catch:{ Exception -> 0x13e4 }
            boolean r4 = r4.A0M(r14)     // Catch:{ Exception -> 0x13e4 }
            if (r4 != 0) goto L_0x03ab
            X.2q9 r9 = r0.A05     // Catch:{ Exception -> 0x13e4 }
            if (r9 != r10) goto L_0x03ab
            X.17i r4 = r11.A0B     // Catch:{ Exception -> 0x13e4 }
            X.2q9 r10 = r4.A06(r14)     // Catch:{ Exception -> 0x13e4 }
            long r14 = r4.A01(r14)     // Catch:{ Exception -> 0x13e4 }
            long r4 = r0.A01     // Catch:{ Exception -> 0x13e4 }
            int r13 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x03ab
            if (r10 == r9) goto L_0x03ab
        L_0x03ff:
            r11.A0A(r0, r7, r6)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x0419
        L_0x0403:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r0 = "DecryptionCallbackV2/processIcdcData no icdc data, sender="
            r4.append(r0)     // Catch:{ Exception -> 0x13e4 }
            r4.append(r7)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r0 = "; chatJid="
            r4.append(r0)     // Catch:{ Exception -> 0x13e4 }
            X.11F r0 = r1.A0S     // Catch:{ Exception -> 0x13e4 }
            X.C36351kA.A1L(r0, r4)     // Catch:{ Exception -> 0x13e4 }
        L_0x0419:
            if (r8 == 0) goto L_0x12e6
            r0 = r16
            X.AHp r0 = (X.C21337AHp) r0     // Catch:{ Exception -> 0x13e4 }
            int r4 = r3.bitField0_     // Catch:{ Exception -> 0x13e4 }
            r4 = r4 & 2
            if (r4 != 0) goto L_0x0479
            r4 = 5716(0x1654, float:8.01E-42)
            boolean r4 = r12.A0E(r4)     // Catch:{ Exception -> 0x13e4 }
            if (r4 == 0) goto L_0x0479
            X.8SX r5 = X.AnonymousClass9ZT.A01(r12, r3)     // Catch:{ Exception -> 0x13e4 }
            X.1DW r4 = r1.A0M     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r7 = X.C203229nZ.A07(r4, r5)     // Catch:{ Exception -> 0x13e4 }
            X.9lY r5 = r0.A0C     // Catch:{ Exception -> 0x13e4 }
            int r4 = r0.A03     // Catch:{ Exception -> 0x13e4 }
            int r31 = r0.BGp()     // Catch:{ Exception -> 0x13e4 }
            r28 = 0
            r25 = r35
            r26 = r5
            r27 = r3
            r29 = r7
            r30 = r4
            java.lang.String r8 = X.C183348qe.A02(r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r6 = r0.A0w     // Catch:{ Exception -> 0x13e4 }
            boolean r4 = r8.equals(r6)     // Catch:{ Exception -> 0x13e4 }
            if (r4 != 0) goto L_0x0479
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = "Received type: "
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            r5.append(r6)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = ", Expected type: "
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            r5.append(r8)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = ", Media type: "
            java.lang.String r7 = X.AnonymousClass000.A0p(r4, r7, r5)     // Catch:{ Exception -> 0x13e4 }
            r6 = 0
            java.lang.String r5 = "DecryptionCallbackV2/messageTypeMismatch"
            r4 = r35
            r4.A0E(r5, r7, r6)     // Catch:{ Exception -> 0x13e4 }
        L_0x0479:
            X.11F r18 = X.AnonymousClass143.A00(r2)     // Catch:{ Exception -> 0x13e4 }
            X.3TT r10 = new X.3TT     // Catch:{ Exception -> 0x13e4 }
            r10.<init>()     // Catch:{ Exception -> 0x13e4 }
            r2 = -1
            r10.A03 = r2     // Catch:{ Exception -> 0x13e4 }
            int r2 = r0.A06     // Catch:{ Exception -> 0x13e4 }
            r10.A01 = r2     // Catch:{ Exception -> 0x13e4 }
            com.whatsapp.jid.UserJid r8 = X.C36401kF.A0b(r18)     // Catch:{ Exception -> 0x13e4 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = "DecryptionCallbackV2/processVerifiedNameData, jid: "
            r4.append(r2)     // Catch:{ Exception -> 0x13e4 }
            r4.append(r8)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = "incoming vname: "
            r4.append(r2)     // Catch:{ Exception -> 0x13e4 }
            java.lang.Long r2 = r0.A0f     // Catch:{ Exception -> 0x13e4 }
            r4.append(r2)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r7 = ", vlevel: "
            r4.append(r7)     // Catch:{ Exception -> 0x13e4 }
            int r2 = r0.A06     // Catch:{ Exception -> 0x13e4 }
            r4.append(r2)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r6 = ", privacyMode: "
            r4.append(r6)     // Catch:{ Exception -> 0x13e4 }
            X.3ur r2 = r0.A0S     // Catch:{ Exception -> 0x13e4 }
            r9 = 0
            if (r2 != 0) goto L_0x04b8
            r2 = r9
        L_0x04b8:
            X.C36321k7.A1N(r2, r4)     // Catch:{ Exception -> 0x13e4 }
            java.lang.Long r2 = r0.A0f     // Catch:{ Exception -> 0x13e4 }
            if (r2 == 0) goto L_0x06e0
            if (r8 == 0) goto L_0x06e0
            X.185 r2 = r1.A0A     // Catch:{ Exception -> 0x13e4 }
            java.util.Map r4 = r2.A07     // Catch:{ Exception -> 0x13e4 }
            r4.remove(r8)     // Catch:{ Exception -> 0x13e4 }
            X.3L0 r13 = r2.A02(r8)     // Catch:{ Exception -> 0x13e4 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = "DecryptionCallbackV2/processVerifiedNameData log db value jid = "
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            r5.append(r8)     // Catch:{ Exception -> 0x13e4 }
            r5.append(r7)     // Catch:{ Exception -> 0x13e4 }
            if (r13 != 0) goto L_0x04df
            r4 = r9
            goto L_0x04e5
        L_0x04df:
            int r4 = r13.A03     // Catch:{ Exception -> 0x13e4 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x13e4 }
        L_0x04e5:
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            r5.append(r6)     // Catch:{ Exception -> 0x13e4 }
            if (r13 != 0) goto L_0x04ef
            r4 = r9
            goto L_0x04f3
        L_0x04ef:
            X.3ur r4 = r13.A00()     // Catch:{ Exception -> 0x13e4 }
        L_0x04f3:
            X.C36321k7.A1N(r4, r5)     // Catch:{ Exception -> 0x13e4 }
            int r4 = X.AnonymousClass3U1.A00(r13)     // Catch:{ Exception -> 0x13e4 }
            r10.A02 = r4     // Catch:{ Exception -> 0x13e4 }
            r22 = 0
            r11 = 1
            if (r13 == 0) goto L_0x0557
            long r4 = r13.A05     // Catch:{ Exception -> 0x13e4 }
            java.lang.Long r6 = r0.A0f     // Catch:{ Exception -> 0x13e4 }
            long r14 = r6.longValue()     // Catch:{ Exception -> 0x13e4 }
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x053b
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r6 = "DecryptionCallbackV2/processVerifiedNameData verified name serial changed, requestCert = true; jid="
            r7.append(r6)     // Catch:{ Exception -> 0x13e4 }
            r7.append(r8)     // Catch:{ Exception -> 0x13e4 }
            X.C36421kH.A1N(r7)     // Catch:{ Exception -> 0x13e4 }
            r7.append(r4)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = " -> "
            r7.append(r4)     // Catch:{ Exception -> 0x13e4 }
            java.lang.Long r4 = r0.A0f     // Catch:{ Exception -> 0x13e4 }
            X.C36351kA.A1L(r4, r7)     // Catch:{ Exception -> 0x13e4 }
            int r4 = r13.A03     // Catch:{ Exception -> 0x13e4 }
            r10.A03 = r4     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = r13.A08     // Catch:{ Exception -> 0x13e4 }
            r10.A07 = r4     // Catch:{ Exception -> 0x13e4 }
            X.3ur r4 = r13.A00()     // Catch:{ Exception -> 0x13e4 }
            r10.A05 = r4     // Catch:{ Exception -> 0x13e4 }
            r2.A03(r8)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x0567
        L_0x053b:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = "DecryptionCallbackV2 name is in sync but privacy or level may have changed, jid: "
            X.C36321k7.A1K(r8, r4, r5)     // Catch:{ Exception -> 0x13e4 }
            r10.A08 = r11     // Catch:{ Exception -> 0x13e4 }
            int r4 = r13.A03     // Catch:{ Exception -> 0x13e4 }
            r10.A03 = r4     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = r13.A08     // Catch:{ Exception -> 0x13e4 }
            r10.A07 = r4     // Catch:{ Exception -> 0x13e4 }
            X.3ur r4 = r13.A00()     // Catch:{ Exception -> 0x13e4 }
            r10.A05 = r4     // Catch:{ Exception -> 0x13e4 }
            r21 = 0
            goto L_0x0569
        L_0x0557:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = "DecryptionCallbackV2 oldVerifiedName is null, new cert case, requestCert = true, jid: "
            X.C36321k7.A1K(r8, r4, r5)     // Catch:{ Exception -> 0x13e4 }
            r4 = 0
            r10.A03 = r4     // Catch:{ Exception -> 0x13e4 }
            r10.A07 = r9     // Catch:{ Exception -> 0x13e4 }
            r10.A05 = r9     // Catch:{ Exception -> 0x13e4 }
        L_0x0567:
            r21 = 1
        L_0x0569:
            java.lang.Long r7 = r0.A0e     // Catch:{ Exception -> 0x13e4 }
            java.lang.Long r5 = r0.A0d     // Catch:{ Exception -> 0x13e4 }
            if (r7 == 0) goto L_0x05b7
            if (r5 == 0) goto L_0x05b7
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = "DecryptionCallbackV2/processVerifiedNameData triggred_block expiration_ts = "
            r6.append(r4)     // Catch:{ Exception -> 0x13e4 }
            r6.append(r7)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = " cooldown = "
            X.C36321k7.A1K(r5, r4, r6)     // Catch:{ Exception -> 0x13e4 }
            long r6 = r7.longValue()     // Catch:{ Exception -> 0x13e4 }
            r19 = 0
            int r4 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x05b7
            long r14 = r5.longValue()     // Catch:{ Exception -> 0x13e4 }
            int r4 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x05b7
            X.1CL r4 = r1.A08     // Catch:{ Exception -> 0x13e4 }
            r19 = r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r4
            long r4 = r4 * r14
            r14 = r19
            org.json.JSONObject r14 = X.AnonymousClass1CL.A01(r14, r8)     // Catch:{ JSONException -> 0x05b7 }
            if (r14 != 0) goto L_0x05a8
            org.json.JSONObject r14 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x05b7 }
        L_0x05a8:
            java.lang.String r15 = "tb_expired_ts"
            r14.put(r15, r6)     // Catch:{ JSONException -> 0x05b7 }
            java.lang.String r6 = "tb_cooldown"
            r14.put(r6, r4)     // Catch:{ JSONException -> 0x05b7 }
            r4 = r19
            X.AnonymousClass1CL.A02(r4, r8, r14)     // Catch:{ JSONException -> 0x05b7 }
        L_0x05b7:
            if (r21 == 0) goto L_0x061f
            byte[] r6 = r0.A15     // Catch:{ Exception -> 0x13e4 }
            if (r6 == 0) goto L_0x06a7
            if (r13 == 0) goto L_0x05ed
            X.3ur r4 = r13.A00()     // Catch:{ Exception -> 0x13e4 }
            X.3ur r11 = r0.A0S     // Catch:{ Exception -> 0x13e4 }
            long r4 = r4.privacyModeTs     // Catch:{ Exception -> 0x13e4 }
            r13 = 0
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x05ed
            if (r11 == 0) goto L_0x05d5
            long r4 = r11.privacyModeTs     // Catch:{ Exception -> 0x13e4 }
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x05ed
        L_0x05d5:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = "DecryptionCallbackV2/missing privacy mode. userJid="
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            r5.append(r8)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = ". id="
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = r0.A1C     // Catch:{ Exception -> 0x13e4 }
            X.C36321k7.A1a(r5, r4)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x06a7
        L_0x05ed:
            int r5 = r0.A06     // Catch:{ Exception -> 0x13e4 }
            X.3ur r4 = r0.A0S     // Catch:{ Exception -> 0x13e4 }
            boolean r4 = r2.A06(r8, r4, r6, r5)     // Catch:{ Exception -> 0x13e4 }
            if (r4 == 0) goto L_0x06a7
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = "DecryptionCallbackV2/reset the transition state, jid: "
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            r5.append(r8)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = "db update called"
            X.C36321k7.A1a(r5, r4)     // Catch:{ Exception -> 0x13e4 }
            X.0wU r7 = r1.A0k     // Catch:{ Exception -> 0x13e4 }
            r6 = 10
            X.74j r5 = new X.74j     // Catch:{ Exception -> 0x13e4 }
            r4 = r18
            r5.<init>(r1, r4, r6)     // Catch:{ Exception -> 0x13e4 }
            r7.Boy(r5)     // Catch:{ Exception -> 0x13e4 }
            r4 = 0
            r10.A03 = r4     // Catch:{ Exception -> 0x13e4 }
            r10.A07 = r9     // Catch:{ Exception -> 0x13e4 }
            r10.A05 = r9     // Catch:{ Exception -> 0x13e4 }
            goto L_0x06a9
        L_0x061f:
            X.3ur r4 = r10.A05     // Catch:{ Exception -> 0x13e4 }
            X.3ur r13 = r0.A0S     // Catch:{ Exception -> 0x13e4 }
            if (r4 == 0) goto L_0x0666
            long r4 = r4.privacyModeTs     // Catch:{ Exception -> 0x13e4 }
            r19 = 0
            int r6 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r6 <= 0) goto L_0x065c
            if (r13 == 0) goto L_0x0635
            long r6 = r13.privacyModeTs     // Catch:{ Exception -> 0x13e4 }
            int r14 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r14 != 0) goto L_0x065f
        L_0x0635:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = "DecryptionCallbackV2/maybe biz removal, requestSyncThoughCertInSync = true, jid: "
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            r5.append(r8)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = ", old PrivacyMode: "
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            X.3ur r4 = r10.A05     // Catch:{ Exception -> 0x13e4 }
            if (r4 != 0) goto L_0x064b
            r4 = r9
        L_0x064b:
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = ", new PrivacyMode: "
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            X.3ur r4 = r0.A0S     // Catch:{ Exception -> 0x13e4 }
            if (r4 != 0) goto L_0x0658
            r4 = r9
        L_0x0658:
            X.C36321k7.A1N(r4, r5)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x069c
        L_0x065c:
            if (r13 != 0) goto L_0x065f
            goto L_0x0666
        L_0x065f:
            long r6 = r13.privacyModeTs     // Catch:{ Exception -> 0x13e4 }
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x0666
            goto L_0x066c
        L_0x0666:
            int r5 = r10.A03     // Catch:{ Exception -> 0x13e4 }
            int r4 = r0.A06     // Catch:{ Exception -> 0x13e4 }
            if (r5 == r4) goto L_0x06a7
        L_0x066c:
            int r4 = r0.A06     // Catch:{ Exception -> 0x13e4 }
            boolean r4 = r2.A05(r8, r13, r4, r11)     // Catch:{ Exception -> 0x13e4 }
            r11 = r4 ^ 1
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = "DecryptionCallbackV2/new privacy valid and vlevel change, jid: "
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            r5.append(r8)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = "requestSyncThoughCertInSync = "
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            r5.append(r11)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = ", old vlevel: "
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            int r4 = r10.A03     // Catch:{ Exception -> 0x13e4 }
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r4 = ", new vlevel: "
            r5.append(r4)     // Catch:{ Exception -> 0x13e4 }
            int r4 = r0.A06     // Catch:{ Exception -> 0x13e4 }
            X.C36321k7.A1Y(r5, r4)     // Catch:{ Exception -> 0x13e4 }
        L_0x069c:
            X.3L0 r4 = r2.A02(r8)     // Catch:{ Exception -> 0x13e4 }
            int r2 = X.AnonymousClass3U1.A00(r4)     // Catch:{ Exception -> 0x13e4 }
            r10.A00 = r2     // Catch:{ Exception -> 0x13e4 }
            goto L_0x06ab
        L_0x06a7:
            r22 = r21
        L_0x06a9:
            r11 = 0
            goto L_0x069c
        L_0x06ab:
            if (r4 == 0) goto L_0x06b7
            java.lang.String r2 = r4.A08     // Catch:{ Exception -> 0x13e4 }
            r10.A06 = r2     // Catch:{ Exception -> 0x13e4 }
            X.3ur r2 = r4.A00()     // Catch:{ Exception -> 0x13e4 }
            r10.A04 = r2     // Catch:{ Exception -> 0x13e4 }
        L_0x06b7:
            if (r22 == 0) goto L_0x06ba
            goto L_0x0729
        L_0x06ba:
            if (r11 == 0) goto L_0x073c
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = "DecryptionCallbackV2/usync vlevel/privacy mismatch, requestSyncThoughCertInSync=true, start GetVNameCertificateJob. jid="
            r4.append(r2)     // Catch:{ Exception -> 0x13e4 }
            r4.append(r8)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = " new vlevel="
            r4.append(r2)     // Catch:{ Exception -> 0x13e4 }
            int r2 = r0.A06     // Catch:{ Exception -> 0x13e4 }
            r4.append(r2)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = " new privacy mode="
            r4.append(r2)     // Catch:{ Exception -> 0x13e4 }
            X.3ur r2 = r0.A0S     // Catch:{ Exception -> 0x13e4 }
            if (r2 == 0) goto L_0x06dc
            r9 = r2
        L_0x06dc:
            X.C36351kA.A1L(r9, r4)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x0732
        L_0x06e0:
            X.16D r2 = r1.A09     // Catch:{ Exception -> 0x13e4 }
            X.141 r4 = r2.A08(r8)     // Catch:{ Exception -> 0x13e4 }
            if (r4 == 0) goto L_0x073c
            boolean r2 = r4.A0C()     // Catch:{ Exception -> 0x13e4 }
            if (r2 == 0) goto L_0x073c
            X.3L0 r5 = r4.A0E     // Catch:{ Exception -> 0x13e4 }
            if (r5 == 0) goto L_0x0716
            boolean r2 = X.C197029b1.A00(r8)     // Catch:{ Exception -> 0x13e4 }
            if (r2 == 0) goto L_0x0716
            r2 = 6863(0x1acf, float:9.617E-42)
            boolean r2 = r12.A0E(r2)     // Catch:{ Exception -> 0x13e4 }
            if (r2 == 0) goto L_0x0716
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = "DecryptionCallbackV2/verified level absent in message, ignore for bot; jid="
            X.C36321k7.A1L(r8, r2, r4)     // Catch:{ Exception -> 0x13e4 }
            int r4 = r5.A03     // Catch:{ Exception -> 0x13e4 }
            r10.A03 = r4     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = r5.A08     // Catch:{ Exception -> 0x13e4 }
            r10.A07 = r2     // Catch:{ Exception -> 0x13e4 }
            r10.A01 = r4     // Catch:{ Exception -> 0x13e4 }
            r10.A06 = r2     // Catch:{ Exception -> 0x13e4 }
            goto L_0x073c
        L_0x0716:
            int r2 = r4.A08     // Catch:{ Exception -> 0x13e4 }
            r10.A03 = r2     // Catch:{ Exception -> 0x13e4 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = "DecryptionCallbackV2/verified name serial not present on message, clearing state; jid="
            X.C36321k7.A1L(r8, r2, r4)     // Catch:{ Exception -> 0x13e4 }
            X.185 r2 = r1.A0A     // Catch:{ Exception -> 0x13e4 }
            r2.A03(r8)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x073c
        L_0x0729:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = "DecryptionCallbackV2/requestCert=true, start GetVNameCertificateJob for jid: "
            X.C36321k7.A1K(r8, r2, r4)     // Catch:{ Exception -> 0x13e4 }
        L_0x0732:
            X.164 r4 = r1.A06     // Catch:{ Exception -> 0x13e4 }
            com.whatsapp.jobqueue.job.GetVNameCertificateJob r2 = new com.whatsapp.jobqueue.job.GetVNameCertificateJob     // Catch:{ Exception -> 0x13e4 }
            r2.<init>(r8)     // Catch:{ Exception -> 0x13e4 }
            r4.A01(r2)     // Catch:{ Exception -> 0x13e4 }
        L_0x073c:
            X.3H2 r9 = r10.A02()     // Catch:{ Exception -> 0x13e4 }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x13e4 }
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0758
            X.2Sw r4 = r1.A0O     // Catch:{ Exception -> 0x13e4 }
            java.lang.Integer r2 = X.C36401kF.A0h()     // Catch:{ Exception -> 0x13e4 }
            r4.A0B = r2     // Catch:{ Exception -> 0x13e4 }
            if (r17 == 0) goto L_0x12e6
            X.1DL r2 = r1.A0X     // Catch:{ Exception -> 0x13e4 }
            r2.A0C(r0)     // Catch:{ Exception -> 0x13e4 }
            r0 = 0
            goto L_0x12e4
        L_0x0758:
            int r2 = r24.size()     // Catch:{ Exception -> 0x13e4 }
            r7 = 1
            if (r2 != r7) goto L_0x0c1a
            int r2 = r0.A01     // Catch:{ Exception -> 0x13e4 }
            if (r2 != 0) goto L_0x0c1a
            r4 = 32
            int r2 = r0.A03     // Catch:{ Exception -> 0x13e4 }
            r2 = r2 & 32
            boolean r2 = X.AnonymousClass000.A1S(r2, r4)     // Catch:{ Exception -> 0x13e4 }
            if (r2 == 0) goto L_0x0c1a
            int r2 = r3.bitField2_     // Catch:{ Exception -> 0x13e4 }
            r2 = r2 & 2
            if (r2 != 0) goto L_0x0c1a
            boolean r2 = r1.A00     // Catch:{ Exception -> 0x13e4 }
            r19 = r2
            X.9dF r2 = r1.A0V     // Catch:{ Exception -> 0x13e4 }
            X.2Sw r5 = r1.A0O     // Catch:{ Exception -> 0x13e4 }
            X.9Eo r11 = new X.9Eo     // Catch:{ Exception -> 0x13e4 }
            r11.<init>(r1)     // Catch:{ Exception -> 0x13e4 }
            r10 = 0
            boolean r13 = r3.A10()     // Catch:{ Exception -> 0x13e4 }
            if (r13 == 0) goto L_0x0797
            X.8SL r4 = r3.templateMessage_     // Catch:{ Exception -> 0x13e4 }
            r8 = r4
            if (r4 != 0) goto L_0x0790
            X.8SL r4 = X.AnonymousClass8SL.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x0790:
            int r4 = r4.bitField0_     // Catch:{ Exception -> 0x13e4 }
            r4 = r4 & 16
            if (r4 == 0) goto L_0x0797
            goto L_0x07b0
        L_0x0797:
            int r4 = r3.bitField0_     // Catch:{ Exception -> 0x13e4 }
            r4 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x07b3
            X.8Rn r4 = r3.highlyStructuredMessage_     // Catch:{ Exception -> 0x13e4 }
            r6 = r4
            if (r4 != 0) goto L_0x07a4
            X.8Rn r4 = X.C173398Rn.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x07a4:
            int r4 = r4.bitField0_     // Catch:{ Exception -> 0x13e4 }
            r4 = r4 & 64
            if (r4 == 0) goto L_0x07b3
            if (r6 != 0) goto L_0x07ae
            X.8Rn r6 = X.C173398Rn.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x07ae:
            X.8SL r8 = r6.hydratedHsm_     // Catch:{ Exception -> 0x13e4 }
        L_0x07b0:
            if (r8 != 0) goto L_0x07b7
            goto L_0x07b5
        L_0x07b3:
            r8 = 0
            goto L_0x07b7
        L_0x07b5:
            X.8SL r8 = X.AnonymousClass8SL.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x07b7:
            com.whatsapp.jid.Jid r4 = r0.A19     // Catch:{ Exception -> 0x13e4 }
            r20 = r4
            X.11F r4 = X.AnonymousClass143.A00(r20)     // Catch:{ Exception -> 0x13e4 }
            boolean r4 = X.AnonymousClass143.A0G(r4)     // Catch:{ Exception -> 0x13e4 }
            if (r4 != 0) goto L_0x07d2
            X.11F r4 = X.AnonymousClass143.A00(r20)     // Catch:{ Exception -> 0x13e4 }
            boolean r4 = r4 instanceof X.C177618e5     // Catch:{ Exception -> 0x13e4 }
            if (r4 != 0) goto L_0x07d2
            X.11F r6 = X.AnonymousClass143.A00(r20)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x07d8
        L_0x07d2:
            com.whatsapp.jid.Jid r4 = r0.A0E     // Catch:{ Exception -> 0x13e4 }
            X.11F r6 = X.AnonymousClass143.A00(r4)     // Catch:{ Exception -> 0x13e4 }
        L_0x07d8:
            r12 = -1
            if (r8 == 0) goto L_0x09dd
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ 1Tb -> 0x09cf }
            r5.A0B = r4     // Catch:{ 1Tb -> 0x09cf }
            X.3Qa r4 = X.C21337AHp.A00(r0)     // Catch:{ 1Tb -> 0x09cf }
            java.lang.String r15 = r4.toString()     // Catch:{ 1Tb -> 0x09cf }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)     // Catch:{ 1Tb -> 0x09cf }
            int r4 = r8.bitField0_     // Catch:{ 1Tb -> 0x09cf }
            r4 = r4 & 16
            if (r4 == 0) goto L_0x0869
            X.8SO r13 = X.C170918Hz.A0N(r8)     // Catch:{ 1Tb -> 0x09cf }
            int r4 = r13.titleCase_     // Catch:{ 1Tb -> 0x09cf }
            java.lang.Integer r5 = X.C170918Hz.A0R(r4)     // Catch:{ 1Tb -> 0x09cf }
            java.lang.Integer r4 = X.C023109s.A01     // Catch:{ 1Tb -> 0x09cf }
            if (r5 != r4) goto L_0x0815
            int r5 = r13.titleCase_     // Catch:{ 1Tb -> 0x09cf }
            r4 = 2
            if (r5 == r4) goto L_0x0815
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 1Tb -> 0x09cf }
            java.lang.String r0 = "MessageUtil/validateHydratedTemplateMessage/error no title with text title, message key="
            X.C36321k7.A1R(r0, r15, r2)     // Catch:{ 1Tb -> 0x09cf }
            X.1Tb r0 = new X.1Tb     // Catch:{ 1Tb -> 0x09cf }
            r0.<init>(r14)     // Catch:{ 1Tb -> 0x09cf }
        L_0x0814:
            throw r0     // Catch:{ 1Tb -> 0x09cf }
        L_0x0815:
            int r4 = r13.bitField0_     // Catch:{ 1Tb -> 0x09cf }
            r4 = r4 & 32
            if (r4 == 0) goto L_0x085a
            X.8NL r14 = X.C170918Hz.A0D()     // Catch:{ 1Tb -> 0x09cf }
            X.8SX r5 = X.AnonymousClass8NN.A0E(r14)     // Catch:{ 1Tb -> 0x09cf }
            r5.templateMessage_ = r8     // Catch:{ 1Tb -> 0x09cf }
            int r4 = r5.bitField0_     // Catch:{ 1Tb -> 0x09cf }
            r13 = 1048576(0x100000, float:1.469368E-39)
            r4 = r4 | r13
            r5.bitField0_ = r4     // Catch:{ 1Tb -> 0x09cf }
            X.8SX r14 = X.AnonymousClass8NN.A0D(r14)     // Catch:{ 1Tb -> 0x09cf }
            X.3Qa r13 = X.C21337AHp.A00(r0)     // Catch:{ 1Tb -> 0x09cf }
            long r4 = r0.A18     // Catch:{ 1Tb -> 0x09cf }
            X.9T0 r5 = X.C1899296d.A00(r14, r13, r4)     // Catch:{ 1Tb -> 0x09cf }
            X.9lY r4 = r0.A0C     // Catch:{ 1Tb -> 0x09cf }
            r5.A03 = r4     // Catch:{ 1Tb -> 0x09cf }
            com.whatsapp.jid.Jid r4 = r0.A0E     // Catch:{ 1Tb -> 0x09cf }
            X.11F r4 = X.AnonymousClass143.A00(r4)     // Catch:{ 1Tb -> 0x09cf }
            r5.A04 = r4     // Catch:{ 1Tb -> 0x09cf }
            r5.A0F = r7     // Catch:{ 1Tb -> 0x09cf }
            java.lang.Integer r4 = r0.A0U     // Catch:{ 1Tb -> 0x09cf }
            if (r4 == 0) goto L_0x0858
            int r4 = r4.intValue()     // Catch:{ 1Tb -> 0x09cf }
        L_0x0850:
            A01(r5, r0, r4)     // Catch:{ 1Tb -> 0x09cf }
            X.9YL r5 = r5.A00()     // Catch:{ 1Tb -> 0x09cf }
            goto L_0x086f
        L_0x0858:
            r4 = 0
            goto L_0x0850
        L_0x085a:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 1Tb -> 0x09cf }
            java.lang.String r0 = "MessageUtil/validateHydratedTemplateMessage/error no content, message key="
            X.C36321k7.A1R(r0, r15, r2)     // Catch:{ 1Tb -> 0x09cf }
            X.1Tb r0 = new X.1Tb     // Catch:{ 1Tb -> 0x09cf }
            r0.<init>(r14)     // Catch:{ 1Tb -> 0x09cf }
            goto L_0x0814
        L_0x0869:
            X.1Tb r0 = new X.1Tb     // Catch:{ 1Tb -> 0x09cf }
            r0.<init>(r14)     // Catch:{ 1Tb -> 0x09cf }
            goto L_0x0814
        L_0x086f:
            X.005 r4 = r2.A0F     // Catch:{ 1Ta -> 0x0936 }
            java.lang.Object r4 = r4.get()     // Catch:{ 1Ta -> 0x0936 }
            X.0xh r4 = (X.C20520xh) r4     // Catch:{ 1Ta -> 0x0936 }
            X.3T1 r13 = r4.A00(r5)     // Catch:{ 1Ta -> 0x0936 }
            X.9nI r14 = r2.A0D     // Catch:{ 1Tb -> 0x09cf }
            X.8SO r5 = X.C170918Hz.A0N(r8)     // Catch:{ 1Tb -> 0x09cf }
            X.0yC r4 = r14.A00     // Catch:{ 1Tb -> 0x09cf }
            java.util.ArrayList r5 = X.C203099nI.A02(r4, r5)     // Catch:{ 1Tb -> 0x09cf }
            if (r5 == 0) goto L_0x088e
            java.lang.String r4 = "Receive Time"
            X.C203099nI.A03(r14, r4, r5)     // Catch:{ 1Tb -> 0x09cf }
        L_0x088e:
            X.3Qa r4 = X.C21337AHp.A00(r0)     // Catch:{ 1Tb -> 0x09cf }
            X.11F r15 = r4.A00     // Catch:{ 1Tb -> 0x09cf }
            if (r15 == 0) goto L_0x08ab
            X.0yC r14 = r2.A06     // Catch:{ 1Tb -> 0x09cf }
            X.AnonymousClass00C.A0D(r14, r7)     // Catch:{ 1Tb -> 0x09cf }
            r4 = 3609(0xe19, float:5.057E-42)
            boolean r4 = r14.A0E(r4)     // Catch:{ 1Tb -> 0x09cf }
            if (r4 == 0) goto L_0x08ab
            X.8SO r4 = r8.hydratedTemplate_     // Catch:{ 1Tb -> 0x09cf }
            if (r4 != 0) goto L_0x08f8
            X.8SO r4 = X.AnonymousClass8SO.DEFAULT_INSTANCE     // Catch:{ 1Tb -> 0x09cf }
            if (r4 != 0) goto L_0x08f8
        L_0x08ab:
            com.whatsapp.jid.Jid r4 = r0.A0E     // Catch:{ 1Tb -> 0x09cf }
            X.11F r4 = X.AnonymousClass143.A00(r4)     // Catch:{ 1Tb -> 0x09cf }
            com.whatsapp.jid.UserJid r4 = X.C222813r.A00(r4)     // Catch:{ 1Tb -> 0x09cf }
            r13.A0q(r4)     // Catch:{ 1Tb -> 0x09cf }
            java.lang.Long r4 = r0.A0f     // Catch:{ 1Tb -> 0x09cf }
            if (r4 == 0) goto L_0x08be
            r13.A0l = r4     // Catch:{ 1Tb -> 0x09cf }
        L_0x08be:
            int r4 = r0.A06     // Catch:{ 1Tb -> 0x09cf }
            r13.A0E = r4     // Catch:{ 1Tb -> 0x09cf }
            int r4 = r0.A02     // Catch:{ 1Tb -> 0x09cf }
            r13.A0m(r4)     // Catch:{ 1Tb -> 0x09cf }
            X.3ur r4 = r0.A0S     // Catch:{ 1Tb -> 0x09cf }
            r13.A0b = r4     // Catch:{ 1Tb -> 0x09cf }
            int r4 = r0.A03     // Catch:{ 1Tb -> 0x09cf }
            if (r4 == 0) goto L_0x08d2
            r13.A0j(r4)     // Catch:{ 1Tb -> 0x09cf }
        L_0x08d2:
            long r4 = r0.A07     // Catch:{ 1Tb -> 0x09cf }
            r13.A1Q = r4     // Catch:{ 1Tb -> 0x09cf }
            X.0wo r4 = r2.A01     // Catch:{ 1Tb -> 0x09cf }
            long r4 = X.C19970wo.A00(r4)     // Catch:{ 1Tb -> 0x09cf }
            r13.A0G = r4     // Catch:{ 1Tb -> 0x09cf }
            X.3ur r4 = r9.A05     // Catch:{ 1Tb -> 0x09cf }
            X.3ur r5 = r9.A04     // Catch:{ 1Tb -> 0x09cf }
            boolean r4 = X.AnonymousClass3MX.A01(r4, r5)     // Catch:{ 1Tb -> 0x09cf }
            if (r4 == 0) goto L_0x08ef
            r13.A0b = r5     // Catch:{ 1Tb -> 0x09cf }
            r4 = 4096(0x1000, float:5.74E-42)
            r13.A0j(r4)     // Catch:{ 1Tb -> 0x09cf }
        L_0x08ef:
            boolean r4 = r9.A08     // Catch:{ 1Tb -> 0x09cf }
            r13.A16 = r4     // Catch:{ 1Tb -> 0x09cf }
            X.9VC r5 = r0.A09     // Catch:{ 1Tb -> 0x09cf }
            if (r5 == 0) goto L_0x099a
            goto L_0x0933
        L_0x08f8:
            X.B6c r4 = r4.hydratedButtons_     // Catch:{ 1Tb -> 0x09cf }
            java.util.Iterator r18 = r4.iterator()     // Catch:{ 1Tb -> 0x09cf }
        L_0x08fe:
            boolean r4 = r18.hasNext()     // Catch:{ 1Tb -> 0x09cf }
            if (r4 == 0) goto L_0x08ab
            java.lang.Object r7 = r18.next()     // Catch:{ 1Tb -> 0x09cf }
            X.8SJ r7 = (X.AnonymousClass8SJ) r7     // Catch:{ 1Tb -> 0x09cf }
            int r5 = r7.hydratedButtonCase_     // Catch:{ 1Tb -> 0x09cf }
            r4 = 2
            if (r5 != r4) goto L_0x08fe
            X.8Qe r4 = r7.A0u()     // Catch:{ 1Tb -> 0x09cf }
            java.lang.String r4 = r4.url_     // Catch:{ 1Tb -> 0x09cf }
            X.AnonymousClass00C.A0B(r4)     // Catch:{ 1Tb -> 0x09cf }
            boolean r5 = X.AnonymousClass3MQ.A01(r14, r15, r4)     // Catch:{ 1Tb -> 0x09cf }
            if (r5 != 0) goto L_0x092a
            java.lang.String r5 = X.AnonymousClass3MQ.A00(r14, r15, r4)     // Catch:{ 1Tb -> 0x09cf }
            java.lang.String r4 = "webview"
            boolean r4 = r4.equals(r5)     // Catch:{ 1Tb -> 0x09cf }
            if (r4 == 0) goto L_0x08fe
        L_0x092a:
            X.3PX r5 = r2.A0C     // Catch:{ 1Tb -> 0x09cf }
            java.lang.String r4 = "marketing_msg_webview"
            r5.A02(r13, r4, r10)     // Catch:{ 1Tb -> 0x09cf }
            goto L_0x08ab
        L_0x0933:
            if (r6 == 0) goto L_0x099a
            goto L_0x0981
        L_0x0936:
            r5 = move-exception
            java.lang.String r4 = "HsmMessageHandler/failed to parse incoming HSM message."
            com.whatsapp.util.Log.e(r4, r5)     // Catch:{ 1Tb -> 0x09cf }
            X.1DL r5 = r2.A09     // Catch:{ 1Tb -> 0x09cf }
            long r7 = r0.A07     // Catch:{ 1Tb -> 0x09cf }
            X.0yC r4 = r5.A04     // Catch:{ 1Tb -> 0x09cf }
            r28 = r4
            X.0wN r4 = r5.A00     // Catch:{ 1Tb -> 0x09cf }
            r18 = r4
            X.11F r21 = X.AnonymousClass143.A00(r20)     // Catch:{ 1Tb -> 0x09cf }
            java.lang.String r13 = r0.A1C     // Catch:{ 1Tb -> 0x09cf }
            com.whatsapp.jid.Jid r0 = r0.A0E     // Catch:{ 1Tb -> 0x09cf }
            X.11F r22 = X.AnonymousClass143.A00(r0)     // Catch:{ 1Tb -> 0x09cf }
            r4 = 0
            java.lang.String r24 = "structure-unavailable"
            X.9Mb r0 = new X.9Mb     // Catch:{ 1Tb -> 0x09cf }
            r20 = r0
            r23 = r13
            r25 = r7
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ 1Tb -> 0x09cf }
            long r13 = r0.A00     // Catch:{ 1Tb -> 0x09cf }
            java.lang.String r15 = r0.A04     // Catch:{ 1Tb -> 0x09cf }
            java.lang.String r22 = "message"
            java.lang.String r23 = "error-receipt"
            r27 = 1
            r20 = r18
            r21 = r28
            r24 = r15
            r25 = r13
            X.C203429o0.A0B(r20, r21, r22, r23, r24, r25, r27)     // Catch:{ 1Tb -> 0x09cf }
            r13 = 431(0x1af, float:6.04E-43)
            android.os.Message r0 = android.os.Message.obtain(r4, r10, r13, r10, r0)     // Catch:{ 1Tb -> 0x09cf }
            X.AnonymousClass1DL.A04(r0, r5, r7)     // Catch:{ 1Tb -> 0x09cf }
            goto L_0x09c4
        L_0x0981:
            X.1El r4 = r2.A0E     // Catch:{ 1Tb -> 0x09cf }
            X.8n0 r5 = r4.A00(r5, r6, r13)     // Catch:{ 1Tb -> 0x09cf }
            if (r5 == 0) goto L_0x099a
            X.1CF r7 = r2.A07     // Catch:{ 1Tb -> 0x09cf }
            X.3Qa r4 = r13.A1J     // Catch:{ 1Tb -> 0x09cf }
            X.11F r4 = r4.A00     // Catch:{ 1Tb -> 0x09cf }
            boolean r4 = r7.A02(r4)     // Catch:{ 1Tb -> 0x09cf }
            if (r4 != 0) goto L_0x099a
            X.0xM r4 = r2.A03     // Catch:{ 1Tb -> 0x09cf }
            r4.A0P(r5)     // Catch:{ 1Tb -> 0x09cf }
        L_0x099a:
            X.0xM r4 = r2.A03     // Catch:{ 1Tb -> 0x09cf }
            r4.A0P(r13)     // Catch:{ 1Tb -> 0x09cf }
            X.1Hu r14 = r2.A04     // Catch:{ 1Tb -> 0x09cf }
            X.8SO r4 = X.C170918Hz.A0N(r8)     // Catch:{ 1Tb -> 0x09cf }
            java.lang.String r10 = r4.templateId_     // Catch:{ 1Tb -> 0x09cf }
            X.1C7 r7 = r14.A00     // Catch:{ 1Tb -> 0x09cf }
            r5 = 4
            X.1im r4 = new X.1im     // Catch:{ 1Tb -> 0x09cf }
            r4.<init>(r14, r13, r10, r5)     // Catch:{ 1Tb -> 0x09cf }
            r5 = 48
            r7.A01(r4, r5)     // Catch:{ 1Tb -> 0x09cf }
            X.1EP r7 = r2.A05     // Catch:{ 1Tb -> 0x09cf }
            X.8SO r4 = X.C170918Hz.A0N(r8)     // Catch:{ 1Tb -> 0x09cf }
            java.lang.String r5 = r4.templateId_     // Catch:{ 1Tb -> 0x09cf }
            java.lang.String r4 = r0.A0q     // Catch:{ 1Tb -> 0x09cf }
            r7.A01(r13, r5, r4)     // Catch:{ 1Tb -> 0x09cf }
            X.C198309dF.A00(r2, r13, r0)     // Catch:{ 1Tb -> 0x09cf }
        L_0x09c4:
            int r0 = r9.A03     // Catch:{ 1Tb -> 0x09cf }
            if (r0 == r12) goto L_0x0c16
            X.0xM r0 = r2.A03     // Catch:{ 1Tb -> 0x09cf }
            r0.A0c(r6, r9)     // Catch:{ 1Tb -> 0x09cf }
            goto L_0x0c16
        L_0x09cf:
            r0 = move-exception
            java.lang.Integer r0 = r0.e2eFailureReason     // Catch:{ Exception -> 0x13e4 }
            int r2 = r0.intValue()     // Catch:{ Exception -> 0x13e4 }
            X.AAF r0 = r11.A00     // Catch:{ Exception -> 0x13e4 }
            A02(r0, r2)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x0c16
        L_0x09dd:
            if (r13 == 0) goto L_0x0b97
            X.8SL r4 = r3.templateMessage_     // Catch:{ Exception -> 0x13e4 }
            r8 = r4
            if (r4 != 0) goto L_0x09e6
            X.8SL r4 = X.AnonymousClass8SL.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x09e6:
            int r4 = r4.formatCase_     // Catch:{ Exception -> 0x13e4 }
            r5 = 5
            if (r4 != r5) goto L_0x0b97
            if (r8 != 0) goto L_0x09ef
            X.8SL r8 = X.AnonymousClass8SL.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x09ef:
            int r4 = r8.formatCase_     // Catch:{ Exception -> 0x13e4 }
            if (r4 != r5) goto L_0x09fa
            java.lang.Object r4 = r8.format_     // Catch:{ Exception -> 0x13e4 }
            X.8SV r4 = (X.AnonymousClass8SV) r4     // Catch:{ Exception -> 0x13e4 }
        L_0x09f7:
            int r5 = r4.interactiveMessageCase_     // Catch:{ Exception -> 0x13e4 }
            goto L_0x09fd
        L_0x09fa:
            X.8SV r4 = X.AnonymousClass8SV.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
            goto L_0x09f7
        L_0x09fd:
            r4 = 7
            boolean r15 = X.AnonymousClass000.A1S(r5, r4)
            java.lang.String r8 = "carousel_message_receive_tag"
            if (r15 == 0) goto L_0x0a12
            X.3GO r9 = r2.A0A     // Catch:{ Exception -> 0x13e4 }
            r5 = 238883000(0xe3d10b8, float:2.3304098E-30)
            java.lang.String r4 = X.C90484aE.A0k(r2)     // Catch:{ Exception -> 0x13e4 }
            r9.A00(r5, r8, r4)     // Catch:{ Exception -> 0x13e4 }
        L_0x0a12:
            X.005 r4 = r2.A0G     // Catch:{ 1Tb -> 0x0b81 }
            java.lang.Object r4 = r4.get()     // Catch:{ 1Tb -> 0x0b81 }
            X.1am r4 = (X.C30791am) r4     // Catch:{ 1Tb -> 0x0b81 }
            X.9Yd r5 = r4.A01(r3)     // Catch:{ 1Tb -> 0x0b81 }
            if (r5 == 0) goto L_0x0a28
            X.0yC r4 = r2.A06     // Catch:{ 1Tb -> 0x0b81 }
            boolean r4 = r5.A0C(r4, r3)     // Catch:{ 1Tb -> 0x0b81 }
            if (r4 != 0) goto L_0x0aef
        L_0x0a28:
            boolean r4 = r0.A0z     // Catch:{ 1Tb -> 0x0b81 }
            if (r4 != 0) goto L_0x0aef
            X.9nM r4 = r2.A0B     // Catch:{ 1Tb -> 0x0b81 }
            X.3Qa r22 = X.C21337AHp.A00(r0)     // Catch:{ 1Tb -> 0x0b81 }
            long r12 = r0.A18     // Catch:{ 1Tb -> 0x0b81 }
            java.lang.String r9 = r0.A0r     // Catch:{ 1Tb -> 0x0b81 }
            r14 = 4194304(0x400000, float:5.877472E-39)
            int r5 = r0.A03     // Catch:{ 1Tb -> 0x0b81 }
            r5 = r5 & r14
            boolean r29 = X.AnonymousClass000.A1S(r5, r14)     // Catch:{ 1Tb -> 0x0b81 }
            int r5 = r0.A01     // Catch:{ 1Tb -> 0x0b81 }
            r27 = 0
            r28 = 0
            r20 = r4
            r21 = r3
            r23 = r9
            r24 = r5
            r25 = r12
            X.3T1 r9 = r20.A03(r21, r22, r23, r24, r25, r27, r28, r29)     // Catch:{ 1Tb -> 0x0b81 }
            boolean r5 = r9 instanceof X.C23043B1o     // Catch:{ 1Tb -> 0x0b81 }
            if (r5 == 0) goto L_0x0a79
            boolean r5 = r3.A10()     // Catch:{ 1Tb -> 0x0b81 }
            if (r5 == 0) goto L_0x0a79
            X.8SL r5 = r3.templateMessage_     // Catch:{ 1Tb -> 0x0b81 }
            r13 = r5
            if (r5 != 0) goto L_0x0a64
            X.8SL r5 = X.AnonymousClass8SL.DEFAULT_INSTANCE     // Catch:{ 1Tb -> 0x0b81 }
        L_0x0a64:
            int r5 = r5.bitField0_     // Catch:{ 1Tb -> 0x0b81 }
            r5 = r5 & 32
            if (r5 == 0) goto L_0x0a79
            r5 = r9
            X.B1o r5 = (X.C23043B1o) r5     // Catch:{ 1Tb -> 0x0b81 }
            X.9uk r12 = r5.BA8()     // Catch:{ 1Tb -> 0x0b81 }
            if (r13 != 0) goto L_0x0a75
            X.8SL r13 = X.AnonymousClass8SL.DEFAULT_INSTANCE     // Catch:{ 1Tb -> 0x0b81 }
        L_0x0a75:
            java.lang.String r5 = r13.templateId_     // Catch:{ 1Tb -> 0x0b81 }
            r12.A0B = r5     // Catch:{ 1Tb -> 0x0b81 }
        L_0x0a79:
            boolean r5 = r3.A10()     // Catch:{ 1Tb -> 0x0b81 }
            if (r5 == 0) goto L_0x0b09
            X.8SL r5 = r3.templateMessage_     // Catch:{ 1Tb -> 0x0b81 }
            r12 = r5
            if (r5 != 0) goto L_0x0a86
            X.8SL r5 = X.AnonymousClass8SL.DEFAULT_INSTANCE     // Catch:{ 1Tb -> 0x0b81 }
        L_0x0a86:
            int r5 = r5.bitField0_     // Catch:{ 1Tb -> 0x0b81 }
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0b09
            if (r12 != 0) goto L_0x0a90
            X.8SL r12 = X.AnonymousClass8SL.DEFAULT_INSTANCE     // Catch:{ 1Tb -> 0x0b81 }
        L_0x0a90:
            X.8SG r12 = r12.contextInfo_     // Catch:{ 1Tb -> 0x0b81 }
            if (r12 != 0) goto L_0x0a96
            X.8SG r12 = X.AnonymousClass8SG.DEFAULT_INSTANCE     // Catch:{ 1Tb -> 0x0b81 }
        L_0x0a96:
            X.0yC r5 = r4.A02     // Catch:{ 1Tb -> 0x0b81 }
            r4 = 5869(0x16ed, float:8.224E-42)
            boolean r4 = r5.A0E(r4)     // Catch:{ 1Tb -> 0x0b81 }
            if (r4 == 0) goto L_0x0b09
            int r5 = r12.bitField0_     // Catch:{ 1Tb -> 0x0b81 }
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r5 = r5 & r4
            if (r5 == 0) goto L_0x0b09
            X.8Nf r4 = r12.dataSharingContext_     // Catch:{ 1Tb -> 0x0b81 }
            r5 = r4
            if (r4 != 0) goto L_0x0aae
            X.8Nf r4 = X.C172278Nf.DEFAULT_INSTANCE     // Catch:{ 1Tb -> 0x0b81 }
        L_0x0aae:
            int r4 = r4.bitField0_     // Catch:{ 1Tb -> 0x0b81 }
            r4 = r4 & 1
            if (r4 == 0) goto L_0x0b09
            if (r5 != 0) goto L_0x0ab8
            X.8Nf r5 = X.C172278Nf.DEFAULT_INSTANCE     // Catch:{ 1Tb -> 0x0b81 }
        L_0x0ab8:
            boolean r4 = r5.showMmDisclosure_     // Catch:{ 1Tb -> 0x0b81 }
            X.3Hb r12 = new X.3Hb     // Catch:{ 1Tb -> 0x0b81 }
            r12.<init>(r4)     // Catch:{ 1Tb -> 0x0b81 }
            r9.A0v(r12)     // Catch:{ 1Tb -> 0x0b81 }
            r5 = 64
            r9.A0h(r5)     // Catch:{ 1Tb -> 0x0b81 }
            boolean r4 = r9 instanceof X.AnonymousClass2bZ     // Catch:{ 1Tb -> 0x0b81 }
            if (r4 == 0) goto L_0x0b09
            r4 = r9
            X.2bZ r4 = (X.AnonymousClass2bZ) r4     // Catch:{ 1Tb -> 0x0b81 }
            java.util.List r13 = r4.A1X()     // Catch:{ 1Tb -> 0x0b81 }
            if (r13 == 0) goto L_0x0b09
            boolean r4 = r13.isEmpty()     // Catch:{ 1Tb -> 0x0b81 }
            if (r4 != 0) goto L_0x0b09
            java.util.Iterator r13 = r13.iterator()     // Catch:{ 1Tb -> 0x0b81 }
        L_0x0ade:
            boolean r4 = r13.hasNext()     // Catch:{ 1Tb -> 0x0b81 }
            if (r4 == 0) goto L_0x0b09
            X.3T1 r4 = X.C36391kE.A0l(r13)     // Catch:{ 1Tb -> 0x0b81 }
            r4.A0v(r12)     // Catch:{ 1Tb -> 0x0b81 }
            r4.A0h(r5)     // Catch:{ 1Tb -> 0x0b81 }
            goto L_0x0ade
        L_0x0aef:
            X.3Qa r21 = X.C21337AHp.A00(r0)     // Catch:{ 1Tb -> 0x0b81 }
            long r4 = r0.A18     // Catch:{ 1Tb -> 0x0b81 }
            byte[] r22 = r3.A0o()     // Catch:{ 1Tb -> 0x0b81 }
            r23 = 2
            int r12 = r0.A01     // Catch:{ 1Tb -> 0x0b81 }
            X.2bK r9 = new X.2bK     // Catch:{ 1Tb -> 0x0b81 }
            r20 = r9
            r24 = r12
            r25 = r4
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ 1Tb -> 0x0b81 }
            goto L_0x0b1b
        L_0x0b09:
            boolean r4 = r9 instanceof X.AnonymousClass2bZ     // Catch:{ 1Tb -> 0x0b81 }
            if (r4 == 0) goto L_0x0b1b
            com.whatsapp.jid.UserJid r13 = X.C222813r.A00(r6)     // Catch:{ 1Tb -> 0x0b81 }
            r12 = r9
            X.2bZ r12 = (X.AnonymousClass2bZ) r12     // Catch:{ 1Tb -> 0x0b81 }
            X.9Ud r5 = r2.A00     // Catch:{ 1Tb -> 0x0b81 }
            X.0wG r4 = r2.A02     // Catch:{ 1Tb -> 0x0b81 }
            A00(r5, r4, r13, r12)     // Catch:{ 1Tb -> 0x0b81 }
        L_0x0b1b:
            r0.A0P = r9     // Catch:{ 1Tb -> 0x0b81 }
            X.3ur r4 = r0.A0S     // Catch:{ 1Tb -> 0x0b81 }
            r9.A0b = r4     // Catch:{ 1Tb -> 0x0b81 }
            X.9VC r5 = r0.A09     // Catch:{ 1Tb -> 0x0b81 }
            if (r5 == 0) goto L_0x0b40
            if (r6 == 0) goto L_0x0b40
            X.1El r4 = r2.A0E     // Catch:{ 1Tb -> 0x0b81 }
            X.8n0 r5 = r4.A00(r5, r6, r9)     // Catch:{ 1Tb -> 0x0b81 }
            if (r5 == 0) goto L_0x0b40
            X.1CF r6 = r2.A07     // Catch:{ 1Tb -> 0x0b81 }
            X.3Qa r4 = r9.A1J     // Catch:{ 1Tb -> 0x0b81 }
            X.11F r4 = r4.A00     // Catch:{ 1Tb -> 0x0b81 }
            boolean r4 = r6.A02(r4)     // Catch:{ 1Tb -> 0x0b81 }
            if (r4 != 0) goto L_0x0b40
            X.0xM r4 = r2.A03     // Catch:{ 1Tb -> 0x0b81 }
            r4.A0P(r5)     // Catch:{ 1Tb -> 0x0b81 }
        L_0x0b40:
            X.0wo r4 = r2.A01     // Catch:{ 1Tb -> 0x0b81 }
            long r4 = X.C19970wo.A00(r4)     // Catch:{ 1Tb -> 0x0b81 }
            r9.A0G = r4     // Catch:{ 1Tb -> 0x0b81 }
            X.1aQ r4 = r2.A08     // Catch:{ 1Tb -> 0x0b81 }
            X.C30571aQ.A00(r4, r9, r0)     // Catch:{ 1Tb -> 0x0b81 }
            X.1Hu r13 = r2.A04     // Catch:{ 1Tb -> 0x0b81 }
            X.8SL r4 = r3.templateMessage_     // Catch:{ 1Tb -> 0x0b81 }
            if (r4 != 0) goto L_0x0b55
            X.8SL r4 = X.AnonymousClass8SL.DEFAULT_INSTANCE     // Catch:{ 1Tb -> 0x0b81 }
        L_0x0b55:
            java.lang.String r12 = r4.templateId_     // Catch:{ 1Tb -> 0x0b81 }
            X.1C7 r6 = r13.A00     // Catch:{ 1Tb -> 0x0b81 }
            r4 = 4
            X.1im r5 = new X.1im     // Catch:{ 1Tb -> 0x0b81 }
            r5.<init>(r13, r9, r12, r4)     // Catch:{ 1Tb -> 0x0b81 }
            r4 = 48
            r6.A01(r5, r4)     // Catch:{ 1Tb -> 0x0b81 }
            X.1EP r6 = r2.A05     // Catch:{ 1Tb -> 0x0b81 }
            X.8SL r4 = r3.templateMessage_     // Catch:{ 1Tb -> 0x0b81 }
            if (r4 != 0) goto L_0x0b6c
            X.8SL r4 = X.AnonymousClass8SL.DEFAULT_INSTANCE     // Catch:{ 1Tb -> 0x0b81 }
        L_0x0b6c:
            java.lang.String r5 = r4.templateId_     // Catch:{ 1Tb -> 0x0b81 }
            java.lang.String r4 = r0.A0q     // Catch:{ 1Tb -> 0x0b81 }
            r6.A01(r9, r5, r4)     // Catch:{ 1Tb -> 0x0b81 }
            if (r15 == 0) goto L_0x0b7c
            X.3GO r5 = r2.A0A     // Catch:{ 1Tb -> 0x0b81 }
            X.3Qa r4 = r9.A1J     // Catch:{ 1Tb -> 0x0b81 }
            r5.A01(r4, r8, r7)     // Catch:{ 1Tb -> 0x0b81 }
        L_0x0b7c:
            X.C198309dF.A00(r2, r9, r0)     // Catch:{ 1Tb -> 0x0b81 }
            goto L_0x0c16
        L_0x0b81:
            r4 = move-exception
            if (r15 == 0) goto L_0x0b8a
            X.3GO r2 = r2.A0A     // Catch:{ Exception -> 0x13e4 }
            r0 = 0
            r2.A01(r0, r8, r10)     // Catch:{ Exception -> 0x13e4 }
        L_0x0b8a:
            java.lang.Integer r0 = r4.e2eFailureReason     // Catch:{ Exception -> 0x13e4 }
            int r2 = r0.intValue()     // Catch:{ Exception -> 0x13e4 }
            X.AAF r0 = r11.A00     // Catch:{ Exception -> 0x13e4 }
            A02(r0, r2)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x0c16
        L_0x0b97:
            X.3lV r4 = X.C74373lV.A00     // Catch:{ Exception -> 0x13e4 }
            X.3T1 r0 = r0.A01(r4)     // Catch:{ Exception -> 0x13e4 }
            if (r0 == 0) goto L_0x0ba7
            X.0wo r4 = r2.A01     // Catch:{ Exception -> 0x13e4 }
            long r4 = X.C19970wo.A00(r4)     // Catch:{ Exception -> 0x13e4 }
            r0.A0G = r4     // Catch:{ Exception -> 0x13e4 }
        L_0x0ba7:
            X.0xM r5 = r2.A03     // Catch:{ Exception -> 0x13e4 }
            r5.A0P(r0)     // Catch:{ Exception -> 0x13e4 }
            int r4 = r9.A03     // Catch:{ Exception -> 0x13e4 }
            if (r4 == r12) goto L_0x0bb3
            r5.A0c(r6, r9)     // Catch:{ Exception -> 0x13e4 }
        L_0x0bb3:
            X.1DL r10 = r2.A09     // Catch:{ Exception -> 0x13e4 }
            int r5 = r0.A1I     // Catch:{ Exception -> 0x13e4 }
            r2 = 19
            if (r5 == r2) goto L_0x0bd7
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = "ReadReceipts"
            r4.append(r2)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = "/sendHsmEnvelopeMismatchReceipt skipping permanent failure receipt due to wrong type. type="
            r4.append(r2)     // Catch:{ Exception -> 0x13e4 }
            r4.append(r5)     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = " key="
            r4.append(r2)     // Catch:{ Exception -> 0x13e4 }
            X.3Qa r0 = r0.A1J     // Catch:{ Exception -> 0x13e4 }
            X.C36321k7.A1N(r0, r4)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x0c16
        L_0x0bd7:
            long r4 = r0.A1Q     // Catch:{ Exception -> 0x13e4 }
            X.0yC r9 = r10.A04     // Catch:{ Exception -> 0x13e4 }
            X.0wN r8 = r10.A00     // Catch:{ Exception -> 0x13e4 }
            X.3Qa r2 = r0.A1J     // Catch:{ Exception -> 0x13e4 }
            X.11F r7 = r2.A00     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r6 = r2.A01     // Catch:{ Exception -> 0x13e4 }
            X.11F r22 = r0.A0J()     // Catch:{ Exception -> 0x13e4 }
            r2 = 0
            java.lang.String r24 = "hsm-envelope-mismatch"
            X.9Mb r0 = new X.9Mb     // Catch:{ Exception -> 0x13e4 }
            r20 = r0
            r21 = r7
            r23 = r6
            r25 = r4
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x13e4 }
            long r6 = r0.A00     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r11 = r0.A04     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r22 = "message"
            java.lang.String r23 = "error-receipt"
            r27 = 1
            r20 = r8
            r21 = r9
            r24 = r11
            r25 = r6
            X.C203429o0.A0B(r20, r21, r22, r23, r24, r25, r27)     // Catch:{ Exception -> 0x13e4 }
            r7 = 0
            r6 = 431(0x1af, float:6.04E-43)
            android.os.Message r0 = android.os.Message.obtain(r2, r7, r6, r7, r0)     // Catch:{ Exception -> 0x13e4 }
            X.AnonymousClass1DL.A04(r0, r10, r4)     // Catch:{ Exception -> 0x13e4 }
        L_0x0c16:
            r0 = r19 & 1
            goto L_0x12e4
        L_0x0c1a:
            int r2 = r24.size()     // Catch:{ Exception -> 0x13e4 }
            if (r2 != r7) goto L_0x12e6
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = "DecryptionCallbackV2/regular message, jid: "
            X.C36321k7.A1K(r8, r2, r4)     // Catch:{ Exception -> 0x13e4 }
            r0.A0L = r3     // Catch:{ Exception -> 0x13e4 }
            r6 = 0
            X.005 r2 = r1.A0m     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.Object r5 = r2.get()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.1am r5 = (X.C30791am) r5     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.12q r4 = r1.A0F     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.11F r2 = r1.A0S     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r2 = X.C202839mk.A04(r5, r4, r12, r2, r3)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r2 != 0) goto L_0x114e
            boolean r2 = r0.A0z     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r2 != 0) goto L_0x114e
            X.1c0 r2 = r1.A0g     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.8SG r10 = r2.A00(r3)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r10 == 0) goto L_0x0c99
            int r2 = r10.bitField0_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0c99
            X.3Qa r2 = r0.A0Q     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.11F r5 = r2.A00     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r4 = r2.A02     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.8SW r2 = r10.placeholderKey_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r2 != 0) goto L_0x0c5c
            X.8SW r2 = X.AnonymousClass8SW.DEFAULT_INSTANCE     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0c5c:
            java.lang.String r2 = r2.id_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.3Qa r5 = X.C165617ti.A0R(r5, r2, r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.1A1 r2 = r1.A0j     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.3T1 r11 = r2.A03(r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r11 == 0) goto L_0x0c99
            int r4 = r11.A1I     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2 = 31
            if (r4 != r2) goto L_0x0c99
            com.whatsapp.jid.UserJid r4 = r11.A0L()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            com.whatsapp.jid.UserJid r2 = r0.BHK()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r2 = X.C1901797e.A00(r4, r2)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r2 == 0) goto L_0x0c99
            java.lang.String r2 = "DecryptionCallbackV2/placeholder message"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r5 = r5.A01     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r2 != 0) goto L_0x0c99
            X.3Qa r2 = X.C21337AHp.A00(r0)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.11F r4 = r2.A00     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r2 = r2.A02     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.3Qa r2 = X.C165617ti.A0R(r4, r5, r2)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r0.A0R = r2     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0c99:
            X.3Qa r2 = X.C21337AHp.A00(r0)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            long r4 = r0.A18     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.9T0 r5 = X.C1899296d.A00(r3, r2, r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.9lY r2 = r0.A0C     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r5.A03 = r2     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            com.whatsapp.jid.Jid r2 = r0.A0E     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.11F r2 = X.AnonymousClass143.A00(r2)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r5.A04 = r2     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r5.A0F = r7     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.Integer r2 = r0.A0U     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r2 == 0) goto L_0x0cf8
            int r2 = r2.intValue()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0cb9:
            A01(r5, r0, r2)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4 = 4194304(0x400000, float:5.877472E-39)
            int r2 = r0.A03     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2 = r2 & r4
            boolean r2 = X.AnonymousClass000.A1S(r2, r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r5.A0H = r2     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.9YL r4 = r5.A00()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.0xh r2 = r1.A0P     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.3T1 r2 = r2.A00(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r0.A02(r2)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.8Ri r5 = r3.messageContextInfo_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r11 = r5
            if (r5 != 0) goto L_0x0cdd
            X.8Ri r5 = X.C173348Ri.DEFAULT_INSTANCE     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r5 == 0) goto L_0x0d6a
        L_0x0cdd:
            int r4 = r5.bitField0_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4 = r4 & 1
            if (r4 == 0) goto L_0x0d6a
            X.8Rq r4 = r5.deviceListMetadata_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x0ce9
            X.8Rq r4 = X.C173428Rq.DEFAULT_INSTANCE     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0ce9:
            int r4 = r4.senderAccountType_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.2q9 r4 = X.C52772q9.A00(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x0cf3
            X.2q9 r4 = X.C52772q9.E2EE     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0cf3:
            X.2q9 r5 = X.C52772q9.HOSTED     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != r5) goto L_0x0d6a
            goto L_0x0cfa
        L_0x0cf8:
            r2 = 0
            goto L_0x0cb9
        L_0x0cfa:
            if (r11 != 0) goto L_0x0d00
            X.8Ri r11 = X.C173348Ri.DEFAULT_INSTANCE     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r11 == 0) goto L_0x0d17
        L_0x0d00:
            X.8Rq r4 = r11.deviceListMetadata_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x0d08
            X.8Rq r4 = X.C173428Rq.DEFAULT_INSTANCE     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0d17
        L_0x0d08:
            int r4 = r4.senderAccountType_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.2q9 r4 = X.C52772q9.A00(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0d17
            if (r4 != r5) goto L_0x0d17
            r4 = 134217728(0x8000000, float:3.85186E-34)
            r2.A0j(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0d17:
            X.1OD r12 = r1.A0K     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.8Ri r14 = r3.messageContextInfo_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r14 != 0) goto L_0x0d1f
            X.8Ri r14 = X.C173348Ri.DEFAULT_INSTANCE     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0d1f:
            int r4 = r14.bitField0_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4 = r4 & 1
            if (r4 == 0) goto L_0x0d36
            X.8Rq r4 = r14.deviceListMetadata_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x0d2b
            X.8Rq r4 = X.C173428Rq.DEFAULT_INSTANCE     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0d2b:
            int r4 = r4.senderAccountType_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.2q9 r4 = X.C52772q9.A00(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0d36
            r11 = 1
            if (r4 == r5) goto L_0x0d37
        L_0x0d36:
            r11 = 0
        L_0x0d37:
            X.C18740tg.A0B(r11)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            com.whatsapp.jid.UserJid r13 = r2.A0L()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.0wQ r4 = r12.A02     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r4 = r4.A0M(r13)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x0d6a
            X.17i r11 = r12.A0B     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.2q9 r5 = r11.A06(r13)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.2q9 r4 = X.C52772q9.E2EE     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r5 != r4) goto L_0x0d6a
            long r19 = r11.A01(r13)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.8Rq r4 = r14.deviceListMetadata_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x0d5a
            X.8Rq r4 = X.C173428Rq.DEFAULT_INSTANCE     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0d5a:
            long r4 = r4.senderTimestamp_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            int r11 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r11 <= 0) goto L_0x0d6a
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r2.A0j(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.1Ek r4 = r12.A0A     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4.A00(r2)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0d6a:
            boolean r4 = r0.A0y     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0e10
            X.3Ty r13 = r1.A0Q     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r5 = r0.A0g     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4 = 0
            if (r10 == 0) goto L_0x0d81
            int r11 = r10.bitField0_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r11 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x0d81
            X.AUx r4 = r10.ephemeralSharedSecret_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            byte[] r4 = r4.A06()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0d81:
            if (r5 == 0) goto L_0x0d8d
            if (r4 == 0) goto L_0x0d86
            goto L_0x0d91
        L_0x0d86:
            X.91g r2 = new X.91g     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2.<init>(r7)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x114d
        L_0x0d8d:
            if (r4 == 0) goto L_0x0e10
            goto L_0x113f
        L_0x0d91:
            int r11 = r0.BGp()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r11 != 0) goto L_0x1139
            int r12 = r4.length     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r11 = 32
            if (r12 != r11) goto L_0x1133
            com.whatsapp.jid.Jid r11 = r0.BHI()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.AnonymousClass00C.A0D(r11, r6)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r12 = X.AnonymousClass143.A0I(r11)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.0wQ r11 = r13.A01     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r12 == 0) goto L_0x0eed
            X.13w r13 = r11.A09()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0daf:
            X.AnonymousClass00C.A08(r13)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            com.whatsapp.jid.Jid r11 = r0.A0E     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            android.os.Parcelable$Creator r12 = X.C177538dx.CREATOR     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r12 = r11 instanceof X.C177538dx     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r12 == 0) goto L_0x0eea
            X.8dx r11 = (X.C177538dx) r11     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0dbe:
            X.C18740tg.A06(r11)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r21 = r13.getRawString()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r22 = r8.getRawString()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r23 = 0
            java.lang.String r25 = r11.getRawString()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r19 = 1
            r20 = r5
            r24 = r4
            java.lang.Object r5 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOOOOO(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            com.facebook.simplejni.NativeHolder r5 = (com.facebook.simplejni.NativeHolder) r5     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r5 == 0) goto L_0x112d
            X.9Fk r4 = new X.9Fk     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4.<init>(r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            com.facebook.simplejni.NativeHolder r11 = r4.A00     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4 = 50
            long r4 = (long) r4     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            long r4 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r7, r4, r11)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            int r12 = (int) r4     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4 = 51
            long r4 = (long) r4     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r13 = 2
            long r4 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r13, r4, r11)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r13
            X.3un r11 = new X.3un     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r11.<init>(r12, r4, r6)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            int r4 = r11.expiration     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2.A0m(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            long r4 = r11.ephemeralSettingTimestamp     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2.A15(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0e10:
            X.9VC r11 = r0.A09     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r11 == 0) goto L_0x0e44
            X.1El r5 = r1.A0l     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            com.whatsapp.jid.UserJid r4 = r0.BHK()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.8n0 r5 = r5.A00(r11, r4, r2)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r5 == 0) goto L_0x0e31
            X.1CF r12 = r1.A0R     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.3Qa r4 = r2.A1J     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.11F r4 = r4.A00     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r4 = r12.A02(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x0e31
            X.0xM r4 = r1.A0G     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4.A0P(r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0e31:
            int r4 = r11.A00     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != r7) goto L_0x0e44
            X.1CF r5 = r1.A0R     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4 = r18
            boolean r4 = r5.A02(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0e44
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r2.A0j(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0e44:
            X.9X8 r13 = r0.A0A     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r13 == 0) goto L_0x0e81
            java.lang.String r12 = r13.A04     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r5 = r13.A02     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r5 == 0) goto L_0x0e5b
            int r4 = r5.length()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0e5b
            int r4 = r5.hashCode()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            switch(r4) {
                case 3314326: goto L_0x0ec8;
                case 97440432: goto L_0x0ed3;
                case 100355670: goto L_0x0ede;
                default: goto L_0x0e5b;
            }     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0e5b:
            X.2of r11 = X.C51962of.FULL     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0e5d:
            com.whatsapp.jid.UserJid r5 = r13.A01     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.3Kf r4 = new X.3Kf     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4.<init>(r5, r11, r12)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2.A0r(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.1Zh r12 = r1.A0W     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            com.whatsapp.jid.Jid r4 = r0.A19     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.11F r11 = X.AnonymousClass143.A00(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r5 = r13.A02     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r4 = "first"
            boolean r4 = r4.equals(r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x0e8b
            java.lang.String r4 = "inner"
            boolean r4 = r4.equals(r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x0e8b
        L_0x0e81:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r4 = "DecryptionCallbackV2/FMessage="
            X.C36321k7.A1K(r2, r4, r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x0ef3
        L_0x0e8b:
            X.3T1 r4 = r12.A00(r13, r11)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0ebf
            boolean r5 = r4.A1I()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r5 == 0) goto L_0x0ebf
            X.00b r5 = r12.A01     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            byte[] r4 = r4.A1b     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.9Fi r4 = r5.WCMMessageSecretAPICreateWithSerialized(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x0ea7
            java.lang.String r4 = "MessageSecretMessageDecryptionManager/getBotMessageSecretForFirstOrInnerBotMessage/messageSecret is null"
        L_0x0ea3:
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x0e81
        L_0x0ea7:
            X.9Fj r4 = r5.WcmBotMessageSecretAPICreateWithMessageSecret(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x0eb0
            java.lang.String r4 = "MessageSecretMessageDecryptionManager/getBotMessageSecretForFirstOrInnerBotMessage/botMessageSecret is null"
            goto L_0x0ea3
        L_0x0eb0:
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            com.facebook.simplejni.NativeHolder r11 = r4.A00     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4 = 85
            long r4 = (long) r4     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.Object r4 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r6, r4, r11)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            byte[] r4 = (byte[]) r4     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x0ec3
        L_0x0ebf:
            byte[] r4 = r12.A02(r13, r11)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0ec3:
            if (r4 == 0) goto L_0x0e81
            r2.A1b = r4     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x0e81
        L_0x0ec8:
            java.lang.String r4 = "last"
            boolean r4 = r5.equals(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0e5b
            X.2of r11 = X.C51962of.LAST     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x0e5d
        L_0x0ed3:
            java.lang.String r4 = "first"
            boolean r4 = r5.equals(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0e5b
            X.2of r11 = X.C51962of.FIRST     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x0e5d
        L_0x0ede:
            java.lang.String r4 = "inner"
            boolean r4 = r5.equals(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0e5b
            X.2of r11 = X.C51962of.INNER     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x0e5d
        L_0x0eea:
            r11 = 0
            goto L_0x0dbe
        L_0x0eed:
            com.whatsapp.jid.PhoneUserJid r13 = X.C36371kC.A0e(r11)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x0daf
        L_0x0ef3:
            if (r10 == 0) goto L_0x0f0b
            int r4 = r10.bitField0_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0f0b
            X.3Qa r5 = X.C21337AHp.A00(r0)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.3Qa r4 = r0.A0Q     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r4 = r5.equals(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x0f0b
            X.3Qa r4 = r0.A0Q     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2.A0Y = r4     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0f0b:
            X.3T1 r5 = r2.A0S()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r5 == 0) goto L_0x0f16
            X.1Ed r4 = r1.A0I     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4.A0X(r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0f16:
            boolean r4 = r2 instanceof X.AnonymousClass2bZ     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0f30
            r10 = r2
            X.2bZ r10 = (X.AnonymousClass2bZ) r10     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.9Ud r5 = r1.A07     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.0wG r4 = r1.A0C     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            A00(r5, r4, r8, r10)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0f24:
            X.1EV r4 = r1.A0e     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r4 = r4.A03()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x0fc0
            X.1XB r5 = r1.A0d     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            monitor-enter(r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x0f48
        L_0x0f30:
            boolean r4 = r2 instanceof X.AnonymousClass2bE     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0f24
            X.3Qa r5 = r2.A1J     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r4 = r5.A02     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0f24
            X.11F r5 = r5.A00     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r4 = r5 instanceof X.C223313w     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0f24
            X.1FV r4 = r1.A0J     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.13w r5 = (X.C223313w) r5     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4.A08(r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x0f24
        L_0x0f48:
            boolean r4 = r5.A01     // Catch:{ all -> 0x0f8c }
            monitor-exit(r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x0fc0
            X.9lY r10 = r0.A0C     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r10 == 0) goto L_0x0fc0
            monitor-enter(r10)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            int r11 = r10.A03     // Catch:{ all -> 0x112a }
            r4 = 2
            if (r11 == r4) goto L_0x0f60
            r4 = 20
            if (r11 == r4) goto L_0x0f60
            r8 = 200(0xc8, float:2.8E-43)
            r4 = 0
            if (r11 != r8) goto L_0x0f61
        L_0x0f60:
            r4 = 1
        L_0x0f61:
            monitor-exit(r10)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0fc0
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r4 = "DecryptionCallbackV2/PAY: received payment message with payments not enabled: "
            r8.append(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.3Qa r4 = X.C21337AHp.A00(r0)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r8.append(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.C36421kH.A1N(r8)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.9lY r4 = r0.A0C     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r4 = r4.A0K     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r8.append(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r4 = "; getting server props"
            X.C36321k7.A1a(r8, r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.1C4 r4 = r1.A0Y     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4.A05(r6)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            monitor-enter(r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r5.A01 = r7     // Catch:{ all -> 0x0f8c }
            goto L_0x0f90
        L_0x0f8c:
            r2 = move-exception
            monitor-exit(r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x114d
        L_0x0f90:
            monitor-exit(r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.0wQ r5 = r1.A04     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.9lY r4 = r0.A0C     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            com.whatsapp.jid.UserJid r4 = r4.A0D     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r4 = r5.A0M(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0fc0
            X.1Db r12 = r1.A0b     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.0wo r4 = r1.A0B     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            long r4 = X.C19970wo.A00(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            long r10 = X.C90484aE.A0K(r8)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            long r4 = r4 + r10
            r12.A0E(r6, r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.17Y r10 = r1.A03     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.2ZN r8 = r1.A0a     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.util.Objects.requireNonNull(r8)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r5 = 9
            X.72n r4 = new X.72n     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4.<init>(r8, r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r10.A0H(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0fc0:
            X.9lY r8 = r2.A0M     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r8 == 0) goto L_0x0fd5
            X.1Ed r10 = r1.A0I     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.C18740tg.A06(r8)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            int r5 = r8.A03     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4 = 5
            if (r5 != r4) goto L_0x0fe2
            X.1Dc r5 = r10.A04     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r4 = "verifyPaymentAcceptedRequest type future"
        L_0x0fd2:
            r5.A05(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x0fd5:
            boolean r4 = r2 instanceof X.C180838mV     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x1127
            r4 = r2
            X.8mV r4 = (X.C180838mV) r4     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r5 = r4.A00     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.1Fn r10 = r1.A0H     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            monitor-enter(r10)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x1048
        L_0x0fe2:
            boolean r4 = X.C203419nz.A06(r8)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x0fed
            X.1Dc r5 = r10.A04     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r4 = "verifyPaymentAcceptedRequest empty transaction"
            goto L_0x0fd2
        L_0x0fed:
            X.9lY r11 = r2.A0M     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r4 = r11.A0M     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r8 = 0
            X.9lY r10 = X.C165587tf.A0R(r10, r4, r8)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r10 == 0) goto L_0x1043
            com.whatsapp.jid.UserJid r4 = r2.A0L()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r4 = r10.A0Q(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x1043
            monitor-enter(r10)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            com.whatsapp.jid.UserJid r5 = r11.A0E     // Catch:{ all -> 0x112a }
            if (r5 == 0) goto L_0x1015
            com.whatsapp.jid.UserJid r4 = r10.A0E     // Catch:{ all -> 0x112a }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x112a }
            if (r4 != 0) goto L_0x1015
            java.lang.String r4 = "Pay: PaymentTransactionInfoData canBeAcceptedWithTransaction: sender mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ all -> 0x112a }
            goto L_0x1042
        L_0x1015:
            java.lang.String r5 = r10.A0I     // Catch:{ all -> 0x112a }
            if (r5 == 0) goto L_0x103d
            java.lang.String r4 = r11.A0I     // Catch:{ all -> 0x112a }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x112a }
            if (r4 == 0) goto L_0x103d
            X.16X r5 = r10.A08     // Catch:{ all -> 0x112a }
            if (r5 == 0) goto L_0x103d
            X.16X r4 = r11.A08     // Catch:{ all -> 0x112a }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x112a }
            if (r4 == 0) goto L_0x103d
            monitor-exit(r10)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.9lY r10 = r2.A0M     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.17Y r8 = r1.A03     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r5 = 9
            X.74j r4 = new X.74j     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4.<init>(r1, r10, r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r8.A0H(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x0fd5
        L_0x103d:
            java.lang.String r4 = "PAY: PaymentTransactionInfoData canBeAcceptedWithTransaction: amount mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ all -> 0x112a }
        L_0x1042:
            monitor-exit(r10)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x1043:
            X.9lY r4 = r2.A0M     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4.A0M = r8     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x0fd5
        L_0x1048:
            X.AnonymousClass00C.A0D(r5, r7)     // Catch:{ all -> 0x112a }
            X.1EU r4 = r10.A04     // Catch:{ all -> 0x112a }
            X.AnonymousClass1EU.A00(r4)     // Catch:{ all -> 0x112a }
            X.1Ed r11 = r4.A05     // Catch:{ all -> 0x112a }
            X.AnonymousClass00C.A08(r11)     // Catch:{ all -> 0x112a }
            r4 = 0
            X.9lY r8 = X.C165587tf.A0R(r11, r5, r4)     // Catch:{ all -> 0x112a }
            if (r8 == 0) goto L_0x10fd
            com.whatsapp.jid.UserJid r4 = r2.A0L()     // Catch:{ all -> 0x112a }
            boolean r4 = r8.A0Q(r4)     // Catch:{ all -> 0x112a }
            if (r4 == 0) goto L_0x10fd
            X.005 r4 = r10.A05     // Catch:{ all -> 0x112a }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x112a }
            X.1VZ r4 = (X.AnonymousClass1VZ) r4     // Catch:{ all -> 0x112a }
            X.3T1 r12 = r4.A00(r8)     // Catch:{ all -> 0x112a }
            if (r12 == 0) goto L_0x10c2
            int r13 = r8.A02     // Catch:{ all -> 0x112a }
            boolean r4 = X.C25241Fn.A00(r10, r8, r2)     // Catch:{ all -> 0x112a }
            if (r4 == 0) goto L_0x10fd
            X.0wo r4 = r10.A00     // Catch:{ all -> 0x112a }
            long r4 = X.C19970wo.A00(r4)     // Catch:{ all -> 0x112a }
            r8.A06 = r4     // Catch:{ all -> 0x112a }
            r12.A0M = r8     // Catch:{ all -> 0x112a }
            X.3Qa r4 = r12.A1J     // Catch:{ all -> 0x112a }
            X.C18740tg.A06(r8)     // Catch:{ all -> 0x112a }
            r24 = 0
            r23 = 0
            r19 = r11
            r20 = r8
            r21 = r4
            r22 = r13
            boolean r4 = r19.A0d(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x112a }
            if (r4 == 0) goto L_0x10fd
            java.lang.String r5 = "CoreMessageStore"
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x112a }
            java.lang.String r4 = "msgStore/markPaymentRequestMessageResponded request message id: "
            r11.append(r4)     // Catch:{ all -> 0x112a }
            java.lang.String r4 = r8.A0L     // Catch:{ all -> 0x112a }
            java.lang.String r4 = X.AnonymousClass000.A0q(r4, r11)     // Catch:{ all -> 0x112a }
            java.lang.String r4 = X.C24611Dc.A01(r5, r4)     // Catch:{ all -> 0x112a }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x112a }
            X.1DQ r5 = r10.A02     // Catch:{ all -> 0x112a }
            r4 = 16
            r5.A01(r12, r4)     // Catch:{ all -> 0x112a }
            X.0xu r4 = r10.A01     // Catch:{ all -> 0x112a }
            r4.A0K(r12)     // Catch:{ all -> 0x112a }
            goto L_0x10fb
        L_0x10c2:
            boolean r4 = X.C25241Fn.A00(r10, r8, r2)     // Catch:{ all -> 0x112a }
            if (r4 == 0) goto L_0x10fd
            X.0wo r4 = r10.A00     // Catch:{ all -> 0x112a }
            long r4 = X.C19970wo.A00(r4)     // Catch:{ all -> 0x112a }
            r8.A06 = r4     // Catch:{ all -> 0x112a }
            boolean r4 = r11.A0a(r8)     // Catch:{ all -> 0x112a }
            if (r4 == 0) goto L_0x10fd
            java.lang.String r11 = "CoreMessageStore"
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x112a }
            java.lang.String r4 = "msgStore/markPaymentRequestMessageResponded request message id: "
            r5.append(r4)     // Catch:{ all -> 0x112a }
            java.lang.String r4 = r8.A0L     // Catch:{ all -> 0x112a }
            java.lang.String r4 = X.AnonymousClass000.A0q(r4, r5)     // Catch:{ all -> 0x112a }
            java.lang.String r4 = X.C24611Dc.A01(r11, r4)     // Catch:{ all -> 0x112a }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x112a }
            X.1Fo r12 = r10.A03     // Catch:{ all -> 0x112a }
            X.0wU r11 = r12.A06     // Catch:{ all -> 0x112a }
            r5 = 3
            X.1jD r4 = new X.1jD     // Catch:{ all -> 0x112a }
            r4.<init>(r12, r8, r5)     // Catch:{ all -> 0x112a }
            r11.Boy(r4)     // Catch:{ all -> 0x112a }
        L_0x10fb:
            monitor-exit(r10)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x1127
        L_0x10fd:
            monitor-exit(r10)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            int r4 = r2.A0C     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 <= 0) goto L_0x1118
            X.1A1 r4 = r1.A0j     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.3Qa r2 = r2.A1J     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.3T1 r2 = r4.A03(r2)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r2 == 0) goto L_0x1118
            java.util.ArrayList r4 = X.C36441kJ.A14(r7)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4.add(r2)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.0xM r2 = r1.A0G     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2.A0u(r4, r6)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x1118:
            int r2 = r3.bitField0_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2 = r2 & 2
            if (r2 != 0) goto L_0x12e6
            if (r17 == 0) goto L_0x12e6
            X.1DL r2 = r1.A0X     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2.A0C(r0)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x120b
        L_0x1127:
            r5 = 2
            goto L_0x11b0
        L_0x112a:
            r2 = move-exception
            monitor-exit(r10)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x114d
        L_0x112d:
            X.91g r2 = new X.91g     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2.<init>(r6)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x114d
        L_0x1133:
            X.91g r2 = new X.91g     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2.<init>(r7)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x114d
        L_0x1139:
            X.91g r2 = new X.91g     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2.<init>(r7)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x114d
        L_0x113f:
            java.lang.String r5 = "DecryptionCallbackV2/handleBroadcastEphemeralSetting"
            java.lang.String r4 = "broadcast with secret but without ephemeral setting"
            r2 = r35
            r2.A0E(r5, r4, r7)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.91g r2 = new X.91g     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2.<init>(r6)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x114d:
            throw r2     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x114e:
            r5 = 2
            X.3Qa r4 = X.C21337AHp.A00(r0)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2 = r23
            X.2bK r2 = X.C183348qe.A01(r12, r4, r0, r2, r5)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            int r8 = r3.bitField1_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4 = r8 & 16
            if (r4 != 0) goto L_0x11ac
            r4 = r8 & 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x11ac
            r4 = r8 & 128(0x80, float:1.794E-43)
            r10 = 67
            if (r4 != 0) goto L_0x11ae
            r4 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 & r8
            r10 = 79
            if (r4 != 0) goto L_0x11ae
            r4 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x1177
            r10 = 74
            goto L_0x11ae
        L_0x1177:
            boolean r4 = r3.A0u()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r10 = 80
            if (r4 != 0) goto L_0x11ae
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r4 = r4 & r8
            r10 = 81
            if (r4 != 0) goto L_0x11ae
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = r4 & r8
            if (r4 == 0) goto L_0x118e
            r10 = 82
            goto L_0x11ae
        L_0x118e:
            int r10 = r3.bitField1_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4 = 134217728(0x8000000, float:3.85186E-34)
            r10 = r10 & r4
            boolean r4 = X.AnonymousClass000.A1P(r10)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x119c
            r10 = 84
            goto L_0x11ae
        L_0x119c:
            boolean r4 = r3.A0v()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r10 = 83
            if (r4 != 0) goto L_0x11ae
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r8 = r8 & r4
            if (r8 == 0) goto L_0x11b0
            r10 = 85
            goto L_0x11ae
        L_0x11ac:
            r10 = 56
        L_0x11ae:
            r2.A00 = r10     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x11b0:
            boolean r4 = r3.A0x()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x11dc
            X.8Ri r4 = r3.messageContextInfo_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r8 = r4
            if (r4 != 0) goto L_0x11bd
            X.8Ri r4 = X.C173348Ri.DEFAULT_INSTANCE     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x11bd:
            int r4 = r4.bitField0_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4 = r4 & 8
            if (r4 == 0) goto L_0x11dc
            r4 = r8
            if (r8 != 0) goto L_0x11c8
            X.8Ri r4 = X.C173348Ri.DEFAULT_INSTANCE     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x11c8:
            X.AUx r4 = r4.paddingBytes_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x11dc
            if (r8 != 0) goto L_0x11d0
            X.8Ri r8 = X.C173348Ri.DEFAULT_INSTANCE     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x11d0:
            X.AUx r4 = r8.paddingBytes_     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            int r4 = r4.A02()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.Long r4 = X.C36441kJ.A0y(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r0.A0a = r4     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x11dc:
            X.8eP r11 = r1.A0Z     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r11 == 0) goto L_0x11ec
            X.1DW r10 = r1.A0M     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.1AW r8 = r1.A0h     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.1EO r4 = r1.A0i     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            int r4 = X.C55802vD.A00(r10, r2, r8, r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r11.A00 = r4     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x11ec:
            boolean r4 = X.C66013Ui.A0n(r2)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x1206
            int r10 = r2.A01     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r10 == 0) goto L_0x120f
            boolean r4 = r2 instanceof X.C180868mY     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x1206
            boolean r4 = r2 instanceof X.C46752bc     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x1206
            boolean r4 = r2 instanceof X.AnonymousClass5J2     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 != 0) goto L_0x1206
            boolean r4 = r2 instanceof X.C46742bb     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x120f
        L_0x1206:
            X.1aQ r4 = r1.A0U     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.C30571aQ.A00(r4, r2, r0)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x120b:
            r1.A00 = r6     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x12e6
        L_0x120f:
            int r8 = r2.A1I     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4 = 99
            if (r8 != r4) goto L_0x1233
            java.lang.String r4 = "DecryptionCallbackV2/unsupported message"
            com.whatsapp.util.Log.w((java.lang.String) r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.util.ArrayList r4 = X.C36441kJ.A14(r7)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4.add(r2)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.0xM r2 = r1.A0G     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2.A0u(r4, r7)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2 = 69
            A02(r1, r2)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r17 == 0) goto L_0x12e6
            X.1DL r2 = r1.A0X     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2.A0C(r0)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x120b
        L_0x1233:
            if (r10 == 0) goto L_0x123a
            if (r10 == r5) goto L_0x123a
            if (r10 == r7) goto L_0x123a
            goto L_0x128d
        L_0x123a:
            X.2Sw r10 = r1.A0O     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.1DW r8 = r1.A0M     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.1AW r5 = r1.A0h     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.1EO r4 = r1.A0i     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            int r4 = X.C55802vD.A00(r8, r2, r5, r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r10.A0B = r4     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.185 r5 = r1.A0A     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            com.whatsapp.jid.UserJid r4 = r0.A1A     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.3L0 r4 = r5.A02(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x128a
            X.3ur r5 = r4.A00()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x125a:
            X.3ur r4 = r0.A0S     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            boolean r4 = X.AnonymousClass3MX.A01(r5, r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            if (r4 == 0) goto L_0x1267
            r4 = 4096(0x1000, float:5.74E-42)
            r2.A0j(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
        L_0x1267:
            boolean r4 = r9.A08     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2.A16 = r4     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.1aQ r4 = r1.A0U     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.C30571aQ.A00(r4, r2, r0)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            int r5 = r9.A03     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4 = -1
            if (r5 == r4) goto L_0x120b
            X.0xM r5 = r1.A0G     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.3TT r4 = new X.3TT     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4.<init>(r9)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            int r2 = r2.A0E     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r4.A01 = r2     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.3H2 r4 = r4.A02()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2 = r18
            r5.A0c(r2, r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x120b
        L_0x128a:
            X.3ur r5 = r9.A05     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x125a
        L_0x128d:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r4 = "DecryptionCallbackV2/invalid-edit-version edit="
            r5.append(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r5.append(r10)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r4 = ", type="
            r5.append(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r5.append(r8)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r4 = ", id="
            r5.append(r4)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.3Qa r2 = r2.A1J     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            java.lang.String r2 = r2.A01     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            X.C36321k7.A1Z(r5, r2)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            r2 = 19
            A02(r1, r2)     // Catch:{ 8o5 -> 0x12db, 1Tb -> 0x12d0, 1Ta -> 0x12cc, 91g -> 0x12b3 }
            goto L_0x12e6
        L_0x12b3:
            r4 = move-exception
            r0.A12 = r7     // Catch:{ Exception -> 0x13e4 }
            r2 = 9
            r0.A04 = r2     // Catch:{ Exception -> 0x13e4 }
            int r0 = r4.failureReason     // Catch:{ Exception -> 0x13e4 }
            if (r0 == 0) goto L_0x12c9
            if (r0 != r7) goto L_0x12c2
            r0 = 0
            goto L_0x12d7
        L_0x12c2:
            java.lang.String r0 = "Invalid failure reason"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ Exception -> 0x13e4 }
            throw r0     // Catch:{ Exception -> 0x13e4 }
        L_0x12c9:
            r0 = 35
            goto L_0x12d7
        L_0x12cc:
            A02(r1, r6)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x12e6
        L_0x12d0:
            r0 = move-exception
            java.lang.Integer r0 = r0.e2eFailureReason     // Catch:{ Exception -> 0x13e4 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x13e4 }
        L_0x12d7:
            A02(r1, r0)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x12e6
        L_0x12db:
            r0 = move-exception
            X.1Ft r2 = r1.A0L     // Catch:{ Exception -> 0x13e4 }
            X.9XS r0 = r0.messageOrphan     // Catch:{ Exception -> 0x13e4 }
            r2.A01(r0)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x12e6
        L_0x12e4:
            r1.A00 = r0     // Catch:{ Exception -> 0x13e4 }
        L_0x12e6:
            int r0 = r3.bitField0_     // Catch:{ Exception -> 0x13e4 }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0048
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = "DecryptionCallbackV2/axolotl received sender key distribution message; message.key="
            r0 = r16
            X.3Qa r0 = X.C165607th.A0g(r0, r2, r4)     // Catch:{ Exception -> 0x13e4 }
            X.C36321k7.A1N(r0, r4)     // Catch:{ Exception -> 0x13e4 }
            X.8PE r3 = r3.senderKeyDistributionMessage_     // Catch:{ Exception -> 0x13e4 }
            if (r3 != 0) goto L_0x1301
            X.8PE r3 = X.AnonymousClass8PE.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13e4 }
        L_0x1301:
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x13e4 }
            r0 = r2 & 1
            if (r0 == 0) goto L_0x13c7
            r0 = r2 & 2
            if (r0 == 0) goto L_0x13c7
            X.11F r2 = r1.A0S     // Catch:{ Exception -> 0x13e4 }
            boolean r0 = X.AnonymousClass143.A0G(r2)     // Catch:{ Exception -> 0x13e4 }
            if (r0 == 0) goto L_0x1327
            java.lang.String r2 = r2.getRawString()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r0 = r3.groupId_     // Catch:{ Exception -> 0x13e4 }
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x13e4 }
            if (r0 != 0) goto L_0x1327
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = "DecryptionCallbackV2/group id on message and group id in ciphertext do not match; message.key="
            goto L_0x13cd
        L_0x1327:
            java.lang.String r2 = r3.groupId_     // Catch:{ Exception -> 0x13e4 }
            X.6EZ r0 = r1.A0D     // Catch:{ Exception -> 0x13e4 }
            X.6EU r7 = new X.6EU     // Catch:{ Exception -> 0x13e4 }
            r7.<init>(r0, r2)     // Catch:{ Exception -> 0x13e4 }
            X.189 r2 = r1.A0E     // Catch:{ Exception -> 0x13e4 }
            X.AUx r0 = r3.axolotlSenderKeyDistributionMessage_     // Catch:{ Exception -> 0x13e4 }
            byte[] r3 = r0.A06()     // Catch:{ Exception -> 0x13e4 }
            X.18I r0 = r2.A0K     // Catch:{ Exception -> 0x13e4 }
            X.79X r6 = X.AnonymousClass18I.A01(r0, r7)     // Catch:{ Exception -> 0x13e4 }
            r6.lock()     // Catch:{ Exception -> 0x13e4 }
            X.18u r2 = r2.A00     // Catch:{ all -> 0x13bd }
            java.lang.String r4 = "axolotl"
            int r0 = r3.length     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            if (r0 == 0) goto L_0x137f
            X.Aad r5 = new X.Aad     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            r5.<init>(r3)     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            X.187 r0 = r2.A04     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            boolean r0 = r0.A00()     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            if (r0 == 0) goto L_0x136d
            X.18s r0 = r2.A02     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            X.18k r0 = r0.A04     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            X.9Tg r3 = new X.9Tg     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            r3.<init>(r0)     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            X.66a r2 = X.AnonymousClass6R2.A02(r7)     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            java.lang.Object r0 = X.C200689hx.A00     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            monitor-enter(r0)     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            r3.A01(r2, r5)     // Catch:{ all -> 0x136a }
            monitor-exit(r0)     // Catch:{ all -> 0x136a }
            goto L_0x137d
        L_0x136a:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x136a }
            goto L_0x1386
        L_0x136d:
            X.18s r0 = r2.A02     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            X.18k r0 = r0.A04     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            X.9Tg r2 = new X.9Tg     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            r2.<init>(r0)     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            X.66a r0 = X.AnonymousClass6R2.A02(r7)     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            r2.A01(r0, r5)     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
        L_0x137d:
            r3 = 0
            goto L_0x139b
        L_0x137f:
            java.lang.String r0 = "Data is empty"
            X.18B r2 = new X.18B     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
            r2.<init>((java.lang.String) r0)     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
        L_0x1386:
            throw r2     // Catch:{ 18A -> 0x1395, 18B -> 0x138e, Exception -> 0x1387 }
        L_0x1387:
            r0 = move-exception
            com.whatsapp.util.Log.w(r4, r0)     // Catch:{ all -> 0x13bd }
            r3 = -1000(0xfffffffffffffc18, float:NaN)
            goto L_0x139b
        L_0x138e:
            r0 = move-exception
            com.whatsapp.util.Log.w(r4, r0)     // Catch:{ all -> 0x13bd }
            r3 = -1005(0xfffffffffffffc13, float:NaN)
            goto L_0x139b
        L_0x1395:
            r0 = move-exception
            com.whatsapp.util.Log.w(r4, r0)     // Catch:{ all -> 0x13bd }
            r3 = -1007(0xfffffffffffffc11, float:NaN)
        L_0x139b:
            r6.close()     // Catch:{ Exception -> 0x13e4 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r0 = "DecryptionCallbackV2/processSenderKeyDistributionMessage/status/"
            X.C36321k7.A1T(r0, r2, r3)     // Catch:{ Exception -> 0x13e4 }
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            if (r3 != r0) goto L_0x13b2
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = "DecryptionCallbackV2/axolotl received invalid sender key distribution message; message.key="
            goto L_0x13cd
        L_0x13b2:
            r0 = -1007(0xfffffffffffffc11, float:NaN)
            if (r3 != r0) goto L_0x13d6
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = "DecryptionCallbackV2/axolotl received legacy sender key distribution message; message.key="
            goto L_0x13cd
        L_0x13bd:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x13c2 }
            goto L_0x13c6
        L_0x13c2:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ Exception -> 0x13e4 }
        L_0x13c6:
            throw r2     // Catch:{ Exception -> 0x13e4 }
        L_0x13c7:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x13e4 }
            java.lang.String r2 = "DecryptionCallbackV2/axolotl received incomplete sender key distribution message; message.key="
        L_0x13cd:
            r0 = r16
            X.3Qa r0 = X.C165607th.A0g(r0, r2, r3)     // Catch:{ Exception -> 0x13e4 }
            X.C36351kA.A1L(r0, r3)     // Catch:{ Exception -> 0x13e4 }
        L_0x13d6:
            if (r17 == 0) goto L_0x0048
            boolean r0 = r1.A00     // Catch:{ Exception -> 0x13e4 }
            if (r0 == 0) goto L_0x0048
            X.1DL r2 = r1.A0X     // Catch:{ Exception -> 0x13e4 }
            r0 = r16
            r2.A0C(r0)     // Catch:{ Exception -> 0x13e4 }
            goto L_0x1404
        L_0x13e4:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext Error processing e2e message; message.key="
            r0 = r16
            X.3Qa r0 = X.C165607th.A0g(r0, r2, r3)
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r3)
            com.whatsapp.util.Log.e(r0, r4)
            boolean r0 = r4 instanceof android.database.sqlite.SQLiteFullException
            if (r0 != 0) goto L_0x1405
            boolean r0 = r4 instanceof android.database.sqlite.SQLiteDatabaseCorruptException
            if (r0 != 0) goto L_0x1405
            r3 = 34
            goto L_0x0045
        L_0x1404:
            return
        L_0x1405:
            throw r4
        L_0x1406:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext axolotl derived plaintext does not represent valid protocol buffer; message.key="
            r0 = r16
            X.3Qa r0 = X.C165607th.A0g(r0, r2, r3)
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r3)
            com.whatsapp.util.Log.w(r0, r4)
            r0 = 11
            A02(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AAF.BJg(byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r7 == 67) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AAF r6, int r7) {
        /*
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DecryptionCallbackV2/e2e failure, reason= "
            X.C36321k7.A1S(r0, r1, r7)
            X.B3s r3 = r6.A0f
            r3.BoV()
            boolean r0 = r3.BNC()
            if (r0 != 0) goto L_0x0040
            r0 = 34
            if (r7 == r0) goto L_0x0079
            r0 = 66
            if (r7 == r0) goto L_0x0021
            r0 = 67
            r2 = 5
            if (r7 != r0) goto L_0x0022
        L_0x0021:
            r2 = 6
        L_0x0022:
            X.1DT r1 = r6.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.A0S(r3, r0, r2)
            X.0xM r5 = r6.A0G
            r0 = 34
            r4 = 491(0x1eb, float:6.88E-43)
            if (r7 != r0) goto L_0x0035
            r4 = 500(0x1f4, float:7.0E-43)
        L_0x0035:
            X.3Qa r2 = r3.BE4()
            long r0 = r3.BIM()
            r5.A0r(r2, r4, r0)
        L_0x0040:
            X.2Sw r1 = r6.A0O
            X.8eP r0 = r6.A0Z
            X.C200429hO.A01(r1, r0, r7)
            boolean r0 = r6.A0n
            if (r0 == 0) goto L_0x0056
            r0 = 18
            if (r7 != r0) goto L_0x005e
            X.1DL r1 = r6.A0X
            r0 = 491(0x1eb, float:6.88E-43)
            r1.A0D(r3, r0)
        L_0x0056:
            X.1DT r1 = r6.A05
            java.lang.Integer r0 = r6.A0s
            r1.A0T(r3, r0, r7)
            return
        L_0x005e:
            boolean r0 = r3.BNC()
            X.1DL r2 = r6.A0X
            if (r0 != 0) goto L_0x0075
            r1 = 34
            r0 = 491(0x1eb, float:6.88E-43)
            if (r7 != r1) goto L_0x006e
            r0 = 500(0x1f4, float:7.0E-43)
        L_0x006e:
            r2.A0D(r3, r0)
        L_0x0071:
            r0 = 0
            r6.A00 = r0
            goto L_0x0056
        L_0x0075:
            r2.A0C(r3)
            goto L_0x0071
        L_0x0079:
            r2 = 10
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AAF.A02(X.AAF, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r1.buttons_.isEmpty() != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.AnonymousClass8SX r8, X.C21337AHp r9) {
        /*
            r7 = this;
            X.8yC[] r6 = X.C187608yC.values()
            int r3 = r6.length
            r5 = 0
            r2 = 0
        L_0x0007:
            r4 = 1
            if (r2 >= r3) goto L_0x002a
            r1 = r6[r2]
            X.7fA r0 = r1.hasMessage
            java.lang.Object r0 = r0.apply(r8)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x0027
            X.7fA r0 = r1.getMessage
            java.lang.Object r0 = r0.apply(r8)
            X.8SX r0 = (X.AnonymousClass8SX) r0
            boolean r0 = r7.A04(r0, r9)
            if (r0 == 0) goto L_0x0027
            return r4
        L_0x0027:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x002a:
            int r0 = r8.bitField1_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x004e
            java.lang.Integer r1 = r9.A0V
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 == r0) goto L_0x004e
            X.8Re r0 = r8.buttonsMessage_
            r1 = r0
            if (r0 != 0) goto L_0x003d
            X.8Re r0 = X.C173308Re.DEFAULT_INSTANCE
        L_0x003d:
            X.B6c r0 = r0.buttons_
            if (r0 == 0) goto L_0x004e
            if (r1 != 0) goto L_0x0045
            X.8Re r1 = X.C173308Re.DEFAULT_INSTANCE
        L_0x0045:
            X.B6c r0 = r1.buttons_
            boolean r0 = r0.isEmpty()
            r3 = 1
            if (r0 == 0) goto L_0x004f
        L_0x004e:
            r3 = 0
        L_0x004f:
            int r2 = r8.bitField0_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0083
            java.lang.Integer r1 = r9.A0V
            java.lang.Integer r0 = X.C023109s.A0G
            if (r1 == r0) goto L_0x0083
        L_0x005c:
            boolean r0 = r8.A10()
            if (r0 != 0) goto L_0x0066
            r0 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0081
        L_0x0066:
            java.lang.Integer r1 = r9.A0V
            java.lang.Integer r0 = X.C023109s.A01
            if (r1 != r0) goto L_0x0078
            r1 = 32
            int r0 = r9.A03
            r0 = r0 & 32
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 != 0) goto L_0x0081
        L_0x0078:
            r0 = 1
        L_0x0079:
            if (r3 != 0) goto L_0x007f
            if (r4 != 0) goto L_0x007f
            if (r0 == 0) goto L_0x0080
        L_0x007f:
            r5 = 1
        L_0x0080:
            return r5
        L_0x0081:
            r0 = 0
            goto L_0x0079
        L_0x0083:
            r4 = 0
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AAF.A04(X.8SX, X.AHp):boolean");
    }

    public AAF(C19460v5 r6, C19700wN r7, AnonymousClass17Y r8, C19730wQ r9, AnonymousClass1DT r10, AnonymousClass164 r11, C195399Ud r12, AnonymousClass1CL r13, AnonymousClass16D r14, AnonymousClass185 r15, C19970wo r16, C19630wG r17, AnonymousClass17Z r18, AnonymousClass6EZ r19, AnonymousClass189 r20, C220412q r21, C20310xM r22, C25241Fn r23, C24881Ed r24, AnonymousClass1FV r25, AnonymousClass1OD r26, C25301Ft r27, AnonymousClass1DW r28, C194359Pj r29, C20810yC r30, C45832Sw r31, C20520xh r32, C65913Ty r33, AnonymousClass1CF r34, AnonymousClass1VN r35, C30571aQ r36, C198309dF r37, C30121Zh r38, AnonymousClass1DL r39, AnonymousClass1C4 r40, AnonymousClass19L r41, AnonymousClass2ZN r42, C24601Db r43, AnonymousClass1DR r44, AnonymousClass1XB r45, AnonymousClass1EV r46, AnonymousClass1WF r47, C23084B3s b3s, C31551c0 r49, AnonymousClass1AW r50, AnonymousClass1EO r51, AnonymousClass1A1 r52, C19770wU r53, C24961El r54, AnonymousClass005 r55, Integer num, boolean z, boolean z2) {
        this.A0D = r19;
        this.A0s = num;
        C23084B3s b3s2 = b3s;
        this.A0f = b3s2;
        this.A0O = r31;
        this.A0n = z;
        this.A00 = z2;
        this.A0B = r16;
        this.A0N = r30;
        this.A03 = r8;
        this.A02 = r7;
        this.A04 = r9;
        this.A0C = r17;
        this.A0k = r53;
        this.A0F = r21;
        this.A0Y = r40;
        this.A0X = r39;
        this.A06 = r11;
        this.A0q = r35;
        this.A09 = r14;
        this.A0M = r28;
        this.A05 = r10;
        this.A0G = r22;
        this.A0j = r52;
        this.A0V = r37;
        this.A0E = r20;
        this.A0l = r54;
        this.A0L = r27;
        this.A0b = r43;
        this.A07 = r12;
        this.A0A = r15;
        this.A0Q = r33;
        this.A0K = r26;
        this.A0U = r36;
        this.A0m = r55;
        this.A0e = r46;
        this.A0J = r25;
        this.A0p = r29;
        this.A0a = r42;
        this.A0I = r24;
        this.A0r = r47;
        this.A0P = r32;
        this.A0H = r23;
        this.A0d = r45;
        this.A0c = r44;
        this.A0o = r18;
        this.A0g = r49;
        this.A08 = r13;
        this.A0h = r50;
        this.A0W = r38;
        this.A0i = r51;
        this.A01 = r6;
        this.A0Z = (C177808eP) AnonymousClass19L.A00(r41, 0, b3s2.BDf());
        this.A0S = b3s2.BGb();
        this.A0T = b3s2.BHI();
        this.A0R = r34;
    }
}
