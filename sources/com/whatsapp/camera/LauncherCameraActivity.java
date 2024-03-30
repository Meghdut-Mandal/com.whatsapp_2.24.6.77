package com.whatsapp.camera;

import X.C100934wH;
import X.C1264664c;
import X.C1270866x;
import X.C163027pX;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C90464aC;
import X.C90474aD;
import X.C90504aG;

public class LauncherCameraActivity extends CameraActivity {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C90464aC.A11(r2, this);
            C18830tt r1 = r2.A00;
            C90464aC.A0y(r2, r1, this, C36321k7.A05(r2, r1, this));
            C100934wH.A01(A0L, r2, r1, this);
            this.A05 = C36351kA.A0X(r2);
            this.A0D = C90504aG.A0V(r2);
            this.A0C = (C1264664c) r2.AG5.get();
            this.A0E = (C1270866x) r1.A9g.get();
            this.A04 = C90474aD.A0R(r1);
            this.A0F = C18840tu.A00(A0L.A3N);
        }
    }

    public LauncherCameraActivity(int i) {
        this.A00 = false;
        C163027pX.A00(this, 25);
    }

    public LauncherCameraActivity() {
        this(0);
    }
}
