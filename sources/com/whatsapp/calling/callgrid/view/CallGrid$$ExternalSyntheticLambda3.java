package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.AnonymousClass16I;
import X.AnonymousClass16L;
import X.AnonymousClass1RY;
import X.AnonymousClass52T;
import X.AnonymousClass60n;
import X.C116925lQ;
import X.C27731Pn;
import X.C36361kB;
import X.C90504aG;
import X.C96104mn;
import java.util.Iterator;
import java.util.Map;

public final /* synthetic */ class CallGrid$$ExternalSyntheticLambda3 implements AnonymousClass01Y {
    public final /* synthetic */ CallGrid A00;

    public /* synthetic */ CallGrid$$ExternalSyntheticLambda3(CallGrid callGrid) {
        this.A00 = callGrid;
    }

    public final void BhM(AnonymousClass05R r7, AnonymousClass012 r8) {
        CallGrid callGrid = this.A00;
        if (r7 == AnonymousClass05R.ON_START) {
            int i = C36361kB.A0B(callGrid).widthPixels;
            C116925lQ r5 = callGrid.A0d;
            C27731Pn r3 = callGrid.A0F;
            AnonymousClass1RY A06 = r3.A06("call-grid", 0.0f, i / 2);
            Map map = r5.A00;
            C90504aG.A1K(A06, map, 0);
            map.put(C36361kB.A0i(), r3.A05(callGrid.getContext(), "voip-call-control-bottom-sheet"));
            C96104mn r32 = callGrid.A05;
            r32.A02 = r5;
            AnonymousClass52T r2 = callGrid.A06;
            r2.A02 = r5;
            AnonymousClass60n r0 = callGrid.A0e;
            r32.A03 = r0;
            r2.A03 = r0;
            AnonymousClass16I r1 = callGrid.A0D;
            r1.registerObserver(r32.A07);
            r1.registerObserver(r2.A07);
            r1.registerObserver(callGrid.A0i);
            callGrid.A0c.A0v(callGrid.A0a);
            callGrid.A0b.A0v(callGrid.A0Z);
        } else if (r7 == AnonymousClass05R.ON_STOP) {
            if (callGrid.A0N) {
                CallGrid.A09(callGrid, AnonymousClass001.A0I(), false);
                CallGrid.A09(callGrid, AnonymousClass001.A0I(), true);
            }
            C116925lQ r02 = callGrid.A0d;
            if (r02 != null) {
                Map map2 = r02.A00;
                Iterator A0z = AnonymousClass000.A0z(map2);
                while (A0z.hasNext()) {
                    ((AnonymousClass1RY) A0z.next()).A02();
                }
                map2.clear();
            }
            AnonymousClass16L r12 = callGrid.A02;
            synchronized (r12.A01) {
                if (r12.A07 != null) {
                    r12.A07.A0A(0);
                }
            }
            AnonymousClass16I r13 = callGrid.A0D;
            C96104mn r33 = callGrid.A05;
            r13.unregisterObserver(r33.A07);
            AnonymousClass52T r22 = callGrid.A06;
            r13.unregisterObserver(r22.A07);
            r13.unregisterObserver(callGrid.A0i);
            callGrid.A0c.A0w(callGrid.A0a);
            callGrid.A0b.A0w(callGrid.A0Z);
            r33.A03 = null;
            r22.A03 = null;
            callGrid.A0B.A04();
            AnonymousClass1RY r03 = callGrid.A0E;
            if (r03 != null) {
                r03.A02();
            }
        }
    }
}
