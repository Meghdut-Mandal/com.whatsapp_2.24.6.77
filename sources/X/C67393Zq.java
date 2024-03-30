package X;

import android.os.Handler;
import android.widget.SeekBar;
import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;
import java.io.IOException;

/* renamed from: X.3Zq  reason: invalid class name and case insensitive filesystem */
public class C67393Zq implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ MediaViewFragment A00;

    public C67393Zq(MediaViewFragment mediaViewFragment) {
        this.A00 = mediaViewFragment;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar != null) {
            MediaViewFragment mediaViewFragment = this.A00;
            String A0A = AnonymousClass3UY.A0A(mediaViewFragment.A0j, (long) seekBar.getProgress());
            VoiceNoteSeekBar voiceNoteSeekBar = mediaViewFragment.A1p;
            if (voiceNoteSeekBar != null) {
                voiceNoteSeekBar.setContentDescription(mediaViewFragment.A0o(R.string.f12nameremoved, AnonymousClass000.A1b(A0A)));
            }
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        MediaViewFragment mediaViewFragment = this.A00;
        C132476Tw r0 = mediaViewFragment.A1h;
        if (r0 != null && r0.A0D()) {
            mediaViewFragment.A1h.A04();
        }
        Handler handler = mediaViewFragment.A06;
        if (handler != null) {
            handler.removeMessages(0);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        MediaViewFragment mediaViewFragment = this.A00;
        C132476Tw r5 = mediaViewFragment.A1h;
        if (r5 == null) {
            VoiceNoteSeekBar voiceNoteSeekBar = mediaViewFragment.A1p;
            if (voiceNoteSeekBar != null) {
                voiceNoteSeekBar.setProgress(0);
            }
        } else if (mediaViewFragment.A01 == 1) {
            try {
                if (mediaViewFragment.A1p != null) {
                    r5.A0A((int) (((float) r5.A03()) * (((float) mediaViewFragment.A1p.getProgress()) / ((float) mediaViewFragment.A1p.getMax()))));
                }
                mediaViewFragment.A1h.A08();
                Handler handler = mediaViewFragment.A06;
                if (handler != null) {
                    handler.sendEmptyMessage(0);
                }
                MediaViewFragment.A0G(mediaViewFragment);
            } catch (IOException e) {
                Log.e("MediaViewFragment/onStopTrackingTouch/fail onStopTracking", e);
                C36431kI.A0U(mediaViewFragment).BO5(R.string.f12nameremoved);
            }
        } else if (mediaViewFragment.A1p != null) {
            int A03 = (int) (((float) r5.A03()) * (((float) mediaViewFragment.A1p.getProgress()) / ((float) mediaViewFragment.A1p.getMax())));
            AnonymousClass2bU A07 = MediaViewFragment.A07(mediaViewFragment, mediaViewFragment.A03);
            if (A07 != null) {
                MediaViewFragment.A0Q(mediaViewFragment, A07, A03, false);
            }
        }
    }
}
