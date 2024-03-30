package X;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: X.67T  reason: invalid class name */
public final class AnonymousClass67T {
    public final C19770wU A00;
    public final C118085nJ A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass6VF A03;

    public final void A00(Context context, AnonymousClass2bV r11) {
        AnonymousClass2bV r6 = r11;
        AnonymousClass00C.A0D(r11, 1);
        Context context2 = context;
        C18740tg.A0E(!(context instanceof Application), "CrosspostTextStatusBurningManager/application context was passed in for scheduleTextStatusMediaPathUpdate");
        C118085nJ r1 = this.A01;
        String str = r11.A1J.A01;
        AnonymousClass00C.A07(str);
        Map map = r1.A00;
        if (!map.containsKey(str)) {
            C99424tL r7 = new C99424tL();
            this.A00.Boy(new AnonymousClass73N(this, context2, r6, r7, 19));
            map.put(str, r7);
        }
    }

    public final void A01(AnonymousClass2bV r9) {
        C118085nJ r1 = this.A01;
        String str = r9.A1J.A01;
        AnonymousClass00C.A07(str);
        Map map = r1.A00;
        Future future = (Future) map.get(str);
        if (future != null) {
            String str2 = (String) future.get();
            AnonymousClass6VF r4 = this.A03;
            long j = r9.A1N;
            AnonymousClass00C.A0B(str2);
            AnonymousClass00C.A0D(str2, 1);
            ContentValues A0E = C36441kJ.A0E();
            A0E.put("media_file_path", str2);
            AnonymousClass6VF.A02(A0E, r4, C36371kC.A11(Long.valueOf(j)));
            map.remove(str);
        }
    }

    public AnonymousClass67T(AnonymousClass6VF r1, C19770wU r2, C118085nJ r3, AnonymousClass005 r4) {
        C36321k7.A18(r2, r1, r3, r4);
        this.A00 = r2;
        this.A03 = r1;
        this.A01 = r3;
        this.A02 = r4;
    }
}
