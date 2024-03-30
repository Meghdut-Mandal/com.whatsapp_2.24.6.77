package X;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.SecretKey;

/* renamed from: X.6ut  reason: invalid class name and case insensitive filesystem */
public final class C146016ut implements C160087kR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C128786Dp A02;
    public final /* synthetic */ C159627jf A03;
    public final /* synthetic */ AnonymousClass5G3 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ Map A0A;
    public final /* synthetic */ Map A0B;
    public final /* synthetic */ SecretKey A0C;
    public final /* synthetic */ byte[] A0D;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: type inference failed for: r1v66 */
    /* JADX WARNING: type inference failed for: r1v67 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0138, code lost:
        if (r7 == false) goto L_0x0127;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B2J(X.C123815x8 r22) {
        /*
            r21 = this;
            r4 = 0
            r7 = r22
            X.AnonymousClass00C.A0D(r7, r4)
            r0 = r21
            X.5G3 r10 = r0.A04
            X.1KT r6 = r10.A09
            boolean r1 = r10.A02
            r3 = 1
            r1 = r1 ^ 1
            int r15 = r0.A01
            if (r1 == 0) goto L_0x0334
            java.lang.String r1 = "forward_network_1_end"
        L_0x0017:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r6.A08(r5, r1)
            int r2 = r7.A00
            r1 = 0
            if (r2 != 0) goto L_0x01e9
            X.60z r2 = r7.A03
            java.lang.String r7 = "null cannot be cast to non-null type com.whatsapp.wabloks.commerce.network.extensions.dataexchange.ExtensionsDataExchangeGraphqlDataProcessor"
            X.AnonymousClass00C.A0E(r2, r7)
            X.50C r2 = (X.AnonymousClass50C) r2
            java.lang.Object r12 = r2.A00
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x004a
            X.6TM r1 = r10.A0D
            java.lang.String r2 = r1.A02()
            java.lang.String r1 = r10.A01
            java.util.LinkedHashMap r13 = X.AnonymousClass6TM.A00(r2, r1)
            X.7jf r9 = r0.A03
            r12 = 0
            java.util.Map r14 = r0.A0B
            java.lang.String r11 = "extensions-decryption-failed-data-is-null"
        L_0x0045:
            r15 = 0
        L_0x0046:
            X.AnonymousClass5G3.A02(r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x004a:
            X.67S r11 = r10.A0E
            javax.crypto.SecretKey r13 = r0.A0C
            byte[] r14 = r0.A0D
            boolean r7 = r10.A02
            r17 = r7 ^ 1
            r16 = 1
            java.lang.String r8 = r11.A00(r12, r13, r14, r15, r16, r17)
            boolean r7 = r10.A02
            r7 = r7 ^ 1
            if (r7 == 0) goto L_0x0141
            java.lang.String r7 = "decryption_1_end"
        L_0x0062:
            r6.A08(r5, r7)
            if (r8 != 0) goto L_0x0076
            java.util.Map r13 = r0.A0A
            X.6Dp r5 = r0.A02
            java.util.Map r14 = r5.A05
            X.7jf r9 = r0.A03
            java.lang.String r11 = "response-decryption-error"
            java.lang.String r12 = "We failed to decrypt your payload. Please check your encryption/decryption logic."
            X.AnonymousClass5G3.A01(r9, r10, r11, r12, r13, r14)
        L_0x0076:
            int r2 = r2.A00
            if (r2 != 0) goto L_0x0183
            java.util.Map r11 = X.AnonymousClass977.A00(r8)
            java.lang.String r12 = r0.A08
            if (r12 == 0) goto L_0x016e
            java.lang.String r13 = r0.A09
            if (r13 == 0) goto L_0x016e
            if (r11 == 0) goto L_0x016e
            X.0wU r2 = r10.A0C
            java.lang.String r14 = r0.A07
            java.lang.String r15 = r0.A05
            X.73m r9 = new X.73m
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r2.Boy(r9)
            java.lang.String r2 = "screen"
            java.lang.String r2 = X.C90464aC.A0Z(r2, r11)
            java.util.Map r5 = r0.A0A
            java.lang.String r6 = "routing_model"
            java.lang.Object r8 = r5.get(r6)
            boolean r6 = r8 instanceof java.util.Map
            if (r6 == 0) goto L_0x013e
            java.util.Map r8 = (java.util.Map) r8
        L_0x00aa:
            java.lang.String r6 = "entry_screens"
            java.lang.Object r7 = r5.get(r6)
            boolean r6 = r7 instanceof java.util.List
            if (r6 == 0) goto L_0x013b
            java.util.List r7 = (java.util.List) r7
        L_0x00b6:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>(r11)
            java.lang.String r6 = r0.A06
            if (r6 == 0) goto L_0x00c4
            java.lang.String r1 = "prev_screen_name"
            r13.put(r1, r6)
        L_0x00c4:
            X.60x r15 = r10.A08
            r16 = r6
            r17 = r2
            r18 = r14
            r19 = r7
            r20 = r8
            X.5SF r6 = r15.A00(r16, r17, r18, r19, r20)
            X.5SF r1 = X.AnonymousClass5SF.VALID
            boolean r7 = X.C36361kB.A1a(r6, r1)
            java.util.Map r14 = r0.A0B
            java.lang.String r1 = "is_draft"
            java.lang.Object r1 = r14.get(r1)
            boolean r8 = X.C36371kC.A1X(r1, r3)
            X.0yC r6 = r10.A0B
            r1 = 4425(0x1149, float:6.201E-42)
            boolean r1 = r6.A0E(r1)
            java.lang.String r11 = "extensions-invalid-screen-transition-error"
            if (r1 == 0) goto L_0x0138
            if (r7 != 0) goto L_0x0131
            X.6Dp r1 = r0.A02
            java.util.Map r7 = r1.A05
            X.7jf r9 = r0.A03
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "Screen transition to "
            r6.append(r1)
            r6.append(r2)
            java.lang.String r1 = " is invalid. Please check your routing model."
            java.lang.String r18 = X.AnonymousClass000.A0q(r1, r6)
            java.lang.String r17 = "invalid-screen-transition"
            r15 = r9
            r16 = r10
            r19 = r5
            r20 = r7
            X.AnonymousClass5G3.A01(r15, r16, r17, r18, r19, r20)
            if (r8 != 0) goto L_0x0145
            int r5 = r0.A00
            r1 = 120(0x78, float:1.68E-43)
            if (r5 >= r1) goto L_0x0145
            X.6TM r2 = r10.A0D
            java.lang.String r1 = "Business has published extension with invalid routing model."
            r2.A03(r11, r1, r14)
        L_0x0127:
            java.util.List r1 = r10.A0G
            r1.add(r11)
            java.util.List r1 = r10.A0F
            r1.add(r11)
        L_0x0131:
            X.7jf r9 = r0.A03
            r11 = 0
            r15 = 1
            r12 = r11
            goto L_0x0046
        L_0x0138:
            if (r7 != 0) goto L_0x0131
            goto L_0x0127
        L_0x013b:
            r7 = r1
            goto L_0x00b6
        L_0x013e:
            r8 = r1
            goto L_0x00aa
        L_0x0141:
            java.lang.String r7 = "decryption_end"
            goto L_0x0062
        L_0x0145:
            r12 = 0
            r10.A01 = r12
            X.0wG r5 = r10.A06
            if (r8 == 0) goto L_0x0166
            r1 = 2131889635(0x7f120de3, float:1.941394E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            if (r2 != 0) goto L_0x0155
            java.lang.String r2 = ""
        L_0x0155:
            r0[r4] = r2
            java.lang.String r1 = r5.A02(r1, r0)
        L_0x015b:
            X.AnonymousClass00C.A0B(r1)
            java.lang.String r0 = r10.A01
            java.util.LinkedHashMap r13 = X.AnonymousClass6TM.A00(r1, r0)
            goto L_0x0045
        L_0x0166:
            r0 = 2131889639(0x7f120de7, float:1.9413947E38)
            java.lang.String r1 = r5.A01(r0)
            goto L_0x015b
        L_0x016e:
            X.6TM r1 = r10.A0D
            java.lang.String r2 = r1.A02()
            java.lang.String r1 = r10.A01
            java.util.LinkedHashMap r13 = X.AnonymousClass6TM.A00(r2, r1)
            X.7jf r9 = r0.A03
            r12 = 0
            java.util.Map r14 = r0.A0B
            java.lang.String r11 = "extensions-decryption-failed-exception"
            goto L_0x0045
        L_0x0183:
            java.lang.String r6 = X.AnonymousClass6OE.A00(r8)
            java.lang.String r11 = "extensions-invalid-flow-token-error"
            if (r6 != 0) goto L_0x0195
            java.util.List r1 = r10.A0G
            r1.add(r11)
            java.util.List r1 = r10.A0F
            r1.add(r11)
        L_0x0195:
            r1 = 0
            r10.A01 = r1
            X.6TM r3 = r10.A0D
            java.util.Map r14 = r0.A0B
            java.lang.String r1 = "business_jid"
            java.lang.String r17 = X.C36431kI.A1A(r1, r14)
            java.lang.String r1 = "message_id"
            java.lang.String r18 = X.C36431kI.A1A(r1, r14)
            java.lang.String r1 = "action_name"
            java.lang.String r2 = X.C90464aC.A0a(r1, r14)
            r1 = 2
            X.AnonymousClass00C.A0D(r2, r1)
            if (r18 == 0) goto L_0x01c4
            X.0wU r1 = r3.A02
            r20 = 2
            X.73K r15 = new X.73K
            r16 = r3
            r19 = r2
            r15.<init>(r16, r17, r18, r19, r20)
            r1.Boy(r15)
        L_0x01c4:
            X.2ov r1 = X.C52122ov.A02
            java.lang.String r5 = r1.key
            if (r6 != 0) goto L_0x01e7
            X.0wG r2 = r10.A06
            r1 = 2131889644(0x7f120dec, float:1.9413957E38)
            java.lang.String r4 = X.C36371kC.A0v(r2, r1)
        L_0x01d3:
            r12 = 0
            r1 = -1
            X.6Bf r3 = new X.6Bf
            r3.<init>(r4, r12, r1)
            java.util.Map r13 = X.C36391kE.A11(r5, r3)
            X.7jf r9 = r0.A03
            if (r6 != 0) goto L_0x0045
            java.lang.String r11 = "extensions-decryption-failed-exception"
            goto L_0x0045
        L_0x01e7:
            r4 = r6
            goto L_0x01d3
        L_0x01e9:
            X.66O r7 = r7.A04
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.wabloks.commerce.network.extensions.dataexchange.ExtensionsDataExchangeGraphqlErrorProcessor"
            X.AnonymousClass00C.A0E(r7, r2)
            java.lang.Object r2 = r7.A00(r1)
            java.lang.Number r2 = (java.lang.Number) r2
            r8 = 2498098(0x261e32, float:3.500581E-39)
            if (r2 == 0) goto L_0x0204
            int r2 = r2.intValue()
            if (r2 != r8) goto L_0x0204
            r6.A07(r5)
        L_0x0204:
            boolean r2 = r10.A02
            r6 = 10
            if (r2 == 0) goto L_0x0268
            java.util.Map r2 = r7.A00
            if (r2 == 0) goto L_0x0268
            java.util.Set r5 = r2.keySet()
            if (r5 == 0) goto L_0x0268
            r2 = 2498061(0x261e0d, float:3.500529E-39)
            boolean r2 = X.AnonymousClass000.A1Z(r5, r2)
            if (r2 != r3) goto L_0x0268
            java.util.List r5 = r10.A0G
            java.lang.String r2 = "extensions-business-decryption-error"
            r5.add(r2)
            java.util.List r9 = r10.A0F
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()
            java.util.Map r7 = r7.A01
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r7.get(r5)
            X.6Sy r2 = (X.C132286Sy) r2
            if (r2 == 0) goto L_0x0266
            java.lang.String r2 = r2.A06
        L_0x023a:
            r8.append(r2)
            r8.append(r6)
            java.lang.Object r2 = r7.get(r5)
            X.6Sy r2 = (X.C132286Sy) r2
            if (r2 == 0) goto L_0x024a
            java.lang.String r1 = r2.A05
        L_0x024a:
            java.lang.String r1 = X.AnonymousClass000.A0q(r1, r8)
            r9.add(r1)
            long r5 = r10.A00
            r1 = 1
            long r5 = r5 + r1
            r10.A00 = r5
            r10.A02 = r4
            r10.A03 = r3
            java.util.Map r2 = r0.A0A
            X.6Dp r1 = r0.A02
            X.7jf r0 = r0.A03
            X.AnonymousClass5G3.A00(r1, r0, r10, r2)
            return
        L_0x0266:
            r2 = r1
            goto L_0x023a
        L_0x0268:
            java.util.Map r2 = r7.A00
            if (r2 == 0) goto L_0x0327
            java.util.Set r5 = r2.keySet()
            if (r5 == 0) goto L_0x0327
            r2 = 2498058(0x261e0a, float:3.500525E-39)
            boolean r2 = X.AnonymousClass000.A1Z(r5, r2)
            if (r2 != r3) goto L_0x0327
            X.0wG r5 = r10.A06
            r2 = 2131889640(0x7f120de8, float:1.941395E38)
            java.lang.String r8 = r5.A01(r2)
            java.lang.String r11 = "extensions-timeout-error"
        L_0x0286:
            X.AnonymousClass00C.A0B(r8)
            X.0yC r5 = r10.A0B
            r2 = 3192(0xc78, float:4.473E-42)
            java.lang.String r2 = r5.A09(r2)
            if (r2 == 0) goto L_0x0299
            java.lang.String r1 = ","
            java.util.List r1 = X.C90494aF.A0i(r2, r1)
        L_0x0299:
            java.util.Map r9 = r7.A00
            if (r9 == 0) goto L_0x02a9
            if (r1 == 0) goto L_0x02a9
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0306
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0306
        L_0x02a9:
            r9 = 0
        L_0x02aa:
            java.lang.String r2 = r10.A01
            if (r2 == 0) goto L_0x02ea
            int r1 = r2.length()
            if (r1 == 0) goto L_0x02ea
            java.util.LinkedHashMap r13 = X.AnonymousClass6TM.A00(r8, r2)
        L_0x02b8:
            X.7jf r9 = r0.A03
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.util.Map r3 = r7.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r3.get(r2)
            X.6Sy r1 = (X.C132286Sy) r1
            if (r1 == 0) goto L_0x02e8
            java.lang.String r1 = r1.A06
        L_0x02ce:
            r5.append(r1)
            r5.append(r6)
            java.lang.Object r1 = r3.get(r2)
            X.6Sy r1 = (X.C132286Sy) r1
            if (r1 == 0) goto L_0x02e6
            java.lang.String r1 = r1.A05
        L_0x02de:
            java.lang.String r12 = X.AnonymousClass000.A0q(r1, r5)
            java.util.Map r14 = r0.A0B
            goto L_0x0045
        L_0x02e6:
            r1 = 0
            goto L_0x02de
        L_0x02e8:
            r1 = 0
            goto L_0x02ce
        L_0x02ea:
            r1 = 2
            X.011[] r5 = new X.AnonymousClass011[r1]
            X.2ov r1 = X.C52122ov.A02
            java.lang.String r2 = r1.key
            X.6Bf r1 = X.C128176Bf.A00(r8)
            X.C36341k9.A1J(r2, r1, r5, r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            java.lang.String r1 = "disable_nfm_cta"
            X.C36341k9.A1J(r1, r2, r5, r3)
            java.util.LinkedHashMap r13 = X.C000400e.A07(r5)
            goto L_0x02b8
        L_0x0306:
            java.util.Iterator r5 = r1.iterator()
        L_0x030a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x02a9
            java.lang.String r1 = X.AnonymousClass001.A0C(r5)
            java.util.Set r2 = r9.keySet()
            int r1 = java.lang.Integer.parseInt(r1)
            boolean r1 = X.AnonymousClass000.A1Z(r2, r1)
            if (r1 == 0) goto L_0x030a
            r9 = 1
            r1 = 0
            r10.A01 = r1
            goto L_0x02aa
        L_0x0327:
            X.0wG r5 = r10.A06
            r2 = 2131889639(0x7f120de7, float:1.9413947E38)
            java.lang.String r8 = r5.A01(r2)
            java.lang.String r11 = "extensions-business-endpoint-response-error"
            goto L_0x0286
        L_0x0334:
            java.lang.String r1 = "forward_network_end"
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146016ut.B2J(X.5x8):void");
    }

    public void BVL(IOException iOException) {
        String str;
        AnonymousClass00C.A0D(iOException, 0);
        AnonymousClass5G3 r3 = this.A04;
        AnonymousClass1KT r2 = r3.A09;
        boolean z = !r3.A02;
        int i = this.A01;
        if (z) {
            str = "forward_network_1_end";
        } else {
            str = "forward_network_end";
        }
        C90494aF.A0x(r2, str, i);
        AnonymousClass5G3.A02(this.A03, r3, "extensions-data-exchange-graphql-response-error", iOException.getMessage(), AnonymousClass6TM.A00(r3.A0D.A02(), r3.A01), this.A0B, false);
    }

    public void BWk(Exception exc) {
        String str;
        AnonymousClass00C.A0D(exc, 0);
        AnonymousClass5G3 r3 = this.A04;
        AnonymousClass1KT r2 = r3.A09;
        boolean z = !r3.A02;
        int i = this.A01;
        if (z) {
            str = "forward_network_1_end";
        } else {
            str = "forward_network_end";
        }
        C90494aF.A0x(r2, str, i);
        LinkedHashMap A002 = AnonymousClass6TM.A00(r3.A0D.A02(), r3.A01);
        C159627jf r22 = this.A03;
        String message = exc.getMessage();
        if (message == null) {
            message = "extensions-data-exchange-graphql-response-error";
        }
        AnonymousClass5G3.A02(r22, r3, message, exc.getMessage(), A002, this.A0B, false);
    }

    public C146016ut(C128786Dp r1, C159627jf r2, AnonymousClass5G3 r3, String str, String str2, String str3, String str4, String str5, Map map, Map map2, SecretKey secretKey, byte[] bArr, int i, int i2) {
        this.A04 = r3;
        this.A01 = i;
        this.A03 = r2;
        this.A0B = map;
        this.A0C = secretKey;
        this.A0D = bArr;
        this.A0A = map2;
        this.A02 = r1;
        this.A08 = str;
        this.A09 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A00 = i2;
        this.A05 = str5;
    }
}
