package X;

import android.content.Context;
import android.util.Pair;
import com.whatsapp.R;

/* renamed from: X.8rH  reason: invalid class name and case insensitive filesystem */
public class C183738rH extends C132446Tt {
    public final AnonymousClass17Y A00;
    public final C21159AAt A01;
    public final AnonymousClass9MU A02;
    public final AnonymousClass19A A03;
    public final String A04;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        this.A00.A02();
        AnonymousClass9MU r0 = this.A02;
        C199009eY r4 = r0.A01;
        String str = r0.A03;
        Context context = r0.A00;
        String str2 = r0.A04;
        AnonymousClass3T1 r1 = r0.A02;
        r4.A00 = null;
        if (pair != null) {
            r4.A05.A00.put(str, pair);
        }
        AnonymousClass00C.A0B(str);
        C199009eY.A00(context, pair, r4, str, str2, r1.A1J.A02);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            this.A03.A0B(32000);
            return this.A01.A02(C108515Tu.A0C, this.A04);
        } catch (C33111ej unused) {
            return null;
        }
    }

    public void A0A() {
        this.A00.A05(0, R.string.f12nameremoved);
    }

    public C183738rH(AnonymousClass17Y r1, C21159AAt aAt, AnonymousClass9MU r3, AnonymousClass19A r4, String str) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = aAt;
        this.A04 = str;
        this.A02 = r3;
    }
}
