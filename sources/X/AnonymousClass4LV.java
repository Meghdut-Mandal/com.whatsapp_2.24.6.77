package X;

import com.whatsapp.updates.ui.adapter.UpdatesAdapter;

/* renamed from: X.4LV  reason: invalid class name */
public final class AnonymousClass4LV extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ UpdatesAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LV(UpdatesAdapter updatesAdapter) {
        super(1);
        this.this$0 = updatesAdapter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C65423Rz r1;
        C51642o9 r0;
        C48072gf r4 = (C48072gf) obj;
        AnonymousClass00C.A0D(r4, 0);
        C65353Rs r2 = (C65353Rs) this.this$0.A0O.get();
        AnonymousClass3HM r12 = r4.A00;
        if (r12 instanceof C48542hU) {
            C65353Rs.A01(r2, 1);
            r1 = r2.A03;
            r0 = C51642o9.ARCHIVE;
        } else {
            if (r12 instanceof C48562hW) {
                r1 = r2.A03;
                r0 = C51642o9.UPDATES;
            }
            return AnonymousClass0AJ.A00;
        }
        r1.A02(r0);
        return AnonymousClass0AJ.A00;
    }
}
