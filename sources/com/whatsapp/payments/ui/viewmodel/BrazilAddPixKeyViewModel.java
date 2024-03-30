package com.whatsapp.payments.ui.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass19A;
import X.AnonymousClass1EU;
import X.AnonymousClass97G;
import X.AnonymousClass9KV;
import X.AnonymousClass9UE;
import X.AnonymousClass9WG;
import X.C001700s;
import X.C165587tf;
import X.C185648uZ;
import X.C185718ug;
import X.C185928v8;
import X.C193539Lw;
import X.C203399nx;
import X.C21309AGn;
import X.C23220BAc;
import X.C29121Vk;
import X.C29131Vl;
import X.C36321k7;
import X.C36341k9;
import X.C36371kC;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class BrazilAddPixKeyViewModel extends AnonymousClass04R {
    public final C001700s A00 = C36441kJ.A0Z(C36381kD.A0m());
    public final C001700s A01 = C36441kJ.A0Z(new AnonymousClass9WG("CPF", (String) null, (String) null));
    public final C001700s A02 = C36431kI.A0S();
    public final C001700s A03 = C36431kI.A0S();
    public final C001700s A04 = C36441kJ.A0Z("loaded");
    public final AnonymousClass9UE A05;
    public final C29121Vk A06;
    public final AnonymousClass1EU A07;
    public final AnonymousClass19A A08;
    public final AnonymousClass97G A09;
    public final C21309AGn A0A;
    public final C29131Vl A0B;

    public final void A0S(String str) {
        AnonymousClass9WG r0;
        C001700s r1;
        String A0y;
        AnonymousClass9WG r02;
        Object obj = null;
        if (str == null || (A0y = C36371kC.A0y(str)) == null || A0y.length() == 0) {
            C001700s r3 = this.A01;
            AnonymousClass9WG r03 = (AnonymousClass9WG) r3.A04();
            if (r03 != null) {
                r0 = new AnonymousClass9WG(r03.A01, r03.A02, (String) null);
            } else {
                r0 = null;
            }
            r3.A0D(r0);
            r1 = this.A02;
        } else {
            boolean z = !C165587tf.A1a(A0y.toString(), Pattern.compile("[=#|^]"));
            C001700s r32 = this.A01;
            AnonymousClass9WG r04 = (AnonymousClass9WG) r32.A04();
            if (z) {
                if (r04 != null) {
                    r02 = new AnonymousClass9WG(r04.A01, r04.A02, A0y);
                } else {
                    r02 = null;
                }
                r32.A0D(r02);
                r1 = this.A02;
            } else {
                if (r04 != null) {
                    obj = new AnonymousClass9WG(r04.A01, r04.A02, (String) null);
                }
                r32.A0D(obj);
                r1 = this.A02;
                obj = Integer.valueOf(R.string.f12nameremoved);
            }
        }
        r1.A0D(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        throw X.AnonymousClass001.A0E(X.AnonymousClass000.A0p("unsupported pix key type validation: ", r1, X.AnonymousClass000.A0u()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r1.BNb(r2) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        r3 = r1.BpE(r2).toString();
        r0 = (X.AnonymousClass9WG) r5.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a7, code lost:
        if (r0 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        r0 = new X.AnonymousClass9WG(r0.A01, r3, r0.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
        r5.A0D(r0);
        r1 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bb, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(java.lang.String r7) {
        /*
            r6 = this;
            r4 = 0
            if (r7 == 0) goto L_0x0069
            java.lang.String r2 = X.C36371kC.A0y(r7)
            if (r2 == 0) goto L_0x0069
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0069
            X.00s r5 = r6.A01
            java.lang.Object r0 = r5.A04()
            X.9WG r0 = (X.AnonymousClass9WG) r0
            if (r0 == 0) goto L_0x00bd
            java.lang.String r1 = r0.A01
            int r0 = r1.hashCode()
            switch(r0) {
                case 66937: goto L_0x0084;
                case 69055: goto L_0x005b;
                case 2073509: goto L_0x004d;
                case 66081660: goto L_0x003f;
                case 76105038: goto L_0x0031;
                default: goto L_0x0022;
            }
        L_0x0022:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "unsupported pix key type validation: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r1, r2)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r0)
            throw r0
        L_0x0031:
            java.lang.String r0 = "PHONE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.AGp r1 = new X.AGp
            r1.<init>()
            goto L_0x0091
        L_0x003f:
            java.lang.String r0 = "EMAIL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.AGm r1 = new X.AGm
            r1.<init>()
            goto L_0x0091
        L_0x004d:
            java.lang.String r0 = "CNPJ"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.8jl r1 = new X.8jl
            r1.<init>()
            goto L_0x0091
        L_0x005b:
            java.lang.String r0 = "EVP"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.AGo r1 = new X.AGo
            r1.<init>()
            goto L_0x0091
        L_0x0069:
            X.00s r3 = r6.A01
            java.lang.Object r0 = r3.A04()
            X.9WG r0 = (X.AnonymousClass9WG) r0
            if (r0 == 0) goto L_0x0082
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A00
            X.9WG r0 = new X.9WG
            r0.<init>(r2, r4, r1)
        L_0x007c:
            r3.A0D(r0)
            X.00s r1 = r6.A03
            goto L_0x00b7
        L_0x0082:
            r0 = r4
            goto L_0x007c
        L_0x0084:
            java.lang.String r0 = "CPF"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.AGq r1 = new X.AGq
            r1.<init>()
        L_0x0091:
            X.B1g r1 = (X.C23035B1g) r1
            boolean r0 = r1.BNb(r2)
            if (r0 == 0) goto L_0x00bd
            java.lang.CharSequence r0 = r1.BpE(r2)
            java.lang.String r3 = r0.toString()
            java.lang.Object r0 = r5.A04()
            X.9WG r0 = (X.AnonymousClass9WG) r0
            if (r0 == 0) goto L_0x00bb
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A00
            X.9WG r0 = new X.9WG
            r0.<init>(r2, r3, r1)
        L_0x00b2:
            r5.A0D(r0)
            X.00s r1 = r6.A03
        L_0x00b7:
            r1.A0D(r4)
            return
        L_0x00bb:
            r0 = r4
            goto L_0x00b2
        L_0x00bd:
            java.lang.Object r0 = r5.A04()
            X.9WG r0 = (X.AnonymousClass9WG) r0
            if (r0 == 0) goto L_0x00cf
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A00
            X.9WG r0 = new X.9WG
            r0.<init>(r2, r4, r1)
            r4 = r0
        L_0x00cf:
            r5.A0D(r4)
            X.00s r1 = r6.A03
            r0 = 2131887090(0x7f1203f2, float:1.9408777E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel.A0T(java.lang.String):void");
    }

    public static final void A01(BrazilAddPixKeyViewModel brazilAddPixKeyViewModel, String str, String str2, String str3) {
        AnonymousClass9KV r3 = new AnonymousClass9KV(brazilAddPixKeyViewModel.A08, new C193539Lw(brazilAddPixKeyViewModel, str, str2, str3), brazilAddPixKeyViewModel.A0B);
        C185648uZ[] r2 = new C185648uZ[3];
        r2[0] = new C185648uZ("pix_key_type", str);
        r2[1] = new C185648uZ("pix_display_name", str3);
        List A0m = C36341k9.A0m(new C185648uZ("pix_key", str2), r2, 2);
        AnonymousClass19A r5 = r3.A00;
        String A092 = r5.A09();
        C185718ug r1 = new C185718ug(A0m, 1);
        ArrayList arrayList = C185928v8.A00;
        C185928v8 r12 = new C185928v8(new C185718ug(r1), A092, r3.A02.A01());
        C203399nx r7 = r12.A00;
        AnonymousClass00C.A08(r7);
        r5.A0K(new C23220BAc(r12, r3, 6), r7, A092, 204, 32000);
    }

    public BrazilAddPixKeyViewModel(AnonymousClass19A r4, AnonymousClass9UE r5, C29121Vk r6, AnonymousClass1EU r7, AnonymousClass97G r8, C21309AGn aGn, C29131Vl r10) {
        C36321k7.A1B(r4, r7, r10, aGn, r6);
        C36321k7.A10(r8, r5);
        this.A08 = r4;
        this.A07 = r7;
        this.A0B = r10;
        this.A0A = aGn;
        this.A06 = r6;
        this.A09 = r8;
        this.A05 = r5;
    }
}
