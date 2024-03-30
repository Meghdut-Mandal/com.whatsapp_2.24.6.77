package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.bloks.stdlib.components.bkcomponentstextinput.EditTextForMeasure;
import java.util.Objects;

/* renamed from: X.6mD  reason: invalid class name and case insensitive filesystem */
public final class C140816mD implements C161997nq {
    public final C140456lc A00;
    public final String A01;

    public /* synthetic */ boolean BLj(C161997nq r2) {
        AnonymousClass00C.A0D(r2, 1);
        return AnonymousClass6GY.A01(this, r2);
    }

    public C120925sJ BO1(C114855hw r16, long j) {
        Typeface typeface;
        int measuredWidth;
        C123035vp r3 = r16.A00;
        AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type com.facebook.rendercore.LayoutContext<com.instagram.common.bloks.BloksContext>");
        C140456lc r13 = this.A00;
        long j2 = j;
        int A012 = C131696Qd.A01(j2);
        int A002 = C131696Qd.A00(j2);
        String str = this.A01;
        C1271967i r12 = (C1271967i) r3.A03;
        Context context = r3.A02;
        EditTextForMeasure A003 = AnonymousClass5Y5.A00(context);
        String A0J = C140456lc.A0J(r13);
        String str2 = (String) C140456lc.A0I(r13, 54);
        if (r12 == null || A0J == null) {
            typeface = null;
        } else {
            typeface = AnonymousClass6NR.A00().A03.A00(r12.A00, A0J);
            if (str2 != null && !str2.isEmpty()) {
                try {
                    typeface = C109545Xz.A00(context, typeface, str2, A0J);
                } catch (AnonymousClass5R5 e) {
                    AnonymousClass6RS.A00(r12, "TextInputBinderUtils", "Error parsing text style for text input", e);
                }
            }
        }
        Objects.requireNonNull(r12);
        C125115zL r2 = (C125115zL) C133266Xn.A04(r12, r13);
        if (str == null) {
            str = r2.A0N;
        }
        AnonymousClass6XF.A02(typeface, A003, (C125115zL) null, r12, r13, str);
        A003.measure(A012, A002);
        AnonymousClass5o7 r4 = new AnonymousClass5o7(typeface, A003.getLineCount());
        if (View.MeasureSpec.getMode(A012) == Integer.MIN_VALUE) {
            measuredWidth = View.MeasureSpec.getSize(A012);
        } else {
            measuredWidth = A003.getMeasuredWidth();
        }
        int measuredHeight = A003.getMeasuredHeight();
        if (View.MeasureSpec.getMode(A012) == 0) {
            AnonymousClass6RS.A01("TextInputBinderUtils", "TextInput is being measured with unspecified width");
        }
        return new C120925sJ(r4, Math.max(AnonymousClass5YU.A00(C90514aH.A0D(j2)).A04(j2), measuredWidth), Math.max(AnonymousClass5YU.A00((int) j2).A03(j2), measuredHeight));
    }

    public C140816mD(C140456lc r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
