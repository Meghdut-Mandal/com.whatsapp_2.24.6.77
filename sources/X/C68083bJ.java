package X;

import com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel;
import com.whatsapp.status.viewmodels.StatusesViewModel;

/* renamed from: X.3bJ  reason: invalid class name and case insensitive filesystem */
public final class C68083bJ implements AnonymousClass04G {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C57842yu A01;
    public final /* synthetic */ StatusesViewModel A02;

    public /* synthetic */ AnonymousClass04R B46(AnonymousClass04K r2, Class cls) {
        return AnonymousClass0QC.A00(this, cls);
    }

    public C68083bJ(C57842yu r1, StatusesViewModel statusesViewModel, int i) {
        this.A01 = r1;
        this.A02 = statusesViewModel;
        this.A00 = i;
    }

    public AnonymousClass04R B3o(Class cls) {
        C57842yu r0 = this.A01;
        StatusesViewModel statusesViewModel = this.A02;
        int i = this.A00;
        C27121Mz r2 = r0.A00;
        C27111My r1 = r2.A00;
        return new StatusSeeAllViewModel((C57852yv) r1.A0G.get(), (C57862yw) r1.A0F.get(), statusesViewModel, C36361kB.A0e(r2.A01), C25141Fd.A00(), i);
    }
}
