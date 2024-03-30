package X;

import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard;
import java.text.NumberFormat;

/* renamed from: X.3QQ  reason: invalid class name */
public final class AnonymousClass3QQ {
    public AnonymousClass141 A00;
    public final AnonymousClass17Y A01;
    public final NewsletterDetailsCard A02;
    public final C21060yb A03;
    public final C18820ts A04;
    public final C71723hE A05;
    public final AnonymousClass3G3 A06;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (r3 == null) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C44072La r5) {
        /*
            r4 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x002f
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r0 = r4.A02
            android.content.Context r1 = r0.getContext()
            r0 = 2131891347(0x7f121493, float:1.9417411E38)
            java.lang.String r3 = X.C36361kB.A0m(r1, r0)
        L_0x0015:
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r2 = r4.A02
            android.widget.TextView r1 = r2.A0A
            r0 = 5
            r1.setTextDirection(r0)
            r2.setSubTitle(r3)
            r0 = 0
            r2.setTitleOnLongClickListener(r0)
            X.141 r0 = r4.A00
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "waContact"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x002f:
            java.lang.String r2 = r5.A0I
            if (r2 == 0) goto L_0x0048
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0048
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 64
            r1.append(r0)
            java.lang.String r3 = X.AnonymousClass000.A0q(r2, r1)
            if (r3 != 0) goto L_0x0015
        L_0x0048:
            java.lang.String r3 = A00(r4, r5)
            goto L_0x0015
        L_0x004d:
            X.11F r1 = r0.A0H
            if (r1 == 0) goto L_0x0060
            X.3hE r0 = r4.A05
            X.3IZ r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0060
            X.2La r0 = r0.A00
            if (r0 == 0) goto L_0x0060
            r2.setupActionButtons(r0)
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QQ.A01(X.2La):void");
    }

    public static final String A00(AnonymousClass3QQ r8, C44072La r9) {
        String quantityString;
        boolean A002 = r8.A06.A00(r9);
        NewsletterDetailsCard newsletterDetailsCard = r8.A02;
        if (A002) {
            quantityString = newsletterDetailsCard.getContext().getString(R.string.f12nameremoved);
        } else {
            Resources A0F = C36341k9.A0F(newsletterDetailsCard);
            long j = r9.A07;
            Object[] A0L = AnonymousClass001.A0L();
            String format = NumberFormat.getInstance(C36401kF.A0x(r8.A04)).format(j);
            AnonymousClass00C.A08(format);
            A0L[0] = format;
            quantityString = A0F.getQuantityString(R.plurals.f10nameremoved, (int) j, A0L);
        }
        AnonymousClass00C.A0B(quantityString);
        return quantityString;
    }

    public final void A02(AnonymousClass141 r6) {
        AnonymousClass3IZ A012;
        C44072La r2;
        AnonymousClass3IZ A013;
        C44072La r0;
        String str;
        this.A00 = r6;
        NewsletterDetailsCard newsletterDetailsCard = this.A02;
        newsletterDetailsCard.setContact(r6);
        AnonymousClass11F r1 = r6.A0H;
        if (!(r1 == null || (A013 = this.A05.A01(r1)) == null || (r0 = A013.A00) == null || (str = r0.A0K) == null)) {
            newsletterDetailsCard.setTitleOnLongClickListener(new AnonymousClass3Z5(this.A01, this.A03, str));
        }
        AnonymousClass11F r12 = r6.A0H;
        if (r12 != null && (A012 = this.A05.A01(r12)) != null && (r2 = A012.A00) != null) {
            String str2 = r2.A0I;
            int i = 0;
            if (str2 == null || str2.length() == 0) {
                i = 8;
            }
            newsletterDetailsCard.setContactChatStatusVisibility(i);
            if (i == 0) {
                newsletterDetailsCard.setContactChatStatus(A00(this, r2));
            }
            A01(r2);
            if (!r2.A0N && !this.A06.A00(r2)) {
                if (r2.A0N()) {
                    newsletterDetailsCard.A06();
                } else if (!r2.A0L()) {
                    newsletterDetailsCard.A05();
                }
            }
        }
    }

    public AnonymousClass3QQ(AnonymousClass17Y r2, NewsletterDetailsCard newsletterDetailsCard, C21060yb r4, C18820ts r5, C45702Sj r6, C71723hE r7, AnonymousClass3G3 r8) {
        C36321k7.A19(r2, r4, r5, r7);
        AnonymousClass00C.A0D(r8, 6);
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r7;
        this.A06 = r8;
        this.A02 = newsletterDetailsCard;
        newsletterDetailsCard.A0R = r6;
    }
}
