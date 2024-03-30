package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;

/* renamed from: X.1lF  reason: invalid class name and case insensitive filesystem */
public class C36751lF extends BitmapDrawable {
    public final /* synthetic */ ConversationRowImage$RowImageView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36751lF(Resources resources, Bitmap bitmap, ConversationRowImage$RowImageView conversationRowImage$RowImageView) {
        super(resources, bitmap);
        this.A00 = conversationRowImage$RowImageView;
    }

    public int getIntrinsicHeight() {
        return this.A00.A0A.A06;
    }

    public int getIntrinsicWidth() {
        return this.A00.A0A.A0A;
    }
}
