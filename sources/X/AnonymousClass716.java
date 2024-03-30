package X;

import android.util.Log;

/* renamed from: X.716  reason: invalid class name */
public final /* synthetic */ class AnonymousClass716 implements C158707hw {
    public final /* synthetic */ String A00;

    public /* synthetic */ AnonymousClass716(String str) {
        this.A00 = str;
    }

    public final void BWW(boolean z, Object obj, Object obj2, Object obj3) {
        String str = this.A00;
        String str2 = (String) obj;
        if (z) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Bloks: CacheShards evicted ");
            A0u.append(str);
            Log.d("Whatsapp", AnonymousClass000.A0p(" :: ", str2, A0u));
        }
    }
}
