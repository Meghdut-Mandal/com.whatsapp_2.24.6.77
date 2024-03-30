package X;

import com.whatsapp.util.Log;

/* renamed from: X.7UP  reason: invalid class name */
public final class AnonymousClass7UP extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ int $retryAttempts;
    public final /* synthetic */ C90924bA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UP(C90924bA r2, int i) {
        super(1);
        this.this$0 = r2;
        this.$retryAttempts = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Log.i("SMSRetrieverReceiver/onReceive/re-registered sms retriever client");
        C36341k9.A0v(C19420v0.A00(this.this$0.A01), "sms_retriever_retry_count", this.$retryAttempts + 1);
        return AnonymousClass0AJ.A00;
    }
}
