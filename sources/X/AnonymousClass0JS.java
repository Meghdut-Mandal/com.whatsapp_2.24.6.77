package X;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.0JS  reason: invalid class name */
public abstract class AnonymousClass0JS extends BasePendingResult implements C16790q6 {
    public final AnonymousClass0QI A00;
    public final C06190Sq A01;

    public abstract void A0A(C15900oC r1);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0JS(C06190Sq r2, AnonymousClass0XK r3) {
        super(r3);
        AnonymousClass006.A02(r3, "GoogleApiClient must not be null");
        AnonymousClass006.A02(r2, "Api must not be null");
        this.A00 = r2.A01;
        this.A01 = r2;
    }

    public final void A0B(Status status) {
        boolean z = false;
        if (status.A01 <= 0) {
            z = true;
        }
        AnonymousClass006.A07(!z, "Failed result must not be success");
        A06(A03(status));
    }

    public /* bridge */ /* synthetic */ void Bs2(Object obj) {
        A06((C16780q5) obj);
    }

    public final void A09(C15900oC r8) {
        try {
            A0A(r8);
        } catch (DeadObjectException e) {
            A0B(new Status((PendingIntent) null, (AnonymousClass0L0) null, e.getLocalizedMessage(), 1, 8));
            throw e;
        } catch (RemoteException e2) {
            A0B(new Status((PendingIntent) null, (AnonymousClass0L0) null, e2.getLocalizedMessage(), 1, 8));
        }
    }
}
