package X;

import android.database.ContentObserver;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: X.6uM  reason: invalid class name and case insensitive filesystem */
public final class C145686uM implements C88924Uo {
    public int A00;
    public int A01;
    public long[] A02;
    public final PriorityQueue A03;
    public final int[] A04;
    public final C88924Uo[] A05;

    public C145686uM(C88924Uo[] r6, int i) {
        Comparator r2;
        AnonymousClass00C.A0D(r6, 1);
        C88924Uo[] r4 = (C88924Uo[]) r6.clone();
        this.A05 = r4;
        if (i == 1) {
            r2 = new AnonymousClass75T();
        } else {
            r2 = new AnonymousClass75U();
        }
        PriorityQueue priorityQueue = new PriorityQueue(4, r2);
        this.A03 = priorityQueue;
        this.A02 = new long[16];
        this.A01 = 0;
        int length = r4.length;
        this.A04 = new int[length];
        this.A00 = -1;
        priorityQueue.clear();
        for (int i2 = 0; i2 < length; i2++) {
            AnonymousClass641 r1 = new AnonymousClass641(this.A05[i2], i2);
            if (r1.A00()) {
                this.A03.add(r1);
            }
        }
    }

    public HashMap B90() {
        C88924Uo[] r2 = this.A05;
        HashMap A0J = AnonymousClass001.A0J();
        if (r2.length > 0) {
            A0J.putAll(r2[0].B90());
        }
        return A0J;
    }

    public AnonymousClass4V2 BDy(int i) {
        if (i < 0 || i > getCount()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("index ");
            A0u.append(i);
            A0u.append(" out of range max is ");
            throw new IndexOutOfBoundsException(C36381kD.A10(A0u, getCount()));
        }
        int[] iArr = this.A04;
        int i2 = 0;
        Arrays.fill(iArr, 0);
        int i3 = this.A01;
        int i4 = 0;
        while (i2 < i3) {
            long j = this.A02[i2];
            int i5 = (int) (4294967295L & j);
            int A08 = C90494aF.A08(j);
            int i6 = i4 + i5;
            if (i6 > i) {
                return this.A05[A08].BDy(iArr[A08] + (i - i4));
            }
            iArr[A08] = iArr[A08] + i5;
            i2++;
            i4 = i6;
        }
        while (true) {
            PriorityQueue priorityQueue = this.A03;
            AnonymousClass641 r5 = (AnonymousClass641) priorityQueue.poll();
            if (r5 == null) {
                return null;
            }
            int i7 = r5.A03;
            if (i7 == this.A00) {
                int i8 = this.A01 - 1;
                long[] jArr = this.A02;
                jArr[i8] = jArr[i8] + 1;
            } else {
                this.A00 = i7;
                long[] jArr2 = this.A02;
                int length = jArr2.length;
                int i9 = this.A01;
                if (length == i9) {
                    long[] jArr3 = new long[(i9 * 2)];
                    System.arraycopy(jArr2, 0, jArr3, 0, i9);
                    this.A02 = jArr3;
                    jArr2 = jArr3;
                }
                int i10 = this.A01;
                this.A01 = i10 + 1;
                jArr2[i10] = 1 | (((long) this.A00) << 32);
            }
            if (i4 == i) {
                AnonymousClass4V2 r1 = r5.A01;
                if (!r5.A00()) {
                    return r1;
                }
                priorityQueue.add(r5);
                return r1;
            }
            if (r5.A00()) {
                priorityQueue.add(r5);
            }
            i4++;
        }
    }

    public void BoI() {
        for (C88924Uo BoI : this.A05) {
            BoI.BoI();
        }
    }

    public void close() {
        for (C88924Uo close : this.A05) {
            close.close();
        }
    }

    public int getCount() {
        int i = 0;
        for (C88924Uo count : this.A05) {
            i += count.getCount();
        }
        return i;
    }

    public boolean isEmpty() {
        C88924Uo[] r4 = this.A05;
        int length = r4.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!r4[i].isEmpty()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        return !z;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        for (C88924Uo registerContentObserver : this.A05) {
            registerContentObserver.registerContentObserver(contentObserver);
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        for (C88924Uo unregisterContentObserver : this.A05) {
            unregisterContentObserver.unregisterContentObserver(contentObserver);
        }
    }

    public AnonymousClass4V2 BmQ(int i) {
        return BDy(i);
    }
}
