package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.webkit.WebMessagePort;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.json.JSONObject;

/* renamed from: X.6a0  reason: invalid class name and case insensitive filesystem */
public final class C133796a0 implements Handler.Callback {
    public C92624eH A00;
    public WebMessagePort A01;
    public final Context A02;
    public final Handler A03;
    public final UserJid A04;
    public final AnonymousClass1EU A05;
    public final Looper A06;
    public final AnonymousClass190 A07;

    public boolean handleMessage(Message message) {
        AnonymousClass00C.A0D(message, 0);
        if (message.what != 0) {
            return true;
        }
        A03(new AnonymousClass7O2(message, this));
        return true;
    }

    public static final void A03(AnonymousClass00S r2) {
        if (Build.VERSION.SDK_INT >= 23) {
            r2.invoke();
        } else {
            Log.e("Api check failed");
        }
    }

    public C133796a0(Context context, Looper looper, AnonymousClass190 r4, UserJid userJid, AnonymousClass1EU r6) {
        this.A02 = context;
        this.A06 = looper;
        this.A07 = r4;
        this.A04 = userJid;
        this.A05 = r6;
        this.A03 = new Handler(looper, this);
    }

    public static final void A02(C133796a0 r4, Object obj, JSONObject jSONObject) {
        Object obj2;
        JSONObject put = C36441kJ.A1B().put("responseData", C36441kJ.A1B().put("result", obj));
        Object obj3 = null;
        if (jSONObject != null) {
            obj2 = jSONObject.get("method");
        } else {
            obj2 = null;
        }
        JSONObject put2 = put.put("method", obj2);
        if (jSONObject != null) {
            obj3 = jSONObject.get("callbackID");
        }
        A03(new AnonymousClass7O1(r4, put2.put("callbackID", obj3)));
    }
}
