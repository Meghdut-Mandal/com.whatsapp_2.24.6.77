package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.1rN  reason: invalid class name and case insensitive filesystem */
public final class C39161rN extends ConstraintLayout implements C18700tb {
    public C07200Ws A00;
    public AnonymousClass171 A01;
    public C27731Pn A02;
    public C21060yb A03;
    public C18820ts A04;
    public C27751Pr A05;
    public C20810yC A06;
    public C19890wg A07;
    public AnonymousClass1RJ A08;
    public AnonymousClass1RJ A09;
    public AnonymousClass1RJ A0A;
    public WDSButton A0B;
    public WDSButton A0C;
    public AnonymousClass1QZ A0D;
    public boolean A0E;
    public LinearLayout A0F;
    public TextEmojiLabel A0G;
    public TextEmojiLabel A0H;
    public WaImageView A0I;
    public AnonymousClass1RJ A0J;
    public AnonymousClass1RJ A0K;
    public final AnonymousClass00T A0L;

    public C39161rN(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        if (!this.A0E) {
            this.A0E = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A06 = C36341k9.A0V(A0W);
            this.A02 = C36351kA.A0T(A0W);
            this.A05 = C36381kD.A0b(A0W);
            this.A01 = C36341k9.A0S(A0W);
            this.A04 = C36341k9.A0T(A0W);
            this.A03 = C36351kA.A0U(A0W);
            this.A07 = C36351kA.A0m(A0W);
        }
        this.A0L = C36431kI.A1I(new C834749n(context));
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A0H = C36401kF.A0P(this, R.id.title);
        this.A0I = C36421kH.A0J(this, R.id.avatar);
        this.A0G = C36401kF.A0P(this, R.id.subtitle);
        this.A0F = C36441kJ.A0U(this, R.id.title_subtitle_container);
        this.A0K = C36341k9.A0Y(this, R.id.trust_signals);
        this.A0B = C36441kJ.A0u(this, R.id.approve_button);
        this.A0C = C36441kJ.A0u(this, R.id.reject_button);
        this.A09 = C36341k9.A0Y(this, R.id.progress_spinner);
        this.A08 = C36341k9.A0Y(this, R.id.failure);
        this.A0A = C36341k9.A0Y(this, R.id.request_status);
        C36401kF.A17(this);
        C36361kB.A10(getResources(), this, R.dimen.f7nameremoved);
    }

    public static final void setupButtons$lambda$7(AnonymousClass3K2 r1, View view) {
        AnonymousClass00C.A0D(r1, 0);
        r1.A05.invoke(r1.A02, C51452nq.APPROVE);
    }

    public static final void setupButtons$lambda$8(AnonymousClass3K2 r1, View view) {
        AnonymousClass00C.A0D(r1, 0);
        r1.A05.invoke(r1.A02, C51452nq.REJECT);
    }

