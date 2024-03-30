package com.whatsapp.extensions.webview.bridge;

import X.AnonymousClass00C;
import X.AnonymousClass16D;
import X.AnonymousClass185;
import X.AnonymousClass1A1;
import X.AnonymousClass1EP;
import X.AnonymousClass1KR;
import X.AnonymousClass1KT;
import X.AnonymousClass1KW;
import X.AnonymousClass1KY;
import X.AnonymousClass3T1;
import X.AnonymousClass6DY;
import X.AnonymousClass6MJ;
import X.C005502l;
import X.C19420v0;
import X.C19630wG;
import X.C19970wo;
import X.C20810yC;
import X.C25851Hx;
import X.C26451Kf;
import X.C26461Kg;
import X.C26601Ku;
import X.C27761Ps;
import X.C28941Us;
import X.C36321k7;
import X.C36361kB;
import com.whatsapp.extensions.webview.viewmodel.WaFlowsViewModel;
import org.json.JSONObject;

public final class FlowsWebViewDataRepository {
    public AnonymousClass6DY A00;
    public AnonymousClass3T1 A01;
    public JSONObject A02;
    public final AnonymousClass1KR A03;
    public final AnonymousClass16D A04;
    public final C27761Ps A05;
    public final C19630wG A06;
    public final AnonymousClass1KW A07;
    public final AnonymousClass1KY A08;
    public final AnonymousClass6MJ A09;
    public final AnonymousClass1KT A0A;
    public final C20810yC A0B;
    public final AnonymousClass1A1 A0C;
    public final C005502l A0D;
    public final AnonymousClass185 A0E;
    public final C19970wo A0F;
    public final C19420v0 A0G;
    public final C25851Hx A0H;
    public final AnonymousClass1EP A0I;
    public final C28941Us A0J;
    public final C26601Ku A0K;
    public final C26461Kg A0L;
    public final C26451Kf A0M;

