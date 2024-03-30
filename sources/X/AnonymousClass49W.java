package X;

import com.whatsapp.community.communityInfo.CAGInfoViewModel;

/* renamed from: X.49W  reason: invalid class name */
public final class AnonymousClass49W extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CAGInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass49W(CAGInfoViewModel cAGInfoViewModel) {
        super(0);
        this.this$0 = cAGInfoViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CAGInfoViewModel cAGInfoViewModel = this.this$0;
        AnonymousClass147 r2 = cAGInfoViewModel.A03;
        if (r2 != null) {
            return new C71883hU(new C90274Zt(cAGInfoViewModel, 0), r2);
        }
        throw C36331k8.A0d("cagJid");
    }
}
