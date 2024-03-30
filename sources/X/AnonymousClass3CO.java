package X;

import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.3CO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CO {
    public final /* synthetic */ AnonymousClass2IR A00;

    public /* synthetic */ AnonymousClass3CO(AnonymousClass2IR r1) {
        this.A00 = r1;
    }

    public final void A00(AnonymousClass3EY r6, int i) {
        AnonymousClass2IR r4 = this.A00;
        AnonymousClass4V7 A02 = AnonymousClass3SS.A02(r4);
        if (A02 == null) {
            Log.e("ConversationRow/dynamicReplyOnClickCallback/error: not click in Conversation");
        } else {
            C206969uL r3 = r6.A02;
            if (r3 != null) {
                try {
                    ((C30791am) r4.A2A.get()).A02(A02.BoP(), r4.getFMessage(), r3, i);
                } catch (JSONException unused) {
                    Log.e("[PAY] : ConversationRow exception processing NFM message");
                }
            } else {
                A02.Bpj(r4.getFMessage(), r6);
            }
        }
        r4.A1Y();
    }
}
