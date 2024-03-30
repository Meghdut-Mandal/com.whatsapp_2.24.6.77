package X;

import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity;

/* renamed from: X.7YM  reason: invalid class name */
public final class AnonymousClass7YM extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ AnonymousClass3GB $delayedProgressSpinner;
    public final /* synthetic */ AccountLinkingWebAuthActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7YM(AccountLinkingWebAuthActivity accountLinkingWebAuthActivity, AnonymousClass3GB r3) {
        super(2);
        this.this$0 = accountLinkingWebAuthActivity;
        this.$delayedProgressSpinner = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int A0I = AnonymousClass000.A0I(obj);
        AnonymousClass1UT.A01(AnonymousClass000.A0r("AccountLinkingWebAuthActivity/handleRedirectUriDeepLink Error in exchanging blob for access token. Error: ", AnonymousClass000.A0u(), A0I), (Throwable) null);
        AccountLinkingWebAuthActivity accountLinkingWebAuthActivity = this.this$0;
        accountLinkingWebAuthActivity.A05.A0H(new C81333wq(accountLinkingWebAuthActivity, A0I, 39, obj2));
        this.$delayedProgressSpinner.A00();
        return AnonymousClass0AJ.A00;
    }
}
