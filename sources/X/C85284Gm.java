package X;

import java.lang.ref.WeakReference;

/* renamed from: X.4Gm  reason: invalid class name and case insensitive filesystem */
public final class C85284Gm extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ WeakReference $activity;
    public final /* synthetic */ C44072La $newsletter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85284Gm(C44072La r2, WeakReference weakReference) {
        super(0);
        this.$activity = weakReference;
        this.$newsletter = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C46512Yd r1 = (C46512Yd) this.$activity.get();
        if (r1 != null) {
            AnonymousClass24P.A07(this.$newsletter, r1);
        }
        return AnonymousClass0AJ.A00;
    }
}
