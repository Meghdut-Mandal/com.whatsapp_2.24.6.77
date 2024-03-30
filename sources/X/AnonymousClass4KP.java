package X;

import com.whatsapp.interopui.compose.InteropComposeSelectIntegratorActivity;
import java.util.List;

/* renamed from: X.4KP  reason: invalid class name */
public final class AnonymousClass4KP extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ InteropComposeSelectIntegratorActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KP(InteropComposeSelectIntegratorActivity interopComposeSelectIntegratorActivity) {
        super(1);
        this.this$0 = interopComposeSelectIntegratorActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C40601vo r0 = this.this$0.A01;
        if (r0 == null) {
            throw C36331k8.A0d("integratorsAdapter");
        }
        C36361kB.A1I(list);
        r0.A00 = list;
        r0.A06();
        return AnonymousClass0AJ.A00;
    }
}
