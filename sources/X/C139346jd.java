package X;

import java.io.IOException;

/* renamed from: X.6jd  reason: invalid class name and case insensitive filesystem */
public class C139346jd implements C160087kR {
    public Object A00;
    public Object A01;
    public final int A02;

    public C139346jd(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(C114665hc r3, Throwable th) {
        C1263463o r1 = new C1263463o();
        r1.A00 = C108395Ti.SCRIPTING_METADATA_DOWNLOAD_FAILURE;
        r1.A03 = th;
        AnonymousClass5VK A002 = r1.A00();
        C1272767q r0 = (C1272767q) r3.A00.A02;
        C139556k5.A01(r0.A03, r0.A04, r0.A05, r0.A06, A002);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B2J(X.C123815x8 r39) {
        /*
            r38 = this;
            r5 = r38
            int r1 = r5.A02
            r0 = 0
            r9 = r39
            switch(r1) {
                case 0: goto L_0x00b8;
                case 1: goto L_0x0159;
                case 2: goto L_0x0168;
                case 3: goto L_0x002c;
                case 4: goto L_0x0180;
                case 5: goto L_0x02db;
                default: goto L_0x000a;
            }
        L_0x000a:
            X.AnonymousClass00C.A0D(r9, r0)
            int r0 = r9.A00
            if (r0 == 0) goto L_0x001e
            X.66O r1 = r9.A04
            if (r1 != 0) goto L_0x0061
            java.lang.Object r1 = r5.A00
            X.61N r1 = (X.AnonymousClass61N) r1
            r0 = 2
        L_0x001a:
            r1.A00(r0)
        L_0x001d:
            return
        L_0x001e:
            X.60z r0 = r9.A03
            java.lang.Object r1 = r0.A00
            X.3He r1 = (X.C62703He) r1
            if (r1 != 0) goto L_0x008a
            java.lang.Object r1 = r5.A00
            X.61N r1 = (X.AnonymousClass61N) r1
            r0 = 3
            goto L_0x001a
        L_0x002c:
            X.AnonymousClass00C.A0D(r9, r0)
            java.lang.Object r0 = r5.A00
            X.02t r0 = (X.C006302t) r0
            X.7TN r4 = new X.7TN
            r4.<init>(r0)
            X.66O r3 = r9.A04
            X.AnonymousClass00C.A08(r3)
            X.60z r2 = r9.A03
            X.AnonymousClass00C.A08(r2)
            int r1 = r9.A00
            r0 = 0
            if (r1 != 0) goto L_0x0053
            java.lang.Object r1 = r2.A00
            if (r1 == 0) goto L_0x001d
            java.lang.Object r0 = r5.A01
            X.02t r0 = (X.C006302t) r0
            r0.invoke(r1)
            return
        L_0x0053:
            java.lang.Object r1 = r3.A00(r0)
            boolean r0 = r1 instanceof X.C111345c8
            if (r0 == 0) goto L_0x001d
            if (r1 == 0) goto L_0x001d
            r4.invoke(r1)
            return
        L_0x0061:
            java.lang.Object r3 = r5.A00
            X.61N r3 = (X.AnonymousClass61N) r3
            r0 = 0
            java.lang.Object r0 = r1.A00(r0)
            X.C18740tg.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r2 = 1
            if (r0 == 0) goto L_0x0085
            int r1 = r0.intValue()
            r0 = 3
            if (r1 == r0) goto L_0x0081
            if (r1 == r2) goto L_0x0081
            r0 = 2
            if (r1 == r0) goto L_0x0081
            r0 = 4
            if (r1 != r0) goto L_0x0085
        L_0x0081:
            r3.A00(r1)
            return
        L_0x0085:
            r0 = -1
            r3.A00(r0)
            return
        L_0x008a:
            java.lang.Object r0 = r5.A00
            X.61N r0 = (X.AnonymousClass61N) r0
            java.lang.String r4 = r1.A00
            com.whatsapp.waffle.wfac.ui.WfacBanViewModel r3 = r0.A00
            X.66X r2 = r3.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WfacBanRepository/storeBanState : "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)
            X.AnonymousClass3TI.A01(r0)
            X.5rX r0 = r2.A00
            X.00T r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r0)
            java.lang.String r0 = "wfac_ban_state"
            X.C36341k9.A0x(r1, r0, r4)
            int r1 = com.whatsapp.waffle.wfac.ui.WfacBanViewModel.A01(r4)
            X.1Rs r0 = r3.A03
            X.C36341k9.A17(r0, r1)
            return
        L_0x00b8:
            X.AnonymousClass00C.A0D(r9, r0)
            X.60z r2 = r9.A03
            X.AnonymousClass00C.A08(r2)
            X.66O r1 = r9.A04
            X.AnonymousClass00C.A08(r1)
            int r0 = r9.A00
            if (r0 == 0) goto L_0x00ea
            r2 = 0
            java.lang.Object r1 = r1.A00(r2)
            boolean r0 = r1 instanceof X.AnonymousClass5UQ
            if (r0 == 0) goto L_0x00d5
            r2 = r1
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L_0x00d5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ARDScriptingMetadataDownloader Error response: "
            X.C36321k7.A1J(r2, r0, r1)
            java.lang.Object r0 = r5.A00
            X.5hc r0 = (X.C114665hc) r0
            if (r2 != 0) goto L_0x00e6
            X.4xE r2 = X.C101244xE.A00
        L_0x00e6:
            A00(r0, r2)
            return
        L_0x00ea:
            java.lang.String r0 = "ARDScriptingMetadataDownloader Success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r2.A00
            X.69a r0 = (X.C1276269a) r0
            if (r0 != 0) goto L_0x00fc
            java.lang.Object r0 = r5.A00
            X.5hc r0 = (X.C114665hc) r0
            X.4xD r2 = X.C101234xD.A00
            goto L_0x00e6
        L_0x00fc:
            java.lang.Object r1 = r5.A00
            X.5hc r1 = (X.C114665hc) r1
            java.lang.String r13 = "fc31f4292caeeaa72f54b7e2c74bcca7963280c3"
            int r3 = r0.A00
            java.lang.String r0 = r0.A01
            com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata r2 = new com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata
            r2.<init>(r13, r3, r0)
            X.74w r0 = r1.A00
            java.lang.Object r5 = r0.A00
            X.5wp r5 = (X.C123635wp) r5
            java.lang.String r4 = r2.mCdnUrl
            int r3 = r2.mRevision
            com.facebook.cameracore.ardelivery.model.ARAssetType r7 = com.facebook.cameracore.ardelivery.model.ARAssetType.SCRIPTING_PACKAGE
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r8 = com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod.ZIP
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0v(r13)
            java.lang.String r2 = ":"
            java.lang.String r20 = X.AnonymousClass000.A0r(r2, r6, r3)
            r9 = 0
            r24 = -1
            r11 = r9
            r12 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r18 = r9
            r19 = r9
            r21 = r9
            r22 = r9
            r26 = -1
            X.6c3 r6 = new X.6c3
            r10 = r9
            r23 = r3
            r17 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26)
            X.6Xw r8 = r5.A00
            java.util.List r13 = java.util.Collections.singletonList(r6)
            X.5YD r11 = new X.5YD
            r11.<init>()
            r2 = 0
            X.6YZ r10 = new X.6YZ
            r10.<init>(r1, r2)
            java.lang.Object r12 = r0.A01
            X.6SG r12 = (X.AnonymousClass6SG) r12
            r8.A09(r9, r10, r11, r12, r13)
            return
        L_0x0159:
            X.AnonymousClass00C.A0D(r9, r0)
            java.lang.Object r1 = r5.A01
            X.1Kq r1 = (X.C26561Kq) r1
            java.lang.Object r0 = r5.A00
            X.5lu r0 = (X.C117225lu) r0
            X.C26561Kq.A00(r1, r0, r9)
            return
        L_0x0168:
            X.AnonymousClass00C.A0D(r9, r0)
            java.lang.Object r0 = r5.A01
            X.6uw r0 = (X.C146046uw) r0
            X.0zE r2 = r0.A05
            r1 = 386138113(0x17040001, float:4.2651505E-25)
            r0 = 2
            r2.markerEnd(r1, r0)
            java.lang.Object r0 = r5.A00
            X.7kR r0 = (X.C160087kR) r0
            r0.B2J(r9)
            return
        L_0x0180:
            X.AnonymousClass00C.A0D(r9, r0)
            int r0 = r9.A00
            if (r0 != 0) goto L_0x01db
            X.60z r1 = r9.A03
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.wabloks.commerce.network.extensions.dataexchange.ExtensionsDataExchangeGraphqlDataProcessor"
            X.AnonymousClass00C.A0E(r1, r0)
            X.50C r1 = (X.AnonymousClass50C) r1
            java.lang.Object r3 = r5.A01
            X.6tl r3 = (X.C145356tl) r3
            X.67S r4 = r3.A09
            java.lang.Object r5 = r1.A00
            X.AnonymousClass00C.A0B(r5)
            java.lang.String r5 = (java.lang.String) r5
            javax.crypto.SecretKey r6 = r3.A0E
            byte[] r7 = r3.A0H
            r2 = 0
            r8 = -1
            r9 = 0
            r10 = 0
            java.lang.String r5 = r4.A00(r5, r6, r7, r8, r9, r10)
            int r0 = r1.A00
            if (r0 != 0) goto L_0x01bf
            if (r5 != 0) goto L_0x01bc
            r7 = 1
            java.lang.String r4 = "extensions-decryption-failed-exception"
        L_0x01b2:
            android.app.Activity r0 = r3.A00
            X.62e r1 = r3.A03
            r8 = 0
            r6 = r2
            X.C145356tl.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x01bc:
            r7 = 0
            r4 = 0
            goto L_0x01b2
        L_0x01bf:
            java.lang.String r6 = X.AnonymousClass6OE.A00(r5)
            if (r6 != 0) goto L_0x01ce
            android.app.Activity r1 = r3.A00
            r0 = 2131889644(0x7f120dec, float:1.9413957E38)
            java.lang.String r6 = X.C36361kB.A0m(r1, r0)
        L_0x01ce:
            android.app.Activity r0 = r3.A00
            X.62e r1 = r3.A03
            java.lang.String r4 = "extensions-invalid-flow-token-error"
            r7 = 1
            r8 = 1
            r5 = r2
            X.C145356tl.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x01db:
            java.lang.Object r13 = r5.A01
            X.6tl r13 = (X.C145356tl) r13
            java.lang.Object r6 = r5.A00
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            X.66O r12 = r9.A04
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.wabloks.commerce.network.extensions.dataexchange.ExtensionsDataExchangeGraphqlErrorProcessor"
            X.AnonymousClass00C.A0E(r12, r0)
            X.2Uv r12 = (X.AnonymousClass2Uv) r12
            java.util.Map r0 = r12.A00
            r4 = 0
            if (r0 == 0) goto L_0x027f
            java.util.Set r2 = r0.keySet()
        L_0x01f5:
            X.AnonymousClass00C.A0B(r2)
            r0 = 2498061(0x261e0d, float:3.500529E-39)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x027c
            java.lang.String r14 = "extensions-business-decryption-error"
        L_0x0207:
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x0282
            java.util.Map r0 = r12.A00
            if (r0 == 0) goto L_0x027a
            java.util.Set r0 = r0.keySet()
        L_0x0213:
            X.AnonymousClass00C.A0B(r0)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0282
            android.app.Activity r12 = r13.A00
            X.62e r11 = r13.A03
            java.lang.String r0 = r13.A0D
            r27 = r0
            java.lang.String r10 = r13.A0C
            java.lang.String r9 = r13.A0B
            java.lang.String r0 = r13.A0A
            r30 = r0
            boolean r8 = r13.A0G
            javax.crypto.SecretKey r15 = r13.A0E
            byte[] r14 = r13.A0H
            X.67S r7 = r13.A09
            X.6MG r5 = r13.A01
            X.17Y r4 = r13.A02
            X.0wU r3 = r13.A08
            X.0xM r2 = r13.A05
            X.0yC r1 = r13.A06
            X.6OE r0 = r13.A04
            X.1A1 r13 = r13.A07
            r33 = 0
            X.6tl r16 = new X.6tl
            r32 = r14
            r34 = r8
            r29 = r9
            r31 = r15
            r26 = r7
            r28 = r10
            r23 = r1
            r24 = r13
            r25 = r3
            r20 = r11
            r21 = r0
            r22 = r2
            r17 = r12
            r18 = r5
            r19 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r8 = 1
            java.lang.String r5 = "UNKNOWN"
            r9 = 0
            r10 = 0
            r0 = r7
            r1 = r16
            r2 = r6
            r3 = r30
            r4 = r27
            r6 = r15
            r7 = r14
            r0.A01(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x027a:
            r0 = r4
            goto L_0x0213
        L_0x027c:
            java.lang.String r14 = "extensions-business-endpoint-response-error"
            goto L_0x0207
        L_0x027f:
            r2 = r4
            goto L_0x01f5
        L_0x0282:
            X.0yC r1 = r13.A06
            r0 = 3192(0xc78, float:4.473E-42)
            java.lang.String r1 = r1.A09(r0)
            if (r1 == 0) goto L_0x02a3
            java.lang.String r0 = ","
            java.util.List r1 = X.C90494aF.A0i(r1, r0)
            if (r1 == 0) goto L_0x02a3
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x02b4
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x02b4
        L_0x029e:
            r0 = 0
        L_0x029f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L_0x02a3:
            android.app.Activity r10 = r13.A00
            X.62e r11 = r13.A03
            boolean r18 = X.C90494aF.A1Y(r4)
            r15 = 0
            r17 = 1
            r16 = r15
            X.C145356tl.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x02b4:
            java.util.Iterator r3 = r1.iterator()
        L_0x02b8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x029e
            java.lang.String r2 = X.AnonymousClass001.A0C(r3)
            java.util.Map r0 = r12.A00
            if (r0 == 0) goto L_0x02d9
            java.util.Set r1 = r0.keySet()
        L_0x02ca:
            X.AnonymousClass00C.A0B(r1)
            int r0 = java.lang.Integer.parseInt(r2)
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r0 == 0) goto L_0x02b8
            r0 = 1
            goto L_0x029f
        L_0x02d9:
            r1 = r4
            goto L_0x02ca
        L_0x02db:
            X.AnonymousClass00C.A0D(r9, r0)
            int r0 = r9.A00
            if (r0 != 0) goto L_0x0336
            X.60z r1 = r9.A03
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.wabloks.commerce.network.extensions.dataexchange.ExtensionsDataExchangeGraphqlDataProcessor"
            X.AnonymousClass00C.A0E(r1, r0)
            X.50C r1 = (X.AnonymousClass50C) r1
            java.lang.Object r3 = r5.A01
            X.6tm r3 = (X.C145366tm) r3
            X.67S r4 = r3.A0C
            java.lang.Object r5 = r1.A00
            X.AnonymousClass00C.A0B(r5)
            java.lang.String r5 = (java.lang.String) r5
            javax.crypto.SecretKey r6 = r3.A0H
            byte[] r7 = r3.A0K
            r2 = 0
            r8 = -1
            r9 = 0
            r10 = 0
            java.lang.String r5 = r4.A00(r5, r6, r7, r8, r9, r10)
            int r0 = r1.A00
            if (r0 != 0) goto L_0x031a
            if (r5 != 0) goto L_0x0317
            r7 = 1
            java.lang.String r4 = "extensions-decryption-failed-exception"
        L_0x030d:
            android.app.Activity r0 = r3.A00
            X.33w r1 = r3.A04
            r8 = 0
            r6 = r2
            X.C145366tm.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0317:
            r7 = 0
            r4 = 0
            goto L_0x030d
        L_0x031a:
            java.lang.String r6 = X.AnonymousClass6OE.A00(r5)
            if (r6 != 0) goto L_0x0329
            android.app.Activity r1 = r3.A00
            r0 = 2131889644(0x7f120dec, float:1.9413957E38)
            java.lang.String r6 = X.C36361kB.A0m(r1, r0)
        L_0x0329:
            android.app.Activity r0 = r3.A00
            X.33w r1 = r3.A04
            java.lang.String r4 = "extensions-invalid-flow-token-error"
            r7 = 1
            r8 = 1
            r5 = r2
            X.C145366tm.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0336:
            java.lang.Object r8 = r5.A01
            X.6tm r8 = (X.C145366tm) r8
            java.lang.Object r7 = r5.A00
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            X.66O r11 = r9.A04
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.wabloks.commerce.network.extensions.dataexchange.ExtensionsDataExchangeGraphqlErrorProcessor"
            X.AnonymousClass00C.A0E(r11, r0)
            X.2Uv r11 = (X.AnonymousClass2Uv) r11
            java.util.Map r0 = r11.A00
            r4 = 0
            if (r0 == 0) goto L_0x03ea
            java.util.Set r2 = r0.keySet()
        L_0x0350:
            X.AnonymousClass00C.A0B(r2)
            r0 = 2498061(0x261e0d, float:3.500529E-39)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x03e6
            java.lang.String r13 = "extensions-business-decryption-error"
        L_0x0362:
            boolean r0 = r8.A0I
            if (r0 == 0) goto L_0x03ed
            java.util.Map r0 = r11.A00
            if (r0 == 0) goto L_0x03e4
            java.util.Set r0 = r0.keySet()
        L_0x036e:
            X.AnonymousClass00C.A0B(r0)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x03ed
            android.app.Activity r15 = r8.A00
            X.33w r14 = r8.A04
            X.61i r13 = r8.A03
            java.lang.String r0 = r8.A0G
            r30 = r0
            java.lang.String r12 = r8.A0F
            java.lang.String r11 = r8.A0E
            java.lang.String r0 = r8.A0D
            r33 = r0
            boolean r10 = r8.A0J
            javax.crypto.SecretKey r0 = r8.A0H
            r34 = r0
            byte[] r0 = r8.A0K
            r35 = r0
            X.67S r0 = r8.A0C
            r29 = r0
            X.6MG r9 = r8.A01
            X.17Y r6 = r8.A02
            X.0wU r5 = r8.A0B
            X.0xM r4 = r8.A07
            X.0yC r3 = r8.A09
            X.6TL r2 = r8.A08
            X.0wo r1 = r8.A06
            X.6OE r0 = r8.A05
            X.1A1 r8 = r8.A0A
            r36 = 0
            X.6tm r16 = new X.6tm
            r32 = r11
            r37 = r10
            r26 = r3
            r27 = r8
            r28 = r5
            r31 = r12
            r20 = r13
            r21 = r14
            r22 = r0
            r23 = r1
            r24 = r4
            r25 = r2
            r17 = r15
            r18 = r9
            r19 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r8 = 1
            java.lang.String r5 = "UNKNOWN"
            r9 = 0
            r10 = 0
            r0 = r29
            r1 = r16
            r2 = r7
            r3 = r33
            r4 = r30
            r6 = r34
            r7 = r35
            r0.A01(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x03e4:
            r0 = r4
            goto L_0x036e
        L_0x03e6:
            java.lang.String r13 = "extensions-business-endpoint-response-error"
            goto L_0x0362
        L_0x03ea:
            r2 = r4
            goto L_0x0350
        L_0x03ed:
            X.0yC r1 = r8.A09
            r0 = 3192(0xc78, float:4.473E-42)
            java.lang.String r1 = r1.A09(r0)
            if (r1 == 0) goto L_0x040e
            java.lang.String r0 = ","
            java.util.List r1 = X.C90494aF.A0i(r1, r0)
            if (r1 == 0) goto L_0x040e
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x041f
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x041f
        L_0x0409:
            r0 = 0
        L_0x040a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L_0x040e:
            android.app.Activity r9 = r8.A00
            X.33w r10 = r8.A04
            boolean r17 = X.C90494aF.A1Y(r4)
            r14 = 0
            r16 = 1
            r15 = r14
            r12 = r8
            X.C145366tm.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x041f:
            java.util.Iterator r3 = r1.iterator()
        L_0x0423:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0409
            java.lang.String r2 = X.AnonymousClass001.A0C(r3)
            java.util.Map r0 = r11.A00
            if (r0 == 0) goto L_0x0444
            java.util.Set r1 = r0.keySet()
        L_0x0435:
            X.AnonymousClass00C.A0B(r1)
            int r0 = java.lang.Integer.parseInt(r2)
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r0 == 0) goto L_0x0423
            r0 = 1
            goto L_0x040a
        L_0x0444:
            r1 = r4
            goto L_0x0435
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139346jd.B2J(X.5x8):void");
    }

    public void BVL(IOException iOException) {
        switch (this.A02) {
            case 0:
                AnonymousClass00C.A0D(iOException, 0);
                A00((C114665hc) this.A00, iOException);
                return;
            case 1:
                AnonymousClass00C.A0D(iOException, 0);
                C26561Kq r3 = (C26561Kq) this.A01;
                r3.A02.set(false);
                r3.A01(C1037356r.A00, (C117225lu) this.A00, iOException.getMessage(), iOException);
                return;
            case 2:
                AnonymousClass00C.A0D(iOException, 0);
                C21430zE r32 = ((C146046uw) this.A01).A05;
                r32.markerAnnotate(386138113, "exception", C90484aE.A0k(iOException));
                r32.markerEnd(386138113, 3);
                ((C160087kR) this.A00).BVL(iOException);
                return;
            case 3:
                AnonymousClass00C.A0D(iOException, 0);
                ((C006302t) this.A00).invoke(new AnonymousClass5HV(iOException));
                return;
            case 4:
                C145356tl r33 = (C145356tl) this.A01;
                C145356tl.A00(r33.A00, r33.A03, (AnonymousClass2Uv) null, r33, "extensions-data-exchange-graphql-response-error", (String) null, (String) null, true, false);
                return;
            case 5:
                C145366tm r34 = (C145366tm) this.A01;
                C145366tm.A00(r34.A00, r34.A04, (AnonymousClass2Uv) null, r34, "extensions-data-exchange-graphql-response-error", (String) null, (String) null, true, false);
                return;
            default:
                AnonymousClass3TI.A01("WfacBanViewModel/updateBanState fetchBanStatus onDeliveryFailure");
                return;
        }
    }

    public void BWk(Exception exc) {
        switch (this.A02) {
            case 0:
                AnonymousClass00C.A0D(exc, 0);
                A00((C114665hc) this.A00, exc);
                return;
            case 1:
                AnonymousClass00C.A0D(exc, 0);
                C26561Kq r3 = (C26561Kq) this.A01;
                r3.A02.set(false);
                r3.A01(C1037356r.A00, (C117225lu) this.A00, exc.getMessage(), exc);
                return;
            case 2:
                AnonymousClass00C.A0D(exc, 0);
                C21430zE r32 = ((C146046uw) this.A01).A05;
                String message = exc.getMessage();
                if (message == null) {
                    message = "";
                }
                r32.markerAnnotate(386138113, "exception_message", message);
                r32.markerAnnotate(386138113, "exception", C90484aE.A0k(exc));
                r32.markerEnd(386138113, 3);
                ((C160087kR) this.A00).BWk(exc);
                return;
            case 3:
                AnonymousClass00C.A0D(exc, 0);
                ((C006302t) this.A00).invoke(new AnonymousClass5HY(exc));
                return;
            case 4:
                C145356tl r33 = (C145356tl) this.A01;
                C145356tl.A00(r33.A00, r33.A03, (AnonymousClass2Uv) null, r33, "extensions-data-exchange-graphql-response-error", (String) null, (String) null, true, false);
                return;
            case 5:
                C145366tm r34 = (C145366tm) this.A01;
                C145366tm.A00(r34.A00, r34.A04, (AnonymousClass2Uv) null, r34, "extensions-data-exchange-graphql-response-error", (String) null, (String) null, true, false);
                return;
            default:
                ((AnonymousClass61N) this.A00).A00(-1);
                return;
        }
    }
}
