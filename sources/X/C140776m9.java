package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.6m9  reason: invalid class name and case insensitive filesystem */
public class C140776m9 implements C160347kr {
    public final C1271967i A00;
    public final C140456lc A01;
    public final List A02;

    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass6NR.A00().A06.A03(this.A00, C90504aG.A0K(list, i), this.A01, obj);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass6NR.A00().A06.A04(this.A00, C90504aG.A0K(list, i), this.A01, obj);
        }
    }

    public C140776m9(C1271967i r1, C140456lc r2, List list) {
        this.A00 = r1;
        this.A02 = list;
        this.A01 = r2;
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
