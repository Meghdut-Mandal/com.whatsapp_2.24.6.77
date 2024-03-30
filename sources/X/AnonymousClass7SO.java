package X;

import java.util.List;

/* renamed from: X.7SO  reason: invalid class name */
public final class AnonymousClass7SO extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass6YD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7SO(AnonymousClass6YD r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        AnonymousClass6YD r4 = this.this$0;
        AnonymousClass6SP r3 = AnonymousClass6YD.A00(r4).A06;
        List list = r3.A00;
        AnonymousClass00C.A07(list);
        synchronized (list) {
            list.remove(obj);
            C1497172m.A00(r3.A04, r3, 36);
        }
        r4.A0E.execute(new C1497172m(r4, 34));
        return AnonymousClass0AJ.A00;
    }
}
