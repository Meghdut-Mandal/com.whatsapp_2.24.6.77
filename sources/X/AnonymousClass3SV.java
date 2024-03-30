package X;

import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

/* renamed from: X.3SV  reason: invalid class name */
public class AnonymousClass3SV implements C88624Tk {
    public Object A00;
    public final int A01;

    public AnonymousClass3SV(BanAppealViewModel banAppealViewModel, int i) {
        this.A01 = i;
        this.A00 = banAppealViewModel;
    }

    public void BXN(Integer num) {
        C001700s r0;
        if (this.A01 != 0) {
            BanAppealViewModel banAppealViewModel = (BanAppealViewModel) this.A00;
            C36341k9.A17(banAppealViewModel.A02, 3);
            r0 = banAppealViewModel.A01;
        } else {
            int intValue = num.intValue();
            if (intValue == 4 || intValue == 3) {
                r0 = ((BanAppealViewModel) this.A00).A01;
            } else {
                return;
            }
        }
        r0.A0C(num);
    }

    public void BiA(AnonymousClass37Y r5) {
        C28201Rs r1;
        Integer valueOf;
        if (this.A01 != 0) {
            BanAppealViewModel banAppealViewModel = (BanAppealViewModel) this.A00;
            int A012 = BanAppealViewModel.A01(banAppealViewModel, r5.A00, true);
            C36341k9.A17(banAppealViewModel.A02, 2);
            r1 = banAppealViewModel.A0A;
            valueOf = Integer.valueOf(A012);
        } else {
            BanAppealViewModel banAppealViewModel2 = (BanAppealViewModel) this.A00;
            int A013 = BanAppealViewModel.A01(banAppealViewModel2, r5.A00, false);
            r1 = banAppealViewModel2.A0A;
            valueOf = Integer.valueOf(A013);
        }
        r1.A0C(valueOf);
    }
}
