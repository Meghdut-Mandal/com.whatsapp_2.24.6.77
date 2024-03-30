package X;

import com.whatsapp.CircleWaImageView;
import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.7p4  reason: invalid class name and case insensitive filesystem */
public class C162737p4 extends C226815j {
    public Object A00;
    public Object A01;
    public final int A02;

    public C162737p4(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A04(AnonymousClass11F r5) {
        AnonymousClass1RY r3;
        AnonymousClass141 r2;
        CircleWaImageView circleWaImageView;
        if (this.A02 != 0) {
            String str = ((AnonymousClass51O) this.A01).A00.A0F;
            if (r5.equals(Jid.Companion.A02(str))) {
                AnonymousClass5FG r1 = (AnonymousClass5FG) this.A00;
                List list = AnonymousClass0D3.A0I;
                r3 = r1.A09;
                r2 = new AnonymousClass141(C36421kH.A0N(str));
                circleWaImageView = r1.A04;
            } else {
                return;
            }
        } else {
            AnonymousClass5E4 r22 = (AnonymousClass5E4) this.A01;
            if (r5.equals(Jid.Companion.A02(r22.A03))) {
                AnonymousClass5FE r12 = (AnonymousClass5FE) this.A00;
                List list2 = AnonymousClass0D3.A0I;
                r3 = r12.A01;
                r2 = r22.A01;
                circleWaImageView = r12.A02;
            } else {
                return;
            }
        }
        r3.A0B(circleWaImageView, r2, false);
    }
}
