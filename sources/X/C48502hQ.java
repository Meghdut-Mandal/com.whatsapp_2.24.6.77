package X;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.collections.ObservableRecyclerView;
import java.lang.ref.WeakReference;

/* renamed from: X.2hQ  reason: invalid class name and case insensitive filesystem */
public final class C48502hQ extends C42581z3 {
    public LinearLayoutManager A00 = new LinearLayoutManager(0);
    public C48112gj A01;
    public final WfalManager A02;
    public final ObservableRecyclerView A03;
    public final C65333Rq A04;
    public final C32151d3 A05;
    public final C32381dS A06;
    public final AnonymousClass1UM A07;
    public final C35011i0 A08;
    public final C28781Ua A09;
    public final AnonymousClass00T A0A;
    public final AnonymousClass00T A0B;
    public final AnonymousClass00T A0C;
    public final AnonymousClass00T A0D;
    public final AnonymousClass00T A0E;

    public static final void A00(AnonymousClass3KF r5, C48502hQ r6, boolean z) {
        int width;
        long j;
        AnonymousClass00T r3 = r6.A0A;
        View A0F = C36401kF.A0F(r3);
        AnonymousClass3Y9.A00(A0F, r6, 38);
        AnonymousClass3Y9.A00(C36361kB.A0G(A0F, R.id.close), r6, 37);
        if (r5.A03) {
            C65333Rq r52 = r6.A04;
            View A0F2 = C36401kF.A0F(r3);
            AnonymousClass00C.A0D(A0F2, 0);
            if (A0F2.getVisibility() == 0 && A0F2.getHeight() == C65333Rq.A01) {
                C65333Rq.A00(r52);
                return;
            }
            WeakReference weakReference = C65333Rq.A02;
            if (weakReference == null || weakReference.get() != A0F2) {
                C65333Rq.A02 = AnonymousClass001.A0F(A0F2);
                int visibility = A0F2.getVisibility();
                int i = A0F2.getLayoutParams().height;
                A0F2.setVisibility(0);
                C36421kH.A0t(A0F2);
                if (A0F2.getParent() == null) {
                    width = A0F2.getWidth();
                } else {
                    width = C36411kG.A0K(A0F2).getWidth();
                }
                C36411kG.A1B(A0F2, width, Integer.MIN_VALUE);
                C65333Rq.A01 = A0F2.getMeasuredHeight();
                A0F2.setVisibility(visibility);
                C36411kG.A1A(A0F2, i);
            }
            int i2 = C65333Rq.A01;
            AnonymousClass4VL r32 = new AnonymousClass4VL(A0F2, 25);
            C65333Rq.A00(r52);
            int[] A1O = C36441kJ.A1O();
            A1O[0] = 0;
            ValueAnimator A0C2 = C36411kG.A0C(A1O, i2);
            r52.A00 = A0C2;
            if (A0C2 != null) {
                C36381kD.A14(A0C2, 400);
                A0C2.addListener(r32);
                C53562rW.A00(A0C2, A0F2, 9);
                if (z) {
                    j = 1400;
                } else {
                    j = 0;
                }
                A0C2.setStartDelay(j);
                A0C2.start();
                return;
            }
            return;
        }
        r6.A04.A01(C36401kF.A0F(r3), r5.A02);
    }

    public static final void A01(AnonymousClass3KF r3, C48502hQ r4, boolean z) {
        boolean z2;
        C35011i0 r2;
        View A0F;
        int i;
        AnonymousClass00T r0;
        C20810yC r22 = r4.A09.A01;
        C21000yV r1 = C21000yV.A01;
        if (C20800yB.A01(r1, r22, 6759)) {
            z2 = r3.A03;
            r2 = r4.A08;
            A0F = C36401kF.A0F(r4.A0D);
            i = 5;
        } else {
            if (C20800yB.A01(r1, r22, 6456)) {
                z2 = r3.A03;
                A02(r4.A0E);
                r2 = r4.A08;
                r0 = r4.A0A;
            } else {
                boolean A062 = r4.A07.A06(AnonymousClass1US.CHANNELS_STATUS_LIST_VIEW_HOLDER);
                z2 = r3.A03;
                if (!A062) {
                    A02(r4.A0C);
                    r2 = r4.A08;
                    r0 = r4.A0E;
                } else {
                    A02(r4.A0E);
                    r2 = r4.A08;
                    A0F = C36401kF.A0F(r4.A0C);
                    i = 1;
                }
            }
            A0F = C36401kF.A0F(r0);
            i = 2;
        }
        r2.A03(A0F, i, z2, z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48502hQ(View view, WfalManager wfalManager, C18820ts r6, C65333Rq r7, C32221dB r8, C32151d3 r9, C40901wI r10, C32381dS r11, AnonymousClass1UM r12, C35011i0 r13, C28781Ua r14) {
        super(view);
        C36321k7.A1B(r6, r8, r14, wfalManager, r13);
        C36321k7.A1C(r11, r7, r12, r10, view);
        this.A09 = r14;
        this.A02 = wfalManager;
        this.A08 = r13;
        this.A06 = r11;
        this.A04 = r7;
        this.A07 = r12;
        this.A05 = r9;
        view.getContext();
        ObservableRecyclerView observableRecyclerView = (ObservableRecyclerView) view.findViewById(R.id.status_list);
        this.A03 = observableRecyclerView;
        this.A0A = C36431kI.A1I(new AnonymousClass4EN(this));
        this.A0C = C36431kI.A1I(new AnonymousClass4EP(this));
        this.A0E = C36431kI.A1I(new AnonymousClass4ER(this));
        this.A0D = C36431kI.A1I(new AnonymousClass4EQ(this));
        this.A0B = C36431kI.A1I(new AnonymousClass4EO(this));
        observableRecyclerView.setLayoutDirection(C36401kF.A1X(r6) ? 1 : 0);
        observableRecyclerView.setLayoutManager(this.A00);
        observableRecyclerView.setAdapter(r10);
        observableRecyclerView.setItemAnimator((C02800By) null);
        this.A03.A0v(new C41261wv(this));
        observableRecyclerView.A01.A02(r8);
        observableRecyclerView.A00.A02(r8);
    }

    public static void A02(AnonymousClass00T r1) {
        if (r1.BM2() && ((View) r1.getValue()).getVisibility() == 0) {
            ((View) r1.getValue()).setVisibility(8);
        }
    }
}
