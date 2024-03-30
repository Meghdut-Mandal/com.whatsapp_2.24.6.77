package X;

import android.content.Context;
import android.view.View;
import java.io.File;

/* renamed from: X.A0i  reason: case insensitive filesystem */
public class C20951A0i implements C23114B5t {
    public final B3M A00;

    public static void A00(C20951A0i a0i) {
        a0i.B9y(B5c.A00);
    }

    public void B1R(String str) {
        this.A00.B1R(str);
    }

    public View B9J(Context context) {
        View view;
        C1690683c r1 = (C1690683c) ((C23108B5n) this.A00.B9y(C23108B5n.A00));
        synchronized (r1) {
            if (r1.A07 != null) {
                view = r1.A07;
            } else {
                throw AnonymousClass001.A09("Preview view is null when invoking getPreviewView()");
            }
        }
        return view;
    }

    public C23113B5s B9y(C1691688a r2) {
        return this.A00.B9y(r2);
    }

    public C22876AxX B9z(AnonymousClass94T r2) {
        return this.A00.B9z(r2);
    }

    public boolean BLR(C1691688a r2) {
        return this.A00.BLR(r2);
    }

    public boolean BLS(AnonymousClass94T r2) {
        return this.A00.BLS(r2);
    }

    public boolean BMy() {
        B9y(B5f.A00);
        throw AnonymousClass001.A0A("isRecordingVideo");
    }

    public void Bok() {
        this.A00.Bok();
    }

    public void Buz(AnonymousClass9EN r2, File file) {
        B1R("LiteCameraController must be initialized before taking video.");
        B9y(B5f.A00);
        throw AnonymousClass001.A0A("startVideoRecording");
    }

    public void Bv9() {
        B1R("LiteCameraController must be initialized when stop recording.");
        B9y(B5f.A00);
        throw AnonymousClass001.A0A("stopVideoRecording");
    }

    public void BvB(boolean z) {
        B1R("LiteCameraController must be initialized when stop recording.");
        B9y(B5f.A00);
        throw AnonymousClass001.A0A("stopVideoRecordingSync");
    }

    public void BvU(AnonymousClass9GN r2, AnonymousClass9HW r3) {
        B1R("LiteCameraController must be initialized before taking photo.");
        B9y(B5e.A00);
        throw AnonymousClass001.A0A("takePhoto");
    }

    public void destroy() {
        this.A00.destroy();
    }

    public void pause() {
        this.A00.pause();
    }

    public C20951A0i(B3M b3m) {
        this.A00 = b3m;
        AnonymousClass94T r1 = C23112B5r.A00;
        if (b3m.BLS(r1)) {
            B9z(r1);
        }
    }

    public void B0K(C23063B2m b2m) {
        A00(this);
        throw AnonymousClass001.A0A("addCameraStateListener");
    }

    public void B7T(int i, int i2) {
        A00(this);
        throw AnonymousClass001.A0A("focus");
    }

    public int B9I() {
        A00(this);
        throw AnonymousClass001.A0A("getCameraFacing");
    }

    public int BDw() {
        A00(this);
        throw AnonymousClass001.A0A("getMaxZoomLevel");
    }

    public int BJN() {
        A00(this);
        throw AnonymousClass001.A0A("getZoomRatio");
    }

    public boolean BLp(int i) {
        A00(this);
        throw AnonymousClass001.A0A("isFlashModeSupported");
    }

    public boolean BNQ() {
        A00(this);
        throw AnonymousClass001.A0A("isSwitchCameraFacingSupported");
    }

    public boolean BNa() {
        A00(this);
        throw AnonymousClass001.A0A("isUsingCamera2");
    }

    public void Bnk(C23063B2m b2m) {
        A00(this);
        throw AnonymousClass001.A0A("removeCameraStateListener");
    }

    public void Bq7(boolean z) {
        A00(this);
        throw AnonymousClass001.A0A("setAlwaysOnPreviewFramesEnabled");
    }

    public void Bqt(int i) {
        A00(this);
        throw AnonymousClass001.A0A("setFlashMode");
    }

    public void Bqx(AnonymousClass9EO r2) {
        A00(this);
        throw AnonymousClass001.A0A("setFocusStateListener");
    }

    public void Br3(int i) {
        A00(this);
        throw AnonymousClass001.A0A("setInitialCameraFacing");
    }

    public void BrY(boolean z) {
        A00(this);
        throw AnonymousClass001.A0A("setPinchZoomEnabled");
    }

    public void Bri(C157737eb r2) {
        A00(this);
        throw AnonymousClass001.A0A("setPreviewFrameListener");
    }

    public void Brj(int i) {
        A00(this);
        throw AnonymousClass001.A0A("setPreviewQualityLevel");
    }

    public void Brk(C157747ec r2) {
        A00(this);
        throw AnonymousClass001.A0A("setPreviewRenderingStartedListener");
    }

    public void BsG(C203089nH r2) {
        A00(this);
        throw AnonymousClass001.A0A("setSizeSetter");
    }

    public void Bsp(int i) {
        A00(this);
        throw AnonymousClass001.A0A("setZoomLevel");
    }

    public void BvR() {
        A00(this);
        throw AnonymousClass001.A0A("switchCameraFacing");
    }
}
