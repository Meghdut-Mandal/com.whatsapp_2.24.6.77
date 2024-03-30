package X;

import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.2jX  reason: invalid class name and case insensitive filesystem */
public final class C49692jX extends C132446Tt {
    public String A00;
    public String A01;
    public final C19730wQ A02;
    public final AnonymousClass171 A03;
    public final AnonymousClass141 A04;
    public final AnonymousClass1S7 A05;
    public final C006302t A06;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str;
        AnonymousClass171 r3 = this.A03;
        AnonymousClass141 r2 = this.A04;
        String A0H = r3.A0H(r2);
        if (!(!r3.A0g(r2, -1) || (str = r2.A0a) == null || str.length() == 0)) {
            A0H = AnonymousClass171.A03(r3, r2, R.string.f12nameremoved);
        }
        this.A00 = A0H;
        try {
            AUN A0F = C203559oI.A00().A0F(AnonymousClass3U8.A04(C36351kA.A0j(r2)), (String) null);
            String A012 = AnonymousClass1M4.A01(String.valueOf(A0F.countryCode_), String.valueOf(A0F.nationalNumber_));
            AnonymousClass00C.A08(A012);
            C19730wQ r0 = this.A02;
            r0.A0G();
            Me me = r0.A00;
            if (me == null || !A012.equals(AnonymousClass1M4.A01(me.cc, me.number))) {
                this.A01 = new Locale("", A012).getDisplayCountry(Locale.getDefault());
            }
        } catch (AnonymousClass172 e) {
            Log.w((Throwable) e);
        }
        if (!r2.A0C()) {
            return this.A05.A01(r2);
        }
        AnonymousClass3Q0 r1 = new AnonymousClass3Q0((AnonymousClass3QN) null, (C05250Oz) null, 0, 0, 7);
        r1.A00 = 0;
        return r1;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass3Q0 r4 = (AnonymousClass3Q0) obj;
        ArrayList A0l = C36341k9.A0l(r4);
        String str = this.A00;
        if (str != null) {
            A0l.add(new AnonymousClass2TS(str));
        }
        String str2 = this.A01;
        if (str2 != null) {
            A0l.add(new AnonymousClass2TR(str2));
        }
        if (r4.A00 != 0) {
            A0l.add(new AnonymousClass2TQ(r4));
        }
        this.A06.invoke(A0l);
    }

    public C49692jX(C19730wQ r1, AnonymousClass171 r2, AnonymousClass141 r3, AnonymousClass1S7 r4, C006302t r5) {
        C36321k7.A0x(r1, r2);
        this.A02 = r1;
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = r3;
        this.A06 = r5;
    }
}
