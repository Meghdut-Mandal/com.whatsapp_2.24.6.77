package X;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Map;

/* renamed from: X.6nO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C141526nO implements Continuation {
    public final FirebaseInstanceId A00;
    public final String A01;
    public final String A02;

    public C141526nO(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.A00 = firebaseInstanceId;
        this.A01 = str;
        this.A02 = str2;
    }

    public final Object then(Task task) {
        Task task2;
        FirebaseInstanceId firebaseInstanceId = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String A022 = FirebaseInstanceId.A02();
        AnonymousClass6KS A002 = FirebaseInstanceId.A00(str, str2);
        if (!firebaseInstanceId.A0A(A002)) {
            return Tasks.forResult(new C115095iK(A002.A01));
        }
        C19370up r6 = firebaseInstanceId.A04;
        C122205uT r4 = new C122205uT(firebaseInstanceId, A022, str, str2);
        synchronized (r6) {
            Pair A0Q = C36441kJ.A0Q(str, str2);
            Map map = r6.A00;
            task2 = (Task) map.get(A0Q);
            if (task2 == null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(A0Q);
                    C90464aC.A1G("Making new request for: ", valueOf, "FirebaseInstanceId", C90524aI.A0h(C90474aD.A05(valueOf) + 24));
                }
                FirebaseInstanceId firebaseInstanceId2 = r4.A00;
                String str3 = r4.A01;
                String str4 = r4.A02;
                String str5 = r4.A03;
                C19310uj r3 = firebaseInstanceId2.A06;
                task2 = C19310uj.A00(AnonymousClass001.A07(), r3, str3, str4, str5).continueWith(r3.A04, new C141506nM(r3)).onSuccessTask(firebaseInstanceId2.A07, new C141616nX(firebaseInstanceId2, str4, str5, str3)).continueWithTask(r6.A01, new C141516nN(A0Q, r6));
                map.put(A0Q, task2);
            } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf2 = String.valueOf(A0Q);
                C90464aC.A1G("Joining ongoing request for: ", valueOf2, "FirebaseInstanceId", C90524aI.A0h(C90474aD.A05(valueOf2) + 29));
            }
        }
        return task2;
    }
}
