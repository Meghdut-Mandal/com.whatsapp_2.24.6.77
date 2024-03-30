package X;

import com.whatsapp.util.Log;

/* renamed from: X.6tW  reason: invalid class name and case insensitive filesystem */
public class C145206tW implements C160427kz {
    public final /* synthetic */ C1033154u A00;

    public C145206tW(C1033154u r1) {
        this.A00 = r1;
    }

    public void BQX() {
        Log.e("PAY:PaymentErrorMapAssetManager/triggerBackgroundFetch/onAbort");
    }

    public void BWm(Integer num) {
        Log.e("PAY:PaymentErrorMapAssetManager/triggerBackgroundFetch/onError");
    }

    public void BjA(Integer num) {
        Log.e("PAY:PaymentErrorMapAssetManager/triggerBackgroundFetch/onTimeOut");
    }

    public void onSuccess() {
        C1033154u r5 = this.A00;
        C24601Db r4 = r5.A02;
        C36341k9.A0w(C90494aF.A0E(r4), "payments_error_map_last_sync_time_millis", C19970wo.A00(r4.A01));
        StringBuilder A0v = AnonymousClass000.A0v(r5.A01.BAI());
        A0v.append("_");
        A0v.append(r5.A00.A06());
        A0v.append("_");
        C36341k9.A0x(C90494aF.A0E(r4), "error_map_key", AnonymousClass000.A0q("1", A0v));
    }
}
