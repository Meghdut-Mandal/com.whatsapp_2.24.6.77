package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: X.3JN  reason: invalid class name */
public final class AnonymousClass3JN {
    public List A00;
    public Map A01;
    public final Context A02;

    public AnonymousClass3JN(Context context) {
        AnonymousClass00C.A0D(context, 1);
        this.A02 = context;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3JN) && AnonymousClass00C.A0J(this.A02, ((AnonymousClass3JN) obj).A02));
    }

    public int hashCode() {
        return this.A02.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PushPsaNotificationInfo(applicationContext=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
