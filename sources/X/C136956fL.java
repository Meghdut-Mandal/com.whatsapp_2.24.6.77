package X;

import android.view.Choreographer;
import androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1;

/* renamed from: X.6fL  reason: invalid class name and case insensitive filesystem */
public final class C136956fL implements C162267oJ {
    public static final Choreographer A00 = ((Choreographer) C05700Qs.A00(C36401kF.A0y(), new DefaultChoreographerFrameClock$choreographer$1((C023509x) null)));
    public static final C136956fL A01 = new C136956fL();

    public Object BxV(C023509x r4, C006302t r5) {
        AnonymousClass0AR A02 = AnonymousClass0AA.A02(r4);
        C135286cS r1 = new C135286cS(r5, A02);
        A00.postFrameCallback(r1);
        A02.BL1(new AnonymousClass7R7(r1));
        return A02.A0G();
    }

    public Object fold(Object obj, C009003v r3) {
        return C90504aG.A0j(obj, this, r3);
    }

    public C005202i get(C005902p r2) {
        return C008803t.A00(this, r2);
    }

    public /* synthetic */ C005902p getKey() {
        return C162267oJ.A00;
    }

    public C005102h minusKey(C005902p r2) {
        return C008803t.A01(this, r2);
    }

    public C005102h plus(C005102h r2) {
        return C008803t.A02(this, r2);
    }
}
