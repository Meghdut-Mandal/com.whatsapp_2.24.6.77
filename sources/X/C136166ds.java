package X;

import android.widget.SeekBar;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.6ds  reason: invalid class name and case insensitive filesystem */
public class C136166ds implements SeekBar.OnSeekBarChangeListener {
    public C136176dt A00;
    public boolean A01;
    public final AnonymousClass1V6 A02;
    public final AudioPlayerView A03;
    public final AnonymousClass7hY A04;
    public final AnonymousClass005 A05;

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            C136176dt r0 = this.A00;
            r0.onProgressChanged(seekBar, i, z);
            r0.A00(i / 1000);
            AudioPlayerView audioPlayerView = this.A03;
            audioPlayerView.setSeekbarContentDescription((long) audioPlayerView.A05.getProgress());
        }
        AudioPlayerView audioPlayerView2 = this.A03;
        if (audioPlayerView2.A01.isEnabled()) {
            audioPlayerView2.A01.setPlaybackPercentage((((float) i) * 1.0f) / ((float) audioPlayerView2.A00));
        }
        C46812bi BBk = this.A04.BBk();
        int progress = audioPlayerView2.A05.getProgress();
        C36341k9.A1K(BBk.A1J, C148826zU.A13, progress);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C46812bi BBk = this.A04.BBk();
        this.A01 = false;
        AnonymousClass1V6 r2 = this.A02;
        C148826zU A002 = r2.A00();
        if (r2.A0D(BBk) && r2.A0B() && A002 != null) {
            A002.A0E(true);
            this.A01 = true;
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C46812bi BBk = this.A04.BBk();
        C136176dt r2 = this.A00;
        r2.onStopTrackingTouch(seekBar);
        AnonymousClass1V6 r1 = this.A02;
        if (!r1.A0D(BBk) || r1.A0B() || !this.A01) {
            r2.A00(BBk.A0B);
            int progress = this.A03.A05.getProgress();
            ((C160497l6) this.A05.get()).Brs(BBk.A1N, progress);
            C36341k9.A1K(BBk.A1J, C148826zU.A13, progress);
            return;
        }
        int i = 0;
        this.A01 = false;
        C148826zU A002 = r1.A00();
        if (A002 != null) {
            A002.A0B(this.A03.A05.getProgress());
            if (BBk.A1l()) {
                i = C148826zU.A12;
            }
            A002.A0C(i, true, false);
        }
    }

    public C136166ds(AnonymousClass1V6 r1, AudioPlayerView audioPlayerView, AnonymousClass7hY r3, C136176dt r4, AnonymousClass005 r5) {
        this.A03 = audioPlayerView;
        this.A04 = r3;
        this.A02 = r1;
        this.A05 = r5;
        this.A00 = r4;
    }
}
