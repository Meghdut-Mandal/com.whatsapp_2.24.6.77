package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import java.util.List;

/* renamed from: X.B9s  reason: case insensitive filesystem */
public class C23210B9s implements C25711Hj {
    public Object A00;
    public String A01;
    public final int A02;

    public C23210B9s(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void accept(Object obj) {
        C175798b4 r1;
        switch (this.A02) {
            case 0:
                BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) this.A00;
                String str = this.A01;
                if (AnonymousClass000.A1X(obj) && (r1 = (C175798b4) brazilPayBloksActivity.A05.A07(str)) != null) {
                    brazilPayBloksActivity.startActivity(brazilPayBloksActivity.A0L.A02(brazilPayBloksActivity, r1));
                }
                brazilPayBloksActivity.finish();
                return;
            case 1:
                C224914p r3 = (C224914p) this.A00;
                String str2 = this.A01;
                if (AnonymousClass000.A1X(obj)) {
                    C36421kH.A1H(r3.A04, r3, str2, 9);
                    return;
                }
                return;
            default:
                BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = (BrazilPixKeySettingViewModel) this.A00;
                String str3 = this.A01;
                List list = (List) obj;
                if (list.size() > C90484aE.A1U(list) || brazilPixKeySettingViewModel.A06.A03.A03()) {
                    C178518gf r32 = brazilPixKeySettingViewModel.A04;
                    AnonymousClass9II r2 = new AnonymousClass9II(brazilPixKeySettingViewModel, str3);
                    C29121Vk r5 = r32.A05;
                    String A09 = r5.A06.A09();
                    C186018vH r12 = new C186018vH(A09, str3, 6);
                    r5.A0G(new BAV(r12, r2, r32, 1), r12.A00, A09, AnonymousClass6X5.A0L);
                    return;
                }
                brazilPixKeySettingViewModel.A04.A00(new C23168B8c(brazilPixKeySettingViewModel, 9));
                return;
        }
    }
}
