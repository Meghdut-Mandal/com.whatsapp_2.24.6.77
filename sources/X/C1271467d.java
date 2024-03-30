package X;

import android.app.Application;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: X.67d  reason: invalid class name and case insensitive filesystem */
public final class C1271467d {
    public final C35071i6 A00;
    public final C19770wU A01;
    public final C120545rg A02;
    public final AnonymousClass005 A03;
    public final C132396Tl A04;

    public final void A00(Context context, AnonymousClass2bV r15) {
        Integer num;
        AnonymousClass2bV r10 = r15;
        AnonymousClass00C.A0D(r15, 1);
        Context context2 = context;
        C18740tg.A0E(!(context instanceof Application), "XFamilyTextStatusBurningManager/application context was passed in for scheduleTextStatusMediaPathUpdate");
        C120545rg r1 = this.A02;
        String str = r15.A1J.A01;
        AnonymousClass00C.A07(str);
        Map map = r1.A00;
        if (!map.containsKey(str)) {
            if (r1.A01.contains(str)) {
                C35071i6 r0 = this.A00;
                long j = r15.A1N;
                C35071i6.A00(r0);
                C000700i r12 = r0.A00;
                synchronized (r12) {
                    num = (Integer) r12.A05(j);
                }
                if (num == null || 4 != num.intValue()) {
                    return;
                }
            }
            C99424tL r11 = new C99424tL();
            this.A01.Boy(new AnonymousClass73N(this, context2, r10, r11, 23));
            map.put(str, r11);
        }
    }

    public final void A01(AnonymousClass2bV r8) {
        AnonymousClass00C.A0D(r8, 0);
        C120545rg r6 = this.A02;
        String str = r8.A1J.A01;
        AnonymousClass00C.A07(str);
        Map map = r6.A00;
        Future future = (Future) map.get(str);
        if (future != null) {
            String str2 = (String) future.get();
            C132396Tl r2 = this.A04;
            long j = r8.A1N;
            AnonymousClass00C.A0B(str2);
            r2.A03(j, str2);
            map.remove(str);
            r6.A01.add(str);
        }
    }

    public C1271467d(C35071i6 r1, C132396Tl r2, C19770wU r3, C120545rg r4, AnonymousClass005 r5) {
        C36321k7.A1B(r3, r5, r2, r1, r4);
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r2;
        this.A00 = r1;
        this.A02 = r4;
    }
}
