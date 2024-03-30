package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Y1  reason: invalid class name */
public class AnonymousClass0Y1 {
    public static int A03;
    public C02540Au A00;
    public C02540Au A01 = null;
    public ArrayList A02 = AnonymousClass001.A0I();

    public static long A00(C02560Aw r9, AnonymousClass0Y1 r10, long j) {
        C02540Au r4 = r9.A02;
        if (r4 instanceof AnonymousClass0GN) {
            return j;
        }
        List list = r9.A07;
        int size = list.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C02530At r8 = (C02530At) list.get(i);
            if (r8 instanceof C02560Aw) {
                C02560Aw r82 = (C02560Aw) r8;
                if (r82.A02 != r4) {
                    j2 = Math.min(j2, A00(r82, r10, ((long) r82.A04) + j));
                }
            }
        }
        if (r9 != r4.A04) {
            return j2;
        }
        long A08 = r4.A08();
        C02560Aw r42 = r4.A05;
        long j3 = j - A08;
        return Math.min(Math.min(j2, A00(r42, r10, j3)), j3 - ((long) r42.A04));
    }

    public static long A01(C02560Aw r9, AnonymousClass0Y1 r10, long j) {
        C02540Au r4 = r9.A02;
        if (r4 instanceof AnonymousClass0GN) {
            return j;
        }
        List list = r9.A07;
        int size = list.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C02530At r8 = (C02530At) list.get(i);
            if (r8 instanceof C02560Aw) {
                C02560Aw r82 = (C02560Aw) r8;
                if (r82.A02 != r4) {
                    j2 = Math.max(j2, A01(r82, r10, ((long) r82.A04) + j));
                }
            }
        }
        if (r9 != r4.A05) {
            return j2;
        }
        long A08 = r4.A08();
        C02560Aw r42 = r4.A04;
        long j3 = j + A08;
        return Math.max(Math.max(j2, A01(r42, r10, j3)), j3 - ((long) r42.A04));
    }

    public AnonymousClass0Y1(C02540Au r2) {
        A03++;
        this.A00 = r2;
        this.A01 = r2;
    }
}
