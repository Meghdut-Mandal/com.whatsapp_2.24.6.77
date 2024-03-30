package X;

import java.util.Iterator;

/* renamed from: X.7Rt  reason: invalid class name and case insensitive filesystem */
public final class C154327Rt extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C130466Le this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154327Rt(C130466Le r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        C130466Le r0 = this.this$0;
        synchronized (r0.A04) {
            Iterator it = r0.A05.iterator();
            while (it.hasNext()) {
                if (AnonymousClass00C.A0J((C121105sb) it.next(), obj)) {
                    it.remove();
                }
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
