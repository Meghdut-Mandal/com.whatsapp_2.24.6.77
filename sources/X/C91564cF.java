package X;

import android.os.CountDownTimer;
import com.whatsapp.R;
import org.npci.upi.security.pinactivitycomponent.s;

/* renamed from: X.4cF  reason: invalid class name and case insensitive filesystem */
public class C91564cF extends CountDownTimer {
    public final /* synthetic */ s A00;
    public final /* synthetic */ C93104fl A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91564cF(s sVar, C93104fl r6) {
        super(60000, 1000);
        this.A00 = sVar;
        this.A01 = r6;
    }

    public void onFinish() {
        s sVar = this.A00;
        sVar.A0h().runOnUiThread(new C1501674f(sVar, 24));
    }

    public void onTick(long j) {
        String A0n;
        long A0B = C36391kE.A0B(j);
        long j2 = A0B - 15;
        int i = (A0B > 15 ? 1 : (A0B == 15 ? 0 : -1));
        C93104fl r2 = this.A01;
        if (i > 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(Long.toString(j2));
            A0n = AnonymousClass000.A0q("s", A0u);
        } else {
            A0n = this.A00.A0n(R.string.f12nameremoved);
        }
        r2.A02(A0n, true);
    }
}
