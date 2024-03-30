package X;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* renamed from: X.A7i  reason: case insensitive filesystem */
public abstract class C21071A7i implements C22901AyD, Cloneable {
    public void A0P(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr.length;
        AnonymousClass8NN r3 = (AnonymousClass8NN) this;
        C201979ko A00 = C201979ko.A00();
        r3.A0S();
        try {
            C198739e7.A02.A00(r3.A00.getClass()).BPo(new C197909ca(A00), r3.A00, bArr2, 0, length);
        } catch (AnonymousClass186 e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw C165587tf.A0J();
        } catch (IOException e2) {
            throw C90524aI.A0e("Reading from byte array should not throw IOException.", e2);
        }
    }

    public static void A0O(Iterable iterable, List list) {
        Charset charset = AnonymousClass9BD.A04;
        Objects.requireNonNull(iterable);
        if (iterable instanceof B6Z) {
            List BIg = ((B6Z) iterable).BIg();
            B6Z b6z = (B6Z) list;
            int size = list.size();
            for (Object next : BIg) {
                if (next == null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Element at index ");
                    A0u.append(C36421kH.A06(b6z, size));
                    String A0q = AnonymousClass000.A0q(" is null.", A0u);
                    int size2 = b6z.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            b6z.remove(size2);
                        } else {
                            throw AnonymousClass001.A0A(A0q);
                        }
                    }
                } else if (next instanceof C21674AUx) {
                    b6z.B0D((C21674AUx) next);
                } else {
                    b6z.add(next);
                }
            }
        } else if (iterable instanceof C16130of) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("Element at index ");
                    A0u2.append(C36421kH.A06(list, size3));
                    String A0q2 = AnonymousClass000.A0q(" is null.", A0u2);
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            list.remove(size4);
                        } else {
                            throw AnonymousClass001.A0A(A0q2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        throw null;
    }
}
