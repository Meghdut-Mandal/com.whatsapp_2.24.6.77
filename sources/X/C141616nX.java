package X;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6nX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C141616nX implements SuccessContinuation {
    public final FirebaseInstanceId A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C141616nX(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.A00 = firebaseInstanceId;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final Task then(Object obj) {
        FirebaseInstanceId firebaseInstanceId = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String str3 = (String) obj;
        C19290uh r3 = FirebaseInstanceId.A08;
        String A06 = firebaseInstanceId.A03.A06();
        synchronized (r3) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject A1B = C36441kJ.A1B();
                A1B.put("token", str3);
                A1B.put("appVersion", A06);
                A1B.put("timestamp", currentTimeMillis);
                String obj2 = A1B.toString();
                if (obj2 != null) {
                    SharedPreferences.Editor edit = r3.A01.edit();
                    edit.putString(C19290uh.A01(str, str2), obj2);
                    edit.commit();
                }
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                Log.w("FirebaseInstanceId", AnonymousClass000.A0p("Failed to encode token: ", valueOf, C90524aI.A0h(C90474aD.A05(valueOf) + 24)));
            }
        }
        return Tasks.forResult(new C115095iK(str3));
    }
}
