package X;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.List;
import java.util.Objects;

/* renamed from: X.83c  reason: invalid class name and case insensitive filesystem */
public class C1690683c extends C20970A1g implements C23108B5n, B4A {
    public final int A00;
    public final SurfaceHolder.Callback A01 = new C207319uu(this);
    public final TextureView.SurfaceTextureListener A02 = new C207329uv(this);
    public final AnonymousClass9VB A03 = new AnonymousClass9VB();
    public final int A04;
    public volatile int A05;
    public volatile int A06;
    public volatile View A07;
    public volatile C199559fW A08;

    public static synchronized void A00(C1690683c r3) {
        synchronized (r3) {
            View view = r3.A07;
            r3.A07 = null;
            if (view instanceof TextureView) {
                ((TextureView) view).setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            } else if (view instanceof SurfaceView) {
                ((SurfaceView) view).getHolder().removeCallback(r3.A01);
            }
            C199559fW r0 = r3.A08;
            r3.A08 = null;
            if (r0 != null) {
                A02(r3, r0);
                r0.A01();
            }
        }
    }

    public synchronized void Brl(SurfaceTexture surfaceTexture, int i, int i2) {
        C199559fW r3 = this.A08;
        if (r3 != null) {
            if (r3.A05 != surfaceTexture) {
                this.A07 = null;
                this.A08 = null;
                this.A06 = 0;
                this.A05 = 0;
                A02(this, r3);
                r3.A01();
            }
            this.A06 = i;
            this.A05 = i2;
            A03(this, r3, i, i2);
        }
        if (surfaceTexture != null) {
            r3 = new C199559fW(surfaceTexture);
            r3.A03 = this.A04;
            r3.A01 = this.A00;
            this.A08 = r3;
            A01(this, r3);
            this.A06 = i;
            this.A05 = i2;
            A03(this, r3, i, i2);
        }
    }

    public synchronized void Brm(Surface surface, int i, int i2) {
        C199559fW r1 = this.A08;
        if (r1 != null) {
            if (r1.A00() != surface) {
                r1.A01();
            }
            this.A06 = i;
            this.A05 = i2;
            A03(this, r1, i, i2);
        }
        Objects.requireNonNull(surface);
        r1 = new C199559fW(surface, false);
        r1.A03 = this.A04;
        r1.A01 = this.A00;
        this.A08 = r1;
        A01(this, r1);
        this.A06 = i;
        this.A05 = i2;
        A03(this, r1, i, i2);
    }

    public synchronized void Brn(View view) {
        if (this.A07 != view) {
            A00(this);
            this.A07 = view;
            for (B2o BdZ : this.A03.A00) {
                BdZ.BdZ(this.A07);
            }
            if (view instanceof SurfaceView) {
                SurfaceView surfaceView = (SurfaceView) view;
                SurfaceHolder holder = surfaceView.getHolder();
                SurfaceHolder.Callback callback = this.A01;
                holder.addCallback(callback);
                SurfaceHolder holder2 = surfaceView.getHolder();
                if (holder2.getSurface() != null && holder2.getSurface().isValid()) {
                    callback.surfaceCreated(holder2);
                    Rect surfaceFrame = holder2.getSurfaceFrame();
                    Objects.requireNonNull(surfaceFrame);
                    int i = surfaceFrame.right - surfaceFrame.left;
                    int i2 = surfaceFrame.bottom - surfaceFrame.top;
                    if (i > 0 && i2 > 0) {
                        callback.surfaceChanged(holder2, -1, i, i2);
                    }
                }
            } else if (view instanceof TextureView) {
                TextureView textureView = (TextureView) view;
                TextureView.SurfaceTextureListener surfaceTextureListener = this.A02;
                textureView.setSurfaceTextureListener(surfaceTextureListener);
                SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                if (surfaceTexture != null && width > 0 && height > 0) {
                    surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, width, height);
                }
            }
        }
    }

    public static void A01(C1690683c r3, C199559fW r4) {
        List list = r3.A03.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((B2o) list.get(i)).BdV(r4);
        }
    }

    public static void A02(C1690683c r3, C199559fW r4) {
        List list = r3.A03.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((B2o) list.get(i)).BdW(r4);
        }
    }

    public static void A03(C1690683c r3, C199559fW r4, int i, int i2) {
        List list = r3.A03.A00;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((B2o) list.get(i3)).BdX(r4, i, i2);
        }
    }

    public void B0h(B2o b2o) {
        if (this.A03.A01(b2o)) {
            if (this.A07 != null) {
                b2o.BdZ(this.A07);
            }
            C199559fW r2 = this.A08;
            if (r2 != null) {
                b2o.BdV(r2);
                int i = this.A06;
                int i2 = this.A05;
                if (i > 0 && i2 > 0) {
                    b2o.BdX(r2, i, i2);
                }
            }
        }
    }

    public C1690683c(B3B b3b) {
        super(b3b);
        AnonymousClass94Q r0 = B4A.A01;
        Integer A0m = C36381kD.A0m();
        this.A04 = AnonymousClass000.A0I(A04(r0, A0m));
        this.A00 = AnonymousClass000.A0I(A04(B4A.A00, A0m));
        AnonymousClass94Q r02 = C190869Aq.A02;
        B3B b3b2 = this.A00;
        Objects.requireNonNull(b3b2);
        View view = (View) b3b2.BA0(r02);
        if (view == null) {
            AnonymousClass94Q r03 = C190869Aq.A01;
            Objects.requireNonNull(b3b2);
            view = (View) b3b2.BA0(r03);
        }
        Brn(view);
    }

    public C1691688a BDJ() {
        return C23108B5n.A00;
    }
}
