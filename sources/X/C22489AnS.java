package X;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.android.play.core.integrity.br;

/* renamed from: X.AnS  reason: case insensitive filesystem */
public final class C22489AnS extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ B1A $listener;
    public final /* synthetic */ String $perfTimerName;
    public final /* synthetic */ C200079gZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22489AnS(B1A b1a, C200079gZ r3, String str) {
        super(1);
        this.this$0 = r3;
        this.$perfTimerName = str;
        this.$listener = b1a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A04.A01(this.$perfTimerName, "_SUCCESS");
        B1A b1a = this.$listener;
        String str = ((br) ((StandardIntegrityManager.StandardIntegrityToken) obj)).a;
        AnonymousClass00C.A08(str);
        b1a.BiD(str);
        return AnonymousClass0AJ.A00;
    }
}
