package X;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.72K  reason: invalid class name */
public class AnonymousClass72K implements AutoCloseable {
    public String[] A00;
    public final ArrayDeque A01;

    public void close() {
        this.A01.removeFirst();
    }

    public AnonymousClass72K(Object obj, String str, ArrayDeque arrayDeque) {
        this.A01 = arrayDeque;
        if (obj != null) {
            AnonymousClass665 r3 = new AnonymousClass665(obj, str);
            arrayDeque.addFirst(r3);
            if (Log.isLoggable("CarApp.Bun", 2)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                int min = Math.min(arrayDeque.size(), 11);
                String[] strArr = this.A00;
                if (strArr == null) {
                    strArr = new String[12];
                    this.A00 = strArr;
                }
                String str2 = strArr[min];
                if (str2 == null) {
                    char[] cArr = new char[min];
                    Arrays.fill(cArr, ' ');
                    str2 = new String(cArr);
                    str2 = min == 11 ? AnonymousClass000.A0q("...", AnonymousClass000.A0v(str2)) : str2;
                    this.A00[min] = str2;
                }
                StringBuilder A0q = C90484aE.A0q(str2, A0u);
                A0q.append(AnonymousClass6XY.A03(r3.A00.getClass()));
                C36421kH.A1N(A0q);
                A0q.append(r3.A01);
                C36351kA.A1K(A0q, A0u);
                Log.v("CarApp.Bun", A0u.toString());
            }
        }
    }

    public String A00() {
        StringBuilder A0u = AnonymousClass000.A0u();
        ArrayDeque arrayDeque = this.A01;
        int min = Math.min(arrayDeque.size(), 8);
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            int i = min - 1;
            if (min <= 0) {
                break;
            }
            AnonymousClass665 r2 = (AnonymousClass665) descendingIterator.next();
            StringBuilder A0p = C90484aE.A0p();
            C90474aD.A1L(A0p, r2.A01);
            A0p.append(AnonymousClass6XY.A03(r2.A00.getClass()));
            A0u.append(C90474aD.A0g(A0p));
            min = i;
        }
        if (descendingIterator.hasNext()) {
            A0u.append("[...]");
        }
        return A0u.toString();
    }
}
