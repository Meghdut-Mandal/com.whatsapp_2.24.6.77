package X;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0JJ  reason: invalid class name */
public final class AnonymousClass0JJ extends C07590Yl {
    public static final AnonymousClass0JC A01;
    public static final AnonymousClass0QI A02;
    public static final C06190Sq A03;
    public static final AnonymousClass0UT A04 = new AnonymousClass0UT("Auth", "GoogleAuthServiceClient");
    public final Context A00;

    static {
        AnonymousClass0QI r3 = new AnonymousClass0QI();
        A02 = r3;
        AnonymousClass0J8 r2 = new AnonymousClass0J8();
        A01 = r2;
        A03 = new C06190Sq(r2, r3, "GoogleAuthService.API");
    }

    public AnonymousClass0JJ(Context context) {
        super(context, (C17370rB) C17370rB.A00, A03, AnonymousClass0WU.A02);
        this.A00 = context;
    }

    public static /* bridge */ /* synthetic */ void A00(Status status, TaskCompletionSource taskCompletionSource, Object obj) {
        boolean zzd;
        if (status.A01 <= 0) {
            zzd = taskCompletionSource.zza.zze(obj);
        } else {
            zzd = taskCompletionSource.zza.zzd(AnonymousClass0QL.A00(status));
        }
        if (!zzd) {
            A04.A01("The task is already complete.", new Object[0]);
        }
    }
}
