package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Objects;

/* renamed from: X.839  reason: invalid class name */
public final class AnonymousClass839 extends C198339dI {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final SparseArray A07;
    public final SparseBooleanArray A08;

    public final void A00(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.A08;
        if (sparseBooleanArray.get(i) == z) {
            return;
        }
        if (z) {
            sparseBooleanArray.put(i, true);
        } else {
            sparseBooleanArray.delete(i);
        }
    }

    public AnonymousClass839(AnonymousClass83A r7) {
        super(r7);
        this.A06 = r7.A08;
        this.A02 = r7.A04;
        this.A03 = r7.A05;
        this.A05 = r7.A07;
        this.A00 = r7.A00;
        this.A01 = r7.A03;
        this.A04 = r7.A06;
        SparseArray sparseArray = r7.A01;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.A07 = sparseArray2;
        this.A08 = r7.A02.clone();
    }

    public /* bridge */ /* synthetic */ void A01(String[] strArr) {
        String A002;
        AnonymousClass8Hc builder = C23931Ak.builder();
        Objects.requireNonNull(strArr);
        String A0a = C165617ti.A0a(strArr);
        Objects.requireNonNull(A0a);
        if (A0a == null) {
            A002 = null;
        } else {
            try {
                A002 = new Locale(A0a).getISO3Language();
            } catch (MissingResourceException unused) {
                A002 = C1897495k.A00(A0a);
            }
        }
        builder.add((Object) A002);
        this.A0K = builder.build();
    }

    public AnonymousClass839() {
        this.A07 = new SparseArray();
        this.A08 = new SparseBooleanArray();
        this.A06 = true;
        this.A02 = false;
        this.A03 = true;
        this.A05 = true;
        this.A01 = true;
    }
}
