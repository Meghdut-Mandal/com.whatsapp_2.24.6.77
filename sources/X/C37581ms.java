package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.whatsapp.R;
import com.whatsapp.conversation.ConversationEntryActionButton;

/* renamed from: X.1ms  reason: invalid class name and case insensitive filesystem */
public class C37581ms extends ViewOutlineProvider {
    public final /* synthetic */ ConversationEntryActionButton A00;

    public C37581ms(ConversationEntryActionButton conversationEntryActionButton) {
        this.A00 = conversationEntryActionButton;
    }

    public void getOutline(View view, Outline outline) {
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        outline.setOval(0, 0, dimensionPixelSize, dimensionPixelSize);
    }
}
