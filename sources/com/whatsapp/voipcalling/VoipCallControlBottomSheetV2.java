package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass016;
import X.AnonymousClass01I;
import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass0CZ;
import X.AnonymousClass13J;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass1KK;
import X.AnonymousClass1NF;
import X.AnonymousClass1PZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass3FU;
import X.AnonymousClass3UE;
import X.AnonymousClass3UL;
import X.AnonymousClass5YM;
import X.AnonymousClass61I;
import X.AnonymousClass6X3;
import X.AnonymousClass7dG;
import X.C011504z;
import X.C012005e;
import X.C018107s;
import X.C02800By;
import X.C114145gi;
import X.C117955n6;
import X.C144236rr;
import X.C1498172w;
import X.C160927lo;
import X.C164717sG;
import X.C164757sK;
import X.C18740tg;
import X.C19770wU;
import X.C20810yC;
import X.C21060yb;
import X.C25271Fq;
import X.C30531aM;
import X.C34681hT;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C67143Yr;
import X.C90484aE;
import X.C90504aG;
import X.C90524aI;
import X.C95894mS;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.whatsapp.R;
import com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel;
import com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.whatsapp.calling.views.DialpadButton;
import com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator;
import com.whatsapp.calling.views.VoipCallFooter;
import com.whatsapp.util.Log;

public class VoipCallControlBottomSheetV2 extends Hilt_VoipCallControlBottomSheetV2 {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public FrameLayout A0B;
    public Space A0C;
    public TextView A0D;
    public NestedScrollView A0E;
    public RecyclerView A0F;
    public MaterialButton A0G;
    public MaterialButton A0H;
    public AnonymousClass17Y A0I;
    public AnonymousClass1KK A0J;
    public C30531aM A0K;
    public AnonymousClass6X3 A0L;
    public C95894mS A0M;
    public BottomSheetViewModel A0N;
    public CallControlButtonsViewModel A0O;
    public ParticipantsListViewModel A0P;
    public C160927lo A0Q;
    public AnonymousClass1PZ A0R;
    public AnonymousClass1NF A0S;
    public VoipCallControlBottomSheetDragIndicator A0T;
    public VoipCallFooter A0U;
    public AnonymousClass185 A0V;
    public C21060yb A0W;
    public C25271Fq A0X;
    public C20810yC A0Y;
    public AnonymousClass13J A0Z;
    public AnonymousClass1RJ A0a;
    public AnonymousClass1RJ A0b;
    public C19770wU A0c;
    public AnonymousClass61I A0d;
    public StringBuilder A0e = C90524aI.A0i("");
    public DialpadButton[] A0f;
    public int A0g;
    public AnonymousClass1RJ A0h;
    public boolean A0i;
    public final int[] A0j = {R.id.zero, R.id.one, R.id.two, R.id.three, R.id.four, R.id.five, R.id.six, R.id.seven, R.id.eight, R.id.nine, R.id.star, R.id.pound};

