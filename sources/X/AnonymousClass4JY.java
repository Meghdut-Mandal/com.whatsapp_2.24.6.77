package X;

import com.whatsapp.R;
import com.whatsapp.conversation.EditMessageActivity;

/* renamed from: X.4JY  reason: invalid class name */
public final class AnonymousClass4JY extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ EditMessageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4JY(EditMessageActivity editMessageActivity) {
        super(1);
        this.this$0 = editMessageActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        AnonymousClass00C.A0D(str, 0);
        if (str.equals(C52242p7.ExitEditExpired.value)) {
            EditMessageActivity editMessageActivity = this.this$0;
            C39001qm A00 = AnonymousClass3LW.A00(editMessageActivity);
            A00.A0d(R.string.f12nameremoved);
            C39001qm.A0A(A00, C36321k7.A0B(editMessageActivity.getResources(), editMessageActivity.A0D.A07(3272) / 60, 0, R.plurals.f10nameremoved));
            A00.A0b();
            EditMessageActivity.A0H(this.this$0, false);
        } else {
            if (str.equals(C52242p7.ExitWithChanges.value)) {
                this.this$0.setResult(-1);
            }
            this.this$0.finish();
        }
        return AnonymousClass0AJ.A00;
    }
}
