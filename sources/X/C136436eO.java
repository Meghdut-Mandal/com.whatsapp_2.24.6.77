package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6eO  reason: invalid class name and case insensitive filesystem */
public final class C136436eO implements C161427mt {
    public C129076Ev A00;
    public C129076Ev A01;
    public final int A02;
    public final Map A03;

    public /* synthetic */ long BBJ(C129076Ev r3, C129076Ev r4, C129076Ev r5) {
        return C90504aG.A0E(0 + this.A02);
    }

    public /* synthetic */ C129076Ev BBb(C129076Ev r9, C129076Ev r10, C129076Ev r11) {
        return BIv(r9, r10, r11, C90504aG.A0E(0 + this.A02));
    }

    public C136436eO(Map map, int i) {
        this.A03 = map;
        this.A02 = i;
    }

    public int BBG() {
        return this.A02;
    }

    public C129076Ev BIr(C129076Ev r11, C129076Ev r12, C129076Ev r13, long j) {
        int i = this.A02;
        int A04 = (int) C15040mb.A04((j / SearchActionVerificationClientService.MS_TO_NS) - ((long) 0), 0, (long) i);
        Map map = this.A03;
        Integer valueOf = Integer.valueOf(A04);
        if (map.containsKey(valueOf)) {
            return (C129076Ev) ((AnonymousClass011) C000200c.A00(valueOf, map)).first;
        }
        if (A04 >= i) {
            return r12;
        }
        if (A04 <= 0) {
            return r11;
        }
        AnonymousClass7dY r2 = C113945gO.A01;
        Iterator A0y = AnonymousClass000.A0y(map);
        C129076Ev r6 = r11;
        int i2 = 0;
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            int A0I = AnonymousClass000.A0I(A11.getKey());
            AnonymousClass011 r0 = (AnonymousClass011) A11.getValue();
            if (A04 > A0I && A0I >= i2) {
                r6 = (C129076Ev) r0.first;
                r2 = (AnonymousClass7dY) r0.second;
                i2 = A0I;
            } else if (A04 < A0I && A0I <= i) {
                r12 = (C129076Ev) r0.first;
                i = A0I;
            }
        }
        float Bvz = r2.Bvz(((float) (A04 - i2)) / ((float) (i - i2)));
        if (this.A00 == null) {
            C129076Ev A032 = r11.A03();
            AnonymousClass00C.A0E(A032, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.A00 = A032;
            C129076Ev A033 = r11.A03();
            AnonymousClass00C.A0E(A033, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.A01 = A033;
        }
        int A022 = r6.A02();
        for (int i3 = 0; i3 < A022; i3++) {
            C129076Ev r3 = this.A00;
            if (r3 == null) {
                throw C36331k8.A0d("valueVector");
            }
            r3.A05(i3, C90514aH.A00(r6.A01(i3), ((float) 1) - Bvz, r12.A01(i3), Bvz));
        }
        C129076Ev r02 = this.A00;
        if (r02 != null) {
            return r02;
        }
        throw C36331k8.A0d("valueVector");
    }

    public C129076Ev BIv(C129076Ev r18, C129076Ev r19, C129076Ev r20, long j) {
        long A04 = C15040mb.A04((j / SearchActionVerificationClientService.MS_TO_NS) - ((long) 0), 0, (long) this.A02);
        C129076Ev r10 = r20;
        if (A04 <= 0) {
            return r20;
        }
        C129076Ev r8 = r18;
        C129076Ev r9 = r19;
        C129076Ev BIr = BIr(r8, r9, r10, (A04 - 1) * SearchActionVerificationClientService.MS_TO_NS);
        C129076Ev BIr2 = BIr(r8, r9, r10, A04 * SearchActionVerificationClientService.MS_TO_NS);
        if (this.A00 == null) {
            C129076Ev A032 = r8.A03();
            AnonymousClass00C.A0E(A032, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.A00 = A032;
            C129076Ev A033 = r8.A03();
            AnonymousClass00C.A0E(A033, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.A01 = A033;
        }
        int A022 = BIr.A02();
        for (int i = 0; i < A022; i++) {
            C129076Ev r2 = this.A01;
            if (r2 == null) {
                throw C36331k8.A0d("velocityVector");
            }
            r2.A05(i, (BIr.A01(i) - BIr2.A01(i)) * 1000.0f);
        }
        C129076Ev r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("velocityVector");
    }

    public /* synthetic */ boolean BM1() {
        return false;
    }
}
