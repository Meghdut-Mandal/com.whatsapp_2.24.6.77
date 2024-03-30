package X;

import java.util.List;

/* renamed from: X.Al1  reason: case insensitive filesystem */
public final class C22339Al1 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass8AB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22339Al1(AnonymousClass8AB r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        AnonymousClass00C.A0D(list, 0);
        AnonymousClass8AB r2 = this.this$0;
        AnonymousClass88C r0 = (AnonymousClass88C) C007103b.A0M(list);
        if (r0 != null) {
            String str = r0.A08;
            if (str != null) {
                r2.A00.A02 = str;
            }
            AnonymousClass84B r3 = r2.A00;
            C23090B4a b4a = r3.A0H;
            if (b4a != null) {
                b4a.BPK("wifi_direct_connected");
            }
            AnonymousClass81Q.A01(r3.A0G, r3, AnonymousClass84B.A0S, 11);
        }
        return AnonymousClass0AJ.A00;
    }
}
