package X;

import android.graphics.Rect;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1rg  reason: invalid class name and case insensitive filesystem */
public final class C39311rg extends AnonymousClass0BN {
    public Rect A00 = AnonymousClass001.A06();
    public Rect A01 = AnonymousClass001.A06();
    public Rect A02 = AnonymousClass001.A06();
    public Rect A03 = AnonymousClass001.A06();
    public Rect A04 = AnonymousClass001.A06();
    public Rect A05 = AnonymousClass001.A06();
    public Rect A06 = AnonymousClass001.A06();
    public Rect A07 = AnonymousClass001.A06();
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public final int A0P;
    public final View A0Q;
    public final AnonymousClass4O0 A0R;

    public void A0s(C07650Ys r3, int i) {
        Rect rect;
        AnonymousClass00C.A0D(r3, 1);
        if (A04()) {
            r3.A0C("CropImageView");
            r3.A0A(AnonymousClass0Yd.A08);
            if (i == C52572pe.LEFT_CROP_TO_LEFT.value) {
                r3.A0D(this.A0J);
                rect = this.A02;
            } else if (i == C52572pe.LEFT_CROP_TO_RIGHT.value) {
                r3.A0D(this.A0K);
                rect = this.A03;
            } else if (i == C52572pe.RIGHT_CROP_TO_LEFT.value) {
                r3.A0D(this.A0L);
                rect = this.A04;
            } else if (i == C52572pe.RIGHT_CROP_TO_RIGHT.value) {
                r3.A0D(this.A0M);
                rect = this.A05;
            } else if (i == C52572pe.TOP_CROP_TO_TOP.value) {
                r3.A0D(this.A0O);
                rect = this.A07;
            } else if (i == C52572pe.TOP_CROP_TO_BOTTOM.value) {
                r3.A0D(this.A0N);
                rect = this.A06;
            } else if (i == C52572pe.BOTTOM_CROP_TO_TOP.value) {
                r3.A0D(this.A0I);
                rect = this.A01;
            } else if (i == C52572pe.BOTTOM_CROP_TO_BOTTOM.value) {
                r3.A0D(this.A0H);
                rect = this.A00;
            } else {
                return;
            }
            r3.A02.setBoundsInParent(rect);
        }
    }

    public void A0t(List list) {
        AnonymousClass00C.A0D(list, 0);
        if (A04()) {
            for (C52572pe r0 : C52572pe.values()) {
                list.add(Integer.valueOf(r0.value));
            }
        }
    }

