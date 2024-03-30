package X;

import android.view.View;

public class BAQ implements AnonymousClass004 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public BAQ(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj4;
        this.A03 = obj2;
    }

    public final Object get() {
        View view;
        float f;
        float left;
        float right;
        AZ4 az4;
        int i = this.A04;
        Object obj = this.A00;
        if (i != 0) {
            C174508Xh r4 = (C174508Xh) obj;
            view = (View) this.A03;
            f = (float) ((View) this.A01).getLeft();
            if (C36401kF.A1X((C18820ts) this.A02)) {
                right = (float) view.getRight();
                az4 = r4.A0A;
            }
            left = (float) view.getLeft();
            return Float.valueOf(left - f);
        }
        C174518Xi r42 = (C174518Xi) obj;
        view = (View) this.A03;
        f = (float) ((View) this.A01).getLeft();
        if (C36401kF.A1X((C18820ts) this.A02)) {
            right = (float) view.getRight();
            az4 = r42.A0A;
        }
        left = (float) view.getLeft();
        return Float.valueOf(left - f);
        left = right - AZ4.A00(az4);
        return Float.valueOf(left - f);
    }
}
