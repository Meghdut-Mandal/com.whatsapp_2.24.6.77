package X;

import com.whatsapp.ShareProductLinkActivity;
import com.whatsapp.biz.catalog.viewmodel.ShareProductViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Zn  reason: invalid class name and case insensitive filesystem */
public class C90214Zn implements AnonymousClass4P5 {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C90214Zn(ShareProductLinkActivity shareProductLinkActivity, UserJid userJid, String str, int i) {
        this.A03 = i;
        this.A00 = shareProductLinkActivity;
        this.A02 = str;
        this.A01 = userJid;
    }

    public final void BOX() {
        ShareProductViewModel shareProductViewModel;
        Boolean bool;
        int i = this.A03;
        ShareProductLinkActivity shareProductLinkActivity = (ShareProductLinkActivity) this.A00;
        String str = this.A02;
        UserJid userJid = (UserJid) this.A01;
        AnonymousClass9Y1 A3p = shareProductLinkActivity.A3p();
        C195209Sx r2 = new C195209Sx();
        switch (i) {
            case 0:
                A00(shareProductLinkActivity, r2);
                C36401kF.A1F(r2, 25);
                C36411kG.A1G(r2, 42);
                shareProductViewModel = shareProductLinkActivity.A01;
                if (shareProductViewModel == null) {
                    throw C36331k8.A0d("shareProductViewModel");
                }
                break;
            case 1:
                A00(shareProductLinkActivity, r2);
                C36401kF.A1F(r2, 23);
                C36411kG.A1G(r2, 40);
                shareProductViewModel = shareProductLinkActivity.A01;
                if (shareProductViewModel == null) {
                    throw C36331k8.A0d("shareProductViewModel");
                }
                break;
            default:
                A00(shareProductLinkActivity, r2);
                C36401kF.A1F(r2, 20);
                C36411kG.A1G(r2, 37);
                shareProductViewModel = shareProductLinkActivity.A01;
                if (shareProductViewModel == null) {
                    throw C36331k8.A0d("shareProductViewModel");
                }
                break;
        }
        C207269up A06 = shareProductViewModel.A00.A06((UserJid) null, str);
        if (A06 != null) {
            bool = Boolean.valueOf(AnonymousClass000.A1V(A06.A0B));
        } else {
            bool = null;
        }
        r2.A01(bool);
        r2.A0G = str;
        r2.A00 = userJid;
        A3p.A03(r2);
    }

    public static void A00(ShareProductLinkActivity shareProductLinkActivity, C195209Sx r2) {
        r2.A0A = shareProductLinkActivity.A3p().A02;
        r2.A05 = Integer.valueOf(shareProductLinkActivity.A3p().A0C.get());
        r2.A0D = shareProductLinkActivity.A3p().A00;
        r2.A0E = shareProductLinkActivity.A3p().A01;
        r2.A09 = Long.valueOf((long) shareProductLinkActivity.A3p().A0D.getAndIncrement());
    }
}