    public static int A03(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        AnonymousClass01I A0h2;
        if (Build.VERSION.SDK_INT >= 24 && (A0h2 = voipCallControlBottomSheetV2.A0h()) != null && A0h2.isInMultiWindowMode()) {
            return 0;
        }
        int identifier = C36341k9.A0G(voipCallControlBottomSheetV2).getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return C36341k9.A0G(voipCallControlBottomSheetV2).getDimensionPixelSize(identifier);
        }
        return 25;
    }

    public boolean A1m() {
        int A1Y = A1Y();
        return A1Y != 0 ? A1Y == R.style.f13nameremoved : this.A0A.getBoolean("is_video_call", false);
    }

    public static CallInfo A05(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        AnonymousClass61I r0 = voipCallControlBottomSheetV2.A0d;
        if (r0 != null) {
            return VoipActivityV2.A01(r0.A00);
        }
        return null;
    }

    public static VoipCallControlBottomSheetV2 A06(boolean z, boolean z2) {
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = new VoipCallControlBottomSheetV2();
        Bundle A072 = AnonymousClass001.A07();
        A072.putBoolean("is_video_call", z);
        A072.putBoolean("is_incoming_capi_call", z2);
        voipCallControlBottomSheetV2.A17(A072);
        return voipCallControlBottomSheetV2;
    }

    public static void A07(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        Dialog dialog = voipCallControlBottomSheetV2.A02;
        if (dialog != null && dialog.getWindow() != null) {
            View decorView = voipCallControlBottomSheetV2.A02.getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 256 | 4);
        }
    }

    public static void A08(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        AnonymousClass6X3 r1;
        int i;
        boolean z;
        AnonymousClass6X3 r4 = voipCallControlBottomSheetV2.A0L;
        if (r4 != null) {
            if (r4.A07()) {
                z = false;
            } else if (r4.A0G.A0X) {
                AnonymousClass1PZ r3 = voipCallControlBottomSheetV2.A0R;
                int i2 = 31;
                if (r4.A08()) {
                    i2 = 30;
                }
                r3.A01(C36371kC.A0n(), i2, 16);
                if (voipCallControlBottomSheetV2.A0L.A08()) {
                    Dialog dialog = voipCallControlBottomSheetV2.A02;
                    if (!(dialog == null || dialog.getWindow() == null)) {
                        View decorView = voipCallControlBottomSheetV2.A02.getWindow().getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -5);
                    }
                    r4 = voipCallControlBottomSheetV2.A0L;
                    z = true;
                } else {
                    A07(voipCallControlBottomSheetV2);
                    r1 = voipCallControlBottomSheetV2.A0L;
                    if (r1.A0G.A0X) {
                        i = 5;
                        AnonymousClass6X3.A01(r1, i);
                    }
                    return;
                }
            } else {
                return;
            }
            if (r4.A06 && !r4.A0A) {
                float A0S2 = ((float) r4.A0G.A0S()) * 0.07f;
                View view = r4.A0D;
                if (z) {
                    A0S2 = -A0S2;
                }
                view.setTranslationY(A0S2);
            }
            r1 = voipCallControlBottomSheetV2.A0L;
            i = 4;
            AnonymousClass6X3.A01(r1, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0 == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r5, float r6) {
        /*
            X.6X3 r1 = r5.A0L
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000f
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.A06
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            android.app.Dialog r0 = r5.A02
            if (r0 == 0) goto L_0x004f
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x004f
            if (r1 == 0) goto L_0x0053
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r5.A0N
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0053
        L_0x0027:
            android.app.Dialog r0 = r5.A02
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r4 == 0) goto L_0x004c
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r5.A0N
            if (r0 == 0) goto L_0x0050
            X.1hi r0 = r0.A0A
            boolean r0 = X.C36351kA.A1W(r0)
            if (r0 == 0) goto L_0x0050
            float r1 = r5.A01
        L_0x0045:
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r3 = X.C90514aH.A06(r1, r6)
        L_0x004c:
            r2.setAlpha(r3)
        L_0x004f:
            return
        L_0x0050:
            float r1 = r5.A00
            goto L_0x0045
        L_0x0053:
            r4 = 0
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A09(com.whatsapp.voipcalling.VoipCallControlBottomSheetV2, float):void");
    }

    public static void A0A(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2, float f) {
        Dialog dialog;
        Window window;
        BottomSheetViewModel bottomSheetViewModel = voipCallControlBottomSheetV2.A0N;
        if (bottomSheetViewModel != null && bottomSheetViewModel.A02 && (dialog = voipCallControlBottomSheetV2.A02) != null && (window = dialog.getWindow()) != null) {
            window.setNavigationBarColor(C018107s.A06(voipCallControlBottomSheetV2.A0g, (int) (f * 255.0f)));
        }
    }

    public void A1f(AnonymousClass01z r4, String str) {
        AnonymousClass61I r0 = this.A0d;
        if (r0 != null) {
            VoipActivityV2 voipActivityV2 = r0.A00;
            if (!(!voipActivityV2.A1w && voipActivityV2.A17 == null && voipActivityV2.A0e.A0I.A04() == null)) {
                Log.i("voip/VoipCallControlBottomSheetV2 bottom sheet action is disabled");
                return;
            }
        }
        if (this.A0i) {
            Log.i("voip/VoipCallControlBottomSheetV2 show after attached");
            AnonymousClass6X3 r02 = this.A0L;
            if (r02 != null && r02.A08()) {
                Dialog dialog = this.A02;
                if (!(dialog == null || dialog.getWindow() == null)) {
                    View decorView = this.A02.getWindow().getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -5);
                }
                AnonymousClass6X3.A01(this.A0L, 4);
                AnonymousClass6X3 r1 = this.A0L;
                if (r1.A06 && !r1.A0A) {
                    r1.A0D.setTranslationY(-(((float) r1.A0G.A0S()) * 0.07f));
                    return;
                }
                return;
            }
            return;
        }
        this.A0i = true;
        Log.i("voip/VoipCallControlBottomSheetV2 attaching bottom sheet");
        AnonymousClass02E A0N2 = r4.A0N(str);
        AnonymousClass09Y r03 = new AnonymousClass09Y(r4);
        if (A0N2 != null) {
            r03.A08(A0N2);
        }
        r03.A0D(this, str);
        r03.A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        if (r5.A1q == false) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1h(int r7, float r8) {
        /*
            r6 = this;
            X.61I r0 = r6.A0d
            if (r0 == 0) goto L_0x0087
            com.whatsapp.voipcalling.VoipActivityV2 r5 = r0.A00
            boolean r0 = r5.A1q
            if (r0 == 0) goto L_0x0022
            X.005 r0 = r5.A1e
            java.lang.Object r0 = r0.get()
            X.5yo r0 = (X.C124795yo) r0
            X.05L r2 = r0.A08
            r1 = r8
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x001b
            r1 = 0
        L_0x001b:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r2.setValue(r0)
        L_0x0022:
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x009b
            int r1 = r5.A00
            r0 = 3
            if (r1 != r0) goto L_0x0033
            X.64k r0 = r5.A0c
            r0.A01 = r8
            r0.A00()
        L_0x0033:
            com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r3 = r5.A0d
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass000.A0a(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoipCallNewParticipantBanner/moveBannerYPosition yOffset: "
            X.C36321k7.A1T(r0, r1, r7)
            int r0 = r2.bottomMargin
            int r0 = r0 - r7
            r2.bottomMargin = r0
            r3.setLayoutParams(r2)
            boolean r0 = r5.A1q
            if (r0 != 0) goto L_0x0062
            X.1RJ r0 = r5.A1W
            android.view.View r0 = r0.A01()
            float r1 = X.C36441kJ.A02(r0)
            float r1 = r1 * r8
        L_0x0059:
            X.1RJ r0 = r5.A1W
            android.view.View r0 = r0.A01()
            r0.setTranslationY(r1)
        L_0x0062:
            X.6T1 r4 = r5.A0t
            if (r4 == 0) goto L_0x0080
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0080
            X.1hi r0 = r4.A09
            java.lang.Object r0 = X.C36401kF.A0m(r0)
            X.6PK r0 = (X.AnonymousClass6PK) r0
            boolean r3 = r0.A02
            int r2 = r0.A01
            boolean r1 = r0.A03
            X.6PK r0 = new X.6PK
            r0.<init>(r8, r2, r3, r1)
            X.AnonymousClass6T1.A00(r4, r0)
        L_0x0080:
            X.6ro r0 = r5.A0l
            if (r0 == 0) goto L_0x0087
            r0.A02(r8)
        L_0x0087:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 + r1
            r0 = 1060320051(0x3f333333, float:0.7)
            float r8 = r8 / r0
            r0 = 0
            float r0 = java.lang.Math.max(r0, r8)
            float r0 = java.lang.Math.min(r1, r0)
            A0A(r6, r0)
            return
        L_0x009b:
            boolean r0 = r5.A1q
            if (r0 != 0) goto L_0x0062
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A1h(int, float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r5 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A1i(android.content.DialogInterface r10) {
        /*
            r9 = this;
            X.61I r0 = r9.A0d
            if (r0 == 0) goto L_0x0023
            com.whatsapp.voipcalling.VoipActivityV2 r5 = r0.A00
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.VoipActivityV2.A01(r5)
            if (r4 == 0) goto L_0x0023
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x0023
            com.whatsapp.jid.UserJid r3 = X.C90494aF.A0M(r4)
            boolean r2 = r4.videoEnabled
            boolean r1 = r4.isPeerRequestingUpgrade()
            r0 = -1
            if (r1 == 0) goto L_0x0020
            r0 = 2
        L_0x0020:
            com.whatsapp.voipcalling.VoipActivityV2.A1N(r3, r5, r0, r2)
        L_0x0023:
            android.view.View r0 = r9.A0A
            X.C18740tg.A04(r0)
            r1 = 0
            r0.setVisibility(r1)
            android.app.Dialog r10 = (android.app.Dialog) r10
            r0 = 2131429523(0x7f0b0893, float:1.8480721E38)
            android.view.View r3 = X.AnonymousClass0PN.A00(r10, r0)
            r9.A07 = r3
            X.0yC r6 = r9.A0Y
            android.view.View r4 = r9.A09
            X.1RJ r8 = r9.A0b
            android.widget.TextView r5 = r9.A0D
            X.13J r7 = r9.A0Z
            X.6X3 r2 = new X.6X3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r9.A0L = r2
            com.whatsapp.voipcalling.CallInfo r3 = A05(r9)
            android.os.Bundle r2 = r9.A0A
            if (r2 == 0) goto L_0x0163
            java.lang.String r0 = "is_incoming_capi_call"
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x0163
            X.0yC r0 = r9.A0Y
            boolean r0 = X.C34681hT.A0G(r0)
            if (r0 == 0) goto L_0x0163
            java.lang.String r0 = "Disable dragging for bottom sheet for incoming call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6X3 r0 = r9.A0L
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r0.A0G
            r0.A0b(r1)
        L_0x006c:
            X.7lo r1 = r9.A0Q
            android.view.View r0 = r9.A07
            r1.BqK(r0)
            X.7lo r0 = r9.A0Q
            X.00r r2 = r0.B9C()
            r1 = 5
            X.7t3 r0 = new X.7t3
            r0.<init>(r9, r1)
            r2.A08(r9, r0)
            android.view.View r0 = r9.A07
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            X.7lo r1 = r9.A0Q
            java.util.Objects.requireNonNull(r1)
            r0 = 26
            X.C164757sK.A00(r2, r1, r0)
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r0 = r9.A0P
            X.00s r1 = r0.A01
            r5 = 2
            X.7t3 r0 = new X.7t3
            r0.<init>(r9, r5)
            r1.A08(r9, r0)
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r9.A0N
            X.00s r1 = r0.A06
            r0 = 47
            X.C165197t2.A00(r9, r1, r0)
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r9.A0N
            X.1hi r1 = r0.A0A
            r0 = 48
            X.C165197t2.A00(r9, r1, r0)
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r9.A0N
            X.1hi r1 = r0.A0B
            r7 = 0
            X.7t3 r0 = new X.7t3
            r0.<init>(r9, r7)
            r1.A08(r9, r0)
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r9.A0N
            X.00s r1 = r0.A03
            r4 = 1
            X.7t3 r0 = new X.7t3
            r0.<init>(r9, r4)
            r1.A08(r9, r0)
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r9.A0N
            X.1hi r1 = r0.A09
            r0 = 46
            X.C165197t2.A00(r9, r1, r0)
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r9.A0N
            X.00s r1 = r0.A05
            r0 = 49
            X.C165197t2.A00(r9, r1, r0)
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r9.A0N
            X.00s r6 = r0.A04
            X.6X3 r2 = r9.A0L
            java.util.Objects.requireNonNull(r2)
            r1 = 3
            X.7t3 r0 = new X.7t3
            r0.<init>(r2, r1)
            r6.A08(r9, r0)
            com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel r0 = r9.A0O
            X.00s r2 = r0.A01
            r1 = 4
            X.7t3 r0 = new X.7t3
            r0.<init>(r9, r1)
            r2.A08(r9, r0)
            if (r3 == 0) goto L_0x010f
            android.os.Bundle r1 = r9.A0A
            if (r1 == 0) goto L_0x015a
            java.lang.String r0 = "is_incoming_capi_call"
            boolean r0 = r1.getBoolean(r0, r7)
            if (r0 == 0) goto L_0x015a
        L_0x010a:
            X.0yC r0 = r9.A0Y
            X.C34681hT.A0G(r0)
        L_0x010f:
            r0 = 2131434828(0x7f0b1d4c, float:1.849148E38)
            android.view.View r1 = X.AnonymousClass0PN.A00(r10, r0)
            X.6dB r0 = new X.6dB
            r0.<init>(r9)
            r1.setOnTouchListener(r0)
            android.view.View r0 = r9.A07
            if (r0 == 0) goto L_0x0147
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L_0x0147
            android.view.View r2 = r9.A07
            android.content.res.Resources r1 = X.C36341k9.A0F(r2)
            r0 = 2131165537(0x7f070161, float:1.7945294E38)
            float r0 = r1.getDimension(r0)
            r2.setElevation(r0)
            android.view.View r0 = r9.A07
            r0.setClipToOutline(r4)
            android.view.View r1 = r9.A07
            X.7oY r0 = new X.7oY
            r0.<init>(r9, r5)
            r1.setOutlineProvider(r0)
        L_0x0147:
            X.61I r0 = r9.A0d
            if (r0 == 0) goto L_0x014e
            r0.A00(r4)
        L_0x014e:
            if (r3 == 0) goto L_0x0159
            X.1NF r2 = r9.A0S
            java.lang.String r1 = r3.callId
            java.lang.String r0 = "voip_call_control_bottom_sheet_onshown"
            r2.A03(r1, r0)
        L_0x0159:
            return
        L_0x015a:
            X.185 r0 = r9.A0V
            boolean r0 = X.AnonymousClass3UL.A09(r0, r3)
            if (r0 == 0) goto L_0x010f
            goto L_0x010a
        L_0x0163:
            X.185 r0 = r9.A0V
            boolean r0 = X.AnonymousClass3UL.A09(r0, r3)
            if (r0 == 0) goto L_0x006c
            X.0yC r0 = r9.A0Y
            boolean r0 = X.C34681hT.A0G(r0)
            if (r0 == 0) goto L_0x006c
            X.0wU r1 = r9.A0c
            r0 = 20
            X.C1498172w.A02(r1, r9, r3, r0)
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A1i(android.content.DialogInterface):void");
    }

    public void A1j(boolean z) {
        AnonymousClass1RJ r1 = this.A0a;
        if (r1 != null) {
            if (z) {
                r1.A03(0);
            } else {
                r1.A03(8);
                StringBuilder A0i2 = C90524aI.A0i("");
                this.A0e = A0i2;
                TextView textView = this.A0D;
                if (textView != null) {
                    textView.setText(A0i2);
                    this.A0D.setVisibility(8);
                }
            }
            AnonymousClass6X3 r0 = this.A0L;
            if (r0 != null) {
                r0.A07 = z;
                r0.A04();
                r0.A05();
            }
        }
    }

    public boolean A1k() {
        AnonymousClass6X3 r0;
        if (!this.A0i || (r0 = this.A0L) == null || !r0.A07()) {
            return false;
        }
        return true;
    }

    public boolean A1l() {
        AnonymousClass6X3 r1;
        int i;
        if (!this.A0i || (r1 = this.A0L) == null) {
            return false;
        }
        if (r1.A06 || (i = r1.A01) == 0) {
            i = r1.A0G.A0J;
        }
        if (i == 2 || i == 1) {
            return true;
        }
        return false;
    }

    public static void A0B(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2, int i) {
        NetworkInfo networkInfo;
        CallInfo A052 = A05(voipCallControlBottomSheetV2);
        if (A052 == null || voipCallControlBottomSheetV2.A0d == null || voipCallControlBottomSheetV2.A1D() == null) {
            Log.w("voip/VoipCallControlBottomSheetV2/failed to get call info when build call action intent");
            return;
        }
        boolean A1R = C90484aE.A1R(voipCallControlBottomSheetV2.A0d.A00, C114145gi.A07);
        Intent intent = null;
        if (i != 0) {
            if (i != 1) {
                Context A1D = voipCallControlBottomSheetV2.A1D();
                intent = C36431kI.A0D();
                String packageName = A1D.getPackageName();
                if (i != 2) {
                    intent.setClassName(packageName, "com.whatsapp.voipcalling.VoipActivityV2");
                    intent.setAction(C114145gi.A08);
                } else {
                    intent.setClassName(packageName, "com.whatsapp.voipcalling.VoipActivityV2");
                    intent.setAction(C114145gi.A03);
                    intent.putExtra("isTaskRoot", false);
                }
            } else {
                Context A1D2 = voipCallControlBottomSheetV2.A1D();
                String str = A052.callId;
                intent = C36431kI.A0D();
                intent.setClassName(A1D2.getPackageName(), "com.whatsapp.voipcalling.VoipActivityV2");
                intent.setAction(C114145gi.A05);
                intent.putExtra("pendingCall", A1R);
                intent.putExtra("call_id", str);
            }
            intent.setFlags(268435456);
        } else {
            ConnectivityManager A0E2 = voipCallControlBottomSheetV2.A0W.A0E();
            if (A0E2 != null) {
                networkInfo = A0E2.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (A052.isCallFull()) {
                VoipErrorDialogFragment A053 = VoipErrorDialogFragment.A05(new AnonymousClass3FU(), 7);
                AnonymousClass01I A0h2 = voipCallControlBottomSheetV2.A0h();
                if (A0h2 != null) {
                    A053.A1f(A0h2.getSupportFragmentManager(), (String) null);
                }
            } else if (networkInfo == null) {
                VoipErrorDialogFragment A054 = VoipErrorDialogFragment.A05(new AnonymousClass3FU(), 3);
                AnonymousClass01I A0h3 = voipCallControlBottomSheetV2.A0h();
                if (A0h3 != null) {
                    A054.A1f(A0h3.getSupportFragmentManager(), (String) null);
                }
            } else {
                int i2 = 3;
                if (A1R) {
                    i2 = 10;
                }
                intent = C36441kJ.A0j().A1d(voipCallControlBottomSheetV2.A1D(), C114145gi.A00, A052.callId, i2, true);
            }
        }
        voipCallControlBottomSheetV2.A0X.A04(27, A052.callId, "joinable call");
        AnonymousClass01I A0h4 = voipCallControlBottomSheetV2.A0h();
        if (A0h4 != null && intent != null) {
            A0h4.startActivity(intent);
        }
    }

    public void A19() {
        super.A19();
        Log.i("voip/VoipCallControlBottomSheetV2 onDetach");
        this.A0i = false;
        if (this.A0F != null) {
            Log.i("voip/VoipCallControlBottomSheetV2 Setting adapter to null");
            this.A0F.setAdapter((AnonymousClass0CZ) null);
        }
        this.A0L = null;
        this.A07 = null;
        this.A0d = null;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int A002;
        Resources.Theme theme = A1Z().getContext().getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.f4nameremoved, typedValue, true);
        this.A06 = typedValue.data;
        TypedValue typedValue2 = new TypedValue();
        theme.resolveAttribute(R.attr.f4nameremoved, typedValue2, true);
        this.A05 = typedValue2.data;
        TypedValue typedValue3 = new TypedValue();
        theme.resolveAttribute(R.attr.f4nameremoved, typedValue3, true);
        this.A01 = typedValue3.getFloat();
        TypedValue typedValue4 = new TypedValue();
        theme.resolveAttribute(R.attr.f4nameremoved, typedValue4, true);
        this.A04 = typedValue4.data;
        TypedValue typedValue5 = new TypedValue();
        theme.resolveAttribute(R.attr.f4nameremoved, typedValue5, true);
        this.A00 = typedValue5.getFloat();
        this.A0g = C36351kA.A02(A1Z().getContext(), A1Z().getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        C18740tg.A04(inflate);
        this.A0A = inflate;
        this.A09 = C012005e.A02(inflate, R.id.call_upgrade_row);
        if (this.A0Y.A0E(4229) && this.A0Y.A07(4067) >= 2) {
            AnonymousClass1RJ A0Y2 = C36341k9.A0Y(this.A0A, R.id.voip_dialpad_stub);
            this.A0a = A0Y2;
            this.A0b = C36341k9.A0Y(A0Y2.A01(), R.id.voip_dialpad);
            this.A0D = C36391kE.A0P(this.A0a.A01(), R.id.keypad_display);
            int[] iArr = this.A0j;
            int length = iArr.length;
            this.A0f = new DialpadButton[length];
            for (int i = 0; i < length; i++) {
                this.A0f[i] = this.A0a.A01().findViewById(iArr[i]);
                DialpadButton[] dialpadButtonArr = this.A0f;
                if (dialpadButtonArr[i] != null) {
                    C67143Yr.A00(dialpadButtonArr[i], this, i, 30);
                }
            }
        }
        Dialog dialog = this.A02;
        C18740tg.A06(dialog);
        dialog.setOnShowListener(new AnonymousClass5YM(this, 7));
        this.A02.setOnKeyListener(new C164717sG(this, 3));
        Window window = this.A02.getWindow();
        if (window != null) {
            window.addFlags(524288);
            window.setDimAmount(0.0f);
            if (C90504aG.A1V(this.A0W)) {
                window.addFlags(8);
            }
            CallInfo A052 = A05(this);
            window.setStatusBarColor(AnonymousClass00F.A00(this.A02.getContext(), R.color.f6nameremoved));
            if (A052 == null || !A052.videoEnabled) {
                A002 = AnonymousClass00F.A00(this.A02.getContext(), R.color.f6nameremoved);
            } else {
                A002 = this.A0g;
            }
            window.setNavigationBarColor(A002);
        }
        this.A0F = C90504aG.A0J(this.A0A, R.id.participant_list);
        this.A0E = (NestedScrollView) C012005e.A02(this.A0A, R.id.participant_list_nested_scroll_view);
        C011504z.A06(this.A0F, 2);
        RecyclerView recyclerView = this.A0F;
        A1D();
        C36351kA.A1F(recyclerView, 1);
        Log.i("voip/VoipCallControlBottomSheetV2 Setting adapter");
        this.A0F.setAdapter(this.A0M);
        C164757sK.A00(this.A0F.getViewTreeObserver(), this, 27);
        View.OnClickListener onClickListener = null;
        this.A0F.setItemAnimator((C02800By) null);
        this.A0C = (Space) C012005e.A02(this.A0A, R.id.call_controls_sheet_drag_indicator_space);
        VoipCallControlBottomSheetDragIndicator voipCallControlBottomSheetDragIndicator = (VoipCallControlBottomSheetDragIndicator) C012005e.A02(this.A0A, R.id.call_controls_sheet_drag_indicator);
        this.A0T = voipCallControlBottomSheetDragIndicator;
        voipCallControlBottomSheetDragIndicator.setOnClickListener(new C144236rr(this));
        CallInfo A053 = A05(this);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null && bundle2.getBoolean("is_incoming_capi_call", false) && C34681hT.A0G(this.A0Y)) {
            this.A0T.setVisibility(8);
        } else if (AnonymousClass3UL.A09(this.A0V, A053) && C34681hT.A0G(this.A0Y)) {
            C1498172w.A02(this.A0c, this, A053, 21);
        }
        View A022 = C012005e.A02(this.A09, R.id.upgrade_cancel);
        AnonymousClass61I r0 = this.A0d;
        if (r0 != null) {
            onClickListener = r0.A00.A08;
        }
        A022.setOnClickListener(onClickListener);
        AnonymousClass3UE.A06(A022, A0n(R.string.f12nameremoved), A0n(R.string.f12nameremoved));
        this.A0B = C36441kJ.A0T(this.A0A, R.id.call_controls_btns_container);
        this.A08 = C012005e.A02(this.A0A, R.id.call_control_buttons_guideline);
        this.A0B.setFocusable(true);
        this.A0B.setTag(0);
        this.A0A.setVisibility(8);
        this.A0h = C36341k9.A0X(this.A0A, R.id.call_details_additional_info_stub);
        return this.A0A;
    }

    public void A1O(Context context) {
        super.A1O(context);
        Log.i("voip/VoipCallControlBottomSheetV2 onAttach");
        try {
            this.A02 = (float) ViewConfiguration.get(context).getScaledTouchSlop();
            VoipActivityV2 voipActivityV2 = (VoipActivityV2) ((AnonymousClass7dG) context);
            AnonymousClass61I r0 = voipActivityV2.A1Z;
            if (r0 == null) {
                r0 = new AnonymousClass61I(voipActivityV2);
                voipActivityV2.A1Z = r0;
            }
            this.A0d = r0;
            AnonymousClass016 r2 = (AnonymousClass016) context;
            ParticipantsListViewModel participantsListViewModel = (ParticipantsListViewModel) C36441kJ.A0b(r2).A00(ParticipantsListViewModel.class);
            this.A0P = participantsListViewModel;
            participantsListViewModel.A00 = this.A0d;
            this.A0N = (BottomSheetViewModel) C36441kJ.A0b(r2).A00(BottomSheetViewModel.class);
            this.A0O = (CallControlButtonsViewModel) C36441kJ.A0b(r2).A00(CallControlButtonsViewModel.class);
            C95894mS r1 = this.A0M;
            r1.A09 = new C117955n6(this);
            r1.A01 = this.A0P;
            CallInfo A052 = A05(this);
            if (A052 != null) {
                this.A0S.A03(A052.callId, "voip_call_control_bottom_sheet_onattach");
            }
        } catch (ClassCastException unused) {
            throw new ClassCastException(AnonymousClass000.A0q(" must implement VoipCallControlBottomSheet$HostProvider", C36381kD.A11(context)));
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        Bundle bundle2 = this.A0A;
        C18740tg.A0D(AnonymousClass000.A1V(bundle2), "Arguments must not be null");
        if (bundle2 != null) {
            boolean z = bundle2.getBoolean("is_video_call", false);
            int i = R.style.f13nameremoved;
            if (z) {
                i = R.style.f13nameremoved;
            }
            A1d(0, i);
        }
    }
}
