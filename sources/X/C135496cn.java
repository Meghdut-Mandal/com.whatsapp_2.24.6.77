package X;

import android.view.View;

/* renamed from: X.6cn  reason: invalid class name and case insensitive filesystem */
public class C135496cn implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C135496cn(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0113, code lost:
        if (r1 != 0) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0126, code lost:
        if (r1 != 0) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01da, code lost:
        if (r0 == false) goto L_0x01dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x02a8;
                case 1: goto L_0x012d;
                case 2: goto L_0x021f;
                case 3: goto L_0x00fe;
                case 4: goto L_0x01f5;
                case 5: goto L_0x0191;
                case 6: goto L_0x0077;
                case 7: goto L_0x0063;
                case 8: goto L_0x003c;
                case 9: goto L_0x018b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r10.A00
            X.4fl r3 = (X.C93104fl) r3
            org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText r0 = r3.A0G
            X.C36391kE.A1K(r0)
            java.lang.Object r0 = r10.A01
            X.74f r0 = (X.C1501674f) r0
            java.lang.Object r1 = r0.A00
            org.npci.upi.security.pinactivitycomponent.s r1 = (org.npci.upi.security.pinactivitycomponent.s) r1
            int r0 = r1.A01
            int r0 = r0 + -1
            r1.A01 = r0
            r1.A1b(r3)
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r1 = "action"
            java.lang.String r0 = "TRIGGER_OTP"
            r2.putString(r1, r0)
            java.lang.String r1 = r3.A0F
            java.lang.String r0 = "AADHAAR"
            boolean r0 = r1.equals(r0)
            android.os.ResultReceiver r1 = X.C124765yl.A0B
            int r0 = X.C90484aE.A04(r0)
            r1.send(r0, r2)
        L_0x003b:
            return
        L_0x003c:
            java.lang.Object r4 = r10.A00
            X.4rI r4 = (X.C98354rI) r4
            java.lang.Object r3 = r10.A01
            android.webkit.WebView r3 = (android.webkit.WebView) r3
            if (r11 == 0) goto L_0x0056
            X.7lv r2 = r4.A04
            android.content.Context r1 = r11.getContext()
            r0 = 2131896190(0x7f12277e, float:1.9427234E38)
            java.lang.String r0 = X.C36361kB.A0m(r1, r0)
            r2.Bx5(r0)
        L_0x0056:
            X.7lv r1 = r4.A04
            java.lang.String r0 = ""
            r1.Bx6(r0)
            if (r3 == 0) goto L_0x003b
            r3.reload()
            return
        L_0x0063:
            java.lang.Object r1 = r10.A00
            X.7fl r1 = (X.C158077fl) r1
            java.lang.Object r0 = r10.A01
            android.app.Activity r0 = (android.app.Activity) r0
            if (r1 == 0) goto L_0x003b
            X.7js r0 = (X.C159757js) r0
            X.65A r0 = r0.BJB()
            X.C142326oh.A0B(r0, r1)
            return
        L_0x0077:
            java.lang.Object r5 = r10.A00
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            java.lang.Object r3 = r10.A01
            com.whatsapp.voipcalling.CallInfo r3 = (com.whatsapp.voipcalling.CallInfo) r3
            android.view.ViewGroup r1 = r5.A0F
            X.C18740tg.A04(r1)
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 8
            r1.setVisibility(r0)
            X.6Ke r1 = r5.A11
            java.lang.Integer r0 = X.C36371kC.A0o()
            r1.A02 = r0
            X.C130216Ke.A00(r1)
            java.lang.String r0 = "VoipActivityV2 vm call back onclick"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Map r0 = r3.participants
            java.util.Iterator r2 = X.AnonymousClass000.A0z(r0)
        L_0x00ab:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00bf
            X.6EE r1 = X.C90524aI.A0J(r2)
            boolean r0 = r1.A0J
            if (r0 != 0) goto L_0x00ab
            com.whatsapp.jid.UserJid r0 = r1.A08
            r4.add(r0)
            goto L_0x00ab
        L_0x00bf:
            java.util.Iterator r2 = r4.iterator()
        L_0x00c3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d9
            X.11F r1 = X.C36401kF.A0a(r2)
            X.16D r0 = r5.A12
            X.141 r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x00c3
            r7.add(r0)
            goto L_0x00c3
        L_0x00d9:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x003b
            X.711 r0 = r5.A0x
            r0.A06()
            android.os.Handler r1 = r5.A05
            r0 = 9
            r1.removeMessages(r0)
            X.1ND r4 = r5.A0j
            r8 = 30
            boolean r9 = r3.videoEnabled
            com.whatsapp.jid.GroupJid r6 = r3.groupJid
            r4.Buc(r5, r6, r7, r8, r9)
            X.6ro r0 = r5.A0l
            if (r0 == 0) goto L_0x003b
            r0.A01()
            return
        L_0x00fe:
            java.lang.Object r4 = r10.A00
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            java.lang.Object r3 = r10.A01
            com.whatsapp.calling.views.VoipCallFooter r3 = (com.whatsapp.calling.views.VoipCallFooter) r3
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = r4.A1a
            if (r2 == 0) goto L_0x003b
            X.1RJ r0 = r2.A0a
            if (r0 == 0) goto L_0x0115
            int r1 = r0.A00()
            r0 = 1
            if (r1 == 0) goto L_0x0116
        L_0x0115:
            r0 = 0
        L_0x0116:
            r0 = r0 ^ 1
            r2.A1j(r0)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r4.A1a
            X.1RJ r0 = r0.A0a
            if (r0 == 0) goto L_0x0128
            int r1 = r0.A00()
            r0 = 1
            if (r1 == 0) goto L_0x0129
        L_0x0128:
            r0 = 0
        L_0x0129:
            r3.setDialpadBtnSelected(r0)
            return
        L_0x012d:
            java.lang.Object r2 = r10.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.Object r5 = r10.A01
            com.whatsapp.calling.views.VoipCallFooter r5 = (com.whatsapp.calling.views.VoipCallFooter) r5
            boolean r0 = r11.isEnabled()
            if (r0 == 0) goto L_0x003b
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.VoipActivityV2.A01(r2)
            if (r3 == 0) goto L_0x003b
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x003b
            boolean r0 = r3.videoEnabled
            r4 = 4
            if (r0 == 0) goto L_0x028b
            X.6EE r0 = r3.self
            int r1 = r0.A06
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 != 0) goto L_0x02cc
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r2.A1b
            boolean r3 = r0.isFrontCamera()
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r2.A0a
            if (r3 == 0) goto L_0x0253
            X.1hi r0 = r0.A0F
            java.lang.Object r0 = r0.A04()
            boolean r0 = r0 instanceof X.AnonymousClass52Q
            if (r0 == 0) goto L_0x0253
            r4 = 1
            X.7pW r0 = new X.7pW
            r0.<init>(r2, r4)
            com.whatsapp.voipcalling.dialogs.SwitchCameraForPersonalizedAvatarDialogFragment r3 = new com.whatsapp.voipcalling.dialogs.SwitchCameraForPersonalizedAvatarDialogFragment
            r3.<init>()
            r3.A00 = r0
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "use_case"
            r1.putInt(r0, r4)
            r3.A17(r1)
            java.lang.String r0 = "SwitchCameraForPersonalizedAvatarDialogFragment"
            r2.A3o(r3, r0)
            goto L_0x02cc
        L_0x018b:
            java.lang.Object r0 = r10.A00
            X.C90514aH.A1N(r0)
            return
        L_0x0191:
            java.lang.Object r4 = r10.A00
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            java.lang.Object r3 = r10.A01
            com.whatsapp.voipcalling.CallInfo r3 = (com.whatsapp.voipcalling.CallInfo) r3
            r1 = 33
            r0 = 5
            com.whatsapp.voipcalling.VoipActivityV2.A1C(r4, r1, r0)
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.VoipActivityV2.A01(r4)
            X.185 r0 = r4.A14
            boolean r1 = X.AnonymousClass3UL.A09(r0, r2)
            boolean r0 = com.whatsapp.voipcalling.VoipActivityV2.A1T(r4)
            if (r0 == 0) goto L_0x01c2
            X.0yC r0 = r4.A0D
            boolean r0 = X.C34681hT.A0G(r0)
            if (r0 == 0) goto L_0x01c2
            com.whatsapp.voipcalling.WASecuredDialogFragment r1 = new com.whatsapp.voipcalling.WASecuredDialogFragment
            r1.<init>()
            java.lang.String r0 = "WASecuredDialogFragment"
            r4.A3o(r1, r0)
            return
        L_0x01c2:
            if (r1 == 0) goto L_0x01d4
            X.0yC r0 = r4.A0D
            boolean r0 = X.C34681hT.A0G(r0)
            if (r0 == 0) goto L_0x01d4
            X.0wU r1 = r4.A04
            r0 = 13
            X.C1498172w.A02(r1, r4, r2, r0)
            return
        L_0x01d4:
            if (r3 == 0) goto L_0x01dc
            boolean r0 = r3.videoEnabled
            r3 = 11
            if (r0 != 0) goto L_0x01de
        L_0x01dc:
            r3 = 10
        L_0x01de:
            com.whatsapp.voipcalling.dialogs.E2EEInfoDialogFragment r2 = new com.whatsapp.voipcalling.dialogs.E2EEInfoDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "entry_point"
            r1.putInt(r0, r3)
            r2.A17(r1)
            java.lang.String r0 = "E2EEInfoDialogFragment"
            r4.A3o(r2, r0)
            return
        L_0x01f5:
            java.lang.Object r4 = r10.A00
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            java.lang.Object r3 = r10.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            X.1Dv r2 = r4.A01
            X.190 r1 = X.C36441kJ.A0j()
            X.16D r0 = r4.A12
            X.141 r0 = r0.A0D(r3)
            android.content.Intent r0 = r1.A1W(r4, r0)
            r2.A07(r4, r0)
            X.6Ke r1 = r4.A11
            java.lang.Integer r0 = X.C36371kC.A0n()
            r1.A02 = r0
            X.C130216Ke.A00(r1)
            r4.finish()
            return
        L_0x021f:
            java.lang.Object r3 = r10.A00
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.Object r1 = r10.A01
            com.whatsapp.calling.views.VoipCallFooter r1 = (com.whatsapp.calling.views.VoipCallFooter) r1
            X.6YM r0 = r3.A0r
            if (r0 == 0) goto L_0x024f
            android.widget.ImageButton r0 = r1.A0I
            boolean r0 = r0.isSelected()
            r1 = 11
            if (r0 == 0) goto L_0x0237
            r1 = 12
        L_0x0237:
            r0 = 4
            com.whatsapp.voipcalling.VoipActivityV2.A1C(r3, r1, r0)
            X.6YM r0 = r3.A0r
            X.6zT r2 = r0.A2E
            int r1 = r2.A00
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            r1 = r0 ^ 1
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r2.A0C(r0, r1)
        L_0x024f:
            com.whatsapp.voipcalling.VoipActivityV2.A13(r3)
            return
        L_0x0253:
            r0 = 27
            com.whatsapp.voipcalling.VoipActivityV2.A1C(r2, r0, r4)
            android.os.Handler r1 = r2.A05
            r0 = 3
            r1.removeMessages(r0)
            com.whatsapp.voipcalling.Voip.switchCamera()
            X.711 r0 = r2.A0x
            r0.A06()
            if (r3 != 0) goto L_0x02cc
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r3 = r2.A0a
            java.lang.String r0 = "voip/CallAvatarViewModel/onSwitchedToFrontCamera"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1hi r0 = r3.A0F
            java.lang.Object r1 = X.C36401kF.A0m(r0)
            X.5aQ r1 = (X.C110285aQ) r1
            boolean r0 = r1 instanceof X.AnonymousClass52M
            if (r0 == 0) goto L_0x02cc
            X.52M r1 = (X.AnonymousClass52M) r1
            X.5aP r0 = r1.A00
            boolean r0 = r0 instanceof X.AnonymousClass52J
            if (r0 == 0) goto L_0x02cc
            java.lang.String r0 = X.C90464aC.A0V()
            X.C95504lc.A01(r3, r0)
            goto L_0x02cc
        L_0x028b:
            X.6YM r0 = r2.A0r
            if (r0 == 0) goto L_0x02cc
            android.widget.ImageButton r0 = r5.A0K
            boolean r1 = r0.isSelected()
            r0 = 9
            if (r1 == 0) goto L_0x029b
            r0 = 10
        L_0x029b:
            com.whatsapp.voipcalling.VoipActivityV2.A1C(r2, r0, r4)
            X.6YM r0 = r2.A0r
            X.6zT r1 = r0.A2E
            r0 = 47
            X.C148816zT.A02(r1, r0)
            goto L_0x02cc
        L_0x02a8:
            java.lang.Object r2 = r10.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.Object r1 = r10.A01
            com.whatsapp.calling.views.VoipCallFooter r1 = (com.whatsapp.calling.views.VoipCallFooter) r1
            X.6YM r0 = r2.A0r
            if (r0 == 0) goto L_0x02cc
            android.widget.ImageButton r0 = r1.A0J
            boolean r0 = r0.isSelected()
            int r1 = X.C36371kC.A00(r0)
            r0 = 4
            com.whatsapp.voipcalling.VoipActivityV2.A1C(r2, r1, r0)
            X.6YM r1 = r2.A0r
            X.74e r0 = new X.74e
            r0.<init>(r1)
            X.C90504aG.A17(r0, r1)
        L_0x02cc:
            com.whatsapp.voipcalling.VoipActivityV2.A13(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135496cn.onClick(android.view.View):void");
    }
}
