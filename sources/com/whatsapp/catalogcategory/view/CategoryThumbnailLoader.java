package com.whatsapp.catalogcategory.view;

import X.A97;
import X.A9A;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.AnonymousClass9ED;
import X.AnonymousClass9HG;
import X.B9E;
import X.C006302t;
import X.C196089Xp;
import X.C206759tv;
import android.widget.ImageView;
import com.whatsapp.jid.UserJid;

public final class CategoryThumbnailLoader implements AnonymousClass01Y {
    public final AnonymousClass012 A00;
    public final C196089Xp A01;

    public CategoryThumbnailLoader(AnonymousClass012 r2, C196089Xp r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
        r2.getLifecycle().A04(this);
    }

    public final void A00(C206759tv r10, UserJid userJid, AnonymousClass00S r12, AnonymousClass00S r13, C006302t r14) {
        AnonymousClass9HG r5 = new AnonymousClass9HG(new AnonymousClass9ED(897451484), userJid);
        C206759tv r3 = r10;
        this.A01.A01((ImageView) null, r3, new A97(r13), r5, new B9E(r12, 1), new A9A(r14), 2);
    }

    public void BhM(AnonymousClass05R r3, AnonymousClass012 r4) {
        AnonymousClass00C.A0D(r3, 1);
        if (r3.ordinal() == 5) {
            this.A01.A00();
            this.A00.getLifecycle().A05(this);
        }
    }
}
