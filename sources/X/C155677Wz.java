package X;

import java.util.List;

/* renamed from: X.7Wz  reason: invalid class name and case insensitive filesystem */
public final class C155677Wz extends AnonymousClass00R implements C006302t {
    public static final C155677Wz A00 = new C155677Wz();

    public C155677Wz() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list;
        List list2;
        String str;
        List A0m = C90524aI.A0m(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object A0r = C90514aH.A0r(A0m);
        AnonymousClass7bL r7 = AnonymousClass6JC.A01;
        List list3 = null;
        if (AnonymousClass00C.A0J(A0r, false) || A0r == null) {
            list = null;
        } else {
            list = (List) C137206fl.A00(r7, A0r);
        }
        Object obj2 = A0m.get(2);
        if (AnonymousClass00C.A0J(obj2, false) || obj2 == null) {
            list2 = null;
        } else {
            list2 = (List) C137206fl.A00(r7, obj2);
        }
        Object obj3 = A0m.get(0);
        if (obj3 != null) {
            str = (String) obj3;
        } else {
            str = null;
        }
        AnonymousClass00C.A0B(str);
        if (list == null) {
            list = null;
        } else if (list.isEmpty()) {
            list = null;
        }
        if (list2 == null) {
            list2 = null;
        } else if (list2.isEmpty()) {
            list2 = null;
        }
        Object obj4 = A0m.get(3);
        if (!AnonymousClass00C.A0J(obj4, false) && obj4 != null) {
            list3 = (List) C137206fl.A00(r7, obj4);
        }
        return new AnonymousClass72L(str, list, list2, list3);
    }
}
