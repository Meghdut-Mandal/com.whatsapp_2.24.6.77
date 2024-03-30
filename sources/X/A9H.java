package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final /* synthetic */ class A9H implements C158007fe {
    public final /* synthetic */ AnonymousClass4PD A00;
    public final /* synthetic */ AnonymousClass8VW A01;
    public final /* synthetic */ CartFragment A02;

    public /* synthetic */ A9H(AnonymousClass4PD r1, AnonymousClass8VW r2, CartFragment cartFragment) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = cartFragment;
    }

    public final void Bdy(long j) {
        List A0w;
        AnonymousClass8VW r3 = this.A01;
        AnonymousClass4PD r4 = this.A00;
        CartFragment cartFragment = this.A02;
        if (r3.A04() != -1) {
            String str = ((AnonymousClass8VL) r4.BBA(r3.A04())).A00.A02.A0F;
            C167697yb r5 = cartFragment.A0P;
            long j2 = j;
            if (j == 0) {
                C198329dH r42 = r5.A0I;
                UserJid userJid = r5.A0O;
                boolean A1a = C36341k9.A1a(str, userJid);
                AnonymousClass9Y1 r52 = r42.A0I;
                C195209Sx r1 = new C195209Sx();
                r1.A0A = r52.A02;
                AtomicInteger atomicInteger = r52.A0C;
                r1.A05 = Integer.valueOf(atomicInteger.get());
                r1.A0D = r52.A00;
                r1.A0E = r52.A01;
                AtomicInteger atomicInteger2 = r52.A0D;
                r1.A09 = C36441kJ.A0y(atomicInteger2.getAndIncrement());
                C36401kF.A1F(r1, 30);
                C36411kG.A1G(r1, 54);
                r1.A01(C198329dH.A00(r42, str));
                r1.A0G = str;
                r1.A00 = userJid;
                r52.A03(r1);
                C001700s r0 = r42.A01;
                if (r0 != null && (A0w = C36401kF.A0w(r0)) != null && A0w.size() == A1a && str.equals(((AnonymousClass6B4) A0w.get(0)).A02.A0F)) {
                    C195209Sx r12 = new C195209Sx();
                    r12.A0A = r52.A02;
                    r12.A05 = Integer.valueOf(atomicInteger.get());
                    r12.A0D = r52.A00;
                    r12.A0E = r52.A01;
                    r12.A09 = C36441kJ.A0y(atomicInteger2.getAndIncrement());
                    C36401kF.A1F(r12, 31);
                    C36411kG.A1G(r12, 55);
                    r12.A01(C198329dH.A00(r42, str));
                    r12.A00 = userJid;
                    r52.A03(r12);
                }
                C1502274l.A00(r42.A0N, r42, userJid, str, 17);
            } else {
                C198329dH r8 = r5.A0I;
                UserJid userJid2 = r5.A0O;
                C36321k7.A0v(str, 1, userJid2);
                AnonymousClass9Y1 r2 = r8.A0I;
                C195209Sx A03 = C36321k7.A03(r2);
                C36321k7.A0p(A03, r2);
                C36401kF.A1F(A03, 29);
                C36411kG.A1G(A03, 53);
                A03.A01(C198329dH.A00(r8, str));
                A03.A0G = str;
                A03.A00 = userJid2;
                A03.A08 = Long.valueOf(j2);
                r2.A03(A03);
                r8.A0N.Boy(new AnonymousClass73M(r8, userJid2, str, 1, j2));
            }
            int i = 0;
            if (j == 0) {
                i = 4;
            }
            r3.A0A.setVisibility(i);
        }
    }
}
