package X;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.0tW  reason: invalid class name and case insensitive filesystem */
public class C18660tW implements C16970qV {
    public Object A00;
    public final int A01;

    public C18660tW(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public Iterator iterator() {
        switch (this.A01) {
            case 0:
                return new C18570tN((ViewGroup) this.A00);
            case 1:
                Object[] objArr = (Object[]) this.A00;
                AnonymousClass00C.A0D(objArr, 0);
                return new C12310hq(objArr);
            case 2:
                return (Iterator) this.A00;
            default:
                ArrayList A0I = AnonymousClass001.A0I();
                for (Object add : (C16970qV) this.A00) {
                    A0I.add(add);
                }
                AnonymousClass00C.A0D(A0I, 0);
                if (A0I.size() > 1) {
                    Collections.sort(A0I);
                }
                return A0I.iterator();
        }
    }
}
