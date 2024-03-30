package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.List;

/* renamed from: X.833  reason: invalid class name */
public abstract class AnonymousClass833 extends AnonymousClass9RF {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final List A04;

    public AnonymousClass833(AnonymousClass9WU r9, List list, int i, long j, long j2, long j3, long j4, long j5) {
        super(r9, j, j2);
        this.A03 = j3;
        this.A01 = j4;
        this.A04 = list;
        this.A00 = i;
        this.A02 = j5;
    }

    public int A00(long j) {
        if (!(this instanceof AnonymousClass832)) {
            return ((AnonymousClass831) this).A00.size();
        }
        if (this.A04 != null) {
            return this.A00;
        }
        if (j == -9223372036854775807L) {
            return -1;
        }
        long j2 = (this.A01 * SearchActionVerificationClientService.MS_TO_NS) / this.A01;
        return (int) (((j + j2) - 1) / j2);
    }

    public final long A01(long j) {
        long j2;
        List list = this.A04;
        long j3 = j - this.A03;
        if (list != null) {
            j2 = A02((int) j3).A04 - this.A00;
        } else {
            j2 = j3 * this.A01;
        }
        return Util.A07(j2, SearchActionVerificationClientService.MS_TO_NS, this.A01);
    }

    public AnonymousClass9SE A02(int i) {
        int i2;
        int i3 = i;
        int i4 = this.A00;
        List list = this.A04;
        if (i4 == list.size()) {
            if (i3 >= i4) {
                i3 = i4 - 1;
                Log.w("SegmentTemplate", "index was past bounds of the list, so clamping to final element");
            }
            return (AnonymousClass9SE) list.get(i3);
        }
        int A06 = C36421kH.A06(list, 1);
        int i5 = i + ((AnonymousClass9SE) list.get(0)).A00;
        int i6 = 0;
        while (i6 <= A06) {
            int i7 = (i6 + A06) / 2;
            AnonymousClass9SE r7 = (AnonymousClass9SE) list.get(i7);
            int i8 = r7.A00;
            int i9 = r7.A02 + i8;
            if (i9 <= i5) {
                i6 = i7 + 1;
            } else if (i9 > i5 && i7 != 0 && i8 > i5) {
                A06 = i7 - 1;
            } else if (i9 <= i5 || (i7 != 0 && i8 > i5)) {
                throw C165617ti.A0W("Segment Index out of Segment Timeline bounds");
            } else {
                long j = r7.A04;
                long j2 = r7.A03;
                int i10 = r7.A00;
                int i11 = i5 - i10;
                return new AnonymousClass9SE(1, i10, (r7.A01 - (r7.A02 - 1)) + i11, j + (j2 * ((long) i11)), j2, r7.A05);
            }
        }
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, i5, 0);
        int i12 = -1;
        if (list.size() > 0) {
            i2 = ((AnonymousClass9SE) list.get(0)).A00;
        } else {
            i2 = -1;
        }
        AnonymousClass000.A1L(objArr, i2, 1);
        if (list.size() > 0) {
            i12 = ((AnonymousClass9SE) list.get(C36421kH.A06(list, 1))).A00;
        }
        AnonymousClass000.A1L(objArr, i12, 2);
        AnonymousClass000.A1L(objArr, list.size(), 3);
        C165597tg.A1H("Search Fail; Index: %d, Start relative index: %d, End relative index: %d, Segment Timeline Size: %d", "SegmentTemplate", objArr);
        throw C165617ti.A0W("Segment Index out of Segment Timeline bounds");
    }
}
