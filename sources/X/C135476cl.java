package X;

import android.view.View;

/* renamed from: X.6cl  reason: invalid class name and case insensitive filesystem */
public class C135476cl implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C135476cl(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x031a, code lost:
        r1.Azl(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x031d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0.BTc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015e, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0160, code lost:
        r0.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0163, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x0011;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0018;
                case 6: goto L_0x0018;
                case 7: goto L_0x031e;
                case 8: goto L_0x0672;
                case 9: goto L_0x0334;
                case 10: goto L_0x033c;
                case 11: goto L_0x001f;
                case 12: goto L_0x00de;
                case 13: goto L_0x0144;
                case 14: goto L_0x014b;
                case 15: goto L_0x0403;
                case 16: goto L_0x040b;
                case 17: goto L_0x0164;
                case 18: goto L_0x0185;
                case 19: goto L_0x041c;
                case 20: goto L_0x0425;
                case 21: goto L_0x01b1;
                case 22: goto L_0x043d;
                case 23: goto L_0x04a1;
                case 24: goto L_0x04aa;
                case 25: goto L_0x0291;
                case 26: goto L_0x04c3;
                case 27: goto L_0x04da;
                case 28: goto L_0x04e2;
                case 29: goto L_0x02cc;
                case 30: goto L_0x04fa;
                case 31: goto L_0x0501;
                case 32: goto L_0x0501;
                case 33: goto L_0x0509;
                case 34: goto L_0x0511;
                case 35: goto L_0x051a;
                case 36: goto L_0x0522;
                case 37: goto L_0x052a;
                case 38: goto L_0x0537;
                case 39: goto L_0x0572;
                case 40: goto L_0x02ee;
                case 41: goto L_0x058c;
                case 42: goto L_0x059c;
                case 43: goto L_0x05d9;
                case 44: goto L_0x0617;
                case 45: goto L_0x0617;
                case 46: goto L_0x0645;
                case 47: goto L_0x065e;
                case 48: goto L_0x0306;
                case 49: goto L_0x0311;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A00
            X.5NK r0 = (X.AnonymousClass5NK) r0
            X.7hm r0 = r0.A0F
        L_0x000b:
            if (r0 == 0) goto L_0x0010
            r0.BTc()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r12.A00
            X.5NK r0 = (X.AnonymousClass5NK) r0
            X.7hm r0 = r0.A0E
            goto L_0x000b
        L_0x0018:
            java.lang.Object r0 = r12.A00
            X.5NK r0 = (X.AnonymousClass5NK) r0
            X.7hm r0 = r0.A0G
            goto L_0x000b
        L_0x001f:
            java.lang.Object r1 = r12.A00
            X.7hr r1 = (X.C158657hr) r1
            X.7qV r1 = (X.C163627qV) r1
            int r0 = r1.A01
            java.lang.Object r7 = r1.A00
            X.6YP r7 = (X.AnonymousClass6YP) r7
            if (r0 == 0) goto L_0x009c
            boolean r0 = r7.A0V()
        L_0x0031:
            if (r0 == 0) goto L_0x00a5
            X.6Dd r6 = r7.A15
            X.5n5 r0 = r6.A06
            X.6YP r0 = r0.A00
            X.11F r3 = r0.A0B
            long r1 = r6.A00
            r4 = 1
            long r1 = r1 + r4
            r6.A00 = r1
            if (r3 == 0) goto L_0x0064
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0064
            boolean r0 = r3 instanceof X.C177618e5
            if (r0 == 0) goto L_0x0068
            X.0v0 r0 = r6.A04
            android.content.SharedPreferences$Editor r3 = X.C19420v0.A00(r0)
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r0)
            java.lang.String r2 = "ptt_pause_tap_broadcast"
        L_0x0058:
            long r0 = X.C36341k9.A0B(r0, r2)
            long r0 = r0 + r4
            android.content.SharedPreferences$Editor r0 = r3.putLong(r2, r0)
        L_0x0061:
            r0.apply()
        L_0x0064:
            r7.A0K()
            return
        L_0x0068:
            boolean r0 = X.AnonymousClass143.A0G(r3)
            if (r0 == 0) goto L_0x007b
            X.0v0 r0 = r6.A04
            android.content.SharedPreferences$Editor r3 = X.C19420v0.A00(r0)
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r0)
            java.lang.String r2 = "ptt_pause_tap_group"
            goto L_0x0058
        L_0x007b:
            boolean r1 = X.AnonymousClass143.A0H(r3)
            X.0v0 r0 = r6.A04
            android.content.SharedPreferences$Editor r5 = X.C19420v0.A00(r0)
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r0)
            if (r1 == 0) goto L_0x0099
            java.lang.String r4 = "ptt_pause_tap_interop"
        L_0x008d:
            long r2 = X.C36341k9.A0B(r0, r4)
            r0 = 1
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r0 = r5.putLong(r4, r2)
            goto L_0x0061
        L_0x0099:
            java.lang.String r4 = "ptt_pause_tap_individual"
            goto L_0x008d
        L_0x009c:
            X.6Q9 r0 = r7.A0H
            if (r0 == 0) goto L_0x00a5
            boolean r0 = X.AnonymousClass6Q9.A00(r0)
            goto L_0x0031
        L_0x00a5:
            X.3L2 r3 = r7.A0u
            X.14r r2 = r7.A0g
            X.01I r1 = r7.A0c
            X.11F r0 = r7.A0B
            boolean r0 = r3.A03(r1, r2, r0)
            if (r0 == 0) goto L_0x0010
            X.1V6 r0 = r7.A0m
            r0.A04()
            X.3QH r0 = r7.A0x
            r0.A02()
            X.6Q9 r0 = r7.A0H
            if (r0 == 0) goto L_0x00c5
            X.AnonymousClass6YP.A06(r7)
            return
        L_0x00c5:
            java.io.File r8 = r7.A0I
            java.io.File r9 = r7.A0J
            r0 = 0
            X.7sc r10 = new X.7sc
            r10.<init>(r7, r0)
            if (r8 == 0) goto L_0x0010
            X.0wU r0 = r7.A10
            r11 = 14
            X.73N r6 = new X.73N
            r6.<init>(r7, r8, r9, r10, r11)
            r0.Boy(r6)
            return
        L_0x00de:
            java.lang.Object r4 = r12.A00
            X.6YP r4 = (X.AnonymousClass6YP) r4
            X.70k r6 = r4.A12
            boolean r0 = r4.A0M
            r2 = r0 ^ 1
            android.view.View r1 = r4.A0a
            android.widget.ImageButton r0 = r6.A0E
            r0.setActivated(r2)
            if (r2 == 0) goto L_0x0112
            int r5 = X.C36441kJ.A07(r1)
            int r0 = r0.getHeight()
            int r5 = r5 - r0
            X.17Y r3 = r6.A0F
            android.content.Context r1 = r6.A05
            r0 = 2131895704(0x7f122598, float:1.9426249E38)
            java.lang.String r0 = r1.getString(r0)
            r2 = 0
            r1 = 49
            android.widget.Toast r0 = r3.A01(r0)
            r0.setGravity(r1, r2, r5)
            r0.show()
        L_0x0112:
            boolean r0 = r4.A0M
            r0 = r0 ^ 1
            r4.A0M = r0
            X.0yC r1 = r4.A0r
            r0 = 2832(0xb10, float:3.968E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0010
            boolean r0 = r4.A0M
            if (r0 == 0) goto L_0x0010
            boolean r0 = r4.A0V()
            if (r0 != 0) goto L_0x0010
            X.11F r1 = r4.A0B
            if (r1 == 0) goto L_0x0010
            r0 = 82
            X.34f r3 = new X.34f
            r3.<init>(r1, r0)
            X.01I r0 = r4.A0c
            X.01z r2 = r0.getSupportFragmentManager()
            X.1LX r1 = r4.A0t
            r0 = 0
            com.whatsapp.ephemeral.ViewOnceNuxBottomSheet.A06(r2, r3, r1, r0)
            return
        L_0x0144:
            java.lang.Object r0 = r12.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            android.app.Dialog r0 = r0.A02
            goto L_0x015e
        L_0x014b:
            java.lang.Object r2 = r12.A00
            com.whatsapp.voipcalling.ScreenSharePermissionDialogFragment r2 = (com.whatsapp.voipcalling.ScreenSharePermissionDialogFragment) r2
            X.00T r0 = r2.A00
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.calling.screenshare.ScreenShareViewModel r1 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r1
            X.5Sb r0 = X.C108075Sb.BOTTOM_SHEET
            r1.A0S(r0)
            android.app.Dialog r0 = r2.A02
        L_0x015e:
            if (r0 == 0) goto L_0x0010
            r0.dismiss()
            return
        L_0x0164:
            java.lang.Object r2 = r12.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.VoipActivityV2.A01(r2)
            if (r0 == 0) goto L_0x0010
            X.6EE r0 = r0.self
            int r1 = r0.A06
            r0 = 3
            if (r1 != r0) goto L_0x0010
            X.6YM r0 = r2.A0r
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "voip/VoipActivityV2/centerScreenCallStatusButton/cancelSwitchToVideoCallListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6YM r1 = r2.A0r
            r0 = 0
            r1.A0Q(r0)
            return
        L_0x0185:
            java.lang.Object r3 = r12.A00
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            X.6YM r0 = r3.A0r
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "voip/VoipActivityV2/centerScreenCallStatusButton/resumeWhatsAppCallListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.VoipActivityV2.A01(r3)
            if (r2 == 0) goto L_0x0010
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0010
            X.6YM r1 = r3.A0r
            java.lang.String r0 = r2.callId
            r1.A0g(r0)
            boolean r0 = r2.videoEnabled
            if (r0 == 0) goto L_0x0010
            boolean r0 = r3.A1n
            if (r0 != 0) goto L_0x0010
            com.whatsapp.voipcalling.Voip.startVideoCaptureStream()
            return
        L_0x01b1:
            java.lang.Object r2 = r12.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            boolean r0 = r13.isEnabled()
            if (r0 == 0) goto L_0x0010
            r5 = 0
            r2.A1y = r5
            com.whatsapp.voipcalling.CallInfo r9 = com.whatsapp.voipcalling.VoipActivityV2.A01(r2)
            if (r9 == 0) goto L_0x0010
            com.whatsapp.voipcalling.CallState r1 = r9.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x01ce
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0010
        L_0x01ce:
            boolean r0 = r9.callEnding
            if (r0 != 0) goto L_0x0010
            X.6YM r0 = r2.A0r
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "voip/VoipActivityV2/toggleVideoBtn/clicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6EE r8 = r9.self
            X.6EE r7 = r9.getDefaultPeerInfo()
            r4 = 1
            if (r7 == 0) goto L_0x020d
            boolean r0 = r7.A09
            if (r0 != 0) goto L_0x020d
            com.whatsapp.jid.UserJid r3 = r7.A08
            X.171 r1 = r2.A15
            X.16D r0 = r2.A12
            X.141 r0 = r0.A0D(r3)
            java.lang.String r6 = X.C36381kD.A0v(r1, r0)
            boolean r3 = r7.A0A
            X.17Y r1 = r2.A05
            r0 = 2131896021(0x7f1226d5, float:1.9426891E38)
            if (r3 == 0) goto L_0x0202
            r0 = 2131896020(0x7f1226d4, float:1.942689E38)
        L_0x0202:
            java.lang.String r0 = X.C36351kA.A0w(r2, r6, r4, r0)
        L_0x0206:
            r1.A0E(r0, r5)
        L_0x0209:
            com.whatsapp.voipcalling.VoipActivityV2.A13(r2)
            return
        L_0x020d:
            int r6 = r8.A06
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1S(r6, r0)
            r1 = 28
            r3 = 4
            if (r0 == 0) goto L_0x022e
            com.whatsapp.voipcalling.VoipActivityV2.A1C(r2, r1, r3)
            r13.setSelected(r5)
            X.711 r0 = r2.A0x
            r0.A06()
            X.6YM r0 = r2.A0r
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.A1E
            X.74Y r0 = X.AnonymousClass74Y.A00
            r1.execute(r0)
            goto L_0x0209
        L_0x022e:
            if (r6 != 0) goto L_0x0265
            boolean r0 = r9.isGroupCall
            if (r0 == 0) goto L_0x023e
            X.17Y r1 = r2.A05
            r0 = 2131896022(0x7f1226d6, float:1.9426894E38)
            java.lang.String r0 = r2.getString(r0)
            goto L_0x0206
        L_0x023e:
            com.whatsapp.voipcalling.VoipActivityV2.A1C(r2, r1, r3)
            com.whatsapp.jid.UserJid r3 = X.C90494aF.A0M(r9)
            android.content.SharedPreferences r1 = X.C36331k8.A06(r2)
            java.lang.String r0 = "switch_to_video_call_confirmation_dialog_count"
            int r1 = r1.getInt(r0, r5)
            r0 = 5
            if (r1 >= r0) goto L_0x0256
            com.whatsapp.voipcalling.VoipActivityV2.A15(r2)
            goto L_0x0209
        L_0x0256:
            boolean r0 = com.whatsapp.voipcalling.VoipActivityV2.A1N(r3, r2, r4, r4)
            if (r0 == 0) goto L_0x0209
            X.6YM r0 = r2.A0r
            X.C18740tg.A06(r0)
            r0.A0P()
            goto L_0x0209
        L_0x0265:
            boolean r0 = X.C90514aH.A1V(r6)
            r1 = 29
            if (r0 == 0) goto L_0x0284
            com.whatsapp.voipcalling.VoipActivityV2.A1C(r2, r1, r3)
            X.711 r1 = r2.A0x
            com.whatsapp.jid.UserJid r0 = r8.A08
            r1.A07(r0)
            X.6YM r0 = r2.A0r
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.A1E
            X.74X r0 = X.AnonymousClass74X.A00
            r1.execute(r0)
            r13.setSelected(r4)
            goto L_0x0209
        L_0x0284:
            r0 = 3
            if (r6 != r0) goto L_0x0209
            com.whatsapp.voipcalling.VoipActivityV2.A1C(r2, r1, r3)
            X.6YM r0 = r2.A0r
            r0.A0Q(r5)
            goto L_0x0209
        L_0x0291:
            java.lang.Object r0 = r12.A00
            com.whatsapp.wabloks.base.DefaultBkPreloadFragment$BkCustomReloadFragment r0 = (com.whatsapp.wabloks.base.DefaultBkPreloadFragment$BkCustomReloadFragment) r0
            com.whatsapp.wabloks.base.GenericBkLayoutViewModelWithReload r2 = r0.A01
            if (r2 == 0) goto L_0x0691
            X.1Rs r1 = r2.A01
            X.5OB r0 = X.AnonymousClass5OB.A00
            r1.A0C(r0)
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0010
            X.5w3 r0 = r2.A00
            if (r0 == 0) goto L_0x0010
            X.00s r0 = r2.A01
            if (r0 == 0) goto L_0x0010
            X.005 r0 = r2.A02
            java.lang.Object r3 = r0.get()
            X.6Pn r3 = (X.C131556Pn) r3
            X.5w3 r0 = r2.A00
            java.lang.String r7 = r0.A03
            java.lang.String r8 = r0.A02
            X.6bn r4 = r0.A01
            java.lang.String r9 = r0.A04
            r6 = 0
            X.00s r1 = r2.A01
            X.65A r0 = r0.A00
            X.71J r5 = new X.71J
            r5.<init>(r1, r0)
            r3.A03(r4, r5, r6, r7, r8, r9)
            return
        L_0x02cc:
            java.lang.Object r2 = r12.A00
            com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment r2 = (com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment) r2
            X.5l0 r0 = r2.A01
            if (r0 == 0) goto L_0x0010
            r0 = 45
            X.7rQ r0 = X.C164197rQ.A00(r12, r0)
            r2.A1b(r0)
            X.02E r1 = r2.A0I
            boolean r0 = r1 instanceof com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment
            if (r0 == 0) goto L_0x0010
            java.lang.String r2 = r2.A04
            X.01z r1 = r1.A0k()
            r0 = 1
            r1.A0n(r2, r0)
            return
        L_0x02ee:
            java.lang.Object r0 = r12.A00
            X.3Ab r0 = (X.C60973Ab) r0
            X.4Sb r1 = r0.A01
            if (r1 == 0) goto L_0x0010
            X.005 r0 = r0.A07
            java.lang.Object r0 = r0.get()
            X.1i4 r0 = (X.C35051i4) r0
            java.util.ArrayList r0 = r0.A00()
            r1.BgX(r0)
            return
        L_0x0306:
            java.lang.Object r0 = r12.A00
            org.npci.upi.security.pinactivitycomponent.Keypad r0 = (org.npci.upi.security.pinactivitycomponent.Keypad) r0
            X.4Sc r1 = r0.A04
            if (r1 == 0) goto L_0x0010
            r0 = 67
            goto L_0x031a
        L_0x0311:
            java.lang.Object r0 = r12.A00
            org.npci.upi.security.pinactivitycomponent.Keypad r0 = (org.npci.upi.security.pinactivitycomponent.Keypad) r0
            X.4Sc r1 = r0.A04
            if (r1 == 0) goto L_0x0010
            r0 = 7
        L_0x031a:
            r1.Azl(r13, r0)
            return
        L_0x031e:
            java.lang.Object r2 = r12.A00
            X.70b r2 = (X.C1491570b) r2
            X.4eZ r0 = r2.A08
            boolean r1 = r0.A0B()
            X.4eZ r0 = r2.A08
            if (r1 == 0) goto L_0x0330
            r0.A0C()
            return
        L_0x0330:
            r0.A0D()
            return
        L_0x0334:
            java.lang.Object r0 = r12.A00
            X.7hp r0 = (X.C158637hp) r0
            r0.BVn()
            return
        L_0x033c:
            java.lang.Object r0 = r12.A00
            X.5n4 r0 = (X.C117935n4) r0
            X.6YP r2 = r0.A00
            X.6Tw r0 = r2.A0G
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0351
            r2.A0L()
        L_0x034d:
            X.AnonymousClass6YP.A08(r2)
            return
        L_0x0351:
            X.6Dd r5 = r2.A15
            long r3 = r5.A01
            r0 = 1
            long r3 = r3 + r0
            r5.A01 = r3
            X.5n5 r0 = r5.A06
            X.6YP r0 = r0.A00
            X.11F r1 = r0.A0B
            if (r1 == 0) goto L_0x03a6
            boolean r0 = r1 instanceof X.C177618e5
            if (r0 == 0) goto L_0x037d
            X.0v0 r0 = r5.A04
            android.content.SharedPreferences$Editor r6 = X.C19420v0.A00(r0)
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r0)
            java.lang.String r5 = "ptt_playback_broadcast"
        L_0x0372:
            long r3 = X.C36341k9.A0B(r0, r5)
            r0 = 1
            long r3 = r3 + r0
            X.C36341k9.A0w(r6, r5, r3)
            goto L_0x03a6
        L_0x037d:
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 == 0) goto L_0x0390
            X.0v0 r0 = r5.A04
            android.content.SharedPreferences$Editor r6 = X.C19420v0.A00(r0)
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r0)
            java.lang.String r5 = "ptt_playback_group"
            goto L_0x0372
        L_0x0390:
            boolean r1 = X.AnonymousClass143.A0H(r1)
            X.0v0 r0 = r5.A04
            android.content.SharedPreferences$Editor r6 = X.C19420v0.A00(r0)
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r0)
            if (r1 == 0) goto L_0x03a3
            java.lang.String r5 = "ptt_playback_interop"
            goto L_0x0372
        L_0x03a3:
            java.lang.String r5 = "ptt_playback_individual"
            goto L_0x0372
        L_0x03a6:
            X.3QH r0 = r2.A0x     // Catch:{ IOException -> 0x03fb }
            r0.A02()     // Catch:{ IOException -> 0x03fb }
            r0.A03()     // Catch:{ IOException -> 0x03fb }
            X.6Tw r0 = r2.A0G     // Catch:{ IOException -> 0x03fb }
            int r1 = r0.A02()     // Catch:{ IOException -> 0x03fb }
            X.6Tw r0 = r2.A0G     // Catch:{ IOException -> 0x03fb }
            int r0 = r0.A03()     // Catch:{ IOException -> 0x03fb }
            if (r1 != r0) goto L_0x03c2
            X.6Tw r1 = r2.A0G     // Catch:{ IOException -> 0x03fb }
            r0 = 0
            r1.A0A(r0)     // Catch:{ IOException -> 0x03fb }
        L_0x03c2:
            X.6Tw r0 = r2.A0G     // Catch:{ IOException -> 0x03fb }
            int r0 = r0.A02()     // Catch:{ IOException -> 0x03fb }
            if (r0 != 0) goto L_0x03f5
            X.6Tw r0 = r2.A0G     // Catch:{ IOException -> 0x03fb }
            r0.A08()     // Catch:{ IOException -> 0x03fb }
        L_0x03cf:
            X.3P4 r1 = r2.A0w     // Catch:{ IOException -> 0x03fb }
            r0 = 4
            X.3DQ r0 = r1.A01(r0)     // Catch:{ IOException -> 0x03fb }
            r2.A0F = r0     // Catch:{ IOException -> 0x03fb }
            android.os.Handler r1 = r2.A0V     // Catch:{ IOException -> 0x03fb }
            java.lang.Runnable r0 = r2.A1A     // Catch:{ IOException -> 0x03fb }
            r1.post(r0)     // Catch:{ IOException -> 0x03fb }
            X.2ZP r0 = r2.A13     // Catch:{ IOException -> 0x03fb }
            java.util.Iterator r1 = X.C36361kB.A0s(r0)     // Catch:{ IOException -> 0x03fb }
        L_0x03e5:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x03fb }
            if (r0 == 0) goto L_0x034d
            java.lang.Object r0 = r1.next()     // Catch:{ IOException -> 0x03fb }
            X.3L3 r0 = (X.AnonymousClass3L3) r0     // Catch:{ IOException -> 0x03fb }
            r0.A03()     // Catch:{ IOException -> 0x03fb }
            goto L_0x03e5
        L_0x03f5:
            X.6Tw r0 = r2.A0G     // Catch:{ IOException -> 0x03fb }
            r0.A07()     // Catch:{ IOException -> 0x03fb }
            goto L_0x03cf
        L_0x03fb:
            r1 = move-exception
            java.lang.String r0 = "voicenoterecordingui/showvoicenotepreview/ error playing voice note preview "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x034d
        L_0x0403:
            java.lang.Object r0 = r12.A00
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            r0.A3t()
            return
        L_0x040b:
            java.lang.Object r2 = r12.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            r0 = 1
            r2.A1t = r0
            r1 = 13
            r0 = 5
            com.whatsapp.voipcalling.VoipActivityV2.A1C(r2, r1, r0)
            com.whatsapp.voipcalling.VoipActivityV2.A16(r2)
            return
        L_0x041c:
            java.lang.Object r1 = r12.A00
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            r0 = 1
            com.whatsapp.voipcalling.VoipActivityV2.A1E(r1, r0)
            return
        L_0x0425:
            java.lang.Object r2 = r12.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.String r0 = "VoipActivityV2 vm cancel onClick"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6Ke r1 = r2.A11
            java.lang.Integer r0 = X.C36361kB.A0j()
            r1.A02 = r0
            X.C130216Ke.A00(r1)
            r2.finish()
            return
        L_0x043d:
            java.lang.Object r3 = r12.A00
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.String r0 = "voip end call button pressed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r4 != r0) goto L_0x0457
            java.lang.String r0 = "voip end call button pressed in NONE state"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0453:
            r3.finish()
            return
        L_0x0457:
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r4)
            r2 = 4
            r1 = 24
            if (r0 == 0) goto L_0x0468
            com.whatsapp.voipcalling.VoipActivityV2.A1C(r3, r1, r2)
            r0 = 2
            r3.BnL(r0)
            return
        L_0x0468:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r4 != r0) goto L_0x049a
            com.whatsapp.voipcalling.VoipActivityV2.A1C(r3, r1, r2)
            X.1aM r0 = r3.A0Y
            com.whatsapp.voipcalling.CallInfo r0 = X.C34681hT.A03(r0)
            X.C18740tg.A06(r0)
            int r1 = r0.callLinkState
            r0 = 1
            if (r1 == r0) goto L_0x0484
            r0 = 2
            if (r1 == r0) goto L_0x0484
            com.whatsapp.voipcalling.VoipActivityV2.A10(r3)
            goto L_0x0453
        L_0x0484:
            X.6YM r1 = r3.A0r
            if (r1 == 0) goto L_0x0453
            java.lang.String r2 = "default"
            java.lang.String r0 = "voip/call/reject"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.A1E
            X.72i r0 = new X.72i
            r0.<init>(r2)
            r1.execute(r0)
            goto L_0x0453
        L_0x049a:
            com.whatsapp.voipcalling.VoipActivityV2.A1C(r3, r1, r2)
            com.whatsapp.voipcalling.VoipActivityV2.A10(r3)
            return
        L_0x04a1:
            java.lang.Object r1 = r12.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r1
            r0 = 1
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A0B(r1, r0)
            return
        L_0x04aa:
            java.lang.Object r0 = r12.A00
            com.whatsapp.wabai.SystemMessage3PBottomSheet r0 = (com.whatsapp.wabai.SystemMessage3PBottomSheet) r0
            X.1fs r2 = r0.A00
            if (r2 == 0) goto L_0x04bc
            X.01I r1 = r0.A0i()
            java.lang.String r0 = "third-party-bots-help-article"
            r2.A01(r1, r0)
            return
        L_0x04bc:
            java.lang.String r0 = "contextualHelpHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04c3:
            java.lang.Object r0 = r12.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            X.01I r0 = r0.A0i()
            X.01z r2 = r0.getSupportFragmentManager()
            com.whatsapp.webview.ui.WebViewLearnMoreBottomSheet r1 = new com.whatsapp.webview.ui.WebViewLearnMoreBottomSheet
            r1.<init>()
            java.lang.String r0 = "webview_learn_more"
            X.C65443Sb.A04(r1, r2, r0)
            return
        L_0x04da:
            java.lang.Object r0 = r12.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.onBackPressed()
            return
        L_0x04e2:
            java.lang.Object r0 = r12.A00
            X.7hz r0 = (X.C158737hz) r0
            X.7t6 r0 = (X.C165237t6) r0
            int r1 = r0.A01
            java.lang.Object r0 = r0.A00
            if (r1 == 0) goto L_0x04f4
            com.whatsapp.wabloks.ui.WaBloksActivity r0 = (com.whatsapp.wabloks.ui.WaBloksActivity) r0
            r0.onBackPressed()
            return
        L_0x04f4:
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r0 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r0
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer.A05(r0)
            return
        L_0x04fa:
            java.lang.Object r1 = r12.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            return
        L_0x0501:
            java.lang.Object r0 = r12.A00
            X.00S r0 = (X.AnonymousClass00S) r0
            r0.invoke()
            return
        L_0x0509:
            java.lang.Object r0 = r12.A00
            com.whatsapp.wds.components.search.WDSConversationSearchView r0 = (com.whatsapp.wds.components.search.WDSConversationSearchView) r0
            com.whatsapp.wds.components.search.WDSConversationSearchView.setUpClearButton$lambda$5(r0, r13)
            return
        L_0x0511:
            java.lang.Object r1 = r12.A00
            com.whatsapp.wds.components.search.WDSSearchBar r1 = (com.whatsapp.wds.components.search.WDSSearchBar) r1
            r0 = 1
            r1.A02(r0)
            return
        L_0x051a:
            java.lang.Object r0 = r12.A00
            com.whatsapp.wds.components.search.WDSSearchView r0 = (com.whatsapp.wds.components.search.WDSSearchView) r0
            com.whatsapp.wds.components.search.WDSSearchView.setUpTrailingButtonIcon$lambda$4$lambda$3(r0, r13)
            return
        L_0x0522:
            java.lang.Object r0 = r12.A00
            com.whatsapp.webview.ui.WaInAppBrowsingActivity r0 = (com.whatsapp.webview.ui.WaInAppBrowsingActivity) r0
            r0.onBackPressed()
            return
        L_0x052a:
            java.lang.Object r1 = r12.A00
            X.14u r1 = (X.C225314u) r1
            com.whatsapp.webview.ui.WebViewLearnMoreBottomSheet r0 = new com.whatsapp.webview.ui.WebViewLearnMoreBottomSheet
            r0.<init>()
            r1.Btm(r0)
            return
        L_0x0537:
            java.lang.Object r3 = r12.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r3 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r3
            X.1UZ r1 = r3.A07
            if (r1 == 0) goto L_0x056b
            java.lang.String r0 = "TAP_NATIVE_AUTH_AGREE"
            r1.A04(r0)
            X.1UM r1 = r3.A06
            if (r1 == 0) goto L_0x0564
            X.1US r0 = X.AnonymousClass1US.ACCOUNT_LINKING_NATIVE_AUTH_ACTIVITY
            r1.A02(r0)
            X.17Y r0 = r3.A05
            X.AnonymousClass00C.A07(r0)
            X.3GB r2 = new X.3GB
            r2.<init>(r0)
            r0 = 2131886340(0x7f120104, float:1.9407256E38)
            r2.A01(r0)
            X.0wU r1 = r3.A04
            r0 = 1
            X.C1498272x.A00(r1, r2, r3, r0)
            return
        L_0x0564:
            java.lang.String r0 = "fbAccountManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x056b:
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0572:
            java.lang.Object r3 = r12.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r3 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r3
            r2 = 0
            X.1UZ r1 = r3.A07
            if (r1 == 0) goto L_0x0585
            java.lang.String r0 = "EXIT_NATIVE_AUTH"
            r1.A04(r0)
            r0 = 0
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity.A07(r3, r0, r0, r2)
            return
        L_0x0585:
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x058c:
            java.lang.Object r0 = r12.A00
            X.3Ab r0 = (X.C60973Ab) r0
            X.005 r0 = r0.A06
            java.lang.Object r0 = r0.get()
            X.3Kt r0 = (X.C63623Kt) r0
            r0.A00()
            return
        L_0x059c:
            java.lang.Object r4 = r12.A00
            X.3Rm r4 = (X.C65293Rm) r4
            X.5Qg r1 = r4.A04
            java.lang.String r0 = "TAP_BANNER_DISMISS"
            r1.A03(r0)
            X.00T r0 = r4.A08
            java.lang.Object r0 = r0.getValue()
            X.2nA r0 = (X.C51062nA) r0
            X.00T r0 = r0.A01
            android.content.SharedPreferences r0 = X.C36411kG.A0E(r0)
            X.AnonymousClass00C.A08(r0)
            android.content.SharedPreferences$Editor r3 = r0.edit()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "ts"
            android.content.SharedPreferences$Editor r0 = r3.putLong(r0, r1)
            X.AnonymousClass00C.A08(r0)
            java.lang.String r1 = "shown"
            r0 = 3
            r3.putInt(r1, r0)
            r3.apply()
            X.3Kt r1 = r4.A03
            r0 = 1
            r1.A02(r0)
            return
        L_0x05d9:
            java.lang.Object r3 = r12.A00
            com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity r3 = (com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity) r3
            X.1qm r2 = X.AnonymousClass3LW.A00(r3)
            r0 = 2131894355(0x7f122053, float:1.9423512E38)
            r2.A0c(r0)
            r0 = 2131894356(0x7f122054, float:1.9423514E38)
            r2.A0d(r0)
            r1 = 7
            X.7q0 r0 = new X.7q0
            r0.<init>(r3, r1)
            r2.A0e(r0)
            r1 = 2131894354(0x7f122052, float:1.942351E38)
            r0 = 46
            X.C163297py.A01(r2, r3, r0, r1)
            r1 = 2131896389(0x7f122845, float:1.9427638E38)
            r0 = 45
            X.C163297py.A00(r2, r3, r0, r1)
            X.0FM r0 = r2.A0b()
            X.AnonymousClass00C.A08(r0)
            X.1UZ r1 = r3.A3i()
            java.lang.String r0 = "SEE_UNLINK_DIALOG"
            r1.A04(r0)
            return
        L_0x0617:
            java.lang.Object r4 = r12.A00
            com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity r4 = (com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity) r4
            java.lang.String r3 = r4.A09
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "event_name"
            r2.putExtra(r0, r3)
            r0 = 11
            r4.BuO(r2, r0)
            X.1UN r1 = r4.A02
            if (r1 != 0) goto L_0x063f
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x063f:
            java.lang.String r0 = "TAP_NEW_GROUP"
            r1.A04(r0)
            return
        L_0x0645:
            java.lang.Object r3 = r12.A00
            android.app.Activity r3 = (android.app.Activity) r3
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r1 = "error"
            java.lang.String r0 = "USER_ABORTED"
            r2.putString(r1, r0)
            android.os.ResultReceiver r1 = X.C124765yl.A0B
            r0 = 0
            r1.send(r0, r2)
            r3.finish()
            return
        L_0x065e:
            java.lang.Object r1 = r12.A00
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            android.view.View r0 = r1.A04
            int r0 = r0.getVisibility()
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r0 = r0 ^ 1
            org.npci.upi.security.pinactivitycomponent.GetCredential.A07(r1, r0)
            return
        L_0x0672:
            r0 = 2131428681(0x7f0b0549, float:1.8479013E38)
            android.view.View r2 = r13.findViewById(r0)
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            boolean r0 = r2.isChecked()
            r0 = r0 ^ 1
            r2.setChecked(r0)
            java.lang.Object r1 = r13.getTag()
            X.35r r1 = (X.C598935r) r1
            boolean r0 = r2.isChecked()
            r1.A01 = r0
            return
        L_0x0691:
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135476cl.onClick(android.view.View):void");
    }
}
