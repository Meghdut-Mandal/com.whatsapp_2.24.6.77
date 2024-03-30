package X;

import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity;

/* renamed from: X.62J  reason: invalid class name */
public final class AnonymousClass62J {
    public final /* synthetic */ AccountLinkingWebAuthActivity A00;
    public final /* synthetic */ AnonymousClass3GB A01;

    public AnonymousClass62J(AccountLinkingWebAuthActivity accountLinkingWebAuthActivity, AnonymousClass3GB r2) {
        this.A00 = accountLinkingWebAuthActivity;
        this.A01 = r2;
    }

    public void A00(Exception exc) {
        AnonymousClass1UT.A01(C36331k8.A0i("AccountLinkingWebAuthActivity/onCreate/WebAuthTokenFetcher onError: ", AnonymousClass000.A0u(), exc), (Throwable) null);
        this.A01.A00();
        AccountLinkingWebAuthActivity.A01((AnonymousClass5VM) null, this.A00, (AnonymousClass3GB) null, (Integer) null, (Integer) null);
    }
}