    public static int A00(WaFlowsViewModel waFlowsViewModel) {
        AnonymousClass6DY r0 = waFlowsViewModel.A0D.A00;
        if (r0 != null) {
            return r0.A02.hashCode();
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r11, com.whatsapp.jid.UserJid r12, X.C023509x r13) {
        /*
            r6 = r12
            boolean r0 = r13 instanceof X.C151697Ao
            if (r0 == 0) goto L_0x0079
            r2 = r13
            X.7Ao r2 = (X.C151697Ao) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0079
            int r3 = r3 - r1
            r2.label = r3
        L_0x0013:
            java.lang.Object r4 = r2.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r2.label
            r10 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r10) goto L_0x0087
            int r1 = r2.I$0
            java.lang.Object r6 = r2.L$1
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            java.lang.Object r11 = r2.L$0
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r11 = (com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository) r11
            X.AnonymousClass0AN.A00(r4)
        L_0x002b:
            X.6CL r4 = (X.AnonymousClass6CL) r4
            X.1Kf r2 = r11.A0M
            java.lang.Integer r1 = X.C90524aI.A0a(r1)
            java.lang.Short r0 = r4.A00
            r2.A0D(r1, r0)
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x007f
            X.1KW r1 = r11.A07
            java.lang.String r0 = r6.user
            java.lang.String r0 = r1.A01(r0)
            X.570 r1 = new X.570
            r1.<init>(r0)
            return r1
        L_0x004a:
            X.AnonymousClass0AN.A00(r4)
            X.1Kf r1 = r11.A0M
            r8 = 0
            java.lang.String r0 = "prefetch_conversation"
            int r1 = r1.A0B(r12, r0)
            X.1Ku r5 = r11.A0K
            java.lang.Integer r7 = X.C90524aI.A0a(r1)
            X.6DY r0 = r11.A00
            if (r0 == 0) goto L_0x0062
            java.lang.String r8 = r0.A02
        L_0x0062:
            r2.L$0 = r11
            r2.L$1 = r12
            r2.I$0 = r1
            r2.label = r10
            X.02l r0 = r5.A06
            r9 = 0
            com.whatsapp.extensions.network.metadata.FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2 r4 = new com.whatsapp.extensions.network.metadata.FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.Object r4 = X.AnonymousClass0A2.A00(r2, r0, r4)
            if (r4 != r3) goto L_0x002b
            return r3
        L_0x0079:
            X.7Ao r2 = new X.7Ao
            r2.<init>(r11, r13)
            goto L_0x0013
        L_0x007f:
            java.lang.String r0 = r4.A01
            X.56z r1 = new X.56z
            r1.<init>(r0)
            return r1
        L_0x0087:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository.A02(com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository, com.whatsapp.jid.UserJid, X.09x):java.lang.Object");
    }

    public FlowsWebViewDataRepository(AnonymousClass1KR r4, AnonymousClass16D r5, AnonymousClass185 r6, C27761Ps r7, C19970wo r8, C19630wG r9, AnonymousClass1KW r10, C19420v0 r11, C25851Hx r12, AnonymousClass1EP r13, AnonymousClass1KY r14, C28941Us r15, C26601Ku r16, C26461Kg r17, AnonymousClass6MJ r18, AnonymousClass1KT r19, C26451Kf r20, C20810yC r21, AnonymousClass1A1 r22, C005502l r23) {
        C20810yC r2 = r21;
        C36321k7.A0x(r9, r2);
        AnonymousClass00C.A0D(r13, 5);
        C36321k7.A13(r6, r11, r8);
        C36321k7.A15(r10, r5, r7);
        AnonymousClass1A1 r1 = r22;
        AnonymousClass00C.A0D(r1, 15);
        AnonymousClass00C.A0D(r12, 16);
        C005502l r0 = r23;
        C36361kB.A1M(r15, r0);
        this.A06 = r9;
        this.A0B = r2;
        this.A08 = r14;
        this.A03 = r4;
        this.A0I = r13;
        this.A0E = r6;
        this.A0G = r11;
        this.A0F = r8;
        this.A0M = r20;
        this.A0L = r17;
        this.A07 = r10;
        this.A04 = r5;
        this.A05 = r7;
        this.A09 = r18;
        this.A0C = r1;
        this.A0H = r12;
        this.A0J = r15;
        this.A0D = r0;
        this.A0A = r19;
        this.A0K = r16;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C128716Di r8, X.C121585tN r9, com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r10, com.whatsapp.jid.UserJid r11, java.lang.String r12, X.C023509x r13, org.json.JSONObject r14) {
        /*
            boolean r0 = r13 instanceof X.C151597Ae
            if (r0 == 0) goto L_0x0089
            r4 = r13
            X.7Ae r4 = (X.C151597Ae) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0089
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r7 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r7) goto L_0x008f
            java.lang.Object r14 = r4.L$1
            org.json.JSONObject r14 = (org.json.JSONObject) r14
            java.lang.Object r10 = r4.L$0
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r10 = (com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository) r10
            X.AnonymousClass0AN.A00(r1)
        L_0x0028:
            X.5bK r1 = (X.C110845bK) r1
            boolean r0 = r1 instanceof X.AnonymousClass570
            if (r0 == 0) goto L_0x0097
            X.570 r1 = (X.AnonymousClass570) r1
            java.lang.Object r1 = r1.A00
            java.lang.String r0 = "public_key"
            r14.put(r0, r1)
        L_0x0037:
            r10.A02 = r14
            X.573 r1 = X.AnonymousClass573.A00
            return r1
        L_0x003c:
            X.AnonymousClass0AN.A00(r1)
            X.6MJ r1 = r10.A09
            r0 = 0
            if (r9 == 0) goto L_0x0046
            X.6PG r0 = r9.A01
        L_0x0046:
            X.5SG r0 = r1.A01(r8, r0, r12)
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0056
            if (r1 == r7) goto L_0x0094
            java.lang.String r0 = "extensions-metadata-unknown-version"
            goto L_0x00a3
        L_0x0056:
            org.json.JSONArray r6 = X.C90524aI.A0u()
            java.lang.String[] r3 = r8.A07
            if (r3 == 0) goto L_0x006a
            int r2 = r3.length
            r1 = 0
        L_0x0060:
            if (r1 >= r2) goto L_0x006a
            r0 = r3[r1]
            r6.put(r0)
            int r1 = r1 + 1
            goto L_0x0060
        L_0x006a:
            java.lang.String r0 = "categories"
            r14.put(r0, r6)
            java.lang.String r0 = r8.A02
            if (r0 == 0) goto L_0x0037
            r4.L$0 = r10
            r4.L$1 = r14
            r4.label = r7
            r3 = 0
            X.02l r2 = r10.A0D
            r1 = 0
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository$getPublicKey$2 r0 = new com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository$getPublicKey$2
            r0.<init>(r10, r11, r1, r3)
            java.lang.Object r1 = X.AnonymousClass0A2.A00(r4, r2, r0)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x0089:
            X.7Ae r4 = new X.7Ae
            r4.<init>(r10, r13)
            goto L_0x0012
        L_0x008f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0094:
            java.lang.String r0 = "extensions-metadata-not-compatible"
            goto L_0x00a3
        L_0x0097:
            boolean r0 = r1 instanceof X.C1037956z
            if (r0 == 0) goto L_0x00a9
            X.56z r1 = (X.C1037956z) r1
            java.lang.String r0 = r1.A00
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "UNKNOWN"
        L_0x00a3:
            X.571 r1 = new X.571
            r1.<init>(r0)
            return r1
        L_0x00a9:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository.A01(X.6Di, X.5tN, com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository, com.whatsapp.jid.UserJid, java.lang.String, X.09x, org.json.JSONObject):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x03e1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03e5 A[PHI: r12 
      PHI: (r12v1 java.lang.Object) = (r12v3 java.lang.Object), (r12v0 java.lang.Object) binds: [B:103:0x03df, B:105:0x03e2] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0361 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x038a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(android.os.Bundle r28, com.whatsapp.jid.UserJid r29, X.C023509x r30) {
        /*
            r27 = this;
            r3 = r30
            r8 = r29
            boolean r0 = r3 instanceof X.AnonymousClass7BC
            r7 = r27
            if (r0 == 0) goto L_0x0035
            r6 = r3
            X.7BC r6 = (X.AnonymousClass7BC) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0035
            int r2 = r2 - r1
            r6.label = r2
        L_0x0018:
            java.lang.Object r12 = r6.result
            X.0AO r25 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r9 = r6.label
            r5 = 5
            r4 = 4
            r3 = 3
            r2 = 2
            r1 = 1
            r0 = 0
            if (r9 == 0) goto L_0x003b
            if (r9 == r1) goto L_0x02d0
            if (r9 == r2) goto L_0x03e2
            if (r9 == r3) goto L_0x03e2
            if (r9 == r4) goto L_0x0362
            if (r9 == r5) goto L_0x03e2
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0035:
            X.7BC r6 = new X.7BC
            r6.<init>(r7, r3)
            goto L_0x0018
        L_0x003b:
            X.AnonymousClass0AN.A00(r12)
            java.lang.String r1 = "flow_id"
            java.lang.String r9 = ""
            r10 = r28
            java.lang.String r5 = r10.getString(r1, r9)
            X.0yC r1 = r7.A0B
            r26 = r1
            r2 = 5333(0x14d5, float:7.473E-42)
            boolean r1 = r1.A0E(r2)
            if (r1 == 0) goto L_0x0071
            r2 = 1319(0x527, float:1.848E-42)
            r1 = r26
            boolean r1 = r1.A0E(r2)
            if (r1 == 0) goto L_0x0071
            X.1KT r2 = r7.A0A
            int r1 = r5.hashCode()
            java.lang.Integer r1 = X.C90524aI.A0a(r1)
            r2.A07(r1)
        L_0x006b:
            X.571 r1 = new X.571
            r1.<init>(r0)
            return r1
        L_0x0071:
            java.lang.String r1 = "message_id"
            java.lang.String r4 = r10.getString(r1, r9)
            java.lang.String r1 = "session_id"
            java.lang.String r3 = r10.getString(r1, r9)
            r1 = 0
            java.lang.String r11 = "message_row_id"
            long r19 = r10.getLong(r11, r1)
            java.lang.String r1 = "flow_message_version"
            java.lang.String r2 = r10.getString(r1, r0)
            java.lang.String r24 = "flow_action_payload"
            r1 = r24
            java.lang.String r23 = r10.getString(r1, r0)
            r0 = 0
            if (r4 == 0) goto L_0x00a0
            X.3Qa r1 = X.C90504aG.A0T(r8, r4)
            X.1A1 r0 = r7.A0C
            X.3T1 r0 = r0.A03(r1)
        L_0x00a0:
            r7.A01 = r0
            r11 = 0
            r22 = r9
            X.C90474aD.A1A(r5, r4, r3)
            X.AnonymousClass00C.A0B(r2)
            boolean r21 = X.AnonymousClass000.A1W(r23)
            r12 = 0
            X.6DY r0 = new X.6DY
            r13 = r0
            r14 = r8
            r15 = r5
            r16 = r4
            r17 = r3
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r21)
            r7.A00 = r0
            X.3T1 r0 = r7.A01
            if (r0 == 0) goto L_0x0244
            X.1EP r11 = r7.A0I
            long r0 = r0.A1N
            X.6A5 r0 = r11.A00(r0)
            if (r0 == 0) goto L_0x023f
            r11 = 1
            java.lang.String r0 = r0.A00
            r22 = r0
        L_0x00d3:
            java.lang.String r21 = "is_draft"
            r0 = r21
            boolean r0 = r10.getBoolean(r0, r12)
            if (r0 == 0) goto L_0x023b
            java.lang.String r15 = "DRAFT"
        L_0x00df:
            X.1Hx r0 = r7.A0H
            X.1IO r0 = r0.A01
            X.9Xu r1 = r0.A01(r8)
            if (r1 == 0) goto L_0x0235
            java.lang.String r0 = r1.A06
            r20 = r0
            java.lang.String r0 = r1.A05
            r19 = r0
        L_0x00f1:
            X.1Us r0 = r7.A0J
            java.lang.Integer r18 = r0.A00(r8)
            org.json.JSONObject r12 = X.C36441kJ.A1B()
            X.6Uj r14 = X.C132586Uj.A00
            java.lang.String r1 = X.C132586Uj.A00(r3)
            java.lang.String r0 = "wam_session_id"
            org.json.JSONObject r12 = r12.put(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "wae"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)
            java.lang.String r1 = X.C132586Uj.A00(r0)
            java.lang.String r0 = "qpl_session_id"
            org.json.JSONObject r13 = r12.put(r0, r1)
            X.1KW r12 = r7.A07
            r0 = 0
            java.lang.String r1 = r14.A02(r12, r4, r0)
            java.lang.String r0 = "wam_message_id"
            org.json.JSONObject r13 = r13.put(r0, r1)
            r0 = 1
            java.lang.String r1 = r14.A02(r12, r4, r0)
            java.lang.String r0 = "qpl_message_id"
            org.json.JSONObject r13 = r13.put(r0, r1)
            java.lang.String r1 = "extension_status"
            org.json.JSONObject r13 = r13.put(r1, r15)
            java.lang.String r1 = "flow_token"
            java.lang.String r0 = r10.getString(r1, r9)
            org.json.JSONObject r13 = r13.put(r1, r0)
            java.lang.String r0 = "business_jid"
            java.lang.String r1 = r10.getString(r0, r9)
            java.lang.String r0 = "biz_jid"
            org.json.JSONObject r13 = r13.put(r0, r1)
            X.185 r14 = r7.A0E
            X.3L0 r0 = r14.A01(r8)
            int r1 = X.C110465ai.A00(r0)
            java.lang.String r0 = "biz_platform"
            org.json.JSONObject r1 = r13.put(r0, r1)
            java.lang.String r0 = "extension_id"
            org.json.JSONObject r13 = r1.put(r0, r5)
            X.3L0 r0 = r14.A01(r8)
            if (r0 == 0) goto L_0x0232
            java.lang.String r1 = r0.A08
        L_0x016d:
            java.lang.String r0 = "business_name"
            org.json.JSONObject r17 = r13.put(r0, r1)
            X.16D r0 = r7.A04
            X.141 r16 = r0.A08(r8)
            X.0wG r0 = r7.A06
            android.content.Context r0 = r0.A00
            r14 = r0
            float r13 = X.C90494aF.A04(r0)
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166049(0x7f070361, float:1.7946332E38)
            int r1 = r1.getDimensionPixelSize(r0)
            if (r16 == 0) goto L_0x022f
            X.1Ps r0 = r7.A05
            r15 = r14
            r14 = r13
            r13 = r1
            r1 = r0
            r0 = r16
            android.graphics.Bitmap r1 = r1.A05(r15, r0, r14, r13)
        L_0x019b:
            java.io.ByteArrayOutputStream r0 = X.C90524aI.A0Q()
            if (r1 == 0) goto L_0x01a4
            X.C90514aH.A1F(r1, r0)
        L_0x01a4:
            byte[] r1 = r0.toByteArray()
            r0 = 0
            java.lang.String r13 = android.util.Base64.encodeToString(r1, r0)
            java.lang.String r1 = "biz_logo"
            r0 = r17
            org.json.JSONObject r1 = r0.put(r1, r13)
            java.lang.String r0 = "is_template"
            org.json.JSONObject r11 = r1.put(r0, r11)
            java.lang.String r1 = "hsm_tag"
            r0 = r22
            org.json.JSONObject r11 = r11.put(r1, r0)
            java.lang.String r1 = "entry_point_conversion_source"
            r0 = r20
            org.json.JSONObject r11 = r11.put(r1, r0)
            java.lang.String r1 = "entry_point_conversion_app"
            r0 = r19
            org.json.JSONObject r11 = r11.put(r1, r0)
            java.lang.String r1 = "entry_point_conversation_initiated"
            r0 = r18
            org.json.JSONObject r1 = r11.put(r1, r0)
            java.lang.String r11 = "flow_action"
            if (r23 == 0) goto L_0x0225
            java.lang.String r0 = "navigate"
            java.lang.String r0 = r10.getString(r11, r0)
            r1.put(r11, r0)
            r0 = r24
            java.lang.String r0 = r10.getString(r0, r9)
            X.AnonymousClass00C.A08(r0)
            byte[] r0 = X.C36351kA.A1b(r0)
            java.lang.String r9 = X.C36441kJ.A13(r0)
            r0 = r24
            r1.put(r0, r9)
        L_0x01fe:
            X.0wo r0 = r7.A0F
            long r17 = X.C19970wo.A00(r0)
            java.lang.String r0 = r8.user
            long r15 = r12.A00(r0, r5)
            r13 = 0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x021d
            r9 = 2892(0xb4c, float:4.053E-42)
            r0 = r26
            long r13 = X.C36441kJ.A0B(r0, r9)
            r11 = 60000(0xea60, double:2.9644E-319)
            long r13 = r13 * r11
            long r13 = r13 + r15
        L_0x021d:
            int r0 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x024b
            java.lang.String r0 = "extensions-banned-id-error"
            goto L_0x006b
        L_0x0225:
            java.lang.String r0 = "data_exchange"
            java.lang.String r0 = r10.getString(r11, r0)
            r1.put(r11, r0)
            goto L_0x01fe
        L_0x022f:
            r1 = 0
            goto L_0x019b
        L_0x0232:
            r1 = 0
            goto L_0x016d
        L_0x0235:
            r19 = 0
            r20 = 0
            goto L_0x00f1
        L_0x023b:
            java.lang.String r15 = "PUBLISHED"
            goto L_0x00df
        L_0x023f:
            r11 = 0
            r22 = 0
            goto L_0x00d3
        L_0x0244:
            java.lang.String r0 = "ExtensionsLogger/FlowsWebViewDataRepository/FMessage is not accessible"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00d3
        L_0x024b:
            X.1Kf r12 = r7.A0M
            java.lang.String r9 = "user_interaction"
            r0 = 0
            int r11 = r12.A0B(r8, r9)
            r13 = 0
            r9 = r21
            boolean r9 = r10.getBoolean(r9, r13)
            if (r9 != 0) goto L_0x031d
            X.1Kg r9 = r7.A0L
            r16 = r9
            java.lang.Integer r10 = X.C90524aI.A0a(r11)
            X.5tN r10 = r9.A05(r8, r10, r5)
            if (r10 == 0) goto L_0x031d
            java.util.List r9 = r10.A02
            java.util.Iterator r14 = r9.iterator()
        L_0x0271:
            boolean r9 = r14.hasNext()
            if (r9 == 0) goto L_0x02ce
            java.lang.Object r13 = r14.next()
            r9 = r13
            X.6Di r9 = (X.C128716Di) r9
            java.lang.String r9 = r9.A03
            boolean r9 = X.AnonymousClass00C.A0J(r9, r5)
            if (r9 == 0) goto L_0x0271
        L_0x0286:
            X.6Di r13 = (X.C128716Di) r13
            if (r13 == 0) goto L_0x031d
            java.lang.Integer r15 = X.C90524aI.A0a(r11)
            r9 = 2
            java.lang.Short r14 = new java.lang.Short
            r14.<init>(r9)
            r12.A0D(r15, r14)
            r9 = r26
            boolean r9 = X.C132586Uj.A01(r13, r9)
            if (r9 != 0) goto L_0x03e6
            if (r23 == 0) goto L_0x03c6
            r6.L$0 = r7
            r6.L$1 = r8
            r6.L$2 = r5
            r6.L$3 = r4
            r6.L$4 = r3
            r6.L$5 = r2
            r6.L$6 = r1
            r6.L$7 = r10
            r6.L$8 = r13
            r6.L$9 = r13
            r6.I$0 = r11
            r9 = 1
            r6.label = r9
            r14 = r16
            r15 = r8
            r16 = r5
            r17 = r4
            r18 = r3
            r19 = r6
            java.lang.Object r12 = r14.A06(r15, r16, r17, r18, r19)
            r9 = r25
            if (r12 != r9) goto L_0x02f9
            return r25
        L_0x02ce:
            r13 = r0
            goto L_0x0286
        L_0x02d0:
            int r11 = r6.I$0
            java.lang.Object r13 = r6.L$9
            X.6Di r13 = (X.C128716Di) r13
            java.lang.Object r10 = r6.L$7
            X.5tN r10 = (X.C121585tN) r10
            java.lang.Object r1 = r6.L$6
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.Object r2 = r6.L$5
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r6.L$4
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r6.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r6.L$2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r6.L$1
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            java.lang.Object r7 = r6.L$0
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r7 = (com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository) r7
            X.AnonymousClass0AN.A00(r12)
        L_0x02f9:
            X.011 r12 = (X.AnonymousClass011) r12
            java.lang.Object r9 = r12.first
            boolean r9 = X.AnonymousClass000.A1X(r9)
            if (r9 == 0) goto L_0x031d
            X.AnonymousClass00C.A0B(r1)
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r0
            r6.L$3 = r0
            r6.L$4 = r0
            r6.L$5 = r0
            r6.L$6 = r0
            r6.L$7 = r0
            r6.L$8 = r0
            r6.L$9 = r0
            r0 = 2
            goto L_0x03d1
        L_0x031d:
            X.1KT r12 = r7.A0A
            int r10 = r5.hashCode()
            r9 = 0
            r12.A0G(r9, r10)
            X.1Kg r10 = r7.A0L
            java.lang.Integer r15 = X.C90524aI.A0a(r11)
            r6.L$0 = r7
            r6.L$1 = r8
            r6.L$2 = r5
            r6.L$3 = r2
            r6.L$4 = r1
            r6.L$5 = r0
            r6.L$6 = r0
            r6.L$7 = r0
            r6.L$8 = r0
            r6.L$9 = r0
            r6.I$0 = r11
            r9 = 4
            r6.label = r9
            r20 = 0
            X.02l r9 = r10.A05
            r19 = 0
            com.whatsapp.extensions.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2 r12 = new com.whatsapp.extensions.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2
            r13 = r10
            r14 = r8
            r16 = r5
            r17 = r4
            r18 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r12 = X.AnonymousClass0A2.A00(r6, r9, r12)
            r3 = r25
            if (r12 != r3) goto L_0x0379
            return r25
        L_0x0362:
            int r11 = r6.I$0
            java.lang.Object r1 = r6.L$4
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.Object r2 = r6.L$3
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r6.L$2
            java.lang.Object r8 = r6.L$1
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            java.lang.Object r7 = r6.L$0
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r7 = (com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository) r7
            X.AnonymousClass0AN.A00(r12)
        L_0x0379:
            X.6CM r12 = (X.AnonymousClass6CM) r12
            X.1Kf r9 = r7.A0M
            java.lang.Integer r4 = X.C90524aI.A0a(r11)
            java.lang.Short r3 = r12.A01
            r9.A0D(r4, r3)
            X.5tN r10 = r12.A00
            if (r10 == 0) goto L_0x03c2
            java.util.List r3 = r10.A02
            java.util.Iterator r4 = r3.iterator()
        L_0x0390:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x03c0
            java.lang.Object r13 = r4.next()
            r3 = r13
            X.6Di r3 = (X.C128716Di) r3
            java.lang.String r3 = r3.A03
            boolean r3 = X.AnonymousClass00C.A0J(r3, r5)
            if (r3 == 0) goto L_0x0390
        L_0x03a5:
            X.6Di r13 = (X.C128716Di) r13
            if (r13 == 0) goto L_0x03c2
            X.0yC r3 = r7.A0B
            boolean r3 = X.C132586Uj.A01(r13, r3)
            if (r3 != 0) goto L_0x03e6
            X.AnonymousClass00C.A0B(r1)
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r0
            r6.L$3 = r0
            r6.L$4 = r0
            r0 = 5
            goto L_0x03d1
        L_0x03c0:
            r13 = r0
            goto L_0x03a5
        L_0x03c2:
            java.lang.String r0 = "extensions-invalid-extensions-id"
            goto L_0x006b
        L_0x03c6:
            X.1KT r4 = r7.A0A
            int r3 = r5.hashCode()
            r0 = 1
            r4.A0G(r0, r3)
            r0 = 3
        L_0x03d1:
            r6.label = r0
            r9 = r13
            r11 = r7
            r12 = r8
            r13 = r2
            r14 = r6
            r15 = r1
            java.lang.Object r12 = A01(r9, r10, r11, r12, r13, r14, r15)
            r0 = r25
            if (r12 != r0) goto L_0x03e5
            return r25
        L_0x03e2:
            X.AnonymousClass0AN.A00(r12)
        L_0x03e5:
            return r12
        L_0x03e6:
            X.572 r1 = X.AnonymousClass572.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository.A03(android.os.Bundle, com.whatsapp.jid.UserJid, X.09x):java.lang.Object");
    }
}
