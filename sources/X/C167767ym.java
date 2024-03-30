package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7ym  reason: invalid class name and case insensitive filesystem */
public final class C167767ym extends AnonymousClass04R {
    public UserJid A00;
    public String A01;
    public String A02;
    public String A03 = "pincode";
    public final C001600r A04;
    public final AnonymousClass1KL A05;
    public final AnonymousClass16D A06;
    public final AnonymousClass185 A07;
    public final AnonymousClass171 A08;
    public final C28201Rs A09;
    public final C28201Rs A0A;
    public final C001700s A0B;
    public final C196699aO A0C;

    public static final void A03(C167767ym r11) {
        String str;
        C47862ft A012;
        Object[] A0L;
        int i;
        Object[] A0L2;
        int i2;
        Object[] A0L3;
        int i3;
        C001700s r2 = r11.A0B;
        String str2 = r11.A02;
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        boolean z = !A04(r11, A02(str2));
        AnonymousClass1KL r4 = r11.A05;
        if (!r4.A01()) {
            A012 = new C47862ft(new Object[0], R.string.f12nameremoved);
        } else {
            A012 = r11.A01();
        }
        String str3 = r11.A01;
        if (str3 == null) {
            str3 = "";
        }
        AnonymousClass9VU r5 = new AnonymousClass9VU(A012, str3);
        if (!r4.A01()) {
            A0L = new Object[0];
            i = R.string.f12nameremoved;
        } else {
            A0L = AnonymousClass001.A0L();
            A0L[0] = r11.A01();
            i = R.string.f12nameremoved;
        }
        C47862ft r6 = new C47862ft(A0L, i);
        if (!r4.A01()) {
            A0L2 = new Object[0];
            i2 = R.string.f12nameremoved;
        } else {
            A0L2 = AnonymousClass001.A0L();
            A0L2[0] = r11.A01();
            i2 = R.string.f12nameremoved;
        }
        C47862ft r7 = new C47862ft(A0L2, i2);
        if (!r4.A01()) {
            A0L3 = new Object[0];
            i3 = R.string.f12nameremoved;
        } else {
            A0L3 = AnonymousClass001.A0L();
            A0L3[0] = r11.A01();
            i3 = R.string.f12nameremoved;
        }
        r2.A0D(new AnonymousClass9X7(r5, r6, r7, new C47862ft(A0L3, i3), str, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        return new X.C47862ft(new java.lang.Object[0], r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r0 == false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C47862ft A01() {
        /*
            r3 = this;
            java.lang.String r2 = r3.A03
            int r0 = r2.hashCode()
            r1 = 0
            switch(r0) {
                case -2053263135: goto L_0x001f;
                case -129639349: goto L_0x0029;
                case 98382: goto L_0x0015;
                default: goto L_0x000a;
            }
        L_0x000a:
            r2 = 2131887703(0x7f120657, float:1.941002E38)
        L_0x000d:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.2ft r0 = new X.2ft
            r0.<init>(r1, r2)
            return r0
        L_0x0015:
            java.lang.String r0 = "cep"
            boolean r0 = r2.equals(r0)
            r2 = 2131887702(0x7f120656, float:1.9410019E38)
            goto L_0x0032
        L_0x001f:
            java.lang.String r0 = "postal_code"
            boolean r0 = r2.equals(r0)
            r2 = 2131887704(0x7f120658, float:1.9410023E38)
            goto L_0x0032
        L_0x0029:
            java.lang.String r0 = "zip_code"
            boolean r0 = r2.equals(r0)
            r2 = 2131887705(0x7f120659, float:1.9410025E38)
        L_0x0032:
            if (r0 != 0) goto L_0x000d
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167767ym.A01():X.2ft");
    }

    public static final String A02(String str) {
        String A0y;
        if (str == null || (A0y = C36371kC.A0y(str)) == null) {
            return null;
        }
        return AnonymousClass098.A05(A0y, "-", "", false);
    }

    public static final boolean A04(C167767ym r3, String str) {
        String str2 = r3.A03;
        boolean z = !r3.A05.A01();
        String A1A = C36431kI.A1A(str2, C196699aO.A00);
        if (str == null) {
            return false;
        }
        if (z) {
            if (str.length() == 6) {
                return true;
            }
            return false;
        } else if (A1A == null) {
            return false;
        } else {
            Matcher matcher = Pattern.compile(A1A).matcher(str);
            AnonymousClass00C.A08(matcher);
            return matcher.matches();
        }
    }

    public C167767ym(AnonymousClass1KL r3, C196699aO r4, AnonymousClass16D r5, AnonymousClass185 r6, AnonymousClass171 r7) {
        C36321k7.A1B(r5, r7, r6, r3, r4);
        this.A06 = r5;
        this.A08 = r7;
        this.A07 = r6;
        this.A05 = r3;
        this.A0C = r4;
        C001700s A0S = C36431kI.A0S();
        this.A0B = A0S;
        this.A04 = A0S;
        C28201Rs r0 = new C28201Rs(C36381kD.A0j());
        this.A09 = r0;
        this.A0A = r0;
    }
}
