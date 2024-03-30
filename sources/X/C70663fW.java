package X;

import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.3fW  reason: invalid class name and case insensitive filesystem */
public class C70663fW implements C160817ld {
    public final /* synthetic */ C225314u A00;
    public final /* synthetic */ C65803Tn A01;
    public final /* synthetic */ C148826zU A02;
    public final /* synthetic */ C46812bi A03;

    public void BWK(boolean z) {
    }

    public C70663fW(C225314u r1, C65803Tn r2, C148826zU r3, C46812bi r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    public void BcI(int i) {
        C65803Tn.A01(this.A00, this.A01, false);
    }

    public void Bdg(int i) {
        C65803Tn r0 = this.A01;
        CircularProgressBar circularProgressBar = r0.A0B;
        circularProgressBar.setProgress(i);
        AudioPickerActivity audioPickerActivity = r0.A0C;
        circularProgressBar.setContentDescription(C36321k7.A0A(audioPickerActivity, AnonymousClass3UY.A0A(audioPickerActivity.A00, (long) i), R.string.f12nameremoved));
    }

    public void BfR() {
        C65803Tn.A00(this.A00, this.A01);
    }

    public void Bh8(int i) {
        this.A02.A0B(0);
        C65803Tn r1 = this.A01;
        C65803Tn.A00(this.A00, r1);
        r1.A0B.setMax(i);
    }

    public void Bhp(int i, boolean z) {
        C65803Tn r2 = this.A01;
        C65803Tn.A01(this.A00, r2, true);
        if (z) {
            r2.A0B.setProgress(0);
        }
        r2.A0C.A0B.A08((C148826zU) null);
    }

    public C46812bi BBi() {
        return this.A03;
    }
}
