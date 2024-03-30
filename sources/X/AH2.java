package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class AH2 implements C88874Uj {
    public final /* synthetic */ B3K A00;
    public final /* synthetic */ AnonymousClass155 A01;
    public final /* synthetic */ C21302AGg A02;

    public void BUI(AnonymousClass11F r1, int i) {
    }

    public void BcU(C207119ua r8, C23043B1o b1o, String str, String str2, List list) {
        C21302AGg aGg = this.A02;
        aGg.A0O.A03(b1o, aGg.A08, 9);
        PaymentOptionsBottomSheet A03 = PaymentOptionsBottomSheet.A03(str, (String) null, list, false);
        AnonymousClass155 r2 = this.A01;
        A03.A05 = new C21313AGr(r2, r8, this, b1o, str2);
        C65443Sb.A00(A03, r2);
    }

    public void Bew(int i) {
    }

    public AH2(AnonymousClass155 r1, B3K b3k, C21302AGg aGg) {
        this.A02 = aGg;
        this.A00 = b3k;
        this.A01 = r1;
    }

    public void BTU(C207119ua r12, AnonymousClass11F r13, C206349tD r14, AnonymousClass9SC r15, C23043B1o b1o, String str, String str2, String str3, HashMap hashMap) {
        C21302AGg aGg = this.A02;
        C23043B1o b1o2 = b1o;
        aGg.A0O.A03(b1o2, aGg.A08, 5);
        String str4 = aGg.A08;
        if ("WhatsappPay".equals(str4) || "p2m_lite".equals(str4)) {
            if (this.A00.BLF()) {
                aGg.A05.A0B.A02();
            } else {
                this.A01.Bu1(R.string.f12nameremoved);
            }
            C19770wU r10 = aGg.A0P;
            C20310xM r5 = aGg.A0I;
            AnonymousClass1XC r8 = aGg.A0L;
            C202449lr.A02(aGg.A0F, r5, aGg.A0J, new C21156AAq(r12, this, b1o2, str), r8, b1o2, r10);
        } else if ("GlobalPayment".equals(str4) || "CustomPaymentInstructions".equals(str4)) {
            this.A00.BUH(r12, r13, r15, b1o2);
        } else {
            boolean equals = "checkout_lite".equals(str4);
            Objects.requireNonNull(b1o2.BA8());
            C207199ui r0 = b1o2.BA8().A01;
            if (equals) {
                Objects.requireNonNull(r0);
                List list = r0.A0L;
                Objects.requireNonNull(list);
                C18740tg.A0B(C36401kF.A1a(list));
                C21333AHl aHl = (C21333AHl) ((C206909uC) C36391kE.A0t(list)).A00;
                Objects.requireNonNull(aHl);
                AnonymousClass155 r3 = this.A01;
                String str5 = aHl.A02;
                r3.startActivity(C111245by.A00(r3, aGg.A0K, C36401kF.A0b(aGg.A07.A00), str5));
                return;
            }
            Objects.requireNonNull(r0);
            Objects.requireNonNull(b1o2.BA8().A01.A0J);
            C18740tg.A0B(!b1o2.BA8().A01.A0J.isEmpty());
            String str6 = ((C206929uE) b1o2.BA8().A01.A0J.get(0)).A02;
            AnonymousClass155 r32 = this.A01;
            C39001qm A002 = AnonymousClass3LW.A00(r32);
            A002.A0r(false);
            A002.A0q(r32.getString(R.string.f12nameremoved));
            A002.A0p(C36351kA.A0w(r32, str6, 1, R.string.f12nameremoved));
            A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            A002.A0h(new C204009pJ(r32, this, b1o2, str6), R.string.f12nameremoved);
            C36341k9.A11(A002);
        }
    }

    public void Bat(AnonymousClass11F r5, C23043B1o b1o, long j) {
        C21302AGg aGg = this.A02;
        aGg.A0O.A03(b1o, aGg.A08, 8);
        Intent A1Z = new AnonymousClass190().A1Z(aGg.A01, r5, 0);
        A1Z.putExtra("extra_quoted_message_row_id", j);
        aGg.A01.startActivity(A1Z);
    }

    public void Bbu(String str) {
        AnonymousClass9S7 r1 = this.A02.A02;
        r1.A04 = "wa_p2m_lite_receipt_support";
        r1.A00(this.A01);
    }

    public void Bbw(AnonymousClass11F r10, C23043B1o b1o, String str) {
        C207199ui r4;
        C21302AGg aGg = this.A02;
        C64933Qa r5 = null;
        aGg.A0O.A03(b1o, aGg.A08, 7);
        String str2 = null;
        if (b1o instanceof AnonymousClass3T1) {
            r5 = ((AnonymousClass3T1) b1o).A1J;
        }
        C207219uk BA8 = b1o.BA8();
        if (BA8 == null || (r4 = BA8.A01) == null) {
            r4 = null;
        } else {
            str2 = r4.A0E;
        }
        AnonymousClass9UH r2 = aGg.A0M;
        AnonymousClass155 r3 = this.A01;
        Intent A002 = r2.A00(r3, r4, r5, str2, str, "order_details");
        if (A002 == null) {
            Log.e("Pay: PaymentCheckoutOrderDetailsCoordinator/onOpenTransactionDetailClicked the transaction details intent is null");
        } else {
            r3.startActivity(A002);
        }
    }
}
