package X;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.android.exoplayer2.Timeline;
import com.whatsapp.videoplayback.HeroPlaybackControlView;
import java.util.Formatter;

/* renamed from: X.6cy  reason: invalid class name and case insensitive filesystem */
public final class C135606cy implements View.OnClickListener, B3J, SeekBar.OnSeekBarChangeListener {
    public boolean A00;
    public final /* synthetic */ HeroPlaybackControlView A01;

    public void Bcl() {
    }

    public void Bcr(AnonymousClass927 r1, AnonymousClass902 r2) {
    }

    public void BjP(C206419tN r1, C195269Tk r2) {
    }

    public void Bkc(AnonymousClass902 r1, String str) {
    }

    public C135606cy(HeroPlaybackControlView heroPlaybackControlView) {
        this.A01 = heroPlaybackControlView;
    }

    public void Bct(int i, boolean z, boolean z2) {
        this.A01.A00.post(new C1497472p(this, 4));
    }

    public void Bcy(int i) {
        this.A01.A00.post(new C1497472p(this, 5));
    }

    public void Bj7(Timeline timeline, Object obj, int i) {
        this.A01.A00.post(new C1497472p(this, 6));
    }

    public void onClick(View view) {
        C127956Ah r0;
        HeroPlaybackControlView heroPlaybackControlView = this.A01;
        AnonymousClass7dE r02 = heroPlaybackControlView.A04;
        if (r02 != null) {
            AnonymousClass5NR r2 = ((C1491970f) r02).A00;
            AnonymousClass5NI r1 = r2.A0D;
            if (r1 != null) {
                r1.A04 = null;
                r1.A05 = null;
            }
            AnonymousClass5NR.A01(r2);
            AnonymousClass6FG r03 = r2.A0A;
            if (r03 != null) {
                r03.A00();
            }
            r2.A0E();
        }
        if (heroPlaybackControlView.A0L == view && (r0 = heroPlaybackControlView.A03) != null) {
            int A07 = r0.A01.A07();
            C127956Ah r22 = heroPlaybackControlView.A03;
            if (A07 == 4) {
                r22.A01(0);
            } else {
                boolean z = !r22.A02();
                C204359ps r04 = r22.A01;
                if (z) {
                    r04.A0C();
                } else {
                    r04.A0B();
                }
            }
        }
        heroPlaybackControlView.A09(300);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        long j;
        if (z) {
            HeroPlaybackControlView heroPlaybackControlView = this.A01;
            TextView textView = heroPlaybackControlView.A0N;
            StringBuilder sb = heroPlaybackControlView.A0O;
            Formatter formatter = heroPlaybackControlView.A0P;
            long duration = heroPlaybackControlView.getDuration();
            if (duration == -9223372036854775807L) {
                j = 0;
            } else {
                j = (duration * ((long) i)) / ((long) 1000);
            }
            textView.setText(C111825cu.A00(sb, formatter, j));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        HeroPlaybackControlView heroPlaybackControlView = this.A01;
        heroPlaybackControlView.removeCallbacks(heroPlaybackControlView.A0F);
        C158617hn r1 = heroPlaybackControlView.A05;
        if (r1 != null) {
            AnonymousClass6R5 r12 = (AnonymousClass6R5) r1;
            if (r12.A01 != 0) {
                AnonymousClass5NR r2 = (AnonymousClass5NR) r12.A00;
                AnonymousClass5NI r13 = r2.A0D;
                if (r13 != null) {
                    r13.A04 = null;
                    r13.A05 = null;
                }
                AnonymousClass5NR.A01(r2);
                AnonymousClass6FG r0 = r2.A0A;
                if (r0 != null) {
                    r0.A00();
                }
                r2.A0E();
            } else {
                ((AnonymousClass5NR) r12.A00).A01++;
            }
        }
        C127956Ah r22 = heroPlaybackControlView.A03;
        if (r22 != null && r22.A02()) {
            r22.A01.A0B();
            this.A00 = true;
        }
        heroPlaybackControlView.A0B = true;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        long j;
        HeroPlaybackControlView heroPlaybackControlView = this.A01;
        heroPlaybackControlView.A0B = false;
        C127956Ah r8 = heroPlaybackControlView.A03;
        if (r8 != null) {
            int progress = seekBar.getProgress();
            long duration = heroPlaybackControlView.getDuration();
            if (duration == -9223372036854775807L) {
                j = 0;
            } else {
                j = (duration * ((long) progress)) / ((long) 1000);
            }
            r8.A01(j);
        }
        C127956Ah r1 = heroPlaybackControlView.A03;
        if (r1 != null && this.A00) {
            r1.A01.A0C();
        }
        this.A00 = false;
        heroPlaybackControlView.A09(3000);
    }
}
