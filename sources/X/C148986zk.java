package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: X.6zk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C148986zk implements C158597hl {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ AnonymousClass6LA A01;
    public final /* synthetic */ WeakReference A02;

    public /* synthetic */ C148986zk(Intent intent, AnonymousClass6LA r2, WeakReference weakReference) {
        this.A01 = r2;
        this.A02 = weakReference;
        this.A00 = intent;
    }

    public final void BX5(Object obj) {
        AnonymousClass6LA r5 = this.A01;
        WeakReference weakReference = this.A02;
        Intent intent = this.A00;
        Context A0G = C36441kJ.A0G(weakReference);
        if (A0G != null) {
            C36341k9.A0v(C19420v0.A00((C19420v0) ((AnonymousClass62F) r5.A00.get()).A01.get()), "shops_privacy_notice", -1);
            AnonymousClass6LA.A00(A0G, intent, r5);
        }
    }
}
