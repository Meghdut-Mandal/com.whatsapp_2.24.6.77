package X;

import android.app.Activity;
import com.whatsapp.R;

/* renamed from: X.3dX  reason: invalid class name and case insensitive filesystem */
public final class C69443dX implements AnonymousClass4PI {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass1NG A01;
    public final /* synthetic */ boolean A02;

    public C69443dX(Activity activity, AnonymousClass1NG r2, boolean z) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = z;
    }

    public void BfK(boolean z) {
        if (!z) {
            AnonymousClass1NG r2 = this.A01;
            C36341k9.A0u(C19420v0.A00(r2.A0A), "block_list_receive_time");
            Activity activity = this.A00;
            if (!activity.isFinishing()) {
                AnonymousClass17Y r22 = r2.A02;
                boolean z2 = this.A02;
                int i = R.string.f12nameremoved;
                if (z2) {
                    i = R.string.f12nameremoved;
                }
                r22.A0K(activity.getString(i), 0);
            }
        }
    }
}
