package X;

import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3CL  reason: invalid class name */
public class AnonymousClass3CL {
    public final /* synthetic */ C65623Sv A00;

    public AnonymousClass3CL(C65623Sv r1) {
        this.A00 = r1;
    }

    public void A00(C608439o r8, int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CompanionDeviceQrHandler/onError code=");
        A0u.append(i);
        A0u.append("; pairing device=");
        C36321k7.A1N(r8.A01, A0u);
        C65623Sv r3 = this.A00;
        C65623Sv.A00(r3);
        C236419g r2 = r3.A0C;
        synchronized (r2.A0N) {
            r2.A01 = null;
        }
        r3.A00 = null;
        AnonymousClass3M6 r6 = (AnonymousClass3M6) r3.A0D;
        if (r6.A01 != 0) {
            DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) r6.A00;
            devicePairQrScannerActivity.A09.BOi(2, (long) i, false);
            DevicePairQrScannerActivity.A01(devicePairQrScannerActivity);
            if (i != 403) {
                if (i != 405) {
                    if (i == 419) {
                        devicePairQrScannerActivity.A05.A06(R.string.f12nameremoved, 1);
                        devicePairQrScannerActivity.finish();
                        return;
                    } else if (i != 450) {
                        if (i != 452) {
                            r6.A00();
                            return;
                        } else if (!devicePairQrScannerActivity.BLh()) {
                            AnonymousClass3P9 A03 = LegacyMessageDialogFragment.A03(new Object[0], R.string.f12nameremoved);
                            AnonymousClass4XO r1 = new AnonymousClass4XO(devicePairQrScannerActivity, 7);
                            A03.A03 = R.string.f12nameremoved;
                            A03.A06 = r1;
                            AnonymousClass4XO r12 = new AnonymousClass4XO(devicePairQrScannerActivity, 8);
                            A03.A04 = R.string.f12nameremoved;
                            A03.A07 = r12;
                            A03.A00 = 1000;
                            C36331k8.A12(A03.A02(), devicePairQrScannerActivity);
                            return;
                        } else {
                            return;
                        }
                    }
                } else if (!devicePairQrScannerActivity.BLh()) {
                    Log.w("QrScannerActivity/onConsumerSmbCrossPairingError receive 405 error");
                    C39001qm A002 = AnonymousClass3LW.A00(devicePairQrScannerActivity);
                    C39001qm.A04(devicePairQrScannerActivity, A002);
                    A002.A0k(devicePairQrScannerActivity, new C65973Ue(devicePairQrScannerActivity, 3));
                    A002.A0c(R.string.f12nameremoved);
                    A002.A0d(R.string.device_linking_failed_title);
                    A002.A0b();
                    return;
                } else {
                    return;
                }
            }
            devicePairQrScannerActivity.A05.BoN();
            devicePairQrScannerActivity.A05.A0I(devicePairQrScannerActivity.A0K, DevicePairQrScannerActivity.A0N);
            return;
        }
        C36321k7.A1T("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onError errorCode: ", AnonymousClass000.A0u(), i);
        LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = (LinkedDevicesEnterCodeActivity) r6.A00;
        linkedDevicesEnterCodeActivity.A0A.BOi(2, (long) i, false);
        if (!linkedDevicesEnterCodeActivity.BLh()) {
            LinkedDevicesEnterCodeActivity.A01(linkedDevicesEnterCodeActivity);
            LinkedDevicesEnterCodeActivity.A07(linkedDevicesEnterCodeActivity, 0);
        }
    }
}
