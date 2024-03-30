package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.6WM  reason: invalid class name */
public class AnonymousClass6WM {
    public final AnonymousClass4UK A00 = new C142396oo(this);
    public final C233418c A01;
    public final C1256060o A02;
    public final AnonymousClass67L A03;
    public final AnonymousClass4Q9 A04 = new C144546sQ(this);
    public final C30431aC A05;
    public final AnonymousClass189 A06;
    public final AnonymousClass187 A07;
    public final AnonymousClass1IN A08;
    public final AnonymousClass4QJ A09 = new C145096tL(this);
    public final C232217q A0A;
    public final AnonymousClass1OD A0B;
    public final C20810yC A0C;
    public final C21010yW A0D;
    public final C20300xL A0E;
    public final AnonymousClass18I A0F;
    public final C117135ll A0G;
    public final C30521aL A0H;
    public volatile Future A0I;

    public static C131106Nt A00(AnonymousClass6WM r4, AnonymousClass6EZ r5, DeviceJid deviceJid, AnonymousClass630 r7, byte[] bArr) {
        if (r4.A0B.A0D(deviceJid, r7, bArr, 2)) {
            int i = r7.A00;
            if (i == 0) {
                return r4.A06.A06((C22934Ayk) null, r5, r7.A02);
            }
            if (i == 1) {
                return r4.A06.A07((C22934Ayk) null, r5, r7.A02);
            }
            throw AnonymousClass000.A0d("invalid ciphertext type; ciphertextType=", AnonymousClass000.A0u(), i);
        }
        Log.e("voip/encryption/decryptCallPayload/invalid device identity");
        return new C131106Nt((byte[]) null, -1010);
    }

