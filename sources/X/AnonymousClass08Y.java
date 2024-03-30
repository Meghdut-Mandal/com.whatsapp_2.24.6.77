package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* renamed from: X.08Y  reason: invalid class name */
public final class AnonymousClass08Y {
    public final List A00 = new ArrayList();

    public final AnonymousClass09B A00() {
        Object[] array = this.A00.toArray(new AnonymousClass09A[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        AnonymousClass09A[] r1 = (AnonymousClass09A[]) array;
        return new AnonymousClass09B((AnonymousClass09A[]) Arrays.copyOf(r1, r1.length));
    }

    public final void A01(C006302t r4, C019108d r5) {
        List list = this.A00;
        Class BDB = ((C019208e) r5).BDB();
        AnonymousClass00C.A0E(BDB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        list.add(new AnonymousClass09A(BDB, r4));
    }
}
