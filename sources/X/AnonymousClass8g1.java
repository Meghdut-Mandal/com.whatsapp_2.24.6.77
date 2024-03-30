package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.8g1  reason: invalid class name */
public class AnonymousClass8g1 extends AnonymousClass5MM {
    public final int A00;
    public final C194919Rt A01;
    public final B1H A02;
    public final List A03;

    public AnonymousClass8g1(C19600wD r7, C24601Db r8, C29121Vk r9, C194919Rt r10, B1H b1h, C117705mh r12, C111495cN r13, List list, int i) {
        super(r7, r8, r9, r12, r13);
        this.A03 = list;
        this.A02 = b1h;
        this.A00 = i;
        this.A01 = r10;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C202059ky A002;
        AnonymousClass00I r7 = (AnonymousClass00I) obj;
        String str = (String) r7.A00;
        C202059ky r4 = (C202059ky) r7.A01;
        B1H b1h = this.A02;
        if (b1h != null) {
            if (str == null) {
                Log.i(C24611Dc.A01("PinTokenizer", AnonymousClass000.A0l(r4, "PaymentPinTokenTask token error: ", AnonymousClass000.A0u())));
                if (r4 != null) {
                    A002 = r4;
                } else {
                    A002 = C202059ky.A00();
                }
                b1h.BWg(A002);
            } else {
                b1h.BiD(str);
            }
        }
        C194919Rt r1 = this.A01;
        if (r1 == null) {
            return;
        }
        if (str == null) {
            Log.i(C24611Dc.A01("PinTokenizer", AnonymousClass000.A0l(r4, "PaymentPinTokenTask token error: ", AnonymousClass000.A0u())));
            if (r4 == null) {
                r4 = C202059ky.A00();
            }
            if (C90504aG.A1Z(r1.A01)) {
                r1.A02.decrementAndGet();
                r1.A00.BWg(r4);
                return;
            }
            return;
        }
        r1.A00(this.A00, str);
    }

    public List A0G() {
        return this.A03;
    }
}
