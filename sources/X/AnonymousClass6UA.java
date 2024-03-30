package X;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.6UA  reason: invalid class name */
public class AnonymousClass6UA implements TextureView.SurfaceTextureListener {
    public Object A00;
    public final int A01;

    public AnonymousClass6UA(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.A01) {
            case 0:
                AnonymousClass6ET r2 = (AnonymousClass6ET) this.A00;
                C1493370u r0 = r2.A01;
                if (r0 != null) {
                    r0.A0B(surfaceTexture);
                    r2.A01.A0D(surfaceTexture, i, i2);
                    r2.A01.setCornerRadius(r2.A00);
                    return;
                }
                return;
            case 1:
                MessageGifVideoPlayer messageGifVideoPlayer = (MessageGifVideoPlayer) this.A00;
                messageGifVideoPlayer.A03 = new Surface(surfaceTexture);
                MessageGifVideoPlayer.A03(messageGifVideoPlayer);
                MediaPlayer mediaPlayer = messageGifVideoPlayer.A02;
                if (mediaPlayer != null) {
                    mediaPlayer.setSurface(messageGifVideoPlayer.A03);
                    return;
                }
                return;
            default:
                AnonymousClass5NH r3 = (AnonymousClass5NH) this.A00;
                if (r3.A09 != null) {
                    Surface surface = new Surface(surfaceTexture);
                    r3.A0A = surface;
                    r3.A09.setSurface(surface);
                    if (r3.A00 == 0) {
                        try {
                            r3.A09.setDataSource(r3.A0B);
                            r3.A09.prepareAsync();
                            r3.A00 = 1;
                            return;
                        } catch (IOException e) {
                            r3.A00 = -1;
                            r3.A03 = -1;
                            if (r3.A07 != null) {
                                r3.post(new C1497472p(this, 13));
                            }
                            Log.e("mediaview/unable-to-play", e);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.A01) {
            case 0:
                C1493370u r0 = ((AnonymousClass6ET) this.A00).A01;
                if (r0 == null) {
                    return true;
                }
                r0.A0C(surfaceTexture);
                return true;
            case 1:
                MessageGifVideoPlayer messageGifVideoPlayer = (MessageGifVideoPlayer) this.A00;
                MediaPlayer mediaPlayer = messageGifVideoPlayer.A02;
                if (mediaPlayer != null) {
                    mediaPlayer.setSurface((Surface) null);
                    MessageGifVideoPlayer.A02(messageGifVideoPlayer);
                }
                Surface surface = messageGifVideoPlayer.A03;
                C18740tg.A06(surface);
                surface.release();
                messageGifVideoPlayer.A03 = null;
                return true;
            default:
                AnonymousClass5NH r2 = (AnonymousClass5NH) this.A00;
                MediaPlayer mediaPlayer2 = r2.A09;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setSurface((Surface) null);
                }
                Surface surface2 = r2.A0A;
                if (surface2 != null) {
                    surface2.release();
                    r2.A0A = null;
                }
                r2.A0H = false;
                return false;
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.A01) {
            case 0:
                C1493370u r0 = ((AnonymousClass6ET) this.A00).A01;
                if (r0 != null) {
                    r0.A0D(surfaceTexture, i, i2);
                    return;
                }
                return;
            case 1:
                MessageGifVideoPlayer.A03((MessageGifVideoPlayer) this.A00);
                return;
            default:
                return;
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (2 - this.A01 == 0) {
            AnonymousClass5NH r5 = (AnonymousClass5NH) this.A00;
            if (!r5.A0H) {
                r5.A0H = AnonymousClass000.A1R((surfaceTexture.getTimestamp() > 0 ? 1 : (surfaceTexture.getTimestamp() == 0 ? 0 : -1)));
            }
        }
    }
}
