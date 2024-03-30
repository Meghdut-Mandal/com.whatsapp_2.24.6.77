package X;

import android.os.BaseBundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* renamed from: X.6nM  reason: invalid class name and case insensitive filesystem */
public final class C141506nM implements Continuation {
    public final /* synthetic */ C19310uj A00;

    public C141506nM(C19310uj r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ Object then(Task task) {
        BaseBundle baseBundle = (BaseBundle) task.getResult(IOException.class);
        if (baseBundle != null) {
            String string = baseBundle.getString("registration_id");
            if (string != null || (string = baseBundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = baseBundle.getString("error");
            if ("RST".equals(string2)) {
                throw C90524aI.A0X("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw C90524aI.A0X(string2);
            } else {
                String valueOf = String.valueOf(baseBundle);
                Log.w("FirebaseInstanceId", AnonymousClass000.A0p("Unexpected response: ", valueOf, C90524aI.A0h(C90474aD.A05(valueOf) + 21)), new Throwable());
                throw C90524aI.A0X("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw C90524aI.A0X("SERVICE_NOT_AVAILABLE");
        }
    }
}