    public static DeviceJid A01(AnonymousClass6WM r9, DeviceJid deviceJid, String str, int i, int i2) {
        C64933Qa r3 = new C64933Qa(deviceJid.userJid, str, true);
        AnonymousClass6EZ A022 = C133256Xm.A02(deviceJid);
        AnonymousClass18I r0 = r9.A0F;
        AnonymousClass79X A002 = AnonymousClass18I.A00(A022, r0);
        AnonymousClass18I.A03(A002, r0);
        try {
            AnonymousClass189 r6 = r9.A06;
            C198789eC A0D2 = r6.A0D(A022);
            AnonymousClass8S2 r8 = A0D2.A01.A00;
            byte[] A062 = r8.aliceBaseKey_.A06();
            if (A0D2.A00 || r8.remoteRegistrationId_ != i2) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("voip/receive_message/onPeerE2EDecryptionFailed registration id is not equal. stored= ");
                A0u.append(r8.remoteRegistrationId_);
                A0u.append(", incoming=");
                A0u.append(i2);
                C36321k7.A1K(r3, ". Fetching new prekey for: ", A0u);
                r9.A03.A01(deviceJid);
            } else {
                if (i > 2) {
                    if (r6.A0b(A022, r3)) {
                        C36321k7.A1K(r3, "voip/receive_message/onPeerE2EDecryptionFailed reg id is equal and has same basekey. Fetching new prekey for: ", AnonymousClass000.A0u());
                        r9.A03.A01(deviceJid);
                    }
                } else if (i == 2) {
                    C36321k7.A1K(r3, "voip/receive_message/onPeerE2EDecryptionFailed recording base key. ", AnonymousClass000.A0u());
                    r6.A0U(A022, r3, A062);
                }
                if (A002 != null) {
                    A002.close();
                }
                return deviceJid;
            }
            if (A002 != null) {
                A002.close();
            }
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AnonymousClass6WM r7, java.lang.String r8, byte[] r9, int r10) {
        /*
            X.189 r0 = r7.A06
            int r4 = r0.A04()
            r6 = 1
            if (r9 == 0) goto L_0x005d
            r0 = 0
            int r5 = X.C203239na.A01(r9, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/encryption/onE2EDecryptionFailed.  message.id="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r3 = "; serverRegistrationId="
            r1.append(r3)
            r1.append(r5)
            java.lang.String r2 = "; localRegistrationId="
            X.C36321k7.A1T(r2, r1, r4)
            if (r5 == r4) goto L_0x005d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/encryption/onE2EDecryptionFailed registration id received did not match local; message.id="
            X.AnonymousClass000.A1D(r0, r8, r3, r1)
            r1.append(r5)
            X.C36321k7.A1T(r2, r1, r4)
            r1 = 1
        L_0x0039:
            java.lang.String r0 = "voip/encryption/onE2EDecryptionFailed reject at retry: "
            if (r1 == 0) goto L_0x004c
            java.lang.StringBuilder r1 = X.C90464aC.A0h(r10, r0)
            java.lang.String r0 = " sending local pre keys to server; localRegistrationId="
            X.C36321k7.A1T(r0, r1, r4)
            X.0xL r0 = r7.A0E
            r0.A03()
        L_0x004b:
            return
        L_0x004c:
            if (r10 <= r6) goto L_0x004b
            java.lang.StringBuilder r1 = X.C90464aC.A0h(r10, r0)
            java.lang.String r0 = " sending get prekey digest; localRegistrationId="
            X.C36321k7.A1T(r0, r1, r4)
            X.0xL r0 = r7.A0E
            r0.A06()
            return
        L_0x005d:
            r1 = 0
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WM.A02(X.6WM, java.lang.String, byte[], int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: X.630} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: X.630} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: X.630} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: X.630} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: X.630} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: X.630} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: X.630} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: X.630} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: X.630} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: X.630} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v50, resolved type: X.54P} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v57, resolved type: X.54P} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v102, resolved type: X.8aS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v103, resolved type: X.8aS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: X.8aS} */
    /* JADX WARNING: type inference failed for: r8v9, types: [X.9TX] */
    /* JADX WARNING: type inference failed for: r15v5, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v49 */
    /* JADX WARNING: type inference failed for: r8v93 */
    /* JADX WARNING: type inference failed for: r8v95 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0382 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6LR A03(X.C106235Iw r45) {
        /*
            r44 = this;
            r4 = r45
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r4.A01
            r28 = r0
            com.whatsapp.protocol.VoipStanzaChildNode[] r27 = r28.getChildrenCopy()
            if (r27 != 0) goto L_0x001d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/encryption/decrypt-stanza no children, message.id="
        L_0x0012:
            r1.append(r0)
            java.lang.String r0 = r4.A03
            X.C36321k7.A1a(r1, r0)
            X.6LR r0 = X.AnonymousClass6LR.A06
            return r0
        L_0x001d:
            r0 = r27
            int r0 = r0.length
            r43 = r0
            r7 = 0
            r2 = 0
            r26 = r2
            r25 = r2
            r5 = 0
        L_0x0029:
            r0 = r43
            if (r5 >= r0) goto L_0x005d
            r3 = r27[r5]
            java.lang.String r1 = r3.tag
            java.lang.String r0 = "registration"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            byte[] r26 = r3.getDataCopy()
            if (r26 == 0) goto L_0x0045
            r0 = r26
            int r1 = r0.length
            r0 = 4
            if (r1 == r0) goto L_0x005a
        L_0x0045:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/encryption/decrypt-stanza invalid registration, message.id="
            goto L_0x0012
        L_0x004c:
            java.lang.String r1 = r3.tag
            java.lang.String r0 = "device-identity"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005a
            byte[] r25 = r3.getDataCopy()
        L_0x005a:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x005d:
            com.whatsapp.protocol.VoipStanzaChildNode$Builder r24 = X.C34681hT.A01(r28)
            r3 = r2
            r5 = r2
            r8 = 0
            r23 = 0
        L_0x0066:
            r0 = r43
            if (r7 >= r0) goto L_0x0430
            r6 = r27[r7]
            java.lang.String r1 = r6.tag
            java.lang.String r22 = "enc"
            r0 = r22
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0418
            if (r8 == 0) goto L_0x008b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/encryption/decrypt-stanza, duplicate <enc> message.id="
            r1.append(r0)
            java.lang.String r0 = r4.A03
            X.C36341k9.A1O(r1, r0)
        L_0x0088:
            int r7 = r7 + 1
            goto L_0x0066
        L_0x008b:
            java.lang.Byte r0 = X.C34681hT.A06(r6)
            if (r0 != 0) goto L_0x0099
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/encryption/decrypt-stanza invalid retry count, message.id="
            goto L_0x0012
        L_0x0099:
            byte r23 = r0.byteValue()
            X.9nx r0 = r6.toProtocolTreeNode()     // Catch:{ 19b -> 0x041f }
            X.630 r8 = X.C111475cL.A00(r0)     // Catch:{ 19b -> 0x041f }
            int r9 = r8.A01
            r6 = 2
            if (r9 == r6) goto L_0x00ba
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/encryption/decrypt-stanza bad cipher version: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", message.id="
            goto L_0x0012
        L_0x00ba:
            byte[] r2 = r8.A02
            r10 = 8
            if (r2 != 0) goto L_0x00fc
            r13 = 8
        L_0x00c2:
            byte[] r12 = new byte[r13]
            r0 = 0
            byte r1 = (byte) r0
            r3 = 0
            r12[r0] = r1
            r0 = 1
            r12[r0] = r1
            r1 = 3
            int r0 = r9 >> r10
            byte r0 = (byte) r0
            r12[r6] = r0
            r5 = 4
            byte r0 = (byte) r9
            r12[r1] = r0
            r1 = 5
            int r8 = r8.A00
            int r0 = r8 >> 24
            byte r0 = (byte) r0
            r12[r5] = r0
            r5 = 6
            int r0 = r8 >> 16
            byte r0 = (byte) r0
            r12[r1] = r0
            r1 = 7
            int r0 = r8 >> r10
            byte r0 = (byte) r0
            r12[r5] = r0
            byte r0 = (byte) r8
            r12[r1] = r0
            if (r2 == 0) goto L_0x0100
        L_0x00ef:
            int r0 = r2.length
            if (r3 >= r0) goto L_0x0100
            int r1 = r10 + 1
            byte r0 = r2[r3]
            r12[r10] = r0
            int r3 = r3 + 1
            r10 = r1
            goto L_0x00ef
        L_0x00fc:
            int r0 = r2.length
            int r13 = r0 + 8
            goto L_0x00c2
        L_0x0100:
            com.whatsapp.jid.Jid r1 = r4.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.DeviceJid
            r21 = 0
            if (r0 == 0) goto L_0x010c
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            r21 = r1
        L_0x010c:
            X.C18740tg.A06(r21)
            com.whatsapp.jid.DeviceJid r10 = r4.A03
            java.lang.String r0 = r4.A03
            r42 = r0
            java.lang.String r0 = r4.A02
            r41 = r0
            X.2Sw r5 = new X.2Sw
            r5.<init>()
            r0 = 0
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r5.A00 = r3
            java.lang.Integer r0 = X.C36401kF.A0j()
            r5.A0B = r0
            java.lang.Long r0 = X.C36441kJ.A0y(r23)
            r5.A0F = r0
            r19 = 3
            r18 = 0
            r2 = 1
            r14 = 0
            r0 = 8
            r1 = r44
            if (r13 >= r0) goto L_0x0143
            r0 = r14
            goto L_0x0191
        L_0x0143:
            r15 = 0
            byte r8 = r12[r15]     // Catch:{ InterruptedException -> 0x0312 }
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r11 = r8 << 24
            byte r8 = r12[r2]     // Catch:{ InterruptedException -> 0x0312 }
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 16
            r11 = r11 | r8
            byte r8 = r12[r6]     // Catch:{ InterruptedException -> 0x0312 }
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r0
            r11 = r11 | r8
            r9 = 4
            byte r8 = r12[r19]     // Catch:{ InterruptedException -> 0x0312 }
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r11 | r8
            r16 = 5
            byte r8 = r12[r9]     // Catch:{ InterruptedException -> 0x0312 }
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r9 = r8 << 24
            r17 = 6
            byte r8 = r12[r16]     // Catch:{ InterruptedException -> 0x0312 }
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 16
            r9 = r9 | r8
            r16 = 7
            byte r8 = r12[r17]     // Catch:{ InterruptedException -> 0x0312 }
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r0
            r9 = r9 | r8
            byte r8 = r12[r16]     // Catch:{ InterruptedException -> 0x0312 }
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = r9 | r8
            if (r13 == r0) goto L_0x018c
            int r13 = r13 - r0
            byte[] r14 = new byte[r13]     // Catch:{ InterruptedException -> 0x0312 }
        L_0x0180:
            if (r15 >= r13) goto L_0x018c
            int r8 = r0 + 1
            byte r0 = r12[r0]     // Catch:{ InterruptedException -> 0x0312 }
            r14[r15] = r0     // Catch:{ InterruptedException -> 0x0312 }
            int r15 = r15 + 1
            r0 = r8
            goto L_0x0180
        L_0x018c:
            X.630 r0 = new X.630     // Catch:{ InterruptedException -> 0x0312 }
            r0.<init>(r14, r11, r9)     // Catch:{ InterruptedException -> 0x0312 }
        L_0x0191:
            X.6EZ r11 = X.C133256Xm.A02(r21)     // Catch:{ InterruptedException -> 0x0306 }
            int r12 = r0.A01     // Catch:{ InterruptedException -> 0x0306 }
            if (r12 != r6) goto L_0x02fb
            X.189 r8 = r1.A06     // Catch:{ InterruptedException -> 0x0306 }
            boolean r8 = r8.A0X()     // Catch:{ InterruptedException -> 0x0306 }
            if (r8 != 0) goto L_0x01d1
            boolean r8 = r1.A05()     // Catch:{ InterruptedException -> 0x0306 }
            if (r8 != 0) goto L_0x01d1
            X.187 r9 = r1.A07     // Catch:{ ExecutionException -> 0x01c3 }
            X.7qd r8 = new X.7qd     // Catch:{ ExecutionException -> 0x01c3 }
            r35 = 1
            r29 = r8
            r30 = r21
            r31 = r0
            r32 = r25
            r33 = r1
            r34 = r11
            r29.<init>(r30, r31, r32, r33, r34, r35)     // Catch:{ ExecutionException -> 0x01c3 }
            java.lang.Object r8 = X.C90504aG.A0i(r9, r8)     // Catch:{ ExecutionException -> 0x01c3 }
            X.6Nt r8 = (X.C131106Nt) r8     // Catch:{ ExecutionException -> 0x01c3 }
            goto L_0x01d9
        L_0x01c3:
            r8 = move-exception
            java.lang.Throwable r9 = r8.getCause()     // Catch:{ InterruptedException -> 0x0306 }
            boolean r8 = r9 instanceof java.lang.Error     // Catch:{ InterruptedException -> 0x0306 }
            if (r8 != 0) goto L_0x0305
            java.lang.AssertionError r8 = X.C90524aI.A0Y(r9)     // Catch:{ InterruptedException -> 0x0306 }
            throw r8     // Catch:{ InterruptedException -> 0x0306 }
        L_0x01d1:
            r9 = r21
            r8 = r25
            X.6Nt r8 = A00(r1, r11, r9, r0, r8)     // Catch:{ InterruptedException -> 0x0306 }
        L_0x01d9:
            int r11 = r8.A00     // Catch:{ InterruptedException -> 0x0306 }
            if (r11 != 0) goto L_0x0292
            byte[] r8 = r8.A01     // Catch:{ 186 -> 0x0280 }
            X.8SX r8 = X.AnonymousClass8SX.A0i(r8)     // Catch:{ 186 -> 0x0280 }
            X.4uD r14 = r8.call_     // Catch:{ 186 -> 0x0280 }
            if (r14 != 0) goto L_0x01e9
            X.4uD r14 = X.C99944uD.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0280 }
        L_0x01e9:
            X.AUx r8 = r14.callKey_     // Catch:{ 186 -> 0x0280 }
            byte[] r15 = r8.A06()     // Catch:{ 186 -> 0x0280 }
            X.AUx r8 = r14.conversionData_     // Catch:{ 186 -> 0x0274, InterruptedException -> 0x030c }
            byte[] r13 = r8.A06()     // Catch:{ 186 -> 0x0274, InterruptedException -> 0x030c }
            java.lang.String r12 = r14.conversionSource_     // Catch:{ 186 -> 0x026f, InterruptedException -> 0x0269 }
            if (r10 == 0) goto L_0x0209
            com.whatsapp.jid.UserJid r11 = r10.userJid     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            if (r11 == 0) goto L_0x0209
            int r8 = r14.bitField0_     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            r8 = r8 & 4
            boolean r8 = X.AnonymousClass000.A1P(r8)
            r9 = 0
            if (r8 == 0) goto L_0x0267
            goto L_0x020f
        L_0x0209:
            X.54P r8 = new X.54P     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            r8.<init>()     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            goto L_0x0257
        L_0x020f:
            X.AUx r8 = r14.conversionData_     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            if (r8 == 0) goto L_0x0267
            java.lang.String r10 = r8.A04()     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
        L_0x0217:
            int r8 = r14.bitField0_     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            r8 = r8 & 2
            if (r8 == 0) goto L_0x021f
            java.lang.String r9 = r14.conversionSource_     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
        L_0x021f:
            java.lang.String r33 = ""
            boolean r8 = android.text.TextUtils.isEmpty(r10)     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            if (r8 != 0) goto L_0x0261
            boolean r8 = android.text.TextUtils.isEmpty(r9)     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            if (r8 != 0) goto L_0x0261
            X.C18740tg.A06(r10)     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            X.C18740tg.A06(r9)     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            java.util.ArrayList r34 = X.AnonymousClass001.A0I()     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            long r36 = java.lang.System.currentTimeMillis()     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            X.AnonymousClass00C.A0D(r10, r6)     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            r8 = 3
            X.AnonymousClass00C.A0D(r9, r8)     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            r38 = 0
            r35 = -1
            X.8aS r8 = new X.8aS     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            r39 = 0
            r40 = 0
            r29 = r8
            r30 = r11
            r31 = r10
            r32 = r9
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r38, r39, r40)     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
        L_0x0257:
            r18 = r8
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            r5.A00 = r9     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            goto L_0x03a3
        L_0x0261:
            X.54P r8 = new X.54P     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            r8.<init>()     // Catch:{ 186 -> 0x027a, InterruptedException -> 0x0319 }
            goto L_0x0257
        L_0x0267:
            r10 = r9
            goto L_0x0217
        L_0x0269:
            r9 = move-exception
            r8 = r18
            r12 = r8
            goto L_0x031c
        L_0x026f:
            r11 = move-exception
            r8 = r18
            r12 = r8
            goto L_0x027d
        L_0x0274:
            r11 = move-exception
            r8 = r18
            r13 = r8
            r12 = r8
            goto L_0x027d
        L_0x027a:
            r11 = move-exception
            r8 = r18
        L_0x027d:
            r18 = r15
            goto L_0x0285
        L_0x0280:
            r11 = move-exception
            r8 = r18
            r13 = r8
            r12 = r8
        L_0x0285:
            java.lang.String r10 = "plaintext does not represent a valid protocol buffer"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ InterruptedException -> 0x028d }
            r9.<init>(r10, r11)     // Catch:{ InterruptedException -> 0x028d }
            throw r9     // Catch:{ InterruptedException -> 0x028d }
        L_0x028d:
            r9 = move-exception
            r15 = r18
            goto L_0x031c
        L_0x0292:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ InterruptedException -> 0x0306 }
            java.lang.String r8 = "voip/encryption/decryptCallPayload/failed_to_decrypt_e2e_key. status="
            X.C36321k7.A1T(r8, r9, r11)     // Catch:{ InterruptedException -> 0x0306 }
            r8 = -1008(0xfffffffffffffc10, float:NaN)
            if (r11 != r8) goto L_0x02a6
            java.lang.Integer r8 = X.C36381kD.A0n()     // Catch:{ InterruptedException -> 0x0306 }
            r5.A08 = r8     // Catch:{ InterruptedException -> 0x0306 }
            goto L_0x02f6
        L_0x02a6:
            r8 = -1003(0xfffffffffffffc15, float:NaN)
            if (r11 != r8) goto L_0x02b1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r19)     // Catch:{ InterruptedException -> 0x0306 }
            r5.A08 = r8     // Catch:{ InterruptedException -> 0x0306 }
            goto L_0x02f6
        L_0x02b1:
            r8 = -1010(0xfffffffffffffc0e, float:NaN)
            r9 = 4
            if (r11 != r8) goto L_0x02c7
            java.lang.String r8 = "voip/encryption/decryptCallPayload/bad identity"
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ InterruptedException -> 0x0306 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0306 }
            r8 = r18
            android.util.Pair r0 = X.C36441kJ.A0Q(r9, r8)     // Catch:{ InterruptedException -> 0x0306 }
            goto L_0x037c
        L_0x02c7:
            r8 = -1002(0xfffffffffffffc16, float:NaN)
            if (r11 != r8) goto L_0x02d2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0306 }
            r5.A08 = r8     // Catch:{ InterruptedException -> 0x0306 }
            goto L_0x02f6
        L_0x02d2:
            r8 = -1001(0xfffffffffffffc17, float:NaN)
            if (r11 != r8) goto L_0x02e7
            java.lang.String r8 = "voip/encryption/decryptCallPayload/duplicated e2e keys"
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ InterruptedException -> 0x0306 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ InterruptedException -> 0x0306 }
            r8 = r18
            android.util.Pair r0 = X.C36441kJ.A0Q(r9, r8)     // Catch:{ InterruptedException -> 0x0306 }
            goto L_0x037c
        L_0x02e7:
            r8 = -1007(0xfffffffffffffc11, float:NaN)
            if (r11 != r8) goto L_0x02f2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ InterruptedException -> 0x0306 }
            r5.A08 = r8     // Catch:{ InterruptedException -> 0x0306 }
            goto L_0x02f6
        L_0x02f2:
            r8 = r20
            r5.A08 = r8     // Catch:{ InterruptedException -> 0x0306 }
        L_0x02f6:
            r8 = r18
            r13 = r8
            r12 = r8
            goto L_0x0327
        L_0x02fb:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ InterruptedException -> 0x0306 }
            java.lang.String r8 = "invalid ciphertext version; ciphertextVersion="
            java.lang.IllegalArgumentException r9 = X.AnonymousClass000.A0d(r8, r9, r12)     // Catch:{ InterruptedException -> 0x0306 }
        L_0x0305:
            throw r9     // Catch:{ InterruptedException -> 0x0306 }
        L_0x0306:
            r9 = move-exception
            r8 = r18
            r15 = r8
            r13 = r8
            goto L_0x0310
        L_0x030c:
            r9 = move-exception
            r8 = r18
            r13 = r8
        L_0x0310:
            r12 = r8
            goto L_0x031c
        L_0x0312:
            r9 = move-exception
            r8 = r18
            r15 = r8
            r13 = r8
            r12 = r8
            goto L_0x031e
        L_0x0319:
            r9 = move-exception
            r8 = r18
        L_0x031c:
            r18 = r0
        L_0x031e:
            java.lang.String r0 = "voip/encryption/decryptCallPayload/failed_to_decrypt_e2e_key: "
            com.whatsapp.util.Log.i(r0, r9)
            r0 = r18
            r18 = r15
        L_0x0327:
            r14 = 1
            if (r0 != 0) goto L_0x03a6
            java.lang.String r0 = "voip/encryption/decryptCallPayload got null e2e message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.A00 = r3
            java.lang.Integer r0 = X.C36421kH.A0U()
            r5.A08 = r0
        L_0x0337:
            java.lang.Boolean r0 = r5.A00
            boolean r0 = r0.booleanValue()
            X.0yW r3 = r1.A0D
            if (r0 == 0) goto L_0x039a
            r3.Bly(r5)
        L_0x0344:
            if (r14 == 0) goto L_0x0398
            X.189 r0 = r1.A06
            boolean r0 = r0.A0X()
            if (r0 != 0) goto L_0x038e
            boolean r0 = r1.A05()
            if (r0 != 0) goto L_0x038e
            X.187 r0 = r1.A07
            X.3vX r2 = new X.3vX
            r34 = 1
            r29 = r2
            r30 = r1
            r31 = r26
            r32 = r42
            r33 = r23
            r29.<init>(r30, r31, r32, r33, r34)
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00
            r0.submit(r2)
        L_0x036c:
            r0 = 3
        L_0x036d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.5up r1 = new X.5up
            r0 = r18
            r1.<init>(r8, r12, r0, r13)
            android.util.Pair r0 = X.C36441kJ.A0Q(r2, r1)
        L_0x037c:
            int r6 = X.C36381kD.A04(r0)
            if (r6 == 0) goto L_0x03ff
            r1 = 0
            X.6LR r0 = new X.6LR
            r3 = r1
            r4 = r1
            r2 = r1
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x038e:
            r3 = r42
            r2 = r26
            r0 = r23
            A02(r1, r3, r2, r0)
            goto L_0x036c
        L_0x0398:
            r0 = 0
            goto L_0x036d
        L_0x039a:
            X.0u5 r0 = new X.0u5
            r0.<init>(r2, r2)
            r3.Bls(r5, r0, r2)
            goto L_0x0344
        L_0x03a3:
            r18 = r15
            r14 = 0
        L_0x03a6:
            int r11 = r0.A00
            if (r11 != 0) goto L_0x03dc
            r9 = r20
        L_0x03ac:
            r5.A06 = r9
        L_0x03ae:
            int r9 = r0.A01
            if (r9 != r6) goto L_0x03c0
            r9 = 2
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r5.A0E = r0
        L_0x03ba:
            r0 = r20
            r5.A07 = r0
            goto L_0x0337
        L_0x03c0:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/encryption/decryptCallPayload doesn't know how to handle the ciphertext version received: callId="
            r6.append(r0)
            r0 = r41
            r6.append(r0)
            java.lang.String r0 = " v="
            X.C36321k7.A1U(r0, r6, r9)
            r5.A00 = r3
            java.lang.Integer r0 = X.C36401kF.A0i()
            r5.A08 = r0
            goto L_0x03ba
        L_0x03dc:
            if (r11 != r2) goto L_0x03e3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            goto L_0x03ac
        L_0x03e3:
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()
            java.lang.String r9 = "voip/encryption/decryptCallPayload unrecognized ciphertext type; callId="
            r10.append(r9)
            r9 = r41
            r10.append(r9)
            java.lang.String r9 = " type="
            X.C36321k7.A1U(r9, r10, r11)
            r5.A00 = r3
            java.lang.Integer r9 = X.C36391kE.A0r()
            r5.A08 = r9
            goto L_0x03ae
        L_0x03ff:
            java.lang.Object r0 = r0.second
            X.5up r0 = (X.C122425up) r0
            byte[] r2 = r0.A02
            byte[] r3 = r0.A03
            X.9TX r5 = r0.A00
            com.whatsapp.protocol.VoipStanzaChildNode$Builder r1 = new com.whatsapp.protocol.VoipStanzaChildNode$Builder
            r0 = r22
            r1.<init>(r0)
            r1.setData(r2)
            com.whatsapp.protocol.VoipStanzaChildNode r6 = r1.build()
            r8 = 1
        L_0x0418:
            r0 = r24
            r0.addChild(r6)
            goto L_0x0088
        L_0x041f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/encryption/decrypt-stanza fail to parse enc node, message.id="
            r1.append(r0)
            java.lang.String r0 = r4.A03
            X.C36321k7.A1a(r1, r0)
            X.6LR r0 = X.AnonymousClass6LR.A06
            return r0
        L_0x0430:
            if (r8 == 0) goto L_0x0436
            com.whatsapp.protocol.VoipStanzaChildNode r28 = r24.build()
        L_0x0436:
            r10 = 0
            X.6LR r0 = new X.6LR
            r4 = r0
            r6 = r28
            r7 = r2
            r8 = r3
            r9 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WM.A03(X.5Iw):X.6LR");
    }

    public void A04(DeviceJid deviceJid, String str, byte[] bArr, int i) {
        DeviceJid deviceJid2;
        int i2 = i;
        if (i < 0 || i > 4) {
            C36321k7.A1T("voip/receive_message/onPeerE2EDecryptionFailed do nothing for retry count: ", AnonymousClass000.A0u(), i);
            return;
        }
        if (bArr == null || bArr.length != 4) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/receive_message/onPeerE2EDecryptionFailed e2e decryption failure; invalid remote remoteRegBytes id; remoteRegistrationId=");
            C36321k7.A1a(A0u, Arrays.toString(bArr));
            C1256060o r1 = this.A02;
            Log.i("VoiceService/SessionAndIdentityCallback/notifyFatalError");
            r1.A00.A0R(30, (String) null);
            return;
        }
        int A012 = C203239na.A01(bArr, 0);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("voip/receive_message/onPeerE2EDecryptionFailed peer e2e decryption failure; remoteRegistrationId=");
        A0u2.append(A012);
        A0u2.append(" retryCount: ");
        A0u2.append(i);
        DeviceJid deviceJid3 = deviceJid;
        C36321k7.A1K(deviceJid, " from: ", A0u2);
        String str2 = str;
        if (this.A06.A0X() || A05()) {
            deviceJid2 = A01(this, deviceJid, str, i, A012);
        } else {
            try {
                deviceJid2 = (DeviceJid) C90504aG.A0i(this.A07, new C1507776s(this, deviceJid3, str2, i2, A012));
            } catch (InterruptedException | ExecutionException e) {
                Log.i("voip/receive_message/onPeerE2EDecryptionFailed session retry threw: ", e);
                C1256060o r12 = this.A02;
                Log.i("VoiceService/SessionAndIdentityCallback/notifyFatalError");
                r12.A00.A0R(30, (String) null);
                return;
            }
        }
        if (deviceJid2 != null) {
            this.A02.A00(deviceJid2);
        }
    }

    public boolean A05() {
        int i;
        C30521aL r1 = this.A0H;
        if (r1.A02.A02()) {
            i = r1.A0Y;
        } else {
            i = 0;
        }
        if (i < this.A0C.A07(6477) || !this.A06.A0K.A04.A0E(4883)) {
            return false;
        }
        return true;
    }

    public AnonymousClass6WM(C233418c r2, C20300xL r3, C1256060o r4, AnonymousClass67L r5, C30431aC r6, AnonymousClass189 r7, AnonymousClass187 r8, AnonymousClass18I r9, AnonymousClass1IN r10, C117135ll r11, C232217q r12, AnonymousClass1OD r13, C20810yC r14, C21010yW r15, C30521aL r16) {
        this.A0C = r14;
        this.A0D = r15;
        this.A0F = r9;
        this.A07 = r8;
        this.A0E = r3;
        this.A03 = r5;
        this.A01 = r2;
        this.A06 = r7;
        this.A0B = r13;
        this.A0H = r16;
        this.A05 = r6;
        this.A0A = r12;
        this.A0G = r11;
        this.A08 = r10;
        this.A02 = r4;
    }
}
