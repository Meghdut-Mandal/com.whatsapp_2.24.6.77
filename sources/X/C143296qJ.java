package X;

import java.util.List;

/* renamed from: X.6qJ  reason: invalid class name and case insensitive filesystem */
public class C143296qJ implements C158057fj {
    public final /* synthetic */ C100674vP A00;
    public final /* synthetic */ C140456lc A01;
    public final /* synthetic */ C142326oh A02;

    public C143296qJ(C100674vP r1, C140456lc r2, C142326oh r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public String A00() {
        C140456lc r3 = this.A01;
        if (r3 == null) {
            return null;
        }
        C160377ku A0X = r3.A0X(135);
        if (A0X != null) {
            Object A002 = AnonymousClass6JI.A00(this.A00, AnonymousClass6MO.A01, A0X);
            if (A002 instanceof List) {
                List list = (List) A002;
                if (list.size() >= 2) {
                    return C90474aD.A0i(list);
                }
            }
        }
        return C140456lc.A0K(r3);
    }

    public C140456lc B7w() {
        return this.A01;
    }
}
