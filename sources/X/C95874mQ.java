package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.polls.PollResultsViewModel;
import java.util.List;

/* renamed from: X.4mQ  reason: invalid class name and case insensitive filesystem */
public final class C95874mQ extends C02920Ck {
    public final C115315ig A00;
    public final C115325ih A01;
    public final C115335ii A02;
    public final C115345ij A03;
    public final AnonymousClass1RY A04;
    public final AnonymousClass7d0 A05;
    public final AnonymousClass7d1 A06;
    public final PollResultsViewModel A07;

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        switch (i) {
            case 0:
                C115325ih r2 = this.A01;
                View A0E = C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved);
                AnonymousClass00C.A08(A0E);
                List list = AnonymousClass0D3.A0I;
                C18800tq r0 = r2.A00.A01;
                return new C96834ny(A0E, C36351kA.A0U(r0), C36351kA.A0e(r0), C36351kA.A0m(r0));
            case 1:
                C115315ig r22 = this.A00;
                View A0E2 = C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved);
                List list2 = AnonymousClass0D3.A0I;
                C18800tq r02 = r22.A00.A01;
                AnonymousClass1H2 A0e = C36351kA.A0e(r02);
                return new C96914o6(A0E2, C36351kA.A0U(r02), C36341k9.A0T(r02), A0e, C36351kA.A0m(r02));
            case 2:
                C115335ii r23 = this.A02;
                AnonymousClass1RY r8 = this.A04;
                View A0E3 = C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved);
                AnonymousClass00C.A08(A0E3);
                AnonymousClass7d1 r11 = this.A06;
                List list3 = AnonymousClass0D3.A0I;
                C18800tq r03 = r23.A00.A01;
                return new C96924o7(A0E3, C36351kA.A0N(r03), C36341k9.A0R(r03), r8, C36351kA.A0V(r03), C36341k9.A0T(r03), r11);
            case 4:
                C115345ij r4 = this.A03;
                AnonymousClass1RY r3 = this.A04;
                View A0E4 = C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved);
                AnonymousClass00C.A08(A0E4);
                List list4 = AnonymousClass0D3.A0I;
                C18800tq r04 = r4.A00.A01;
                return new C96854o0(A0E4, r3, C36351kA.A0V(r04), C36341k9.A0T(r04));
            case 5:
            case 6:
                List list5 = AnonymousClass0D3.A0I;
                View A0E5 = C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved);
                AnonymousClass00C.A08(A0E5);
                return new C96594na(A0E5);
            case 7:
                List list6 = AnonymousClass0D3.A0I;
                View A0E6 = C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved);
                AnonymousClass00C.A08(A0E6);
                return new C96554nW(A0E6);
            case 8:
            case 9:
                List list7 = AnonymousClass0D3.A0I;
                View A0E7 = C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved);
                AnonymousClass00C.A08(A0E7);
                return new C96704nl(A0E7, this.A05);
            default:
                List list8 = AnonymousClass0D3.A0I;
                View A0E8 = C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved);
                AnonymousClass00C.A08(A0E8);
                return new C42051yC(A0E8, this.A07);
        }
    }

    public void BSE(AnonymousClass0D3 r17, int i) {
        String string;
        C64933Qa r0;
        AnonymousClass11F r1;
        AnonymousClass1RY r2;
        C64933Qa r02;
        C64933Qa r03;
        int i2;
        int i3;
        AnonymousClass0D3 r3 = r17;
        AnonymousClass00C.A0D(r3, 0);
        int i4 = i;
        if (r3 instanceof C96834ny) {
            C96834ny r32 = (C96834ny) r3;
            Object A0L = A0L(i4);
            AnonymousClass00C.A0E(A0L, "null cannot be cast to non-null type com.whatsapp.polls.PollResultsQuestion");
            C147476xH r8 = (C147476xH) A0L;
            AnonymousClass00C.A0D(r8, 0);
            String str = r8.A02;
            if (str != null) {
                SpannableStringBuilder A0P = C36441kJ.A0P(str);
                AnonymousClass6YV.A08(r32.A02, r32.A04, A0P);
                WaTextView waTextView = r32.A00;
                waTextView.setText(AnonymousClass3UG.A03(waTextView.getContext(), waTextView.getPaint(), r32.A03, A0P));
                if (!r8.A03 || (i3 = r8.A00) <= 1) {
                    r32.A01.setVisibility(8);
                    return;
                }
                WaTextView waTextView2 = r32.A01;
                Context A0F = C36441kJ.A0F(r32);
                Object[] A0M = AnonymousClass001.A0M();
                C36331k8.A1X(A0M, r8.A01, 0, i3, 1);
                C36341k9.A0s(A0F, waTextView2, A0M, R.string.f12nameremoved);
            }
        } else if ((r3 instanceof C96914o6) && (A0L(i4) instanceof C147486xI)) {
            C96914o6 r33 = (C96914o6) r3;
            Object A0L2 = A0L(i4);
            AnonymousClass00C.A0E(A0L2, "null cannot be cast to non-null type com.whatsapp.polls.PollResultsOption");
            C147486xI r12 = (C147486xI) A0L2;
            AnonymousClass00C.A0D(r12, 0);
            String str2 = r12.A02;
            SpannableStringBuilder A0P2 = C36441kJ.A0P(str2);
            AnonymousClass6YV.A08(r33.A06, r33.A09, A0P2);
            int i5 = r12.A00;
            WaTextView waTextView3 = r33.A05;
            waTextView3.setText(AnonymousClass3UG.A03(waTextView3.getContext(), waTextView3.getPaint(), r33.A08, A0P2));
            WaTextView waTextView4 = r33.A04;
            C18820ts r82 = r33.A07;
            long j = (long) i5;
            Integer valueOf = Integer.valueOf(i5);
            waTextView4.setText(r82.A0L(new Object[]{valueOf}, R.plurals.f10nameremoved, j));
            LinearLayout linearLayout = r33.A01;
            Resources resources = linearLayout.getResources();
            boolean z = r12.A04;
            if (z) {
                i2 = C36391kE.A04(linearLayout.getContext());
            } else {
                i2 = R.color.f6nameremoved;
            }
            waTextView4.setTextColor(C015006m.A00((Resources.Theme) null, resources, i2));
            int i6 = 8;
            r33.A03.setVisibility(C36351kA.A00(z ? 1 : 0));
            Resources resources2 = linearLayout.getResources();
            int i7 = R.drawable.poll_results_option_count_rounded_corner_non_winner;
            if (z) {
                i7 = R.drawable.poll_results_option_count_rounded_corner_winner;
            }
            linearLayout.setBackground(AnonymousClass0BT.A00((Resources.Theme) null, resources2, i7));
            View view = r33.A00;
            if (!r12.A03) {
                i6 = 0;
            }
            view.setVisibility(i6);
            String A0L3 = r82.A0L(new Object[]{valueOf}, R.plurals.f10nameremoved, j);
            AnonymousClass00C.A08(A0L3);
            r33.A02.setContentDescription(C90464aC.A0f(A0L3, AnonymousClass000.A0v(str2), ' '));
        } else if ((r3 instanceof C96924o7) && (A0L(i4) instanceof C147496xJ)) {
            C96924o7 r34 = (C96924o7) r3;
            Object A0L4 = A0L(i4);
            AnonymousClass00C.A0E(A0L4, "null cannot be cast to non-null type com.whatsapp.polls.PollResultsUser");
            C147496xJ r4 = (C147496xJ) A0L4;
            AnonymousClass00C.A0D(r4, 0);
            WaTextView waTextView5 = r34.A03;
            String str3 = r4.A03;
            waTextView5.setText(str3);
            WaTextView waTextView6 = r34.A04;
            String str4 = r4.A04;
            waTextView6.setText(str4);
            String A0B = AnonymousClass3UY.A0B(r34.A09, r34.A08.A08(r4.A00));
            AnonymousClass00C.A08(A0B);
            if (!AnonymousClass098.A06(str3)) {
                r34.A05.setText(A0B);
            } else {
                waTextView5.setText(A0B);
            }
            C180858mX r22 = r4.A02;
            AnonymousClass141 r11 = r4.A01;
            AnonymousClass141 r5 = r11;
            if (r22 == null && r11 == null) {
                r34.A02.setVisibility(8);
            } else {
                WaImageView waImageView = r34.A02;
                waImageView.setVisibility(0);
                if (r22 == null || (r03 = r22.A1J) == null || !r03.A02) {
                    AnonymousClass11F r13 = null;
                    if (!(r22 == null || (r02 = r22.A1J) == null)) {
                        r13 = r02.A00;
                    }
                    if (AnonymousClass143.A0G(r13)) {
                        if (r22 != null) {
                            r1 = r22.A0J();
                        }
                    } else if (r11 != null) {
                        r1 = r11.A0H;
                    } else if (!(r22 == null || (r0 = r22.A1J) == null)) {
                        r1 = r0.A00;
                    }
                    if (r1 != null) {
                        r2 = r34.A07;
                        if (r11 == null) {
                            r11 = r34.A06.A0D(r1);
                        }
                    }
                } else {
                    C19730wQ r04 = r34.A01;
                    r04.A0G();
                    r11 = r04.A0E;
                    if (r11 != null) {
                        r2 = r34.A07;
                    }
                }
                r2.A08(waImageView, r11);
            }
            View view2 = r34.A00;
            Resources A0F2 = C36341k9.A0F(r34.A0H);
            Object[] A1Q = C36441kJ.A1Q();
            A1Q[0] = str3;
            C36411kG.A1Q(str4, A0B, A1Q, 1);
            view2.setContentDescription(A0F2.getString(R.string.f12nameremoved, A1Q));
            if (r5 != null) {
                AnonymousClass3YH.A00(view2, r34, r5, 14);
            }
        } else if ((r3 instanceof C42051yC) && (A0L(i4) instanceof C147456xF)) {
            C42051yC r35 = (C42051yC) r3;
            Object A0L5 = A0L(i4);
            AnonymousClass00C.A0E(A0L5, "null cannot be cast to non-null type com.whatsapp.polls.PollResultsSeeAll");
            C147456xF r23 = (C147456xF) A0L5;
            AnonymousClass00C.A0D(r23, 0);
            r35.A00 = r23.A01;
            WaTextView waTextView7 = r35.A01;
            int i8 = r23.A00;
            if (i8 == -1) {
                string = waTextView7.getContext().getString(R.string.f12nameremoved);
            } else {
                Context context = waTextView7.getContext();
                Object[] A0L6 = AnonymousClass001.A0L();
                AnonymousClass000.A1L(A0L6, i8, 0);
                string = context.getString(R.string.f12nameremoved, A0L6);
            }
            waTextView7.setText(string);
        } else if ((r3 instanceof C96854o0) && (A0L(i4) instanceof C147466xG)) {
            C96854o0 r36 = (C96854o0) r3;
            Object A0L7 = A0L(i4);
            AnonymousClass00C.A0E(A0L7, "null cannot be cast to non-null type com.whatsapp.polls.PollResultsNonContactUser");
            C147466xG r52 = (C147466xG) A0L7;
            AnonymousClass00C.A0D(r52, 0);
            String A0B2 = AnonymousClass3UY.A0B(r36.A05, r36.A04.A08(r52.A00));
            AnonymousClass00C.A08(A0B2);
            r36.A02.setText(A0B2);
            r36.A03.A08(r36.A01, r52.A01);
            View view3 = r36.A00;
            Resources A0F3 = C36341k9.A0F(r36.A0H);
            Object[] A1Q2 = C36441kJ.A1Q();
            A1Q2[0] = A0B2;
            C36411kG.A1Q("", A0B2, A1Q2, 1);
            view3.setContentDescription(A0F3.getString(R.string.f12nameremoved, A1Q2));
        } else if ((r3 instanceof C96594na) && (A0L(i4) instanceof C147446xE)) {
            C96594na r37 = (C96594na) r3;
            Object A0L8 = A0L(i4);
            AnonymousClass00C.A0E(A0L8, "null cannot be cast to non-null type com.whatsapp.polls.PollResultsContactTypeSection");
            C147446xE r14 = (C147446xE) A0L8;
            AnonymousClass00C.A0D(r14, 0);
            int i9 = r14.A00;
            int i10 = R.string.f12nameremoved;
            if (i9 == 6) {
                i10 = R.string.f12nameremoved;
            }
            r37.A00.setText(i10);
        } else if ((r3 instanceof C96704nl) && (A0L(i4) instanceof C147436xD)) {
            C96704nl r38 = (C96704nl) r3;
            Object A0L9 = A0L(i4);
            AnonymousClass00C.A0E(A0L9, "null cannot be cast to non-null type com.whatsapp.polls.PollResultsError");
            C147436xD r15 = (C147436xD) A0L9;
            AnonymousClass00C.A0D(r15, 0);
            int i11 = r15.A00;
            int i12 = R.string.f12nameremoved;
            if (i11 == 8) {
                i12 = R.string.f12nameremoved;
            }
            r38.A01.setText(i12);
            r38.A00.setText(R.string.f12nameremoved);
        }
    }

    public C95874mQ(C02830Cb r1, C115315ig r2, C115325ih r3, C115335ii r4, C115345ij r5, AnonymousClass1RY r6, AnonymousClass7d0 r7, AnonymousClass7d1 r8, PollResultsViewModel pollResultsViewModel) {
        super(r1);
        this.A07 = pollResultsViewModel;
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
        this.A06 = r8;
    }

    public int getItemViewType(int i) {
        return ((C160487l5) A0L(i)).BJ9();
    }
}
