package X;

import com.whatsapp.community.communityInfo.CAGInfoViewModel;

/* renamed from: X.4J9  reason: invalid class name */
public final class AnonymousClass4J9 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CAGInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4J9(CAGInfoViewModel cAGInfoViewModel) {
        super(1);
        this.this$0 = cAGInfoViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C601836u r6 = (C601836u) obj;
        AnonymousClass00C.A0D(r6, 0);
        CAGInfoViewModel cAGInfoViewModel = this.this$0;
        AnonymousClass1NN r3 = cAGInfoViewModel.A0J;
        AnonymousClass141 r2 = cAGInfoViewModel.A00;
        if (r2 == null) {
            throw C36331k8.A0d("cagChat");
        }
        AnonymousClass147 r1 = cAGInfoViewModel.A03;
        if (r1 == null) {
            throw C36331k8.A0d("cagJid");
        }
        cAGInfoViewModel.A04 = r3.A01(r2, r1, r6.A02);
        CAGInfoViewModel.A01(cAGInfoViewModel);
        return AnonymousClass0AJ.A00;
    }
}
