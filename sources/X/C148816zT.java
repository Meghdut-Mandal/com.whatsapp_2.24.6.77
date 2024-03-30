package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.telecom.CallAudioState;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.6zT  reason: invalid class name and case insensitive filesystem */
public class C148816zT implements C158547hg {
    public static final Object A0K = C133616Zh.A00;
    public static final boolean A0L = C36371kC.A1T(Build.VERSION.SDK_INT, 28);
    public int A00;
    public int A01;
    public boolean A02 = false;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final AnonymousClass17Y A09;
    public final AnonymousClass6ER A0A;
    public final C90944bC A0B;
    public final AnonymousClass6YM A0C;
    public final AnonymousClass1Pk A0D;
    public final C27671Pf A0E;
    public final C21060yb A0F;
    public final C90964bE A0G;
    public final C19930wk A0H;
    public final C20810yC A0I;
    public final AnonymousClass13J A0J;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r2 < 3) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r0 == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r7.isAudioChat() != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(X.C148816zT r6, com.whatsapp.voipcalling.CallInfo r7) {
        /*
            r5 = 0
            com.whatsapp.jid.GroupJid r0 = r7.groupJid
            if (r0 != 0) goto L_0x000c
            boolean r0 = r7.isAudioChat()
            r4 = 0
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            r4 = 1
        L_0x000d:
            boolean r0 = r7.videoEnabled
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = r7.callLinkToken
            if (r0 != 0) goto L_0x0043
            android.content.Context r0 = r6.A08
            X.1Lw r1 = X.C25961Ii.A02(r0)
            if (r1 == 0) goto L_0x0045
            android.content.Context r0 = X.C25981Ik.A00(r0)
            android.content.res.Resources r3 = r0.getResources()
            android.content.res.Configuration r0 = r3.getConfiguration()
            int r0 = r0.screenLayout
            r2 = r0 & 15
            int r1 = r1.A00
            r0 = 900(0x384, float:1.261E-42)
            if (r1 <= r0) goto L_0x0037
            r0 = 3
            r1 = 1
            if (r2 >= r0) goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            r0 = 2131034122(0x7f05000a, float:1.7678753E38)
            boolean r0 = r3.getBoolean(r0)
            if (r1 != 0) goto L_0x0043
            if (r0 == 0) goto L_0x0045
        L_0x0043:
            r5 = 1
        L_0x0044:
            return r5
        L_0x0045:
            if (r4 == 0) goto L_0x0044
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148816zT.A04(X.6zT, com.whatsapp.voipcalling.CallInfo):boolean");
    }

    public static void A02(C148816zT r2, int i) {
        C1497172m r1 = new C1497172m(r2, i);
        if (A03(r2)) {
            r2.A0H.execute(r1);
        } else {
            r1.run();
        }
    }

    public static boolean A03(C148816zT r1) {
        return AnonymousClass000.A1R(r1.A0I.A07(6634));
    }

    public void A06(CallInfo callInfo) {
        if (callInfo != null && callInfo.callState != CallState.NONE) {
            A01(new C1501874h(this, callInfo, 32), this);
        }
    }

    public void A07(CallInfo callInfo) {
        A01(new C1501874h(this, callInfo, 34), this);
    }

    public void A0B(CallInfo callInfo, Boolean bool) {
        AudioManager A0D2;
        if (bool != null) {
            this.A03 = bool.booleanValue();
        }
        if (callInfo != null && callInfo.callState != CallState.NONE && (A0D2 = this.A0F.A0D()) != null) {
            int i = this.A00;
            AnonymousClass6YM r1 = this.A0C;
            C91734cX A0H2 = r1.A0H(callInfo.callId);
            CallAudioState callAudioState = null;
            boolean z = true;
            if (this.A03 || !A0L || A0H2 == null || A0H2.getCallAudioState() == null) {
                if (A0D2.isBluetoothScoOn()) {
                    this.A00 = 3;
                } else if (A0D2.isSpeakerphoneOn() && !this.A04) {
                    this.A00 = 1;
                    if (i != 1) {
                        this.A07 = false;
                    }
                } else if (this.A0A.A03()) {
                    this.A00 = 4;
                } else {
                    this.A00 = 2;
                }
                z = false;
            } else {
                callAudioState = A0H2.getCallAudioState();
                int route = callAudioState.getRoute();
                if (route == 1) {
                    this.A00 = 2;
                } else if (route == 2) {
                    this.A00 = 3;
                } else if (route == 4) {
                    this.A00 = 4;
                } else if (route == 8) {
                    this.A00 = 1;
                }
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/audio_route/updateAudioRoute: [");
            A0u.append(Voip.A05(i));
            A0u.append(" -> ");
            A0u.append(Voip.A05(this.A00));
            A0u.append("], using telecom: ");
            A0u.append(z);
            A0u.append(", ");
            StringBuilder A0u2 = AnonymousClass000.A0u();
            if (callAudioState != null) {
                A0u2.append("CallAudioState: ");
                A0u2.append(callAudioState);
            } else {
                A0u2.append("Bluetooth: [ScoAudioState: ");
                A0u2.append(C90944bC.A00(this.A01));
                A0u2.append(", ScoOn: ");
                A0u2.append(A0D2.isBluetoothScoOn());
                A0u2.append("], Speaker: ");
                A0u2.append(A0D2.isSpeakerphoneOn());
            }
            C36351kA.A1K(A0u2, A0u);
            A0u.append(", fallBackToNonTelecomToSyncAudioRoute: ");
            A0u.append(this.A03);
            C36321k7.A1K(this, ", ", A0u);
            this.A04 = false;
            int i2 = this.A00;
            if (A03(this)) {
                this.A09.A0H(new C81333wq(this, i2, 15, callInfo));
            } else {
                r1.A0b(callInfo, i2);
            }
        }
    }

    public void A0C(CallInfo callInfo, boolean z) {
        String str;
        String str2;
        AnonymousClass6YM r1 = this.A0C;
        if (callInfo == null) {
            str = null;
        } else {
            str = callInfo.callId;
        }
        C91734cX A0H2 = r1.A0H(str);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/audio_route/changeBluetoothState ");
        if (z) {
            str2 = "On";
        } else {
            str2 = "Off";
        }
        A0u.append(str2);
        A0u.append(" using telecom: ");
        C36331k8.A1S(A0u, AnonymousClass000.A1V(A0H2));
        if (!A0L || A0H2 == null) {
            AudioManager A0D2 = this.A0F.A0D();
            if (A0D2 != null) {
                if (z) {
                    try {
                        if (A0D2.isBluetoothScoOn()) {
                            Log.i("voip/audio_route/changeBluetoothState startBluetoothSco when isBluetoothScoOn is true");
                        }
                        A0D2.startBluetoothSco();
                        A0D2.setBluetoothScoOn(true);
                    } catch (Exception e) {
                        Log.e((Throwable) e);
                    }
                } else {
                    A0D2.setBluetoothScoOn(false);
                    A0D2.stopBluetoothSco();
                }
                A0A(callInfo, (Boolean) null);
                return;
            }
            return;
        }
        int i = 5;
        if (z) {
            i = 2;
        }
        A0H2.setAudioRoute(i);
    }

    public void A0D(CallInfo callInfo, boolean z) {
        AnonymousClass752 r1 = new AnonymousClass752(this, callInfo, 9, z);
        if (A03(this)) {
            this.A0H.execute(r1);
        } else {
            r1.run();
        }
    }

    public /* synthetic */ void A0E(CallInfo callInfo, boolean z) {
        String str;
        String str2;
        AnonymousClass6YM r1 = this.A0C;
        if (callInfo == null) {
            str = null;
        } else {
            str = callInfo.callId;
        }
        C91734cX A0H2 = r1.A0H(str);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/audio_route/changeSpeakerphoneState ");
        if (z) {
            str2 = "On";
        } else {
            str2 = "Off";
        }
        A0u.append(str2);
        A0u.append(" using telecom: ");
        C36331k8.A1S(A0u, AnonymousClass000.A1V(A0H2));
        if (!A0L || A0H2 == null) {
            AudioManager A0D2 = this.A0F.A0D();
            if (A0D2 != null) {
                A0D2.setSpeakerphoneOn(z);
                A0A(callInfo, (Boolean) null);
                return;
            }
            return;
        }
        int i = 5;
        if (z) {
            i = 8;
        }
        A0H2.setAudioRoute(i);
    }

    public void A0F(boolean z) {
        AudioManager A0D2 = this.A0F.A0D();
        if (A0D2 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/audio_route/muteOsMicrophone call from: ");
            A0u.append(A00());
            A0u.append(", mute: ");
            A0u.append(z);
            A0u.append(", isMicrophoneMute was ");
            C36331k8.A1S(A0u, A0D2.isMicrophoneMute());
            A0D2.setMicrophoneMute(z);
        }
    }

    public boolean A0G(String str) {
        C91734cX A0H2 = this.A0C.A0H(str);
        if (!A0L || A0H2 == null || A0H2.getCallAudioState() == null) {
            AudioManager A0D2 = this.A0F.A0D();
            BluetoothHeadset bluetoothHeadset = this.A0G.A00;
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                return false;
            }
            try {
                if (!defaultAdapter.isEnabled() || A0D2 == null) {
                    return false;
                }
                if (C19550w8.A08()) {
                    if (!AnonymousClass6HL.A00(A0D2).isEmpty()) {
                        return true;
                    }
                    return false;
                } else if (bluetoothHeadset == null || bluetoothHeadset.getConnectedDevices().isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            } catch (Exception e) {
                Log.e((Throwable) e);
                return false;
            }
        } else {
            C18740tg.A06(A0H2);
            return !A0H2.getCallAudioState().getSupportedBluetoothDevices().isEmpty();
        }
    }

    public C148816zT(Context context, AnonymousClass17Y r5, AnonymousClass6YM r6, C27671Pf r7, C21060yb r8, C20810yC r9, C90964bE r10, AnonymousClass13J r11, C19770wU r12) {
        AnonymousClass6ER r0;
        AnonymousClass53N r02;
        this.A0C = r6;
        this.A0I = r9;
        this.A09 = r5;
        this.A08 = context;
        this.A0J = r11;
        this.A0F = r8;
        this.A0G = r10;
        this.A0E = r7;
        this.A0H = new C19930wk(r12, false);
        C36321k7.A1K(this, "voip/audio_route/create ", AnonymousClass000.A0u());
        C116865lK r2 = new C116865lK(this);
        if (Build.VERSION.SDK_INT >= 23) {
            r0 = new AnonymousClass523(r8);
        } else {
            r0 = new AnonymousClass524(context, r8);
        }
        r0.A00 = r2;
        this.A0A = r0;
        this.A0B = new C90944bC(this);
        if (!A0L) {
            r02 = null;
        } else {
            r02 = new AnonymousClass53N(this, r11);
        }
        this.A0D = r02;
    }

    private String A00() {
        boolean z = false;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(AnonymousClass000.A0k(this))) {
                z = true;
            } else if (z) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(stackTraceElement.getClassName());
                A0u.append("/");
                return AnonymousClass000.A0q(stackTraceElement.getMethodName(), A0u);
            }
        }
        return null;
    }

    public static void A01(C1501874h r1, C148816zT r2) {
        if (A03(r2)) {
            r2.A0H.execute(r1);
        } else {
            r1.run();
        }
    }

    public void A05() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/audio_route/resetAudioManager ");
        A0u.append(this);
        A0u.append(", telecom: ");
        C36331k8.A1S(A0u, this.A05);
        if (!this.A05) {
            AudioManager A0D2 = this.A0F.A0D();
            if (A0D2 != null) {
                A0D2.setSpeakerphoneOn(false);
            }
            A0C((CallInfo) null, false);
        }
        this.A00 = 2;
        AudioManager A0D3 = this.A0F.A0D();
        if (!this.A05 && A0D3 != null) {
            this.A0H.execute(new C1501874h(this, A0D3, 35));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r4.getCallAudioState() == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r4.getCallAudioState().getRoute() == 4) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r5.A0A.A03() != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (A04(r5, r6) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        A0D(r6, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        A0D(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A08(com.whatsapp.voipcalling.CallInfo r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/audio_route/autoChooseAudioRoute from: "
            r1.append(r0)
            java.lang.String r0 = r5.A00()
            r1.append(r0)
            java.lang.String r0 = ", call state: "
            r1.append(r0)
            com.whatsapp.voipcalling.CallState r0 = r6.callState
            X.C36321k7.A1N(r0, r1)
            X.6YM r1 = r5.A0C
            java.lang.String r0 = r6.callId
            X.4cX r4 = r1.A0H(r0)
            java.lang.String r0 = r6.callId
            boolean r0 = r5.A0G(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0049
            r5.A07(r6)
            boolean r0 = A0L
            if (r0 == 0) goto L_0x0045
            if (r4 == 0) goto L_0x0045
            android.telecom.CallAudioState r0 = r4.getCallAudioState()
            if (r0 == 0) goto L_0x0045
            X.0yC r1 = r5.A0I
            r0 = 3825(0xef1, float:5.36E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            r5.A0C(r6, r3)
            return
        L_0x0049:
            boolean r0 = A0L
            if (r0 == 0) goto L_0x0056
            if (r4 == 0) goto L_0x0056
            android.telecom.CallAudioState r1 = r4.getCallAudioState()
            r0 = 1
            if (r1 != 0) goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            r2 = 0
            if (r0 == 0) goto L_0x006d
            X.C18740tg.A06(r4)
            android.telecom.CallAudioState r0 = r4.getCallAudioState()
            int r1 = r0.getRoute()
            r0 = 4
            if (r1 != r0) goto L_0x0076
        L_0x0068:
            r0 = 0
            r5.A0A(r6, r0)
            return
        L_0x006d:
            X.6ER r0 = r5.A0A
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0076
            goto L_0x0068
        L_0x0076:
            boolean r0 = A04(r5, r6)
            if (r0 == 0) goto L_0x0080
            r5.A0D(r6, r3)
            return
        L_0x0080:
            r5.A0D(r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148816zT.A08(com.whatsapp.voipcalling.CallInfo):void");
    }

    public void A09(CallInfo callInfo, Boolean bool) {
        A0A(callInfo, bool);
        A01(new C1501874h(this, callInfo, 33), this);
    }

    public void A0A(CallInfo callInfo, Boolean bool) {
        if (A03(this)) {
            C1502474n.A00(this.A0H, this, callInfo, bool, 25);
        } else {
            A0B(callInfo, bool);
        }
    }

    public void BSG(int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/audio_route/onBluetoothHeadsetConnectionStateChanged state: ");
        C36321k7.A1a(A0u, C90964bE.A00(i));
        if (i != 0) {
            if (i == 2) {
                A06(Voip.getCallInfo());
                return;
            } else if (i != 3) {
                return;
            }
        }
        A0C(Voip.getCallInfo(), false);
    }
}
