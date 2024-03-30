package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;

/* renamed from: X.7tx  reason: invalid class name and case insensitive filesystem */
public class C165677tx extends BroadcastReceiver {
    public final Object A00;
    public volatile boolean A01;
    public final /* synthetic */ IndiaUpiDeviceBindStepActivity A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C165677tx(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        this();
        this.A02 = indiaUpiDeviceBindStepActivity;
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    C56042vd.A01(context);
                    this.A01 = true;
                }
            }
        }
        int resultCode = getResultCode();
        IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = this.A02;
        C24611Dc r2 = indiaUpiDeviceBindStepActivity.A0g;
        r2.A06(AnonymousClass000.A0r("SmsSentReceiver onReceive: ", AnonymousClass000.A0u(), resultCode));
        if (resultCode == -1) {
            IndiaUpiDeviceBindStepActivity.A1F(indiaUpiDeviceBindStepActivity, (String) null, true);
            indiaUpiDeviceBindStepActivity.A0K.A00.A06("smsSend");
            indiaUpiDeviceBindStepActivity.A0K.A00.A07("deviceBind");
            AnonymousClass9YX r1 = indiaUpiDeviceBindStepActivity.A0B;
            if (r1 != null) {
                r1.A03("device-binding-sms");
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("IndiaUpiPaymentBankSetupActivity: onSmsSent to psp: ");
            A0u.append(indiaUpiDeviceBindStepActivity.A0R);
            A0u.append(" storing verification data sent: ");
            C165567td.A18(r2, C200449hQ.A00(indiaUpiDeviceBindStepActivity.A0T), A0u);
            if (!TextUtils.isEmpty(indiaUpiDeviceBindStepActivity.A0T)) {
                indiaUpiDeviceBindStepActivity.A05.A0H(new AVY(indiaUpiDeviceBindStepActivity, 2));
                indiaUpiDeviceBindStepActivity.A0V = true;
                indiaUpiDeviceBindStepActivity.A0P = indiaUpiDeviceBindStepActivity.A04.BpM(new AVY(indiaUpiDeviceBindStepActivity, 0), "IndiaUpiDeviceBindSetupActivity/startDeviceBindingForMultipleSms", 3000);
                return;
            }
            return;
        }
        AnonymousClass9YX r12 = indiaUpiDeviceBindStepActivity.A0B;
        if (r12 != null) {
            r12.A04("device-binding-sms", resultCode);
        }
        IndiaUpiDeviceBindStepActivity.A1F(indiaUpiDeviceBindStepActivity, "sms_sending_failed", false);
        IndiaUpiDeviceBindStepActivity.A1C(indiaUpiDeviceBindStepActivity, new C199729fr(R.string.f12nameremoved), true);
    }

    public C165677tx() {
        this.A01 = false;
        this.A00 = C36441kJ.A11();
    }
}
