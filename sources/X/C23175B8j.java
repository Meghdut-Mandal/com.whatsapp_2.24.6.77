package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.B8j  reason: case insensitive filesystem */
public class C23175B8j implements AnonymousClass1XD {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23175B8j(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void Bes(C202059ky r7) {
        switch (this.A02) {
            case 0:
                ((AnonymousClass1YH) this.A00).A0D.A05("handlePaymentMethodUpdate: sendGetPaymentMethods request error");
                return;
            case 1:
                ((C194639Qn) this.A01).A01.invoke();
                return;
            case 4:
                C178888i4 r3 = (C178888i4) this.A00;
                r3.A0K.A04(AnonymousClass000.A0l(r7, "removePayment/onRequestError. paymentNetworkError: ", AnonymousClass000.A0u()));
                C23075B3f b3f = (C23075B3f) this.A01;
                if (b3f != null) {
                    b3f.BOb(r7, 13);
                }
                r3.Bnv();
                r3.BO5(R.string.f12nameremoved);
                return;
            case 5:
                C199109ei r32 = (C199109ei) this.A00;
                r32.A0G.A04(AnonymousClass000.A0l(r7, "onClosePaymentAccountConfirmed/onRequestError. paymentNetworkError: ", AnonymousClass000.A0u()));
                r32.A0C.A01((Context) this.A01, r32.A0B, r32.A0F, r7.A00, R.string.f12nameremoved).show();
                return;
            case 6:
                C165567td.A16(((C167797yq) this.A00).A0c, r7, "syncPendingTransaction onRequestError: ", AnonymousClass000.A0u());
                C23075B3f b3f2 = (C23075B3f) this.A01;
                if (b3f2 != null) {
                    b3f2.BOb(r7, 10);
                    return;
                }
                return;
            case 7:
                C36321k7.A1K(r7, "IndiaUpiPaymentSettingsFragment/onDeleteAccount onRequestError: ", C36341k9.A0i(r7));
                Activity activity = (Activity) this.A00;
                if (activity instanceof C225314u) {
                    C225314u r1 = (C225314u) activity;
                    r1.Bnv();
                    r1.BO5(R.string.f12nameremoved);
                    return;
                }
                return;
            case 8:
                return;
            default:
                C179158jJ.A0j((AnonymousClass6C8) this.A01, (Map) null, r7.A00);
                return;
        }
    }

    public void Bf0(C202059ky r7) {
        switch (this.A02) {
            case 0:
                ((AnonymousClass1YH) this.A00).A0D.A05("handlePaymentMethodUpdate: sendGetPaymentMethods response error");
                return;
            case 1:
                ((C194639Qn) this.A01).A01.invoke();
                return;
            case 4:
                C178888i4 r3 = (C178888i4) this.A00;
                C165567td.A16(r3.A0K, r7, "removePayment/onResponseError. paymentNetworkError: ", AnonymousClass000.A0u());
                C23075B3f b3f = (C23075B3f) this.A01;
                if (b3f != null) {
                    b3f.BOb(r7, 13);
                }
                r3.Bnv();
                r3.BO5(R.string.f12nameremoved);
                return;
            case 5:
                C199109ei r32 = (C199109ei) this.A00;
                C165567td.A16(r32.A0G, r7, "onClosePaymentAccountConfirmed/onResponseError. paymentNetworkError: ", AnonymousClass000.A0u());
                C225314u r1 = (C225314u) this.A01;
                r1.Bnv();
                r32.A0C.A01(r1, r32.A0B, r32.A0F, r7.A00, R.string.f12nameremoved).show();
                return;
            case 6:
                C165567td.A16(((C167797yq) this.A00).A0c, r7, "syncPendingTransaction onResponseError: ", AnonymousClass000.A0u());
                C23075B3f b3f2 = (C23075B3f) this.A01;
                if (b3f2 != null) {
                    b3f2.BOb(r7, 10);
                    return;
                }
                return;
            case 7:
                C36321k7.A1K(r7, "IndiaUpiPaymentSettingsFragment/onDeleteAccount onResponseError: ", C36341k9.A0i(r7));
                Activity activity = (Activity) this.A00;
                if (activity instanceof C225314u) {
                    C225314u r12 = (C225314u) activity;
                    r12.Bnv();
                    r12.BO5(R.string.f12nameremoved);
                    return;
                }
                return;
            case 8:
                return;
            default:
                C179158jJ.A0j((AnonymousClass6C8) this.A01, (Map) null, r7.A00);
                return;
        }
    }

    public void Bf1(AnonymousClass9KX r7) {
        AnonymousClass00S r0;
        switch (this.A02) {
            case 0:
                ((AnonymousClass1YH) this.A00).A00.A0H(new AVb(this, this.A01, 9));
                return;
            case 1:
                List list = ((C178538gh) r7).A00;
                if (list.isEmpty()) {
                    r0 = ((C194639Qn) this.A01).A01;
                } else {
                    C194639Qn r5 = (C194639Qn) this.A01;
                    if (((C32971eV) this.A00).A03.A07.A02.A0E(4781)) {
                        ArrayList A0I = AnonymousClass001.A0I();
                        Iterator it = list.iterator();
                        C175768b1 r2 = null;
                        while (it.hasNext()) {
                            C207249un A0S = C165607th.A0S(it);
                            if (A0S instanceof C175768b1) {
                                r2 = (C175768b1) A0S;
                            } else if (A0S instanceof C175788b3) {
                                A0I.add(A0S);
                            }
                        }
                        if (r2 != null || !A0I.isEmpty()) {
                            r5.A00(r2);
                            return;
                        }
                    } else {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            C207249un A0S2 = C165607th.A0S(it2);
                            if (A0S2 instanceof C175768b1) {
                                r5.A00((C175768b1) A0S2);
                                return;
                            }
                        }
                    }
                    r0 = r5.A01;
                }
                r0.invoke();
                return;
            case 4:
                C178888i4 r3 = (C178888i4) this.A00;
                r3.A0K.A06("removePayment Success");
                C23075B3f b3f = (C23075B3f) this.A01;
                if (b3f != null) {
                    b3f.BOb((C202059ky) null, 13);
                }
                r3.Bnv();
                r3.BO5(R.string.f12nameremoved);
                return;
            case 5:
                C199109ei r22 = (C199109ei) this.A00;
                r22.A0G.A06("onClosePaymentAccountConfirmed/onResponseSuccess");
                C225314u r32 = (C225314u) this.A01;
                r32.Bnv();
                C36331k8.A0w(C90494aF.A0E(r22.A04), "payment_brazil_nux_dismissed", true);
                AnonymousClass3SJ.A01(r32, 100);
                return;
            case 6:
                ((C167797yq) this.A00).A0c.A06("syncPendingTransaction onResponseSuccess");
                C23075B3f b3f2 = (C23075B3f) this.A01;
                if (b3f2 != null) {
                    b3f2.BOb((C202059ky) null, 10);
                    return;
                }
                return;
            case 7:
                StringBuilder A0i = C36341k9.A0i(r7);
                A0i.append("IndiaUpiPaymentSettingsFragment/onDeleteAccount onResponseSuccess: ");
                C36331k8.A1S(A0i, r7.A02);
                if (r7.A02) {
                    IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = ((AnonymousClass9FN) this.A01).A00;
                    indiaUpiPaymentSettingsFragment.A0e.A08(true, true);
                    IndiaUpiPaymentSettingsFragment.A06(indiaUpiPaymentSettingsFragment);
                }
                Activity activity = (Activity) this.A00;
                if (activity instanceof C225314u) {
                    ((C225314u) activity).Bnv();
                    return;
                }
                return;
            case 8:
                C203479o6 r1 = (C203479o6) this.A01;
                r1.A09 = C203449o2.A05(((C178538gh) r7).A00);
                ((IndiaUpiSecureQrCodeViewModel) this.A00).A00.A0C(r1);
                return;
            default:
                ((AnonymousClass6C8) this.A01).A00("on_success");
                return;
        }
    }
}
