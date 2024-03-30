package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Mk  reason: invalid class name and case insensitive filesystem */
public final class C86824Mk extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass4TP $callback;
    public final /* synthetic */ List $inviteeJids;
    public final /* synthetic */ List $results;
    public final /* synthetic */ C62403Ga this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86824Mk(AnonymousClass4TP r2, C62403Ga r3, List list, List list2) {
        super(1);
        this.$results = list;
        this.$inviteeJids = list2;
        this.this$0 = r3;
        this.$callback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        this.$results.add(obj);
        if (this.$results.size() == this.$inviteeJids.size()) {
            C62403Ga r2 = this.this$0;
            C81123wV.A00(r2.A01, r2, 10);
            List list = this.$results;
            ArrayList A0I = AnonymousClass001.A0I();
            for (Object next : list) {
                if (next instanceof AnonymousClass2YR) {
                    A0I.add(next);
                }
            }
            boolean A1a = C36401kF.A1a(A0I);
            AnonymousClass4TP r1 = this.$callback;
            if (A1a) {
                if (r1 != null) {
                    r1.BiG(this.$results);
                }
            } else if (r1 != null) {
                r1.BWt(this.$results);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
