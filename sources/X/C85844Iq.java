package X;

import com.whatsapp.chatlock.search.ChatLockContactSearchManager$setSearchSource$2$1;
import java.util.concurrent.CancellationException;

/* renamed from: X.4Iq  reason: invalid class name and case insensitive filesystem */
public final class C85844Iq extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass3AB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85844Iq(AnonymousClass3AB r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C007403e r0 = this.this$0.A01;
        if (r0 != null) {
            r0.B2S((CancellationException) null);
        }
        C36341k9.A19(this.this$0.A02, false);
        C63603Kr r02 = this.this$0.A04;
        AnonymousClass00C.A0B(str);
        if (AnonymousClass00C.A0J(r02.A00(str), AnonymousClass2Ec.A00)) {
            AnonymousClass3AB r2 = this.this$0;
            r2.A01 = C36391kE.A12(new ChatLockContactSearchManager$setSearchSource$2$1(r2, str, (C023509x) null), r2.A06);
        }
        return AnonymousClass0AJ.A00;
    }
}
