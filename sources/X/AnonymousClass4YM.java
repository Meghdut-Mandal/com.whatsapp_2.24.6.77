package X;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.profile.SetAboutInfo;
import com.whatsapp.util.Log;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;

/* renamed from: X.4YM  reason: invalid class name */
public class AnonymousClass4YM implements Handler.Callback {
    public Object A00;
    public final int A01;

    public AnonymousClass4YM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean handleMessage(Message message) {
        switch (this.A01) {
            case 0:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
                if (mediaViewFragment.A1h == null) {
                    return true;
                }
                if (mediaViewFragment.A01 == 1) {
                    VoiceNoteSeekBar voiceNoteSeekBar = mediaViewFragment.A1p;
                    if (voiceNoteSeekBar == null || voiceNoteSeekBar.getMax() <= 0) {
                        C36431kI.A0U(mediaViewFragment).BO5(R.string.f12nameremoved);
                    } else {
                        int min = Math.min(mediaViewFragment.A1h.A02(), mediaViewFragment.A1p.getMax());
                        int i = min / 1000;
                        if (mediaViewFragment.A00 / 1000 != i) {
                            TextView textView = mediaViewFragment.A07;
                            if (textView != null) {
                                textView.setText(AnonymousClass3UY.A07(mediaViewFragment.A0j, (long) i));
                            }
                            mediaViewFragment.A00 = min;
                        }
                        mediaViewFragment.A1p.setProgress(min);
                    }
                }
                if (!mediaViewFragment.A0i().isFinishing() && mediaViewFragment.A01 == 1 && mediaViewFragment.A1h.A0D()) {
                    Handler handler = mediaViewFragment.A06;
                    if (handler == null) {
                        return true;
                    }
                    handler.sendEmptyMessageDelayed(0, 50);
                    return true;
                } else if (mediaViewFragment.A01 == 2) {
                    return true;
                } else {
                    Log.i("MediaViewFragment/onViewCreated/audio/set to stop status");
                    VoiceNoteSeekBar voiceNoteSeekBar2 = mediaViewFragment.A1p;
                    if (voiceNoteSeekBar2 != null) {
                        voiceNoteSeekBar2.setProgress(voiceNoteSeekBar2.getMax());
                    }
                    TextView textView2 = mediaViewFragment.A07;
                    if (textView2 != null) {
                        textView2.setText(AnonymousClass3UY.A07(mediaViewFragment.A0j, (long) (mediaViewFragment.A1h.A03() / 1000)));
                    }
                    MediaViewFragment.A0E(mediaViewFragment);
                    return true;
                }
            case 1:
                SetAboutInfo setAboutInfo = (SetAboutInfo) this.A00;
                if (message.what == 1) {
                    setAboutInfo.A01.A02((String) message.obj, (String) null);
                } else {
                    setAboutInfo.A05.A06(R.string.f12nameremoved, 0);
                }
                AnonymousClass3SJ.A00(setAboutInfo, 2);
                return true;
            default:
                C50362kd r1 = (C50362kd) this.A00;
                AnonymousClass00C.A0D(r1, 0);
                C63413Jy r0 = r1.A00;
                if (r0 == null) {
                    throw C36331k8.A0d("staticContentPlayer");
                }
                r0.A02();
                AnonymousClass4SL r02 = r1.A05;
                if (r02 == null) {
                    return true;
                }
                r02.BU7(r1);
                return true;
        }
    }
}
