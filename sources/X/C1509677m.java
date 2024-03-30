package X;

import java.util.ArrayList;

/* renamed from: X.77m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1509677m implements C006302t {
    public final /* synthetic */ C594233w A00;
    public final /* synthetic */ C594233w A01;
    public final /* synthetic */ C594233w A02;

    public /* synthetic */ C1509677m(C594233w r1, C594233w r2, C594233w r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final Object invoke(Object obj) {
        ArrayList A0I;
        C100674vP r3;
        C160377ku r2;
        C594233w r5 = this.A00;
        C594233w r22 = this.A01;
        C594233w r1 = this.A02;
        C111465cK r7 = (C111465cK) obj;
        if (r7 instanceof C106215Iu) {
            A0I = AnonymousClass001.A0I();
            A0I.add(((C106215Iu) r7).A00);
            r3 = r5.A00;
            r2 = r5.A01;
        } else {
            if (r7 instanceof C106225Iv) {
                AnonymousClass6JI.A01(r22.A01, r22.A00);
            } else if (r7 instanceof C106205It) {
                A0I = AnonymousClass001.A0I();
                A0I.add(((C106205It) r7).A00);
                r3 = r1.A00;
                r2 = r1.A01;
            }
            return AnonymousClass0AJ.A00;
        }
        new C1502474n(r3, r2, A0I, 6).run();
        return AnonymousClass0AJ.A00;
    }
}
