package com.whatsapp.calling.screenshare;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass0YW;
import X.AnonymousClass1PV;
import X.AnonymousClass1PW;
import X.AnonymousClass2ZH;
import X.AnonymousClass6EE;
import X.AnonymousClass711;
import X.C005502l;
import X.C007403e;
import X.C009804d;
import X.C009904e;
import X.C023509x;
import X.C105545Fb;
import X.C108065Sa;
import X.C108075Sb;
import X.C109325Xd;
import X.C131176Oa;
import X.C132636Up;
import X.C152477Kq;
import X.C157267cg;
import X.C19550w8;
import X.C19630wG;
import X.C19730wQ;
import X.C20810yC;
import X.C28201Rs;
import X.C30531aM;
import X.C34831hi;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C95504lc;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.concurrent.CancellationException;

public final class ScreenShareViewModel extends C95504lc implements AnonymousClass1PV, C157267cg {
    public Intent A00;
    public MediaProjection A01;
    public C009904e A02;
    public C108065Sa A03 = C108065Sa.STOPPED;
    public C007403e A04;
    public boolean A05;
    public final C19730wQ A06;
    public final C30531aM A07;
    public final C131176Oa A08;
    public final AnonymousClass1PW A09;
    public final AnonymousClass2ZH A0A;
    public final C19630wG A0B;
    public final C20810yC A0C;
    public final C34831hi A0D = C36441kJ.A0s(C36381kD.A0j());
    public final C28201Rs A0E = C36441kJ.A0t();
    public final C28201Rs A0F = C36441kJ.A0t();
    public final C28201Rs A0G = C36441kJ.A0t();
    public final AnonymousClass00T A0H = C36431kI.A1I(new C152477Kq(this));
    public final C105545Fb A0I;
    public final AnonymousClass711 A0J;
    public final VoipCameraManager A0K;
    public final C005502l A0L;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(android.content.Intent r3, com.whatsapp.calling.screenshare.ScreenShareViewModel r4) {
        /*
            r2 = 0
            if (r3 == 0) goto L_0x002d
            X.00T r0 = r4.A0H     // Catch:{ SecurityException -> 0x0013 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ SecurityException -> 0x0013 }
            android.media.projection.MediaProjectionManager r1 = (android.media.projection.MediaProjectionManager) r1     // Catch:{ SecurityException -> 0x0013 }
            if (r1 == 0) goto L_0x001c
            r0 = -1
            android.media.projection.MediaProjection r0 = r1.getMediaProjection(r0, r3)     // Catch:{ SecurityException -> 0x0013 }
            goto L_0x001d
        L_0x0013:
            r1 = move-exception
            java.lang.String r0 = "SecurityException thrown while FGService running"
            com.whatsapp.util.Log.w(r0, r1)
            A0C(r4)
        L_0x001c:
            r0 = r2
        L_0x001d:
            r4.A01 = r0
            if (r0 == 0) goto L_0x002d
            X.040 r1 = X.C109325Xd.A00(r4)
            com.whatsapp.calling.screenshare.ScreenShareViewModel$getMediaProjectionAndStartSharing$1$1$1 r0 = new com.whatsapp.calling.screenshare.ScreenShareViewModel$getMediaProjectionAndStartSharing$1$1$1
            r0.<init>(r4, r2)
            X.C36331k8.A1T(r0, r1)
        L_0x002d:
            r4.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.screenshare.ScreenShareViewModel.A08(android.content.Intent, com.whatsapp.calling.screenshare.ScreenShareViewModel):void");
    }

    public static final void A09(C009804d r4, ScreenShareViewModel screenShareViewModel) {
        int i = r4.A00;
        if (i == -1) {
            screenShareViewModel.A08.A0I = true;
            if (C19550w8.A0A()) {
                screenShareViewModel.A00 = r4.A01;
                screenShareViewModel.A0A.registerObserver(screenShareViewModel);
                Bundle A072 = AnonymousClass001.A07();
                A072.putBoolean("is_media_projection", true);
                screenShareViewModel.A09.A00(new C132636Up("refresh_notification", A072));
                C007403e r0 = screenShareViewModel.A04;
                if (r0 != null) {
                    r0.B2S((CancellationException) null);
                }
                screenShareViewModel.A04 = C36391kE.A12(new ScreenShareViewModel$tryStartScreenSharingAndroid14$1(screenShareViewModel, (C023509x) null), C109325Xd.A00(screenShareViewModel));
            } else if (!C19550w8.A06() || screenShareViewModel.A09.A03.get()) {
                A08(r4.A01, screenShareViewModel);
            } else {
                Log.i("ScreenShareViewModel Foreground service not running, unable to start screen sharing");
                C36341k9.A16(screenShareViewModel.A0E, 31);
                A0C(screenShareViewModel);
            }
            screenShareViewModel.A05 = false;
            return;
        }
        C36321k7.A1S("ScreenShareViewModel MediaProjection permission not granted: ", AnonymousClass000.A0u(), i);
        C36331k8.A1T(new ScreenShareViewModel$registerForActivityResult$1$1(screenShareViewModel, (C023509x) null), C109325Xd.A00(screenShareViewModel));
    }

    public static final void A0C(ScreenShareViewModel screenShareViewModel) {
        screenShareViewModel.A00 = null;
        screenShareViewModel.A08.A01(-13);
        C36341k9.A16(screenShareViewModel.A0E, 31);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(X.C108345Td r7, com.whatsapp.calling.screenshare.ScreenShareViewModel r8, X.C023509x r9) {
        /*
            boolean r0 = r9 instanceof X.C151557Aa
            if (r0 == 0) goto L_0x008a
            r5 = r9
            X.7Aa r5 = (X.C151557Aa) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008a
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x005c
            if (r0 != r3) goto L_0x0090
            java.lang.Object r7 = r5.L$1
            X.5Td r7 = (X.C108345Td) r7
            java.lang.Object r8 = r5.L$0
            com.whatsapp.calling.screenshare.ScreenShareViewModel r8 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r8
            X.AnonymousClass0AN.A00(r1)
        L_0x0028:
            int r6 = X.AnonymousClass000.A0I(r1)
            X.6Oa r5 = r8.A08
            if (r6 == 0) goto L_0x0031
            r3 = 0
        L_0x0031:
            X.6Ea r4 = r5.A0M
            r4.A00()
            if (r3 == 0) goto L_0x0042
            long r2 = r5.A0D
            long r0 = r4.A00
            long r0 = java.lang.Math.max(r2, r0)
            r5.A0D = r0
        L_0x0042:
            r4.A01()
            if (r6 == 0) goto L_0x0056
            r5.A01(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ScreenShareViewModel Failed to stop screen sharing: "
            X.C36321k7.A1S(r0, r1, r6)
            A0B(r8)
        L_0x0056:
            X.C108345Td.A00(r7, r5)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x005c:
            X.AnonymousClass0AN.A00(r1)
            X.6Oa r1 = r8.A08
            X.6Ea r0 = r1.A0M
            r0.A01()
            r0.A02()
            X.03e r1 = r1.A0G
            if (r1 == 0) goto L_0x0071
            r0 = 0
            r1.B2S(r0)
        L_0x0071:
            X.5Sa r0 = X.C108065Sa.STOPPING
            r8.A03 = r0
            X.02l r2 = r8.A0L
            r1 = 0
            com.whatsapp.calling.screenshare.ScreenShareViewModel$stopScreenSharing$res$1 r0 = new com.whatsapp.calling.screenshare.ScreenShareViewModel$stopScreenSharing$res$1
            r0.<init>(r8, r1)
            r5.L$0 = r8
            r5.L$1 = r7
            r5.label = r3
            java.lang.Object r1 = X.AnonymousClass0A2.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0028
            return r4
        L_0x008a:
            X.7Aa r5 = new X.7Aa
            r5.<init>(r8, r9)
            goto L_0x0012
        L_0x0090:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.screenshare.ScreenShareViewModel.A06(X.5Td, com.whatsapp.calling.screenshare.ScreenShareViewModel, X.09x):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A07(com.whatsapp.calling.screenshare.ScreenShareViewModel r6, X.C023509x r7) {
        /*
            boolean r0 = r7 instanceof X.AnonymousClass7A6
            if (r0 == 0) goto L_0x0095
            r5 = r7
            X.7A6 r5 = (X.AnonymousClass7A6) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0095
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0062
            if (r0 != r3) goto L_0x009c
            java.lang.Object r6 = r5.L$0
            com.whatsapp.calling.screenshare.ScreenShareViewModel r6 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r6
            X.AnonymousClass0AN.A00(r1)
        L_0x0024:
            int r2 = X.AnonymousClass000.A0I(r1)
            if (r2 == 0) goto L_0x0046
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ScreenShareViewModel Failed to start screen sharing: "
            X.C36321k7.A1S(r0, r1, r2)
            X.6Oa r0 = r6.A08
            r0.A01(r2)
            X.1Rs r1 = r6.A0E
            r0 = 31
            java.lang.Integer r0 = X.C90524aI.A0a(r0)
            r1.A0D(r0)
            A0B(r6)
        L_0x0046:
            X.6Oa r5 = r6.A08
            if (r2 == 0) goto L_0x004b
            r3 = 0
        L_0x004b:
            X.6Ea r4 = r5.A0L
            r4.A00()
            if (r3 == 0) goto L_0x005c
            long r2 = r5.A0C
            long r0 = r4.A00
            long r0 = java.lang.Math.max(r2, r0)
            r5.A0C = r0
        L_0x005c:
            r4.A01()
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0062:
            X.AnonymousClass0AN.A00(r1)
            X.6Oa r1 = r6.A08
            int r0 = r1.A06
            int r0 = r0 + 1
            r1.A06 = r0
            X.6Ea r0 = r1.A0L
            r0.A01()
            r0.A02()
            X.6Ea r0 = r1.A0O
            r0.A01()
            r0.A02()
            X.5Sa r0 = X.C108065Sa.STARTING
            A0A(r0, r6)
            X.02l r2 = r6.A0L
            r1 = 0
            com.whatsapp.calling.screenshare.ScreenShareViewModel$startScreenSharing$res$1 r0 = new com.whatsapp.calling.screenshare.ScreenShareViewModel$startScreenSharing$res$1
            r0.<init>(r6, r1)
            r5.L$0 = r6
            r5.label = r3
            java.lang.Object r1 = X.AnonymousClass0A2.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0095:
            X.7A6 r5 = new X.7A6
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x009c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.screenshare.ScreenShareViewModel.A07(com.whatsapp.calling.screenshare.ScreenShareViewModel, X.09x):java.lang.Object");
    }

    public static final void A0A(C108065Sa r2, ScreenShareViewModel screenShareViewModel) {
        boolean z;
        screenShareViewModel.A03 = r2;
        if (r2 == C108065Sa.STARTED || r2 == C108065Sa.STARTING) {
            z = true;
        } else if (r2 == C108065Sa.STOPPED) {
            z = false;
        } else {
            return;
        }
        Boolean valueOf = Boolean.valueOf(z);
        C34831hi r1 = screenShareViewModel.A0D;
        if (!AnonymousClass00C.A0J(valueOf, r1.A04())) {
            r1.A0D(valueOf);
        }
    }

    public static final void A0B(ScreenShareViewModel screenShareViewModel) {
        MediaProjection mediaProjection = screenShareViewModel.A01;
        if (mediaProjection != null) {
            mediaProjection.stop();
        }
        screenShareViewModel.A01 = null;
        screenShareViewModel.A0J.A06();
        A0A(C108065Sa.STOPPED, screenShareViewModel);
    }

    public void A0R() {
        this.A0K.setMediaProjectionProvider((C157267cg) null);
        this.A0I.unregisterObserver(this);
        this.A0A.unregisterObserver(this);
    }

    public void BhJ(boolean z) {
        if (z) {
            A08(this.A00, this);
        } else {
            A0C(this);
        }
        this.A0A.unregisterObserver(this);
        C007403e r1 = this.A04;
        if (r1 != null) {
            r1.B2S((CancellationException) null);
        }
        this.A04 = null;
    }

    public ScreenShareViewModel(C19730wQ r2, C30531aM r3, C105545Fb r4, C131176Oa r5, AnonymousClass1PW r6, AnonymousClass2ZH r7, AnonymousClass711 r8, C19630wG r9, C20810yC r10, VoipCameraManager voipCameraManager, C005502l r12) {
        C36321k7.A1B(r10, r2, r9, r3, r4);
        C36321k7.A1C(r8, r12, voipCameraManager, r6, r7);
        AnonymousClass00C.A0D(r5, 11);
        this.A0C = r10;
        this.A06 = r2;
        this.A0B = r9;
        this.A07 = r3;
        this.A0I = r4;
        this.A0J = r8;
        this.A0L = r12;
        this.A0K = voipCameraManager;
        this.A09 = r6;
        this.A0A = r7;
        this.A08 = r5;
        voipCameraManager.setMediaProjectionProvider(this);
        r4.registerObserver(this);
        AnonymousClass6EE r0 = r4.A05().A05;
        if (r0 != null && r0.A0I) {
            A0A(C108065Sa.STARTED, this);
        }
    }

    public final void A0S(C108075Sb r4) {
        C009904e r2;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ScreenShareViewModel toggleScreenSharing -- currentState: ");
        C36321k7.A1N(this.A03, A0u);
        int ordinal = this.A03.ordinal();
        if (ordinal == 0) {
            Log.i("ScreenShareViewModel tryStartScreenSharing");
            if (!C19550w8.A06() || this.A09.A03.get()) {
                MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) this.A0H.getValue();
                if (mediaProjectionManager != null && (r2 = this.A02) != null) {
                    Log.i("ScreenShareViewModel Requesting screen share permission");
                    r2.A01((AnonymousClass0YW) null, mediaProjectionManager.createScreenCaptureIntent());
                    this.A05 = true;
                    return;
                }
                return;
            }
            Log.i("ScreenShareViewModel Foreground service not running, unable to start screen sharing");
            C36341k9.A16(this.A0E, 31);
        } else if (ordinal == 3) {
            this.A08.A07++;
            C36331k8.A1T(new ScreenShareViewModel$toggleScreenSharing$1(r4, this, (C023509x) null), C109325Xd.A00(this));
        }
    }

    public void Bhv() {
    }
}
