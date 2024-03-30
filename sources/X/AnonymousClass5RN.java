package X;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.5RN  reason: invalid class name */
public final class AnonymousClass5RN extends ClassLoader {
    public final Class loadClass(String str, boolean z) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z);
        }
        if (!FirebaseInstanceId.A05()) {
            return C134506b9.class;
        }
        Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
        return C134506b9.class;
    }
}
