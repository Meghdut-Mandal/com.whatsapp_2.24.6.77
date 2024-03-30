package X;

import com.whatsapp.status.StatusesFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2iY  reason: invalid class name and case insensitive filesystem */
public final class C49092iY extends C132446Tt {
    public final AnonymousClass1HT A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C49092iY(AnonymousClass1HT r2, StatusesFragment statusesFragment) {
        super(statusesFragment, true);
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A00.A03(C223613z.A00);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C65013Qj r1;
        List A0h = C36421kH.A0h(obj);
        StatusesFragment statusesFragment = (StatusesFragment) A07(StatusesFragment.class);
        if (statusesFragment != null) {
            statusesFragment.A14 = null;
            List list = statusesFragment.A1R;
            list.clear();
            List list2 = statusesFragment.A1S;
            list2.clear();
            List list3 = statusesFragment.A1Q;
            list3.clear();
            int A07 = C36431kI.A07(A0h);
            Iterator it = A0h.iterator();
            while (it.hasNext()) {
                AnonymousClass3T1 A0l = C36391kE.A0l(it);
                int i = A0l.A0D;
                if (AnonymousClass3TJ.A00(i, 4) < 0) {
                    if (i != 20) {
                        if (C66013Ui.A0n(A0l)) {
                            list3.add(Integer.valueOf(A07));
                        } else if (!(A0l instanceof AnonymousClass2bU) || (r1 = ((AnonymousClass2bU) A0l).A01) == null || r1.A0V || r1.A0f) {
                            list2.add(Integer.valueOf(A07));
                        }
                    }
                    list.add(Integer.valueOf(A07));
                }
                A07--;
                C65663Sz r0 = statusesFragment.A0x.A00;
                if (r0 != null && r0.A04() == A0l.A1O) {
                    long j = A0l.A0H;
                    if (j > 0) {
                        statusesFragment.A0x.A00.A0A(j);
                    }
                }
            }
            C38011nZ.A00(statusesFragment);
        }
    }
}
