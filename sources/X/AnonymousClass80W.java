package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.80W  reason: invalid class name */
public final class AnonymousClass80W extends AnonymousClass9T4 {
    public final AnonymousClass91Q A00;
    public final Integer A01;
    public final Object A02;
    public final String A03;
    public final C22765Avb A04;

    public AnonymousClass80W(C22765Avb avb, Integer num, Object obj, String str) {
        List list;
        C36331k8.A1H(avb, num);
        this.A02 = obj;
        this.A03 = str;
        this.A04 = avb;
        this.A01 = num;
        AnonymousClass91Q r5 = new AnonymousClass91Q(AnonymousClass000.A0l(obj, " value: ", AnonymousClass000.A0v(str)));
        StackTraceElement[] stackTrace = r5.getStackTrace();
        AnonymousClass00C.A08(stackTrace);
        int length = stackTrace.length;
        int i = length - 2;
        if (i < 0 || i == 0) {
            list = C023409w.A00;
        } else if (i >= length) {
            list = AnonymousClass02R.A0D(stackTrace);
        } else if (i == 1) {
            list = C36371kC.A11(stackTrace[length - 1]);
        } else {
            ArrayList A14 = C36441kJ.A14(i);
            for (int i2 = length - i; i2 < length; i2++) {
                A14.add(stackTrace[i2]);
            }
            list = A14;
        }
        Object[] array = list.toArray(new StackTraceElement[0]);
        AnonymousClass00C.A0E(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        r5.setStackTrace((StackTraceElement[]) array);
        this.A00 = r5;
    }
}
