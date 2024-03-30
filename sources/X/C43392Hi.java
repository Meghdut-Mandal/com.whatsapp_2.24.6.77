package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.2Hi  reason: invalid class name and case insensitive filesystem */
public final class C43392Hi extends AnonymousClass2I3 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43392Hi(Context context, C89004Uw r3, C62643Gy r4, AnonymousClass2bI r5) {
        super(context, r3, r4, r5);
        AnonymousClass00C.A0D(context, 1);
    }

    public void A2I() {
        super.A2I();
        String A0H = this.A0n.A0H(this.A03);
        if (this.A0n.A0g(this.A03, -1)) {
            if (this.A03.A0K() != null) {
                A0H = this.A03.A0K();
            } else {
                AnonymousClass141 r2 = this.A03;
                String str = r2.A0a;
                if (!(str == null || str.length() == 0)) {
                    A0H = AnonymousClass171.A03(this.A0n, r2, R.string.f12nameremoved);
                }
            }
        }
        this.A07.setText(A0H);
    }
}
