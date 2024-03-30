package X;

import java.util.Date;

/* renamed from: X.7Sr  reason: invalid class name and case insensitive filesystem */
public final class C154567Sr extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass67O this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154567Sr(AnonymousClass67O r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (AnonymousClass000.A1X(obj)) {
            int i = this.this$0.A00().A00;
            AnonymousClass67O r0 = this.this$0;
            if (i == 0) {
                AnonymousClass1KW r2 = r0.A02;
                C36341k9.A0u(C90504aG.A0H(r2.A00), "flows_target_cleanup_date");
                C36341k9.A0u(C90504aG.A0H(r2.A00), "flows_need_cleanup_after_target_date");
            } else {
                this.this$0.A01(new AnonymousClass6AD(new Date(System.currentTimeMillis() + ((long) (r0.A00 * 1000))), 0));
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
