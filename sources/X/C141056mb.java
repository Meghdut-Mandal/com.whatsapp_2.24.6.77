package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.6mb  reason: invalid class name and case insensitive filesystem */
public final class C141056mb implements B3J, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ AnonymousClass5NU A00;

    public void Bcl() {
    }

    public void Bcr(AnonymousClass927 r1, AnonymousClass902 r2) {
    }

    public void Bcy(int i) {
    }

    public void Bj7(Timeline timeline, Object obj, int i) {
    }

    public void BjP(C206419tN r1, C195269Tk r2) {
    }

    public void Bkc(AnonymousClass902 r1, String str) {
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public C141056mb(AnonymousClass5NU r1) {
        this.A00 = r1;
    }

    public void Bct(int i, boolean z, boolean z2) {
        this.A00.A07.A0H(new C1502174k(this, i, 1, z));
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AnonymousClass5NU.A00(new Surface(surfaceTexture), this.A00, true);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AnonymousClass5NU.A00((Surface) null, this.A00, true);
        return true;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        AnonymousClass5NU.A00(surfaceHolder.getSurface(), this.A00, false);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AnonymousClass5NU.A00((Surface) null, this.A00, false);
    }
}
