package X;

import com.whatsapp.R;
import com.whatsapp.inappsupport.ui.SupportAiActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4KJ  reason: invalid class name */
public final class AnonymousClass4KJ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ SupportAiActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KJ(SupportAiActivity supportAiActivity) {
        super(1);
        this.this$0 = supportAiActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Log.i("SupportAiActivity/showFallbackEmailDialog");
        C39001qm A00 = AnonymousClass3LW.A00(this.this$0);
        A00.A0d(R.string.f12nameremoved);
        C39001qm.A08(A00, R.string.f12nameremoved);
        C39001qm.A06(this.this$0, A00, 28, R.string.f12nameremoved);
        A00.A0e(new AnonymousClass4XV(this.this$0, 13));
        SupportAiActivity supportAiActivity = this.this$0;
        A00.A0l(supportAiActivity, new C66023Uj(supportAiActivity, 27), R.string.f12nameremoved);
        A00.A0b();
        C33761ft r1 = this.this$0.A00;
        if (r1 != null) {
            r1.A02(4, (String) null);
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("supportLogger");
    }
}
