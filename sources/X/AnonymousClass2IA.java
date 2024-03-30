package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;

/* renamed from: X.2IA  reason: invalid class name */
public class AnonymousClass2IA extends AnonymousClass8ZH {
    public AnonymousClass3EP A00;
    public AnonymousClass1C5 A01;
    public final AnonymousClass01z A02;
    public final TemplateRowContentLayout A03 = ((TemplateRowContentLayout) findViewById(R.id.template_message_content));

    public void A1Y() {
        this.A03.A02(this.A02, this, this.A2Y);
        super.A1Y();
    }

    public AnonymousClass2IA(Context context, AnonymousClass01z r4, C89004Uw r5, C46862bn r6) {
        super(context, r5, r6);
        ConversationRowImage$RowImageView.A02(this.A09);
        this.A02 = r4;
        this.A03.A02(r4, this, this.A2Y);
    }

    public boolean A1M() {
        Long l = ((C88854Uh) getFMessage()).BIE().A00;
        if (l == null || C19970wo.A00(this.A19) >= l.longValue()) {
            return false;
        }
        return true;
    }

    public void A1f() {
        super.A1f();
        C46882bp fMessage = getFMessage();
        if (this.A01.A06(fMessage)) {
            AnonymousClass3DP r2 = this.A1q;
            AnonymousClass00C.A0D(fMessage, 0);
            r2.A00(fMessage, "media-image", "0");
        }
    }

    public void A22(AnonymousClass3T1 r4, boolean z) {
        boolean A1W = C36371kC.A1W(r4, getFMessage());
        super.A22(r4, z);
        if (z || A1W) {
            this.A03.A02(this.A02, this, this.A2Y);
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.A00.A00(getFMessage(), i);
    }
}
