package X;

/* renamed from: X.7pr  reason: invalid class name and case insensitive filesystem */
public class C163227pr implements C158597hl {
    public Object A00;
    public final int A01;

    public C163227pr(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: X.5OV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: X.5OV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: com.whatsapp.extensions.phoenix.PhoenixFlowsBottomSheetActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: X.5OV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v66, resolved type: X.5OV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v67, resolved type: X.5OV} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void BX5(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r17
            r2 = r16
            int r0 = r2.A01
            switch(r0) {
                case 1: goto L_0x0015;
                case 2: goto L_0x0044;
                case 3: goto L_0x007f;
                case 4: goto L_0x04d4;
                case 5: goto L_0x0093;
                case 6: goto L_0x017c;
                case 7: goto L_0x0250;
                case 8: goto L_0x04dc;
                case 9: goto L_0x0009;
                case 10: goto L_0x02ab;
                case 11: goto L_0x02e0;
                case 12: goto L_0x04ee;
                case 13: goto L_0x0397;
                case 14: goto L_0x03b3;
                case 15: goto L_0x03db;
                case 16: goto L_0x05ba;
                case 17: goto L_0x0422;
                case 18: goto L_0x043d;
                case 19: goto L_0x05c2;
                case 20: goto L_0x05d1;
                case 21: goto L_0x05db;
                case 22: goto L_0x0451;
                case 23: goto L_0x05ea;
                case 24: goto L_0x048f;
                case 25: goto L_0x0607;
                case 26: goto L_0x0616;
                case 27: goto L_0x04b3;
                case 28: goto L_0x0625;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r2.A00
            X.00S r1 = (X.AnonymousClass00S) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.invoke()
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r3 = r2.A00
            X.6Xv r3 = (X.C133316Xv) r3
            X.70D r1 = (X.AnonymousClass70D) r1
            r5 = 1
            X.AnonymousClass00C.A0D(r1, r5)
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.A0Q
            boolean r0 = r4.get()
            if (r0 != 0) goto L_0x0014
            java.lang.String r2 = r1.A03
            java.lang.String r0 = "open_bloks_screen_graphql"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "open_bloks_screen"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0014
        L_0x0039:
            X.5Sq r1 = r1.A00
            X.5Sq r0 = X.C108215Sq.ON_START
            if (r1 != r0) goto L_0x0014
            X.56y r2 = r3.A0I
            int r0 = r3.A00
            goto L_0x0072
        L_0x0044:
            java.lang.Object r3 = r2.A00
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r3 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines) r3
            X.70D r1 = (X.AnonymousClass70D) r1
            r5 = 1
            X.AnonymousClass00C.A0D(r1, r5)
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.A0O
            boolean r0 = r4.get()
            if (r0 != 0) goto L_0x0014
            java.lang.String r2 = r1.A03
            java.lang.String r0 = "open_bloks_screen_graphql"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "open_bloks_screen"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0014
        L_0x0068:
            X.5Sq r1 = r1.A00
            X.5Sq r0 = X.C108215Sq.ON_START
            if (r1 != r0) goto L_0x0014
            X.56y r2 = r3.A0H
            int r0 = r3.A00
        L_0x0072:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "renderScreen"
            r2.A08(r1, r0)
            r4.set(r5)
            return
        L_0x007f:
            java.lang.Object r2 = r2.A00
            com.whatsapp.extensions.phoenix.PhoenixFlowsBottomSheetActivity r2 = (com.whatsapp.extensions.phoenix.PhoenixFlowsBottomSheetActivity) r2
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "extra_error_message"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 != 0) goto L_0x04af
            boolean r0 = r2.A01
            goto L_0x04ad
        L_0x0093:
            java.lang.Object r5 = r2.A00
            X.6DL r5 = (X.AnonymousClass6DL) r5
            X.70C r1 = (X.AnonymousClass70C) r1
            java.lang.String r2 = r1.A00
            java.util.Map r3 = r1.A02
            java.lang.String r0 = r1.A01
            X.AnonymousClass00C.A07(r0)
            int r4 = java.lang.Integer.parseInt(r0)
            int r0 = r2.hashCode()
            java.lang.String r1 = "prefetchResponse"
            switch(r0) {
                case -2060681962: goto L_0x00b0;
                case -1448417750: goto L_0x00bb;
                case -330036277: goto L_0x00dd;
                case -226946541: goto L_0x00ef;
                case -20769540: goto L_0x00fa;
                case 427609089: goto L_0x0112;
                case 450559314: goto L_0x0124;
                case 499865650: goto L_0x015a;
                default: goto L_0x00af;
            }
        L_0x00af:
            return
        L_0x00b0:
            java.lang.String r0 = "CACHE_HIT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r1 = "bloksCacheHit"
            goto L_0x011c
        L_0x00bb:
            java.lang.String r0 = "PREFETCH_REQUEST_START"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.5Fr r2 = r5.A02
            java.lang.String r0 = "prefetchPerfTracker"
            r2.A00(r4, r0)
            java.lang.String r1 = "start"
            X.0zf r0 = r2.A01
            r0.A03(r4, r1)
            java.lang.String r0 = "EVENT_PARAM_APP_ID"
            java.lang.String r1 = X.C90484aE.A0m(r0, r3)
            java.lang.String r0 = "app_id"
            r2.A02(r4, r0, r1)
            return
        L_0x00dd:
            java.lang.String r0 = "PREFETCH_REQUEST_SUCCESS"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.5Fr r0 = r5.A02
            X.0zf r5 = r0.A01
            r5.A03(r4, r1)
            r0 = 467(0x1d3, float:6.54E-43)
            goto L_0x0156
        L_0x00ef:
            java.lang.String r0 = "REQUEST_SUCCESS"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r1 = "bloksPayloadResponse"
            goto L_0x011c
        L_0x00fa:
            java.lang.String r0 = "DROP_QPL_LOGGING_MARKER"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.5Fr r2 = r5.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            if (r0 == 0) goto L_0x0014
            X.0zE r1 = r2.A02
            int r0 = r2.A00
            r1.markerDrop(r0, r4)
            return
        L_0x0112:
            java.lang.String r0 = "OPEN_SCREEN"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r1 = "openScreen"
        L_0x011c:
            X.5Fs r0 = r5.A03
            X.0zf r0 = r0.A01
            r0.A03(r4, r1)
            return
        L_0x0124:
            java.lang.String r0 = "PREFETCH_REQUEST_FAILURE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.5Fr r2 = r5.A02
            X.0zf r5 = r2.A01
            r5.A03(r4, r1)
            java.lang.String r1 = "EVENT_PARAM_ERROR_CODE"
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x0144
            java.lang.String r1 = X.C90484aE.A0m(r1, r3)
            java.lang.String r0 = "error_code"
            r2.A02(r4, r0, r1)
        L_0x0144:
            java.lang.String r1 = "EVENT_PARAM_ERROR_MESSAGE"
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x0155
            java.lang.String r1 = X.C90484aE.A0m(r1, r3)
            java.lang.String r0 = "error_message"
            r2.A02(r4, r0, r1)
        L_0x0155:
            r0 = 3
        L_0x0156:
            r5.A04(r4, r0)
            return
        L_0x015a:
            java.lang.String r0 = "PAYLOAD_SIZE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = "EVENT_PARAM_UNCOMPRESSED_SIZE"
            java.lang.String r0 = X.C36431kI.A1A(r0, r3)
            if (r0 == 0) goto L_0x0014
            long r2 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.String r1 = "blok_payload_size"
            if (r0 == 0) goto L_0x0014
            X.5Fs r0 = r5.A03
            r0.A01(r4, r1, r2)
            return
        L_0x017c:
            java.lang.Object r2 = r2.A00
            X.5tl r2 = (X.C121815tl) r2
            X.703 r1 = (X.AnonymousClass703) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.5GI r2 = r2.A00
            int r3 = r1.A00
            android.os.Bundle r5 = r1.A01
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            java.lang.String r8 = "failure"
            java.lang.String r7 = "PAY: FcsBRActivityResultResource/onDeeplinkActivityResult - response is NULL"
            java.lang.String r6 = "stepupresponse"
            r0 = -1
            if (r3 != r0) goto L_0x0212
            if (r5 == 0) goto L_0x01c0
            java.lang.String r1 = "STEP_UP_RESPONSE"
            r3 = 0
            java.lang.String r0 = r5.getString(r1, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01ef
            java.lang.String r0 = r5.getString(r1)
            r4.put(r6, r0)
            java.lang.String r1 = "STEP_UP_AUTH_CODE"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x01c0
            java.lang.String r1 = r5.getString(r1)
            java.lang.String r0 = "stepupauthcode"
            r4.put(r0, r1)
        L_0x01c0:
            X.3AI r8 = r2.A01
            java.lang.String r7 = "pay_verify_card"
            java.lang.String r6 = "br_p2p_verify_card"
            java.lang.String r5 = "verify_deeplink"
            java.lang.String r3 = "domain"
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            java.lang.String r2 = "config"
            r0 = 1
            X.AnonymousClass00C.A0D(r6, r0)
            java.lang.String r1 = "action"
            r0 = 2
            X.AnonymousClass00C.A0D(r5, r0)
            org.json.JSONObject r0 = X.C36441kJ.A1B()
            r0.put(r1, r5)
            r0.put(r2, r6)
            r0.put(r3, r7)
            java.lang.String r5 = X.C36381kD.A0y(r0)
            X.61B r1 = r8.A04
            monitor-enter(r1)
            goto L_0x0219
        L_0x01ef:
            java.lang.String r1 = "issuerMobileAppAuthResponse"
            java.lang.String r0 = r5.getString(r1, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0212
            java.lang.String r0 = r5.getString(r1, r3)
            r4.put(r1, r0)
            java.lang.String r1 = "TAV"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x01c0
            java.lang.String r0 = r5.getString(r1)
            r4.put(r1, r0)
            goto L_0x01c0
        L_0x0212:
            com.whatsapp.util.Log.e((java.lang.String) r7)
            r4.put(r6, r8)
            goto L_0x01c0
        L_0x0219:
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0647 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0647 }
            monitor-exit(r1)
            java.util.Iterator r3 = r0.iterator()
        L_0x0224:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r3.next()
            X.9oR r0 = (X.C203639oR) r0
            X.9oP r2 = r0.A00
            if (r2 == 0) goto L_0x0224
            X.9Qr r1 = r2.A05
            boolean r0 = r1 instanceof X.AnonymousClass8h2
            if (r0 == 0) goto L_0x0224
            X.8h2 r1 = (X.AnonymousClass8h2) r1
            java.lang.String r0 = r1.A03
            X.0p4 r1 = r2.A0A(r0)
            X.4VC r1 = (X.AnonymousClass4VC) r1
            if (r1 == 0) goto L_0x0224
            boolean r0 = r1.B08(r5)
            if (r0 == 0) goto L_0x0224
            r1.BJW(r5, r4)
            return
        L_0x0250:
            java.lang.Object r4 = r2.A00
            X.5tm r4 = (X.C121825tm) r4
            X.70D r1 = (X.AnonymousClass70D) r1
            boolean r3 = X.C36371kC.A1V(r1)
            java.lang.String r2 = "native_flow_npci_common_library"
            java.lang.String r0 = r1.A02
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.5Sq r0 = r1.A00
            int r2 = r0.ordinal()
            if (r2 == r3) goto L_0x0014
            r0 = 3
            if (r2 == r0) goto L_0x0293
            r0 = 4
            if (r2 != r0) goto L_0x0014
            X.5mc r4 = r4.A00
            java.lang.String r3 = r1.A03
            X.6PH r2 = r1.A01
            java.lang.String r0 = "send_fds_iq"
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0014
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = r4.A00
            r1.Bnv()
            if (r2 == 0) goto L_0x0014
            java.lang.Integer r0 = r2.A00
            if (r0 == 0) goto L_0x0014
            int r0 = r0.intValue()
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A12(r1, r0)
            return
        L_0x0293:
            X.5mc r2 = r4.A00
            java.lang.String r1 = r1.A03
            java.lang.String r0 = "send_fds_iq"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0014
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r0 = r2.A00
            r0.Bnv()
            r0.A3v()
            r0.finish()
            return
        L_0x02ab:
            java.lang.Object r3 = r2.A00
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r3 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r3
            X.70D r1 = (X.AnonymousClass70D) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.String r2 = r1.A03
            java.lang.String r0 = "send_fds_iq"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0014
            java.lang.ref.WeakReference r0 = r3.A0U
            if (r0 == 0) goto L_0x02de
            java.lang.Object r2 = r0.get()
            androidx.fragment.app.DialogFragment r2 = (androidx.fragment.app.DialogFragment) r2
        L_0x02c9:
            X.5Sq r1 = r1.A00
            X.5Sq r0 = X.C108215Sq.ON_START
            if (r1 != r0) goto L_0x064a
            if (r2 == 0) goto L_0x02d7
            boolean r0 = r2.A15()
            if (r0 != 0) goto L_0x0014
        L_0x02d7:
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r3.Bu1(r0)
            return
        L_0x02de:
            r2 = 0
            goto L_0x02c9
        L_0x02e0:
            java.lang.Object r4 = r2.A00
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r4 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r4
            X.706 r1 = (X.AnonymousClass706) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.String r15 = r1.A01
            java.lang.String r8 = r1.A02
            X.1VZ r2 = r4.A07
            if (r2 == 0) goto L_0x0653
            X.AGg r0 = r4.A3j()
            X.3Qa r0 = r0.A07
            X.3T1 r5 = r2.A02(r0)
            X.2bZ r5 = (X.AnonymousClass2bZ) r5
            java.lang.String r2 = r1.A00
            int r1 = r2.hashCode()
            r0 = 35394935(0x21c1577, float:1.146723E-37)
            if (r1 == r0) goto L_0x032e
            r0 = 312640649(0x12a28489, float:1.025631E-27)
            if (r1 == r0) goto L_0x0321
            r0 = 696544716(0x29846dcc, float:5.881024E-14)
            if (r1 != r0) goto L_0x0014
            java.lang.String r0 = "BLOCKED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = "order_details"
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity.A0G(r4, r5, r0)
            return
        L_0x0321:
            java.lang.String r0 = "DOB_CHALLENGED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity.A0F(r4, r0, r5, r15, r8)
            return
        L_0x032e:
            java.lang.String r0 = "PENDING"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.6Ps r3 = X.AnonymousClass9ZG.A00()
            r9 = 0
            r6 = 0
            java.lang.String r7 = "enter_name"
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity.A07(r3, r4, r5, r6, r7, r8, r9)
            r3 = 0
            if (r5 == 0) goto L_0x0354
            X.9uk r0 = r5.A00
            if (r0 == 0) goto L_0x0354
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x0354
            int r0 = r0.A02()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L_0x0354:
            java.lang.String r2 = X.AnonymousClass9ZG.A01(r6)
            if (r5 == 0) goto L_0x0366
            X.9uk r0 = r5.A00
            if (r0 == 0) goto L_0x0366
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x0366
            java.lang.String r3 = r0.A05()
        L_0x0366:
            com.whatsapp.payments.ui.P2mLiteConfirmLegalNameBottomSheetFragment r10 = new com.whatsapp.payments.ui.P2mLiteConfirmLegalNameBottomSheetFragment
            r10.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "extra_payment_config_id"
            r1.putString(r0, r3)
            java.lang.String r0 = "extra_order_type"
            r1.putString(r0, r2)
            r10.A17(r1)
            com.whatsapp.payments.ui.PaymentBottomSheet r12 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r12.<init>()
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r12)
            r4.A0U = r0
            X.6x6 r9 = new X.6x6
            r11 = r4
            r13 = r5
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r10.A0A = r9
            r12.A02 = r10
            r4.Btm(r12)
            return
        L_0x0397:
            java.lang.Object r4 = r2.A00
            com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment r4 = (com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment) r4
            X.709 r1 = (X.AnonymousClass709) r1
            java.util.Map r0 = r4.A07
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = r1.A01
            java.lang.String r0 = r4.A05
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x065a
            com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment.A03(r4, r1)
            return
        L_0x03b3:
            java.lang.Object r4 = r2.A00
            com.whatsapp.wabloks.base.FdsContentFragmentManager r4 = (com.whatsapp.wabloks.base.FdsContentFragmentManager) r4
            X.6zv r1 = (X.C149096zv) r1
            java.lang.String r3 = r1.A00
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x03c7
            X.01z r0 = r4.A0k()
            X.AnonymousClass01z.A0H(r0, r3)
            return
        L_0x03c7:
            X.01I r0 = r4.A0i()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0014
            java.util.Queue r2 = r4.A03
            r0 = 36
            X.74v r1 = new X.74v
            r1.<init>(r0, r3, r4)
            goto L_0x041e
        L_0x03db:
            java.lang.Object r5 = r2.A00
            com.whatsapp.wabloks.base.FdsContentFragmentManager r5 = (com.whatsapp.wabloks.base.FdsContentFragmentManager) r5
            X.704 r1 = (X.AnonymousClass704) r1
            X.02E r4 = r1.A00
            java.lang.String r3 = r1.A01
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x03ed
            com.whatsapp.wabloks.base.FdsContentFragmentManager.A00(r4, r5, r3)
            return
        L_0x03ed:
            X.01I r0 = r5.A0i()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0014
            X.6Ou r2 = r5.A00
            android.os.Bundle r1 = r5.A0b()
            java.lang.String r0 = "fds_observer_id"
            java.lang.String r0 = r1.getString(r0)
            X.6EW r2 = r2.A02(r0)
            X.01I r0 = r5.A0i()
            boolean r1 = r0 instanceof com.whatsapp.wabloks.ui.WaFcsModalActivity
            X.6zz r0 = new X.6zz
            r0.<init>(r1)
            r2.A02(r0)
            java.util.Queue r2 = r5.A03
            r0 = 21
            X.74m r1 = new X.74m
            r1.<init>(r5, r4, r3, r0)
        L_0x041e:
            r2.add(r1)
            return
        L_0x0422:
            java.lang.Object r4 = r2.A00
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r4 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r4
            X.700 r1 = (X.AnonymousClass700) r1
            boolean r3 = X.C36371kC.A1V(r1)
            com.whatsapp.WaTextView r2 = r4.A07
            if (r2 == 0) goto L_0x0435
            java.lang.String r0 = r1.A00
            r2.setText(r0)
        L_0x0435:
            android.view.ViewGroup r0 = r4.A00
            if (r0 == 0) goto L_0x0014
            r0.setVisibility(r3)
            return
        L_0x043d:
            java.lang.Object r2 = r2.A00
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r2 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r2
            X.702 r1 = (X.AnonymousClass702) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.WaTextView r2 = r2.A06
            if (r2 == 0) goto L_0x0014
            java.lang.String r0 = r1.A00
            r2.setText(r0)
            return
        L_0x0451:
            java.lang.Object r2 = r2.A00
            X.02E r2 = (X.AnonymousClass02E) r2
            X.70B r1 = (X.AnonymousClass70B) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.01I r5 = r2.A0h()
            if (r5 == 0) goto L_0x0014
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L_0x0014
            X.1qm r4 = X.AnonymousClass3LW.A00(r5)
            java.lang.String r0 = r1.A00
            r4.A0p(r0)
            java.lang.String r3 = r1.A02
            r2 = 12
            X.7t3 r0 = new X.7t3
            r0.<init>(r1, r2)
            r4.A0o(r5, r0, r3)
            java.lang.String r3 = r1.A01
            r2 = 13
            X.7t3 r0 = new X.7t3
            r0.<init>(r1, r2)
            r4.A0n(r5, r0, r3)
            r4.create()
            r4.A0b()
            return
        L_0x048f:
            java.lang.Object r2 = r2.A00
            X.5OV r2 = (X.AnonymousClass5OV) r2
            X.6zx r1 = (X.C149116zx) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            java.util.List r1 = r1.A00
            X.AnonymousClass00C.A07(r1)
            java.lang.String r0 = r2.A04
            if (r0 != 0) goto L_0x04a9
            java.lang.String r0 = "stateName"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04a9:
            boolean r0 = r1.contains(r0)
        L_0x04ad:
            if (r0 != 0) goto L_0x0014
        L_0x04af:
            r2.finish()
            return
        L_0x04b3:
            java.lang.Object r3 = r2.A00
            com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity r3 = (com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity) r3
            X.6zx r1 = (X.C149116zx) r1
            java.util.List r2 = r1.A00
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "fds_state_name"
            java.lang.String r0 = r1.getStringExtra(r0)
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x0014
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r1 = r3.A03
            r0 = 0
            r1.A0N = r0
            r3.finish()
            return
        L_0x04d4:
            java.lang.Object r1 = r2.A00
            com.whatsapp.extensions.phoenix.PhoenixFlowsBottomSheetActivity r1 = (com.whatsapp.extensions.phoenix.PhoenixFlowsBottomSheetActivity) r1
            r0 = 1
            r1.A01 = r0
            return
        L_0x04dc:
            java.lang.Object r2 = r2.A00
            X.66v r2 = (X.C1270766v) r2
            X.6zz r1 = (X.C149136zz) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.7l3 r2 = r2.A00
            boolean r0 = r1.A00
            r2.B1y(r0)
            return
        L_0x04ee:
            java.lang.Object r9 = r2.A00
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r9 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r9
            X.70A r1 = (X.AnonymousClass70A) r1
            boolean r14 = X.C36371kC.A1V(r1)
            java.lang.ref.WeakReference r0 = r9.A0U
            if (r0 == 0) goto L_0x0507
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            if (r0 == 0) goto L_0x0507
            r0.A1b()
        L_0x0507:
            X.1VZ r2 = r9.A07
            if (r2 == 0) goto L_0x05b3
            X.AGg r0 = r9.A3j()
            X.3Qa r0 = r0.A07
            X.3T1 r10 = r2.A02(r0)
            X.2bZ r10 = (X.AnonymousClass2bZ) r10
            r11 = 0
            java.lang.String r13 = r1.A03
            X.6Ps r8 = X.AnonymousClass9ZG.A00()
            java.lang.String r12 = "in_app_browser_checkout"
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity.A07(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r6 = r1.A01
            java.lang.String r8 = r1.A02
            java.lang.String r5 = r1.A04
            java.lang.String r4 = r1.A00
            if (r10 == 0) goto L_0x05b1
            X.9uk r0 = r10.A00
            if (r0 == 0) goto L_0x05b1
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x05b1
            int r0 = r0.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x053d:
            java.lang.String r2 = X.AnonymousClass9ZG.A01(r0)
            if (r10 == 0) goto L_0x054f
            X.9uk r0 = r10.A00
            if (r0 == 0) goto L_0x054f
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x054f
            java.lang.String r11 = r0.A05()
        L_0x054f:
            r3 = 1
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r7 = r9.getPackageName()
            java.lang.String r0 = "com.whatsapp.payments.ui.P2mLiteWebViewActivity"
            r1.setClassName(r7, r0)
            X.C18740tg.A06(r8)
            java.lang.String r0 = "webview_url"
            r1.putExtra(r0, r8)
            java.lang.String r0 = "webview_javascript_enabled"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "extra_fds_manager_id"
            r1.putExtra(r0, r6)
            int r0 = r5.length()
            if (r0 == 0) goto L_0x057a
            java.lang.String r0 = "webview_callback"
            r1.putExtra(r0, r5)
        L_0x057a:
            if (r4 == 0) goto L_0x0587
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0587
            java.lang.String r0 = "webview_cancel_callback"
            r1.putExtra(r0, r4)
        L_0x0587:
            java.lang.String r0 = "webview_hide_url"
            r1.putExtra(r0, r14)
            java.lang.String r0 = "webview_open_new_tab_in_external_browser"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "webview_title_show_domain_only"
            r1.putExtra(r0, r3)
            if (r13 == 0) goto L_0x05a3
            int r0 = r13.length()
            if (r0 == 0) goto L_0x05a3
            java.lang.String r0 = "referral_screen"
            r1.putExtra(r0, r13)
        L_0x05a3:
            java.lang.String r0 = "order_type"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "config_id"
            r1.putExtra(r0, r11)
            r9.startActivity(r1)
            return
        L_0x05b1:
            r0 = r11
            goto L_0x053d
        L_0x05b3:
            java.lang.String r0 = "paymentMessageStore"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05ba:
            java.lang.Object r0 = r2.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1b()
            return
        L_0x05c2:
            java.lang.Object r2 = r2.A00
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r2 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r2
            r1 = 0
            android.widget.FrameLayout r0 = r2.A01
            if (r0 == 0) goto L_0x05ce
            r0.setVisibility(r1)
        L_0x05ce:
            android.view.ViewGroup r0 = r2.A00
            goto L_0x05d7
        L_0x05d1:
            java.lang.Object r0 = r2.A00
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r0 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r0
            android.widget.FrameLayout r0 = r0.A01
        L_0x05d7:
            X.C36331k8.A0y(r0)
            return
        L_0x05db:
            java.lang.Object r2 = r2.A00
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r2 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r2
            X.6zw r1 = (X.C149106zw) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r1.A00
            r2.A0M = r0
            return
        L_0x05ea:
            java.lang.Object r4 = r2.A00
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r4 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r4
            X.708 r1 = (X.AnonymousClass708) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.String r3 = r1.A01
            java.lang.String r2 = r1.A00
            X.AnonymousClass00C.A07(r2)
            java.lang.String r0 = r1.A02
            r4.A0I = r3
            r4.A0H = r2
            r4.A0K = r0
            r4.A1m()
            return
        L_0x0607:
            java.lang.Object r2 = r2.A00
            X.5OV r2 = (X.AnonymousClass5OV) r2
            X.6zy r1 = (X.C149126zy) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r1.A00
            r2.A05 = r0
            return
        L_0x0616:
            java.lang.Object r2 = r2.A00
            X.5OV r2 = (X.AnonymousClass5OV) r2
            X.701 r1 = (X.AnonymousClass701) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.String r0 = r1.A00
            r2.A03 = r0
            return
        L_0x0625:
            java.lang.Object r0 = r2.A00
            com.whatsapp.wabloks.ui.WaBloksActivity r0 = (com.whatsapp.wabloks.ui.WaBloksActivity) r0
            X.708 r1 = (X.AnonymousClass708) r1
            java.lang.String r5 = r1.A01
            java.lang.String r7 = r1.A00
            X.4wy r0 = r0.A05
            X.5Ok r0 = (X.C107385Ok) r0
            r6 = 0
            X.67o r1 = r0.A00
            com.whatsapp.wabloks.ui.WaBloksActivity r2 = r0.A03
            androidx.appcompat.widget.Toolbar r3 = r0.A00
            java.util.Objects.requireNonNull(r2)
            r0 = 1
            X.7t6 r4 = new X.7t6
            r4.<init>(r2, r0)
            r1.A01(r2, r3, r4, r5, r6, r7)
            return
        L_0x0647:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x064a:
            if (r2 == 0) goto L_0x064f
            r2.A1b()
        L_0x064f:
            r3.Bnv()
            return
        L_0x0653:
            java.lang.String r0 = "paymentMessageStore"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x065a:
            java.util.Queue r3 = r4.A0C
            r2 = 23
            X.72w r0 = new X.72w
            r0.<init>(r4, r1, r2)
            r3.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163227pr.BX5(java.lang.Object):void");
    }
}
