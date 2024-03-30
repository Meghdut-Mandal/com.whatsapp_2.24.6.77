package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.4qy  reason: invalid class name and case insensitive filesystem */
public final class C98154qy extends C132456Tu {
    public final long A00;
    public final C161287mV A01;
    public final C132456Tu A02;
    public final Class A03;
    public final String A04;

    public void A09(Context context, C120895sG r13, C123655wr r14, AnonymousClass68E r15, C132456Tu r16, Object obj, Object obj2, Object obj3, boolean z) {
        C36361kB.A1J(r13, 6, r15);
        this.A02.A09(context, r13, r14, r15, ((C98154qy) r16).A02, obj, obj2, obj3, z);
        super.A09(context, r13, r14, r15, r16, obj, obj2, obj3, z);
    }

    public void A0C(Context context, C120895sG r8, AnonymousClass68E r9, Object obj, Object obj2) {
        C36321k7.A0y(obj, r8);
        AnonymousClass00C.A0D(r9, 4);
        C132456Tu r0 = this.A02;
        Context context2 = context;
        r0.A0C(context2, r8, r9, obj, obj2);
        super.A0C(context, r8, r9, obj, obj2);
    }

    public void A0D(Context context, C120895sG r8, AnonymousClass68E r9, Object obj, Object obj2) {
        C120895sG r2 = r8;
        AnonymousClass68E r3 = r9;
        C36331k8.A1G(r8, 3, r9);
        Context context2 = context;
        Object obj3 = obj;
        Object obj4 = obj2;
        super.A0D(context2, r2, r3, obj3, obj4);
        this.A02.A0D(context2, r2, r3, obj3, obj4);
    }

    public void A0E(C1257261a r5) {
        AnonymousClass00C.A0D(r5, 0);
        C132456Tu r3 = this.A02;
        Map map = r3.A00;
        if (map != null) {
            C160347kr r2 = r5.A00;
            if (map.containsKey(r2.getClass())) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Binder ");
                A0u.append(r2.BB1());
                A0u.append(" already exists in the wrapped ");
                throw AnonymousClass000.A0c(r3.A08(), A0u);
            }
        }
        super.A0E(r5);
    }

    public C98154qy(C132456Tu r3) {
        super(r3.A02);
        Class<?> cls;
        this.A02 = r3;
        this.A00 = r3.A06();
        this.A01 = r3.A07();
        if (r3 instanceof C98154qy) {
            cls = ((C98154qy) r3).A03;
        } else {
            cls = r3.getClass();
        }
        this.A03 = cls;
        this.A04 = r3.A08();
    }
}
