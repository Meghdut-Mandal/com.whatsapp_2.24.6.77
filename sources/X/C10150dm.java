package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.0dm  reason: invalid class name and case insensitive filesystem */
public final class C10150dm implements C16770q4 {
    public final /* synthetic */ BasePendingResult A00;
    public final /* synthetic */ AnonymousClass0WT A01;

    public C10150dm(BasePendingResult basePendingResult, AnonymousClass0WT r2) {
        this.A01 = r2;
        this.A00 = basePendingResult;
    }

    public final void BU0(Status status) {
        this.A01.A00.remove(this.A00);
    }
}
