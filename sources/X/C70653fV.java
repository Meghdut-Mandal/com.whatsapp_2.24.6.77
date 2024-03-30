package X;

import com.whatsapp.WaImageButton;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;

/* renamed from: X.3fV  reason: invalid class name and case insensitive filesystem */
public final class C70653fV implements C160817ld {
    public final WaImageButton A00;
    public final C46812bi A01;
    public final VoiceNoteSeekBar A02;

    public C70653fV(WaImageButton waImageButton, C46812bi r3, VoiceNoteSeekBar voiceNoteSeekBar) {
        AnonymousClass00C.A0D(waImageButton, 3);
        this.A01 = r3;
        this.A02 = voiceNoteSeekBar;
        this.A00 = waImageButton;
    }

    public void BWK(boolean z) {
    }

    public void BcI(int i) {
        AnonymousClass3UR.A06(this.A00);
    }

    public void Bdg(int i) {
        this.A02.setProgress(i);
    }

    public void BfR() {
        AnonymousClass3UR.A05(this.A00);
    }

    public void Bh8(int i) {
        AnonymousClass3UR.A05(this.A00);
        this.A02.setMax(i);
    }

    public void Bhp(int i, boolean z) {
        AnonymousClass3UR.A06(this.A00);
        if (z) {
            this.A02.setProgress(0);
        }
    }

    public C46812bi BBi() {
        return this.A01;
    }
}
