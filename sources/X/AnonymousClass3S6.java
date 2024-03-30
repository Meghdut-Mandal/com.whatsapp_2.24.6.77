package X;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3S6  reason: invalid class name */
public final class AnonymousClass3S6 {
    public AudioManager.OnAudioFocusChangeListener A00;
    public Handler A01;
    public List A02;
    public boolean A03;
    public AudioFocusRequest A04;
    public Object A05;
    public final C21060yb A06;
    public final Runnable A07 = new C81173wa((Object) this, 45);

    public AnonymousClass3S6(C21060yb r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A06 = r3;
    }

    private final AudioFocusRequest A00() {
        AudioFocusRequest audioFocusRequest = this.A04;
        if (audioFocusRequest != null) {
            return audioFocusRequest;
        }
        AudioFocusRequest build = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).build()).build();
        this.A04 = build;
        return build;
    }

    public static final void A01(AnonymousClass3S6 r3) {
        if (r3.A05 != null) {
            Log.i("StatusPlaybackAudioManager/audio-focus-abandoned");
            r3.A05 = null;
            AudioManager A0D = r3.A06.A0D();
            if (A0D == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest A002 = r3.A00();
                if (A002 != null) {
                    A0D.abandonAudioFocusRequest(A002);
                    return;
                }
                return;
            }
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = r3.A00;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = AnonymousClass3WO.A00;
                r3.A00 = onAudioFocusChangeListener;
            }
            A0D.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }

    public final void A02(Object obj) {
        Handler handler;
        Log.i("AudioManager/on-abandon-audio-focus");
        if (this.A05 == obj && (handler = this.A01) != null) {
            Runnable runnable = this.A07;
            handler.removeCallbacks(runnable);
            Handler handler2 = this.A01;
            if (handler2 != null) {
                handler2.postDelayed(runnable, 1000);
            }
        }
    }

    public final void A03(Object obj) {
        Log.i("StatusPlaybackAudioManager/on-request-audio-focus");
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeCallbacks(this.A07);
        }
        if (this.A05 == null) {
            Log.i("StatusPlaybackAudioManager/request-audio-focus");
            AudioManager A0D = this.A06.A0D();
            if (A0D != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    AudioFocusRequest A002 = A00();
                    if (A002 != null) {
                        A0D.requestAudioFocus(A002);
                    }
                } else {
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A00;
                    if (onAudioFocusChangeListener == null) {
                        onAudioFocusChangeListener = AnonymousClass3WO.A00;
                        this.A00 = onAudioFocusChangeListener;
                    }
                    A0D.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
                }
            }
        }
        this.A05 = obj;
    }
}
