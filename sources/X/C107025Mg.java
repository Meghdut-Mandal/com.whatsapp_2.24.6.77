package X;

import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.5Mg  reason: invalid class name and case insensitive filesystem */
public final class C107025Mg extends C132446Tt {
    public final AnonymousClass1GX A00;
    public final WeakReference A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107025Mg(AnonymousClass012 r2, AnonymousClass7fN r3, AnonymousClass1GX r4) {
        super(r2, true);
        AnonymousClass00C.A0D(r4, 3);
        this.A00 = r4;
        this.A01 = AnonymousClass001.A0F(r3);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass011 r4 = (AnonymousClass011) obj;
        AnonymousClass00C.A0D(r4, 0);
        AnonymousClass7fN r2 = (AnonymousClass7fN) this.A01.get();
        if (r2 != null) {
            r2.BaW((File) r4.first, (String) r4.second);
        }
    }
}
