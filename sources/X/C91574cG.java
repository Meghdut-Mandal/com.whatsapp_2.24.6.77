package X;

import android.os.CountDownTimer;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.4cG  reason: invalid class name and case insensitive filesystem */
public class C91574cG extends CountDownTimer {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C1271967i A01;
    public final /* synthetic */ C100244uh A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91574cG(View view, C1271967i r4, C100244uh r5, long j) {
        super(j, 1000);
        this.A02 = r5;
        this.A00 = view;
        this.A01 = r4;
    }

    public void onFinish() {
        C1271967i r6 = this.A01;
        AnonymousClass6WZ A012 = C133266Xn.A01(r6);
        C140456lc r4 = this.A02.A00;
        A012.A08(new C142196oU((long) r4.A03), new C162637ou(this, 3));
        A012.A05();
        C160377ku A0X = r4.A0X(36);
        if (A0X != null) {
            C1273868b.A06(r6, r4, C1273868b.A03(r4), A0X);
        }
    }

    public void onTick(long j) {
        C132376Ti r4 = this.A02.A01;
        View view = this.A00;
        C90504aG.A16(C36391kE.A0O(view, R.id.timer_text), r4.A06, C36391kE.A0B(j));
    }
}
