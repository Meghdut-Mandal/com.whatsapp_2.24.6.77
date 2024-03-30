package X;

/* renamed from: X.6MY  reason: invalid class name */
public final class AnonymousClass6MY {
    public AnonymousClass17Y A00;
    public AnonymousClass005 A01;

    public final void A01(C158077fl r12, C158077fl r13, Object obj, String str, String str2, String str3, int i) {
        AnonymousClass005 r0 = this.A01;
        if (r0 != null) {
            AnonymousClass1UA A0M = C90524aI.A0M(r0);
            AnonymousClass6P0 r2 = C113435fX.A00;
            C158077fl r8 = r13;
            Object obj2 = obj;
            if (A0M.A00(r2) != null) {
                A00(this, r13, obj);
                return;
            }
            AnonymousClass005 r02 = this.A01;
            if (r02 != null) {
                C90524aI.A0M(r02).A03(new C164047rB(this, r12, r8, obj2, 0), r2, C128936Ee.A00(), Integer.valueOf(i), str, str2, str3);
                return;
            }
            throw C36331k8.A0d("fbUserEntityManagementLazy");
        }
        throw C36331k8.A0d("fbUserEntityManagementLazy");
    }

    public static final void A00(AnonymousClass6MY r1, C158077fl r2, Object obj) {
        AnonymousClass17Y r12 = r1.A00;
        if (r12 != null) {
            r12.Bp3(AnonymousClass74N.A00(obj, r2, 35));
            return;
        }
        throw C36321k7.A06();
    }
}
