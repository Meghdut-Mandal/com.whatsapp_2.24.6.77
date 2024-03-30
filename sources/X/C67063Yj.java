package X;

import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import java.util.List;

/* renamed from: X.3Yj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67063Yj implements View.OnClickListener {
    public static final /* synthetic */ C67063Yj A00 = new C67063Yj();

    public final void onClick(View view) {
        List list = AnonymousClass0D3.A0I;
        try {
            C36331k8.A12(VoipErrorDialogFragment.A05(new AnonymousClass3FU(), 9), (AnonymousClass01I) C24801Dv.A01(view.getContext(), AnonymousClass01I.class));
        } catch (IllegalStateException e) {
            Log.w(C36331k8.A0i("CallInfoButtonViewHolder/showCallIsFullDialog/Context not an activity: ", AnonymousClass000.A0u(), e));
        }
    }
}
