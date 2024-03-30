package X;

/* renamed from: X.7TM  reason: invalid class name */
public final class AnonymousClass7TM extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C121855tp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TM(C121855tp r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        Object invoke;
        AnonymousClass0T4 r3 = (AnonymousClass0T4) obj;
        AnonymousClass00C.A0D(r3, 0);
        C06610Uh A09 = r3.A02.A09(1);
        if (A09 != null) {
            str = A09.A00;
        } else {
            str = null;
        }
        C03010Cu r0 = (C03010Cu) this.this$0.A01.get(str);
        if (r0 != null && (invoke = ((AnonymousClass00S) r0).invoke()) != null) {
            return invoke;
        }
        String group = r3.A01.group();
        AnonymousClass00C.A08(group);
        return group;
    }
}
