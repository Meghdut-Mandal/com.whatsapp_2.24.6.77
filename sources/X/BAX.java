package X;

import com.whatsapp.payments.ui.BrazilPixKeySettingActivity;
import com.whatsapp.payments.ui.IndiaUpiMyQrFragment;
import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;

public class BAX implements C009604b {
    public Object A00;
    public final int A01;

    public BAX(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BQj(Object obj) {
        IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel;
        int i = this.A01;
        Object obj2 = this.A00;
        if (i != 0) {
            IndiaUpiMyQrFragment indiaUpiMyQrFragment = (IndiaUpiMyQrFragment) obj2;
            if (((C009804d) obj).A00 == -1 && (indiaUpiSecureQrCodeViewModel = indiaUpiMyQrFragment.A0B) != null) {
                IndiaUpiSecureQrCodeViewModel.A02(indiaUpiSecureQrCodeViewModel, C36361kB.A0n(indiaUpiMyQrFragment.A0A.A0F), 0);
                return;
            }
            return;
        }
        BrazilPixKeySettingActivity brazilPixKeySettingActivity = (BrazilPixKeySettingActivity) obj2;
        C009804d r6 = (C009804d) obj;
        AnonymousClass00C.A0D(r6, 1);
        int i2 = r6.A00;
        if (i2 == -1) {
            BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = brazilPixKeySettingActivity.A03;
            if (brazilPixKeySettingViewModel == null) {
                throw C36331k8.A0d("brazilPixKeySettingViewModel");
            }
            String str = brazilPixKeySettingActivity.A05;
            if (str == null) {
                throw C36331k8.A0d("credentialId");
            }
            C22482AnL anL = new C22482AnL(brazilPixKeySettingViewModel, str);
            C22198AiL aiL = new C22198AiL(brazilPixKeySettingViewModel);
            C32971eV r3 = brazilPixKeySettingViewModel.A05.A02;
            r3.A02.A09(new C23175B8j(r3, new C194639Qn(aiL, anL), 1));
        } else if (i2 == 0) {
            BrazilPixKeySettingViewModel brazilPixKeySettingViewModel2 = brazilPixKeySettingActivity.A03;
            if (brazilPixKeySettingViewModel2 == null) {
                throw C36331k8.A0d("brazilPixKeySettingViewModel");
            }
            C36341k9.A17(brazilPixKeySettingViewModel2.A01, 0);
        }
    }
}
