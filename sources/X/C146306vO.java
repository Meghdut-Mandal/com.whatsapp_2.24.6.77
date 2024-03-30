package X;

import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.6vO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146306vO implements C87914Qr {
    public final /* synthetic */ C158337gl A00;
    public final /* synthetic */ AnonymousClass1VD A01;

    public /* synthetic */ C146306vO(C158337gl r1, AnonymousClass1VD r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void B72(Set set) {
        List list;
        AnonymousClass1VD r7 = this.A01;
        C158337gl r6 = this.A00;
        if (set.isEmpty()) {
            list = Collections.emptyList();
        } else {
            ArrayList A0I = AnonymousClass001.A0I();
            AnonymousClass1VK r2 = r7.A00;
            C225614x it = r2.A01.iterator();
            while (it.hasNext()) {
                A0I.add(((AnonymousClass005) it.next()).get());
            }
            C20070wy r4 = r2.A00;
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                String A0C = AnonymousClass001.A0C(it2);
                try {
                    if (r7.A02.A01(A0C).A03) {
                        AnonymousClass005 r0 = (AnonymousClass005) r4.get(A0C);
                        if (r0 != null) {
                            A0I.add(r0.get());
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                C36321k7.A1R("InstrumentationChangeDispatcher/verification failed, dropping event for package - ", A0C, AnonymousClass000.A0u());
                r7.A01.A04(A0C);
            }
            list = A0I;
        }
        r6.B70(list);
    }
}
