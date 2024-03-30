package X;

import android.content.Context;
import android.view.ViewStub;
import com.whatsapp.glasses.layouts.SupToggle;

/* renamed from: X.6ro  reason: invalid class name and case insensitive filesystem */
public final class C144206ro implements AnonymousClass7gG {
    public AnonymousClass6YM A00;
    public final Context A01;
    public final ViewStub A02;
    public final AnonymousClass01z A03;
    public final AnonymousClass17Y A04;
    public final C27631Pa A05;
    public final AnonymousClass1PW A06;
    public final C20810yC A07;
    public final C117275lz A08;
    public final C147076wd A09;
    public final C006302t A0A;
    public final C006302t A0B;
    public final C20830yE A0C;
    public final C19770wU A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r2 == com.whatsapp.voipcalling.CallState.CONNECTED_LONELY) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(com.whatsapp.voipcalling.CallInfo r3) {
        /*
            com.whatsapp.voipcalling.CallState r2 = r3.callState
            X.AnonymousClass00C.A08(r2)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 == r0) goto L_0x000e
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            r0 = 0
            if (r2 != r1) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            r2 = 0
            if (r0 == 0) goto L_0x0027
            boolean r0 = r3.callEnding
            if (r0 != 0) goto L_0x0027
            X.6EE r0 = r3.getDefaultPeerInfo()
            r1 = 1
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.A09
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "VoipGlassesManager.kt Video state is not possible because audio video switch is not enabled for the peer."
        L_0x0023:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x0027:
            java.lang.String r0 = "VoipGlassesManager.kt Video State is not possible because call is not active."
            goto L_0x0023
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144206ro.A00(com.whatsapp.voipcalling.CallInfo):boolean");
    }

    public final void A01() {
        AnonymousClass3FS r1;
        C203169nR r0 = C108915Vl.A00;
        if (r0 != null) {
            r1 = r0.A02;
        } else {
            r1 = null;
        }
        boolean A0J = AnonymousClass00C.A0J(r1, AnonymousClass21D.A00);
        C203169nR r02 = C108915Vl.A00;
        if (A0J) {
            if (r02 != null) {
                r02.A08();
            }
        } else if (r02 != null) {
            r02.A06();
        }
    }

    public final void A02(float f) {
        C147076wd r5 = this.A09;
        float A012 = C15040mb.A01(f, -1.0f, 0.0f);
        SupToggle supToggle = r5.A05;
        if (supToggle != null) {
            supToggle.setTranslationX((-A012) * ((float) (supToggle.A04.getWidth() + r5.A01)));
        }
        if (f == -1.0f) {
            r5.A0B = false;
            C36331k8.A0y(r5.A05);
        } else if (!r5.A0B) {
            r5.A0B = true;
            SupToggle supToggle2 = r5.A05;
            if (supToggle2 != null) {
                supToggle2.setVisibility(0);
            }
        }
    }

    public void BgL(AnonymousClass6YM r3) {
        AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type com.whatsapp.calling.service.VoiceService");
        this.A00 = r3;
        C1501574e.A01(this.A0D, this, 18);
    }

    public C144206ro(Context context, ViewStub viewStub, AnonymousClass01z r3, AnonymousClass17Y r4, C27631Pa r5, AnonymousClass1PW r6, C20830yE r7, C20810yC r8, C117275lz r9, C147076wd r10, C19770wU r11, C006302t r12, C006302t r13) {
        C36321k7.A1B(r8, r7, r10, r6, r9);
        C36321k7.A13(r11, r4, r5);
        C36361kB.A1K(viewStub, r3);
        this.A07 = r8;
        this.A0C = r7;
        this.A09 = r10;
        this.A06 = r6;
        this.A08 = r9;
        this.A0D = r11;
        this.A04 = r4;
        this.A05 = r5;
        this.A01 = context;
        this.A02 = viewStub;
        this.A03 = r3;
        this.A0A = r12;
        this.A0B = r13;
        r6.A01(this);
    }
}
