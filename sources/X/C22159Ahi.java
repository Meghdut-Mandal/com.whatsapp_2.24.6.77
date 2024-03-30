package X;

import java.util.Iterator;

/* renamed from: X.Ahi  reason: case insensitive filesystem */
public final class C22159Ahi extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass9MY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22159Ahi(AnonymousClass9MY r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass9MY r3 = this.this$0;
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
