package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.facebook.android.exoplayer2.ui.SubtitleView;
import com.whatsapp.R;

/* renamed from: X.5NU  reason: invalid class name */
public final class AnonymousClass5NU extends AnonymousClass5NJ {
    public C204359ps A00;
    public boolean A01;
    public Surface A02;
    public SurfaceHolder A03;
    public TextureView A04;
    public boolean A05;
    public final SubtitleView A06;
    public final AnonymousClass17Y A07;
    public final C141056mb A08;

    public static void A00(Surface surface, AnonymousClass5NU r3, boolean z) {
        C204359ps r0 = r3.A00;
        if (r0 != null) {
            r0.A0I(surface);
        }
        Surface surface2 = r3.A02;
        if (!(surface2 == null || surface2 == surface || !r3.A05)) {
            surface2.release();
        }
        r3.A02 = surface;
        r3.A05 = z;
    }

    public static void A01(AnonymousClass5NU r3) {
        TextureView textureView = r3.A04;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != r3.A08) {
                Log.d("HeroPlayerView", "SurfaceTextureListener already unset or replaced.");
            } else {
                r3.A04.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            r3.A04 = null;
        }
        SurfaceHolder surfaceHolder = r3.A03;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(r3.A08);
            r3.A03 = null;
        }
    }

    public void setCaptionsEnabled(boolean z) {
        this.A06.setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    public void setPlayer(C204359ps r5) {
        C204359ps r0 = this.A00;
        if (r0 != null) {
            AnonymousClass000.A14(r0.A0C, this.A08, 45);
            this.A00.A0I((Surface) null);
        }
        this.A00 = r5;
        if (r5 != null) {
            boolean z = this.A09;
            View view = this.A07;
            if (z) {
                setVideoSurfaceView((SurfaceView) view);
            } else {
                setVideoTextureView((TextureView) view);
            }
            AnonymousClass000.A14(r5.A0C, this.A08, 44);
            AnonymousClass5NI r02 = this.A02;
            if (r02 != null) {
                r02.setPlayer(r5);
            }
        } else {
            this.A06.setVisibility(0);
        }
        this.A04 = false;
    }

    public void setVideoSurfaceView(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        setVideoSurfaceHolder(holder);
    }

    public AnonymousClass5NU(Context context, AnonymousClass17Y r5, boolean z) {
        super(context, z);
        float f;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A08 = new C141056mb(this);
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.subtitles);
        this.A06 = subtitleView;
        subtitleView.A00();
        if (!subtitleView.isInEditMode()) {
            f = C90514aH.A0S(subtitleView).getFontScale();
        } else {
            f = 1.0f;
        }
        float f2 = f * 0.0533f;
        if (subtitleView.A00 != f2) {
            subtitleView.A00 = f2;
            subtitleView.invalidate();
        }
        this.A07 = r5;
    }

    public void A02(AnonymousClass5NI r3, boolean z) {
        C204359ps r0;
        super.A02(r3, z);
        AnonymousClass5NI r1 = this.A02;
        if (r1 != null && (r0 = this.A00) != null) {
            r1.setPlayer(r0);
        }
    }

    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        A01(this);
        this.A03 = surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this.A08);
            Surface surface = surfaceHolder.getSurface();
            if (surface != null && surface.isValid()) {
                A00(surface, this, false);
                return;
            }
        }
        A00((Surface) null, this, false);
    }

    public void setVideoTextureView(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        A01(this);
        this.A04 = textureView;
        Surface surface = null;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != null) {
                Log.w("HeroPlayerView", "Replacing existing SurfaceTextureListener.");
            }
            textureView.setSurfaceTextureListener(this.A08);
            if (textureView.isAvailable() && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                surface = new Surface(surfaceTexture);
            }
        }
        A00(surface, this, true);
    }
}
