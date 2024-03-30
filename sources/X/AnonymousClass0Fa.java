package X;

import android.content.Context;
import android.view.ActionProvider;

/* renamed from: X.0Fa  reason: invalid class name */
public class AnonymousClass0Fa extends AnonymousClass0Gt implements ActionProvider.VisibilityListener {
    public C15730nt A00;
    public final /* synthetic */ AnonymousClass0FY A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0Fa(Context context, ActionProvider actionProvider, AnonymousClass0FY r3) {
        super(context, actionProvider, r3);
        this.A01 = r3;
    }

    public void onActionProviderVisibilityChanged(boolean z) {
        C15730nt r0 = this.A00;
        if (r0 != null) {
            C016307a r1 = ((C09690cm) r0).A00.A0A;
            r1.A0B = true;
            r1.A0E(true);
        }
    }
}
