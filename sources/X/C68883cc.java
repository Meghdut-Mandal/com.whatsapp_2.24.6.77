package X;

import com.whatsapp.spamwarning.SpamWarningActivity;

/* renamed from: X.3cc  reason: invalid class name and case insensitive filesystem */
public class C68883cc implements C20420xX {
    public boolean A00;
    public final /* synthetic */ SpamWarningActivity A01;

    public /* synthetic */ void BYl() {
    }

    public /* synthetic */ void BYn() {
    }

    public /* synthetic */ void BYo() {
    }

    public /* synthetic */ void BYp() {
    }

    public C68883cc(SpamWarningActivity spamWarningActivity) {
        this.A01 = spamWarningActivity;
    }

    public void BYm() {
        if (!this.A00) {
            SpamWarningActivity spamWarningActivity = this.A01;
            spamWarningActivity.startActivity(AnonymousClass190.A03(spamWarningActivity));
            spamWarningActivity.finish();
        }
        this.A00 = true;
    }
}
