package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1DS  reason: invalid class name */
public class AnonymousClass1DS extends Handler {
    public final /* synthetic */ AnonymousClass1DP A00;
    public final /* synthetic */ C220412q A01;
    public final /* synthetic */ AnonymousClass1DQ A02;
    public final /* synthetic */ AnonymousClass16J A03;
    public final /* synthetic */ AnonymousClass16E A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1DS(Looper looper, AnonymousClass1DP r2, C220412q r3, AnonymousClass1DQ r4, AnonymousClass16J r5, AnonymousClass16E r6) {
        super(looper);
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r3;
    }

    public void handleMessage(Message message) {
        AnonymousClass1DP r2;
        AnonymousClass11F r1;
        int i = message.what;
        if (i == 1) {
            r2 = this.A00;
            r1 = AnonymousClass11F.A00.A02((String) message.obj);
            C18740tg.A06(r1);
        } else if (i == 2) {
            r1 = AnonymousClass11F.A00.A02((String) message.obj);
            C18740tg.A06(r1);
            this.A03.A01(r1);
            r2 = this.A00;
        } else if (i == 8) {
            AnonymousClass16E r0 = this.A04;
            AnonymousClass16E.A03(r0);
            ConcurrentHashMap concurrentHashMap = r0.A0B;
            C18740tg.A06(concurrentHashMap);
            concurrentHashMap.clear();
            AnonymousClass16J r3 = this.A03;
            r3.A01(C177528dw.A00);
            for (AnonymousClass11F r12 : this.A01.A0G()) {
                r3.A01(r12);
                this.A00.A02(r12, true);
            }
            return;
        } else if (i == 9) {
            AnonymousClass16E r02 = this.A04;
            AnonymousClass16E.A03(r02);
            ConcurrentHashMap concurrentHashMap2 = r02.A0B;
            C18740tg.A06(concurrentHashMap2);
            concurrentHashMap2.clear();
            AnonymousClass16J r8 = this.A03;
            r8.A01(C177528dw.A00);
            C220412q r7 = this.A01;
            for (AnonymousClass11F r5 : r7.A0G()) {
                if (!(r5 instanceof AnonymousClass147)) {
                    r7.A0J(r5);
                    AnonymousClass1DP r32 = this.A00;
                    r32.A00.A00(new C35681j5(r32, r5, 43));
                } else {
                    this.A00.A02(r5, true);
                }
                r8.A01(r5);
            }
            return;
        } else {
            return;
        }
        r2.A02(r1, false);
    }
}
