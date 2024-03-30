package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.7zn  reason: invalid class name and case insensitive filesystem */
public final class C168157zn extends AnonymousClass0CZ implements AnonymousClass4PD {
    public final C191549Dk A00;
    public final C196089Xp A01;
    public final OrderDetailFragment A02;
    public final C18820ts A03;
    public final C20810yC A04;
    public final UserJid A05;
    public final List A06 = AnonymousClass001.A0I();

    public C168157zn(C191549Dk r2, C196089Xp r3, OrderDetailFragment orderDetailFragment, C18820ts r5, C20810yC r6, UserJid userJid) {
        C36321k7.A17(r3, r2, r6, 1);
        AnonymousClass00C.A0D(r5, 6);
        this.A01 = r3;
        this.A02 = orderDetailFragment;
        this.A05 = userJid;
        this.A00 = r2;
        this.A04 = r6;
        this.A03 = r5;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        int i2 = i;
        if (i == 0) {
            return new AnonymousClass8VQ(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), (CartFragment) null);
        }
        if (i2 == 1) {
            C191549Dk r2 = this.A00;
            C196089Xp r9 = this.A01;
            OrderDetailFragment orderDetailFragment = this.A02;
            UserJid userJid = this.A05;
            View A0E = C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved);
            C18800tq r0 = r2.A00.A02;
            C18820ts A0T = C36341k9.A0T(r0);
            return new AnonymousClass8VU(A0E, C165587tf.A0L(r0), this, r9, C18800tq.A2v(r0), orderDetailFragment, A0T, userJid);
        } else if (i2 == 3) {
            List list = AnonymousClass0D3.A0I;
            C18820ts r4 = this.A03;
            C20810yC r3 = this.A04;
            C36321k7.A0x(r4, r3);
            return new AnonymousClass8VV(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false), r4, r3);
        } else if (i2 == 4) {
            return new AnonymousClass8VR(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
        } else {
            throw AnonymousClass001.A09("CartItemsAdapter/onCreateViewHolder/unhandled view type");
        }
    }

    public int A0J() {
        return this.A06.size();
    }

    public AnonymousClass9EB BBA(int i) {
        return (AnonymousClass9EB) this.A06.get(i);
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r2, int i) {
        AnonymousClass80H r22 = (AnonymousClass80H) r2;
        AnonymousClass00C.A0D(r22, 0);
        r22.A0B((AnonymousClass9EB) this.A06.get(i));
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass9EB) this.A06.get(i)).A00;
    }
}
