package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

public abstract class A12 implements C22868AxN {
    public final C22781Avs A00;
    public final SparseArray A01;
    public final AnonymousClass9QM A02;
    public final AnonymousClass9QM A03;
    public final C197879cW A04;
    public final Class A05 = getClass();
    public final Set A06;
    public final B41 A07;

    public static void A00(A12 a12) {
        C161037m1 r7 = C132886Vq.A00;
        if (r7.BMH(2)) {
            Class cls = a12.A05;
            AnonymousClass9QM r1 = a12.A03;
            Integer valueOf = Integer.valueOf(r1.A00);
            Integer valueOf2 = Integer.valueOf(r1.A01);
            AnonymousClass9QM r12 = a12.A02;
            Integer valueOf3 = Integer.valueOf(r12.A00);
            Integer valueOf4 = Integer.valueOf(r12.A01);
            String simpleName = cls.getSimpleName();
            Object[] objArr = new Object[4];
            C36321k7.A1H(valueOf, valueOf2, valueOf3, objArr);
            objArr[3] = valueOf4;
            r7.BxE(simpleName, String.format((Locale) null, "Used = (%d, %d); Free = (%d, %d)", objArr));
        }
    }

    public synchronized Object A02(AnonymousClass9LL r3) {
        Object poll;
        poll = r3.A03.poll();
        if (poll != null) {
            r3.A00++;
        }
        return poll;
    }

    public synchronized void A03(int i) {
        AnonymousClass9QM r6 = this.A03;
        int i2 = r6.A01;
        AnonymousClass9QM r5 = this.A02;
        int i3 = r5.A01;
        int i4 = i2 + i3;
        int min = Math.min(i4 - i, i3);
        if (min > 0) {
            if (C132886Vq.A00.BMH(2)) {
                C132886Vq.A00(this.A05, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(min), "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d");
            }
            A00(this);
            int i5 = 0;
            while (true) {
                SparseArray sparseArray = this.A01;
                if (i5 >= sparseArray.size() || min <= 0) {
                    A00(this);
                } else {
                    AnonymousClass9LL r1 = (AnonymousClass9LL) sparseArray.valueAt(i5);
                    Objects.requireNonNull(r1);
                    while (true) {
                        Object poll = r1.A03.poll();
                        if (poll == null) {
                            break;
                        }
                        A04(poll);
                        min -= r1.A01;
                        r5.A00(r1.A01);
                        if (min <= 0) {
                            break;
                        }
                    }
                    i5++;
                }
            }
            A00(this);
            if (C132886Vq.A00.BMH(2)) {
                C132886Vq.A01(this.A05, Integer.valueOf(i), Integer.valueOf(r6.A01 + r5.A01), "trimToSize: TargetSize = %d; Final Size = %d");
            }
        }
    }

    public synchronized boolean A05() {
        return C90474aD.A1T(this.A03.A01 + this.A02.A01, this.A04.A02);
    }

    public void BnN(Object obj) {
        int allocationByteCount;
        boolean z;
        Objects.requireNonNull(obj);
        boolean z2 = this instanceof AnonymousClass87p;
        if (z2) {
            B2K b2k = (B2K) obj;
            Objects.requireNonNull(b2k);
            allocationByteCount = b2k.BHb();
        } else {
            Bitmap bitmap = (Bitmap) obj;
            Objects.requireNonNull(bitmap);
            allocationByteCount = bitmap.getAllocationByteCount();
        }
        synchronized (this) {
            AnonymousClass9LL r3 = (AnonymousClass9LL) this.A01.get(allocationByteCount);
            if (!this.A06.remove(obj)) {
                Class cls = this.A05;
                Object[] objArr = new Object[2];
                AnonymousClass000.A1L(objArr, System.identityHashCode(obj), 0);
                AnonymousClass000.A1L(objArr, allocationByteCount, 1);
                C161037m1 r2 = C132886Vq.A00;
                if (r2.BMH(6)) {
                    r2.B6I(cls.getSimpleName(), String.format((Locale) null, "release (free, value unrecognized) (object, size) = (%x, %s)", objArr));
                }
                A04(obj);
            } else {
                if (r3 != null) {
                    int i = r3.A00;
                    Queue queue = r3.A03;
                    if (i + queue.size() <= r3.A02 && !A05()) {
                        if (z2) {
                            B2K b2k2 = (B2K) obj;
                            Objects.requireNonNull(b2k2);
                            z = !b2k2.isClosed();
                        } else {
                            Bitmap bitmap2 = (Bitmap) obj;
                            Objects.requireNonNull(bitmap2);
                            if (!bitmap2.isRecycled()) {
                                z = bitmap2.isMutable();
                            }
                        }
                        if (z) {
                            Objects.requireNonNull(obj);
                            int i2 = r3.A00;
                            if (i2 > 0) {
                                r3.A00 = i2 - 1;
                                queue.add(obj);
                            } else {
                                Object[] objArr2 = {obj};
                                C161037m1 r1 = C132886Vq.A00;
                                if (r1.BMH(6)) {
                                    r1.B6I("BUCKET", String.format((Locale) null, "Tried to release value %s from an empty bucket!", objArr2));
                                }
                            }
                            AnonymousClass9QM r12 = this.A02;
                            r12.A00++;
                            r12.A01 += allocationByteCount;
                            this.A03.A00(allocationByteCount);
                            if (C132886Vq.A00.BMH(2)) {
                                C165587tf.A1G(this.A05, obj, "release (reuse) (object, size) = (%x, %s)", allocationByteCount);
                            }
                        }
                    }
                    int i3 = r3.A00;
                    AnonymousClass6GV.A01(AnonymousClass000.A1R(i3));
                    r3.A00 = i3 - 1;
                }
                if (C132886Vq.A00.BMH(2)) {
                    C165587tf.A1G(this.A05, obj, "release (free) (object, size) = (%x, %s)", allocationByteCount);
                }
                A04(obj);
                this.A03.A00(allocationByteCount);
            }
            A00(this);
        }
    }

    public Object A01(int i) {
        if (this instanceof AnonymousClass87q) {
            return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
        }
        return new C21657ATy(i);
    }

    public void A04(Object obj) {
        if (this instanceof AnonymousClass87p) {
            B2K b2k = (B2K) obj;
            Objects.requireNonNull(b2k);
            b2k.close();
            return;
        }
        Bitmap bitmap = (Bitmap) obj;
        Objects.requireNonNull(bitmap);
        bitmap.recycle();
    }

    public A12(C22781Avs avs, C197879cW r12, B41 b41) {
        Objects.requireNonNull(avs);
        this.A00 = avs;
        Objects.requireNonNull(r12);
        this.A04 = r12;
        Objects.requireNonNull(b41);
        this.A07 = b41;
        this.A01 = new SparseArray();
        SparseIntArray sparseIntArray = new SparseIntArray(0);
        synchronized (this) {
            Objects.requireNonNull(sparseIntArray);
            SparseArray sparseArray = this.A01;
            sparseArray.clear();
            SparseIntArray sparseIntArray2 = this.A04.A03;
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                sparseArray.put(keyAt, new AnonymousClass9LL(keyAt, sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0)));
            }
        }
        this.A06 = Collections.newSetFromMap(new IdentityHashMap());
        this.A02 = new AnonymousClass9QM();
        this.A03 = new AnonymousClass9QM();
    }
}
