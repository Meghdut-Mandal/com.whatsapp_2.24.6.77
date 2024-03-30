package X;

import com.whatsapp.R;
import com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3M6  reason: invalid class name */
public class AnonymousClass3M6 implements C88884Uk {
    public Object A00;
    public final int A01;

    public AnonymousClass3M6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        C225314u r3 = (C225314u) this.A00;
        if (!r3.BLh()) {
            C39001qm A002 = AnonymousClass3LW.A00(r3);
            C39001qm.A04(r3, A002);
            A002.A0k(r3, new C65973Ue(this, 7));
            A002.A0d(R.string.device_linking_failed_title);
            A002.A0c(R.string.device_linking_failed_message);
            A002.A0b();
        }
    }

    public void BZH() {
        if (this.A01 != 0) {
            DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) this.A00;
            devicePairQrScannerActivity.A09.BOi(1, -5, false);
            DevicePairQrScannerActivity.A01(devicePairQrScannerActivity);
            devicePairQrScannerActivity.A05.A06(R.string.f12nameremoved, 1);
            return;
        }
        Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onInvalidDeviceTime");
        LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = (LinkedDevicesEnterCodeActivity) this.A00;
        LinkedDevicesEnterCodeActivity.A01(linkedDevicesEnterCodeActivity);
        linkedDevicesEnterCodeActivity.A05.A06(R.string.f12nameremoved, 1);
    }

    public void BZI() {
        if (this.A01 != 0) {
            DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) this.A00;
            DevicePairQrScannerActivity.A01(devicePairQrScannerActivity);
            devicePairQrScannerActivity.A09.BOi(1, -6, false);
            C39001qm A002 = AnonymousClass3LW.A00(devicePairQrScannerActivity);
            C39001qm.A04(devicePairQrScannerActivity, A002);
            A002.A0k(devicePairQrScannerActivity, new C65973Ue(this, 6));
            A002.A0d(R.string.f12nameremoved);
            A002.A0c(R.string.f12nameremoved);
            A002.A0b();
            devicePairQrScannerActivity.A0F.A00(1);
            return;
        }
        Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onInvalidQrCode");
        ((C225314u) this.A00).A03.A0E("LinkedDevicesEnterCodeActivity/onInvalidQrCode", (String) null, true);
    }
}
