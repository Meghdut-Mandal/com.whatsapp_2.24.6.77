package X;

import android.graphics.SurfaceTexture;
import java.util.Objects;

/* renamed from: X.6lC  reason: invalid class name and case insensitive filesystem */
public class C140196lC implements B3C {
    public int A00;
    public final SurfaceTexture.OnFrameAvailableListener A01 = new C163097pe(this, 1);
    public volatile SurfaceTexture A02;
    public volatile C157787eg A03;

    public void Bj2() {
        this.A00 = 0;
    }

    public long BIL() {
        SurfaceTexture surfaceTexture = this.A02;
        Objects.requireNonNull(surfaceTexture);
        return surfaceTexture.getTimestamp();
    }

    public void BIa(float[] fArr) {
        SurfaceTexture surfaceTexture = this.A02;
        Objects.requireNonNull(surfaceTexture);
        surfaceTexture.getTransformMatrix(fArr);
    }

    public void Bx2() {
        SurfaceTexture surfaceTexture = this.A02;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public void Bj1(int i) {
        this.A00 = i;
    }

    public void BrL(C157787eg r1) {
        this.A03 = r1;
    }
}
