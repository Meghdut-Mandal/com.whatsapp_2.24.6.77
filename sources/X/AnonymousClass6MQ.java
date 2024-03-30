package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.6MQ  reason: invalid class name */
public final class AnonymousClass6MQ {
    public static final long A01 = TimeUnit.SECONDS.toMillis(30);
    public final C19770wU A00;

    public AnonymousClass6MQ(C19770wU r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final void A00(C128936Ee r5, AnonymousClass7i7 r6, AnonymousClass2V1 r7, Runnable runnable) {
        AnonymousClass00C.A0D(r7, 0);
        Object A002 = r7.A00((Object) null);
        C18740tg.A06(A002);
        Number number = (Number) A002;
        if (number != null) {
            int intValue = number.intValue();
            if (intValue != 3489016) {
                if (intValue == 3489014) {
                    Long A012 = r5.A01();
                    if (A012 != null) {
                        this.A00.BpM(runnable, "XFamilyGraphqlErrorHandler/retryWithBackoff", A012.longValue());
                        return;
                    }
                }
            }
            r6.onError(intValue);
            return;
        }
        r6.onError(C36411kG.A07(number));
    }
}
