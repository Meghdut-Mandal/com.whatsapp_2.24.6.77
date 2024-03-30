package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.AAr  reason: case insensitive filesystem */
public class C21157AAr implements AnonymousClass4T4 {
    public final /* synthetic */ C207119ua A00;
    public final /* synthetic */ C206349tD A01;
    public final /* synthetic */ C23043B1o A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ BrazilOrderDetailsActivity A04;

    public void BhX() {
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A04;
        brazilOrderDetailsActivity.Bnv();
        String str = brazilOrderDetailsActivity.A0o;
        if (str == null) {
            BrazilPaymentActivity.A17(this.A00.A02, brazilOrderDetailsActivity, this.A01, "p2m_context", this.A03);
        } else {
            brazilOrderDetailsActivity.A09.A00(new C1503574y(this, this.A00, this.A01, this.A03, 19), str);
        }
    }

    public C21157AAr(C207119ua r1, BrazilOrderDetailsActivity brazilOrderDetailsActivity, C206349tD r3, C23043B1o b1o, String str) {
        this.A04 = brazilOrderDetailsActivity;
        this.A02 = b1o;
        this.A00 = r1;
        this.A01 = r3;
        this.A03 = str;
    }

    public void Bha() {
        C207199ui r0;
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A04;
        brazilOrderDetailsActivity.Bnv();
        C23043B1o b1o = this.A02;
        C207219uk BA8 = b1o.BA8();
        if (BA8 != null && (r0 = BA8.A01) != null && r0.A09.A02 != null) {
            Resources resources = brazilOrderDetailsActivity.getResources();
            Object[] A0L = AnonymousClass001.A0L();
            long j = b1o.BA8().A01.A09.A02.A00;
            C18820ts r6 = brazilOrderDetailsActivity.A05;
            String A0w = C36411kG.A0w(resources, new SimpleDateFormat("HH:mm", C36401kF.A0x(r6)).format(new Date(j * 1000)), A0L, 0, R.string.f12nameremoved);
            C39001qm A002 = AnonymousClass3LW.A00(brazilOrderDetailsActivity);
            A002.A0r(false);
            A002.A0d(R.string.f12nameremoved);
            A002.A0p(A0w);
            A002.A0h((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            C36341k9.A11(A002);
        }
    }
}
