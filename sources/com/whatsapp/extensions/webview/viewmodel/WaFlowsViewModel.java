package com.whatsapp.extensions.webview.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass1KT;
import X.AnonymousClass1X4;
import X.AnonymousClass6PZ;
import X.AnonymousClass6TL;
import X.C001700s;
import X.C005502l;
import X.C19770wU;
import X.C19970wo;
import X.C20310xM;
import X.C20810yC;
import X.C21010yW;
import X.C26461Kg;
import X.C36321k7;
import X.C36341k9;
import X.C36361kB;
import X.C36431kI;
import com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository;

public final class WaFlowsViewModel extends AnonymousClass04R {
    public final C001700s A00 = C36431kI.A0S();
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();
    public final C001700s A03 = C36431kI.A0S();
    public final C001700s A04 = C36431kI.A0S();
    public final C001700s A05 = C36431kI.A0S();
    public final C001700s A06 = C36431kI.A0S();
    public final AnonymousClass1X4 A07;
    public final C20310xM A08;
    public final AnonymousClass6TL A09;
    public final AnonymousClass6PZ A0A;
    public final C26461Kg A0B;
    public final AnonymousClass1KT A0C;
    public final FlowsWebViewDataRepository A0D;
    public final C20810yC A0E;
    public final C21010yW A0F;
    public final C19770wU A0G;
    public final C005502l A0H;
    public final C001700s A0I = C36431kI.A0S();
    public final C19970wo A0J;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0S(android.webkit.WebMessagePort r12, X.C023509x r13, org.json.JSONObject r14) {
        /*
            r11 = this;
            java.lang.String r0 = "method"
            java.lang.String r2 = r14.getString(r0)
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = X.C90474aD.A0t(r0, r14)
            X.AnonymousClass00C.A0B(r2)
            int r0 = r2.hashCode()
            r9 = 0
            switch(r0) {
                case -1943398688: goto L_0x011e;
                case -1291933730: goto L_0x00f1;
                case -1065806377: goto L_0x00cd;
                case -19964313: goto L_0x00b8;
                case 63780460: goto L_0x00a7;
                case 665045520: goto L_0x008e;
                case 714831445: goto L_0x007a;
                case 717743399: goto L_0x0066;
                case 883610163: goto L_0x0056;
                case 1636133391: goto L_0x0040;
                case 2113914398: goto L_0x002a;
                default: goto L_0x0017;
            }
        L_0x0017:
            X.574 r3 = new X.574
            r3.<init>()
        L_0x001c:
            r3.A02(r12)
            r3.A00 = r14
            java.lang.Object r0 = r3.A01(r13)
            java.lang.Object r0 = X.AnonymousClass0AO.A00(r0)
            return r0
        L_0x002a:
            java.lang.String r0 = "WAExtensionsGetPublicKey"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0017
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r2 = r11.A0D
            java.lang.String r0 = "force_refresh"
            boolean r0 = r1.optBoolean(r0)
            com.whatsapp.extensions.webview.bridge.factory.impl.FlowsGetPublicKey r3 = new com.whatsapp.extensions.webview.bridge.factory.impl.FlowsGetPublicKey
            r3.<init>(r2, r0)
            goto L_0x001c
        L_0x0040:
            java.lang.String r0 = "WAExtensionsNavigate"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0017
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r0 = r11.A0D
            X.3T1 r2 = r0.A01
            X.0xM r1 = r11.A08
            X.6PZ r0 = r11.A0A
            X.2Mf r3 = new X.2Mf
            r3.<init>(r1, r0, r2)
            goto L_0x001c
        L_0x0056:
            java.lang.String r0 = "WAMLogger"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0017
            X.0yW r0 = r11.A0F
            X.577 r3 = new X.577
            r3.<init>(r0)
            goto L_0x001c
        L_0x0066:
            java.lang.String r0 = "WAQPLLogger.start"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0017
            X.1KT r1 = r11.A0C
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r0 = r11.A0D
            X.6DY r0 = r0.A00
            X.57C r3 = new X.57C
            r3.<init>(r1, r0)
            goto L_0x001c
        L_0x007a:
            java.lang.String r0 = "WAQPLLogger.point"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0017
            X.1KT r1 = r11.A0C
            int r0 = com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository.A00(r11)
            X.57B r3 = new X.57B
            r3.<init>(r1, r0)
            goto L_0x001c
        L_0x008e:
            java.lang.String r0 = "WAExtensionsGetFlowData"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0017
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r0 = r11.A0D
            org.json.JSONObject r0 = r0.A02
            if (r0 != 0) goto L_0x00a0
            org.json.JSONObject r0 = X.C36441kJ.A1B()
        L_0x00a0:
            X.576 r3 = new X.576
            r3.<init>(r0)
            goto L_0x001c
        L_0x00a7:
            java.lang.String r0 = "WAExtensionsGetClientAbProps"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0017
            X.0yC r0 = r11.A0E
            X.575 r3 = new X.575
            r3.<init>(r0)
            goto L_0x001c
        L_0x00b8:
            java.lang.String r0 = "WAQPLLogger.annotate"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0017
            X.1KT r1 = r11.A0C
            int r0 = com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository.A00(r11)
            X.579 r3 = new X.579
            r3.<init>(r1, r0)
            goto L_0x001c
        L_0x00cd:
            java.lang.String r0 = "WAExtensionsComplete"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0017
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r0 = r11.A0D
            X.6DY r8 = r0.A00
            if (r8 == 0) goto L_0x0017
            X.1X4 r4 = r11.A07
            X.3T1 r9 = r0.A01
            X.0xM r5 = r11.A08
            X.1Kg r7 = r11.A0B
            X.6PZ r6 = r11.A0A
            X.7T2 r10 = new X.7T2
            r10.<init>(r11)
            com.whatsapp.extensions.webview.bridge.factory.impl.FlowsComplete r3 = new com.whatsapp.extensions.webview.bridge.factory.impl.FlowsComplete
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x001c
        L_0x00f1:
            java.lang.String r0 = "WAExtensionsDataChannelExchange"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0017
            X.0wU r5 = r11.A0G
            X.6TL r4 = r11.A09
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r0 = r11.A0D
            X.6DY r0 = r0.A00
            if (r0 == 0) goto L_0x011a
            java.lang.String r6 = r0.A03
            java.lang.String r7 = r0.A04
            java.lang.String r8 = r0.A02
            com.whatsapp.jid.UserJid r0 = r0.A01
            java.lang.String r9 = r0.getRawString()
        L_0x010f:
            java.lang.String r10 = r1.toString()
            X.2Mg r3 = new X.2Mg
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x001c
        L_0x011a:
            r6 = r9
            r7 = r9
            r8 = r9
            goto L_0x010f
        L_0x011e:
            java.lang.String r0 = "WAQPLLogger.end"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0017
            X.1KT r1 = r11.A0C
            int r0 = com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository.A00(r11)
            X.57A r3 = new X.57A
            r3.<init>(r1, r0)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.webview.viewmodel.WaFlowsViewModel.A0S(android.webkit.WebMessagePort, X.09x, org.json.JSONObject):java.lang.Object");
    }

    public WaFlowsViewModel(AnonymousClass1X4 r2, C19970wo r3, C20310xM r4, AnonymousClass6TL r5, AnonymousClass6PZ r6, C26461Kg r7, AnonymousClass1KT r8, FlowsWebViewDataRepository flowsWebViewDataRepository, C20810yC r10, C21010yW r11, C19770wU r12, C005502l r13) {
        C36321k7.A19(r3, r10, r12, r13);
        C36361kB.A1J(r5, 6, r2);
        AnonymousClass00C.A0D(r4, 9);
        C36341k9.A1G(r11, r6);
        this.A0B = r7;
        this.A0J = r3;
        this.A0E = r10;
        this.A0G = r12;
        this.A0H = r13;
        this.A09 = r5;
        this.A0D = flowsWebViewDataRepository;
        this.A07 = r2;
        this.A08 = r4;
        this.A0C = r8;
        this.A0F = r11;
        this.A0A = r6;
    }
}
