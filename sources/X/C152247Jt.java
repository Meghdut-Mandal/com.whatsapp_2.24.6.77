package X;

import java.util.List;

/* renamed from: X.7Jt  reason: invalid class name and case insensitive filesystem */
public final class C152247Jt extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass6YD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152247Jt(AnonymousClass6YD r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass6YD r4 = this.this$0;
        AnonymousClass6SP r3 = AnonymousClass6YD.A00(r4).A06;
        List list = r3.A00;
        AnonymousClass00C.A07(list);
        synchronized (list) {
            list.clear();
            C1497172m.A00(r3.A04, r3, 37);
        }
        r4.A0E.execute(new C1497172m(r4, 33));
        return AnonymousClass0AJ.A00;
    }
}
