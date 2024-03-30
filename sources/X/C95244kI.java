package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4kI  reason: invalid class name and case insensitive filesystem */
public final class C95244kI extends AnonymousClass0BN {
    public boolean A00;
    public final int A01;
    public final Rect A02 = AnonymousClass001.A06();
    public final Rect A03 = AnonymousClass001.A06();
    public final Rect A04 = AnonymousClass001.A06();
    public final Rect A05 = AnonymousClass001.A06();
    public final AnonymousClass7h0 A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public void A0s(C07650Ys r4, int i) {
        Rect rect;
        AnonymousClass00C.A0D(r4, 1);
        if (A04()) {
            r4.A0C("VideoTimelineView");
            AccessibilityNodeInfo accessibilityNodeInfo = r4.A02;
            accessibilityNodeInfo.addAction(16);
            if (i == 0) {
                r4.A0D(this.A09);
                rect = this.A04;
            } else if (i == 1) {
                r4.A0D(this.A0A);
                rect = this.A05;
            } else if (i == 2) {
                r4.A0D(this.A07);
                rect = this.A02;
            } else if (i == 3) {
                r4.A0D(this.A08);
                rect = this.A03;
            } else {
                return;
            }
            accessibilityNodeInfo.setBoundsInParent(rect);
        }
    }

    public void A0t(List list) {
        AnonymousClass00C.A0D(list, 0);
        if (A04()) {
            C90504aG.A10(0, list);
            list.add(C36361kB.A0i());
            list.add(C36361kB.A0j());
            list.add(C36371kC.A0n());
        }
    }

    private final boolean A04() {
        if (!this.A00 || this.A04.isEmpty() || this.A05.isEmpty() || this.A02.isEmpty() || this.A03.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean A0w(int i, int i2, Bundle bundle) {
        AnonymousClass7h0 r4 = this.A06;
        if (r4 == null || !A04() || i2 != 16) {
            return false;
        }
        if (i == 0) {
            r4.Bx3(-1, true);
            return true;
        } else if (i == 1) {
            r4.Bx3(1, true);
            return true;
        } else if (i != 2) {
            if (i == 3) {
                r4.Bx3(1, false);
            }
            return true;
        } else {
            r4.Bx3(-1, false);
            return true;
        }
    }

    public C95244kI(View view, AnonymousClass7h0 r4, int i) {
        super(view);
        this.A01 = i;
        this.A06 = r4;
        this.A09 = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A0A = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A07 = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
        this.A08 = C36381kD.A0s(view.getResources(), R.string.f12nameremoved);
    }

    public int A0m(float f, float f2) {
        if (!A04()) {
            return -1;
        }
        int i = (int) f;
        int i2 = (int) f2;
        if (this.A04.contains(i, i2)) {
            return 0;
        }
        if (this.A05.contains(i, i2)) {
            return 1;
        }
        if (this.A02.contains(i, i2)) {
            return 2;
        }
        if (this.A03.contains(i, i2)) {
            return 3;
        }
        return -1;
    }
}
