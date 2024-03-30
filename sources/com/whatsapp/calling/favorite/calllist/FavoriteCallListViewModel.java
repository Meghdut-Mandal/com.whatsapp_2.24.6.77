package com.whatsapp.calling.favorite.calllist;

import X.AnonymousClass005;
import X.AnonymousClass00T;
import X.AnonymousClass04R;
import X.AnonymousClass05E;
import X.AnonymousClass05K;
import X.AnonymousClass05L;
import X.AnonymousClass05N;
import X.AnonymousClass0R1;
import X.AnonymousClass16D;
import X.AnonymousClass17X;
import X.C000800j;
import X.C001400p;
import X.C005502l;
import X.C023409w;
import X.C023509x;
import X.C07360Xi;
import X.C109325Xd;
import X.C12990iz;
import X.C13120jC;
import X.C19580wB;
import X.C19730wQ;
import X.C20810yC;
import X.C28201Rs;
import X.C34641hP;
import X.C36321k7;
import X.C36381kD;
import X.C36411kG;
import X.C36441kJ;
import X.C833248y;

public final class FavoriteCallListViewModel extends AnonymousClass04R {
    public final C19730wQ A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass17X A02;
    public final C34641hP A03;
    public final C20810yC A04;
    public final C28201Rs A05 = C36441kJ.A0t();
    public final AnonymousClass005 A06;
    public final AnonymousClass00T A07;
    public final C005502l A08;
    public final C005502l A09;
    public final AnonymousClass05L A0A;
    public final AnonymousClass05K A0B;
    public final AnonymousClass05K A0C;
    public final AnonymousClass05L A0D;

    public void A0R() {
        C36411kG.A1I((C19580wB) this.A06.get(), this.A07);
    }

    public final void A0S(boolean z) {
        this.A0D.setValue(Boolean.valueOf(z));
        C19580wB r1 = (C19580wB) this.A06.get();
        Object value = this.A07.getValue();
        if (!z) {
            r1.registerObserver(value);
        } else {
            r1.unregisterObserver(value);
        }
    }

    public FavoriteCallListViewModel(C19730wQ r7, AnonymousClass16D r8, AnonymousClass17X r9, C34641hP r10, C20810yC r11, AnonymousClass005 r12, C005502l r13, C005502l r14) {
        C36321k7.A1B(r11, r8, r10, r9, r7);
        C36321k7.A13(r12, r13, r14);
        this.A04 = r11;
        this.A01 = r8;
        this.A03 = r10;
        this.A02 = r9;
        this.A00 = r7;
        this.A06 = r12;
        this.A08 = r13;
        this.A09 = r14;
        C023409w r5 = C023409w.A00;
        AnonymousClass05N A002 = AnonymousClass05E.A00(r5);
        this.A0A = A002;
        AnonymousClass05N r2 = new AnonymousClass05N(C36381kD.A0j());
        this.A0D = r2;
        this.A0B = r2;
        this.A0C = C07360Xi.A01(r5, C109325Xd.A00(this), AnonymousClass0R1.A00(r13, new C12990iz(new FavoriteCallListViewModel$favorites$1(this, (C023509x) null), A002, r2)), new C13120jC(0));
        this.A07 = C001400p.A00(C000800j.NONE, new C833248y(this));
        C36381kD.A1R(this.A08, new FavoriteCallListViewModel$loadFavorites$1(this, (C023509x) null), C109325Xd.A00(this));
    }
}
