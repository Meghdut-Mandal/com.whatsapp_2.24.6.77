package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity;
import com.whatsapp.payments.ui.IndiaUpiStepUpActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ADq  reason: case insensitive filesystem */
public class C21234ADq implements B2W {
    public final /* synthetic */ C179108jC A00;

    public C21234ADq(C179108jC r1) {
        this.A00 = r1;
    }

    public void BYW() {
        C179108jC r3 = this.A00;
        r3.A0J.A0A("onGetChallengeFailure got; showErrorAndFinish", (Throwable) null);
        r3.A4D();
    }

    public void BYc(C202059ky r7, boolean z) {
        int i;
        C179108jC r2 = this.A00;
        r2.Bnv();
        if (!z) {
            C24611Dc r5 = r2.A0J;
            r5.A0A("onGetToken got; failure", (Throwable) null);
            if (r2.A04.A05("upi-get-token")) {
                r5.A0A("retry get token", (Throwable) null);
                AE0 ae0 = r2.A0M;
                synchronized (ae0) {
                    try {
                        C24601Db r3 = ae0.A01;
                        JSONObject A0h = C165567td.A0h(r3);
                        A0h.remove("token");
                        A0h.remove("tokenTs");
                        C165577te.A1B(r3, A0h);
                    } catch (JSONException e) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
                    }
                }
                if (r2 instanceof IndiaUpiInternationalDeactivationActivity) {
                    throw C90464aC.A0o();
                }
                if (!(r2 instanceof IndiaUpiInternationalActivationActivity)) {
                    if (!(r2 instanceof IndiaUpiStepUpActivity)) {
                        if (!(r2 instanceof C178848hw)) {
                            if (!(r2 instanceof IndiaUpiPauseMandateActivity) && !(r2 instanceof IndiaUpiMandatePaymentActivity) && !(r2 instanceof IndiaUpiCheckBalanceActivity)) {
                                if (r2 instanceof IndiaUpiChangePinActivity) {
                                    ((IndiaUpiChangePinActivity) r2).A01.setText(R.string.f12nameremoved);
                                } else if (r2 instanceof C179008it) {
                                    i = R.string.f12nameremoved;
                                    r2.Bu1(i);
                                }
                            }
                        }
                    }
                    r2.A4A();
                    return;
                }
                i = R.string.f12nameremoved;
                r2.Bu1(i);
                r2.A4A();
                return;
            }
            if (r7 != null) {
                r5.A0A(AnonymousClass000.A0l(r7, "onGetToken showErrorAndFinish error: ", AnonymousClass000.A0u()), (Throwable) null);
                if (AEA.A02(r2, "upi-get-token", r7.A00, true)) {
                    return;
                }
            } else {
                r5.A0A("onGetToken showErrorAndFinish", (Throwable) null);
            }
            r2.A4D();
            return;
        }
        return;
    }

    public void BeN(boolean z) {
        C179108jC r3 = this.A00;
        if (r3.BLh()) {
            return;
        }
        if (z) {
            r3.A04.A01("upi-register-app");
            boolean z2 = r3.A0F;
            C24611Dc r1 = r3.A0J;
            if (z2) {
                r1.A0A("internal error ShowPinError", (Throwable) null);
                r3.A4F();
                return;
            }
            r1.A06("onRegisterApp registered ShowMainPane");
            r3.A4E();
            return;
        }
        r3.A0J.A0A("onRegisterApp not registered; showErrorAndFinish", (Throwable) null);
        r3.A4D();
    }
}
