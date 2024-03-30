package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.2iD  reason: invalid class name and case insensitive filesystem */
public class C48882iD extends C33541fX {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass17Y A01;
    public final /* synthetic */ AnonymousClass1XY A02;
    public final /* synthetic */ AnonymousClass1X4 A03;
    public final /* synthetic */ AnonymousClass1NG A04;
    public final /* synthetic */ C20310xM A05;
    public final /* synthetic */ C26171Jd A06;
    public final /* synthetic */ AnonymousClass3T1 A07;
    public final /* synthetic */ C590032g A08;
    public final /* synthetic */ C19770wU A09;

    public C48882iD(Context context, AnonymousClass17Y r2, AnonymousClass1XY r3, AnonymousClass1X4 r4, AnonymousClass1NG r5, C20310xM r6, C26171Jd r7, AnonymousClass3T1 r8, C590032g r9, C19770wU r10) {
        this.A04 = r5;
        this.A07 = r8;
        this.A00 = context;
        this.A08 = r9;
        this.A09 = r10;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r7;
    }

    public void A02(View view) {
        int i;
        String string;
        AnonymousClass1NG r1 = this.A04;
        AnonymousClass3T1 r6 = this.A07;
        AnonymousClass11F r5 = r6.A1J.A00;
        boolean A1X = C36351kA.A1X(r1, r5);
        Context context = this.A00;
        if (A1X) {
            AnonymousClass3SJ.A01(C24801Dv.A00(context), 106);
            return;
        }
        C39001qm A002 = AnonymousClass3LW.A00(context);
        C590032g r10 = this.A08;
        Resources resources = context.getResources();
        List list = r10.A00;
        if (list.size() == 0) {
            string = "";
        } else {
            AnonymousClass3T1 A0n = C36411kG.A0n(list, 0);
            if (list.size() != 1) {
                boolean z = A0n instanceof AnonymousClass2bM;
                i = R.string.f12nameremoved;
                if (!z) {
                    i = R.string.f12nameremoved;
                }
            } else if (A0n != null && AnonymousClass000.A1S(A0n.A0A & C132986Wc.A0F, C132986Wc.A0F)) {
                i = R.string.f12nameremoved;
            } else if (A0n instanceof C180858mX) {
                boolean isEmpty = ((C180858mX) A0n).A06.isEmpty();
                i = R.string.f12nameremoved;
                if (isEmpty) {
                    i = R.string.f12nameremoved;
                }
            } else if (A0n instanceof C180868mY) {
                string = C36411kG.A0w(resources, ((C180868mY) A0n).A01, new Object[1], 0, R.string.f12nameremoved);
            } else if (A0n instanceof C46752bc) {
                int i2 = ((C46752bc) A0n).A01;
                i = R.string.f12nameremoved;
                if (i2 == 1) {
                    i = R.string.f12nameremoved;
                }
            } else if (A0n instanceof AnonymousClass5J2) {
                int i3 = ((AnonymousClass5J2) A0n).A00;
                i = R.string.f12nameremoved;
                if (i3 == 1) {
                    i = R.string.f12nameremoved;
                }
            } else {
                boolean z2 = A0n instanceof C46762bd;
                i = R.string.f12nameremoved;
                if (z2) {
                    i = R.string.f12nameremoved;
                }
            }
            string = resources.getString(i);
        }
        A002.A0p(string);
        if (r6.A0D == 21) {
            A002.A0h(C66433Vy.A00, R.string.f12nameremoved);
            if (r5 instanceof C28981Uw) {
                A002.A0g(new AnonymousClass4XI(r6, this.A05, this.A09, 12), R.string.f12nameremoved);
            }
        } else {
            A002.A0h(new AnonymousClass3VL(this.A01, this.A02, this.A03, this.A05, this.A06, r10, this.A09), R.string.f12nameremoved);
            A002.A0f(C66443Vz.A00, R.string.f12nameremoved);
        }
        C36341k9.A11(A002);
    }
}
