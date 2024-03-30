package X;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import java.util.List;

/* renamed from: X.6ZB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6ZB implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C146806wC A00;
    public final /* synthetic */ AnonymousClass5Cl A01;
    public final /* synthetic */ AnonymousClass3A1 A02;

    public /* synthetic */ AnonymousClass6ZB(C146806wC r1, AnonymousClass5Cl r2, AnonymousClass3A1 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass6V4 r1;
        C146806wC r0 = this.A00;
        AnonymousClass5Cl r6 = this.A01;
        AnonymousClass3A1 r12 = this.A02;
        boolean isEmpty = TextUtils.isEmpty(r12.A04);
        if (r6 != null) {
            if (isEmpty) {
                r1 = r0.A0M;
            } else {
                AnonymousClass6FV r4 = r0.A0T;
                C1268365v r2 = r4.A03;
                List list = r4.A04;
                r2.A00(list);
                C129196Ft r22 = r4.A01;
                if (r22 != null && !list.contains(r22)) {
                    r4.A01 = null;
                }
                DoodleView doodleView = r0.A0N;
                String str = r12.A04;
                float f = r12.A00;
                AnonymousClass3PW r23 = r12.A05;
                int i = r23.A03;
                int i2 = r12.A01;
                int i3 = r12.A03;
                int i4 = r23.A02;
                int i5 = r12.A02;
                if (!(str.equals(r6.A0A) && r6.A01.getColor() == i && i2 == r6.A06 && i3 == r6.A08 && i4 == r6.A0E.A02)) {
                    AnonymousClass6FV r3 = doodleView.A0H;
                    r3.A03.A00.add(new AnonymousClass5Cs(r6.A09(), r6));
                    r6.A0P(str, f, i2, i3, i4, i5);
                    r6.A0G(i);
                    doodleView.invalidate();
                    if (r6 != r3.A01) {
                        r1 = doodleView.A0E;
                    }
                }
            }
            r1.A03();
        } else if (!isEmpty) {
            DoodleView doodleView2 = r0.A0N;
            String str2 = r12.A04;
            float f2 = r12.A00;
            AnonymousClass3PW r24 = r12.A05;
            int i6 = r24.A03;
            int i7 = r12.A01;
            int i8 = r12.A03;
            int i9 = r24.A02;
            int i10 = r12.A02;
            AnonymousClass5Cl r62 = new AnonymousClass5Cl(doodleView2.getContext(), doodleView2.A05, doodleView2.A06);
            r62.A0P(str2, f2, i7, i8, i9, i10);
            r62.A0G(i6);
            doodleView2.A03(r62);
        }
        C19420v0 r13 = r0.A0E;
        C36341k9.A0v(C19420v0.A00(r13), "text_tool_media_composer_font", r0.A02);
        C36341k9.A0q(r0.A0A.getContext(), r0.A05.findViewById(16908290).getRootView(), R.color.f6nameremoved);
        r0.A0N.invalidate();
        C129126Fh r32 = r0.A0V;
        r32.A07(0);
        r0.A0I.A02();
        C146806wC.A03(r0);
        r32.A04();
        r32.A0B = false;
    }
}
