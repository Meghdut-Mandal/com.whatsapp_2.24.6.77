package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment;
import com.whatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentDPOActivity;
import com.whatsapp.payments.ui.BrazilPaymentSettingsActivity;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import java.util.ArrayList;

public class B8F implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public B8F(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        switch (this.A02) {
            case 0:
                CatalogListActivity catalogListActivity = (CatalogListActivity) this.A00;
                catalogListActivity.A0B.A0H(catalogListActivity, C36351kA.A0k((AnonymousClass141) this.A01));
                AnonymousClass3SJ.A00(catalogListActivity, 106);
                return;
            case 1:
                C22920AyW ayW = (C22920AyW) this.A01;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                if (ayW != null) {
                    ayW.BVd();
                    return;
                }
                return;
            case 2:
                A8W a8w = (A8W) this.A00;
                AnonymousClass3SJ.A00(a8w.A02, 1);
                A8W.A00(a8w, (ArrayList) this.A01);
                return;
            case 3:
                ((ConfirmApproveAllPendingRequestsDialogFragment) this.A00).A1k((Bundle) this.A01);
                return;
            case 4:
                ((ConfirmApproveAllPendingRequestsDialogFragment) this.A00).A1l((Bundle) this.A01);
                return;
            case 5:
                GroupRequireMembershipApprovalTooManyParticipantsDialog.A03((Bundle) this.A00, (GroupRequireMembershipApprovalTooManyParticipantsDialog) this.A01);
                return;
            case 6:
                GroupRequireMembershipApprovalTooManyParticipantsDialog.A05((Bundle) this.A00, (GroupRequireMembershipApprovalTooManyParticipantsDialog) this.A01);
                return;
            case 7:
                Context context = (Context) this.A01;
                if (((AE9) this.A00).A01.A01()) {
                    str = "https://faq.whatsapp.com/payments/26000350";
                } else {
                    str = "https://faq.whatsapp.com/payments/26000351";
                }
                C18740tg.A06(str);
                context.startActivity(AnonymousClass190.A1L(context, str, (String) null, false, false));
                return;
            case 8:
                C196199Yc r3 = (C196199Yc) this.A00;
                Intent A0G = C36391kE.A0G(r3.A02.A00());
                r3.A01.A06((Context) this.A01, A0G);
                return;
            case 9:
                Context context2 = (Context) this.A00;
                ((DialogFragment) this.A01).A1c();
                context2.startActivity(C36441kJ.A0H(context2, BrazilPaymentSettingsActivity.class));
                return;
            case 10:
                ((DialogFragment) this.A01).A1c();
                BrazilPaymentActivity brazilPaymentActivity = ((C21252AEi) this.A00).A00.A07;
                brazilPaymentActivity.startActivity(C36441kJ.A0H(brazilPaymentActivity, BrazilPaymentDPOActivity.class));
                C203049nB.A03(C203049nB.A00(), brazilPaymentActivity.A0J, 120, "payment_disabled_alert", (String) null, 1);
                return;
            case 11:
                BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = (BrazilPaymentTransactionDetailActivity) this.A00;
                C202319lY r2 = (C202319lY) this.A01;
                brazilPaymentTransactionDetailActivity.A2y(R.string.f12nameremoved, SearchActionVerificationClientService.NOTIFICATION_ID);
                AnonymousClass9Ls r5 = brazilPaymentTransactionDetailActivity.A00;
                AnonymousClass9FE r4 = new AnonymousClass9FE(brazilPaymentTransactionDetailActivity);
                C19970wo r1 = brazilPaymentTransactionDetailActivity.A07;
                C29121Vk r10 = r5.A03;
                String A09 = r10.A06.A09();
                String A002 = C237919w.A00(r5.A01, r1);
                AnonymousClass147 A012 = C65533Sl.A01(r2.A0C);
                UserJid userJid = r2.A0D;
                if (userJid != null && (str2 = r2.A0K) != null) {
                    String str3 = r2.A0L;
                    AnonymousClass6QB A0T = C36421kH.A0T();
                    C165567td.A1D(A0T);
                    if (C203539oF.A0P(A09, 0, 9007199254740991L, false)) {
                        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
                    }
                    AnonymousClass6QB A0a = C165587tf.A0a();
                    C36331k8.A1D(A0a, "action", "br-cancel-unilateral");
                    C36351kA.A1I(userJid, A0a, "receiver");
                    if (C203539oF.A0X(str2, false)) {
                        C36331k8.A1D(A0a, "transaction_id", str2);
                    }
                    if (C203539oF.A0W(str3, false)) {
                        C36331k8.A1D(A0a, "message_id", str3);
                    }
                    C203539oF.A0F(A0a, A002);
                    if (A012 != null) {
                        C36351kA.A1I(A012, A0a, "group");
                    }
                    C203399nx A0I = C165567td.A0I(A0a, A0T);
                    AnonymousClass17Y r16 = r5.A00;
                    r10.A0G(new B7J(brazilPaymentTransactionDetailActivity, r5.A02, r16, r5, r4, 2), A0I, A09, 0);
                    return;
                }
                return;
            default:
                C36411kG.A1N(this.A01);
                return;
        }
    }
}
