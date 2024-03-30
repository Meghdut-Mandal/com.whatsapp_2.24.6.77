package com.whatsapp.product.newsletterenforcements.suspension;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass04R;
import X.AnonymousClass16D;
import X.AnonymousClass2ay;
import X.AnonymousClass4DY;
import X.C001700s;
import X.C005502l;
import X.C20810yC;
import X.C220412q;
import X.C36321k7;
import X.C36431kI;
import X.C36441kJ;
import com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient;

public final class NewsletterSuspensionInfoViewModel extends AnonymousClass04R {
    public final C001700s A00 = C36431kI.A0S();
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36441kJ.A0Z(AnonymousClass2ay.A00);
    public final AnonymousClass16D A03;
    public final C220412q A04;
    public final C20810yC A05;
    public final AnonymousClass00T A06 = C36431kI.A1I(new AnonymousClass4DY(this));
    public final C005502l A07;
    public final NewsletterAppealsClient A08;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C28981Uw r6, com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel r7, X.C023509x r8) {
        /*
            boolean r0 = r8 instanceof X.C82613yz
            if (r0 == 0) goto L_0x0022
            r5 = r8
            X.3yz r5 = (X.C82613yz) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r5.label
            r0 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 != r0) goto L_0x0028
            java.lang.Object r7 = r5.L$0
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel r7 = (com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel) r7
            goto L_0x0045
        L_0x0022:
            X.3yz r5 = new X.3yz
            r5.<init>(r7, r8)
            goto L_0x0012
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x002d:
            X.AnonymousClass0AN.A00(r2)
            com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient r3 = r7.A08     // Catch:{ 3yQ -> 0x0055 }
            r5.L$0 = r7     // Catch:{ 3yQ -> 0x0055 }
            r5.label = r0     // Catch:{ 3yQ -> 0x0055 }
            X.02l r2 = r3.A01     // Catch:{ 3yQ -> 0x0055 }
            r1 = 0
            com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$fetchSuspensionAppeal$2 r0 = new com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$fetchSuspensionAppeal$2     // Catch:{ 3yQ -> 0x0055 }
            r0.<init>(r6, r3, r1)     // Catch:{ 3yQ -> 0x0055 }
            java.lang.Object r2 = X.AnonymousClass0A2.A00(r5, r2, r0)     // Catch:{ 3yQ -> 0x0055 }
            if (r2 != r4) goto L_0x0048
            return r4
        L_0x0045:
            X.AnonymousClass0AN.A00(r2)     // Catch:{ 3yQ -> 0x0055 }
        L_0x0048:
            X.2Z0 r2 = (X.AnonymousClass2Z0) r2     // Catch:{ 3yQ -> 0x0055 }
            X.00s r1 = r7.A02     // Catch:{ 3yQ -> 0x0055 }
            X.2aw r0 = new X.2aw     // Catch:{ 3yQ -> 0x0055 }
            r0.<init>(r2)     // Catch:{ 3yQ -> 0x0055 }
            r1.A0C(r0)     // Catch:{ 3yQ -> 0x0055 }
            goto L_0x005c
        L_0x0055:
            X.00s r1 = r7.A02
            X.2ay r0 = X.AnonymousClass2ay.A00
            r1.A0C(r0)
        L_0x005c:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel.A01(X.1Uw, com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel, X.09x):java.lang.Object");
    }

    public NewsletterSuspensionInfoViewModel(AnonymousClass16D r2, C220412q r3, C20810yC r4, NewsletterAppealsClient newsletterAppealsClient, C005502l r6) {
        C36321k7.A11(r4, r3, r2);
        AnonymousClass00C.A0D(r6, 5);
        this.A05 = r4;
        this.A04 = r3;
        this.A03 = r2;
        this.A08 = newsletterAppealsClient;
        this.A07 = r6;
    }
}
