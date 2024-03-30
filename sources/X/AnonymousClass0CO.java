package X;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0CO  reason: invalid class name */
public final class AnonymousClass0CO implements Runnable {
    public static Comparator A04 = new C18410t7(0);
    public static final ThreadLocal A05 = new ThreadLocal();
    public long A00;
    public long A01;
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();

    public static AnonymousClass0D3 A00(RecyclerView recyclerView, int i, long j) {
        AnonymousClass0CI r4 = recyclerView.A0E;
        int A042 = r4.A04();
        for (int i2 = 0; i2 < A042; i2++) {
            AnonymousClass0D3 A043 = RecyclerView.A04(r4.A07(i2));
            if (A043.A04 == i && (A043.A00 & 4) == 0) {
                return null;
            }
        }
        C02760Bu r3 = recyclerView.A0x;
        try {
            recyclerView.A07++;
            AnonymousClass0D3 A032 = r3.A03(i, j);
            if (A032 != null) {
                if (!A032.A0A() || (A032.A00 & 4) != 0) {
                    r3.A0B(A032, false);
                } else {
                    r3.A07(A032.A0H);
                }
            }
            return A032;
        } finally {
            recyclerView.A0y(false);
        }
    }

    public void run() {
        long j;
        WeakReference weakReference;
        RecyclerView recyclerView;
        AnonymousClass0TL r1;
        try {
            Method method = C000600g.A03;
            AnonymousClass00h.A01("RV Prefetch");
            ArrayList arrayList = this.A02;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i);
                    if (recyclerView2.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView2.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.A00;
                    int size2 = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i3);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            AnonymousClass0C3 r0 = recyclerView3.A0F;
                            r0.A00(recyclerView3, false);
                            i2 += r0.A00;
                        }
                    }
                    ArrayList arrayList2 = this.A03;
                    arrayList2.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i5);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            AnonymousClass0C3 r10 = recyclerView4.A0F;
                            int abs = Math.abs(r10.A01) + Math.abs(r10.A02);
                            for (int i6 = 0; i6 < r10.A00 * 2; i6 += 2) {
                                if (i4 >= arrayList2.size()) {
                                    r1 = new AnonymousClass0TL();
                                    arrayList2.add(r1);
                                } else {
                                    r1 = (AnonymousClass0TL) arrayList2.get(i4);
                                }
                                int[] iArr = r10.A03;
                                int i7 = iArr[i6 + 1];
                                boolean z = false;
                                if (i7 <= abs) {
                                    z = true;
                                }
                                r1.A04 = z;
                                r1.A02 = abs;
                                r1.A00 = i7;
                                r1.A03 = recyclerView4;
                                r1.A01 = iArr[i6];
                                i4++;
                            }
                        }
                    }
                    Collections.sort(arrayList2, A04);
                    for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                        AnonymousClass0TL r8 = (AnonymousClass0TL) arrayList2.get(i8);
                        if (r8.A03 == null) {
                            break;
                        }
                        if (r8.A04) {
                            j = Long.MAX_VALUE;
                        } else {
                            j = nanos;
                        }
                        AnonymousClass0D3 A002 = A00(r8.A03, r8.A01, j);
                        if (!(A002 == null || (weakReference = A002.A0C) == null || !A002.A0A() || (A002.A00 & 4) != 0 || (recyclerView = (RecyclerView) weakReference.get()) == null)) {
                            if (recyclerView.A0S && recyclerView.A0E.A04() != 0) {
                                recyclerView.A0c();
                            }
                            AnonymousClass0C3 r102 = recyclerView.A0F;
                            r102.A00(recyclerView, true);
                            if (r102.A00 != 0) {
                                AnonymousClass00h.A01("RV Nested Prefetch");
                                AnonymousClass0C4 r12 = recyclerView.A0y;
                                AnonymousClass0CZ r13 = recyclerView.A0G;
                                r12.A04 = 1;
                                r12.A03 = r13.A0J();
                                r12.A08 = false;
                                r12.A0D = false;
                                r12.A09 = false;
                                for (int i9 = 0; i9 < r102.A00 * 2; i9 += 2) {
                                    A00(recyclerView, r102.A03[i9], nanos);
                                }
                                AnonymousClass00h.A00();
                            }
                        }
                        r8.A04 = false;
                        r8.A02 = 0;
                        r8.A00 = 0;
                        r8.A03 = null;
                        r8.A01 = 0;
                    }
                }
            }
            this.A01 = 0;
            AnonymousClass00h.A00();
        } catch (Throwable th) {
            this.A01 = 0;
            Method method2 = C000600g.A03;
            AnonymousClass00h.A00();
            throw th;
        }
    }
}
