package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.6ls  reason: invalid class name and case insensitive filesystem */
public class C140616ls implements C160347kr {
    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj3 == null || obj4 == null) {
            return false;
        }
        C120935sK r6 = (C120935sK) obj3;
        C120935sK r7 = (C120935sK) obj4;
        return (r6.A01 == r7.A01 && r6.A00 == r7.A00 && r6.A02.equals(r7.A02)) ? false : true;
    }

    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        AnonymousClass0CP layoutManager;
        C98204r3 r12 = (C98204r3) obj2;
        if (obj3 != null) {
            C95984mb r7 = r12.A0E;
            C120935sK r13 = (C120935sK) obj3;
            int i = r7.A00;
            int i2 = r13.A00;
            boolean z = true;
            boolean z2 = false;
            boolean A1U = C36381kD.A1U(i, i2);
            int i3 = r7.A01;
            int i4 = r13.A01;
            boolean A1U2 = C36381kD.A1U(i3, i4);
            RecyclerView recyclerView = r7.A02;
            if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
                if ((!layoutManager.A1N() || !A1U) && (!layoutManager.A1O() || !A1U2)) {
                    z = false;
                }
                z2 = z;
            }
            r7.A01 = i4;
            r7.A00 = i2;
            List list = r7.A03;
            r7.A03 = r13.A02;
            if (z2) {
                r7.A06();
                return null;
            }
            C06880Vl.A00(new C95554lo(r7, list)).A02(r7);
            return null;
        }
        throw AnonymousClass001.A09("List data was not computed during layout");
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
