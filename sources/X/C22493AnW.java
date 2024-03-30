package X;

import com.whatsapp.util.Log;

/* renamed from: X.AnW  reason: case insensitive filesystem */
public final class C22493AnW extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ boolean $shouldKeepUseSmsRetrieverValue;
    public final /* synthetic */ C23045B1q $startSmsRetrieverListener;
    public final /* synthetic */ C19420v0 $waSharedPreferences;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22493AnW(C19420v0 r2, C23045B1q b1q, boolean z) {
        super(1);
        this.$shouldKeepUseSmsRetrieverValue = z;
        this.$waSharedPreferences = r2;
        this.$startSmsRetrieverListener = b1q;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Log.i("SmsRetrieverUtils/maybeUseSmsRetriever/onsuccess");
        if (this.$shouldKeepUseSmsRetrieverValue) {
            C36331k8.A0w(C19420v0.A00(this.$waSharedPreferences), "registration_use_sms_retriever", true);
        }
        this.$startSmsRetrieverListener.Bus();
        return AnonymousClass0AJ.A00;
    }
}
