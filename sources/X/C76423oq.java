package X;

import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.3oq  reason: invalid class name and case insensitive filesystem */
public class C76423oq implements C161317mY {
    public final /* synthetic */ AnonymousClass2M8 A00;

    public /* synthetic */ void BRG(String str) {
    }

    public /* synthetic */ void BRi(String str) {
    }

    public /* synthetic */ void BRj(String str, Map map) {
    }

    public C76423oq(AnonymousClass2M8 r1) {
        this.A00 = r1;
    }

    public void BRg(String str) {
        AnonymousClass2M8 r2 = this.A00;
        AnonymousClass3H8 r1 = r2.A0A;
        if (r1 != null) {
            r2.A05 = true;
            r1.A01(8);
            int i = r2.A00;
            if (i == 3) {
                AnonymousClass2M8.A05(r2, i);
            }
        }
    }

    public void BRh() {
        AnonymousClass2M8 r3 = this.A00;
        if (r3.A05) {
            C99304t3.A00(r3.A05, R.string.f12nameremoved, 0).A0P();
            r3.A05 = false;
        }
    }

    public void BRk(boolean z, boolean z2) {
        AnonymousClass2M8 r2 = this.A00;
        AnonymousClass3H8 r1 = r2.A0A;
        if (r1 != null) {
            r1.A01(0);
            if (z) {
                AnonymousClass2M8.A05(r2, 3);
            }
        }
    }
}
