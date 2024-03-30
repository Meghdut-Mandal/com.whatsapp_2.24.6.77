package X;

import android.util.Base64;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1W9  reason: invalid class name */
public final class AnonymousClass1W9 implements AnonymousClass19N {
    public SparseArray A00 = new SparseArray();
    public HashSet A01 = new HashSet();
    public final C20810yC A02;
    public final C19890wg A03;
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final AnonymousClass00T A05 = new AnonymousClass00U(new AnonymousClass7MT(this));
    public final AnonymousClass040 A06;
    public final AnonymousClass00T A07 = new AnonymousClass00U(new AnonymousClass7MU(this));

    public AnonymousClass1W9(C20810yC r3, C19890wg r4, AnonymousClass040 r5) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r5, 3);
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r5;
    }

    public /* synthetic */ void BVp() {
    }

    public /* synthetic */ void BWI(C201579ju r1) {
    }

    public /* synthetic */ void Bh4(C201579ju r1) {
    }

    public /* synthetic */ void Bh6(C201579ju r1) {
    }

    public final void A00() {
        SparseArray sparseArray = this.A00;
        synchronized (sparseArray) {
            sparseArray.clear();
        }
        if (A03()) {
            C130436Lb r2 = (C130436Lb) this.A05.getValue();
            synchronized (r2) {
                LinkedHashSet linkedHashSet = r2.A00;
                if (!linkedHashSet.isEmpty()) {
                    linkedHashSet.size();
                    linkedHashSet.clear();
                    r2.A02 = false;
                    r2.A03 = false;
                    r2.A05.edit().remove("key").apply();
                }
            }
        }
    }

    public final boolean A03() {
        return ((Boolean) this.A07.getValue()).booleanValue();
    }

    public void Bh5(C201579ju r3) {
        Integer num = r3.A08;
        if (num != null) {
            HashSet hashSet = this.A01;
            synchronized (hashSet) {
                hashSet.remove(num);
            }
        }
    }

    public final void A01() {
        byte[] decode;
        Iterable iterable;
        if (A03()) {
            C130436Lb r4 = (C130436Lb) this.A05.getValue();
            if (!r4.A01.getAndSet(true)) {
                Log.i("PersistedIntStore/load");
                String string = r4.A05.getString("key", (String) null);
                if (string != null && (decode = Base64.decode(string, 0)) != null) {
                    int length = decode.length / 4;
                    int[] iArr = new int[length];
                    ByteBuffer.wrap(decode).asIntBuffer().get(iArr);
                    synchronized (r4) {
                        LinkedHashSet linkedHashSet = r4.A00;
                        linkedHashSet.clear();
                        if (length == 0) {
                            iterable = C023409w.A00;
                        } else {
                            iterable = new C18610tR(iArr, 0);
                        }
                        AnonymousClass03Y.A0B(iterable, linkedHashSet);
                        r4.A02 = false;
                        StringBuilder sb = new StringBuilder();
                        sb.append("PersistedIntStore/load loaded ");
                        sb.append(linkedHashSet.size());
                        sb.append(" values");
                        Log.i(sb.toString());
                    }
                }
            }
        }
    }

    public final void A02(int i) {
        if (!A03()) {
            SparseArray sparseArray = this.A00;
            synchronized (sparseArray) {
                sparseArray.put(i, Integer.valueOf(((Integer) sparseArray.get(i, 0)).intValue() + 1));
            }
        }
    }
}
