package X;

import android.content.DialogInterface;
import com.whatsapp.calling.calllink.view.CallLinkActivity;
import com.whatsapp.calling.calllink.viewmodel.CallLinkViewModel;

/* renamed from: X.2Ff  reason: invalid class name and case insensitive filesystem */
public class C43152Ff extends AnonymousClass3FU {
    public final /* synthetic */ CallLinkActivity A00;

    public C43152Ff(CallLinkActivity callLinkActivity) {
        this.A00 = callLinkActivity;
    }

    public void A00() {
        CallLinkViewModel callLinkViewModel = this.A00.A06;
        CallLinkViewModel.A02(callLinkViewModel, CallLinkViewModel.A03(callLinkViewModel));
    }

    public void A01(DialogInterface dialogInterface) {
        this.A00.finish();
    }
}
