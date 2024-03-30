package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.5NJ  reason: invalid class name */
public abstract class AnonymousClass5NJ extends C92824ep {
    public int A00 = -1;
    public AnonymousClass6D2 A01;
    public AnonymousClass5NI A02;
    public String A03;
    public boolean A04 = false;
    public C1492070g A05;
    public final View A06;
    public final View A07;
    public final AspectRatioFrameLayout A08;
    public final boolean A09;

    public void setController(AnonymousClass5NI r2) {
        A02(r2, true);
    }

    public void A02(AnonymousClass5NI r2, boolean z) {
        this.A02 = r2;
        if (r2 != null && z) {
            r2.A06 = this.A05;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AnonymousClass5NI r0 = this.A02;
        if (r0 != null) {
            return r0.dispatchKeyEvent(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public Bitmap getCurrentFrame() {
        try {
            View view = this.A07;
            int width = view.getWidth() / 4;
            int height = view.getHeight() / 4;
            if (!this.A09) {
                return ((TextureView) view).getBitmap(width, height);
            }
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            if (!isDrawingCacheEnabled) {
                view.setDrawingCacheEnabled(true);
            }
            view.buildDrawingCache(true);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(view.getDrawingCache(), width, height, true);
            if (!isDrawingCacheEnabled) {
                view.setDrawingCacheEnabled(false);
            }
            view.destroyDrawingCache();
            return createScaledBitmap;
        } catch (OutOfMemoryError e) {
            Log.e("HeroPlayerView/getCurrentFrame/", e);
            return null;
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        AnonymousClass5NI r0 = this.A02;
        if (r0 == null) {
            return false;
        }
        r0.A03();
        return true;
    }

    public void setLayoutResizeMode(int i) {
        this.A08.setResizeMode(i);
    }

    public AnonymousClass5NJ(Context context, boolean z) {
        super(context);
        View r1;
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.video_frame);
        this.A08 = aspectRatioFrameLayout;
        this.A06 = findViewById(R.id.shutter);
        this.A09 = z;
        if (z) {
            r1 = new SurfaceView(context);
        } else {
            r1 = new C92214dJ(context);
        }
        this.A07 = r1;
        r1.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        aspectRatioFrameLayout.addView(r1, 0);
        this.A05 = new C1492070g(this);
    }

    public void setExoPlayerErrorActionsController(AnonymousClass6D2 r1) {
        this.A01 = r1;
    }
}
