package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.widget.PaymentView;
import java.util.List;

/* renamed from: X.B9o  reason: case insensitive filesystem */
public class C23206B9o implements C25711Hj {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public final void accept(Object obj) {
        Object obj2 = obj;
        if (this.A03 != 0) {
            C203269nh r6 = (C203269nh) this.A00;
            B6L b6l = (B6L) this.A01;
            Context context = (Context) this.A02;
            C122725vK r7 = (C122725vK) obj2;
            b6l.Bnv();
            if (r7.A01 == 5 || (r6.A02.A0E(1084) && r7.A00 == 5)) {
                b6l.B5a();
                C39001qm A002 = AnonymousClass3LW.A00(context);
                boolean A022 = C19600wD.A02(context);
                int i = R.string.f12nameremoved;
                if (A022) {
                    i = R.string.f12nameremoved;
                }
                A002.A0c(i);
                C165587tf.A17(A002);
                C36341k9.A11(A002);
                return;
            }
            int i2 = r7.A01;
            if (i2 == 1 || i2 == 6 || !C203269nh.A03(r7, r6)) {
                int i3 = r7.A01;
                if (i3 != 1 && i3 != 6) {
                    C203269nh.A02(context, new B85(b6l, 3), new B85(b6l, 4));
                } else if (C203269nh.A03(r7, r6)) {
                    C203269nh.A00(context, new B85(b6l, 5), new B85(b6l, 6));
                } else {
                    b6l.Bam(r7.A02);
                }
            } else {
                C203269nh.A01(context, new B85(b6l, 1), new B85(b6l, 2));
            }
        } else {
            C179148jG r2 = (C179148jG) this.A00;
            PaymentView paymentView = (PaymentView) this.A02;
            C203269nh r1 = r2.A0W;
            AnonymousClass11F r5 = r2.A0E;
            C18740tg.A06(r5);
            UserJid userJid = r2.A0G;
            long j = r2.A02;
            String paymentNote = paymentView.getPaymentNote();
            List mentionedJids = paymentView.getMentionedJids();
            r1.A04(r2, (AnonymousClass16X) this.A01, paymentView.getPaymentBackground(), r5, userJid, (C122725vK) obj2, new C21319AGx(r2, paymentView), paymentNote, mentionedJids, j);
        }
    }

    public C23206B9o(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }
}
