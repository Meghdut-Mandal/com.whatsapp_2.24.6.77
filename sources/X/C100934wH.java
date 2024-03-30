package X;

import com.whatsapp.camera.CameraActivity;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

/* renamed from: X.4wH  reason: invalid class name and case insensitive filesystem */
public abstract class C100934wH extends AnonymousClass155 {
    public boolean A00 = false;

    public static void A01(C27111My r1, C18800tq r2, C18830tt r3, CameraActivity cameraActivity) {
        cameraActivity.A01 = (AnonymousClass16L) r2.A0q.get();
        cameraActivity.A08 = (AnonymousClass1XS) r2.A3U.get();
        cameraActivity.A07 = C18800tq.A8t(r2);
        cameraActivity.A03 = (C125075zH) r1.A0K.get();
        cameraActivity.A0B = C27111My.A36(r1);
        cameraActivity.A0A = (AnonymousClass1JD) r3.A5x.get();
        cameraActivity.A00 = (C29411Wn) r2.A9H.get();
        cameraActivity.A09 = (WhatsAppLibLoader) r2.A9W.get();
        cameraActivity.A06 = (AnonymousClass12P) r2.A5G.get();
    }

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            CameraActivity cameraActivity = (CameraActivity) this;
            C27111My r4 = (C27111My) C36421kH.A0H(this);
            C18800tq r2 = r4.A5g;
            C90464aC.A11(r2, cameraActivity);
            C18830tt r1 = r2.A00;
            C90464aC.A0y(r2, r1, cameraActivity, C36321k7.A05(r2, r1, cameraActivity));
            A01(r4, r2, r1, cameraActivity);
            cameraActivity.A05 = C36351kA.A0X(r2);
            cameraActivity.A0D = C90504aG.A0V(r2);
            cameraActivity.A0C = (C1264664c) r2.AG5.get();
            cameraActivity.A0E = (C1270866x) r1.A9g.get();
            cameraActivity.A04 = C90474aD.A0R(r1);
            cameraActivity.A0F = C18840tu.A00(r4.A3N);
        }
    }

    public C100934wH() {
        C163027pX.A00(this, 24);
    }
}
