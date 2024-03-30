package X;

import com.whatsapp.camera.CameraActivity;

/* renamed from: X.6rv  reason: invalid class name and case insensitive filesystem */
public class C144276rv implements C160007kJ {
    public final /* synthetic */ CameraActivity A00;

    public C144276rv(CameraActivity cameraActivity) {
        this.A00 = cameraActivity;
    }

    public int BEh() {
        return this.A00.getIntent().getIntExtra("camera_origin", 8);
    }

    public void BSr() {
        this.A00.finish();
    }

    public void BgC() {
        CameraActivity cameraActivity = this.A00;
        cameraActivity.setResult(-1);
        cameraActivity.finish();
    }
}
