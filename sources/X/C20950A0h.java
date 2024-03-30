package X;

import com.whatsapp.camera.litecamera.LiteCameraView;

/* renamed from: X.A0h  reason: case insensitive filesystem */
public class C20950A0h implements C23063B2m {
    public final /* synthetic */ LiteCameraView A00;

    public C20950A0h(LiteCameraView liteCameraView) {
        this.A00 = liteCameraView;
    }

    public void BSt(Exception exc) {
        LiteCameraView liteCameraView = this.A00;
        liteCameraView.A0K = false;
        if (!liteCameraView.A08) {
            liteCameraView.A08 = true;
            liteCameraView.pause();
            liteCameraView.Bok();
            return;
        }
        C160747lW r0 = liteCameraView.A00;
        if (r0 != null) {
            r0.BSu(exc, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSw() {
        /*
            r5 = this;
            com.whatsapp.camera.litecamera.LiteCameraView r4 = r5.A00
            r0 = 1
            r4.A0K = r0
            r0 = 0
            r4.A08 = r0
            boolean r0 = r4.BLt()
            if (r0 == 0) goto L_0x0051
            java.util.List r0 = r4.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = "off"
            java.lang.String r0 = "on"
            java.util.List r0 = X.C165597tg.A0s(r1, r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r4.A07 = r0
        L_0x0024:
            com.whatsapp.camera.litecamera.LiteCameraView.A01(r4)
        L_0x0027:
            java.util.List r1 = r4.getFlashModes()
            java.lang.String r0 = r4.A05
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "off"
            r4.A05 = r0
        L_0x0037:
            X.B5t r1 = r4.A0D
            java.lang.String r0 = r4.A05
            int r0 = com.whatsapp.camera.litecamera.LiteCameraView.A00(r0)
            r1.Bqt(r0)
            r0 = 3
            boolean r0 = r1.BLp(r0)
            r4.A0B = r0
            X.7lW r0 = r4.A00
            if (r0 == 0) goto L_0x0050
            r0.BdY()
        L_0x0050:
            return
        L_0x0051:
            java.util.List r0 = r4.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0027
            boolean r0 = r4.BLt()
            if (r0 != 0) goto L_0x008a
            r0 = 3
            java.util.ArrayList r3 = X.C36441kJ.A14(r0)
            java.lang.String r0 = "off"
            r3.add(r0)
            X.B5t r2 = r4.A0D
            java.lang.String r1 = "on"
            r0 = 1
            boolean r0 = r2.BLp(r0)
            if (r0 == 0) goto L_0x0077
            r3.add(r1)
        L_0x0077:
            java.lang.String r1 = "auto"
            r0 = 2
            boolean r0 = r2.BLp(r0)
            if (r0 == 0) goto L_0x0083
            r3.add(r1)
        L_0x0083:
            java.util.List r0 = java.util.Collections.unmodifiableList(r3)
            r4.A06 = r0
            goto L_0x0024
        L_0x008a:
            java.lang.String r0 = "Cannot create back camera flash list while in front camera"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20950A0h.BSw():void");
    }

    public void BSx(String str, String str2) {
        LiteCameraView liteCameraView = this.A00;
        liteCameraView.A0K = false;
        C160747lW r3 = liteCameraView.A00;
        if (r3 != null) {
            r3.BSu(new Exception("CameraCustomException: Camera error evicted"), 2);
        }
    }

    public void BSz() {
        LiteCameraView liteCameraView = this.A00;
        C36341k9.A0v(liteCameraView.A0C.edit(), "camera_facing", liteCameraView.A0D.B9I());
    }
}
