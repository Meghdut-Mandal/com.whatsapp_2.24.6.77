package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.view.View;

/* renamed from: X.5NO  reason: invalid class name */
public class AnonymousClass5NO extends C65083Qq {
    public final AnonymousClass5NH A00;

    public boolean A0Z() {
        return false;
    }

    public int A04() {
        return this.A00.getCurrentPosition();
    }

    public int A05() {
        return this.A00.getDuration();
    }

    public Bitmap A07() {
        return this.A00.getBitmap();
    }

    public void A0A() {
        this.A00.pause();
    }

    public void A0C() {
        this.A00.start();
    }

    public void A0D() {
        AnonymousClass5NH r1 = this.A00;
        MediaPlayer mediaPlayer = r1.A09;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            r1.A09.release();
            r1.A09 = null;
            r1.A0H = false;
            r1.A00 = 0;
            r1.A03 = 0;
        }
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
        return this.A00.A0H;
    }

    public AnonymousClass5NO(Context context, String str, boolean z) {
        AnonymousClass5NH r2 = new AnonymousClass5NH(context, this);
        this.A00 = r2;
        r2.A0B = str;
        r2.A07 = new C164117rI(this, 1);
        r2.A06 = new C163427qB(this, 2);
        r2.setLooping(z);
    }

    public View A08() {
        return this.A00;
    }
}
