package X;

import com.facebook.cameracore.ardelivery.listener.CancelableToken;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.6MT  reason: invalid class name */
public class AnonymousClass6MT {
    public final AnonymousClass6NA A00;
    public final /* synthetic */ C132556Ug A01;

    public AnonymousClass6MT(AnonymousClass6NA r1, C132556Ug r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    private AnonymousClass6NA A00(AnonymousClass6NA r6) {
        C132556Ug r4 = this.A01;
        Queue queue = r4.A07;
        if (queue.isEmpty()) {
            if (r4.A00 != r6) {
                throw new IllegalStateException();
            }
        } else if (!((AnonymousClass6NA) queue.peek()).A01) {
            if (r4.A00 == r6) {
                Map map = r4.A05;
                if (((CancelableToken) map.get(r6)).cancel()) {
                    r6.A00(C023109s.A0C);
                    map.remove(r6);
                    r4.A00 = null;
                    queue.offer(r6);
                    return r6;
                }
            } else if (queue.remove(r6)) {
                queue.offer(r6);
                return null;
            } else {
                throw new IllegalStateException();
            }
        }
        return null;
    }

    public void A01(boolean z) {
        AnonymousClass6NA r3;
        IllegalStateException illegalStateException;
        C132556Ug r5 = this.A01;
        synchronized (r5.A03) {
            AnonymousClass6NA r2 = this.A00;
            Integer num = r2.A00;
            if (num != C023109s.A0G && num != C023109s.A0R && z != r2.A01) {
                r2.A01 = z;
                if (z) {
                    r3 = A00(r2);
                } else {
                    AnonymousClass6NA r0 = r5.A00;
                    if (r0 != r2) {
                        if (r0 != null) {
                            Queue queue = r5.A07;
                            if (queue.remove(r2)) {
                                queue.offer(r2);
                                AnonymousClass6NA r1 = r5.A00;
                                if (r1.A01) {
                                    r3 = A00(r1);
                                }
                            } else {
                                illegalStateException = new IllegalStateException();
                            }
                        } else {
                            illegalStateException = new IllegalStateException();
                        }
                        throw illegalStateException;
                    }
                    C132556Ug.A01(r5);
                    ArrayList A002 = C132556Ug.A00(r5);
                    C132556Ug.A02(r5, A002);
                }
                if (r3 != null) {
                    r5.A04.add(new AnonymousClass75C((Object) this, (Object) r3, 39));
                }
                C132556Ug.A01(r5);
                ArrayList A0022 = C132556Ug.A00(r5);
                C132556Ug.A02(r5, A0022);
            }
        }
    }
}