    private final boolean A04() {
        if (this.A0G && !this.A02.isEmpty() && !this.A03.isEmpty()) {
            Rect rect = this.A04;
            if (rect.isEmpty() || rect.isEmpty() || this.A07.isEmpty() || this.A06.isEmpty() || this.A01.isEmpty() || this.A00.isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        if (r3 == r2) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0095, code lost:
        if (r3 == r1) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a7, code lost:
        if (r3 == r0) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0w(int r11, int r12, android.os.Bundle r13) {
        /*
            r10 = this;
            X.4O0 r4 = r10.A0R
            if (r4 == 0) goto L_0x011c
            boolean r0 = r10.A04()
            if (r0 == 0) goto L_0x011c
            r0 = 16
            if (r12 != r0) goto L_0x011c
            X.2pe[] r3 = X.C52572pe.values()
            int r2 = r3.length
            r1 = 0
        L_0x0014:
            if (r1 >= r2) goto L_0x0114
            r7 = r3[r1]
            int r0 = r7.value
            if (r0 != r11) goto L_0x00c8
            int r6 = r7.origin
            X.2pK[] r5 = X.C52372pK.values()
            int r2 = r5.length
            r1 = 0
        L_0x0024:
            if (r1 >= r2) goto L_0x010c
            r3 = r5[r1]
            int r0 = r3.value
            if (r0 != r6) goto L_0x00c4
            int r6 = r7.direction
            X.2pK[] r5 = X.C52372pK.values()
            int r2 = r5.length
            r1 = 0
        L_0x0034:
            if (r1 >= r2) goto L_0x0104
            r7 = r5[r1]
            int r0 = r7.value
            if (r0 != r6) goto L_0x00c0
            int r5 = r7.ordinal()
            r0 = 1
            r2 = 0
            if (r5 == r0) goto L_0x00bd
            r0 = 3
            r1 = -70
            if (r5 == r0) goto L_0x0051
            r1 = 0
            r0 = 2
            if (r5 == r0) goto L_0x00ba
            if (r5 != r2) goto L_0x0051
            r2 = -70
        L_0x0051:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            X.011 r1 = X.C36421kH.A0j(r0, r2)
            java.lang.Object r0 = r1.first
            int r6 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r0 = r1.second
            int r5 = X.AnonymousClass000.A0I(r0)
            X.2pK r2 = X.C52372pK.LEFT
            if (r3 != r2) goto L_0x0083
            if (r7 != r2) goto L_0x0085
            java.lang.String r9 = r10.A0A
        L_0x006d:
            int r3 = r3.ordinal()
            r2 = 2
            r8 = 4
            r1 = 1
            r0 = 0
            if (r3 == r2) goto L_0x00cf
            if (r3 == r0) goto L_0x00cc
            r0 = 3
            if (r3 == r0) goto L_0x00d2
            if (r3 == r1) goto L_0x00d3
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0083:
            if (r3 != r2) goto L_0x008c
        L_0x0085:
            X.2pK r0 = X.C52372pK.RIGHT
            if (r7 != r0) goto L_0x008c
            java.lang.String r9 = r10.A0B
            goto L_0x006d
        L_0x008c:
            X.2pK r1 = X.C52372pK.TOP
            if (r3 != r1) goto L_0x0095
            if (r7 != r1) goto L_0x0097
            java.lang.String r9 = r10.A0F
            goto L_0x006d
        L_0x0095:
            if (r3 != r1) goto L_0x009e
        L_0x0097:
            X.2pK r0 = X.C52372pK.BOTTOM
            if (r7 != r0) goto L_0x009e
            java.lang.String r9 = r10.A0E
            goto L_0x006d
        L_0x009e:
            X.2pK r0 = X.C52372pK.RIGHT
            if (r3 != r0) goto L_0x00a7
            if (r7 != r0) goto L_0x00a9
            java.lang.String r9 = r10.A0D
            goto L_0x006d
        L_0x00a7:
            if (r3 != r0) goto L_0x00ae
        L_0x00a9:
            if (r7 != r2) goto L_0x00ae
            java.lang.String r9 = r10.A0C
            goto L_0x006d
        L_0x00ae:
            X.2pK r0 = X.C52372pK.BOTTOM
            if (r3 != r0) goto L_0x00b7
            if (r7 != r1) goto L_0x00b7
            java.lang.String r9 = r10.A09
            goto L_0x006d
        L_0x00b7:
            java.lang.String r9 = r10.A08
            goto L_0x006d
        L_0x00ba:
            r2 = 70
            goto L_0x0051
        L_0x00bd:
            r1 = 70
            goto L_0x0051
        L_0x00c0:
            int r1 = r1 + 1
            goto L_0x0034
        L_0x00c4:
            int r1 = r1 + 1
            goto L_0x0024
        L_0x00c8:
            int r1 = r1 + 1
            goto L_0x0014
        L_0x00cc:
            r8 = 8
            goto L_0x00d3
        L_0x00cf:
            r8 = 16
            goto L_0x00d3
        L_0x00d2:
            r8 = 2
        L_0x00d3:
            com.whatsapp.crop.CropImageView r4 = (com.whatsapp.crop.CropImageView) r4
            java.util.ArrayList r0 = r4.A06
            java.util.Iterator r7 = r0.iterator()
        L_0x00db:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0102
            java.lang.Object r2 = r7.next()
            X.3Qg r2 = (X.AnonymousClass3Qg) r2
            r2.A03()
            float r1 = (float) r6
            float r0 = (float) r5
            r2.A04(r8, r1, r0)
            android.graphics.Rect r0 = r2.A03()
            int r3 = r0.top
            int r2 = r0.right
            int r1 = r0.bottom
            int r0 = r0.left
            com.whatsapp.crop.CropImageView.A00(r4, r3, r2, r1, r0)
            r4.announceForAccessibility(r9)
            goto L_0x00db
        L_0x0102:
            r0 = 1
            return r0
        L_0x0104:
            java.lang.String r1 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x010c:
            java.lang.String r1 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x0114:
            java.lang.String r1 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x011c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39311rg.A0w(int, int, android.os.Bundle):boolean");
    }

    public C39311rg(View view, AnonymousClass4O0 r4, int i) {
        super(view);
        this.A0Q = view;
        this.A0P = i;
        this.A0R = r4;
        this.A0J = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A0K = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A0L = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A0M = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A0O = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A0N = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A0I = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A0H = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A0A = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A0B = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A0C = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A0D = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A0F = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A0E = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A09 = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A08 = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
    }

    public int A0m(float f, float f2) {
        C52572pe r0;
        if (!A04()) {
            return -1;
        }
        int i = (int) f;
        int i2 = (int) f2;
        if (this.A02.contains(i, i2)) {
            r0 = C52572pe.LEFT_CROP_TO_LEFT;
        } else if (this.A03.contains(i, i2)) {
            r0 = C52572pe.LEFT_CROP_TO_RIGHT;
        } else if (this.A04.contains(i, i2)) {
            r0 = C52572pe.RIGHT_CROP_TO_LEFT;
        } else if (this.A05.contains(i, i2)) {
            r0 = C52572pe.RIGHT_CROP_TO_RIGHT;
        } else if (this.A07.contains(i, i2)) {
            r0 = C52572pe.TOP_CROP_TO_TOP;
        } else if (this.A06.contains(i, i2)) {
            r0 = C52572pe.TOP_CROP_TO_BOTTOM;
        } else if (this.A01.contains(i, i2)) {
            r0 = C52572pe.BOTTOM_CROP_TO_TOP;
        } else if (!this.A00.contains(i, i2)) {
            return -1;
        } else {
            r0 = C52572pe.BOTTOM_CROP_TO_BOTTOM;
        }
        return r0.value;
    }
}
