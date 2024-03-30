package X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.List;

public class AGU implements B3P {
    public final /* synthetic */ C175758b0 A00;
    public final /* synthetic */ C207119ua A01;
    public final /* synthetic */ C179068j0 A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    public /* synthetic */ void BZF(PaymentBottomSheet paymentBottomSheet, List list, int i, int i2) {
    }

    public /* synthetic */ void BcS(C207249un r1, PaymentMethodRow paymentMethodRow) {
    }

    public /* synthetic */ void BcV(PaymentBottomSheet paymentBottomSheet, int i, int i2) {
    }

    public /* synthetic */ void BcZ(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public /* synthetic */ void Bca(int i) {
    }

    public /* synthetic */ void BjR(PaymentBottomSheet paymentBottomSheet) {
    }

    public AGU(C175758b0 r1, C207119ua r2, C179068j0 r3, PaymentBottomSheet paymentBottomSheet) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = paymentBottomSheet;
    }

    public void BUD(View view, View view2, C207079uW r20, C175728ax r21, C207249un r22, PaymentBottomSheet paymentBottomSheet) {
        String A07;
        String str;
        C24601Db r1;
        String str2;
        C207249un r12 = r22;
        C179068j0 r0 = this.A02;
        r0.BOo(r0.A0S.A05(r12, (C131606Ps) null), C36361kB.A0i(), C36371kC.A0o(), "payment_confirm_prompt");
        this.A03.A1b();
        C207119ua r4 = this.A01;
        C175758b0 r13 = (C175758b0) r12;
        r0.A00 = r13;
        if (r0 instanceof C179048iy) {
            C179048iy r3 = (C179048iy) r0;
            String A4i = r3.A4i();
            String obj = r4.A02.A00.toString();
            if (!TextUtils.isEmpty(r3.A05)) {
                str2 = r3.A05;
            } else {
                str2 = r3.A06;
            }
            String str3 = r3.A0j;
            C203479o6 r42 = new C203479o6(A4i, obj, str2, r3.A0Z, (String) null, (String) null, "04", r3.A0c, (String) null, (String) C165577te.A0g(r3.A0I), (String) null, (String) null);
            r42.A07 = C203479o6.A05(str3, false);
            A07 = r42.A07();
        } else {
            AnonymousClass00C.A0D(r4, 0);
            A07 = new C203479o6(r0.A4i(), r4.A02.A00.toString(), r0.A0g, r0.A0Z, r0.A0o, r0.A0d, "04", r0.A0c, r0.A0m, (String) C165577te.A0g(r0.A0I), (String) null, "SCANNED_QR_CODE").A07();
            AnonymousClass00C.A08(A07);
        }
        Intent A04 = C36331k8.A04(A07);
        Object obj2 = r13.A00.A00;
        if ("other".equals(obj2)) {
            A04 = Intent.createChooser(A04, r0.getString(R.string.f12nameremoved));
            r1 = r0.A0P;
            str = null;
        } else {
            str = (String) obj2;
            A04.setPackage(str);
            r1 = r0.A0P;
        }
        C36341k9.A0x(C90494aF.A0E(r1), "pref_p2m_hybrid_last_used_payment_option", str);
        r0.startActivityForResult(A04, 1022);
        C198199d4 r14 = r0.A0I;
        C64933Qa A022 = AnonymousClass3UJ.A02(r0.getIntent());
        if (A022 != null) {
            C183358qf r15 = r14.A05;
            String str4 = A022.A01;
            AnonymousClass00C.A07(str4);
            r15.A0A(str4);
        }
    }

    public void BcO(PaymentBottomSheet paymentBottomSheet, int i) {
        C179068j0 r5 = this.A02;
        AF7 af7 = r5.A0S;
        C175758b0 r4 = this.A00;
        r5.BOo(af7.A05(r4, (C131606Ps) null), C36361kB.A0i(), 84, "payment_confirm_prompt");
        r5.A4W(r4, this.A01, this.A03);
    }
}
