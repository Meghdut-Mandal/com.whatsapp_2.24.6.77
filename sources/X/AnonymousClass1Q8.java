package X;

import java.util.ArrayList;

/* renamed from: X.1Q8  reason: invalid class name */
public class AnonymousClass1Q8 implements AnonymousClass1Q7 {
    public C88814Ud A00;
    public AnonymousClass7gL A01;
    public boolean A02;
    public boolean A03;

    public int getBackgroundColorRes() {
        boolean z = false;
        if (this.A00 != null) {
            z = true;
        }
        C18740tg.A0D(z, "VoipReturnToCallBannerBridgeImpl/getBackgroudColor no banner when get background color");
        C88814Ud r0 = this.A00;
        if (r0 != null) {
            return r0.getBackgroundColorRes();
        }
        return 0;
    }

    public void setVisibilityChangeListener(AnonymousClass7gL r2) {
        this.A01 = r2;
        C88814Ud r0 = this.A00;
        if (r0 != null) {
            r0.setVisibilityChangeListener(r2);
        }
    }

    public static AnonymousClass6BK A00(C107265Nh r6) {
        ArrayList A0C = r6.A0C();
        boolean z = true;
        boolean z2 = false;
        if (r6.A08 == 2) {
            z2 = true;
        }
        boolean z3 = false;
        if (A0C.size() == 0) {
            z3 = true;
        }
        if (A0C.size() <= 2) {
            z = false;
        }
        return new AnonymousClass6BK(z2, z3, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.4em} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.calling.views.VoipReturnToCallBanner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.4fU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.whatsapp.calling.views.VoipReturnToCallBanner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.whatsapp.calling.views.VoipReturnToCallBanner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.whatsapp.calling.views.VoipReturnToCallBanner} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View B4b(X.AnonymousClass01L r4, X.C19730wQ r5, X.AnonymousClass6BK r6, X.C20810yC r7, X.AnonymousClass11F r8) {
        /*
            r3 = this;
            boolean r0 = r5.A0L()
            if (r0 != 0) goto L_0x0047
            r1 = 7179(0x1c0b, float:1.006E-41)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r7, r1)
            if (r0 == 0) goto L_0x0047
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.4fU r2 = new X.4fU
            r2.<init>(r4)
            X.04H r1 = new X.04H
            r1.<init>(r4)
            java.lang.Class<com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel> r0 = com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel.class
            X.04R r0 = r1.A00(r0)
            com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel r0 = (com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel) r0
            r2.A01 = r0
        L_0x0028:
            r3.A00 = r2
            if (r6 == 0) goto L_0x002f
            r2.setCallLogData(r6)
        L_0x002f:
            X.4Ud r1 = r3.A00
            if (r1 == 0) goto L_0x0046
            boolean r0 = r3.A02
            r1.setShouldHideBanner(r0)
            X.4Ud r1 = r3.A00
            boolean r0 = r3.A03
            r1.setShouldHideCallDuration(r0)
            X.4Ud r1 = r3.A00
            X.7gL r0 = r3.A01
            r1.setVisibilityChangeListener(r0)
        L_0x0046:
            return r2
        L_0x0047:
            boolean r0 = X.C34681hT.A0A(r5, r7)
            if (r0 == 0) goto L_0x006f
            X.04H r1 = new X.04H
            r1.<init>(r4)
            java.lang.Class<com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel> r0 = com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel.class
            X.04R r1 = r1.A00(r0)
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r1 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.4em r2 = new X.4em
            r2.<init>(r4)
            r2.setAudioChatViewModel(r1, r4)
            com.whatsapp.calling.views.VoipReturnToCallBanner r0 = r2.A06
            r0.A0E = r8
            goto L_0x0028
        L_0x006f:
            r0 = 0
            com.whatsapp.calling.views.VoipReturnToCallBanner r2 = new com.whatsapp.calling.views.VoipReturnToCallBanner
            r2.<init>(r4, r0)
            r2.A0E = r8
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Q8.B4b(X.01L, X.0wQ, X.6BK, X.0yC, X.11F):android.view.View");
    }
}
