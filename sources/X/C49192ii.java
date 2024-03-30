package X;

import android.content.Context;
import android.widget.Toast;
import com.whatsapp.R;

/* renamed from: X.2ii  reason: invalid class name and case insensitive filesystem */
public final class C49192ii extends C132446Tt {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass1RU A02;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            AnonymousClass1RU r2 = this.A02;
            r2.A09.A1D(0);
            Toast.makeText(this.A01, R.string.f12nameremoved, 0).show();
            r2.A04.A0E("maybeSwitchToMostRecentAccount/no inactive accounts", (String) null, true);
            return;
        }
        this.A02.A0E(this.A01, str, (String) null, (AnonymousClass00S) null, this.A00, false, false, false);
    }

    public C49192ii(Context context, AnonymousClass1RU r2, int i) {
        this.A02 = r2;
        this.A01 = context;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return ((AnonymousClass1Z0) this.A02.A0D.get()).A05();
    }
}
