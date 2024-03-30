package X;

import android.app.DatePickerDialog;
import com.whatsapp.conversation.ConversationSearchFragment;
import java.util.Calendar;

/* renamed from: X.4AO  reason: invalid class name */
public final class AnonymousClass4AO extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ ConversationSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4AO(ConversationSearchFragment conversationSearchFragment) {
        super(0);
        this.this$0 = conversationSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        C93154fy r4 = new C93154fy((DatePickerDialog.OnDateSetListener) null, this.this$0.A0a(), Calendar.getInstance(), 0, -1, -1, -1);
        ConversationSearchFragment conversationSearchFragment = this.this$0;
        r4.A01.setMaxDate(timeInMillis);
        r4.A00 = conversationSearchFragment.A00;
        return r4;
    }
}
