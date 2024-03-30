package X;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;

/* renamed from: X.0Vo  reason: invalid class name and case insensitive filesystem */
public abstract class C06910Vo {
    public static final C15930oH A00 = new C10460eH();

    public static zzw A00(C06290Ta r3, C16850qC r4) {
        C15930oH r2 = A00;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        r3.A02(new C10160dn(r3, r4, r2, taskCompletionSource));
        return taskCompletionSource.zza;
    }
}
