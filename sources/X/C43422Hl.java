package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.2Hl  reason: invalid class name and case insensitive filesystem */
public class C43422Hl extends AnonymousClass2IG {
    public final AnonymousClass01z A00;
    public final InteractiveMessageButton A01 = ((InteractiveMessageButton) C012005e.A02(this, R.id.button));
    public final InteractiveMessageView A02;

    public C43422Hl(Context context, AnonymousClass01z r6, C89004Uw r7, AnonymousClass2cB r8) {
        super(context, r7, r8);
        this.A00 = r6;
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C012005e.A02(this, R.id.interactive_view);
        this.A02 = interactiveMessageView;
        interactiveMessageView.setLayoutView(r8.A1J.A02 ^ true ? 1 : 0);
        interactiveMessageView.A02(this.A2W, (C65413Ry) null);
        AnonymousClass3T1 r3 = this.A0K;
        this.A02.A03(this, r3);
        this.A01.A00(this.A00, this, this.A0c, r3);
    }

    public void A1Y() {
        super.A1Y();
        AnonymousClass3T1 r3 = this.A0K;
        this.A02.A03(this, r3);
        this.A01.A00(this.A00, this, this.A0c, r3);
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
        throw AnonymousClass001.A0A("onWindowVisibilityChanged");
    }
}
