package X;

import com.whatsapp.userban.ui.BanAppealActivity;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

/* renamed from: X.3UZ  reason: invalid class name */
public class AnonymousClass3UZ implements AnonymousClass04S {
    public int A00;
    public Object A01;
    public final int A02 = 1;

    public AnonymousClass3UZ(AnonymousClass08S r2) {
        this.A01 = r2;
        this.A00 = 1;
    }

    public final void BTH(Object obj) {
        BanAppealViewModel banAppealViewModel;
        boolean z;
        if (this.A02 != 0) {
            int i = this.A00;
            if (i > 0) {
                this.A00 = i - 1;
            } else {
                ((C001600r) this.A01).A0D(obj);
            }
        } else {
            BanAppealActivity banAppealActivity = (BanAppealActivity) this.A01;
            int i2 = this.A00;
            C36441kJ.A1F(obj);
            if (i2 == -2) {
                banAppealViewModel = banAppealActivity.A00;
                z = true;
            } else if (i2 == 3) {
                banAppealViewModel = banAppealActivity.A00;
                z = false;
            } else if (i2 == 4) {
                AnonymousClass3DY.A00(banAppealActivity, banAppealActivity.A00.A03, "blocked_ban_appeals", false);
                return;
            } else {
                return;
            }
            banAppealViewModel.A0U(banAppealActivity, z);
        }
    }

    public AnonymousClass3UZ(BanAppealActivity banAppealActivity, int i) {
        this.A01 = banAppealActivity;
        this.A00 = i;
    }
}
