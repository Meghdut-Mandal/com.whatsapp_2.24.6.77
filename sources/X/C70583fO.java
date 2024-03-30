package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.3fO  reason: invalid class name and case insensitive filesystem */
public final class C70583fO implements C87734Py {
    public final C30791am A00;

    public C70583fO(C30791am r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BlQ(Context context, AnonymousClass3T1 r5, C207219uk r6, int i) {
        C207089uX r0;
        if ((context instanceof Activity) && (r0 = r6.A04) != null) {
            try {
                this.A00.A02(C24801Dv.A00(context), r5, ((C206569tc) r0.A03.get(i)).A01, i);
            } catch (JSONException e) {
                Log.e("NativeFlowAction/handleRequest : ConversationRow exception processing NFM message", e);
            }
        }
    }
}
