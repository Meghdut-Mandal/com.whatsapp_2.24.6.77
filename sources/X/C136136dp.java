package X;

import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Formatter;

/* renamed from: X.6dp  reason: invalid class name and case insensitive filesystem */
public class C136136dp implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ AnonymousClass5NK A00;
    public final /* synthetic */ C65083Qq A01;

    public C136136dp(AnonymousClass5NK r1, C65083Qq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2;
        if (z && ((long) this.A01.A05()) != -9223372036854775807L) {
            AnonymousClass5NK r0 = this.A00;
            TextView textView = r0.A0n;
            StringBuilder sb = r0.A0u;
            Formatter formatter = r0.A0v;
            int progress = seekBar.getProgress();
            C65083Qq r02 = r0.A0H;
            if (r02 != null) {
                i2 = (int) C36391kE.A0B(((long) r02.A05()) * ((long) progress));
            } else {
                i2 = 0;
            }
            textView.setText(C111825cu.A00(sb, formatter, (long) i2));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        AnonymousClass5NK r1 = this.A00;
        r1.A0S = true;
        r1.A08();
        r1.removeCallbacks(r1.A0t);
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        int i;
        AnonymousClass5NK r4 = this.A00;
        r4.A0S = false;
        r4.A0l.setProgress(seekBar.getProgress());
        int progress = seekBar.getProgress();
        C65083Qq r0 = r4.A0H;
        if (r0 != null) {
            i = (int) C36391kE.A0B(((long) r0.A05()) * ((long) progress));
        } else {
            i = 0;
        }
        C65083Qq r1 = this.A01;
        if (i >= r1.A05()) {
            i -= 600;
        }
        r1.A0L(i);
        r4.A09(800);
        r4.A0E();
    }
}
