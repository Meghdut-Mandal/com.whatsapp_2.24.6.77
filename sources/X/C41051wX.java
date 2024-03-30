package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.newsletter.viewmodel.NewsletterListViewModel;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.1wX  reason: invalid class name and case insensitive filesystem */
public final class C41051wX extends AnonymousClass0CZ {
    public AnonymousClass2L4 A00;
    public final C57702yg A01;
    public final AnonymousClass17Y A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass1RY A04;
    public final C32241dD A05;
    public final AnonymousClass4ON A06;
    public final AnonymousClass4OP A07;
    public final List A08 = AnonymousClass001.A0I();
    public final AnonymousClass00T A09;
    public final C61553Cl A0A;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 0) {
            C57702yg r2 = this.A01;
            View A0J = C36371kC.A0J(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved, false);
            AnonymousClass1RY r6 = this.A04;
            List list = AnonymousClass0D3.A0I;
            C27121Mz r3 = r2.A00;
            C18800tq r22 = r3.A01;
            C18830tt r1 = r22.A00;
            AnonymousClass1GQ A0f = C36371kC.A0f(r22);
            return new C46592Yr(A0J, (C57712yh) r3.A00.A1a.get(), r6, A0f, (C61553Cl) r1.A1T.get(), (C64633Ov) r1.A2u.get(), this);
        } else if (i == 1) {
            return new AnonymousClass2Yp(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false));
        } else {
            if (i == 2) {
                return new AnonymousClass2Yo(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false));
            }
            if (i == 3 || i == 4 || i == 5) {
                return new C46582Yq(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false), this.A07);
            }
            throw AnonymousClass000.A0d("View type not supported ", AnonymousClass000.A0u(), i);
        }
    }

    public static final void A00(C41051wX r3, List list) {
        C36351kA.A1H(r3.A00);
        AnonymousClass2L4 r2 = new AnonymousClass2L4(r3.A08, list);
        AnonymousClass4YW.A00(r2, (C33301f4) r3.A09.getValue(), r3, list, 0);
        r3.A00 = r2;
    }

    public int A0J() {
        return this.A08.size();
    }

    public final void A0L() {
        List list = this.A08;
        if (C36401kF.A1a(list) && (C36401kF.A0n(list) instanceof C46552Yh)) {
            list.remove(C36431kI.A07(list));
            A09(C36431kI.A07(list));
        }
    }

    public void A0M(int i, boolean z) {
        C46542Yg r5;
        Object obj = this.A08.get(i);
        if ((obj instanceof C46542Yg) && (r5 = (C46542Yg) obj) != null) {
            AnonymousClass4ON r4 = this.A06;
            C44072La r7 = r5.A02;
            C46512Yd r42 = (C46512Yd) r4;
            if (z) {
                r42.A3r(r7.A0J(), i, true);
                r42.A3k();
                r7.A0J();
                if (r7.A02 > 0) {
                    AnonymousClass24P.A07(r7, r42);
                } else {
                    WeakReference A0F = AnonymousClass001.A0F(r42);
                    NewsletterListViewModel A3l = r42.A3l();
                    A3l.A04.A03(r7, new C85284Gm(r7, A0F));
                }
            } else {
                C28981Uw A0J = r7.A0J();
                C39001qm A002 = AnonymousClass3LW.A00(r42);
                A002.A0p(C36381kD.A0r(r42, r7.A0K, AnonymousClass001.A0L(), R.string.f12nameremoved));
                A002.A0l(r42, C67973b8.A00, R.string.f12nameremoved);
                A002.A0m(r42, new C67813as(r7, A0J, r42, i), R.string.f12nameremoved);
                A002.A0k(r42, new AnonymousClass3UW(A0J, r42, 28));
                C36341k9.A11(A002);
            }
            r5.A01 = true;
        }
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r12, int i) {
        WaTextView waTextView;
        int i2;
        WaImageView waImageView;
        C42551z0 r122 = (C42551z0) r12;
        AnonymousClass00C.A0D(r122, 0);
        C54882ti r2 = (C54882ti) this.A08.get(i);
        if (r122 instanceof AnonymousClass2Yp) {
            ((AnonymousClass2Yp) r122).A00.setText(R.string.f12nameremoved);
        } else if (r122 instanceof C46592Yr) {
            C46592Yr r123 = (C46592Yr) r122;
            C46542Yg r22 = (C46542Yg) r2;
            AnonymousClass00C.A0D(r22, 0);
            TextEmojiLabel textEmojiLabel = r123.A00;
            C44072La r8 = r22.A02;
            textEmojiLabel.setText(r8.A0K);
            if (r8.A0P()) {
                boolean A0E = r123.A04.A00.A0E(5276);
                int i3 = R.drawable.ic_verified;
                if (A0E) {
                    i3 = R.drawable.ic_verified_blue;
                }
                textEmojiLabel.A0F(i3, R.dimen.f7nameremoved);
            } else {
                textEmojiLabel.A0E();
            }
            long j = r8.A07;
            C64633Ov r5 = r123.A06;
            int A002 = C64633Ov.A00(r5, (int) j);
            String A012 = r5.A01(A002);
            AnonymousClass00C.A0D(A012, 1);
            WaTextView waTextView2 = r123.A02;
            C36351kA.A16(C36341k9.A0F(waTextView2), waTextView2, new Object[]{A012}, R.plurals.f10nameremoved, A002);
            r123.A03.A08(r123.A0A, r22.A00);
            if (r8.A0L()) {
                r123.A08.A03(8);
                waImageView = r123.A01;
                waImageView.setVisibility(8);
            } else {
                C61553Cl r1 = r123.A05;
                AnonymousClass1RJ r3 = r123.A07;
                if (r1.A00(C36371kC.A0B(r3.A01()))) {
                    r123.A08.A03(8);
                    waImageView = r123.A01;
                    waImageView.setVisibility(8);
                    WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) r3.A01();
                    AnonymousClass00C.A0B(waButtonWithLoader);
                    waButtonWithLoader.setVisibility(0);
                    if (r22.A01) {
                        waButtonWithLoader.A02();
                    } else {
                        waButtonWithLoader.A01();
                    }
                    if (r8.A0N()) {
                        waButtonWithLoader.setVariant(C27981Qp.TONAL);
                        waButtonWithLoader.setButtonText((int) R.string.f12nameremoved);
                        waButtonWithLoader.setSelected(false);
                    } else {
                        waButtonWithLoader.setVariant(C27981Qp.OUTLINE);
                        waButtonWithLoader.setButtonText((int) R.string.f12nameremoved);
                        waButtonWithLoader.setSelected(true);
                    }
                } else {
                    boolean z = r22.A01;
                    View A013 = r123.A08.A01();
                    AnonymousClass00C.A08(A013);
                    int i4 = 0;
                    A013.setVisibility(C36351kA.A00(z ? 1 : 0));
                    waImageView = r123.A01;
                    if (z) {
                        i4 = 4;
                    }
                    waImageView.setVisibility(i4);
                    waImageView.setSelected(!r8.A0N());
                }
            }
            r123.A09.A03(8);
            boolean isSelected = waImageView.isSelected();
            Context context = waImageView.getContext();
            int i5 = R.string.f12nameremoved;
            if (isSelected) {
                i5 = R.string.f12nameremoved;
            }
            C36371kC.A14(context, waImageView, new Object[]{textEmojiLabel.getText()}, i5);
            C33521fV.A02(waImageView);
        } else if (!(r122 instanceof AnonymousClass2Yo)) {
            C46582Yq r124 = (C46582Yq) r122;
            AnonymousClass00C.A0D(r2, 0);
            if (r2 instanceof C46562Yi) {
                waTextView = r124.A02;
                i2 = R.string.f12nameremoved;
            } else if (r2 instanceof AnonymousClass2Yl) {
                waTextView = r124.A02;
                i2 = R.string.f12nameremoved;
            } else {
                if (r2 instanceof AnonymousClass2Yk) {
                    r124.A02.setText(R.string.f12nameremoved);
                    WaTextView waTextView3 = r124.A01;
                    AnonymousClass00C.A07(waTextView3);
                    waTextView3.setVisibility(8);
                }
                C36371kC.A1F(r124.A0H, r124, r2, 9);
            }
            waTextView.setText(i2);
            C36371kC.A1F(r124.A0H, r124, r2, 9);
        }
    }

    public int getItemViewType(int i) {
        Object obj = this.A08.get(i);
        if (obj instanceof C46542Yg) {
            return 0;
        }
        if (obj instanceof C46572Yj) {
            return 1;
        }
        if (obj instanceof C46552Yh) {
            return 2;
        }
        if (obj instanceof C46562Yi) {
            return 3;
        }
        if (obj instanceof AnonymousClass2Yl) {
            return 4;
        }
        if (obj instanceof AnonymousClass2Yk) {
            return 5;
        }
        throw C36441kJ.A18();
    }

    public C41051wX(C57702yg r3, AnonymousClass17Y r4, AnonymousClass16D r5, C27731Pn r6, C19630wG r7, C61553Cl r8, C32241dD r9, AnonymousClass4ON r10, AnonymousClass4OP r11, C19770wU r12) {
        C36321k7.A1B(r6, r7, r12, r5, r4);
        C36321k7.A13(r3, r9, r8);
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = r9;
        this.A0A = r8;
        this.A06 = r10;
        this.A07 = r11;
        this.A04 = r6.A05(r7.A00, "directory-adapter");
        this.A09 = C36431kI.A1I(new C84224Ck(r12));
    }
}
