package X;

import com.whatsapp.R;

/* renamed from: X.4MT  reason: invalid class name */
public final class AnonymousClass4MT extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $defaultBotLoadedCallback;
    public final /* synthetic */ C225314u $dialogActivity;
    public final /* synthetic */ AnonymousClass1K6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MT(C225314u r2, AnonymousClass1K6 r3, C006302t r4) {
        super(1);
        this.$dialogActivity = r2;
        this.$defaultBotLoadedCallback = r4;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.$dialogActivity.Bnv();
        if (obj != null) {
            this.$defaultBotLoadedCallback.invoke(obj);
        } else {
            this.this$0.A00.A06(R.string.f12nameremoved, 0);
        }
        return AnonymousClass0AJ.A00;
    }
}
