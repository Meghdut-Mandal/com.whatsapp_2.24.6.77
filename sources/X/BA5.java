package X;

import android.view.MenuItem;

public class BA5 implements AnonymousClass04S {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public BA5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj4;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void BTH(Object obj) {
        boolean z;
        C001600r r3;
        Object B17;
        switch (this.A04) {
            case 0:
                AnonymousClass8WH r6 = (AnonymousClass8WH) this.A00;
                MenuItem menuItem = (MenuItem) this.A01;
                MenuItem menuItem2 = (MenuItem) this.A02;
                MenuItem menuItem3 = (MenuItem) this.A03;
                if (!AnonymousClass000.A1X(obj) || r6.A0v == null) {
                    z = false;
                    menuItem.setShowAsAction(1);
                    menuItem2.setShowAsAction(1);
                } else {
                    z = true;
                    menuItem.setShowAsAction(0);
                    menuItem2.setShowAsAction(0);
                }
                menuItem3.setVisible(z);
                AnonymousClass8WH.A0F(r6);
                return;
            case 1:
                r3 = (C001600r) this.A03;
                C22995Azl azl = (C22995Azl) this.A02;
                Object A042 = ((C001600r) this.A00).A04();
                Object A043 = ((C001600r) this.A01).A04();
                if (obj != null && A042 != null && A043 != null) {
                    B17 = azl.B17(obj, A042, A043);
                    break;
                } else {
                    return;
                }
                break;
            case 2:
                r3 = (C001600r) this.A03;
                C22995Azl azl2 = (C22995Azl) this.A02;
                Object A044 = ((C001600r) this.A00).A04();
                Object A045 = ((C001600r) this.A01).A04();
                if (A044 != null && obj != null && A045 != null) {
                    B17 = azl2.B17(A044, obj, A045);
                    break;
                } else {
                    return;
                }
                break;
            default:
                r3 = (C001600r) this.A03;
                C22995Azl azl3 = (C22995Azl) this.A02;
                Object A046 = ((C001600r) this.A00).A04();
                Object A047 = ((C001600r) this.A01).A04();
                if (A046 != null && A047 != null && obj != null) {
                    B17 = azl3.B17(A046, A047, obj);
                    break;
                } else {
                    return;
                }
        }
        r3.A0D(B17);
    }
}
