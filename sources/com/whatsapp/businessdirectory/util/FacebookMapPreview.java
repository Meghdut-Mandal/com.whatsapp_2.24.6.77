package com.whatsapp.businessdirectory.util;

import X.AnonymousClass00C;
import X.AnonymousClass00N;
import X.AnonymousClass01G;
import X.AnonymousClass05R;
import X.AnonymousClass1P6;
import X.AnonymousClass1RC;
import X.AnonymousClass5B8;
import X.AnonymousClass7eO;
import X.C124515yJ;
import X.C134996bx;
import X.C165447tR;
import X.C36361kB;
import X.C92794ej;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.OnLifecycleEvent;

public final class FacebookMapPreview implements AnonymousClass00N {
    public AnonymousClass5B8 A00;
    public final AnonymousClass7eO A01;

    public FacebookMapPreview(ViewGroup viewGroup, AnonymousClass7eO r6, C134996bx r7, AnonymousClass1P6 r8) {
        AnonymousClass00C.A0D(viewGroup, 1);
        this.A01 = r6;
        Activity A06 = C36361kB.A06(viewGroup);
        AnonymousClass00C.A0E(A06, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AnonymousClass01G r3 = (AnonymousClass01G) A06;
        r8.A03(r3);
        C124515yJ r2 = new C124515yJ();
        r2.A00 = 8;
        r2.A08 = false;
        r2.A05 = false;
        r2.A07 = false;
        r2.A02 = r7;
        r2.A06 = AnonymousClass1RC.A0A(r3);
        r2.A04 = "whatsapp_smb_business_discovery";
        AnonymousClass5B8 r1 = new AnonymousClass5B8(r3, r2);
        this.A00 = r1;
        r1.A0F((Bundle) null);
        r3.A06.A04(this);
        viewGroup.addView(this.A00);
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_CREATE)
    private final void onCreate() {
        AnonymousClass5B8 r2 = this.A00;
        r2.A0F((Bundle) null);
        r2.A0J(new C165447tR(this, 0));
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_DESTROY)
    private final void onDestroy() {
        double d = C92794ej.A0n;
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_PAUSE)
    private final void onPause() {
        double d = C92794ej.A0n;
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_RESUME)
    private final void onResume() {
        double d = C92794ej.A0n;
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_START)
    private final void onStart() {
        double d = C92794ej.A0n;
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_STOP)
    private final void onStop() {
        double d = C92794ej.A0n;
    }
}
