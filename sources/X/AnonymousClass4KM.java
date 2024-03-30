package X;

import com.whatsapp.R;
import com.whatsapp.inappsupport.ui.SupportAiActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4KM  reason: invalid class name */
public final class AnonymousClass4KM extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ SupportAiActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KM(SupportAiActivity supportAiActivity) {
        super(1);
        this.this$0 = supportAiActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Log.i("SupportAiActivity/showTicketCreationDialog");
        C39001qm A00 = AnonymousClass3LW.A00(this.this$0);
        A00.A0d(R.string.f12nameremoved);
        C39001qm.A08(A00, R.string.f12nameremoved);
        A00.A0e(new AnonymousClass4XV(this.this$0, 14));
        C39001qm.A06(this.this$0, A00, 29, R.string.f12nameremoved);
        A00.A0b();
        C33761ft r1 = this.this$0.A00;
        if (r1 != null) {
            r1.A02(7, (String) null);
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("supportLogger");
    }
}
