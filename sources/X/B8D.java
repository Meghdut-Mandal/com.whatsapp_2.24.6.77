package X;

import android.view.View;
import com.whatsapp.conversationslist.ViewHolder;

public class B8D implements View.OnLongClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public B8D(Object obj, int i, int i2, Object obj2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass11F r3;
        C28251Rx r2;
        ViewHolder viewHolder;
        int i;
        int i2 = this.A03;
        Object obj = this.A01;
        if (i2 != 0) {
            C175238a4 r4 = (C175238a4) obj;
            int i3 = this.A00;
            r3 = (AnonymousClass11F) this.A02;
            if (i3 == 1) {
                return true;
            }
            r2 = r4.A0D;
            viewHolder = r4.A06;
            i = r4.A07;
        } else {
            C175228a3 r42 = (C175228a3) obj;
            int i4 = this.A00;
            r3 = (AnonymousClass11F) this.A02;
            if (i4 == 1) {
                return true;
            }
            r2 = r42.A0C;
            viewHolder = r42.A06;
            i = r42.A05;
        }
        return r2.BaP(viewHolder, viewHolder, r3, i);
    }
}
