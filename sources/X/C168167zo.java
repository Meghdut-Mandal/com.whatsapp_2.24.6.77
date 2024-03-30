package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: X.7zo  reason: invalid class name and case insensitive filesystem */
public class C168167zo extends AnonymousClass0CZ implements AnonymousClass4PD {
    public C207109uZ A00;
    public Date A01 = new Date();
    public final C191579Dn A02;
    public final C198329dH A03;
    public final AnonymousClass9EA A04 = new AnonymousClass9EA(this);
    public final CartFragment A05;
    public final CartFragment A06;
    public final CartFragment A07;
    public final C196089Xp A08;
    public final C18820ts A09;
    public final C20810yC A0A;
    public final UserJid A0B;
    public final List A0C = AnonymousClass001.A0I();

    public static AnonymousClass8VP A00(C168167zo r1, int i) {
        List list = r1.A0C;
        if (i >= list.size() || i < 0) {
            return null;
        }
        AnonymousClass9EB r12 = (AnonymousClass9EB) list.get(i);
        if (r12 instanceof AnonymousClass8VP) {
            return (AnonymousClass8VP) r12;
        }
        return null;
    }

    public static AnonymousClass8VO A01(C168167zo r1, int i) {
        List list = r1.A0C;
        if (i >= list.size() || i < 0) {
            return null;
        }
        AnonymousClass9EB r12 = (AnonymousClass9EB) list.get(i);
        if (r12 instanceof AnonymousClass8VO) {
            return (AnonymousClass8VO) r12;
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0D(AnonymousClass0D3 r2, List list, int i) {
        AnonymousClass80H r22 = (AnonymousClass80H) r2;
        if (list.isEmpty()) {
            BSE(r22, i);
        } else {
            r22.A0C((AnonymousClass9EB) this.A0C.get(i), list);
        }
    }

    public int A0J() {
        return this.A0C.size();
    }

    public int A0L() {
        int i = 0;
        for (AnonymousClass9EB r1 : this.A0C) {
            if (r1 instanceof AnonymousClass8VL) {
                i = (int) (((long) i) + ((AnonymousClass8VL) r1).A00.A00);
            }
        }
        return i;
    }

    public AnonymousClass9EB BBA(int i) {
        return (AnonymousClass9EB) this.A0C.get(i);
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r2, int i) {
        ((AnonymousClass80H) r2).A0B((AnonymousClass9EB) this.A0C.get(i));
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (i == 0) {
            return new AnonymousClass8VQ(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved), this.A05);
        } else if (i2 == 1) {
            C191579Dn r3 = this.A02;
            C198329dH r6 = this.A03;
            C196089Xp r11 = this.A08;
            CartFragment cartFragment = this.A05;
            CartFragment cartFragment2 = this.A07;
            UserJid userJid = this.A0B;
            AnonymousClass9EA r7 = this.A04;
            View A0E = C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved);
            C18800tq r0 = r3.A00.A02;
            return new AnonymousClass8VW(A0E, r6, r7, this, cartFragment, cartFragment2, r11, C18800tq.A2v(r0), new AnonymousClass966(), C36341k9.A0T(r0), userJid);
        } else if (i2 == 2) {
            C18820ts r62 = this.A09;
            C20810yC r5 = this.A0A;
            CartFragment cartFragment3 = this.A06;
            List list = AnonymousClass0D3.A0I;
            AnonymousClass00C.A0D(viewGroup2, 0);
            C36321k7.A11(r62, r5, cartFragment3);
            return new AnonymousClass8VT(C36371kC.A0J(C36351kA.A0C(viewGroup2), viewGroup2, R.layout.f9nameremoved, false), cartFragment3, r62, r5);
        } else if (i2 == 3) {
            C18820ts r52 = this.A09;
            C20810yC r32 = this.A0A;
            List list2 = AnonymousClass0D3.A0I;
            AnonymousClass00C.A0D(viewGroup2, 0);
            C36321k7.A0x(r52, r32);
            return new AnonymousClass8VV(C36371kC.A0J(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved, false), r52, r32);
        } else if (i2 == 4) {
            return new AnonymousClass8VS(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved));
        } else {
            throw AnonymousClass001.A09("CartItemsAdapter/onCreateViewHolder/unhandled view type");
        }
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass9EB) this.A0C.get(i)).A00;
    }

    public C168167zo(C191579Dn r2, C198329dH r3, CartFragment cartFragment, CartFragment cartFragment2, CartFragment cartFragment3, C196089Xp r7, C18820ts r8, C20810yC r9, UserJid userJid) {
        this.A0A = r9;
        this.A08 = r7;
        this.A05 = cartFragment;
        this.A03 = r3;
        this.A09 = r8;
        this.A07 = cartFragment2;
        this.A06 = cartFragment3;
        this.A02 = r2;
        this.A0B = userJid;
    }

    public ArrayList A0M() {
        ArrayList A0I = AnonymousClass001.A0I();
        for (AnonymousClass9EB r1 : this.A0C) {
            if (r1 instanceof AnonymousClass8VL) {
                A0I.add(((AnonymousClass8VL) r1).A00);
            }
        }
        return A0I;
    }
}
