package X;

import java.util.Iterator;

/* renamed from: X.4BX  reason: invalid class name */
public final class AnonymousClass4BX extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass39C this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4BX(AnonymousClass39C r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass39C r3 = this.this$0;
        int i = r3.A00 + 1;
        Object[] objArr = new C019108d[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        Iterator it = r3.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass011 r2 = (AnonymousClass011) it.next();
            objArr[AnonymousClass000.A0I(r2.first)] = r2.second;
        }
        return objArr;
    }
}
