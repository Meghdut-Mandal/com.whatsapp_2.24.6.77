package X;

import android.text.TextUtils;
import com.whatsapp.R;

/* renamed from: X.8qy  reason: invalid class name and case insensitive filesystem */
public class C183548qy extends C132446Tt {
    public final String A00;
    public final /* synthetic */ C167687yZ A01;

    public C183548qy(C167687yZ r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str = this.A00;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        AnonymousClass1EU r0 = this.A01.A0G;
        AnonymousClass1EU.A00(r0);
        return C165587tf.A0R(r0.A05, (String) null, str);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C202319lY r0;
        C202319lY r6 = (C202319lY) obj;
        C167687yZ r4 = this.A01;
        C24611Dc r2 = r4.A0L;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("onTransactionDetailData loaded: ");
        C165577te.A1E(r2, A0u, AnonymousClass000.A1V(r6));
        if (r6 != null) {
            r4.A06 = r6;
        }
        C202319lY r22 = r4.A07;
        String str = r22.A0H;
        if ((str == null || str.equals("0")) && (r0 = r4.A06) != null) {
            r22.A0H = r0.A0H;
        }
        r4.A0M.Boy(new C21705AWz(r4, R.string.f12nameremoved, 11));
    }
}
