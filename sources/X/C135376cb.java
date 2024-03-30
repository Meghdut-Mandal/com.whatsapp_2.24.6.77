package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.6cb  reason: invalid class name and case insensitive filesystem */
public final class C135376cb implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ AnonymousClass6E3 A00;

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AnonymousClass00C.A0D(surfaceTexture, 0);
        AnonymousClass6E3 r0 = this.A00;
        Surface surface = new Surface(surfaceTexture);
        r0.A01 = surface;
        C204359ps r02 = r0.A02;
        if (r02 != null) {
            r02.A0I(surface);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AnonymousClass00C.A0D(surfaceTexture, 0);
        AnonymousClass6E3 r2 = this.A00;
        C204359ps r1 = r2.A02;
        if (r1 != null) {
            r1.A0I((Surface) null);
        }
        Surface surface = r2.A01;
        if (surface != null) {
            surface.release();
        }
        surfaceTexture.release();
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public C135376cb(AnonymousClass6E3 r1) {
        this.A00 = r1;
    }
}
