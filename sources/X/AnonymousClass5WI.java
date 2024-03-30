package X;

import java.util.Arrays;

/* renamed from: X.5WI  reason: invalid class name */
public abstract class AnonymousClass5WI {
    public static final Object A00(C161337ma r9, AnonymousClass7bL r10, AnonymousClass00S r11, Object[] objArr) {
        Object obj;
        Object obj2;
        Object B3V;
        r9.Bum(441892779);
        C136916fF r1 = (C136916fF) r9;
        int i = r1.A02;
        C06780Vb.A00(36);
        String num = Integer.toString(i, 36);
        AnonymousClass00C.A08(num);
        AnonymousClass7bL r5 = r10;
        AnonymousClass00C.A0E(r10, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        C160267kj r4 = (C160267kj) AnonymousClass6G0.A01(r1, C112315dh.A00);
        Object A0X = C90494aF.A0X(r9);
        Object[] objArr2 = objArr;
        if (A0X == C129736Ig.A00) {
            if (r4 == null || (B3V = r4.B3V(num)) == null || (obj2 = C137206fl.A00(r10, B3V)) == null) {
                obj2 = r11.invoke();
            }
            A0X = new C137036fU(r4, r5, obj2, num, objArr2);
            r9.Bwv(A0X);
        }
        C136916fF.A0M(r1, false);
        C137036fU r3 = (C137036fU) A0X;
        if (!Arrays.equals(objArr, r3.A05) || (obj = r3.A03) == null) {
            obj = r11.invoke();
        }
        r9.Bn4(new C153497Oo(r3, r4, r5, obj, num, objArr2));
        C136916fF.A0M(r1, false);
        return obj;
    }
}
