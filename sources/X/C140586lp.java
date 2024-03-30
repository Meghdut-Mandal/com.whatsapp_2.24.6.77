package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: X.6lp  reason: invalid class name and case insensitive filesystem */
public class C140586lp implements C160347kr {
    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        AnonymousClass0I9 r0 = ((C98204r3) obj2).A06;
        if (r0 == null) {
            return null;
        }
        r0.A07(recyclerView);
        return null;
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        return !Objects.equals(((C98204r3) obj).A06, ((C98204r3) obj2).A06);
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        AnonymousClass0I9 r0 = ((C98204r3) obj2).A06;
        if (r0 != null) {
            r0.A07((RecyclerView) null);
        }
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }
}
