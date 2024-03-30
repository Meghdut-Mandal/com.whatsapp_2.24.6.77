package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.conversation.comments.MessageText;

/* renamed from: X.21k  reason: invalid class name and case insensitive filesystem */
public final class C429421k extends C429521l {
    public final /* synthetic */ MessageText A00;
    public final /* synthetic */ AnonymousClass3T1 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C429421k(Context context, MessageText messageText, AnonymousClass3T1 r3) {
        super(context);
        this.A00 = messageText;
        this.A01 = r3;
        AnonymousClass00C.A0B(context);
    }

    public void onClick(View view) {
        MessageText messageText = this.A00;
        messageText.A00 = 0;
        messageText.A0K(messageText.A04, this.A01, messageText.A0D);
    }
}
