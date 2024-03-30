package X;

/* renamed from: X.2sc  reason: invalid class name and case insensitive filesystem */
public class C54232sc implements AnonymousClass4U5 {
    public Object A00;
    public final int A01;

    public C54232sc(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onError(int i) {
        if (this.A01 != 0) {
            AnonymousClass3OG r1 = (AnonymousClass3OG) this.A00;
            AnonymousClass3OG.A00(r1, r1.A0F.decrementAndGet());
            return;
        }
        C36321k7.A1S("LinkExistingGroupsUseCase/LinkSubgroupsProtocolHelper/error = ", AnonymousClass000.A0u(), i);
        ((C023509x) this.A00).resumeWith(new C46212Vn(i));
    }
}
