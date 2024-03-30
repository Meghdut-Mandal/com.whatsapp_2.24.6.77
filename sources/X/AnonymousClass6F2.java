package X;

import java.util.Map;

/* renamed from: X.6F2  reason: invalid class name */
public abstract class AnonymousClass6F2 {
    public boolean A00;
    public final C105705Fs A01;

    public final void A05(C159627jf r4, String str, String str2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(A06());
        C36321k7.A1P("/execute: ", str2, A0u);
        r4.BXS(new AnonymousClass6PH((Integer) null, str, str2), (Map) null);
    }

    public void A03() {
        if (this instanceof AnonymousClass5GI) {
            AnonymousClass5GI r1 = (AnonymousClass5GI) this;
            r1.A00 = true;
            C121815tl r3 = r1.A02;
            if (r3 == null) {
                throw C36331k8.A0d("activityResultManager");
            }
            AnonymousClass6EW.A00(r3.A01.A02(r3.A02), AnonymousClass703.class, r3, 6);
            return;
        }
        this.A00 = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.5Fo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.5Fo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.5Fn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.5Fo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.5Fo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.5Fo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.5Fo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.AnonymousClass5GI
            if (r0 == 0) goto L_0x001e
            r0 = r3
            X.5GI r0 = (X.AnonymousClass5GI) r0
            X.5tl r2 = r0.A02
            if (r2 != 0) goto L_0x0012
            java.lang.String r0 = "activityResultManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0012:
            X.6Ou r1 = r2.A01
            java.lang.String r0 = r2.A02
            X.6EW r0 = r1.A02(r0)
            r0.A04(r2)
            return
        L_0x001e:
            boolean r0 = r3 instanceof X.C105655Fn
            if (r0 == 0) goto L_0x0038
            r2 = r3
            X.5Fn r2 = (X.C105655Fn) r2
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x002e
            X.6DL r0 = r2.A01
        L_0x002b:
            r0.A00(r1)
        L_0x002e:
            X.66v r1 = r2.A08()
            X.6EW r0 = r1.A01
            r0.A04(r1)
        L_0x0037:
            return
        L_0x0038:
            boolean r0 = r3 instanceof X.C105665Fo
            if (r0 == 0) goto L_0x0037
            r2 = r3
            X.5Fo r2 = (X.C105665Fo) r2
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x002e
            X.6DL r0 = r2.A01
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6F2.A04():void");
    }

