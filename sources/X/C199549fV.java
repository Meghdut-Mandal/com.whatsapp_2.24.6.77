package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment;
import com.whatsapp.payments.ui.invites.PaymentInviteFragment;
import java.util.ArrayList;

/* renamed from: X.9fV  reason: invalid class name and case insensitive filesystem */
public class C199549fV {
    public final AnonymousClass1EU A00;
    public final Runnable A01;
    public final Runnable A02;
    public final Context A03;
    public final C225014r A04;
    public final AnonymousClass17Y A05;
    public final C167527yC A06;
    public final boolean A07;

    public void A01(UserJid userJid, C23036B1h b1h, String str) {
        C18740tg.A0B(A02());
        AnonymousClass1EU r1 = this.A00;
        C193609Md BFa = r1.A05().BFa();
        C18740tg.A06(BFa);
        AnonymousClass9YB A012 = r1.A01();
        C193669Mj r3 = new C193669Mj(userJid, BFa, b1h, this, str);
        C36331k8.A1F(new C183568r0(A012.A01, userJid, r3), A012.A03);
    }

    public static void A00(C199549fV r4, String str, ArrayList arrayList, boolean z) {
        C001700s r3 = r4.A06.A00;
        C36341k9.A16(r3, 0);
        boolean z2 = r4.A07;
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment = new IndiaUpiPaymentInviteFragment();
        indiaUpiPaymentInviteFragment.A17(PaymentInviteFragment.A05(str, arrayList, z, z2));
        paymentBottomSheet.A02 = indiaUpiPaymentInviteFragment;
        r4.A04.Btm(paymentBottomSheet);
        r3.A08(paymentBottomSheet, new BAD(paymentBottomSheet, r4, 6));
    }

    public boolean A02() {
        C193609Md BFa = this.A00.A05().BFa();
        if (BFa == null) {
            return false;
        }
        return BFa.A02.A0D();
    }

    public C199549fV(Context context, C225014r r2, AnonymousClass17Y r3, AnonymousClass1EU r4, C167527yC r5, Runnable runnable, Runnable runnable2, boolean z) {
        this.A05 = r3;
        this.A00 = r4;
        this.A03 = context;
        this.A06 = r5;
        this.A04 = r2;
        this.A02 = runnable;
        this.A01 = runnable2;
        this.A07 = z;
    }
}
