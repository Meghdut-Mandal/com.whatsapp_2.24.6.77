package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2iA  reason: invalid class name and case insensitive filesystem */
public class C48852iA extends C33541fX {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C48852iA(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A04 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public void A02(View view) {
        C38881qN r3;
        switch (this.A04) {
            case 0:
                r3 = (C38881qN) this.A01;
                r3.A00 = this.A00;
                Iterator it = ((List) this.A03).iterator();
                while (it.hasNext()) {
                    C36431kI.A0K(it).setSelected(false);
                }
                break;
            case 1:
                r3 = (C38881qN) this.A01;
                r3.A01 = this.A00;
                Iterator it2 = ((List) this.A03).iterator();
                while (it2.hasNext()) {
                    C36431kI.A0K(it2).setSelected(false);
                }
                break;
            default:
                C96884o3 r1 = (C96884o3) this.A01;
                List list = AnonymousClass0D3.A0I;
                Integer num = r1.A08;
                int i = this.A00;
                r1.A06.Bhl((AnonymousClass11F) this.A02, (C135066c4) this.A03, num, i);
                return;
        }
        ((View) this.A02).setSelected(true);
        C38881qN.A04(r3);
    }
}
