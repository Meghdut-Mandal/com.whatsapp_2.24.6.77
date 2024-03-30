package X;

import android.content.Context;
import android.view.TouchDelegate;
import android.view.View;
import java.util.List;

/* renamed from: X.6lz  reason: invalid class name and case insensitive filesystem */
public class C140686lz implements C160347kr {
    public final /* synthetic */ List A00;

    public C140686lz(List list) {
        this.A00 = list;
    }

    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        C92394ds r4 = (C92394ds) obj;
        r4.setTouchDelegate(new C92224dL(r4, this.A00));
        return null;
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setTouchDelegate((TouchDelegate) null);
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