    public static final void setupButtons$lambda$9(AnonymousClass3K2 r1, View view) {
        AnonymousClass00C.A0D(r1, 0);
        r1.A05.invoke(r1.A02, C51452nq.CANCEL);
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setContactPhotos(C27731Pn r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setPathDrawableHelper(C27751Pr r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setSharedPreferencesFactory(C19890wg r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setSystemServices(C21060yb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setWaContactNames(AnonymousClass171 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    private final void setCompletedUi(int i) {
        int i2;
        int i3;
        int A002;
        TextView A0V;
        int A042 = C36411kG.A04(this.A0B);
        WDSButton wDSButton = this.A0C;
        if (wDSButton != null) {
            wDSButton.setVisibility(A042);
        }
        AnonymousClass1RJ r0 = this.A09;
        if (r0 != null) {
            r0.A03(A042);
        }
        AnonymousClass1RJ r5 = this.A0A;
        if (r5 != null) {
            r5.A03(0);
        }
        if (i != 2) {
            if (i == 3) {
                i2 = R.drawable.group_info_label_gray;
                i3 = R.string.f12nameremoved;
            } else if (i == 4) {
                i2 = R.drawable.group_info_label_gray;
                i3 = R.string.f12nameremoved;
            } else {
                return;
            }
            A002 = R.color.f6nameremoved;
        } else {
            i2 = R.drawable.group_info_label_green;
            i3 = R.string.f12nameremoved;
            A002 = C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        }
        if (r5 != null && (A0V = C36441kJ.A0V(r5)) != null) {
            A0V.setText(A0V.getResources().getText(i3));
            A0V.setBackground(C36381kD.A0H(A0V.getContext(), i2));
            C36331k8.A0r(A0V.getContext(), A0V, A002);
        }
    }

    private final void setupButtons(AnonymousClass3K2 r6) {
        WDSButton wDSButton;
        int i;
        AnonymousClass1RJ r0 = this.A09;
        if (r0 != null) {
            r0.A03(8);
        }
        AnonymousClass1RJ r02 = this.A0A;
        if (r02 != null) {
            r02.A03(8);
        }
        AnonymousClass1RJ r03 = this.A08;
        if (r03 != null) {
            r03.A03(8);
        }
        int ordinal = r6.A01.ordinal();
        if (ordinal == 0) {
            WDSButton wDSButton2 = this.A0B;
            if (wDSButton2 != null) {
                wDSButton2.setVisibility(0);
            }
            wDSButton = this.A0C;
            if (wDSButton != null) {
                wDSButton.setVisibility(0);
            }
            if (wDSButton2 != null) {
                C36331k8.A0q(getContext(), wDSButton2, R.string.f12nameremoved);
            }
            if (wDSButton != null) {
                C36331k8.A0q(getContext(), wDSButton, R.string.f12nameremoved);
            }
            if (wDSButton2 != null) {
                C66943Xx.A00(wDSButton2, r6, 0);
            }
            if (wDSButton != null) {
                i = 1;
            } else {
                return;
            }
        } else if (ordinal == 1) {
            WDSButton wDSButton3 = this.A0B;
            if (wDSButton3 != null) {
                wDSButton3.setVisibility(8);
            }
            wDSButton = this.A0C;
            if (wDSButton != null) {
                C36331k8.A0q(C36431kI.A0A(wDSButton, this, 0), wDSButton, R.string.f12nameremoved);
                i = 2;
            } else {
                return;
            }
        } else {
            return;
        }
        C66943Xx.A00(wDSButton, r6, i);
    }

    private final void setupDescription(AnonymousClass3K2 r10) {
        View A012;
        TextEmojiLabel A0P;
        String str = r10.A02.A05;
        if (str == null || str.length() == 0) {
            AnonymousClass1RJ r1 = this.A0J;
            if (r1 != null) {
                r1.A03(8);
                return;
            }
            return;
        }
        AnonymousClass1RJ A0Y = C36341k9.A0Y(C36391kE.A0L(this.A0K, 0), R.id.description);
        this.A0J = A0Y;
        A0Y.A03(0);
        AnonymousClass1RJ r0 = this.A0J;
        if (r0 != null && (A012 = r0.A01()) != null && (A0P = C36401kF.A0P(A012, R.id.member_suggested_groups_management_description)) != null) {
            C21060yb systemServices = getSystemServices();
            C19890wg sharedPreferencesFactory = getSharedPreferencesFactory();
            int A022 = C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
            float dimension = getResources().getDimension(R.dimen.f7nameremoved);
            int A013 = AnonymousClass1K2.A01(systemServices, sharedPreferencesFactory);
            int i = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            if (A013 < 2011) {
                i = 512;
            }
            A0P.A0I(C36441kJ.A0P(AnonymousClass6YV.A01(str, dimension, A022, i, false)));
        }
    }

    private final void setupParticipantCount(AnonymousClass3K2 r9) {
        long j = r9.A02.A01;
        if (j > 0 && r9.A01 != C51182nP.MEMBER) {
            AnonymousClass1RJ r6 = new AnonymousClass1RJ(C36341k9.A0Y(C36391kE.A0L(this.A0K, 0), R.id.member_suggested_groups_management_participant_count).A01());
            r6.A03(0);
            TextView A0P = C36391kE.A0P(this, R.id.member_suggested_groups_management_participant_count_text);
            C18820ts whatsAppLocale = getWhatsAppLocale();
            Object[] A0L2 = AnonymousClass001.A0L();
            AnonymousClass000.A1M(A0L2, 0, j);
            A0P.setText(whatsAppLocale.A0L(A0L2, R.plurals.f10nameremoved, j));
            AnonymousClass1RJ r0 = this.A0J;
            if (r0 != null && r0.A00() == 0) {
                ViewGroup.LayoutParams A022 = r6.A02();
                AnonymousClass00C.A0E(A022, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) A022;
                marginLayoutParams.topMargin = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
                r6.A06(marginLayoutParams);
            }
        }
    }

    private final void setupProfilePic(AnonymousClass3K2 r7) {
        WaImageView waImageView = this.A0I;
        if (waImageView != null) {
            getContactPhotosLoader().A04(waImageView, new C53982sD(this, 2), r7.A04, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        }
    }

    private final void setupSubTitle(AnonymousClass3K2 r11) {
        String A0H2;
        Resources resources;
        int i;
        Object[] objArr;
        TextEmojiLabel textEmojiLabel = this.A0G;
        if (textEmojiLabel != null) {
            int ordinal = r11.A01.ordinal();
            if (ordinal == 0) {
                A0H2 = getWaContactNames().A0H(r11.A03);
                resources = getResources();
                i = R.string.f12nameremoved;
                objArr = new Object[1];
            } else if (ordinal == 1) {
                resources = getResources();
                i = R.string.f12nameremoved;
                objArr = new Object[1];
                A0H2 = C20040wv.A04(getWhatsAppLocale(), r11.A02.A00 * 1000);
            } else {
                throw C36441kJ.A18();
            }
            textEmojiLabel.A0I(C36411kG.A0w(resources, A0H2, objArr, 0, i));
        }
    }

    private final void setupTitle(AnonymousClass3K2 r3) {
        TextEmojiLabel textEmojiLabel = this.A0H;
        if (textEmojiLabel != null) {
            textEmojiLabel.A0I(r3.A02.A06);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0D;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0D = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final C225314u getActivity() {
        return (C225314u) this.A0L.getValue();
    }

    public final C27731Pn getContactPhotos() {
        C27731Pn r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactPhotos");
    }

    public final C27751Pr getPathDrawableHelper() {
        C27751Pr r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("pathDrawableHelper");
    }

    public final C19890wg getSharedPreferencesFactory() {
        C19890wg r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("sharedPreferencesFactory");
    }

    public final C21060yb getSystemServices() {
        C21060yb r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0W();
    }

    public final AnonymousClass171 getWaContactNames() {
        AnonymousClass171 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0c();
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    private final void setupPopupMenu(AnonymousClass3K2 r12) {
        C07200Ws r5;
        String A0H2 = getWaContactNames().A0H(r12.A03);
        LinearLayout linearLayout = this.A0F;
        if (linearLayout != null) {
            r5 = new C07200Ws(linearLayout.getContext(), linearLayout, 8388611, 0, R.style.f13nameremoved);
        } else {
            r5 = null;
        }
        this.A00 = r5;
        if (r5 != null) {
            r5.A03.add((CharSequence) getActivity().getResources().getString(R.string.f12nameremoved, AnonymousClass000.A1b(A0H2)));
        }
        C07200Ws r2 = this.A00;
        if (r2 != null) {
            r2.A01 = new AnonymousClass4XD(r12, this, 1);
        }
        if (linearLayout != null) {
            AnonymousClass3YE.A00(linearLayout, this, r12, 23);
        }
    }

    public static final void setupPopupMenu$lambda$2(C39161rN r2, AnonymousClass3K2 r3, View view) {
        C07200Ws r0;
        C36321k7.A0w(r2, r3);
        if (r3.A01 == C51182nP.ADMIN && (r0 = r2.A00) != null) {
            r0.A00();
        }
    }

    public final void A06(AnonymousClass3K2 r3) {
        AnonymousClass1RJ r1;
        if (getAbProps().A0E(5078)) {
            setupPopupMenu(r3);
        }
        setupProfilePic(r3);
        setupTitle(r3);
        setupSubTitle(r3);
        setupDescription(r3);
        setupParticipantCount(r3);
        int i = r3.A00;
        if (i != 0) {
            if (i == 1) {
                int A042 = C36411kG.A04(this.A0B);
                WDSButton wDSButton = this.A0C;
                if (wDSButton != null) {
                    wDSButton.setVisibility(A042);
                }
                AnonymousClass1RJ r0 = this.A0A;
                if (r0 != null) {
                    r0.A03(A042);
                }
                r1 = this.A09;
            } else if (i == 2 || i == 3 || i == 4) {
                setCompletedUi(i);
                return;
            } else if (i == 5) {
                int A043 = C36411kG.A04(this.A0B);
                WDSButton wDSButton2 = this.A0C;
                if (wDSButton2 != null) {
                    wDSButton2.setVisibility(A043);
                }
                AnonymousClass1RJ r02 = this.A09;
                if (r02 != null) {
                    r02.A03(A043);
                }
                AnonymousClass1RJ r03 = this.A0A;
                if (r03 != null) {
                    r03.A03(A043);
                }
                r1 = this.A08;
            } else {
                return;
            }
            if (r1 != null) {
                r1.A03(0);
                return;
            }
            return;
        }
        setupButtons(r3);
    }

    public final AnonymousClass1RY getContactPhotosLoader() {
        AnonymousClass1RY A052;
        Activity A002 = C18860tw.A00(getContext());
        if (A002 instanceof C87434Ou) {
            A052 = ((C87434Ou) A002).getContactPhotosLoader();
        } else {
            A052 = getContactPhotos().A05(getContext(), "rich-message-welcome-card");
        }
        AnonymousClass00C.A0B(A052);
        return A052;
    }
}
