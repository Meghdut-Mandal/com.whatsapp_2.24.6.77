package com.whatsapp.videoplayback;

import X.AnonymousClass000;
import X.AnonymousClass5NT;
import X.C127956Ah;
import X.C135606cy;
import X.C199579fY;
import X.C204359ps;
import X.C36341k9;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;

public class HeroPlaybackControlView extends AnonymousClass5NT {
    public final Handler A00;
    public final C199579fY A01;
    public final C135606cy A02;

    public void setPlayer(Object obj) {
        C127956Ah r0;
        if (!this.A02.A0E(6576) && (r0 = this.A03) != null) {
            AnonymousClass000.A14(r0.A01.A0C, this.A02, 45);
        }
        if (obj != null) {
            C127956Ah r02 = new C127956Ah((C204359ps) obj, this);
            this.A03 = r02;
            AnonymousClass000.A14(r02.A01.A0C, this.A02, 44);
        } else {
            this.A03 = null;
        }
        A07();
        A06();
        A08();
    }

    public HeroPlaybackControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = C36341k9.A0H();
        this.A01 = new C199579fY();
        C135606cy r1 = new C135606cy(this);
        this.A02 = r1;
        this.A0M.setOnSeekBarChangeListener(r1);
        this.A0L.setOnClickListener(r1);
    }

    public HeroPlaybackControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeroPlaybackControlView(Context context) {
        this(context, (AttributeSet) null);
    }
}
