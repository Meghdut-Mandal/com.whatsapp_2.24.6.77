package com.whatsapp.payments.ui.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass01L;
import X.AnonymousClass04H;
import X.AnonymousClass04J;
import X.AnonymousClass04M;
import X.AnonymousClass05R;
import X.AnonymousClass060;
import X.AnonymousClass07B;
import X.AnonymousClass088;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass14B;
import X.AnonymousClass16U;
import X.AnonymousClass16V;
import X.AnonymousClass16W;
import X.AnonymousClass16X;
import X.AnonymousClass17Y;
import X.AnonymousClass1AP;
import X.AnonymousClass1BB;
import X.AnonymousClass1EV;
import X.AnonymousClass1H2;
import X.AnonymousClass1N2;
import X.AnonymousClass1Pp;
import X.AnonymousClass1RY;
import X.AnonymousClass1XN;
import X.AnonymousClass22s;
import X.AnonymousClass2M8;
import X.AnonymousClass2MC;
import X.AnonymousClass2Mb;
import X.AnonymousClass3EH;
import X.AnonymousClass3GT;
import X.AnonymousClass3HG;
import X.AnonymousClass3HH;
import X.AnonymousClass3J6;
import X.AnonymousClass3L7;
import X.AnonymousClass3LW;
import X.AnonymousClass3MR;
import X.AnonymousClass3UF;
import X.AnonymousClass3YD;
import X.AnonymousClass3YH;
import X.AnonymousClass687;
import X.AnonymousClass6DR;
import X.AnonymousClass6O1;
import X.AnonymousClass6US;
import X.AnonymousClass6Z7;
import X.AnonymousClass7hJ;
import X.AnonymousClass9v0;
import X.B1C;
import X.C012005e;
import X.C013405v;
import X.C017907q;
import X.C100844vw;
import X.C1033454x;
import X.C120005qo;
import X.C120015qp;
import X.C120025qq;
import X.C120045qs;
import X.C122755vN;
import X.C122815vT;
import X.C123415wS;
import X.C124885yx;
import X.C124965z5;
import X.C125375zo;
import X.C1261062o;
import X.C1261362r;
import X.C130766Mi;
import X.C131486Pf;
import X.C131926Ri;
import X.C132386Tk;
import X.C133356Xz;
import X.C133526Yw;
import X.C135066c4;
import X.C135106c9;
import X.C144326s0;
import X.C147106wg;
import X.C147376x7;
import X.C147386x8;
import X.C1497372o;
import X.C1498072v;
import X.C157457cz;
import X.C160477l4;
import X.C162067ny;
import X.C162077nz;
import X.C162657ow;
import X.C162917pM;
import X.C163247pt;
import X.C163267pv;
import X.C163357q4;
import X.C164097rG;
import X.C164757sK;
import X.C17690rq;
import X.C179148jG;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C19420v0;
import X.C19700wN;
import X.C19770wU;
import X.C19890wg;
import X.C202319lY;
import X.C20810yC;
import X.C21010yW;
import X.C21060yb;
import X.C220412q;
import X.C224514j;
import X.C24601Db;
import X.C24801Dv;
import X.C24881Ed;
import X.C27111My;
import X.C27731Pn;
import X.C27851Qb;
import X.C27861Qc;
import X.C29931Yo;
import X.C29971Ys;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import X.C38871qM;
import X.C39001qm;
import X.C39281rd;
import X.C48762i0;
import X.C53692rj;
import X.C54212sa;
import X.C68093bK;
import X.C78053rU;
import X.C88234Rx;
import X.C88704Ts;
import X.C90484aE;
import X.C90494aF;
import X.C90504aG;
import X.C90514aH;
import X.C95494lK;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PaymentView extends KeyboardPopupLayout implements View.OnClickListener, C88234Rx, C17690rq {
    public int A00;
    public int A01;
    public AutoTransition A02;
    public View A03;
    public Animation A04;
    public FrameLayout A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public LinearLayout A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public LinearLayout A0C;
    public LinearLayout A0D;
    public TextSwitcher A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public Group A0J;
    public CoordinatorLayout A0K;
    public AnonymousClass060 A0L;
    public TabLayout A0M;
    public C19700wN A0N;
    public AnonymousClass17Y A0O;
    public KeyboardPopupLayout A0P;
    public ThumbnailButton A0Q;
    public AnonymousClass1Pp A0R;
    public AnonymousClass1RY A0S;
    public C27731Pn A0T;
    public C21060yb A0U;
    public C19420v0 A0V;
    public C18820ts A0W;
    public AnonymousClass3HG A0X;
    public C220412q A0Y;
    public C24881Ed A0Z;
    public AnonymousClass16U A0a;
    public C1261362r A0b;
    public AnonymousClass6O1 A0c;
    public AnonymousClass1XN A0d;
    public AnonymousClass1H2 A0e;
    public EmojiSearchProvider A0f;
    public C125375zo A0g;
    public AnonymousClass2Mb A0h;
    public C20810yC A0i;
    public C21010yW A0j;
    public AnonymousClass3HH A0k;
    public AnonymousClass3L7 A0l;
    public AnonymousClass11F A0m;
    public C24601Db A0n;
    public AnonymousClass1EV A0o;
    public C29971Ys A0p;
    public AnonymousClass7hJ A0q;
    public PaymentAmountInputField A0r;
    public C144326s0 A0s;
    public C162067ny A0t;
    public C160477l4 A0u;
    public C120025qq A0v;
    public C157457cz A0w;
    public AnonymousClass687 A0x;
    public C19890wg A0y;
    public C135066c4 A0z;
    public AnonymousClass1BB A10;
    public AnonymousClass1AP A11;
    public AnonymousClass3GT A12;
    public C95494lK A13;
    public AnonymousClass3EH A14;
    public C122815vT A15;
    public C133356Xz A16;
    public C19770wU A17;
    public AnonymousClass005 A18;
    public Integer A19;
    public String A1A;
    public String A1B;
    public String A1C;
    public String A1D;
    public String A1E;
    public String A1F;
    public List A1G;
    public boolean A1H;
    public boolean A1I;
    public LinearLayout A1J;
    public LinearLayout A1K;
    public TextSwitcher A1L;
    public TextView A1M;
    public ShimmerFrameLayout A1N;
    public ShimmerFrameLayout A1O;
    public ThumbnailButton A1P;
    public boolean A1Q;
    public final Runnable A1R;

    public void Biu(AnonymousClass6DR r1) {
    }

    private void A03() {
        this.A0E.setPadding(0, getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, 0);
    }

    private void A04() {
        this.A0E.setPadding(getResources().getDimensionPixelSize(R.dimen.f7nameremoved), getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, 0);
        this.A0F.setPadding(C36371kC.A03(this, R.dimen.f7nameremoved), C36371kC.A03(this, R.dimen.f7nameremoved), 0, 0);
    }

    private void A06(C124885yx r10) {
        AnonymousClass088.A06(this.A0r, r10.A00);
        Pair pair = r10.A01;
        AnonymousClass088.A06(this.A0I, C36381kD.A04(pair));
        TextView textView = this.A0I;
        int[] iArr = (int[]) pair.second;
        textView.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        Pair pair2 = r10.A02;
        AnonymousClass088.A06(this.A0H, C36381kD.A04(pair2));
        TextView textView2 = this.A0H;
        int[] iArr2 = (int[]) pair2.second;
        textView2.setPadding(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
    }

    public static boolean A07(PaymentView paymentView) {
        if (!paymentView.A0i.A0E(3792) || !paymentView.A0i.A0E(5372)) {
            return false;
        }
        return true;
    }

    private void setInitialTabConfiguration(C124965z5 r3) {
        boolean A1T = C90504aG.A1T(r3.A09.A01);
        this.A00 = A1T ? 1 : 0;
        AnonymousClass6DR A092 = this.A0M.A09(A1T);
        if (A092 != null) {
            A092.A00();
        }
    }

    public void A08() {
        if (!this.A1Q) {
            this.A1Q = true;
            C27861Qc r1 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r3 = r1.A0M;
            this.A03 = C90504aG.A0W(r3);
            this.A0i = C36341k9.A0V(r3);
            this.A0O = C36351kA.A0M(r3);
            this.A0N = C36391kE.A0V(r3);
            this.A17 = C36341k9.A0Z(r3);
            this.A0j = C36351kA.A0g(r3);
            this.A0e = C36351kA.A0e(r3);
            this.A0d = (AnonymousClass1XN) r3.A7G.get();
            this.A0T = C36351kA.A0T(r3);
            this.A0R = C36361kB.A0V(r3);
            this.A0h = C27861Qc.A0X(r1);
            this.A18 = C18840tu.A00(r3.AXj);
            this.A0Y = C36351kA.A0a(r3);
            this.A0U = C36351kA.A0U(r3);
            this.A10 = (AnonymousClass1BB) r3.A85.get();
            C18830tt r2 = r3.A00;
            this.A0l = (AnonymousClass3L7) r2.ABI.get();
            this.A11 = (AnonymousClass1AP) r3.A89.get();
            this.A0n = (C24601Db) r3.A6D.get();
            this.A0W = C36341k9.A0T(r3);
            this.A0b = C36371kC.A0b(r2);
            this.A0f = C36351kA.A0f(r2);
            this.A0V = C36351kA.A0Y(r3);
            this.A0o = C90504aG.A0R(r3);
            this.A0Z = (C24881Ed) r3.A6H.get();
            this.A0y = C36351kA.A0m(r3);
            this.A0c = C36351kA.A0c(r2);
            this.A0p = (C29971Ys) r3.AVP.get();
            C27111My r12 = r1.A0L;
            this.A0g = (C125375zo) r12.A06.get();
            this.A0k = C27111My.A2F(r12);
            this.A15 = (C122815vT) r2.ACf.get();
            this.A12 = (AnonymousClass3GT) r2.ACY.get();
            this.A0X = (AnonymousClass3HG) r2.A6g.get();
        }
    }

    public void A09() {
        C120045qs r2;
        AnonymousClass16X r0;
        String str;
        AnonymousClass16U r11;
        AnonymousClass16X r9;
        Editable text = this.A0r.getText();
        C18740tg.A06(text);
        String obj = text.toString();
        int i = 1;
        if (this.A00 != 1) {
            this.A0o.A04.A02();
            i = 0;
        }
        C202319lY A0L2 = this.A0Z.A0L(this.A1D, this.A1F, -1);
        if (A0L2 == null || A0L2.A02 != 18) {
            BigDecimal B7j = this.A0a.B7j(this.A0W, obj);
            C147386x8 r10 = (C147386x8) this.A0w;
            C123415wS r12 = r10.A05;
            if (r12 != null) {
                String str2 = r12.A04;
                if (str2 == null || str2.length() == 0) {
                    r11 = r12.A02;
                    r9 = ((AnonymousClass16W) r11).A01;
                    AnonymousClass00C.A0B(r9);
                } else {
                    BigDecimal bigDecimal = new BigDecimal(str2);
                    r11 = r12.A02;
                    r9 = new AnonymousClass16X(bigDecimal, ((AnonymousClass16V) r11).A01);
                }
                if (B7j == null || r9.A00.compareTo(B7j) > 0) {
                    r2 = new C120045qs(2, C36391kE.A0v(r12.A00, r11.B7d(r12.A01, r9), new Object[1], 0, R.string.f12nameremoved));
                } else {
                    r2 = new C120045qs(0, "");
                }
            } else if (B7j == null || r10.A04.A00.compareTo(B7j) > 0) {
                r2 = new C120045qs(2, C36391kE.A0v(r10.A01, r10.A03.B7d(r10.A02, r10.A04), AnonymousClass001.A0L(), 0, R.string.f12nameremoved));
            } else {
                r2 = new C120045qs(0, "");
            }
            if (r2.A00 == 0) {
                Objects.requireNonNull(B7j);
                r2 = C147386x8.A00(r10, "", B7j, i, false);
            }
            int i2 = r2.A00;
            if ((i2 == 2 || i2 == 3) && (str = r2.A01) != null) {
                this.A0r.A0E();
                this.A0t.BWo(str);
                A0G(str);
                if (A07(this)) {
                    this.A0h.A08();
                }
                this.A0x.A01(1);
                return;
            }
            this.A1B = obj;
            C144326s0 r02 = this.A0s;
            if (r02 != null) {
                this.A1C = r02.A0B.getStringText();
                this.A1G = this.A0s.A0B.getMentions();
            }
            C162067ny r22 = this.A0t;
            int i3 = ((AnonymousClass16V) this.A0a).A01;
            if (i != 0) {
                r22.Bet(r0, obj);
                return;
            }
            r0 = new AnonymousClass16X(B7j, i3);
            r22.BgF(r0);
            return;
        }
        this.A0t.BgI();
    }

    public void A0A() {
        if (this.A0J.getVisibility() == 0) {
            this.A08.setTag(R.id.selected_expressive_background_theme, (Object) null);
            this.A08.setImageResource(R.drawable.payment_default_background);
            AnonymousClass7hJ r0 = this.A0q;
            if (r0 != null) {
                A06(r0.BmR().A04);
            }
        }
    }

    public void A0B() {
        C144326s0 r2 = this.A0s;
        if (r2 != null) {
            r2.A07.setVisibility(8);
            r2.A0D = null;
            r2.A0F = null;
            r2.A0B.setVisibility(0);
            r2.A06.setVisibility(0);
        }
    }

    public void A0C() {
        if (this.A1H) {
            this.A0E.setText(A01(this, this.A1A, R.string.f12nameremoved));
            A0I(this.A1I);
            this.A1L.setVisibility(8);
            return;
        }
        this.A1L.setVisibility(0);
        this.A0C.setVisibility(8);
        this.A09.setVisibility(8);
        if (this.A0u.BND()) {
            this.A0F.setVisibility(0);
            A04();
            return;
        }
        A03();
    }

    public void A0D() {
        int i;
        if (this.A00 == 1) {
            this.A1L.setVisibility(0);
            this.A1L.setText(this.A0u.B8E().getString(R.string.f12nameremoved));
            if (this.A1H) {
                this.A0E.setText(this.A1A);
                A0I(this.A1I);
            }
            if (this.A0u.BND()) {
                this.A0F.setText(this.A0u.BFW());
                this.A0F.setVisibility(0);
                A04();
            } else {
                A03();
            }
            C144326s0 r2 = this.A0s;
            if (r2 != null) {
                r2.A0C.B1n(2);
            }
            this.A0r.A03 = 1;
            i = 6;
        } else {
            boolean z = this.A1H;
            TextSwitcher textSwitcher = this.A1L;
            if (z) {
                textSwitcher.setVisibility(8);
                this.A0E.setText(A01(this, this.A1A, R.string.f12nameremoved));
                A03();
                this.A0F.setVisibility(8);
                A0I(this.A1I);
            } else {
                textSwitcher.setVisibility(0);
                this.A1L.setText(this.A0u.B8E().getString(R.string.f12nameremoved));
                this.A0F.setVisibility(8);
                A0C();
            }
            C144326s0 r1 = this.A0s;
            if (r1 != null) {
                r1.A0C.B1n(1);
            }
            this.A0r.A03 = 0;
            i = this.A01;
        }
        A0E(i);
        if (this.A0s != null) {
            boolean BND = this.A0u.BND();
            View view = this.A0s.A03;
            if (BND) {
                view.setVisibility(8);
                return;
            }
            view.setVisibility(0);
            if (this.A0v.A01) {
                MentionableEntry mentionableEntry = this.A0s.A0B;
                mentionableEntry.addTextChangedListener(new C162917pM(this, 4));
                C133356Xz r12 = this.A16;
                r12.A0B.unregisterObserver(r12.A09);
                if (!A07(this)) {
                    AnonymousClass687 r3 = this.A0x;
                    C144326s0 r13 = this.A0s;
                    ImageButton imageButton = r13.A05;
                    GifSearchContainer gifSearchContainer = r13.A0A;
                    EmojiSearchContainer emojiSearchContainer = r13.A08;
                    C18740tg.A04(emojiSearchContainer);
                    C162077nz r14 = this.A0v.A00;
                    C18740tg.A06(r14);
                    C133356Xz r22 = this.A16;
                    Integer A002 = C54212sa.A00(this.A0m);
                    C78053rU r5 = new C78053rU(r22);
                    ((C179148jG) r14).A0a = r5;
                    AnonymousClass3HH r15 = r3.A0E;
                    Activity activity = r3.A00;
                    r15.A00 = activity;
                    AnonymousClass3HG r9 = r3.A06;
                    r15.A02 = r9.A01();
                    r15.A04 = r9.A02(r3.A0H, r22);
                    r15.A01(imageButton, r3.A02, mentionableEntry, 12, A002);
                    AnonymousClass2M8 A003 = r15.A00();
                    C163267pv r6 = new C163267pv(mentionableEntry, r3, 1);
                    AnonymousClass2MC r92 = new AnonymousClass2MC(activity, emojiSearchContainer, r3.A0D, A003, gifSearchContainer, r3.A0F);
                    r5.A01(A003, (AnonymousClass11F) null, r14);
                    A003.A0H(r6);
                    A003.A0F = new C1498072v(r3, r92, 28);
                    A003.A0L(this);
                    r92.A00 = new C164097rG(r6, 4);
                    r5.A04 = this;
                    r22.A0B.registerObserver(r22.A09);
                    C36331k8.A1Q(A003, r3.A0J, 3);
                    return;
                }
            } else if (!A07(this)) {
                AnonymousClass687 r122 = this.A0x;
                C144326s0 r23 = this.A0s;
                MentionableEntry mentionableEntry2 = r23.A0B;
                ImageButton imageButton2 = r23.A05;
                EmojiSearchContainer emojiSearchContainer2 = r23.A08;
                C18740tg.A04(emojiSearchContainer2);
                Integer A004 = C54212sa.A00(this.A0m);
                Activity activity2 = r122.A00;
                C20810yC r18 = r122.A0C;
                AnonymousClass1N2 r17 = r122.A0I;
                AnonymousClass1H2 r152 = r122.A0A;
                AnonymousClass1XN r142 = r122.A09;
                C21060yb r8 = r122.A03;
                C18820ts r7 = r122.A05;
                C1261362r r62 = r122.A07;
                EmojiSearchProvider emojiSearchProvider = r122.A0B;
                C19420v0 r4 = r122.A04;
                C19890wg r32 = r122.A0G;
                KeyboardPopupLayout keyboardPopupLayout = r122.A02;
                AnonymousClass1N2 r322 = r17;
                AnonymousClass6O1 r24 = r122.A08;
                C19700wN r172 = r122.A01;
                KeyboardPopupLayout keyboardPopupLayout2 = keyboardPopupLayout;
                MentionableEntry mentionableEntry3 = mentionableEntry2;
                C21060yb r20 = r8;
                Activity activity3 = activity2;
                ImageButton imageButton3 = imageButton2;
                C1033454x r143 = new C1033454x(activity3, imageButton3, r172, keyboardPopupLayout2, mentionableEntry3, r20, r4, r7, r62, r24, r142, r152, emojiSearchContainer2, emojiSearchProvider, r18, r122, r32, r322, 12, A004);
                C163267pv r42 = new C163267pv(mentionableEntry2, r122, 0);
                AnonymousClass3J6 r33 = new AnonymousClass3J6(activity2, r143, emojiSearchContainer2);
                r33.A00 = new C164097rG(r42, 3);
                r143.A0H(r42);
                r143.A0F = new C1498072v(r122, r33, 27);
                C36331k8.A1Q(r143, r122.A0J, 0);
                return;
            }
            AnonymousClass2Mb r25 = this.A0h;
            Context context = getContext();
            CoordinatorLayout coordinatorLayout = this.A0K;
            AnonymousClass01L B8E = this.A0u.B8E();
            C144326s0 r16 = this.A0s;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            r25.A0D(B8E, context, coordinatorLayout, r16.A05, coordinatorLayout2, this.A0P, r16.A0B, r16.A09, (C39281rd) null, false);
            AnonymousClass3YH.A00(this.A0s.A05, this, new C163357q4(this, 3), 11);
        }
    }

    public void A0E(int i) {
        FrameLayout frameLayout = this.A05;
        if (i != 0) {
            frameLayout.setVisibility(8);
            return;
        }
        frameLayout.setVisibility(0);
        C36331k8.A0w(C90494aF.A0E(this.A0n), "payment_incentive_tooltip_viewed", true);
    }

    public void A0F(C88704Ts r2, int i, int i2) {
        if (r2 != null) {
            ViewStub viewStub = (ViewStub) findViewById(i);
            if (viewStub != null) {
                C53692rj.A00(viewStub, r2);
            } else {
                r2.BkP(findViewById(i2));
            }
        }
    }

    public void A0G(CharSequence charSequence) {
        if (this.A0G != null) {
            boolean A1a = C36421kH.A1a(charSequence);
            this.A0G.setVisibility(C36351kA.A00(A1a ? 1 : 0));
            this.A0G.setText(charSequence);
            this.A04.cancel();
            this.A04.reset();
            Handler handler = getHandler();
            if (handler != null) {
                Runnable runnable = this.A1R;
                handler.removeCallbacks(runnable);
                if (A1a) {
                    this.A0G.announceForAccessibility(charSequence);
                    getHandler().postDelayed(runnable, 4000);
                }
            }
        }
    }

    public void A0I(boolean z) {
        this.A1I = z;
        LinearLayout linearLayout = this.A0C;
        if (z) {
            linearLayout.setVisibility(8);
            this.A09.setVisibility(0);
            return;
        }
        linearLayout.setVisibility(0);
        this.A09.setVisibility(8);
    }

    public boolean A0J() {
        HashMap hashMap = this.A0x.A0J;
        Iterator A102 = C36371kC.A10(hashMap);
        while (A102.hasNext()) {
            Map.Entry A112 = AnonymousClass000.A11(A102);
            PopupWindow popupWindow = (PopupWindow) hashMap.get(A112.getKey());
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
                int A0I2 = AnonymousClass000.A0I(A112.getKey());
                if (A0I2 != 0) {
                    if (A0I2 != 1) {
                        if (!(A0I2 == 2 || A0I2 == 3)) {
                            return false;
                        }
                    }
                    return true;
                }
                if (A07(this)) {
                    this.A0h.A08();
                }
                this.A0x.A01(1);
                return true;
            }
        }
        return false;
    }

    public void Bhl(AnonymousClass11F r4, C135066c4 r5, Integer num, int i) {
        C78053rU r1 = ((C179148jG) this.A0v.A00).A0a;
        if (r1 != null) {
            r1.A04(true);
        }
        C144326s0 r12 = this.A0s;
        if (r12 == null) {
            return;
        }
        if (r12.A0D != null || AnonymousClass14B.A0F(r12.A0B.getStringText())) {
            C144326s0 r0 = this.A0s;
            if (r0 != null) {
                r0.A00(r5, num);
                return;
            }
            return;
        }
        C39001qm A002 = AnonymousClass3LW.A00(getContext());
        A002.A0d(R.string.f12nameremoved);
        A002.A0c(R.string.f12nameremoved);
        A002.A0h(new C133526Yw(this, r5, num), R.string.f12nameremoved);
        A002.A0f(AnonymousClass6Z7.A00, R.string.f12nameremoved);
        C36341k9.A11(A002);
    }

    public void Biv(AnonymousClass6DR r4) {
        boolean z = true;
        if (this.A00 != r4.A00) {
            if (A07(this)) {
                this.A0h.A08();
            }
            this.A0x.A01(1);
        }
        TransitionManager.beginDelayedTransition(C36411kG.A0P(this, R.id.send_payment_details), this.A02);
        int i = r4.A00;
        this.A00 = i;
        C162067ny r0 = this.A0t;
        if (i != 1) {
            z = false;
        }
        r0.Biw(z);
        A0D();
    }

    public List getMentionedJids() {
        C144326s0 r0 = this.A0s;
        if (r0 != null) {
            return r0.A0B.getMentions();
        }
        return AnonymousClass001.A0I();
    }

    public String getPaymentAmountString() {
        Editable text = this.A0r.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public C135106c9 getPaymentBackground() {
        if (this.A0J.getVisibility() != 0) {
            return null;
        }
        return (C135106c9) this.A08.getTag(R.id.selected_expressive_background_theme);
    }

    public String getPaymentNote() {
        C144326s0 r0 = this.A0s;
        if (r0 != null) {
            return r0.A0B.getStringText();
        }
        return "";
    }

    public View.OnClickListener getSendPaymentClickListener() {
        return new AnonymousClass9v0(this, 46);
    }

    public C135066c4 getStickerIfSelected() {
        C144326s0 r0 = this.A0s;
        if (r0 != null) {
            return r0.A0D;
        }
        return null;
    }

    public Integer getStickerSendOrigin() {
        C144326s0 r0 = this.A0s;
        if (r0 != null) {
            return r0.A0F;
        }
        return null;
    }

    public void setAmountInputData(C120005qo r22) {
        TextView textView;
        C130766Mi r14;
        C130766Mi r13;
        C130766Mi r16;
        C130766Mi r15;
        String str;
        String str2;
        C120005qo r0 = r22;
        AnonymousClass16U r2 = r0.A01;
        this.A0a = r2;
        int i = r0.A00;
        this.A0r.A0A = r2;
        AnonymousClass16V r23 = (AnonymousClass16V) r2;
        String str3 = "";
        if (r23.A00 == 0) {
            if (i == 0) {
                C18820ts r5 = this.A0W;
                String str4 = r23.A02;
                HashSet hashSet = AnonymousClass6US.A00;
                C132386Tk r4 = C132386Tk.A02;
                C132386Tk A0U2 = C90484aE.A0U(r4, str4);
                char c = 1;
                int A002 = C132386Tk.A00(A0U2.A00);
                C1261062o A003 = C131926Ri.A00(r5, true);
                C131486Pf r02 = new C131486Pf(A003.A00(), C36401kF.A0x(r5));
                boolean z = A003.A02;
                if (z) {
                    boolean z2 = C130766Mi.A03;
                    r15 = C90484aE.A0V(r5, 9);
                    r16 = C90484aE.A0V(r5, 11);
                    str2 = r5.A0A(10);
                    r13 = C90484aE.A0V(r5, 6);
                    r14 = C90484aE.A0V(r5, 8);
                    str = r5.A0A(7);
                } else {
                    r14 = C130766Mi.A02;
                    r13 = r14;
                    r16 = r14;
                    r15 = r14;
                    str = str3;
                    str2 = str3;
                }
                String A012 = A0U2.A01(r5);
                r02.A03(A002);
                String A013 = r02.A01();
                if (z) {
                    A013 = C131926Ri.A01(A003.A01, r13, r14, r15, r16, str, str2, A012, A013);
                }
                String A014 = A0U2.A01(r5);
                int length = A013.length();
                int length2 = A014.length();
                if (length < length2 || !A013.substring(0, length2).equals(A014)) {
                    c = 2;
                }
                TextView textView2 = this.A0H;
                if (c == 2) {
                    textView2.setText(str3);
                    textView = this.A0I;
                } else {
                    AnonymousClass16U r03 = this.A0a;
                    C18820ts r3 = this.A0W;
                    AnonymousClass16V r04 = (AnonymousClass16V) r03;
                    String str5 = r04.A02;
                    String str6 = r04.A03;
                    if (!AnonymousClass6US.A00.contains(str5)) {
                        str6 = C90484aE.A0U(r4, str5).A01(r3);
                    }
                    textView2.setText(str6);
                    textView = this.A0I;
                }
            } else if (i == 1) {
                this.A0H.setText(r23.A03);
                textView = this.A0I;
                str3 = ((AnonymousClass16V) this.A0a).A02;
            } else {
                textView = this.A0I;
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append(" ");
                str3 = AnonymousClass000.A0q(r23.A02, A0u2);
            }
            textView.setText(str3);
        }
        this.A0H.setText(str3);
        textView = this.A0I;
        getContext();
        AnonymousClass16U r05 = this.A0a;
        C18820ts r24 = this.A0W;
        AnonymousClass16V r06 = (AnonymousClass16V) r05;
        String str7 = r06.A02;
        str3 = r06.A03;
        if (!AnonymousClass6US.A00.contains(str7)) {
            str3 = C90484aE.A0U(C132386Tk.A02, str7).A01(r24);
        }
        textView.setText(str3);
    }

    public void setBankLogo(Bitmap bitmap) {
        if (bitmap != null) {
            this.A1P.setImageBitmap(bitmap);
        } else {
            this.A1P.setImageResource(R.drawable.bank_logo_placeholder);
        }
    }

    public void setPaymentContactContainerVisibility(int i) {
        this.A0A.setVisibility(i);
    }

    public void setPaymentMethodText(String str) {
        this.A1M.setText(A01(this, str, R.string.f12nameremoved));
    }

    public void setPaymentTabsVisibility(int i) {
        this.A0M.setVisibility(i);
    }

    public PaymentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A08();
        this.A1R = new C1497372o(this, 13);
        A02();
    }

    public static SpannableStringBuilder A01(PaymentView paymentView, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String string = paymentView.A0u.B8E().getString(i);
        Object[] A0M2 = AnonymousClass001.A0M();
        C90494aF.A1H(string, str, A0M2);
        SpannableStringBuilder A0P2 = C36441kJ.A0P(String.format("%s %s", A0M2));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(paymentView.A0u.B8E().getResources().getColor(R.color.f6nameremoved));
        int length = string.length();
        int i2 = length + 1;
        A0P2.setSpan(foregroundColorSpan, 0, i2, 0);
        A0P2.setSpan(new ForegroundColorSpan(paymentView.A0u.B8E().getResources().getColor(C224514j.A00(paymentView.A0u.B8E(), R.attr.f4nameremoved, R.color.f6nameremoved))), i2, length + str.length() + 1, 0);
        return A0P2;
    }

    private void A02() {
        int i;
        LayoutInflater A0C2 = C36351kA.A0C(this);
        if (A07(this)) {
            i = R.layout.f9nameremoved;
        } else {
            boolean A002 = AnonymousClass3MR.A00(this.A0i);
            i = R.layout.f9nameremoved;
            if (A002) {
                i = R.layout.f9nameremoved;
            }
        }
        View inflate = A0C2.inflate(i, this, true);
        this.A0H = C36391kE.A0O(inflate, R.id.payment_currency_symbol_prefix);
        this.A0I = C36391kE.A0O(inflate, R.id.payment_currency_symbol_suffix);
        this.A0E = (TextSwitcher) C012005e.A02(inflate, R.id.contact_name);
        ImageView A0G2 = C36401kF.A0G(inflate, R.id.expand_contact_details_button);
        this.A06 = A0G2;
        A0G2.setColorFilter(getResources().getColor(R.color.f6nameremoved));
        this.A0F = C36391kE.A0O(inflate, R.id.contact_aux_info);
        this.A0Q = (ThumbnailButton) C012005e.A02(inflate, R.id.contact_photo);
        this.A1P = (ThumbnailButton) C012005e.A02(inflate, R.id.bank_logo);
        ImageView A0G3 = C36401kF.A0G(inflate, R.id.expand_details_button);
        this.A07 = A0G3;
        A0G3.setColorFilter(getResources().getColor(R.color.f6nameremoved));
        this.A1L = (TextSwitcher) C012005e.A02(inflate, R.id.payment_contact_label);
        this.A0C = C90514aH.A0U(inflate, R.id.payment_method_container);
        this.A1J = C90514aH.A0U(inflate, R.id.payment_contact_container_shimmer);
        this.A1K = C90514aH.A0U(inflate, R.id.payment_method_container_shimmer);
        this.A1N = (ShimmerFrameLayout) C012005e.A02(this.A1J, R.id.payment_method_name_shimmer);
        this.A1O = (ShimmerFrameLayout) C012005e.A02(this.A1K, R.id.payment_method_name_shimmer);
        this.A09 = C90514aH.A0U(inflate, R.id.add_payment_method_container);
        this.A05 = C36441kJ.A0T(inflate, R.id.gift_details);
        this.A0r = (PaymentAmountInputField) C012005e.A02(inflate, R.id.send_payment_amount);
        this.A1M = C36391kE.A0O(inflate, R.id.bank_account_name);
        this.A0G = C36391kE.A0O(inflate, R.id.payments_send_payment_error_text);
        this.A0P = (KeyboardPopupLayout) C012005e.A02(inflate, R.id.send_payment_keyboard_popup_layout);
        C012005e.A02(inflate, R.id.send_payment_amount_error_text_container).setOnClickListener(this);
        this.A0D = C90514aH.A0U(inflate, R.id.send_payment_amount_container);
        this.A0A = C90514aH.A0U(inflate, R.id.payment_contact_container);
        this.A0B = C90514aH.A0U(inflate, R.id.send_payment_details);
        TabLayout tabLayout = (TabLayout) C012005e.A02(inflate, R.id.payment_tabs);
        this.A0M = tabLayout;
        tabLayout.setVisibility(8);
        if (A07(this)) {
            this.A0K = (CoordinatorLayout) C012005e.A02(this, R.id.coordinator);
        }
        int A003 = AnonymousClass00F.A00(getContext(), R.color.f6nameremoved);
        AnonymousClass3UF.A0E(this.A07, A003);
        this.A0S = this.A0T.A05(getContext(), "payment-view");
        AnonymousClass3UF.A0E(C36401kF.A0G(inflate, R.id.add_payment_method_logo), A003);
        KeyboardPopupLayout keyboardPopupLayout = this.A0P;
        Objects.requireNonNull(keyboardPopupLayout);
        keyboardPopupLayout.setKeyboardPopupBackgroundColor(C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        AutoTransition autoTransition = new AutoTransition();
        this.A02 = autoTransition;
        autoTransition.setDuration(100);
        this.A0J = (Group) C012005e.A02(inflate, R.id.expressive_payment_widget_group);
        this.A08 = C36401kF.A0G(inflate, R.id.expressive_theme_background);
        AnonymousClass060 r1 = (AnonymousClass060) C012005e.A02(inflate, R.id.expression_theme_selection);
        this.A0L = r1;
        C48762i0.A00(r1, this, 6);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.A04 = alphaAnimation;
        alphaAnimation.setDuration(500);
        C162657ow.A00(this.A04, this, 6);
        PathInterpolator A004 = C017907q.A00(0.16f, 1.0f, 0.3f, 1.0f);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), 17432577);
        loadAnimation.setInterpolator(A004);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), 17432576);
        loadAnimation2.setInterpolator(A004);
        loadAnimation2.setDuration((long) getResources().getInteger(17694720));
        this.A0E.setOutAnimation(loadAnimation);
        this.A0E.setInAnimation(loadAnimation2);
    }

    public static void A05(AnonymousClass05R r36, PaymentView paymentView) {
        int i;
        LinearLayout linearLayout;
        int ordinal = r36.ordinal();
        PaymentView paymentView2 = paymentView;
        if (ordinal == 0) {
            AnonymousClass7hJ r1 = paymentView2.A0q;
            if (r1 != null) {
                C124965z5 BmR = r1.BmR();
                paymentView2.A0u = BmR.A03;
                paymentView2.A0v = BmR.A08;
                C162067ny r7 = BmR.A02;
                paymentView2.A0t = r7;
                paymentView2.A0m = BmR.A00;
                C124885yx r2 = BmR.A04;
                C120005qo r6 = r2.A04;
                paymentView2.A0a = r6.A01;
                C120015qp r5 = BmR.A06;
                paymentView2.A1G = r5.A01;
                paymentView2.A1C = BmR.A0C;
                paymentView2.A0z = BmR.A0A;
                paymentView2.A19 = BmR.A0B;
                String str = r2.A08;
                String str2 = str;
                paymentView2.A1D = str;
                paymentView2.A1F = BmR.A0D;
                paymentView2.A1H = BmR.A0E;
                paymentView2.A0s = BmR.A01;
                C157457cz r4 = r2.A05;
                paymentView2.A0w = r4;
                paymentView2.A1I = BmR.A07.A00;
                if (Build.VERSION.SDK_INT != 26 || !AnonymousClass3MR.A00(paymentView2.A0i)) {
                    paymentView2.A0u.B8E().setRequestedOrientation(1);
                }
                paymentView2.A0A.setOnClickListener(paymentView2);
                AnonymousClass1AP r12 = paymentView2.A11;
                C19770wU r14 = paymentView2.A17;
                AnonymousClass005 r8 = paymentView2.A18;
                AnonymousClass1BB r11 = paymentView2.A10;
                C19420v0 r10 = paymentView2.A0V;
                AnonymousClass3GT r13 = paymentView2.A12;
                paymentView2.A16 = new C133356Xz(r10, r11, r12, r13, r14, r8);
                if (r13.A01()) {
                    AnonymousClass04J BJ7 = paymentView2.A0u.B8E().BJ7();
                    C68093bK r102 = new C68093bK(paymentView2.A0V, paymentView2.A0i, paymentView2.A15);
                    AnonymousClass00C.A0D(BJ7, 1);
                    C95494lK r103 = (C95494lK) new AnonymousClass04H(r102, BJ7, AnonymousClass04M.A00).A00(C95494lK.class);
                    paymentView2.A13 = r103;
                    paymentView2.A16.A01 = r103;
                    paymentView2.A14 = new AnonymousClass3EH(paymentView2.A0O, r103);
                    paymentView2.A0f.A01((Integer) null);
                }
                C20810yC r29 = paymentView2.A0i;
                AnonymousClass1N2 r35 = paymentView2.A03;
                C19700wN r362 = paymentView2.A0N;
                C21010yW r30 = paymentView2.A0j;
                AnonymousClass1H2 r23 = paymentView2.A0e;
                AnonymousClass1XN r21 = paymentView2.A0d;
                C21060yb r20 = paymentView2.A0U;
                C18820ts r22 = paymentView2.A0W;
                C1261362r r19 = paymentView2.A0b;
                AnonymousClass3L7 r18 = paymentView2.A0l;
                EmojiSearchProvider emojiSearchProvider = paymentView2.A0f;
                C19420v0 r15 = paymentView2.A0V;
                C19890wg r142 = paymentView2.A0y;
                AnonymousClass6O1 r132 = paymentView2.A0c;
                AnonymousClass3HH r122 = paymentView2.A0k;
                C95494lK r112 = paymentView2.A13;
                paymentView2.A0x = new AnonymousClass687(paymentView2.A0u.B8E(), r362, paymentView2.A0P, r20, r15, r22, paymentView2.A0X, r19, r132, r21, r23, emojiSearchProvider, r29, r30, r122, r18, r142, r112, r35);
                boolean z = paymentView2.A1H;
                boolean z2 = paymentView2.A1I;
                if (z) {
                    paymentView2.A07.setOnClickListener(paymentView2);
                    paymentView2.A0C.setOnClickListener(paymentView2);
                    paymentView2.A09.setOnClickListener(paymentView2);
                    i = 0;
                    if (!z2) {
                        linearLayout = paymentView2.A0C;
                    }
                    linearLayout = paymentView2.A09;
                } else {
                    i = 8;
                    paymentView2.A0C.setVisibility(8);
                    linearLayout = paymentView2.A09;
                }
                linearLayout.setVisibility(i);
                C144326s0 r82 = paymentView2.A0s;
                if (r82 != null) {
                    paymentView2.A0F(r82, R.id.payment_note_entry_stub, R.id.payment_note_entry_inflated);
                    MentionableEntry mentionableEntry = r82.A0B;
                    ViewGroup A0O2 = C36411kG.A0O(paymentView2, R.id.mention_attach);
                    AnonymousClass11F r104 = paymentView2.A0m;
                    if (AnonymousClass143.A0G(r104) && !paymentView2.A0Y.A0P(r104)) {
                        mentionableEntry.A0G(A0O2, paymentView2.A0m, false, true, true, false);
                    }
                    String str3 = paymentView2.A1C;
                    if (str3 != null) {
                        mentionableEntry.setMentionableText(str3, paymentView2.A1G);
                    }
                    C36421kH.A12(mentionableEntry, paymentView2, 48);
                    C135066c4 r105 = paymentView2.A0z;
                    if (r105 != null) {
                        r82.A00(r105, paymentView2.A19);
                    }
                    r82.A00 = new C163247pt(mentionableEntry, paymentView2, 1);
                    r82.A0C.A00 = new AnonymousClass9v0(paymentView2, 46);
                }
                View findViewById = paymentView2.findViewById(R.id.gift_icon);
                if (findViewById != null) {
                    findViewById.setOnClickListener(paymentView2);
                }
                paymentView2.A01 = 6;
                paymentView2.A05.setVisibility(8);
                paymentView2.A0F(r2.A03, R.id.send_payment_amount_description_container, R.id.send_payment_amount_description_container_inflated);
                Context context = paymentView2.getContext();
                TabLayout tabLayout = paymentView2.A0M;
                int i2 = BmR.A09.A00;
                if (i2 != 0) {
                    tabLayout.A0B();
                    AnonymousClass6DR A082 = tabLayout.A08();
                    A082.A01(R.string.f12nameremoved);
                    tabLayout.A0H(A082);
                    AnonymousClass6DR A083 = tabLayout.A08();
                    A083.A01(R.string.f12nameremoved);
                    tabLayout.A0H(A083);
                    tabLayout.A0G(paymentView2);
                    AnonymousClass07B supportActionBar = ((AnonymousClass01L) C24801Dv.A00(context)).getSupportActionBar();
                    if (i2 == 1) {
                        paymentView2.A0P.removeView(tabLayout);
                        tabLayout.setElevation(0.0f);
                        if (supportActionBar != null) {
                            supportActionBar.A0X(false);
                            supportActionBar.A0V(true);
                            supportActionBar.A0U(true);
                            supportActionBar.A0O(tabLayout, new C013405v(-1, -1));
                        }
                    } else if (supportActionBar != null) {
                        supportActionBar.A0F(0.0f);
                    }
                    tabLayout.setVisibility(0);
                    AnonymousClass6DR A092 = tabLayout.A09(paymentView2.A00);
                    C18740tg.A06(A092);
                    A092.A00();
                }
                if (paymentView2.A0u.BMe()) {
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    C144326s0 r83 = paymentView2.A0s;
                    if (r83 != null) {
                        A0I2.add(r83.A0B);
                    }
                    AnonymousClass687 r106 = paymentView2.A0x;
                    B1C b1c = r5.A00;
                    PaymentAmountInputField paymentAmountInputField = paymentView2.A0r;
                    Activity activity = r106.A00;
                    AnonymousClass1N2 r152 = r106.A0I;
                    C19700wN r143 = r106.A01;
                    C21060yb r123 = r106.A03;
                    B1C b1c2 = b1c;
                    PaymentAmountInputField paymentAmountInputField2 = paymentAmountInputField;
                    C19700wN r16 = r143;
                    KeyboardPopupLayout keyboardPopupLayout = r106.A02;
                    C21060yb r182 = r123;
                    Activity activity2 = activity;
                    C36331k8.A1Q(new AnonymousClass22s(activity2, r16, keyboardPopupLayout, r182, r106.A04, b1c2, paymentAmountInputField2, r152, A0I2), r106.A0J, 1);
                } else {
                    paymentView2.A0x.A00();
                    paymentView2.A0r.setFocusable(false);
                }
                paymentView2.A0r.setSelection(0);
                paymentView2.A0r.setLongClickable(false);
                PaymentAmountInputField paymentAmountInputField3 = paymentView2.A0r;
                paymentAmountInputField3.A0B = new C147376x7(r7, paymentView2);
                paymentAmountInputField3.setAutoScaleTextSize(r2.A0A);
                PaymentAmountInputField paymentAmountInputField4 = paymentView2.A0r;
                boolean z3 = r2.A0C;
                paymentAmountInputField4.A0D = z3;
                paymentAmountInputField4.setAllowDecimal(r2.A09);
                paymentView2.A0r.A0C = r4;
                paymentView2.A06(r2);
                paymentView2.A0r.A04 = paymentView2.A0D;
                paymentView2.setAmountInputData(r6);
                if (TextUtils.isEmpty(paymentView2.A1B)) {
                    if (!TextUtils.isEmpty(paymentView2.A1E)) {
                        paymentView2.A1B = paymentView2.A1E;
                    } else {
                        String str4 = r2.A06;
                        if (TextUtils.isEmpty(str4)) {
                            str4 = r2.A07;
                            if (TextUtils.isEmpty(str4)) {
                                paymentView2.A1B = "0";
                            }
                        }
                        paymentView2.A1B = str4;
                    }
                }
                if (!TextUtils.isEmpty(paymentView2.A1B)) {
                    String str5 = paymentView2.A1B;
                    if (!"0".equals(str5)) {
                        if (r2.A0B) {
                            if (z3) {
                                str5 = str5.replaceAll(PaymentAmountInputField.A03(paymentView2.A0W), "");
                            }
                            AnonymousClass16X A002 = AnonymousClass16X.A00(str5, ((AnonymousClass16V) paymentView2.A0a).A01);
                            if (A002 != null) {
                                paymentView2.A1B = paymentView2.A0a.B7c(paymentView2.A0W, A002);
                            }
                        }
                        String A0n2 = C36361kB.A0n(paymentView2.A0r);
                        String str6 = paymentView2.A1B;
                        if (!A0n2.equals(str6)) {
                            paymentView2.A0r.setText(str6);
                        }
                    }
                }
                if (!paymentView2.A0u.BMe()) {
                    paymentView2.A0x.A00();
                    paymentView2.A0r.setOnClickListener(new AnonymousClass3YD(11, paymentView2, TextUtils.isEmpty(str2)));
                    paymentView2.A0r.setHintTextColor(AnonymousClass00F.A00(paymentView2.getContext(), C36391kE.A04(paymentView2.getContext())));
                }
                paymentView2.A0r.setHint(paymentView2.A1B);
                if (r2.A07 != null || r2.A06 == null || !paymentView2.A0u.BND()) {
                    View view = paymentView2.A03;
                    if (view == null || view.getId() == -1 || paymentView2.findViewById(paymentView2.A03.getId()) == null) {
                        C164757sK.A00(paymentView2.A0r.getViewTreeObserver(), paymentView2, 18);
                    } else {
                        paymentView2.A0x.A00();
                        paymentView2.findViewById(paymentView2.A03.getId()).requestFocus();
                        View view2 = paymentView2.A03;
                        if (view2 instanceof WaEditText) {
                            ((WaEditText) view2).A0C(true);
                        } else if (view2.onCheckIsTextEditor()) {
                            InputMethodManager A0N2 = paymentView2.A0U.A0N();
                            C18740tg.A06(A0N2);
                            A0N2.showSoftInput(paymentView2.A03, 0);
                        }
                    }
                } else {
                    paymentView2.A0u.B8E().getWindow().setSoftInputMode(3);
                }
                if (!paymentView2.A0r.hasOnClickListeners()) {
                    C36421kH.A12(paymentView2.A0r, paymentView2, 47);
                }
                paymentView2.setInitialTabConfiguration(BmR);
                paymentView2.A0D();
                if (!paymentView2.A0u.BND()) {
                    C122755vN r42 = BmR.A05;
                    if (r42.A03) {
                        paymentView2.A0J.setVisibility(0);
                        AnonymousClass687 r133 = paymentView2.A0x;
                        C29931Yo r17 = r42.A02;
                        C29971Ys r162 = r42.A01;
                        ImageView imageView = paymentView2.A08;
                        AnonymousClass060 r124 = paymentView2.A0L;
                        PaymentAmountInputField paymentAmountInputField5 = paymentView2.A0r;
                        TextView textView = paymentView2.A0H;
                        TextView textView2 = paymentView2.A0I;
                        TextView A0P2 = C36391kE.A0P(paymentView2, R.id.payments_send_payment_error_text);
                        C144326s0 r144 = paymentView2.A0s;
                        C135106c9 r84 = r42.A00;
                        Activity activity3 = r133.A00;
                        AnonymousClass1N2 r62 = r133.A0I;
                        C19700wN r52 = r133.A01;
                        C21060yb r43 = r133.A03;
                        C19420v0 r3 = r133.A04;
                        KeyboardPopupLayout keyboardPopupLayout2 = r133.A02;
                        C21060yb r24 = r43;
                        C19420v0 r25 = r3;
                        AnonymousClass060 r212 = r124;
                        C19700wN r222 = r52;
                        TextView textView3 = textView;
                        TextView textView4 = textView2;
                        Activity activity4 = activity3;
                        ImageView imageView2 = imageView;
                        C100844vw r153 = new C100844vw(activity4, imageView2, textView3, textView4, A0P2, r212, r222, keyboardPopupLayout2, r24, r25, r162, r17, paymentAmountInputField5, r144, r2, r62);
                        if (r84 != null) {
                            r153.Bj3(r84);
                        }
                        C36331k8.A1Q(r153, r133.A0J, 2);
                    }
                }
            }
        } else if (ordinal == 3) {
            C144326s0 r110 = paymentView2.A0s;
            if (r110 != null && r110.A0B.hasFocus()) {
                paymentView2.A0x.A00();
            }
        } else if (ordinal == 2) {
            AnonymousClass687 r26 = paymentView2.A0x;
            C147106wg A003 = NumberEntryKeyboard.A00(paymentView2.A0W);
            HashMap hashMap = r26.A0J;
            Integer A0i2 = C36361kB.A0i();
            if (hashMap.containsKey(A0i2)) {
                C38871qM r27 = (C38871qM) hashMap.get(A0i2);
                if (r27 instanceof AnonymousClass22s) {
                    ((AnonymousClass22s) r27).A01.setCustomKey(A003);
                }
            }
            if (paymentView2.A0r != null && !C36401kF.A0x(paymentView2.A0W).equals(C36401kF.A0x(paymentView2.A0r.A09))) {
                PaymentAmountInputField paymentAmountInputField6 = paymentView2.A0r;
                paymentAmountInputField6.A09 = paymentView2.A0W;
                paymentAmountInputField6.setText((CharSequence) null);
            }
        } else if (ordinal == 5) {
            HashMap hashMap2 = paymentView2.A0x.A0J;
            Iterator A102 = C36371kC.A10(hashMap2);
            while (A102.hasNext()) {
                PopupWindow popupWindow = (PopupWindow) hashMap2.get(AnonymousClass000.A11(A102).getKey());
                if (popupWindow != null && popupWindow.isShowing()) {
                    popupWindow.dismiss();
                }
                A102.remove();
            }
            C133356Xz r111 = paymentView2.A16;
            r111.A0B.unregisterObserver(r111.A09);
            if (!paymentView2.A0u.BND() && ((C179148jG) paymentView2.A0v.A00).A0a != null && paymentView2.A0i.A0E(811)) {
                ((C179148jG) paymentView2.A0v.A00).A0a.A00();
            }
            if (A07(paymentView2)) {
                paymentView2.A0h.A09();
            }
        }
    }

    public void A0H(String str) {
        int i;
        TextView A0P2 = C36391kE.A0P(this, R.id.gift_tool_tip);
        if (C36371kC.A1U(this.A0n.A03(), "payment_incentive_tooltip_viewed") || A0P2 == null || str == null) {
            i = 8;
        } else {
            A0P2.setText(str);
            i = 0;
        }
        A0P2.setVisibility(i);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.expand_details_button || view.getId() == R.id.payment_method_container) {
            this.A0t.BcN();
        } else if (view.getId() == R.id.payment_contact_container) {
            if (this.A00 == 1 || this.A0C.getVisibility() == 0 || !this.A1H) {
                this.A0t.BcM();
                return;
            }
            TransitionManager.beginDelayedTransition(C36411kG.A0P(this, R.id.send_payment_details), this.A02);
            A0C();
        } else if (view.getId() == R.id.send_payment_amount || view.getId() == R.id.send_payment_note) {
            this.A0x.A00();
        } else if (view.getId() == R.id.send_payment_amount_error_text_container) {
            this.A0r.callOnClick();
        } else if (view.getId() == R.id.add_payment_method_container) {
            this.A0t.BQq();
        } else if (view.getId() == R.id.gift_icon) {
            this.A0t.BYe();
            A0H((String) null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0S.A02();
    }

    public void setPaymentAmount(String str) {
        this.A1B = str;
    }

    public PaymentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A08();
        this.A1R = new C1497372o(this, 13);
        A02();
    }

    public PaymentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A08();
        this.A1R = new C1497372o(this, 13);
        A02();
    }

    public PaymentView(Context context) {
        super(context);
        A08();
        this.A1R = new C1497372o(this, 13);
        A02();
    }

    public PaymentView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A08();
    }
}
