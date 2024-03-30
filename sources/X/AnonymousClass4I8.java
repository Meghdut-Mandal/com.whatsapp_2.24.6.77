package X;

import java.util.Calendar;

/* renamed from: X.4I8  reason: invalid class name */
public final class AnonymousClass4I8 extends AnonymousClass00R implements AnonymousClass00S {
    public static final AnonymousClass4I8 A00 = new AnonymousClass4I8();

    public AnonymousClass4I8() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Calendar instance = Calendar.getInstance();
        instance.add(6, 1);
        if (instance.get(12) >= 30) {
            instance.add(11, 1);
        }
        instance.set(12, 0);
        instance.set(13, 0);
        return instance;
    }
}
