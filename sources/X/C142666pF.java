package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.AlarmService;
import com.whatsapp.util.Log;

/* renamed from: X.6pF  reason: invalid class name and case insensitive filesystem */
public final class C142666pF implements C19710wO {
    public final Context A00;

    public String BIB() {
        return "AlarmServiceAsyncInit";
    }

    public /* synthetic */ void BRM() {
    }

    public void BRL() {
        Context context = this.A00;
        Class<AlarmService> cls = AlarmService.class;
        try {
            AnonymousClass0DY.A00(context, new Intent("com.whatsapp.action.SETUP", (Uri) null, context, cls), cls, 3);
        } catch (IllegalArgumentException e) {
            Log.e("AlarmService/start-failed-with-exception", e);
        }
    }

    public C142666pF(Context context) {
        this.A00 = context;
    }
}
