package X;

import com.whatsapp.accountswitching.AccountSwitchingContentProvider;
import com.whatsapp.util.Log;

/* renamed from: X.7OX  reason: invalid class name */
public final class AnonymousClass7OX extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C10810fG $makeActiveLid;
    public final /* synthetic */ C10810fG $removeAccountLid;
    public final /* synthetic */ AccountSwitchingContentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OX(AccountSwitchingContentProvider accountSwitchingContentProvider, C10810fG r3, C10810fG r4) {
        super(0);
        this.this$0 = accountSwitchingContentProvider;
        this.$makeActiveLid = r3;
        this.$removeAccountLid = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean A09 = C90474aD.A0Q(this.this$0).A09((String) this.$makeActiveLid.element);
        C36321k7.A1X("AccountSwitchingContentProvider/call/remove account action/dataRepoOps/success: ", AnonymousClass000.A0u(), A09);
        if (!A09) {
            Log.i("AccountSwitchingContentProvider/call/remove account action/dataRepoOps/autocorrecting accounts file");
            String A05 = C90474aD.A0Q(this.this$0).A05();
            if (A05 != null) {
                C90474aD.A0Q(this.this$0).A09(A05);
                StringBuilder A0u = AnonymousClass000.A0u();
                C36321k7.A1a(A0u, C90524aI.A0g("AccountSwitchingContentProvider/call/remove account action/dataRepoOps/removing account ", A05, A0u));
            }
        }
        if (AnonymousClass00C.A0J(this.$removeAccountLid.element, AnonymousClass1Z0.A00(C90474aD.A0Q(this.this$0)).A00)) {
            Log.i("AccountSwitchingContentProvider/call/remove account action/removing paymentsOnboardedLid");
            C90474aD.A0Q(this.this$0).A07((String) null);
        }
        return AnonymousClass0AJ.A00;
    }
}
