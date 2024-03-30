package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Iterator;

/* renamed from: X.1jV  reason: invalid class name and case insensitive filesystem */
public class C35941jV extends Handler {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35941jV(Looper looper, Object obj, Object obj2, Object obj3, int i) {
        super(looper);
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public void handleMessage(Message message) {
        AnonymousClass3T1 r3;
        AnonymousClass3T1 r4;
        if (this.A03 != 0) {
            int i = message.what;
            Object obj = message.obj;
            if (i == 11) {
                Pair pair = (Pair) obj;
                r3 = (AnonymousClass3T1) pair.first;
                r4 = (AnonymousClass3T1) pair.second;
            } else {
                r3 = (AnonymousClass3T1) obj;
                r4 = null;
                if (i != 2) {
                    switch (i) {
                        case 10:
                            AnonymousClass16J r2 = (AnonymousClass16J) this.A02;
                            Iterator it = r2.getObservers().iterator();
                            while (it.hasNext()) {
                                A00(r2, it).Baw(r3);
                            }
                            return;
                        case 11:
                            break;
                        case 12:
                            AnonymousClass11F r0 = r3.A1J.A00;
                            C18740tg.A06(r0);
                            C18740tg.A06(r0);
                            Iterator it2 = ((C19580wB) this.A01).getObservers().iterator();
                            while (it2.hasNext()) {
                                it2.next();
                            }
                            return;
                        case 13:
                            AnonymousClass11F r02 = r3.A1J.A00;
                            C18740tg.A06(r02);
                            C18740tg.A06(r02);
                            Iterator it3 = ((C19580wB) this.A01).getObservers().iterator();
                            while (it3.hasNext()) {
                                it3.next();
                            }
                            return;
                        case 14:
                            AnonymousClass16J r5 = (AnonymousClass16J) this.A02;
                            Iterator it4 = r5.getObservers().iterator();
                            while (it4.hasNext()) {
                                it4.next();
                                r5.A00++;
                            }
                            return;
                        default:
                            return;
                    }
                } else {
                    AnonymousClass1DQ.A00((AnonymousClass1DQ) this.A00, r3, message.arg1);
                    return;
                }
            }
            AnonymousClass16J r22 = (AnonymousClass16J) this.A02;
            if (r4 != null) {
                Iterator it5 = r22.getObservers().iterator();
                while (it5.hasNext()) {
                    A00(r22, it5).Bck(r3, r4);
                }
                return;
            }
            return;
        }
        AnonymousClass3T1 r52 = (AnonymousClass3T1) message.obj;
        int i2 = message.what;
        if (i2 == 3) {
            AnonymousClass16J r23 = (AnonymousClass16J) this.A02;
            Iterator it6 = r23.getObservers().iterator();
            while (it6.hasNext()) {
                A00(r23, it6).BWH(r52);
            }
        } else if (i2 == 4) {
            AnonymousClass1DP r42 = (AnonymousClass1DP) this.A01;
            AnonymousClass11F r32 = r52.A1J.A00;
            C18740tg.A06(r32);
            r42.A00.Bp3(new C35681j5(r42, r32, 42));
            ((AnonymousClass16J) this.A02).A04(r52, message.arg1);
        } else if (i2 == 5) {
            AnonymousClass1DQ r33 = (AnonymousClass1DQ) this.A00;
            r33.A04.A04(r52, message.arg1);
            C202319lY r24 = r52.A0M;
            if (r24 != null) {
                for (B2Z BcX : r33.A05.getObservers()) {
                    BcX.BcX(r24);
                }
            }
            AnonymousClass1DP r25 = r33.A03;
            AnonymousClass11F r1 = r52.A1J.A00;
            C18740tg.A06(r1);
            r25.A02(r1, false);
        } else if (i2 == 6) {
            ((AnonymousClass1DP) this.A01).A00();
        } else if (i2 == 7) {
            AnonymousClass16J r26 = (AnonymousClass16J) this.A02;
            Iterator it7 = r26.getObservers().iterator();
            while (it7.hasNext()) {
                A00(r26, it7).Bbr();
            }
        }
    }

    public static AnonymousClass191 A00(AnonymousClass16J r5, Iterator it) {
        AnonymousClass191 r4 = (AnonymousClass191) it.next();
        r5.A00++;
        return r4;
    }
}