    public String A06() {
        if (this instanceof AnonymousClass5G2) {
            return "wae_direct_connect";
        }
        if (this instanceof C105725Fv) {
            return "payments_preprocessor";
        }
        if (this instanceof AnonymousClass5G3) {
            return "wae_action_dispatcher";
        }
        if (this instanceof AnonymousClass5G1) {
            return "native_card_encryption_resource";
        }
        if (this instanceof C105765Fz) {
            return "br_verify_card_check_if_app_exists";
        }
        if (this instanceof AnonymousClass5GG) {
            return "native_br_p2m_checkout_address";
        }
        if (this instanceof AnonymousClass5GF) {
            return "native_br_compliance";
        }
        if (this instanceof AnonymousClass5GI) {
            return "br_verify_card_deeplink";
        }
        if (this instanceof AnonymousClass5GB) {
            return "native_upi_transaction_confirmation";
        }
        if (this instanceof AnonymousClass5GA) {
            return "native_upi_reset_pin";
        }
        if (this instanceof AnonymousClass5G9) {
            return "native_upi_consumer_onboarding";
        }
        if (this instanceof AnonymousClass5G8) {
            return "native_upi_add_payment_method";
        }
        if (this instanceof AnonymousClass5GE) {
            return "native_flow_npci_common_library";
        }
        if (this instanceof AnonymousClass5GH) {
            return "dismiss_bottom_sheet";
        }
        if (this instanceof C105755Fy) {
            return "send_fds_iq";
        }
        if (this instanceof C105745Fx) {
            return "abprop_fetch";
        }
        if (this instanceof C105735Fw) {
            return "throw_error";
        }
        if (this instanceof AnonymousClass5GD) {
            return "native_p2m_lite_hpp_checkout";
        }
        if (this instanceof AnonymousClass5GC) {
            return "native_p2m_lite_compliance";
        }
        if (this instanceof AnonymousClass5G7) {
            return "native_flow_call_manager";
        }
        if (this instanceof AnonymousClass5G0) {
            return "client_dasl_query";
        }
        if (this instanceof AnonymousClass5G5) {
            return "open_web_view";
        }
        if (this instanceof C105655Fn) {
            return "open_bloks_screen_graphql";
        }
        return "open_bloks_screen";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: X.65f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: X.65f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: X.65f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v52, resolved type: X.65f} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02d3, code lost:
        r3.put("disabled", X.C36371kC.A0m());
        r5.set(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        if ((r2 instanceof java.util.Map) != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07c0, code lost:
        if (r4.length() == 0) goto L_0x07a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x08c2, code lost:
        r2 = X.AnonymousClass000.A0u();
        r2.append("Invalid action (");
        r2.append(r5);
        X.AnonymousClass5G3.A02(r0, r15, "extensions-invalid-action", X.AnonymousClass000.A0q(") passed to execute.", r2), r10, r14.A05, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x08e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x08ea, code lost:
        if (r5.equals(r1) == false) goto L_0x08c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x08ec, code lost:
        r3 = r15.A0A;
        r2 = r10.get("action_payload");
        X.AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        r2 = (java.util.Map) X.C90514aH.A0n("plugin", "null cannot be cast to non-null type kotlin.collections.Map<*, *>", (java.util.Map) X.C90514aH.A0n("data", "null cannot be cast to non-null type kotlin.collections.Map<*, *>", (java.util.Map) X.C90514aH.A0n("business_payload", "null cannot be cast to non-null type kotlin.collections.Map<*, *>", (java.util.Map) r2)));
        r8 = X.C90464aC.A0a(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x091f, code lost:
        if (r5.equals("plugin_complete") == false) goto L_0x092f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0921, code lost:
        r3.A00.A01((java.lang.Boolean) null, X.C36411kG.A0t(), "plugin", "plugin_end", r8, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0935, code lost:
        if (r5.equals("plugin_failed") == false) goto L_0x0982;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0937, code lost:
        r3.A00.A01((java.lang.Boolean) null, X.C36411kG.A0t(), "plugin", "plugin_error", r8, X.C90514aH.A0n("error", "null cannot be cast to non-null type kotlin.collections.Map<*, *>", (java.util.Map) X.C90514aH.A0n("output", "null cannot be cast to non-null type kotlin.collections.Map<*, *>", r2)).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x095c, code lost:
        if (r5.equals(r3) == false) goto L_0x08c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x095e, code lost:
        r15.A03 = false;
        r15.A09.A04(X.C90464aC.A0a("extension_id", r14.A05).hashCode(), "data_channel_navigation", true);
        r15.A0G.clear();
        r15.A0F.clear();
        r15.A00 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0982, code lost:
        X.AnonymousClass5G3.A00(r14, r0, r15, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0985, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x08bb  */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x01c8 A[EDGE_INSN: B:458:0x01c8->B:86:0x01c8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C128786Dp r26, X.C159627jf r27, X.AnonymousClass6PH r28, java.util.Map r29) {
        /*
            r25 = this;
            r10 = r29
            r15 = r25
            boolean r1 = r15 instanceof X.AnonymousClass5G2
            r14 = r26
            r0 = r27
            if (r1 == 0) goto L_0x00ef
            X.5G2 r15 = (X.AnonymousClass5G2) r15
            r4 = 0
            X.AnonymousClass00C.A0D(r10, r4)
            r2 = 2
            X.C36341k9.A1E(r14, r2, r0)
            X.9Y1 r3 = r15.A00
            boolean r1 = r3.A03
            if (r1 != 0) goto L_0x0021
            r1 = 15
            r3.A01(r1)
        L_0x0021:
            java.lang.String r8 = "data"
            java.lang.Object r6 = r10.get(r8)
            boolean r1 = r6 instanceof java.util.Map
            if (r1 == 0) goto L_0x002d
            if (r6 != 0) goto L_0x0031
        L_0x002d:
            X.00f r6 = X.C000400e.A0D()
        L_0x0031:
            java.lang.String r5 = "screen"
            java.lang.Object r7 = r10.get(r5)
            java.lang.String r1 = "external_resources"
            java.lang.Object r3 = r10.get(r1)
            boolean r1 = r3 instanceof java.util.Map
            if (r1 == 0) goto L_0x0045
            java.util.Map r3 = (java.util.Map) r3
            if (r3 != 0) goto L_0x0049
        L_0x0045:
            X.00f r3 = X.C000400e.A0D()
        L_0x0049:
            X.011[] r2 = new X.AnonymousClass011[r2]
            X.C36341k9.A1J(r8, r6, r2, r4)
            X.011 r1 = X.C36441kJ.A19(r5, r7)
            r6 = 1
            r2[r6] = r1
            java.util.LinkedHashMap r1 = X.C000400e.A07(r2)
            java.util.LinkedHashMap r5 = X.C000400e.A06(r1)
            java.util.Map r2 = r14.A05
            java.lang.String r1 = "business_jid"
            java.lang.String r8 = X.C90464aC.A0a(r1, r2)
            java.lang.String r1 = "action_name"
            java.lang.Object r2 = r10.get(r1)
            java.lang.String r1 = "navigate"
            boolean r1 = X.AnonymousClass00C.A0J(r2, r1)
            java.lang.String r2 = "external_data"
            if (r1 == 0) goto L_0x007f
            boolean r1 = r10.containsKey(r2)
            if (r1 != 0) goto L_0x007f
        L_0x007b:
            X.AnonymousClass5G2.A00(r0, r15, r5, r6)
        L_0x007e:
            return
        L_0x007f:
            boolean r1 = r10.containsKey(r2)
            if (r1 == 0) goto L_0x00dc
            java.lang.Object r2 = r10.get(r2)
            boolean r1 = r2 instanceof java.util.Map
            if (r1 == 0) goto L_0x08b3
        L_0x008d:
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L_0x08b3
            X.66y r4 = new X.66y
            r4.<init>(r0, r15, r5)
            java.util.List r1 = X.C90524aI.A0o(r7, r3)
            if (r1 != 0) goto L_0x009e
            X.09w r1 = X.C023409w.A00
        L_0x009e:
            boolean r1 = X.C36401kF.A1a(r1)
            if (r1 == 0) goto L_0x007b
            java.lang.String r1 = "name"
            java.lang.Object r3 = r2.get(r1)
            java.lang.String r1 = "payload"
            java.lang.Object r2 = r2.get(r1)
            boolean r1 = r2 instanceof java.util.Map
            if (r1 == 0) goto L_0x00b8
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L_0x00bc
        L_0x00b8:
            X.00f r2 = X.C000400e.A0D()
        L_0x00bc:
            java.util.Map r1 = r15.A01
            java.lang.Object r1 = r1.get(r3)
            X.004 r1 = (X.AnonymousClass004) r1
            if (r1 == 0) goto L_0x007b
            java.lang.Object r1 = r1.get()
            X.7hy r1 = (X.C158727hy) r1
            if (r1 == 0) goto L_0x007b
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = X.C222813r.A01(r8)
            X.9Wk r0 = r1.B44(r0, r2, r10)
            r0.A01(r4)
            return
        L_0x00dc:
            java.util.List r2 = X.C90524aI.A0o(r7, r3)
            if (r2 != 0) goto L_0x00e4
            X.09w r2 = X.C023409w.A00
        L_0x00e4:
            boolean r1 = X.C36401kF.A1a(r2)
            if (r1 == 0) goto L_0x08b3
            java.lang.Object r2 = r2.get(r4)
            goto L_0x008d
        L_0x00ef:
            boolean r1 = r15 instanceof X.C105725Fv
            if (r1 == 0) goto L_0x0144
            r1 = 0
            X.C36321k7.A16(r10, r14, r0, r1)
            java.util.Map r5 = r14.A05
            java.lang.String r1 = "business_jid"
            java.lang.Object r6 = r5.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            X.AnonymousClass00C.A0E(r6, r4)
            java.lang.String r1 = "action_payload"
            java.lang.Object r3 = r10.get(r1)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.AnonymousClass00C.A0E(r3, r2)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r1 = "data"
            java.lang.Object r1 = X.C90514aH.A0n(r1, r2, r3)
            java.util.Map r1 = (java.util.Map) r1
            java.util.LinkedHashMap r3 = X.C000400e.A06(r1)
            java.lang.String r1 = "id"
            java.util.Map r2 = X.C36391kE.A11(r1, r6)
            java.lang.String r1 = "recipient"
            r3.put(r1, r2)
            java.lang.String r2 = "error_map_type"
            java.lang.String r1 = "payments"
            r3.put(r2, r1)
            java.lang.String r1 = "message_id"
            java.lang.Object r2 = X.C90514aH.A0n(r1, r4, r5)
            java.lang.String r1 = "quoted_message_id"
            r3.put(r1, r2)
            java.lang.String r1 = "state_machine_parameters"
            java.util.Map r1 = X.C36391kE.A11(r1, r3)
            r0.BiH(r1)
            return
        L_0x0144:
            boolean r1 = r15 instanceof X.AnonymousClass5G3
            if (r1 == 0) goto L_0x01f6
            X.5G3 r15 = (X.AnonymousClass5G3) r15
            r2 = 0
            X.C36321k7.A16(r10, r14, r0, r2)
            java.lang.String r1 = "current_screen"
            java.lang.Object r3 = r10.get(r1)
            boolean r1 = r3 instanceof java.lang.String
            r4 = 0
            if (r1 == 0) goto L_0x01f3
            java.lang.String r3 = (java.lang.String) r3
        L_0x015b:
            r15.A01 = r3
            java.lang.String r1 = "action"
            java.lang.String r5 = X.C90474aD.A0c(r1, r10)
            java.lang.String r3 = "data_exchange"
            boolean r1 = X.AnonymousClass00C.A0J(r5, r3)
            if (r1 == 0) goto L_0x01ee
            java.lang.String r1 = "action_payload"
            java.lang.Object r6 = r10.get(r1)
            boolean r1 = r6 instanceof java.util.Map
            r7 = 0
            if (r1 == 0) goto L_0x01ec
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L_0x01ec
            java.lang.String r1 = "business_payload"
            java.lang.Object r6 = r6.get(r1)
        L_0x0180:
            boolean r1 = r6 instanceof java.util.Map
            if (r1 == 0) goto L_0x018e
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L_0x018e
            java.lang.String r1 = "data"
            java.lang.Object r7 = r6.get(r1)
        L_0x018e:
            boolean r1 = r7 instanceof java.util.Map
            if (r1 == 0) goto L_0x01ee
            java.util.Map r7 = (java.util.Map) r7
            if (r7 == 0) goto L_0x01ee
            java.lang.String r1 = "error"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x01ee
            java.lang.String r1 = "error_message"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x01ee
            java.lang.String r5 = "error_propagation_action"
        L_0x01a8:
            java.util.Set r1 = r15.A0H
            java.util.Iterator r8 = r1.iterator()
        L_0x01ae:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x01c8
            java.lang.Object r7 = r8.next()
            r6 = r7
            X.65f r6 = (X.C1267265f) r6
            boolean r1 = r6 instanceof X.AnonymousClass5OL
            if (r1 == 0) goto L_0x01db
            java.lang.String r1 = "navigate"
        L_0x01c1:
            boolean r1 = X.AnonymousClass00C.A0J(r1, r5)
            if (r1 == 0) goto L_0x01ae
            r4 = r7
        L_0x01c8:
            X.65f r4 = (X.C1267265f) r4
            if (r4 == 0) goto L_0x08bb
            java.util.Map r3 = r14.A05
            java.util.LinkedHashMap r2 = X.AnonymousClass6TM.A01(r10, r3)
            X.718 r1 = new X.718
            r1.<init>(r0, r15, r3)
            r4.A00(r1, r2)
            return
        L_0x01db:
            boolean r1 = r6 instanceof X.AnonymousClass5OK
            if (r1 == 0) goto L_0x01e2
            java.lang.String r1 = "error_propagation_action"
            goto L_0x01c1
        L_0x01e2:
            boolean r1 = r6 instanceof X.AnonymousClass5OI
            if (r1 == 0) goto L_0x01e9
            java.lang.String r1 = "data_exchange_DUMMY"
            goto L_0x01c1
        L_0x01e9:
            java.lang.String r1 = "complete"
            goto L_0x01c1
        L_0x01ec:
            r6 = r7
            goto L_0x0180
        L_0x01ee:
            if (r5 != 0) goto L_0x01a8
            java.lang.String r5 = ""
            goto L_0x01a8
        L_0x01f3:
            r3 = r4
            goto L_0x015b
        L_0x01f6:
            boolean r1 = r15 instanceof X.AnonymousClass5G1
            if (r1 == 0) goto L_0x0245
            X.5G1 r15 = (X.AnonymousClass5G1) r15
            r1 = 0
            X.C36341k9.A1E(r10, r1, r0)
            r15.A00 = r0
            java.lang.String r1 = "card_cvv"
            java.lang.Object r9 = r10.get(r1)
            boolean r1 = r9 instanceof java.lang.String
            r4 = 0
            if (r1 == 0) goto L_0x0243
            java.lang.String r9 = (java.lang.String) r9
        L_0x020f:
            java.lang.String r1 = "card_pan"
            java.lang.String r10 = X.C90464aC.A0Z(r1, r10)
            if (r9 == 0) goto L_0x0986
            int r1 = r9.length()
            if (r1 == 0) goto L_0x0986
            if (r10 == 0) goto L_0x0986
            int r1 = r10.length()
            if (r1 == 0) goto L_0x0986
            X.5md r5 = new X.5md
            r5.<init>(r0)
            X.0wU r8 = r15.A07
            X.5mh r6 = r15.A05
            X.1Db r3 = r15.A03
            X.5cN r7 = r15.A06
            X.1Vk r4 = r15.A04
            X.0wD r2 = r15.A02
            X.5Fg r1 = new X.5Fg
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r15.A01 = r1
            X.0wU r0 = r1.A01
            X.C36331k8.A1F(r1, r0)
            return
        L_0x0243:
            r9 = r4
            goto L_0x020f
        L_0x0245:
            boolean r1 = r15 instanceof X.C105765Fz
            if (r1 == 0) goto L_0x02ec
            X.5Fz r15 = (X.C105765Fz) r15
            r1 = 0
            X.C36341k9.A1E(r10, r1, r0)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r10)
            java.lang.String r9 = "data"
            java.lang.Object r1 = r8.get(r9)
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>"
            X.AnonymousClass00C.A0E(r1, r10)
            java.util.Map r7 = X.C07710Yz.A02(r1)
            java.lang.String r6 = "verify_method_list"
            java.lang.Object r5 = r7.get(r6)
            java.lang.String r1 = "null cannot be cast to non-null type net.minidev.json.JSONArray"
            X.AnonymousClass00C.A0E(r5, r1)
            java.util.AbstractList r5 = (java.util.AbstractList) r5
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x02e5
            r4 = 0
            int r2 = r5.size()
        L_0x027b:
            if (r4 >= r2) goto L_0x02df
            java.lang.Object r1 = r5.get(r4)
            X.AnonymousClass00C.A0E(r1, r10)
            java.util.Map r3 = X.C07710Yz.A02(r1)
            java.lang.String r1 = "verify_type"
            java.lang.Object r11 = r3.get(r1)
            java.lang.String r1 = "APP_TO_APP"
            boolean r1 = X.AnonymousClass00C.A0J(r11, r1)
            if (r1 == 0) goto L_0x02e9
            java.lang.String r1 = "source"
            java.lang.String r11 = X.C36431kI.A1A(r1, r3)
            java.lang.String r1 = "intent_action"
            java.lang.String r1 = X.C36431kI.A1A(r1, r3)
            X.00I r1 = X.AnonymousClass3RH.A00(r11, r1)
            if (r1 == 0) goto L_0x02d3
            java.lang.Object r14 = r1.A00
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r1.A01
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r1 = "request_payload"
            java.lang.String r12 = X.C36431kI.A1A(r1, r3)
            android.content.Intent r11 = X.C36431kI.A0D()
            java.lang.String r1 = "android.intent.extra.TEXT"
            r11.putExtra(r1, r12)
            r11.setPackage(r14)
            r11.setAction(r13)
            X.0wG r1 = r15.A00
            android.content.Context r1 = r1.A00
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.ComponentName r1 = r11.resolveActivity(r1)
            if (r1 != 0) goto L_0x02e9
        L_0x02d3:
            java.lang.Boolean r2 = X.C36371kC.A0m()
            java.lang.String r1 = "disabled"
            r3.put(r1, r2)
            r5.set(r4, r3)
        L_0x02df:
            r7.put(r6, r5)
            r8.put(r9, r7)
        L_0x02e5:
            r0.BiH(r8)
            return
        L_0x02e9:
            int r4 = r4 + 1
            goto L_0x027b
        L_0x02ec:
            boolean r1 = r15 instanceof X.AnonymousClass5GG
            r7 = r28
            if (r1 == 0) goto L_0x0306
            X.5GG r15 = (X.AnonymousClass5GG) r15
            r1 = 0
            X.C36321k7.A16(r10, r14, r0, r1)
            r4 = 0
            if (r28 == 0) goto L_0x09a0
            X.66U r2 = r15.A00
            if (r2 != 0) goto L_0x0a39
            java.lang.String r0 = "fcsLoadingEventManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0306:
            boolean r1 = r15 instanceof X.AnonymousClass5GF
            if (r1 == 0) goto L_0x038f
            X.5GF r15 = (X.AnonymousClass5GF) r15
            r1 = 0
            X.C36321k7.A16(r10, r14, r0, r1)
            r4 = 0
            if (r28 == 0) goto L_0x031e
            X.66U r2 = r15.A00
            if (r2 != 0) goto L_0x0a39
            java.lang.String r0 = "fcsLoadingEventManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x031e:
            r15.A01 = r0
            java.lang.String r0 = "account_compliance_status"
            java.lang.Object r1 = r10.get(r0)
            if (r1 != 0) goto L_0x033e
            java.lang.String r0 = "FcsBRComplianceResource/execute missing complianceStatus input"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r3 = "ILLEGAL_ARGUMENTS"
            java.lang.String r2 = "Invalid data input. Please make sure to provide the compliance status to this resource"
        L_0x0331:
            X.7jf r1 = r15.A01
            if (r1 == 0) goto L_0x007e
            X.6PH r0 = new X.6PH
            r0.<init>(r4, r3, r2)
            r1.BXS(r0, r4)
            return
        L_0x033e:
            java.lang.String r0 = "DOB_CHALLENGED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x038a
            java.lang.String r4 = r14.A04
            X.0wG r0 = r15.A03
            android.content.Context r2 = r0.A00
            java.lang.Class<com.whatsapp.payments.ui.BrazilPayBloksActivity> r0 = com.whatsapp.payments.ui.BrazilPayBloksActivity.class
            android.content.Intent r3 = X.C36441kJ.A0H(r2, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r0)
            java.lang.String r1 = "screen_name"
            java.lang.String r0 = "brpay_p_compliance_dob"
            r3.putExtra(r1, r0)
            java.lang.String r1 = "onboarding_context"
            java.lang.String r0 = "p2m_context"
            X.C1025050g.A01(r3, r1, r0)
            java.lang.String r0 = "fds_manager_id"
            X.C1025050g.A01(r3, r0, r4)
            java.lang.String r1 = "dob_prompted_for_compliance_only"
            java.lang.String r0 = "1"
            X.C1025050g.A01(r3, r1, r0)
            java.lang.String r1 = "compliance_reason"
            java.lang.String r0 = "account-registration"
            X.C1025050g.A01(r3, r1, r0)
            java.lang.String r1 = "fds_resource_id"
            java.lang.String r0 = "native_br_compliance"
            X.C1025050g.A01(r3, r1, r0)
            java.lang.String r1 = r15.A02
            if (r1 != 0) goto L_0x0a41
            java.lang.String r0 = "observerId"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x038a:
            java.lang.String r3 = "UNSUPPORTED_TYPE"
            java.lang.String r2 = "This compliance type is not supported. Please add a supported type"
            goto L_0x0331
        L_0x038f:
            boolean r1 = r15 instanceof X.AnonymousClass5GI
            if (r1 == 0) goto L_0x03f3
            X.5GI r15 = (X.AnonymousClass5GI) r15
            java.lang.String r7 = "app_to_app_partner_app_package"
            boolean r1 = r10.containsKey(r7)
            java.lang.String r6 = "app_to_app_partner_intent_action"
            if (r1 != 0) goto L_0x03a5
            boolean r1 = r10.containsKey(r6)
            if (r1 == 0) goto L_0x03c3
        L_0x03a5:
            java.lang.String r2 = X.C36431kI.A1A(r7, r10)
            java.lang.String r1 = X.C36431kI.A1A(r6, r10)
            X.00I r3 = X.AnonymousClass3RH.A00(r2, r1)
            if (r3 == 0) goto L_0x03c3
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r10)
            java.lang.Object r1 = r3.A00
            r2.put(r7, r1)
            java.lang.Object r1 = r3.A01
            r2.put(r6, r1)
            r10 = r2
        L_0x03c3:
            r5 = 0
            java.lang.String r1 = "com.whatsapp.payments.phoenix.action.launch_activity_for_phoenix_result"
            android.content.Intent r4 = X.C36441kJ.A0I(r1)
            X.0wG r1 = r15.A04
            android.content.Context r3 = r1.A00
            java.lang.String r1 = r3.getPackageName()
            r4.setPackage(r1)
            java.lang.String r1 = X.C36431kI.A1A(r7, r10)
            r4.putExtra(r7, r1)
            java.lang.String r1 = X.C36431kI.A1A(r6, r10)
            r4.putExtra(r6, r1)
            java.lang.String r2 = "app_to_app_request_payload"
            java.lang.String r1 = X.C36431kI.A1A(r2, r10)
            r4.putExtra(r2, r1)
            r3.sendBroadcast(r4)
            r0.BiH(r5)
            return
        L_0x03f3:
            boolean r1 = r15 instanceof X.AnonymousClass5GB
            if (r1 == 0) goto L_0x0475
            X.5GB r15 = (X.AnonymousClass5GB) r15
            r1 = 0
            X.C36321k7.A16(r10, r14, r0, r1)
            r15.A00 = r0
            java.lang.String r2 = "formatted_amount"
            java.lang.Object r4 = r10.get(r2)
            r5 = 0
            java.lang.String r6 = " is null or not a "
            if (r4 == 0) goto L_0x040e
            boolean r1 = r4 instanceof java.lang.String
            if (r1 != 0) goto L_0x0426
        L_0x040e:
            java.lang.StringBuilder r2 = X.C36331k8.A0k(r2, r6)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            X.08f r1 = X.C36441kJ.A1A(r1)
            java.lang.String r1 = r1.BHa()
            java.lang.String r2 = X.AnonymousClass000.A0q(r1, r2)
            java.lang.String r1 = "incorrect_input"
            r15.A05(r0, r1, r2)
            r4 = r5
        L_0x0426:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x007e
            java.lang.String r3 = "recipient_name"
            java.lang.Object r2 = r10.get(r3)
            if (r2 == 0) goto L_0x045d
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L_0x045d
            r5 = r2
        L_0x0437:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x007e
            X.0wG r0 = r15.A01
            android.content.Context r3 = r0.A00
            java.lang.String r2 = r14.A04
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsTransactionConfirmationActivity"
            r1.setClassName(r3, r0)
            java.lang.String r0 = "extra_fds_manager_id"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "extra_merchant_name"
            r1.putExtra(r0, r5)
            java.lang.String r0 = "extra_formatted_amount"
            r1.putExtra(r0, r4)
            X.C90494aF.A0r(r3, r1)
            return
        L_0x045d:
            java.lang.StringBuilder r2 = X.C36331k8.A0k(r3, r6)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            X.08f r1 = X.C36441kJ.A1A(r1)
            java.lang.String r1 = r1.BHa()
            java.lang.String r2 = X.AnonymousClass000.A0q(r1, r2)
            java.lang.String r1 = "incorrect_input"
            r15.A05(r0, r1, r2)
            goto L_0x0437
        L_0x0475:
            boolean r1 = r15 instanceof X.AnonymousClass5GA
            if (r1 == 0) goto L_0x04b3
            X.5GA r15 = (X.AnonymousClass5GA) r15
            r1 = 0
            X.C36321k7.A16(r10, r14, r0, r1)
            r15.A00 = r0
            java.lang.String r0 = "credential_id"
            java.lang.String r6 = X.C90464aC.A0a(r0, r10)
            java.lang.String r0 = "is_forget_pin_flow"
            boolean r5 = X.C90464aC.A1a(r10, r0)
            X.0wG r0 = r15.A01
            android.content.Context r4 = r0.A00
            java.lang.String r3 = r14.A04
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsResetPinActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "extra_fds_manager_id"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "extra_credential_id"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "extra_is_forget_pin"
            r2.putExtra(r0, r5)
            X.C90494aF.A0r(r4, r2)
            return
        L_0x04b3:
            boolean r1 = r15 instanceof X.AnonymousClass5G9
            if (r1 == 0) goto L_0x0505
            X.5G9 r15 = (X.AnonymousClass5G9) r15
            r1 = 0
            X.C36321k7.A16(r10, r14, r0, r1)
            r15.A00 = r0
            java.lang.String r0 = "is_full_screen"
            java.lang.Object r1 = r10.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            X.AnonymousClass00C.A0E(r1, r0)
            boolean r7 = X.AnonymousClass000.A1X(r1)
            java.lang.String r0 = "skip_2fa"
            boolean r6 = X.C90474aD.A1W(r10, r0)
            java.lang.String r0 = "skip_value_props_screen"
            boolean r5 = X.C90474aD.A1W(r10, r0)
            X.0wG r0 = r15.A01
            android.content.Context r4 = r0.A00
            java.lang.String r3 = r14.A04
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "extra_fds_manager_id"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "extra_onboarding_skip_2fa"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "extra_is_full_screen"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "extra_skip_value_props_screen"
            r2.putExtra(r0, r5)
            X.C90494aF.A0r(r4, r2)
            return
        L_0x0505:
            boolean r1 = r15 instanceof X.AnonymousClass5G8
            if (r1 == 0) goto L_0x052c
            X.5G8 r15 = (X.AnonymousClass5G8) r15
            X.C36321k7.A0z(r14, r0)
            r15.A00 = r0
            X.0wG r0 = r15.A01
            android.content.Context r4 = r0.A00
            java.lang.String r3 = r14.A04
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsAddPaymentMethodActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "extra_fds_manager_id"
            r2.putExtra(r0, r3)
            X.C90494aF.A0r(r4, r2)
            return
        L_0x052c:
            boolean r1 = r15 instanceof X.AnonymousClass5GE
            if (r1 == 0) goto L_0x05b6
            X.5GE r15 = (X.AnonymousClass5GE) r15
            r1 = 0
            X.C36321k7.A16(r10, r14, r0, r1)
            r15.A00 = r0
            java.lang.String r0 = "credential_id"
            java.lang.Object r6 = r10.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.AnonymousClass00C.A0E(r6, r0)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "mode"
            java.lang.String r21 = X.C90484aE.A0m(r0, r10)
            java.lang.String r0 = "npci_common_library_transaction_id"
            java.lang.Object r5 = r10.get(r0)
            boolean r0 = r5 instanceof java.lang.String
            r4 = 0
            if (r0 == 0) goto L_0x05b4
            java.lang.String r5 = (java.lang.String) r5
        L_0x0558:
            java.lang.String r0 = "receiver_handle"
            java.lang.String r24 = X.C90464aC.A0Z(r0, r10)
            java.lang.String r0 = "receiver_name"
            java.lang.String r23 = X.C90464aC.A0Z(r0, r10)
            java.lang.String r0 = "amount"
            java.lang.Object r3 = r10.get(r0)
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x05ab
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Long r3 = X.C90484aE.A0h(r3)
        L_0x0574:
            java.lang.String r0 = "offset"
            java.lang.Object r2 = r10.get(r0)
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x05a9
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x0580:
            java.lang.String r0 = "is_asynchronous"
            java.lang.Object r1 = r10.get(r0)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x05a7
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L_0x058c:
            if (r28 == 0) goto L_0x0590
            java.lang.Integer r4 = r7.A00
        L_0x0590:
            X.0wU r0 = r15.A05
            X.74H r13 = new X.74H
            r17 = r2
            r18 = r4
            r19 = r3
            r20 = r6
            r22 = r5
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0.Boy(r13)
            return
        L_0x05a7:
            r1 = r4
            goto L_0x058c
        L_0x05a9:
            r2 = r4
            goto L_0x0580
        L_0x05ab:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L_0x05b2
            java.lang.Long r3 = (java.lang.Long) r3
            goto L_0x0574
        L_0x05b2:
            r3 = r4
            goto L_0x0574
        L_0x05b4:
            r5 = r4
            goto L_0x0558
        L_0x05b6:
            boolean r1 = r15 instanceof X.AnonymousClass5GH
            if (r1 == 0) goto L_0x05ca
            X.5GH r15 = (X.AnonymousClass5GH) r15
            X.6Ou r2 = r15.A01
            java.lang.String r1 = r15.A00
            r3 = 0
            if (r1 != 0) goto L_0x0a4a
            java.lang.String r0 = "observerId"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05ca:
            boolean r1 = r15 instanceof X.C105755Fy
            if (r1 == 0) goto L_0x05ea
            X.5Fy r15 = (X.C105755Fy) r15
            r1 = 0
            X.C36321k7.A16(r10, r14, r0, r1)
            X.61B r2 = r15.A00
            java.lang.String r1 = r14.A04
            X.9oR r8 = r2.A00(r1)
            r7 = 0
            if (r8 != 0) goto L_0x0a5a
            java.lang.String r1 = "FdsIqResource/execute: can't find FdsManager from the job_id"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.6PH r1 = X.AnonymousClass6PH.A03
            r0.BXS(r1, r7)
            return
        L_0x05ea:
            boolean r1 = r15 instanceof X.C105745Fx
            if (r1 == 0) goto L_0x068f
            X.5Fx r15 = (X.C105745Fx) r15
            r2 = 0
            X.C36341k9.A1E(r10, r2, r0)
            java.lang.String r1 = "code"
            java.lang.Object r3 = r10.get(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            int r3 = X.C90484aE.A0C(r3, r1)
            java.lang.String r1 = "abprop_type"
            java.lang.String r6 = X.C90464aC.A0a(r1, r10)
            java.lang.String r1 = "default_value"
            java.lang.Object r8 = r10.get(r1)
            int r7 = r6.hashCode()
            switch(r7) {
                case -891985903: goto L_0x0623;
                case 3271912: goto L_0x0626;
                case 64711720: goto L_0x0629;
                case 97526364: goto L_0x062c;
                case 1958052158: goto L_0x062f;
                default: goto L_0x0613;
            }
        L_0x0613:
            r1 = 1
            X.011[] r3 = new X.AnonymousClass011[r1]
            java.lang.String r1 = "abprop_value"
            X.C36341k9.A1J(r1, r8, r3, r2)
            java.util.LinkedHashMap r1 = X.C000400e.A08(r3)
            r0.BiH(r1)
            return
        L_0x0623:
            java.lang.String r1 = "string"
            goto L_0x0631
        L_0x0626:
            java.lang.String r1 = "json"
            goto L_0x0631
        L_0x0629:
            java.lang.String r1 = "boolean"
            goto L_0x0631
        L_0x062c:
            java.lang.String r1 = "float"
            goto L_0x0631
        L_0x062f:
            java.lang.String r1 = "integer"
        L_0x0631:
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0613
            X.0yC r4 = r15.A00
            android.content.SharedPreferences r5 = r4.A06
            java.lang.String r1 = java.lang.Integer.toString(r3)
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L_0x0613
            switch(r7) {
                case -891985903: goto L_0x064a;
                case 3271912: goto L_0x0657;
                case 64711720: goto L_0x0664;
                case 97526364: goto L_0x0671;
                case 1958052158: goto L_0x067e;
                default: goto L_0x0648;
            }
        L_0x0648:
            r8 = 0
            goto L_0x0613
        L_0x064a:
            java.lang.String r1 = "string"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0648
            java.lang.String r8 = r4.A09(r3)
            goto L_0x0613
        L_0x0657:
            java.lang.String r1 = "json"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0648
            org.json.JSONObject r8 = r4.A0A(r3)
            goto L_0x0613
        L_0x0664:
            java.lang.String r1 = "boolean"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0648
            java.lang.Boolean r8 = X.C36391kE.A0q(r4, r3)
            goto L_0x0613
        L_0x0671:
            java.lang.String r1 = "float"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0648
            java.lang.Float r8 = X.C90494aF.A0T(r4, r3)
            goto L_0x0613
        L_0x067e:
            java.lang.String r1 = "integer"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0648
            int r1 = r4.A07(r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            goto L_0x0613
        L_0x068f:
            boolean r1 = r15 instanceof X.C105735Fw
            if (r1 == 0) goto L_0x0726
            X.5Fw r15 = (X.C105735Fw) r15
            r1 = 0
            X.C36341k9.A1E(r10, r1, r0)
            X.5Te r1 = X.C108355Te.ERROR
            java.lang.String r1 = r1.key
            java.lang.Object r2 = r10.get(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.AnonymousClass00C.A0E(r2, r1)
            java.util.Map r2 = (java.util.Map) r2
            java.util.LinkedHashMap r6 = X.C000400e.A06(r2)
            java.util.Set r2 = r6.keySet()
            X.5Te r7 = X.C108355Te.ERROR_NAME
            java.lang.String r1 = r7.key
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x06c1
            java.lang.String r2 = r7.key
            java.lang.String r1 = ""
            r6.put(r2, r1)
        L_0x06c1:
            java.lang.String r1 = "error_map_type"
            java.lang.Object r2 = r10.get(r1)
            boolean r1 = r2 instanceof java.lang.String
            r5 = 0
            if (r1 != 0) goto L_0x06cd
            r2 = r5
        L_0x06cd:
            X.5Te r1 = X.C108355Te.ERROR_CODE
            java.lang.String r1 = r1.key
            java.lang.Object r4 = r6.get(r1)
            boolean r1 = r4 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0724
            java.lang.Integer r4 = (java.lang.Integer) r4
        L_0x06db:
            if (r2 == 0) goto L_0x0700
            if (r4 == 0) goto L_0x0700
            java.util.Map r1 = r15.A00
            java.lang.Object r3 = r1.get(r2)
            X.5qk r3 = (X.C119965qk) r3
            if (r3 == 0) goto L_0x0700
            java.lang.String r2 = r4.toString()
            r1 = 0
            X.AnonymousClass00C.A0D(r2, r1)
            X.6PS r1 = r3.A01
            java.lang.String r2 = r1.A03(r2)
            if (r2 == 0) goto L_0x0700
            X.5Te r1 = X.C108355Te.ERROR_MESSAGE
            java.lang.String r1 = r1.key
            r6.put(r1, r2)
        L_0x0700:
            java.lang.String r1 = r7.key
            java.lang.Object r3 = r6.get(r1)
            X.C90494aF.A10(r3)
            java.lang.String r3 = (java.lang.String) r3
            X.5Te r1 = X.C108355Te.ERROR_MESSAGE
            java.lang.String r1 = r1.key
            java.lang.Object r2 = r6.get(r1)
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L_0x0722
            java.lang.String r2 = (java.lang.String) r2
        L_0x0719:
            X.6PH r1 = new X.6PH
            r1.<init>(r4, r3, r2)
            r0.BXS(r1, r5)
            return
        L_0x0722:
            r2 = r5
            goto L_0x0719
        L_0x0724:
            r4 = r5
            goto L_0x06db
        L_0x0726:
            boolean r1 = r15 instanceof X.AnonymousClass5GD
            if (r1 == 0) goto L_0x0764
            X.5GD r15 = (X.AnonymousClass5GD) r15
            r1 = 0
            X.C36321k7.A16(r10, r14, r0, r1)
            r15.A00 = r0
            java.lang.String r1 = "payment_link"
            java.lang.Object r3 = r10.get(r1)
            boolean r1 = r3 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L_0x0762
            java.lang.String r3 = (java.lang.String) r3
        L_0x073f:
            java.lang.String r1 = "success_url"
            java.lang.String r4 = X.C90464aC.A0Z(r1, r10)
            java.lang.String r1 = "cancel_url"
            java.lang.String r5 = X.C90464aC.A0Z(r1, r10)
            java.lang.String r1 = "referral"
            java.lang.String r6 = X.C90464aC.A0Z(r1, r10)
            if (r3 == 0) goto L_0x0ad8
            if (r4 == 0) goto L_0x0ad8
            X.6Ou r1 = r15.A02
            java.lang.String r0 = r15.A01
            if (r0 != 0) goto L_0x0ac9
            java.lang.String r0 = "observerId"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0762:
            r3 = r2
            goto L_0x073f
        L_0x0764:
            boolean r1 = r15 instanceof X.AnonymousClass5GC
            if (r1 == 0) goto L_0x0794
            X.5GC r15 = (X.AnonymousClass5GC) r15
            r1 = 0
            X.C36321k7.A16(r10, r14, r0, r1)
            r15.A00 = r0
            java.lang.String r1 = "account_compliance_status"
            java.lang.Object r4 = r10.get(r1)
            boolean r1 = r4 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L_0x0792
            java.lang.String r4 = (java.lang.String) r4
        L_0x077d:
            java.lang.String r1 = "referral"
            java.lang.String r3 = X.C90464aC.A0Z(r1, r10)
            if (r4 == 0) goto L_0x0af2
            X.6Ou r1 = r15.A02
            java.lang.String r0 = r15.A01
            if (r0 != 0) goto L_0x0ae3
            java.lang.String r0 = "observerId"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0792:
            r4 = r2
            goto L_0x077d
        L_0x0794:
            boolean r1 = r15 instanceof X.AnonymousClass5G7
            if (r1 == 0) goto L_0x07c3
            X.5G7 r15 = (X.AnonymousClass5G7) r15
            r1 = 0
            X.C36341k9.A1E(r10, r1, r0)
            java.lang.String r2 = "phone_number"
            boolean r1 = r10.containsKey(r2)
            if (r1 != 0) goto L_0x07b1
            r4 = 0
        L_0x07a7:
            r3 = 1
        L_0x07a8:
            r2 = 0
            if (r3 == 0) goto L_0x0afd
            X.6PH r1 = X.AnonymousClass6PH.A03
            r0.BXS(r1, r2)
            return
        L_0x07b1:
            java.lang.String r2 = X.C90464aC.A0a(r2, r10)
            java.lang.String r1 = "[^\\d+]"
            java.lang.String r4 = X.C36411kG.A0y(r2, r1)
            int r1 = r4.length()
            r3 = 0
            if (r1 != 0) goto L_0x07a8
            goto L_0x07a7
        L_0x07c3:
            boolean r1 = r15 instanceof X.AnonymousClass5G0
            if (r1 == 0) goto L_0x07e1
            X.5G0 r15 = (X.AnonymousClass5G0) r15
            r1 = 0
            X.C36341k9.A1E(r10, r1, r0)
            java.lang.String r1 = "query"
            java.lang.Object r1 = r10.get(r1)
            if (r1 != 0) goto L_0x0b17
            java.lang.String r1 = "No parameters"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            r2 = 0
            X.6PH r1 = X.AnonymousClass6PH.A03
            r0.BXS(r1, r2)
            return
        L_0x07e1:
            boolean r1 = r15 instanceof X.AnonymousClass5G5
            if (r1 == 0) goto L_0x080c
            X.5G5 r15 = (X.AnonymousClass5G5) r15
            r1 = 0
            X.C36321k7.A16(r10, r14, r0, r1)
            java.util.List r1 = r15.A01
            r1.add(r0)
            X.66v r6 = r15.A08()
            java.lang.String r8 = r14.A03
            boolean r0 = r14.A06
            X.5wR r7 = r14.A01
            if (r7 == 0) goto L_0x0b24
            int r12 = r14.A00
            r13 = 100
            java.lang.String r9 = r14.A04
            X.00f r11 = X.C000400e.A0D()
            r15 = 0
            r14 = r0
            r6.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x080c:
            boolean r1 = r15 instanceof X.C105655Fn
            if (r1 == 0) goto L_0x084b
            X.5Fn r15 = (X.C105655Fn) r15
            r1 = 0
            X.C36321k7.A16(r10, r14, r0, r1)
            int r4 = r14.A00
            java.lang.String r3 = r14.A04
            r15.A00 = r3
            java.lang.String r2 = r14.A03
            X.011 r5 = X.C36441kJ.A19(r3, r2)
            X.6wz r1 = r15.A02
            r1.A00 = r5
            X.6DL r1 = r15.A01
            boolean r0 = r1.A02(r14, r0, r10, r5)
            if (r0 == 0) goto L_0x007e
            X.66v r6 = r15.A08()
            boolean r0 = r14.A06
            X.5wR r7 = r14.A01
            X.C18740tg.A06(r7)
            X.AnonymousClass00C.A08(r7)
            r13 = 100
            X.00f r11 = X.C000400e.A0D()
            r15 = 0
            r8 = r2
            r9 = r3
            r12 = r4
            r14 = r0
            r6.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x084b:
            X.5Fo r15 = (X.C105665Fo) r15
            r1 = 0
            X.C36321k7.A16(r10, r14, r0, r1)
            java.lang.String r4 = r14.A04
            r15.A00 = r4
            java.lang.String r3 = r14.A03
            X.011 r2 = X.C36441kJ.A19(r4, r3)
            X.6wz r1 = r15.A02
            r1.A00 = r2
            X.6DL r1 = r15.A01
            boolean r0 = r1.A02(r14, r0, r10, r2)
            if (r0 == 0) goto L_0x007e
            java.util.Map r2 = r14.A05
            java.lang.String r0 = "bottom_sheet_max_height_percentage"
            java.lang.Object r1 = r2.get(r0)
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x08b0
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x08b0
            int r18 = r1.intValue()
        L_0x087b:
            java.lang.String r0 = "show_divider_under_nav_bar"
            java.lang.Object r1 = r2.get(r0)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x08ad
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x08ad
            boolean r20 = r1.booleanValue()
        L_0x088d:
            X.66v r11 = r15.A08()
            boolean r2 = r14.A06
            X.5wR r1 = r14.A01
            X.C18740tg.A06(r1)
            X.AnonymousClass00C.A08(r1)
            int r0 = r14.A00
            java.util.Map r16 = X.C105665Fo.A00(r10)
            r19 = r2
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r10
            r17 = r0
            r11.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x08ad:
            r20 = 0
            goto L_0x088d
        L_0x08b0:
            r18 = 100
            goto L_0x087b
        L_0x08b3:
            X.00f r1 = X.C000400e.A0D()
            X.AnonymousClass5G2.A00(r0, r15, r1, r4)
            return
        L_0x08bb:
            int r1 = r5.hashCode()
            switch(r1) {
                case -1728983272: goto L_0x0958;
                case -1628349243: goto L_0x08e1;
                case -1238355255: goto L_0x08e4;
                case 2252048: goto L_0x0956;
                default: goto L_0x08c2;
            }
        L_0x08c2:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "Invalid action ("
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = ") passed to execute."
            java.lang.String r5 = X.AnonymousClass000.A0q(r1, r2)
            java.util.Map r1 = r14.A05
            java.lang.String r4 = "extensions-invalid-action"
            r8 = 0
            r2 = r0
            r3 = r15
            r6 = r10
            r7 = r1
            X.AnonymousClass5G3.A02(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x08e1:
            java.lang.String r1 = "plugin_complete"
            goto L_0x08e6
        L_0x08e4:
            java.lang.String r1 = "plugin_failed"
        L_0x08e6:
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x08c2
            X.5lv r3 = r15.A0A
            java.lang.String r1 = "action_payload"
            java.lang.Object r2 = r10.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.collections.Map<*, *>"
            X.AnonymousClass00C.A0E(r2, r4)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r1 = "business_payload"
            java.lang.Object r2 = X.C90514aH.A0n(r1, r4, r2)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r1 = "data"
            java.lang.Object r1 = X.C90514aH.A0n(r1, r4, r2)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r6 = "plugin"
            java.lang.Object r2 = X.C90514aH.A0n(r6, r4, r1)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r1 = "name"
            java.lang.String r8 = X.C90464aC.A0a(r1, r2)
            java.lang.String r1 = "plugin_complete"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x092f
            X.6PZ r3 = r3.A00
            r4 = 0
            java.lang.String r7 = "plugin_end"
            java.lang.Long r5 = X.C36411kG.A0t()
            r9 = r4
            r3.A01(r4, r5, r6, r7, r8, r9)
            goto L_0x0982
        L_0x092f:
            java.lang.String r1 = "plugin_failed"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0982
            java.lang.String r1 = "output"
            java.lang.Object r2 = X.C90514aH.A0n(r1, r4, r2)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r1 = "error"
            java.lang.Object r1 = X.C90514aH.A0n(r1, r4, r2)
            X.6PZ r3 = r3.A00
            r4 = 0
            java.lang.String r9 = r1.toString()
            java.lang.String r7 = "plugin_error"
            java.lang.Long r5 = X.C36411kG.A0t()
            r3.A01(r4, r5, r6, r7, r8, r9)
            goto L_0x0982
        L_0x0956:
            java.lang.String r3 = "INIT"
        L_0x0958:
            boolean r1 = r5.equals(r3)
            if (r1 == 0) goto L_0x08c2
            r15.A03 = r2
            java.util.Map r2 = r14.A05
            java.lang.String r1 = "extension_id"
            java.lang.String r1 = X.C90464aC.A0a(r1, r2)
            X.1KT r4 = r15.A09
            int r3 = r1.hashCode()
            r2 = 1
            java.lang.String r1 = "data_channel_navigation"
            r4.A04(r3, r1, r2)
            java.util.List r1 = r15.A0G
            r1.clear()
            java.util.List r1 = r15.A0F
            r1.clear()
            r1 = 1
            r15.A00 = r1
        L_0x0982:
            X.AnonymousClass5G3.A00(r14, r0, r15, r10)
            return
        L_0x0986:
            java.lang.String r2 = "PaymentCardTokenizationNativeResource"
            java.lang.String r1 = "Invalid data input. Please make sure to provide the CEP, the full name and the CPF to this resource"
            java.lang.String r1 = X.C24611Dc.A01(r2, r1)
            com.whatsapp.util.Log.e((java.lang.String) r1)
            java.lang.Integer r3 = X.C90494aF.A0U()
            java.lang.String r2 = "ILLEGAL_ARGUMENTS"
            X.6PH r1 = new X.6PH
            r1.<init>(r3, r2, r4)
            r0.BXS(r1, r4)
            return
        L_0x09a0:
            r15.A01 = r0
            java.lang.String r8 = "full_name"
            java.lang.String r7 = X.C36431kI.A1A(r8, r10)
            java.lang.String r6 = "tax_id"
            java.lang.String r5 = X.C36431kI.A1A(r6, r10)
            java.lang.String r1 = "postal_code"
            java.lang.String r11 = X.C36431kI.A1A(r1, r10)
            if (r7 == 0) goto L_0x0a27
            if (r11 == 0) goto L_0x0a27
            if (r5 == 0) goto L_0x0a27
            java.lang.String r10 = r14.A04
            X.0wG r0 = r15.A03
            android.content.Context r2 = r0.A00
            java.lang.Class<com.whatsapp.payments.ui.BrazilPayBloksActivity> r0 = com.whatsapp.payments.ui.BrazilPayBloksActivity.class
            android.content.Intent r3 = X.C36441kJ.A0H(r2, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r0)
            java.lang.String r1 = "screen_name"
            java.lang.String r0 = "brpay_p_user_address"
            r3.putExtra(r1, r0)
            java.lang.String r1 = "onboarding_context"
            java.lang.String r0 = "p2m_context"
            X.C1025050g.A01(r3, r1, r0)
            java.lang.String r13 = "#####-###"
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0u()
            r9 = 0
            r4 = 0
        L_0x09e1:
            int r0 = r13.length()
            if (r9 >= r0) goto L_0x0a01
            int r0 = r11.length()
            if (r4 >= r0) goto L_0x0a01
            char r1 = r13.charAt(r9)
            r0 = 45
            if (r1 != r0) goto L_0x09fb
            r12.append(r0)
        L_0x09f8:
            int r9 = r9 + 1
            goto L_0x09e1
        L_0x09fb:
            X.C90514aH.A1R(r11, r12, r4)
            int r4 = r4 + 1
            goto L_0x09f8
        L_0x0a01:
            java.lang.String r1 = X.C36381kD.A0y(r12)
            java.lang.String r0 = "address_postal_code"
            X.C1025050g.A01(r3, r0, r1)
            X.C1025050g.A01(r3, r6, r5)
            X.C1025050g.A01(r3, r8, r7)
            java.lang.String r0 = "fds_manager_id"
            X.C1025050g.A01(r3, r0, r10)
            java.lang.String r1 = "fds_resource_id"
            java.lang.String r0 = "native_br_p2m_checkout_address"
            X.C1025050g.A01(r3, r1, r0)
            java.lang.String r1 = r15.A02
            if (r1 != 0) goto L_0x0a41
            java.lang.String r0 = "observerId"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0a27:
            java.lang.String r1 = "FcsBRKycAddressCollectionResource/execute missing fullName, cpf or CEP input"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            java.lang.String r3 = "ILLEGAL_ARGUMENTS"
            java.lang.String r2 = "Invalid data input. Please make sure to provide the CEP, the full name and the CPF to this resource"
            X.6PH r1 = new X.6PH
            r1.<init>(r4, r3, r2)
            r0.BXS(r1, r4)
            return
        L_0x0a39:
            java.lang.String r1 = "onLoadingFailure"
            java.lang.String r0 = ""
            r2.A01(r7, r1, r0, r4)
            return
        L_0x0a41:
            java.lang.String r0 = "fds_observer_id"
            X.C1025050g.A01(r3, r0, r1)
            r2.startActivity(r3)
            return
        L_0x0a4a:
            X.6EW r2 = r2.A02(r1)
            X.6zr r1 = new X.6zr
            r1.<init>()
            r2.A02(r1)
            r0.BiH(r3)
            return
        L_0x0a5a:
            java.lang.String r1 = "config"
            java.lang.Object r6 = r10.get(r1)
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L_0x0abe
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0abe
            X.5Rg[] r9 = X.C107885Rg.values()
            r4 = 0
            int r3 = r9.length
        L_0x0a6e:
            if (r4 >= r3) goto L_0x0ab3
            r5 = r9[r4]
            java.lang.String r2 = r5.name()
            java.lang.String r1 = "type"
            java.lang.String r1 = X.C90464aC.A0Z(r1, r10)
            if (r2 != 0) goto L_0x0aa9
            if (r1 != 0) goto L_0x0ab0
        L_0x0a80:
            java.lang.String r1 = "state"
            java.lang.String r4 = X.C90464aC.A0Z(r1, r10)
            java.lang.String r1 = "parameters"
            java.lang.Object r2 = r10.get(r1)
            boolean r1 = r2 instanceof java.util.Map
            if (r1 == 0) goto L_0x0a99
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L_0x0a99
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r2)
        L_0x0a99:
            X.6Be r3 = new X.6Be
            r3.<init>(r6, r4, r7)
            java.lang.String r2 = r3.A00
            X.6x1 r1 = new X.6x1
            r1.<init>(r0, r8, r6)
            r8.A0A(r1, r5, r3, r2)
            return
        L_0x0aa9:
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0ab0
            goto L_0x0a80
        L_0x0ab0:
            int r4 = r4 + 1
            goto L_0x0a6e
        L_0x0ab3:
            java.lang.String r1 = "FdsIqResource/execute: type can't be null"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.6PH r1 = X.AnonymousClass6PH.A03
            r0.BXS(r1, r7)
            return
        L_0x0abe:
            java.lang.String r1 = "FdsIqResource/execute: config can't be null"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.6PH r1 = X.AnonymousClass6PH.A03
            r0.BXS(r1, r7)
            return
        L_0x0ac9:
            X.6EW r0 = r1.A02(r0)
            java.lang.String r2 = r14.A04
            X.70A r1 = new X.70A
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A02(r1)
            return
        L_0x0ad8:
            java.lang.String r1 = "NativeP2mLiteHppCheckoutResource/execute: paymentLink and successUrl can't be null"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.6PH r1 = X.AnonymousClass6PH.A03
            r0.BXS(r1, r2)
            return
        L_0x0ae3:
            X.6EW r2 = r1.A02(r0)
            java.lang.String r1 = r14.A04
            X.706 r0 = new X.706
            r0.<init>(r4, r1, r3)
            r2.A02(r0)
            return
        L_0x0af2:
            java.lang.String r1 = "NativeP2mLiteDoComplianceResource/execute: inputComplianceStatus can't be null"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.6PH r1 = X.AnonymousClass6PH.A03
            r0.BXS(r1, r2)
            return
        L_0x0afd:
            java.lang.String r0 = "tel"
            android.net.Uri r2 = android.net.Uri.fromParts(r0, r4, r2)
            java.lang.String r0 = "android.intent.action.DIAL"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.setFlags(r0)
            X.0wG r0 = r15.A00
            android.content.Context r0 = r0.A00
            r0.startActivity(r1)
            return
        L_0x0b17:
            X.0wU r3 = r15.A02
            r2 = 26
            X.736 r1 = new X.736
            r1.<init>(r10, r15, r0, r2)
            r3.Bp1(r1)
            return
        L_0x0b24:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6F2.A07(X.6Dp, X.7jf, X.6PH, java.util.Map):void");
    }

    public AnonymousClass6F2(C105705Fs r1) {
        this.A01 = r1;
    }
}
