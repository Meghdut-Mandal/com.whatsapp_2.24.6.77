package X;

import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3PU  reason: invalid class name */
public class AnonymousClass3PU {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass004 A03;
    public final int A04;

    public int A00() {
        if (this instanceof AnonymousClass222) {
            return ((AnonymousClass222) this).A00.A02();
        }
        AnonymousClass004 r0 = this.A03;
        if (r0 == null) {
            return 0;
        }
        return ((List) r0.get()).size();
    }

    public int[] A01(C19890wg r3, int i) {
        if (this instanceof AnonymousClass222) {
            return (int[]) ((AnonymousClass222) this).A00.A03(i);
        }
        AnonymousClass004 r0 = this.A03;
        if (r0 == null) {
            return new int[0];
        }
        int[] iArr = ((AnonymousClass1XQ) ((List) r0.get()).get(i)).A00;
        if (AnonymousClass3UO.A02(iArr)) {
            return AnonymousClass3TY.A04(r3, iArr);
        }
        if (AnonymousClass3UO.A03(iArr)) {
            return AnonymousClass3TY.A05(r3, iArr);
        }
        return iArr;
    }

    public AnonymousClass3PU(AnonymousClass38I r2, int i) {
        this.A04 = i;
        this.A03 = r2.A03;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
        this.A02 = r2.A02;
    }

    public AnonymousClass3PU() {
        this.A04 = 0;
        this.A03 = null;
        this.A00 = R.id.emoji_recent_btn;
        this.A01 = R.id.emoji_recent_marker;
        this.A02 = R.string.f12nameremoved;
    }
}
