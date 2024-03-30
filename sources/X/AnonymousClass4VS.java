package X;

import android.os.CountDownTimer;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.spamwarning.SpamWarningActivity;

/* renamed from: X.4VS  reason: invalid class name */
public class AnonymousClass4VS extends CountDownTimer {
    public Object A00;
    public Object A01;
    public final int A02 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4VS(C65413Ry r3, Long l, long j) {
        super(j, 60000);
        this.A00 = r3;
        this.A01 = l;
    }

    public void onFinish() {
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            C36411kG.A1N(obj);
        } else {
            ((C65413Ry) obj).A06.A0H(C80233v4.A00(this, 36));
        }
    }

    public void onTick(long j) {
        if (this.A02 != 0) {
            int i = (int) j;
            CircularProgressBar circularProgressBar = (CircularProgressBar) this.A01;
            circularProgressBar.setCenterText(AnonymousClass3UY.A07(((C224914p) this.A00).A00, (long) (i / 1000)));
            circularProgressBar.setProgress(i);
            return;
        }
        ((C65413Ry) this.A00).A06.A0H(new C80283v9(this, this.A01, 19));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4VS(CircularProgressBar circularProgressBar, SpamWarningActivity spamWarningActivity, long j) {
        super(j, 10);
        this.A00 = spamWarningActivity;
        this.A01 = circularProgressBar;
    }
}
