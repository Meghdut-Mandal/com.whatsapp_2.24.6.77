package X;

import com.whatsapp.usernames.UsernameSearchManager$setSearchSource$2$1;
import java.util.concurrent.CancellationException;

/* renamed from: X.4Ll  reason: invalid class name and case insensitive filesystem */
public final class C86574Ll extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C61123Aq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86574Ll(C61123Aq r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        String str2 = (String) obj;
        AnonymousClass00C.A0B(str2);
        String A0y = C36371kC.A0y(str2);
        int length = A0y.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (A0y.charAt(i) != '@') {
                    str = A0y.substring(i);
                    AnonymousClass00C.A08(str);
                    break;
                }
                i++;
            } else {
                str = "";
                break;
            }
        }
        C007403e r0 = this.this$0.A01;
        if (r0 != null) {
            r0.B2S((CancellationException) null);
        }
        this.this$0.A02.A0C(C023409w.A00);
        if (C56512wP.A00.A03(str)) {
            C61123Aq r2 = this.this$0;
            r2.A01 = C36391kE.A12(new UsernameSearchManager$setSearchSource$2$1(r2, str, (C023509x) null), r2.A08);
        }
        return AnonymousClass0AJ.A00;
    }
}
