package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7pj  reason: invalid class name and case insensitive filesystem */
public class C163147pj implements AnonymousClass7dX {
    public Object A00;
    public final int A01 = 1;

    public C163147pj(float f) {
        this.A00 = new C136366eG(f, 0.01f);
    }

    public /* bridge */ /* synthetic */ C161417ms B7v(int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                obj = ((List) obj).get(i);
                break;
            case 1:
                break;
            default:
                return (C161417ms) obj;
        }
        return (C136366eG) obj;
    }

    public C163147pj(C129076Ev r5, float f) {
        C15020mZ A05 = C15040mb.A05(0, r5.A02());
        ArrayList A0J = C36321k7.A0J(A05);
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            A0J.add(new C136366eG(f, r5.A01(((C12260hl) it).A00())));
        }
        this.A00 = A0J;
    }

    public C163147pj(C161417ms r2) {
        this.A00 = r2;
    }
}
