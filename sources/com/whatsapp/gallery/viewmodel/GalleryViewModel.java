package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass04R;
import X.AnonymousClass12T;
import X.AnonymousClass1A1;
import X.AnonymousClass2U8;
import X.C001700s;
import X.C005502l;
import X.C007403e;
import X.C023509x;
import X.C02680Bk;
import X.C109325Xd;
import X.C19970wo;
import X.C36321k7;
import X.C36331k8;
import X.C36431kI;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class GalleryViewModel extends AnonymousClass04R {
    public C02680Bk A00;
    public C007403e A01;
    public C007403e A02;
    public final C001700s A03 = C36431kI.A0S();
    public final AnonymousClass12T A04;
    public final AnonymousClass1A1 A05;
    public final C005502l A06;
    public final C005502l A07;
    public final C19970wo A08;

    public void A0R() {
        C02680Bk r0 = this.A00;
        if (r0 != null) {
            r0.A03();
        }
        this.A00 = null;
        C007403e r02 = this.A01;
        if (r02 != null) {
            r02.B2S((CancellationException) null);
        }
        C007403e r03 = this.A02;
        if (r03 != null) {
            r03.B2S((CancellationException) null);
        }
    }

    public GalleryViewModel(C19970wo r2, AnonymousClass12T r3, AnonymousClass1A1 r4, C005502l r5, C005502l r6) {
        C36321k7.A1B(r2, r4, r3, r5, r6);
        this.A08 = r2;
        this.A05 = r4;
        this.A04 = r3;
        this.A06 = r5;
        this.A07 = r6;
    }

    public static final int A01(GalleryViewModel galleryViewModel, List list, int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GalleryViewModel/report bucket/");
        A0u.append(i);
        A0u.append('/');
        C36321k7.A1Y(A0u, list.size());
        AnonymousClass2U8 r3 = new AnonymousClass2U8(list, i);
        C36331k8.A1T(new GalleryViewModel$notifyOnMainThread$1(galleryViewModel, r3, (C023509x) null), C109325Xd.A00(galleryViewModel));
        return list.size();
    }
}
