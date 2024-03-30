package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6Ur  reason: invalid class name and case insensitive filesystem */
public final class C132656Ur {
    public AnonymousClass0FM A00;
    public C144506sM A01;
    public final C116285kL A02;
    public final AnonymousClass6DA A03;
    public final AnonymousClass16D A04;
    public final C25851Hx A05;
    public final C19970wo A06;
    public final AnonymousClass190 A07;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r0 != 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.view.View r5, X.C132656Ur r6, X.C131626Pu r7, java.lang.String r8) {
        /*
            if (r7 == 0) goto L_0x0009
            int r0 = r7.A00
            r4 = 2131886858(0x7f12030a, float:1.9408307E38)
            if (r0 == 0) goto L_0x000c
        L_0x0009:
            r4 = 2131886855(0x7f120307, float:1.94083E38)
        L_0x000c:
            A02(r6)
            android.app.Activity r3 = X.C36361kB.A06(r5)
            android.content.Context r0 = X.C36371kC.A0B(r5)
            X.1qm r2 = X.AnonymousClass3LW.A00(r0)
            r0 = 2131891806(0x7f12165e, float:1.9418342E38)
            java.lang.String r1 = r3.getString(r0)
            X.014 r3 = (X.AnonymousClass014) r3
            X.6i2 r0 = new X.6i2
            r0.<init>(r5, r6, r8)
            r2.A0o(r3, r0, r1)
            r0 = 2131886851(0x7f120303, float:1.9408293E38)
            r2.A0d(r0)
            r2.A0c(r4)
            X.0FM r0 = r2.create()
            r6.A00 = r0
            if (r0 == 0) goto L_0x0040
            r0.show()
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132656Ur.A00(android.view.View, X.6Ur, X.6Pu, java.lang.String):void");
    }

    public static final void A02(C132656Ur r1) {
        AnonymousClass0FM r12 = r1.A00;
        if (r12 != null && !C24801Dv.A00(r12.getContext()).isFinishing()) {
            r12.cancel();
        }
    }

    public C132656Ur(C116285kL r2, AnonymousClass6DA r3, AnonymousClass16D r4, C19970wo r5, C25851Hx r6, AnonymousClass190 r7) {
        C36321k7.A1B(r5, r7, r4, r6, r2);
        AnonymousClass00C.A0D(r3, 6);
        this.A06 = r5;
        this.A07 = r7;
        this.A04 = r4;
        this.A05 = r6;
        this.A02 = r2;
        this.A03 = r3;
    }

    public static final void A01(View view, C132656Ur r18, String str) {
        Activity A062 = C36361kB.A06(view);
        C132656Ur r4 = r18;
        AnonymousClass190 r5 = r4.A07;
        String str2 = str;
        AnonymousClass11F A022 = AnonymousClass11F.A00.A02(str2);
        C18740tg.A06(A022);
        A062.startActivity(r5.A1V(A062, new AnonymousClass141(A022)).putExtra("user_actions_on_business_profile_common_fields", new C206949uI((Double) null, C36361kB.A0i(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, r4.A03.A01(), -1.0d, -1, 0)));
        C25851Hx r0 = r4.A05;
        UserJid A0l = C36431kI.A0l(str2);
        C18740tg.A06(A0l);
        r0.A02(A0l, "business_search", SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, System.currentTimeMillis(), System.currentTimeMillis());
    }
}
