package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.2id  reason: invalid class name and case insensitive filesystem */
public final class C49142id extends C132446Tt {
    public final AnonymousClass6N7 A00;
    public final AnonymousClass35X A01;

    public C49142id(AnonymousClass6N7 r2, AnonymousClass35X r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass4V2 r3 = null;
        C88924Uo A0c = C36431kI.A0c(this.A00, (String) null, 1, false);
        for (int i = 0; i < A0c.getCount() && r3 == null; i++) {
            r3 = A0c.BDy(i);
        }
        return r3;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C591732x r1;
        int A04;
        AnonymousClass4V2 r7 = (AnonymousClass4V2) obj;
        if (r7 == null) {
            C47252eB r2 = this.A01.A00;
            List list = AnonymousClass0D3.A0I;
            r2.A00 = null;
            r1 = r2.A00;
            A04 = r2.A04();
        } else if (!C36431kI.A1Y(this)) {
            AnonymousClass35X r0 = this.A01;
            C47252eB r5 = r0.A00;
            String str = r0.A01;
            List list2 = AnonymousClass0D3.A0I;
            Context A0F = C36441kJ.A0F(r5);
            C74903mM r22 = new C74903mM(r7, r5, C36421kH.A0B(r5.A02).getDimensionPixelSize(R.dimen.f7nameremoved));
            C74933mP r12 = new C74933mP(A0F, r22, r5, str);
            r5.A05.setTag(r22);
            r5.A04.A02(r22, r12);
            r1 = r5.A00;
            A04 = r5.A04();
        } else {
            return;
        }
        r1.A00.remove(Integer.valueOf(A04));
    }
}
