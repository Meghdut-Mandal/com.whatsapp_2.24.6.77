package com.whatsapp.pnh;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass12O;
import X.AnonymousClass1FV;
import X.AnonymousClass1FX;
import X.AnonymousClass1X4;
import X.C001700s;
import X.C19770wU;
import X.C20380xT;
import X.C223313w;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36431kI;
import X.C63383Jv;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class RequestPhoneNumberViewModel extends AnonymousClass04R {
    public final Uri A00;
    public final C001700s A01 = C36431kI.A0S();
    public final AnonymousClass1X4 A02;
    public final AnonymousClass12O A03;
    public final AnonymousClass1FV A04;
    public final AnonymousClass1FX A05;
    public final C19770wU A06;
    public final Map A07;

    public static final void A01(C223313w r7, RequestPhoneNumberViewModel requestPhoneNumberViewModel) {
        C001700s r2 = requestPhoneNumberViewModel.A01;
        Uri uri = requestPhoneNumberViewModel.A00;
        C223313w r5 = r7;
        boolean A1V = AnonymousClass000.A1V(requestPhoneNumberViewModel.A03.A0A(r7));
        AnonymousClass1FV r1 = requestPhoneNumberViewModel.A04;
        r2.A0C(new C63383Jv(uri, r5, A1V, C36341k9.A1Z(r1.A06(r7)), r1.A0B(r5)));
    }

    public void A0R() {
        Map map = this.A07;
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Object A0u = C36351kA.A0u(A0y);
            AnonymousClass1FV r1 = this.A04;
            AnonymousClass00C.A0D(A0u, 0);
            Set set = r1.A08;
            synchronized (set) {
                set.remove(A0u);
            }
        }
        map.clear();
    }

    public RequestPhoneNumberViewModel(AnonymousClass1X4 r2, AnonymousClass12O r3, AnonymousClass1FV r4, AnonymousClass1FX r5, C20380xT r6, C19770wU r7) {
        C36321k7.A1B(r6, r7, r2, r3, r4);
        AnonymousClass00C.A0D(r5, 6);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.A06 = r7;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A07 = concurrentHashMap;
        Uri A022 = r6.A02("626403979060997");
        AnonymousClass00C.A08(A022);
        this.A00 = A022;
    }
}
