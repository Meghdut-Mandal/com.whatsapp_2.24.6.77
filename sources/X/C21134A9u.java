package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.jid.Jid;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

/* renamed from: X.A9u  reason: case insensitive filesystem */
public final class C21134A9u implements C87734Py {
    public final C19700wN A00;
    public final C32691e2 A01;
    public final C20810yC A02;
    public final C30801an A03;

    public void BlQ(Context context, AnonymousClass3T1 r16, C207219uk r17, int i) {
        C19700wN r1;
        String str;
        String str2;
        C206679tn r0 = r17.A06;
        if (r0 == null || (str2 = r0.A02) == null) {
            r1 = this.A00;
            str = "missing content/shopId";
        } else {
            String A19 = C36431kI.A19(this.A02, 1054);
            if (A19.length() == 0) {
                r1 = this.A00;
                str = "missing url format";
            } else {
                C32691e2 r2 = this.A01;
                Locale locale = Locale.US;
                Objects.requireNonNull(A19);
                String format = String.format(locale, A19, Arrays.copyOf(new Object[]{str2}, 1));
                AnonymousClass00C.A08(format);
                r2.Bp7(context, Uri.parse(format), (AnonymousClass3T1) null);
                this.A03.A00((Jid) null, (Integer) null, (String) null, (String) null, 5, 6, 33, false);
                return;
            }
        }
        r1.A0E("OpenShopAction/perform", str, false);
    }

    public C21134A9u(C19700wN r1, C32691e2 r2, C20810yC r3, C30801an r4) {
        C36321k7.A18(r3, r1, r2, r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }
}
