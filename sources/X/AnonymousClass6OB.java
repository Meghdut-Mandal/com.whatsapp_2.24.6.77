package X;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6OB  reason: invalid class name */
public class AnonymousClass6OB {
    public boolean A00 = true;
    public final C130366Ku A01;
    public final Map A02 = AnonymousClass001.A0J();
    public final Set A03 = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();

    public AnonymousClass6E4 A00() {
        AnonymousClass6E4 r3 = new AnonymousClass6E4(this);
        Map map = this.A02;
        String str = r3.A0B;
        if (!map.containsKey(str)) {
            map.put(str, r3);
            return r3;
        }
        throw AnonymousClass001.A08("spring is already registered");
    }

    public void A01(String str) {
        Object obj = this.A02.get(str);
        if (obj != null) {
            this.A03.add(obj);
            if (this.A00) {
                this.A00 = false;
                C130366Ku r2 = this.A01;
                if (!r2.A02) {
                    r2.A02 = true;
                    r2.A00 = SystemClock.uptimeMillis();
                    Choreographer choreographer = r2.A04;
                    Choreographer.FrameCallback frameCallback = r2.A03;
                    choreographer.removeFrameCallback(frameCallback);
                    choreographer.postFrameCallback(frameCallback);
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("springId ");
        A0u.append(str);
        throw AnonymousClass000.A0c(" does not reference a registered spring", A0u);
    }

    public AnonymousClass6OB(C130366Ku r2) {
        this.A01 = r2;
        r2.A01 = this;
    }
}
