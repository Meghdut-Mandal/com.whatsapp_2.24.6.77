package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: X.3Sr  reason: invalid class name and case insensitive filesystem */
public final class C65593Sr {
    public View A00;
    public C38261o8 A01;
    public C38641pR A02;
    public AnonymousClass4UQ A03;
    public C43882Ke A04;
    public C43872Kd A05;
    public ArrayList A06;
    public boolean A07;
    public boolean A08;
    public final ViewGroup A09;
    public final ListView A0A;
    public final AnonymousClass01L A0B;
    public final C19460v5 A0C;
    public final C19730wQ A0D;
    public final AnonymousClass1NV A0E;
    public final AnonymousClass16D A0F;
    public final AnonymousClass31K A0G;
    public final C65053Qn A0H;
    public final C25071Ew A0I;
    public final C20810yC A0J;
    public final C20500xf A0K;
    public final C20350xQ A0L;
    public final AnonymousClass1CF A0M;
    public final AnonymousClass11F A0N;
    public final AnonymousClass1C6 A0O;
    public final C28201Rs A0P = C36441kJ.A0t();
    public final AnonymousClass1RJ A0Q;
    public final C62423Gc A0R;
    public final C57452yG A0S;
    public final C225014r A0T;
    public final AnonymousClass1NG A0U;
    public final C33201et A0V;
    public final C220412q A0W;
    public final AnonymousClass13J A0X;

    public static AnonymousClass3BC A00(AnonymousClass384 r3, C65593Sr r4, AnonymousClass141 r5) {
        int i = r3.A00;
        if (i == 1) {
            return r4.A0H.A02(r4.A03.getType(), r3.A01);
        } else if (i == 2) {
            return r4.A0H.A04(r5);
        } else {
            if (i == 5) {
                return r4.A0H.A03(r5);
            }
            if (i != 6) {
                return null;
            }
            return r4.A0H.A05(r5, r4.A03.getType(), r3.A01);
        }
    }

    public static void A01(AnonymousClass3BC r1, C65593Sr r2) {
        AnonymousClass4UQ r0 = r2.A03;
        if (r1 != null) {
            r0.BoA(r1);
        } else if (r0 != null) {
            r0.BKD();
        }
    }

    public static void A02(C65593Sr r11, AnonymousClass141 r12) {
        AnonymousClass141 r10 = r12;
        if ((!C36361kB.A1X(r11.A0D, r12) || !C36391kE.A1X(r11.A0J)) && !(r11.A0N instanceof C223313w) && r11.A01 == null) {
            AnonymousClass01L r4 = r11.A0B;
            C38261o8 r2 = new C38261o8(r4);
            r11.A01 = r2;
            C20810yC r3 = r11.A0J;
            C220412q r5 = r11.A0W;
            C225014r r6 = r11.A0T;
            AnonymousClass31K r1 = r11.A0G;
            Objects.requireNonNull(r1);
            r2.setup(r3, r4, r5, r6, new C81103wT((Object) r1, 28), r11.A0U, r11.A0V, r10);
            r11.A09.addView(r11.A01, 0);
        }
    }

    public static void A03(C65593Sr r5, AnonymousClass141 r6, boolean z) {
        AnonymousClass3L0 r0;
        C65053Qn r4 = r5.A0H;
        r4.A00 = r6;
        r4.A01 = z;
        if (r5.A03 != null) {
            return;
        }
        if ((!r5.A0J.A0E(412) || ((r0 = r6.A0E) != null && r0.A01())) && !AnonymousClass3M3.A00(r6, r5.A0K)) {
            C38181ny r02 = new C38181ny(r5.A0B);
            r5.A03 = r02;
            r02.setup(r4);
            r5.A0A.addFooterView((View) r5.A03);
            return;
        }
        View A0L2 = C36391kE.A0L(r5.A0Q, 0);
        C18800tq r03 = r5.A0S.A00.A01;
        C70853fp r04 = new C70853fp(A0L2, C36351kA.A0U(r03), C36341k9.A0V(r03));
        r5.A03 = r04;
        r04.A03 = r4;
    }

    public void A04(boolean z, int i) {
        TextView textView;
        int i2;
        this.A00.setVisibility(C36351kA.A00(z ? 1 : 0));
        if (z || i == 0) {
            C38641pR r0 = this.A02;
            if (r0 != null) {
                r0.setVisibility(8);
                return;
            }
            return;
        }
        if (this.A02 == null) {
            this.A02 = new C38641pR(this.A0B);
            LinearLayout.LayoutParams A0N2 = C36371kC.A0N();
            A0N2.gravity = 17;
            this.A02.setBackgroundResource(R.drawable.date_balloon);
            this.A09.addView(this.A02, A0N2);
        }
        C38641pR r02 = this.A02;
        if (r02 != null) {
            r02.setVisibility(0);
            C38641pR r1 = this.A02;
            if (i == 1) {
                r1.A00.setVisibility(0);
                textView = r1.A01;
                i2 = R.string.f12nameremoved;
            } else if (i == 2) {
                r1.A00.setVisibility(8);
                textView = r1.A01;
                i2 = R.string.f12nameremoved;
            } else {
                return;
            }
            textView.setText(i2);
        }
    }

    public C65593Sr(ViewStub viewStub, ListView listView, AnonymousClass01L r6, C19460v5 r7, C57452yG r8, C225014r r9, C19730wQ r10, AnonymousClass1NG r11, C33201et r12, AnonymousClass1NV r13, AnonymousClass16D r14, AnonymousClass31K r15, C65053Qn r16, C220412q r17, C25071Ew r18, C20810yC r19, C20500xf r20, C20350xQ r21, AnonymousClass1CF r22, AnonymousClass11F r23, AnonymousClass1A1 r24, AnonymousClass1C6 r25, AnonymousClass13J r26) {
        this.A0J = r19;
        this.A0B = r6;
        this.A0D = r10;
        this.A0W = r17;
        this.A0O = r25;
        this.A0K = r20;
        this.A0F = r14;
        this.A0X = r26;
        this.A0U = r11;
        this.A0L = r21;
        C25071Ew r1 = r18;
        this.A0I = r1;
        this.A0M = r22;
        this.A0C = r7;
        this.A0E = r13;
        this.A0H = r16;
        this.A0T = r9;
        this.A0G = r15;
        this.A0N = r23;
        this.A0A = listView;
        this.A0Q = new AnonymousClass1RJ(viewStub);
        this.A0R = new C62423Gc(r10, r14, r1, r24);
        this.A0V = r12;
        this.A0S = r8;
        ViewGroup viewGroup = (ViewGroup) C36361kB.A0E(r6.getLayoutInflater(), listView, R.layout.f9nameremoved);
        this.A09 = viewGroup;
        this.A00 = viewGroup.findViewById(R.id.progress);
        listView.addHeaderView(viewGroup);
    }
}
