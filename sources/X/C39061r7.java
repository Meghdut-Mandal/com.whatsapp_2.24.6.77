package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1r7  reason: invalid class name and case insensitive filesystem */
public final class C39061r7 extends C07200Ws {
    public final C35011i0 A00;
    public final C28781Ua A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39061r7(Context context, View view, AnonymousClass3T1 r14, C33541fX r15, C33541fX r16, C33541fX r17, C35011i0 r18, C28781Ua r19) {
        super(context, view, 0, R.attr.f4nameremoved, 0);
        C36321k7.A0y(context, r14);
        C35011i0 r2 = r18;
        C28781Ua r1 = r19;
        C36361kB.A1J(r1, 7, r2);
        this.A01 = r1;
        this.A00 = r2;
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(Integer.valueOf(R.id.menuitem_delete), C36361kB.A0m(context, R.string.f12nameremoved));
        A1G.put(Integer.valueOf(R.id.menuitem_forward), C36361kB.A0m(context, R.string.f12nameremoved));
        C28781Ua r12 = this.A01;
        if (r12.A00() && !r12.A02() && this.A00.A07(3, C36371kC.A11(r14))) {
            A1G.put(Integer.valueOf(R.id.menuitem_share_status_facebook), C36361kB.A0m(context, R.string.f12nameremoved));
        }
        Iterator A0y = AnonymousClass000.A0y(A1G);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            this.A03.add(0, AnonymousClass000.A0I(A11.getKey()), 0, (CharSequence) A11.getValue());
        }
        this.A01 = new C67503a1(r16, r17, r15);
    }
}
