package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6V2  reason: invalid class name */
public class AnonymousClass6V2 {
    public int A00;
    public AnonymousClass0FM A01;
    public C115485ix A02;
    public C142616pA A03;
    public C144496sL A04;
    public AnonymousClass16D A05;
    public C25851Hx A06;
    public String A07;
    public C19700wN A08;
    public C19970wo A09;

    public void A04(View view, AnonymousClass7gC r16, C160947lq r17, String str) {
        View view2 = view;
        AnonymousClass7gC r11 = r16;
        C160947lq r12 = r17;
        String str2 = str;
        try {
            AnonymousClass16D r1 = this.A05;
            C222713q r0 = AnonymousClass11F.A00;
            AnonymousClass11F A012 = C222713q.A01(str2);
            C18740tg.A06(A012);
            AnonymousClass141 A082 = r1.A08(A012);
            if (A082 == null || !A082.A0t) {
                A02(this);
                View A0K = C36381kD.A0K(C36361kB.A06(view).getLayoutInflater(), R.layout.f9nameremoved);
                C39001qm A002 = AnonymousClass3LW.A00(view.getContext());
                A002.A0e(new C163317q0(this, 2));
                A002.A0j(A0K);
                AnonymousClass0FM create = A002.create();
                this.A01 = create;
                create.show();
                C115485ix r02 = this.A02;
                UserJid A0l = C36431kI.A0l(str2);
                C18740tg.A06(A0l);
                C123185w5 r8 = new C123185w5(view2, this, r11, r12, str2);
                C18800tq r13 = r02.A00.A01;
                C19770wU A0Z = C36341k9.A0Z(r13);
                AnonymousClass19A A0c = C36361kB.A0c(r13);
                C144496sL r2 = new C144496sL(r8, C36391kE.A0c(r13), (C21159AAt) r13.A2F.get(), A0l, A0c, A0Z);
                this.A04 = r2;
                if (!r2.A01.A09()) {
                    C144496sL.A00(r2, C131626Pu.A04);
                }
                C36331k8.A1F(r2.A02, r2.A03);
                return;
            }
            A01(view, this, r12, str2);
        } catch (C19740wR unused) {
            C131626Pu r03 = C131626Pu.A02;
            A00(view, this, r12, r03, str2);
            if (r16 != null) {
                r11.BSR(r03);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r0 != 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.view.View r5, X.AnonymousClass6V2 r6, X.C160947lq r7, X.C131626Pu r8, java.lang.String r9) {
        /*
            if (r8 == 0) goto L_0x0009
            int r0 = r8.A00
            r4 = 2131886774(0x7f1202b6, float:1.9408136E38)
            if (r0 == 0) goto L_0x000c
        L_0x0009:
            r4 = 2131886764(0x7f1202ac, float:1.9408116E38)
        L_0x000c:
            A02(r6)
            android.app.Activity r3 = X.C36361kB.A06(r5)
            android.content.Context r0 = r5.getContext()
            X.1qm r2 = X.AnonymousClass3LW.A00(r0)
            r0 = 2131891806(0x7f12165e, float:1.9418342E38)
            java.lang.String r1 = r3.getString(r0)
            X.014 r3 = (X.AnonymousClass014) r3
            X.6i4 r0 = new X.6i4
            r0.<init>(r5, r6, r7, r9)
            r2.A0o(r3, r0, r1)
            r0 = 2131886866(0x7f120312, float:1.9408323E38)
            r2.A0d(r0)
            r2.A0c(r4)
            X.0FM r0 = r2.create()
            r6.A01 = r0
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6V2.A00(android.view.View, X.6V2, X.7lq, X.6Pu, java.lang.String):void");
    }

    public static void A01(View view, AnonymousClass6V2 r21, C160947lq r22, String str) {
        int i;
        double d;
        Double d2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        AnonymousClass6V2 r0 = r21;
        C142616pA r1 = r0.A03;
        String str7 = null;
        if (r1.A01 == null) {
            r0.A08.A0E("directorySessionIdIsNull", (String) null, false);
        }
        if (r22 != null) {
            i = r22.Bmk();
            d = r22.BmW();
            d2 = r22.Blt();
            str2 = r22.Bme();
            str3 = r22.BpU();
            str4 = r22.BpW();
            str5 = r22.Bml();
            str6 = r22.BmE();
            str7 = r22.BQB();
            i2 = r22.B6c();
        } else {
            i = 0;
            d = 0.0d;
            d2 = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            i2 = 0;
        }
        C206949uI r5 = new C206949uI(d2, 0, str2, str3, str4, str5, str6, str7, r0.A07, r1.A01, d, i, i2);
        AnonymousClass11F A0N = C36421kH.A0N(str);
        C18740tg.A06(A0N);
        AnonymousClass141 r3 = new AnonymousClass141(A0N);
        Activity A062 = C36361kB.A06(view);
        A062.startActivity(C36441kJ.A0j().A1V(A062, r3).putExtra("user_actions_on_business_profile_common_fields", r5));
        C25851Hx r2 = r0.A06;
        UserJid A0l = C36431kI.A0l(str);
        C18740tg.A06(A0l);
        r2.A02(A0l, "directory", SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, System.currentTimeMillis(), System.currentTimeMillis());
        Integer valueOf = Integer.valueOf(r0.A00);
        AnonymousClass593 A002 = AnonymousClass593.A00(51);
        A002.A09 = valueOf;
        C142616pA.A01(r1, A002);
    }

    public static void A02(AnonymousClass6V2 r1) {
        AnonymousClass0FM r0 = r1.A01;
        if (r0 != null && !C24801Dv.A00(r0.getContext()).isFinishing()) {
            r1.A01.cancel();
        }
    }

    public AnonymousClass6V2(C19700wN r1, C115485ix r2, C142616pA r3, AnonymousClass16D r4, C19970wo r5, C25851Hx r6) {
        this.A09 = r5;
        this.A08 = r1;
        this.A05 = r4;
        this.A02 = r2;
        this.A06 = r6;
        this.A03 = r3;
    }

    public void A03() {
        A02(this);
        C144496sL r0 = this.A04;
        if (r0 != null) {
            r0.A02.A0D(true);
            this.A04.A00 = null;
        }
    }
}
