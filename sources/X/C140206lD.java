package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.6lD  reason: invalid class name and case insensitive filesystem */
public class C140206lD implements B3C {
    public final SurfaceTexture.OnFrameAvailableListener A00 = new C163097pe(this, 0);
    public final Object A01 = C36441kJ.A11();
    public final boolean A02 = true;
    public volatile SurfaceTexture A03;
    public volatile C157787eg A04;
    public volatile int A05;

    public static SurfaceTexture A00(C140206lD r3) {
        SurfaceTexture surfaceTexture;
        SurfaceTexture surfaceTexture2 = r3.A03;
        if (surfaceTexture2 != null) {
            return surfaceTexture2;
        }
        synchronized (r3.A01) {
            surfaceTexture = r3.A03;
            int i = r3.A05;
            if (surfaceTexture == null) {
                surfaceTexture = new SurfaceTexture(i);
                r3.A03 = surfaceTexture;
            }
            if (i != 0 && r3.A02) {
                surfaceTexture.setOnFrameAvailableListener(r3.A00);
            }
        }
        return surfaceTexture;
    }

    public long BIL() {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            return surfaceTexture.getTimestamp();
        }
        return 0;
    }

    public void BIa(float[] fArr) {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(fArr);
        }
    }

    public void Bj1(int i) {
        this.A05 = i;
        if (i != 0) {
            SurfaceTexture surfaceTexture = this.A03;
            if (surfaceTexture != null) {
                surfaceTexture.detachFromGLContext();
                surfaceTexture.attachToGLContext(i);
                if (this.A02) {
                    surfaceTexture.setOnFrameAvailableListener(this.A00);
                }
                surfaceTexture.updateTexImage();
                return;
            }
            A00(this);
        }
    }

    public void Bj2() {
        if (this.A03 != null) {
            synchronized (this.A01) {
                SurfaceTexture surfaceTexture = this.A03;
                this.A03 = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
        }
        this.A05 = 0;
    }

    public void Bx2() {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public void BrL(C157787eg r1) {
        this.A04 = r1;
    }
}
