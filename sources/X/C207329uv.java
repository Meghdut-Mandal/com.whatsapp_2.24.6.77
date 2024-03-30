package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* renamed from: X.9uv  reason: invalid class name and case insensitive filesystem */
public class C207329uv implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C1690683c A00;

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public C207329uv(C1690683c r1) {
        this.A00 = r1;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C1690683c r2 = this.A00;
        C199559fW r1 = r2.A08;
        r2.A08 = null;
        if (r1 != null) {
            r1.A01();
        }
        C199559fW r12 = new C199559fW(surfaceTexture);
        r12.A01 = r2.A00;
        r2.A08 = r12;
        r2.A06 = i;
        r2.A05 = i2;
        C1690683c.A01(r2, r12);
        C1690683c.A03(r2, r12, i, i2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1690683c r3 = this.A00;
        C199559fW r2 = r3.A08;
        if (r2 != null && r2.A05 == surfaceTexture) {
            r3.A08 = null;
            r3.A06 = 0;
            r3.A05 = 0;
            C1690683c.A02(r3, r2);
            r2.A01();
        }
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C1690683c r2 = this.A00;
        C199559fW r1 = r2.A08;
        if (r1 != null && r1.A05 == surfaceTexture) {
            r2.A06 = i;
            r2.A05 = i2;
            C1690683c.A03(r2, r1, i, i2);
        }
    }
}
