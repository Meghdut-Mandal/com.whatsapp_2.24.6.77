package X;

import com.whatsapp.R;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel$fetchSimilarNewsletters$1;

/* renamed from: X.4Jc  reason: invalid class name and case insensitive filesystem */
public final class C85964Jc extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass2H2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85964Jc(AnonymousClass2H2 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String A0x;
        int i;
        AnonymousClass2H2 r2 = this.this$0;
        C51952oe r1 = ((C62913Ia) obj).A01;
        if (r2.A05) {
            r2.A05 = false;
        } else {
            int ordinal = r1.ordinal();
            if (ordinal != 2) {
                if (ordinal == 0) {
                    A0x = C36361kB.A0m(r2.A05, R.string.f12nameremoved);
                    i = 8;
                } else if (ordinal == 1) {
                    A0x = C36361kB.A0m(r2.A05, R.string.f12nameremoved);
                    i = 9;
                }
            } else if (r2.A0F.A0E(7472)) {
                r2.A0B.BPa();
                NewsletterViewModel newsletterViewModel = r2.A0A;
                C36331k8.A1T(new NewsletterViewModel$fetchSimilarNewsletters$1(newsletterViewModel, (C023509x) null), C109325Xd.A00(newsletterViewModel));
            } else {
                A0x = C36351kA.A0x(r2.A05, AnonymousClass3IZ.A00(r2.A0A).A0K, AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
                i = 7;
            }
            C53082qk r12 = new C53082qk(r2, i);
            AnonymousClass01L r6 = r2.A05;
            String A0m = C36361kB.A0m(r6, R.string.f12nameremoved);
            C66953Xy r3 = new C66953Xy(r12, 4);
            if (r6.A06.A02 != AnonymousClass01P.DESTROYED) {
                C99304t3 A01 = C99304t3.A01(r6.findViewById(16908298), A0x, 0);
                A01.A0Z(A0m, r3);
                A01.A0X(C36351kA.A01(r6, R.attr.f4nameremoved, R.color.f6nameremoved));
                AnonymousClass3ZU r5 = new AnonymousClass3ZU(r6, A01, r2.A06, AnonymousClass03T.A03(C36361kB.A0H(r6, R.id.next_important_message), C36361kB.A0H(r6, R.id.scroll_bottom)), false);
                r5.A05(C80223v3.A00(r2, 38));
                r5.A02();
                r2.A03 = r5;
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
