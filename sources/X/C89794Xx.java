package X;

import android.content.DialogInterface;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import java.util.List;

/* renamed from: X.4Xx  reason: invalid class name and case insensitive filesystem */
public class C89794Xx implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C89794Xx(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A03) {
            case 0:
                ConversationRowContact$MessageSharedContactDialogFragment conversationRowContact$MessageSharedContactDialogFragment = (ConversationRowContact$MessageSharedContactDialogFragment) this.A00;
                String str = this.A02;
                UserJid userJid = ((C64533Oj) ((List) this.A01).get(i)).A01;
                if (userJid != null) {
                    conversationRowContact$MessageSharedContactDialogFragment.A00.A01(conversationRowContact$MessageSharedContactDialogFragment.A1D(), userJid, str, (String) null, (String) null);
                    return;
                }
                return;
            case 1:
                P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = (P2mLiteOrderDetailsActivity) this.A00;
                String str2 = this.A02;
                String A0m = C36361kB.A0m(p2mLiteOrderDetailsActivity, R.string.f12nameremoved);
                C131606Ps A002 = AnonymousClass9ZG.A00();
                A002.A03("payments_error_code", "10755");
                A002.A03("payments_error_text", A0m);
                P2mLiteOrderDetailsActivity.A07(A002, p2mLiteOrderDetailsActivity, (AnonymousClass2bZ) this.A01, 115, "error_dialog", str2, 1);
                return;
            default:
                P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity2 = (P2mLiteOrderDetailsActivity) this.A00;
                String str3 = this.A02;
                String A0m2 = C36361kB.A0m(p2mLiteOrderDetailsActivity2, R.string.f12nameremoved);
                C131606Ps A003 = AnonymousClass9ZG.A00();
                A003.A03("payments_error_code", "10755");
                A003.A03("payments_error_text", A0m2);
                P2mLiteOrderDetailsActivity.A07(A003, p2mLiteOrderDetailsActivity2, (AnonymousClass2bZ) this.A01, 158, "error_dialog", str3, 1);
                AnonymousClass3DY r2 = p2mLiteOrderDetailsActivity2.A00;
                if (r2 != null) {
                    AnonymousClass1CF r0 = p2mLiteOrderDetailsActivity2.A09;
                    if (r0 != null) {
                        AnonymousClass3DY.A00(p2mLiteOrderDetailsActivity2, r2, "payments-blocked", r0.A00());
                        return;
                    }
                    throw C36331k8.A0d("supportGatingUtils");
                }
                throw C36331k8.A0d("sendFeedback");
        }
    }
}
