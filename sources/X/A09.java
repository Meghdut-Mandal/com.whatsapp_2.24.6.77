package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A09 implements C22860AxC {
    public final /* synthetic */ C203139nN A00;
    public final /* synthetic */ C204369pt A01;

    public A09(C204369pt r1, C203139nN r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public void BV0(List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0I.add(new C207129ub(((AnonymousClass6TI) it.next()).A05));
            }
        }
        this.A01.A0o.BV0(A0I);
    }
}
