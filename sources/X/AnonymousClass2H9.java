package X;

import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.conversation.ConversationAttachmentContentView;

/* renamed from: X.2H9  reason: invalid class name */
public class AnonymousClass2H9 extends C37491mV {
    public int A00;
    public int A01;
    public final /* synthetic */ ConversationAttachmentContentView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2H9(Context context, ConversationAttachmentContentView conversationAttachmentContentView) {
        super(context);
        this.A02 = conversationAttachmentContentView;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.A01, this.A00 + this.A02.A03);
    }

    public static void A00(ViewGroup viewGroup, ConversationAttachmentContentView conversationAttachmentContentView, int i, int i2) {
        AnonymousClass2H9 r0 = new AnonymousClass2H9(conversationAttachmentContentView.getContext(), conversationAttachmentContentView);
        r0.A01 = i;
        r0.A00 = i2;
        viewGroup.addView(r0);
    }

    public int getBaseHeightPx() {
        return this.A00;
    }

    public int getBaseWidthPx() {
        return this.A01;
    }

    public void setBaseHeightPx(int i) {
        this.A00 = i;
    }

    public void setBaseWidthPx(int i) {
        this.A01 = i;
    }
}
