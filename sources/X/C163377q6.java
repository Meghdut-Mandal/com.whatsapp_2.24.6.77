package X;

import android.view.View;
import java.util.List;

/* renamed from: X.7q6  reason: invalid class name and case insensitive filesystem */
public class C163377q6 implements View.OnLongClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C163377q6(Object obj, int i, int i2, Object obj2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
    }

    public final boolean onLongClick(View view) {
        if (this.A03 != 0) {
            int i = this.A00;
            List list = AnonymousClass0D3.A0I;
            ((C1034155g) this.A01).A02.invoke(Integer.valueOf(i), ((C1034355i) this.A02).A04);
            return true;
        }
        int i2 = this.A00;
        Object obj = this.A02;
        List list2 = AnonymousClass0D3.A0I;
        ((C1034055f) this.A01).A02.invoke(Integer.valueOf(i2), obj);
        return true;
    }
}
