package X;

import android.widget.SeekBar;

/* renamed from: X.6dt  reason: invalid class name and case insensitive filesystem */
public abstract class C136176dt implements SeekBar.OnSeekBarChangeListener {
    public void A00(int i) {
        C175058Zm r3 = ((C106495Jx) this).A00;
        r3.setDuration(AnonymousClass3UY.A07(r3.A0E, (long) i));
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this instanceof C106495Jx) {
            C175058Zm r0 = ((C106495Jx) this).A00;
            int progress = r0.A04.A05.getProgress();
            C36341k9.A1K(((C46812bi) ((AnonymousClass2bU) r0.A0K)).A1J, C148826zU.A13, progress);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C148826zU A00;
        if (this instanceof C106495Jx) {
            C175058Zm r4 = ((C106495Jx) this).A00;
            C46812bi r3 = (C46812bi) ((AnonymousClass2bU) r4.A0K);
            C36341k9.A1K(r3.A1J, C148826zU.A13, r4.A04.A05.getProgress());
            AnonymousClass1V6 r1 = r4.A03.A03;
            if (r1.A0D(r3) && (A00 = r1.A00()) != null) {
                A00.A06++;
            }
        }
    }
}
