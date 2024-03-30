package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.camera.VoipCameraManager;

/* renamed from: X.57e  reason: invalid class name and case insensitive filesystem */
public final class C1038357e extends AnonymousClass1DJ {
    public boolean A00;
    public final C30531aM A01;
    public final C27631Pa A02;
    public final C20810yC A03;
    public final AnonymousClass13J A04;
    public final VoipCameraManager A05;

    public void A01() {
        boolean BMU = this.A04.BMU();
        if (this.A00 != BMU) {
            C36321k7.A1X("ScreenShareABPropObserver isScreenSharingEnabled changed to ", AnonymousClass000.A0u(), BMU);
            this.A00 = BMU;
            if (this.A05.hasBeenQueriedByDriver.get()) {
                Log.i("ScreenShareABPropObserver refresh capture devs");
                Voip.refreshCaptureDevice();
            }
        }
        if (this.A03.A07(4536) == 0) {
            C27631Pa r2 = this.A02;
            C36341k9.A0u(C90474aD.A0F(r2), "ss_permission_dialog_show_count");
            C36341k9.A0u(C90474aD.A0F(r2), "as_permission_dialog_show_count");
        }
    }

    public C1038357e(C30531aM r2, C27631Pa r3, C20810yC r4, AnonymousClass13J r5, VoipCameraManager voipCameraManager) {
        C36321k7.A1B(r4, r2, r5, voipCameraManager, r3);
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = voipCameraManager;
        this.A02 = r3;
        this.A00 = r5.BMU();
    }
}
