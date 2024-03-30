package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.5NN  reason: invalid class name */
public class AnonymousClass5NN extends C65083Qq {
    public final VideoSurfaceView A00;

    public Bitmap A07() {
        return null;
    }

    public boolean A0Z() {
        return false;
    }

    public int A04() {
        return this.A00.getCurrentPosition();
    }

    public int A05() {
        return this.A00.getDuration();
    }

    public void A0A() {
        this.A00.pause();
    }

    public void A0C() {
        this.A00.start();
    }

    public void A0D() {
        this.A00.A04();
    }

    public void A0L(int i) {
        this.A00.seekTo(i);
    }

    public void A0V(boolean z) {
        this.A00.setMute(z);
    }

    public boolean A0X() {
        return this.A00.isPlaying();
    }

    public boolean A0Y() {
        return C90474aD.A1T(this.A00.getCurrentPosition(), 50);
    }

    public AnonymousClass5NN(Context context, String str, boolean z) {
        AnonymousClass5NS r2 = new AnonymousClass5NS(context, this);
        this.A00 = r2;
        r2.setVideoPath(str);
        r2.A09 = new C164117rI(this, 0);
        r2.A08 = new C163427qB(this, 1);
        r2.setLooping(z);
    }

    public View A08() {
        return this.A00;
    }
}
