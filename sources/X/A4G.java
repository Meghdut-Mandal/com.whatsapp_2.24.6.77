package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.whatsapp.util.Log;

public final /* synthetic */ class A4G implements OnFailureListener {
    public final /* synthetic */ C19420v0 A00;
    public final /* synthetic */ C23045B1q A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ A4G(C19420v0 r1, C23045B1q b1q, boolean z) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = b1q;
    }

    public final void onFailure(Exception exc) {
        boolean z = this.A02;
        C19420v0 r1 = this.A00;
        C23045B1q b1q = this.A01;
        Log.e("SmsRetrieverUtils/maybeUseSmsRetriever/onfailure/ ", exc);
        if (z) {
            C36331k8.A0w(C19420v0.A00(r1), "registration_use_sms_retriever", false);
        }
        b1q.BmG();
    }
}
