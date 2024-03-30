package X;

import android.content.Context;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6m3  reason: invalid class name and case insensitive filesystem */
public class C140716m3 implements C160347kr {
    public final C124785yn A00;
    public final C114555hR A01;

    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C124785yn r5 = this.A00;
        r5.A07 = recyclerView;
        recyclerView.A0v(r5.A06);
        int i = r5.A00;
        if (i != -1) {
            if (!r5.A09) {
                recyclerView.A0h(i);
            } else if (!r5.A08.equals("")) {
                C95734mC r1 = new C95734mC(context);
                r1.A0D(r5.A08);
                r1.A00 = r5.A03;
                r1.A02 = r5.A0B;
                r1.A00 = r5.A00;
                AnonymousClass0CP layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.A0g(r1);
                }
            } else {
                recyclerView.A0i(i);
            }
            r5.A00 = -1;
            r5.A09 = false;
            r5.A08 = "";
            r5.A03 = 0;
            r5.A0B = true;
        }
        int i2 = r5.A01;
        if (i2 == -1 && r5.A02 == -1) {
            return null;
        }
        boolean z = r5.A0A;
        int i3 = r5.A02;
        if (z) {
            recyclerView.A0n(i2, i3);
        } else {
            recyclerView.scrollBy(i2, i3);
        }
        r5.A01 = -1;
        r5.A02 = -1;
        r5.A0A = false;
        return null;
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) obj;
        if (Build.VERSION.SDK_INT >= 26 && (recyclerView = this.A00.A07) != null) {
            recyclerView.setImportantForAutofill(0);
        }
        C124785yn r0 = this.A00;
        r0.A07 = null;
        recyclerView2.A0w(r0.A06);
    }

    public C140716m3(C114555hR r1, C124785yn r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
