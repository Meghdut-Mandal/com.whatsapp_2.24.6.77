package X;

import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.4Jm  reason: invalid class name and case insensitive filesystem */
public final class C86064Jm extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C43572Is this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86064Jm(C43572Is r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3HR r7 = (AnonymousClass3HR) obj;
        C43572Is r5 = this.this$0;
        AnonymousClass00C.A0B(r7);
        r5.setVisibility(0);
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(C36361kB.A0m(r5.getContext(), R.string.f12nameremoved));
        String A0B = C36321k7.A0B(r5.A00.getResources(), r7.A00, 0, R.plurals.f10nameremoved);
        AnonymousClass00C.A08(A0B);
        A0I.add(A0B);
        r5.A0I(C36381kD.A0x(" • ", A0I));
        return AnonymousClass0AJ.A00;
    }
}
