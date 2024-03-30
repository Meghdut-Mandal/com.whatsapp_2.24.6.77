package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass6WJ;
import X.C001700s;
import X.C105545Fb;
import X.C119375pi;
import X.C19730wQ;
import X.C24261Bt;
import X.C28201Rs;
import X.C36441kJ;
import X.C61693Db;
import X.C95504lc;
import com.whatsapp.jid.UserJid;

public class MenuBottomSheetViewModel extends C95504lc {
    public int A00;
    public C119375pi A01;
    public UserJid A02;
    public final C001700s A03 = C36441kJ.A0Z((Object) null);
    public final C001700s A04 = C36441kJ.A0Z((Object) null);
    public final C19730wQ A05;
    public final C61693Db A06;
    public final AnonymousClass6WJ A07;
    public final AnonymousClass16D A08;
    public final AnonymousClass171 A09;
    public final C24261Bt A0A;
    public final C28201Rs A0B = C36441kJ.A0t();
    public final C28201Rs A0C = C36441kJ.A0t();
    public final C105545Fb A0D;

    public void A0R() {
        this.A0D.unregisterObserver(this);
    }

    public MenuBottomSheetViewModel(C19730wQ r3, C61693Db r4, AnonymousClass6WJ r5, C105545Fb r6, AnonymousClass16D r7, AnonymousClass171 r8, C24261Bt r9) {
        this.A05 = r3;
        this.A0D = r6;
        this.A08 = r7;
        this.A09 = r8;
        this.A07 = r5;
        this.A06 = r4;
        this.A0A = r9;
        r6.registerObserver(this);
        C95504lc.A02(r6, this);
    }
}
