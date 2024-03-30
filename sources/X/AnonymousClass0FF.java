package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.0FF  reason: invalid class name */
public final class AnonymousClass0FF extends AnonymousClass04Z {
    public /* bridge */ /* synthetic */ Intent A00(Context context, Object obj) {
        C08770bI r4 = (C08770bI) obj;
        AnonymousClass00C.A0D(r4, 1);
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", r4);
        AnonymousClass00C.A08(putExtra);
        return putExtra;
    }

    public /* bridge */ /* synthetic */ Object A02(Intent intent, int i) {
        return new C009804d(i, intent);
    }
}
