package androidx.compose.ui.platform;

import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass040;
import X.AnonymousClass05R;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AP;
import X.C008903u;
import X.C023109s;
import X.C023509x;
import X.C10810fG;
import X.C122035uC;
import android.view.View;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import java.util.List;

public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 implements AnonymousClass01Y {
    public final /* synthetic */ View A00;
    public final /* synthetic */ PausableMonotonicFrameClock A01;
    public final /* synthetic */ Recomposer A02;
    public final /* synthetic */ C10810fG A03;
    public final /* synthetic */ AnonymousClass040 A04;

    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2(View view, PausableMonotonicFrameClock pausableMonotonicFrameClock, Recomposer recomposer, C10810fG r4, AnonymousClass040 r5) {
        this.A04 = r5;
        this.A01 = pausableMonotonicFrameClock;
        this.A02 = recomposer;
        this.A03 = r4;
        this.A00 = view;
    }

    public void BhM(AnonymousClass05R r11, AnonymousClass012 r12) {
        AnonymousClass0AP r1;
        int ordinal = r11.ordinal();
        if (ordinal == 0) {
            AnonymousClass040 r2 = this.A04;
            Integer num = C023109s.A0G;
            C10810fG r9 = this.A03;
            AnonymousClass0A2.A02(num, C008903u.A00, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.A00, this.A02, this, r12, (C023509x) null, r9), r2);
        } else if (ordinal == 1) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock = this.A01;
            if (pausableMonotonicFrameClock != null) {
                C122035uC r13 = pausableMonotonicFrameClock.A00;
                synchronized (r13.A03) {
                    if (!r13.A02) {
                        List list = r13.A00;
                        r13.A00 = r13.A01;
                        r13.A01 = list;
                        r13.A02 = true;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((C023509x) list.get(i)).resumeWith(AnonymousClass0AJ.A00);
                        }
                        list.clear();
                    }
                }
            }
            Recomposer recomposer = this.A02;
            synchronized (recomposer.A0C) {
                if (recomposer.A07) {
                    recomposer.A07 = false;
                    r1 = Recomposer.A01(recomposer);
                } else {
                    r1 = null;
                }
            }
            if (r1 != null) {
                r1.resumeWith(AnonymousClass0AJ.A00);
            }
        } else if (ordinal == 4) {
            Recomposer recomposer2 = this.A02;
            synchronized (recomposer2.A0C) {
                recomposer2.A07 = true;
            }
        } else if (ordinal == 5) {
            this.A02.A0C();
        }
    }
}
