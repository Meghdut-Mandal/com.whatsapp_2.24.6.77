package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.0FH  reason: invalid class name */
public class AnonymousClass0FH extends AnonymousClass04Z {
    public /* bridge */ /* synthetic */ Object A02(Intent intent, int i) {
        if (!AnonymousClass000.A1S(i, -1) || intent == null) {
            return null;
        }
        return intent.getData();
    }

    public /* bridge */ /* synthetic */ Intent A00(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        AnonymousClass00C.A0D(strArr, 1);
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
        AnonymousClass00C.A08(type);
        return type;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0SE A01(Context context, Object obj) {
        return null;
    }
}
