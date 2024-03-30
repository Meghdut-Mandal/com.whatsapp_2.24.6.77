package X;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* renamed from: X.AnR  reason: case insensitive filesystem */
public final class C22488AnR extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ B19 $listener;
    public final /* synthetic */ String $perfTimerName;
    public final /* synthetic */ C200079gZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22488AnR(B19 b19, C200079gZ r3, String str) {
        super(1);
        this.this$0 = r3;
        this.$perfTimerName = str;
        this.$listener = b19;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C200079gZ r0 = this.this$0;
        r0.A00 = (StandardIntegrityManager.StandardIntegrityTokenProvider) obj;
        r0.A04.A01(this.$perfTimerName, "_SUCCESS");
        B19 b19 = this.$listener;
        if (b19 != null) {
            b19.onSuccess();
        }
        return AnonymousClass0AJ.A00;
    }
}
