package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.AmU  reason: case insensitive filesystem */
public final class C22429AmU extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C167707yf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22429AmU(C167707yf r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        C195659Vl r1;
        C178328fl r12;
        Map map;
        Iterable iterable;
        boolean z;
        C44072La r13;
        Map map2 = (Map) obj;
        AnonymousClass00C.A0D(map2, 0);
        C167707yf r10 = this.this$0;
        if (r10.A07.A00.A0E(5185)) {
            Iterator it = r10.A0A.iterator();
            loop0:
            while (true) {
                z = false;
                while (it.hasNext()) {
                    AnonymousClass11F r2 = C36391kE.A0l(it).A1J.A00;
                    if (!(r2 instanceof C28981Uw)) {
                        r2 = null;
                    }
                    if (!z) {
                        C65073Qp A09 = r10.A06.A09(r2, false);
                        if (!(A09 instanceof C44072La) || (r13 = (C44072La) A09) == null || !r13.A0L()) {
                        }
                    }
                    z = true;
                }
                break loop0;
            }
            C188338zQ[] values = C188338zQ.values();
            ArrayList A0I = AnonymousClass001.A0I();
            for (C188338zQ r14 : values) {
                if (z || !r14.requiresAdmin) {
                    A0I.add(r14);
                }
            }
            arrayList = A0I;
        } else {
            arrayList = C36371kC.A11(C188338zQ.ALL);
        }
        C001700s r3 = r10.A04;
        C195659Vl r0 = (C195659Vl) r3.A04();
        if (r0 != null) {
            int i = r0.A00;
            int A06 = C36421kH.A06(arrayList, 1);
            if (i > A06) {
                i = A06;
            }
            r1 = new C195659Vl(arrayList, i);
        } else {
            r1 = new C195659Vl(arrayList, 0);
        }
        if (!AnonymousClass00C.A0J(r3.A04(), r1)) {
            r3.A0C(r1);
        }
        if (this.this$0.A07.A00.A0E(5185)) {
            C167707yf r5 = this.this$0;
            C001700s r4 = r5.A00;
            C195639Vj r6 = (C195639Vj) r4.A04();
            if (r6 != null) {
                List<AnonymousClass9X9> list = r6.A01;
                ArrayList<AnonymousClass9X9> A0J = C36321k7.A0J(list);
                for (AnonymousClass9X9 r8 : list) {
                    AnonymousClass3T1 r11 = r8.A01;
                    Object obj2 = map2.get(r11.A1J.toString());
                    List list2 = null;
                    if (!(!(obj2 instanceof C178328fl) || (r12 = (C178328fl) obj2) == null || (map = r12.A00) == null || (iterable = (Iterable) map.get(C65753Ti.A02(r8.A03))) == null)) {
                        list2 = C007103b.A0c(iterable, new C23178B8m(1));
                    }
                    A0J.add(new AnonymousClass9X9(r11, r8.A02, r8.A03, list2, r8.A00, r8.A05));
                }
                r4.A0C(new C195639Vj(A0J, r6.A00));
                ArrayList A0I2 = AnonymousClass001.A0I();
                long j = 0;
                for (AnonymousClass9X9 r9 : A0J) {
                    List<AnonymousClass9Vi> list3 = r9.A04;
                    if (list3 != null) {
                        for (AnonymousClass9Vi r82 : list3) {
                            j++;
                            AnonymousClass3T1 r62 = r9.A01;
                            String A0y = C36381kD.A0y(r62.A1J);
                            String str = r9.A03;
                            A0I2.add(new C195829We(r82, r62, C90464aC.A0f(str, AnonymousClass000.A0v(A0y), '_'), str));
                        }
                    }
                }
                r5.A02.A0C(new C195649Vk(A0I2, j));
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
