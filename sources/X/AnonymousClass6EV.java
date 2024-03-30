package X;

import android.webkit.WebMessagePort;
import org.json.JSONObject;

/* renamed from: X.6EV  reason: invalid class name */
public abstract class AnonymousClass6EV {
    public JSONObject A00 = C36441kJ.A1B();
    public WebMessagePort A01;

    public final void A03(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        jSONObject.put("method", this.A00.get("method")).put("callbackID", this.A00.get("callbackID"));
        C110865bM.A00(new C153337Ny(this, jSONObject));
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(X.C023509x r13) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.AnonymousClass577
            if (r0 == 0) goto L_0x007e
            r3 = r12
            X.577 r3 = (X.AnonymousClass577) r3
            org.json.JSONObject r1 = r3.A00
            java.lang.String r0 = "data"
            org.json.JSONObject r2 = r1.getJSONObject(r0)
            java.lang.String r1 = "eventName"
            java.lang.String r0 = ""
            java.lang.String r6 = r2.optString(r1, r0)
            java.lang.String r0 = "code"
            r1 = 0
            int r9 = r2.optInt(r0, r1)
            java.lang.String r0 = "channel"
            int r5 = r2.optInt(r0, r1)
            java.lang.String r0 = "psIdKey"
            int r11 = r2.optInt(r0, r1)
            java.lang.String r0 = "fields"
            org.json.JSONArray r4 = r2.optJSONArray(r0)
            java.lang.String r0 = "sampleRate"
            org.json.JSONObject r0 = r2.optJSONObject(r0)
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r0.toString()
        L_0x003c:
            java.util.HashMap r0 = X.C131866Qy.A01(r0)
            java.util.LinkedHashMap r8 = X.C90474aD.A0s(r0)
            java.util.Iterator r2 = X.C36371kC.A10(r0)
        L_0x0048:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0064
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = r0.toString()
            r8.put(r1, r0)
            goto L_0x0048
        L_0x0062:
            r0 = 0
            goto L_0x003c
        L_0x0064:
            X.AnonymousClass00C.A0B(r6)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            if (r4 == 0) goto L_0x0446
            r2 = 0
            int r1 = r4.length()
        L_0x0072:
            if (r2 >= r1) goto L_0x0446
            java.lang.Object r0 = r4.get(r2)
            r7.add(r0)
            int r2 = r2 + 1
            goto L_0x0072
        L_0x007e:
            boolean r0 = r12 instanceof X.AnonymousClass57C
            if (r0 == 0) goto L_0x009c
            r1 = r12
            X.57C r1 = (X.AnonymousClass57C) r1
            X.6DY r0 = r1.A01
            if (r0 == 0) goto L_0x0453
            X.1KT r1 = r1.A00
            java.lang.String r3 = r0.A02
            java.lang.String r4 = r0.A03
            java.lang.String r5 = r0.A04
            com.whatsapp.jid.UserJid r2 = r0.A01
            java.lang.String r6 = "bloks_cta"
            java.lang.String r7 = "web"
            r1.A0D(r2, r3, r4, r5, r6, r7)
            goto L_0x0453
        L_0x009c:
            boolean r0 = r12 instanceof X.AnonymousClass57B
            if (r0 == 0) goto L_0x00c3
            r3 = r12
            X.57B r3 = (X.AnonymousClass57B) r3
            org.json.JSONObject r1 = r3.A00
            java.lang.String r0 = "data"
            org.json.JSONObject r2 = r1.getJSONObject(r0)
            java.lang.String r1 = "name"
            java.lang.String r0 = "UNKNOWN"
            java.lang.String r2 = r2.optString(r1, r0)
            X.1KT r1 = r3.A01
            int r0 = r3.A00
            java.lang.Integer r0 = X.C90524aI.A0a(r0)
            X.AnonymousClass00C.A0B(r2)
            r1.A08(r0, r2)
            goto L_0x0453
        L_0x00c3:
            boolean r0 = r12 instanceof X.AnonymousClass57A
            if (r0 == 0) goto L_0x00e3
            r3 = r12
            X.57A r3 = (X.AnonymousClass57A) r3
            org.json.JSONObject r1 = r3.A00
            java.lang.String r0 = "data"
            org.json.JSONObject r2 = r1.getJSONObject(r0)
            java.lang.String r1 = "action"
            r0 = 3
            int r0 = r2.optInt(r1, r0)
            short r2 = (short) r0
            X.1KT r1 = r3.A01
            int r0 = r3.A00
            r1.A0C(r0, r2)
            goto L_0x0453
        L_0x00e3:
            boolean r0 = r12 instanceof X.AnonymousClass579
            if (r0 == 0) goto L_0x01d2
            r9 = r12
            X.579 r9 = (X.AnonymousClass579) r9
            org.json.JSONObject r1 = r9.A00
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r1.getJSONObject(r0)
            java.util.HashMap r0 = X.C131866Qy.A02(r0)
            java.util.LinkedHashMap r8 = X.C90474aD.A0s(r0)
            java.util.Iterator r10 = X.C36371kC.A10(r0)
        L_0x00fe:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0453
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r10)
            java.lang.Object r7 = r0.getKey()
            java.lang.String r3 = X.C90494aF.A0f(r0)
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L_0x01cb
            if (r3 == 0) goto L_0x01cb
            int r1 = r3.hashCode()
            r0 = -958754891(0xffffffffc6da8fb5, float:-27975.854)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            if (r1 == r0) goto L_0x0197
            r0 = -655245741(0xffffffffd8f1be53, float:-2.12639791E15)
            if (r1 == r0) goto L_0x0165
            r0 = 687985114(0x2901d1da, float:2.882577E-14)
            if (r1 != r0) goto L_0x01cb
            java.lang.String r0 = "boolAnnotations"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01cb
            java.util.Map r2 = (java.util.Map) r2
            java.util.Iterator r5 = X.AnonymousClass000.A0y(r2)
        L_0x013d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r5)
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r3 = r0.getValue()
            X.1KT r2 = r9.A01
            int r1 = r9.A00
            X.AnonymousClass00C.A0E(r4, r6)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            X.AnonymousClass00C.A0E(r3, r0)
            boolean r0 = X.AnonymousClass000.A1X(r3)
            r2.A04(r1, r4, r0)
            goto L_0x013d
        L_0x0165:
            java.lang.String r0 = "stringAnnotations"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01cb
            java.util.Map r2 = (java.util.Map) r2
            java.util.Iterator r4 = X.AnonymousClass000.A0y(r2)
        L_0x0173:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r4)
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r2 = r0.getValue()
            X.1KT r1 = r9.A01
            int r0 = r9.A00
            X.AnonymousClass00C.A0E(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            X.AnonymousClass00C.A0E(r2, r6)
            java.lang.String r2 = (java.lang.String) r2
            r1.A03(r0, r3, r2)
            goto L_0x0173
        L_0x0197:
            java.lang.String r0 = "intAnnotations"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01cb
            java.util.Map r2 = (java.util.Map) r2
            java.util.Iterator r5 = X.AnonymousClass000.A0y(r2)
        L_0x01a5:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r5)
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            X.1KT r3 = r9.A01
            int r2 = r9.A00
            X.AnonymousClass00C.A0E(r4, r6)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r0 = X.C90484aE.A0C(r1, r0)
            long r0 = (long) r0
            r3.A02(r2, r4, r0)
            goto L_0x01a5
        L_0x01cb:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            r8.put(r7, r0)
            goto L_0x00fe
        L_0x01d2:
            boolean r0 = r12 instanceof com.whatsapp.extensions.webview.bridge.factory.impl.FlowsGetPublicKey
            if (r0 == 0) goto L_0x0262
            r6 = r12
            com.whatsapp.extensions.webview.bridge.factory.impl.FlowsGetPublicKey r6 = (com.whatsapp.extensions.webview.bridge.factory.impl.FlowsGetPublicKey) r6
            boolean r0 = r13 instanceof X.C151707Ap
            if (r0 == 0) goto L_0x0257
            r9 = r13
            X.7Ap r9 = (X.C151707Ap) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0257
            int r2 = r2 - r1
            r9.label = r2
        L_0x01eb:
            java.lang.Object r3 = r9.result
            X.0AO r8 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r9.label
            r1 = 1
            if (r0 == 0) goto L_0x022f
            if (r0 != r1) goto L_0x025d
            java.lang.Object r7 = r9.L$2
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.Object r6 = r9.L$0
            X.6EV r6 = (X.AnonymousClass6EV) r6
            X.AnonymousClass0AN.A00(r3)
        L_0x0201:
            X.5bK r3 = (X.C110845bK) r3
            boolean r0 = r3 instanceof X.AnonymousClass570
            java.lang.String r2 = "responseData"
            if (r0 == 0) goto L_0x0220
            X.570 r3 = (X.AnonymousClass570) r3
            java.lang.Object r1 = r3.A00
            java.lang.String r0 = "public_key"
        L_0x020f:
            org.json.JSONObject r0 = X.C90484aE.A0x(r1, r0, r7)
            org.json.JSONObject r0 = r0.put(r2, r7)
            X.AnonymousClass00C.A0B(r0)
            r6.A03(r0)
        L_0x021d:
            X.0AJ r8 = X.AnonymousClass0AJ.A00
            return r8
        L_0x0220:
            boolean r0 = r3 instanceof X.C1037956z
            if (r0 == 0) goto L_0x021d
            X.56z r3 = (X.C1037956z) r3
            java.lang.String r1 = r3.A00
            if (r1 != 0) goto L_0x022c
            java.lang.String r1 = "UNKNOWN"
        L_0x022c:
            java.lang.String r0 = "error_key"
            goto L_0x020f
        L_0x022f:
            X.AnonymousClass0AN.A00(r3)
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r5 = r6.A00
            X.6DY r0 = r5.A00
            if (r0 == 0) goto L_0x021d
            org.json.JSONObject r7 = X.C36441kJ.A1B()
            com.whatsapp.jid.UserJid r4 = r0.A01
            boolean r3 = r6.A01
            r9.L$0 = r6
            r9.L$1 = r0
            r9.L$2 = r7
            r9.label = r1
            X.02l r2 = r5.A0D
            r1 = 0
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository$getPublicKey$2 r0 = new com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository$getPublicKey$2
            r0.<init>(r5, r4, r1, r3)
            java.lang.Object r3 = X.AnonymousClass0A2.A00(r9, r2, r0)
            if (r3 != r8) goto L_0x0201
            return r8
        L_0x0257:
            X.7Ap r9 = new X.7Ap
            r9.<init>(r6, r13)
            goto L_0x01eb
        L_0x025d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0262:
            boolean r0 = r12 instanceof X.AnonymousClass576
            if (r0 == 0) goto L_0x027d
            r3 = r12
            X.576 r3 = (X.AnonymousClass576) r3
            org.json.JSONObject r2 = X.C36441kJ.A1B()
            org.json.JSONObject r1 = r3.A00
            java.lang.String r0 = "responseData"
            org.json.JSONObject r0 = r2.put(r0, r1)
            X.AnonymousClass00C.A0B(r0)
            r3.A03(r0)
            goto L_0x0453
        L_0x027d:
            boolean r0 = r12 instanceof com.whatsapp.extensions.webview.bridge.factory.impl.FlowsComplete
            if (r0 == 0) goto L_0x033b
            r0 = r12
            com.whatsapp.extensions.webview.bridge.factory.impl.FlowsComplete r0 = (com.whatsapp.extensions.webview.bridge.factory.impl.FlowsComplete) r0
            boolean r1 = r13 instanceof X.AnonymousClass7AJ
            if (r1 == 0) goto L_0x032f
            r9 = r13
            X.7AJ r9 = (X.AnonymousClass7AJ) r9
            int r3 = r9.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x032f
            int r3 = r3 - r2
            r9.label = r3
        L_0x0296:
            java.lang.Object r4 = r9.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r9.label
            r3 = 1
            if (r1 == 0) goto L_0x0315
            if (r1 != r3) goto L_0x0336
            java.lang.Object r0 = r9.L$0
            com.whatsapp.extensions.webview.bridge.factory.impl.FlowsComplete r0 = (com.whatsapp.extensions.webview.bridge.factory.impl.FlowsComplete) r0
            X.AnonymousClass0AN.A00(r4)
        L_0x02a8:
            X.011 r4 = (X.AnonymousClass011) r4
            java.lang.Object r1 = r4.first
            boolean r1 = X.AnonymousClass000.A1X(r1)
            X.02t r2 = r0.A06
            if (r1 == 0) goto L_0x030d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r2.invoke(r1)
            org.json.JSONObject r2 = r0.A00
            java.lang.String r1 = "data"
            org.json.JSONObject r2 = r2.getJSONObject(r1)
            java.lang.String r1 = "extension_message_response"
            org.json.JSONObject r2 = r2.getJSONObject(r1)
            java.lang.String r1 = "params"
            org.json.JSONObject r2 = X.C90474aD.A0t(r1, r2)
            X.6DY r3 = r0.A04
            long r8 = r3.A00
            java.lang.String r7 = r3.A02
            java.lang.String r1 = "ACTION_NAME"
            org.json.JSONObject r2 = r2.optJSONObject(r1)
            r1 = 0
            if (r2 == 0) goto L_0x030b
            java.lang.String r1 = "BODY"
            java.lang.String r4 = r2.optString(r1)
            java.lang.String r1 = "PARAMS"
            org.json.JSONObject r1 = r2.optJSONObject(r1)
        L_0x02ea:
            X.1X4 r2 = r0.A00
            com.whatsapp.jid.UserJid r3 = r3.A01
            if (r4 != 0) goto L_0x02f2
            java.lang.String r4 = ""
        L_0x02f2:
            java.lang.String r6 = java.lang.String.valueOf(r1)
            java.lang.String r5 = "galaxy_message"
            r2.A0O(r3, r4, r5, r6, r7, r8)
            X.3T1 r2 = r0.A05
            X.0xM r1 = r0.A01
            X.C54292si.A00(r1, r2)
        L_0x0302:
            X.6PZ r1 = r0.A02
            r0 = 0
            r1.A02(r0, r0)
            X.0AJ r2 = X.AnonymousClass0AJ.A00
            return r2
        L_0x030b:
            r4 = r1
            goto L_0x02ea
        L_0x030d:
            java.lang.Boolean r1 = X.C36381kD.A0j()
            r2.invoke(r1)
            goto L_0x0302
        L_0x0315:
            X.AnonymousClass0AN.A00(r4)
            X.1Kg r4 = r0.A03
            X.6DY r1 = r0.A04
            java.lang.String r6 = r1.A02
            com.whatsapp.jid.UserJid r5 = r1.A01
            java.lang.String r7 = r1.A03
            java.lang.String r8 = r1.A04
            r9.L$0 = r0
            r9.label = r3
            java.lang.Object r4 = r4.A06(r5, r6, r7, r8, r9)
            if (r4 != r2) goto L_0x02a8
            return r2
        L_0x032f:
            X.7AJ r9 = new X.7AJ
            r9.<init>(r0, r13)
            goto L_0x0296
        L_0x0336:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x033b:
            boolean r0 = r12 instanceof X.AnonymousClass575
            if (r0 == 0) goto L_0x0431
            r5 = r12
            X.575 r5 = (X.AnonymousClass575) r5
            org.json.JSONObject r6 = X.C36441kJ.A1B()
            org.json.JSONObject r1 = r5.A00
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r1.getJSONObject(r0)
            if (r0 == 0) goto L_0x041a
            java.util.HashMap r0 = X.C131866Qy.A02(r0)
            java.util.LinkedHashMap r7 = X.C90474aD.A0s(r0)
            java.util.Iterator r11 = X.C36371kC.A10(r0)
        L_0x035c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x041f
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r11)
            java.lang.Object r8 = r0.getKey()
            java.lang.String r9 = X.C90494aF.A0f(r0)
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L_0x0415
            java.util.Map r2 = (java.util.Map) r2
            java.util.LinkedHashMap r4 = X.C000400e.A06(r2)
            java.lang.String r0 = "type"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "defaultValue"
            java.lang.Object r10 = r2.get(r3)
            if (r10 != 0) goto L_0x0390
            java.lang.String r10 = ""
        L_0x0390:
            X.AnonymousClass00C.A0B(r9)
            int r9 = java.lang.Integer.parseInt(r9)
            int r0 = r1.hashCode()     // Catch:{ IllegalArgumentException -> 0x03f6 }
            switch(r0) {
                case -891985903: goto L_0x03e7;
                case 104431: goto L_0x03d4;
                case 3029738: goto L_0x03c1;
                case 3271912: goto L_0x03b2;
                case 97526364: goto L_0x039f;
                default: goto L_0x039e;
            }     // Catch:{ IllegalArgumentException -> 0x03f6 }
        L_0x039e:
            goto L_0x0408
        L_0x039f:
            java.lang.String r0 = "float"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x03f6 }
            if (r0 == 0) goto L_0x0408
            X.0yC r0 = r5.A00     // Catch:{ IllegalArgumentException -> 0x03f6 }
            float r0 = r0.A05(r9)     // Catch:{ IllegalArgumentException -> 0x03f6 }
            java.lang.Float r10 = java.lang.Float.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x03f6 }
            goto L_0x0408
        L_0x03b2:
            java.lang.String r0 = "json"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x03f6 }
            if (r0 == 0) goto L_0x0408
            X.0yC r0 = r5.A00     // Catch:{ IllegalArgumentException -> 0x03f6 }
            org.json.JSONObject r10 = r0.A0A(r9)     // Catch:{ IllegalArgumentException -> 0x03f6 }
            goto L_0x0408
        L_0x03c1:
            java.lang.String r0 = "bool"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x03f6 }
            if (r0 == 0) goto L_0x0408
            X.0yC r0 = r5.A00     // Catch:{ IllegalArgumentException -> 0x03f6 }
            boolean r0 = r0.A0E(r9)     // Catch:{ IllegalArgumentException -> 0x03f6 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x03f6 }
            goto L_0x0408
        L_0x03d4:
            java.lang.String r0 = "int"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x03f6 }
            if (r0 == 0) goto L_0x0408
            X.0yC r0 = r5.A00     // Catch:{ IllegalArgumentException -> 0x03f6 }
            int r0 = r0.A07(r9)     // Catch:{ IllegalArgumentException -> 0x03f6 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x03f6 }
            goto L_0x0408
        L_0x03e7:
            java.lang.String r0 = "string"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x03f6 }
            if (r0 == 0) goto L_0x0408
            X.0yC r0 = r5.A00     // Catch:{ IllegalArgumentException -> 0x03f6 }
            java.lang.String r10 = r0.A09(r9)     // Catch:{ IllegalArgumentException -> 0x03f6 }
            goto L_0x0408
        L_0x03f6:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FlowsLogger/FlowsGetClientAbProps/getABPropVal - ABProp field doesn't exists with code = "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " - "
            X.C36321k7.A1W(r0, r1, r2)
        L_0x0408:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "value"
            r4.put(r0, r1)
            r4.remove(r3)
            r2 = r4
        L_0x0415:
            r7.put(r8, r2)
            goto L_0x035c
        L_0x041a:
            org.json.JSONObject r1 = X.C36441kJ.A1B()
            goto L_0x0424
        L_0x041f:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r7)
        L_0x0424:
            java.lang.String r0 = "responseData"
            org.json.JSONObject r0 = r6.put(r0, r1)
            X.AnonymousClass00C.A0B(r0)
            r5.A03(r0)
            goto L_0x0453
        L_0x0431:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FlowsLogger/FlowsWebBridgeCallable/execute() method not implemented -- "
            r2.append(r0)
            org.json.JSONObject r1 = r12.A00
            java.lang.String r0 = "method"
            java.lang.Object r0 = r1.opt(r0)
            X.C36331k8.A1P(r0, r2)
            goto L_0x0453
        L_0x0446:
            int r10 = X.C90494aF.A06(r5)
            X.57l r1 = X.C110075a5.A00(r6, r7, r8, r9, r10, r11)
            X.0yW r0 = r3.A00
            r0.Bly(r1)
        L_0x0453:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6EV.A01(X.09x):java.lang.Object");
    }

    public final WebMessagePort A00() {
        return this.A01;
    }

    public final void A02(WebMessagePort webMessagePort) {
        this.A01 = webMessagePort;
    }
}
