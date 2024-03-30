package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import java.util.Objects;

/* renamed from: X.6lj  reason: invalid class name and case insensitive filesystem */
public class C140526lj implements C160347kr {
    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        Rect rect = ((C98204r3) obj2).A04;
        if (rect == null) {
            return null;
        }
        C90504aG.A14(rect, view);
        return null;
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        return !Objects.equals(((C98204r3) obj).A04, ((C98204r3) obj2).A04);
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setPadding(0, 0, 0, 0);
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }
}
