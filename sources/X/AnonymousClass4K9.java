package X;

import android.os.Bundle;
import com.whatsapp.group.AddMembersRouter;

/* renamed from: X.4K9  reason: invalid class name */
public final class AnonymousClass4K9 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AddMembersRouter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4K9(AddMembersRouter addMembersRouter) {
        super(1);
        this.this$0 = addMembersRouter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        AnonymousClass011[] r1 = new AnonymousClass011[1];
        C36341k9.A1J("AddMembersSuccessJidList", obj, r1, 0);
        Bundle A00 = C05430Pr.A00(r1);
        AddMembersRouter addMembersRouter = this.this$0;
        if (addMembersRouter.A12()) {
            addMembersRouter.A0l().A0o("AddMembersSuccess", A00);
        }
        return AnonymousClass0AJ.A00;
    }
}
