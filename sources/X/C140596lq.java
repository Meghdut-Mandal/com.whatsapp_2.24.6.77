package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Objects;

/* renamed from: X.6lq  reason: invalid class name and case insensitive filesystem */
public class C140596lq implements C160347kr {
    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List<C02910Cj> list = ((C98204r3) obj2).A08;
        if (list == null) {
            return null;
        }
        for (C02910Cj A0t : list) {
            recyclerView.A0t(A0t);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        return !Objects.equals(((C98204r3) obj).A08, ((C98204r3) obj2).A08);
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List<C02910Cj> list = ((C98204r3) obj2).A08;
        if (list != null) {
            for (C02910Cj A0u : list) {
                recyclerView.A0u(A0u);
            }
        }
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }
}
