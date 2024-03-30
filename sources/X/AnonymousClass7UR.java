package X;

import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity;

/* renamed from: X.7UR  reason: invalid class name */
public final class AnonymousClass7UR extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass3GB $delayedProgressSpinner;
    public final /* synthetic */ AccountLinkingWebAuthActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UR(AccountLinkingWebAuthActivity accountLinkingWebAuthActivity, AnonymousClass3GB r3) {
        super(1);
        this.this$0 = accountLinkingWebAuthActivity;
        this.$delayedProgressSpinner = r3;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.5VM, java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ? r1;
        int i;
        C134876bk r6 = (C134876bk) obj;
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass00C.A0D("AccountLinkingWebAuthActivity/handleRedirectUriDeepLink Received access token. Linking Account", 0);
        AccountLinkingWebAuthActivity accountLinkingWebAuthActivity = this.this$0;
        AnonymousClass3GB r3 = this.$delayedProgressSpinner;
        try {
            AnonymousClass1UM r2 = accountLinkingWebAuthActivity.A04;
            if (r2 != null) {
                r2.A03(AccountLinkingWebAuthActivity.A0B, new AnonymousClass695(r6));
                AccountLinkingWebAuthActivity accountLinkingWebAuthActivity2 = this.this$0;
                accountLinkingWebAuthActivity2.A05.A0H(new C1498272x(this.$delayedProgressSpinner, accountLinkingWebAuthActivity2, 3));
                return AnonymousClass0AJ.A00;
            }
            throw C36331k8.A0d("fbAccountManager");
        } catch (AnonymousClass5QW unused) {
            AccountLinkingWebAuthActivity.A01((AnonymousClass5VM) null, accountLinkingWebAuthActivity, r3, 190, (Integer) null);
        } catch (C107575Qa unused2) {
            r1 = 0;
            i = 459;
            AccountLinkingWebAuthActivity.A01(r1, accountLinkingWebAuthActivity, r3, r1, Integer.valueOf(i));
        } catch (AnonymousClass5QZ unused3) {
            r1 = 0;
            i = 464;
            AccountLinkingWebAuthActivity.A01(r1, accountLinkingWebAuthActivity, r3, r1, Integer.valueOf(i));
        } catch (AnonymousClass5QV unused4) {
            r1 = 0;
            i = 467;
            AccountLinkingWebAuthActivity.A01(r1, accountLinkingWebAuthActivity, r3, r1, Integer.valueOf(i));
        } catch (AnonymousClass5QT unused5) {
            r1 = 0;
            i = 463;
            AccountLinkingWebAuthActivity.A01(r1, accountLinkingWebAuthActivity, r3, r1, Integer.valueOf(i));
        } catch (AnonymousClass5VM unused6) {
            AccountLinkingWebAuthActivity.A01((AnonymousClass5VM) null, accountLinkingWebAuthActivity, r3, (Integer) null, (Integer) null);
        }
    }
}
