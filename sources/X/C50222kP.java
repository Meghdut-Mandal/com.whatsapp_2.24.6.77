package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2kP  reason: invalid class name and case insensitive filesystem */
public class C50222kP extends C132446Tt {
    public final AnonymousClass1NO A00;
    public final C88654Tn A01;
    public final Set A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        boolean z;
        Iterator it = this.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            AnonymousClass11F A0a = C36401kF.A0a(it);
            if (!C36431kI.A1Y(this)) {
                if (this.A00.A01(A0a) > 0) {
                    z = true;
                    break;
                }
            } else {
                return null;
            }
        }
        if (!C36431kI.A1Y(this)) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && !C36431kI.A1Y(this)) {
            this.A01.BJR(bool.booleanValue());
        }
    }

    public C50222kP(AnonymousClass1NO r2, AnonymousClass11F r3, C88654Tn r4) {
        this.A00 = r2;
        HashSet A16 = C36441kJ.A16();
        this.A02 = A16;
        A16.add(r3);
        this.A01 = r4;
    }

    public C50222kP(AnonymousClass1NO r2, C88654Tn r3, Set set) {
        this.A00 = r2;
        this.A02 = new HashSet(set);
        this.A01 = r3;
    }
}
