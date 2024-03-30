package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import java.util.Map;

/* renamed from: X.9oK  reason: invalid class name and case insensitive filesystem */
public class C203569oK implements C159657ji {
    public Object A00;
    public final int A01;

    public C203569oK(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BXS(AnonymousClass6PH r2, Map map) {
        AnonymousClass17Y r0;
        switch (this.A01) {
            case 0:
                r0 = ((C178888i4) this.A00).A00;
                break;
            case 3:
                return;
            default:
                r0 = ((C225314u) this.A00).A05;
                break;
        }
        r0.A02();
    }

    public void BiH(Map map) {
        char c;
        Number A0b;
        AnonymousClass17Y r0;
        switch (this.A01) {
            case 0:
                r0 = ((C178888i4) this.A00).A00;
                break;
            case 1:
                C178848hw r1 = (C178848hw) this.A00;
                r1.A05.A02();
                r1.A4N();
                return;
            case 3:
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A00;
                if (map != null) {
                    String A1A = C36431kI.A1A("action", map);
                    if (A1A != null) {
                        String A1A2 = C36431kI.A1A("credential_id", map);
                        switch (A1A.hashCode()) {
                            case -1240788020:
                                if (A1A.equals("accept_success")) {
                                    c = 0;
                                    break;
                                } else {
                                    return;
                                }
                            case -716333109:
                                if (A1A.equals("create_new_account")) {
                                    c = 1;
                                    break;
                                } else {
                                    return;
                                }
                            case -460192429:
                                if (A1A.equals("accept_failure")) {
                                    c = 2;
                                    break;
                                } else {
                                    return;
                                }
                            case 74085029:
                                if (A1A.equals("check_balance")) {
                                    indiaUpiSendPaymentActivity.BuO(C165577te.A0I(indiaUpiSendPaymentActivity, indiaUpiSendPaymentActivity.A0B, IndiaUpiCheckBalanceActivity.class), 1015);
                                    return;
                                }
                                return;
                            case 1476662760:
                                if (A1A.equals("forgot_upi_pin")) {
                                    IndiaUpiSendPaymentActivity.A16(indiaUpiSendPaymentActivity, A1A2, true);
                                    return;
                                }
                                return;
                            case 1558549715:
                                if (A1A.equals("setup_pin")) {
                                    IndiaUpiSendPaymentActivity.A16(indiaUpiSendPaymentActivity, A1A2, false);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                        C202059ky r6 = null;
                        switch (c) {
                            case 0:
                                C201659k4 r02 = indiaUpiSendPaymentActivity.A0N;
                                if (A1A2 != null) {
                                    C24601Db r2 = r02.A02;
                                    r2.A0M(AnonymousClass000.A0p(";", A1A2, C165587tf.A0j(r2)));
                                }
                                indiaUpiSendPaymentActivity.A0X = true;
                                indiaUpiSendPaymentActivity.A0S.A07((C202059ky) null, 31, 2);
                                indiaUpiSendPaymentActivity.A09.A00.A0A(new C23207B9p(indiaUpiSendPaymentActivity, 7));
                                return;
                            case 1:
                                indiaUpiSendPaymentActivity.A4e((String) null);
                                return;
                            default:
                                C201659k4 r03 = indiaUpiSendPaymentActivity.A0N;
                                if (A1A2 != null) {
                                    C24601Db r22 = r03.A02;
                                    r22.A0M(AnonymousClass000.A0p(";", A1A2, C165587tf.A0j(r22)));
                                }
                                indiaUpiSendPaymentActivity.A0X = true;
                                Map map2 = (Map) map.get("error");
                                if (!(map2 == null || (A0b = C90524aI.A0b("code", map2)) == null)) {
                                    r6 = new C202059ky(A0b.intValue());
                                }
                                indiaUpiSendPaymentActivity.A0S.A07(r6, 31, 1);
                                if (r6 != null) {
                                    indiaUpiSendPaymentActivity.A4Y(r6);
                                    return;
                                }
                                break;
                        }
                    }
                    indiaUpiSendPaymentActivity.A05.A02();
                    indiaUpiSendPaymentActivity.A4d(new C199729fr(R.string.f12nameremoved), (String) null, C90524aI.A0w());
                    return;
                }
                return;
            default:
                r0 = ((C225314u) this.A00).A05;
                break;
        }
        r0.A02();
    }
}
