package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.65G  reason: invalid class name */
public final class AnonymousClass65G {
    public final long A00;
    public final C161457mw A01;
    public final C161697nK A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ LazyListState A08;
    public final /* synthetic */ C161697nK A09;
    public final /* synthetic */ C157627dq A0A;
    public final /* synthetic */ AnonymousClass7bO A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public AnonymousClass65G(C161457mw r4, LazyListState lazyListState, C161697nK r6, C157627dq r7, AnonymousClass7bO r8, int i, int i2, int i3, int i4, long j, long j2, boolean z, boolean z2) {
        int i5;
        int A002;
        this.A0C = z;
        this.A09 = r6;
        this.A05 = i;
        this.A06 = i2;
        this.A0A = r7;
        this.A0B = r8;
        this.A0D = z2;
        this.A04 = i3;
        this.A03 = i4;
        this.A07 = j2;
        this.A08 = lazyListState;
        this.A01 = r4;
        this.A02 = r6;
        if (z) {
            i5 = Constraints.A01(j);
            A002 = Integer.MAX_VALUE;
        } else {
            i5 = Integer.MAX_VALUE;
            A002 = Constraints.A00(j);
        }
        this.A00 = C132746Vb.A00(0, i5, 0, A002);
    }

    public final C136766ex A00(int i) {
        int i2;
        C161457mw r0 = this.A01;
        int i3 = i;
        Object BDL = r0.BDL(i3);
        Object BA9 = r0.BA9(i3);
        C161697nK r6 = this.A02;
        long j = this.A00;
        C137756gf r62 = (C137756gf) r6;
        HashMap hashMap = r62.A03;
        Integer valueOf = Integer.valueOf(i3);
        List A0n = C90524aI.A0n(valueOf, hashMap);
        ArrayList arrayList = A0n;
        if (A0n == null) {
            C159827jz r2 = r62.A01;
            Object BDL2 = r2.BDL(i3);
            List BvD = r62.A02.BvD(BDL2, r62.A00.A01(BDL2, r2.BA9(i3), i3));
            int size = BvD.size();
            ArrayList A14 = C36441kJ.A14(size);
            for (int i4 = 0; i4 < size; i4++) {
                A14.add(((C161687nJ) BvD.get(i4)).BPj(j));
            }
            hashMap.put(valueOf, A14);
            arrayList = A14;
        }
        if (i3 == this.A05 - 1) {
            i2 = 0;
        } else {
            i2 = this.A06;
        }
        boolean z = this.A0C;
        C157627dq r63 = this.A0A;
        AnonymousClass7bO r7 = this.A0B;
        AnonymousClass5RW layoutDirection = this.A09.getLayoutDirection();
        boolean z2 = this.A0D;
        return new C136766ex(this.A08.A0F, r63, r7, layoutDirection, BDL, BA9, arrayList, i3, i2, this.A07, z, z2);
    }
}
