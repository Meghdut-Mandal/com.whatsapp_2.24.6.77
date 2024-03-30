package X;

import java.util.List;

/* renamed from: X.7Ti  reason: invalid class name and case insensitive filesystem */
public final class C154737Ti extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C10810fG $awaiter;
    public final /* synthetic */ C136966fM this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154737Ti(C136966fM r2, C10810fG r3) {
        super(1);
        this.this$0 = r2;
        this.$awaiter = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C136966fM r1 = this.this$0;
        Object obj2 = r1.A03;
        C10810fG r0 = this.$awaiter;
        synchronized (obj2) {
            List list = r1.A01;
            Object obj3 = r0.element;
            if (obj3 == null) {
                throw C36331k8.A0d("awaiter");
            }
            list.remove((C118275nc) obj3);
        }
        return AnonymousClass0AJ.A00;
    }
}
