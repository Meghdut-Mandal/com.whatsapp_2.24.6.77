package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* renamed from: X.A3v  reason: case insensitive filesystem */
public abstract class C21032A3v implements C23119B5y {
    public int zza = 0;

    public static void A09(Iterable iterable, List list) {
        Charset charset = C197089b7.A00;
        Objects.requireNonNull(iterable);
        if (iterable instanceof B6X) {
            List Byi = ((B6X) iterable).Byi();
            B6X b6x = (B6X) list;
            int size = list.size();
            for (Object next : Byi) {
                if (next == null) {
                    int A06 = C36421kH.A06(b6x, size);
                    StringBuilder A0h = C90524aI.A0h(37);
                    C36351kA.A1M("Element at index ", " is null.", A0h, A06);
                    String obj = A0h.toString();
                    int size2 = b6x.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            b6x.remove(size2);
                        } else {
                            throw AnonymousClass001.A0A(obj);
                        }
                    }
                } else if (next instanceof C21673AUw) {
                    b6x.ByG((C21673AUw) next);
                } else {
                    b6x.add(next);
                }
            }
        } else if (iterable instanceof C16030oR) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int A062 = C36421kH.A06(list, size3);
                    StringBuilder A0h2 = C90524aI.A0h(37);
                    C36351kA.A1M("Element at index ", " is null.", A0h2, A062);
                    String obj2 = A0h2.toString();
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            list.remove(size4);
                        } else {
                            throw AnonymousClass001.A0A(obj2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        }
    }
}
