package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.8pN  reason: invalid class name and case insensitive filesystem */
public class C182618pN extends C182688pU {
    public C166457vs A00;

    public /* bridge */ /* synthetic */ CharSequence A06(AnonymousClass141 r5, AnonymousClass3T1 r6) {
        CharSequence A01 = C166417vl.A01(r5, r6, this);
        C20810yC r1 = this.A08;
        AnonymousClass00C.A0D(r1, 0);
        boolean A0E = r1.A0E(3223);
        int i = R.drawable.msg_status_poll;
        if (A0E) {
            i = R.drawable.msg_status_poll_v2;
        }
        return AnonymousClass3TZ.A04(A01, C165597tg.A0a(C165587tf.A0D(getContext(), i), this.A01, getContext().getString(R.string.f12nameremoved)));
    }

    public void A0A(AnonymousClass2bS r2, List list) {
        super.A09(r2, list);
        this.A00.setMessage(r2, list);
    }

    public C182618pN(Context context, C33301f4 r2) {
        super(context, r2);
    }
}
