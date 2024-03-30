package X;

import android.content.DialogInterface;
import com.whatsapp.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.AEi  reason: case insensitive filesystem */
public class C21252AEi implements B6I {
    public final /* synthetic */ AGL A00;

    public C21252AEi(AGL agl) {
        this.A00 = agl;
    }

    public void BOa(C202059ky r3, Integer num) {
        this.A00.A07.A0M.A02.A01(r3, num, "pay-precheck");
        BWh(r3, num);
    }

    public Integer BOe() {
        return this.A00.A07.A0M.A02.A00("pay-precheck");
    }

    public void BOr(C202059ky r3, Integer num) {
        this.A00.A07.A0M.A02.A01(r3, num, "get-provider-key");
    }

    public void BOs(Integer num) {
        this.A00.A07.A0M.A04(num, "get-provider-key");
    }

    public void BWh(C202059ky r13, Integer num) {
        C206359tF A002;
        AE9 ae9;
        int i;
        String str;
        DialogInterface.OnDismissListener b8t;
        C23185B8t b8t2;
        C23186B8u b8u;
        AGL agl = this.A00;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = agl.A04;
        pinBottomSheetDialogFragment.A1p();
        BrazilPaymentActivity brazilPaymentActivity = agl.A07;
        brazilPaymentActivity.A0M.A06("error_code", (long) r13.A00, brazilPaymentActivity.A00);
        int i2 = r13.A00;
        switch (i2) {
            case 454:
                C203399nx r0 = r13.A04;
                if (!(r0 == null || (A002 = AnonymousClass9ZX.A00(r0)) == null)) {
                    brazilPaymentActivity.A0C.A05(AnonymousClass97K.A00(brazilPaymentActivity.A05, A002));
                }
                BrazilPaymentActivity.A14(pinBottomSheetDialogFragment, brazilPaymentActivity);
                return;
            case 1440:
                pinBottomSheetDialogFragment.A1r(r13.A01, R.plurals.f10nameremoved);
                return;
            case 1441:
                C165607th.A1F(pinBottomSheetDialogFragment, r13.A02);
                return;
            case 2826048:
                B8F b8f = new B8F(pinBottomSheetDialogFragment, this, 10);
                C23186B8u b8u2 = new C23186B8u(pinBottomSheetDialogFragment, 3);
                String string = brazilPaymentActivity.getString(R.string.f12nameremoved);
                String string2 = brazilPaymentActivity.getString(R.string.f12nameremoved);
                C39001qm A003 = AnonymousClass3LW.A00(brazilPaymentActivity);
                A003.A0h(b8f, R.string.f12nameremoved);
                A003.A0V(b8u2);
                if (string2 == null) {
                    A003.A0Z(string);
                } else {
                    A003.setTitle(string);
                    A003.A0Z(string2);
                }
                C36341k9.A11(A003);
                String string3 = brazilPaymentActivity.A02.getString(R.string.f12nameremoved);
                C23075B3f b3f = brazilPaymentActivity.A0J;
                C131606Ps A004 = C203049nB.A00();
                A004.A03("dialog_text", string3);
                C203049nB.A03(A004, b3f, (Integer) null, "payment_disabled_alert", (String) null, 0);
                return;
            case 2896003:
            case 2896004:
                C203049nB.A04(C203049nB.A01(brazilPaymentActivity.A07, (AnonymousClass16X) null, brazilPaymentActivity.A0U, (String) null, false), brazilPaymentActivity.A0J, "incentive_unavailable", "payment_confirm_prompt");
                ae9 = brazilPaymentActivity.A09;
                i = r13.A00;
                str = null;
                b8t = new C23185B8t(pinBottomSheetDialogFragment, this, 3);
                b8t2 = null;
                b8u = null;
                break;
            default:
                if (i2 == 444 || i2 == 478) {
                    brazilPaymentActivity.A0H.A01.A02("FB", "PIN");
                }
                ae9 = brazilPaymentActivity.A09;
                i = r13.A00;
                str = brazilPaymentActivity.A04.A0H(brazilPaymentActivity.A06.A01(brazilPaymentActivity.A0G));
                b8t2 = new C23185B8t(pinBottomSheetDialogFragment, this, 4);
                b8t = new C23186B8u(pinBottomSheetDialogFragment, 4);
                b8u = new C23186B8u(pinBottomSheetDialogFragment, 5);
                break;
        }
        ae9.A00(brazilPaymentActivity, b8t2, b8t, b8u, str, i).show();
    }

    public void BfI(String str, Integer num) {
        AGL agl = this.A00;
        agl.A04.A1p();
        BrazilPaymentActivity brazilPaymentActivity = agl.A07;
        brazilPaymentActivity.A0M.A04(num, "pay-precheck");
        String str2 = agl.A05;
        AnonymousClass16X r5 = agl.A01;
        C207249un r6 = agl.A02;
        String str3 = agl.A06;
        int i = 1;
        if (brazilPaymentActivity.A3v(r5, brazilPaymentActivity.A01) == null) {
            i = 0;
        }
        brazilPaymentActivity.A3w(agl.A00, r5, r6, agl.A03, str2, str, str3, i);
    }
}
