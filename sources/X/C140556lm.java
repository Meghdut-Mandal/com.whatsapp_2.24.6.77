package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: X.6lm  reason: invalid class name and case insensitive filesystem */
public class C140556lm implements C160347kr {
    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C98204r3 r6 = (C98204r3) obj2;
        recyclerView.setAdapter(r6.A0E);
        recyclerView.setItemAnimator((C02800By) null);
        C114875hy r0 = r6.A07;
        if (r0 == null || r0.A00 == null) {
            int i = r6.A03;
            if (i >= 0) {
                recyclerView.A0h(i);
                return null;
            }
        } else {
            AnonymousClass0CP layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager);
            layoutManager.A19(r6.A07.A00);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        return C36371kC.A1W(((C98204r3) obj).A0E, ((C98204r3) obj2).A0E);
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C114875hy r1 = ((C98204r3) obj2).A07;
        if (r1 != null) {
            AnonymousClass0CP layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager);
            r1.A00 = layoutManager.A0z();
        }
        recyclerView.setAdapter((AnonymousClass0CZ) null);
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }
}
