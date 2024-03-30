package X;

import android.content.Context;
import android.text.Html;
import com.whatsapp.R;

/* renamed from: X.1fj  reason: invalid class name and case insensitive filesystem */
public class C33661fj extends C33641fh {
    public static int A04 = 7;
    public final C19420v0 A00;
    public final C24631De A01;
    public final AnonymousClass1EU A02;
    public final C19970wo A03;

    public C33661fj(C19970wo r1, C19420v0 r2, C20810yC r3, AnonymousClass1EZ r4, C24631De r5, AnonymousClass1EV r6, AnonymousClass1EU r7) {
        super(r3, r4, r6);
        this.A03 = r1;
        this.A02 = r7;
        this.A00 = r2;
        this.A01 = r5;
    }

    public CharSequence A01(Context context, int i) {
        if (!C20800yB.A01(C21000yV.A02, this.A00, 6066) || !C202159l8.A0F.equals(this.A01.A02())) {
            return super.A01(context, R.string.f12nameremoved);
        }
        return Html.fromHtml(context.getString(R.string.f12nameremoved));
    }
}
