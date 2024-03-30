package X;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.ConversationFragment;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.comments.MessageCommentsManager;
import com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView;
import com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2IR  reason: invalid class name */
public abstract class AnonymousClass2IR extends C175108Zr {
    public boolean A00 = false;
    public int A01 = 0;
    public int A02;
    public int A03;
    public int A04;
    public ProgressDialog A05;
    public View A06;
    public ViewGroup A07;
    public ViewGroup A08;
    public FrameLayout A09;
    public ImageView A0A;
    public ImageView A0B;
    public ImageView A0C;
    public LinearLayout A0D;
    public LinearLayout A0E;
    public LinearLayout A0F;
    public TextView A0G;
    public TextView A0H;
    public C011705b A0I;
    public C19460v5 A0J;
    public C19460v5 A0K;
    public C19460v5 A0L;
    public C19460v5 A0M;
    public C19460v5 A0N;
    public C19460v5 A0O;
    public C24801Dv A0P;
    public AnonymousClass30L A0Q;
    public AnonymousClass17Y A0R;
    public C32691e2 A0S;
    public C19730wQ A0T;
    public AnonymousClass1XY A0U;
    public C21100yf A0V;
    public C20050ww A0W;
    public TextEmojiLabel A0X;
    public AnonymousClass3SF A0Y;
    public AnonymousClass1X4 A0Z;
    public C29601Xg A0a;
    public C29591Xf A0b;
    public AnonymousClass9XI A0c;
    public C29461Ws A0d;
    public AnonymousClass9Y1 A0e;
    public C603337l A0f;
    public C199439fJ A0g;
    public AnonymousClass1NG A0h;
    public C29911Yl A0i;
    public AnonymousClass1OF A0j;
    public C19600wD A0k;
    public AnonymousClass16D A0l;
    public AnonymousClass185 A0m;
    public AnonymousClass171 A0n;
    public C235618y A0o;
    public C21159AAt A0p;
    public C33751fs A0q;
    public C63193Jc A0r;
    public AnonymousClass1LL A0s;
    public C194529Qc A0t;
    public AnonymousClass31A A0u;
    public C37511mX A0v;
    public ConversationRowParticipantHeaderMainView A0w;
    public ConversationRowParticipantHeaderQuotedView A0x;
    public AnonymousClass3CP A0y;
    public AnonymousClass3NN A0z;
    public AnonymousClass31G A10;
    public AnonymousClass36R A11;
    public AnonymousClass3CR A12;
    public C61743Dg A13;
    public AnonymousClass380 A14;
    public C199009eY A15;
    public C194889Rq A16;
    public C201709k9 A17;
    public C40011uY A18;
    public C19970wo A19;
    public AnonymousClass17Z A1A;
    public C19420v0 A1B;
    public AnonymousClass1A5 A1C;
    public C20310xM A1D;
    public AnonymousClass1TW A1E;
    public AnonymousClass17X A1F;
    public AnonymousClass1VZ A1G;
    public C32731e6 A1H;
    public AnonymousClass1TV A1I;
    public AnonymousClass16E A1J;
    public C26171Jd A1K;
    public C27751Pr A1L;
    public AnonymousClass1H2 A1M;
    public AnonymousClass184 A1N;
    public C20500xf A1O;
    public C25361Fz A1P;
    public C20350xQ A1Q;
    public AnonymousClass1EL A1R;
    public AnonymousClass1CF A1S;
    public C27251Nm A1T;
    public AnonymousClass1DU A1U;
    public AnonymousClass1D5 A1V;
    public AnonymousClass1E2 A1W;
    public C28371Sj A1X;
    public AnonymousClass19I A1Y;
    public AnonymousClass19A A1Z;
    public AnonymousClass3O0 A1a;
    public C26191Jf A1b;
    public AnonymousClass1C4 A1c;
    public AnonymousClass1JN A1d;
    public AnonymousClass3EA A1e;
    public AnonymousClass1J1 A1f;
    public AnonymousClass1TF A1g;
    public A8P A1h;
    public C28441Sr A1i;
    public C33481fQ A1j;
    public C19890wg A1k;
    public AnonymousClass1BF A1l;
    public AnonymousClass6WF A1m;
    public C23871Ae A1n;
    public AnonymousClass1AW A1o;
    public C199859g8 A1p;
    public AnonymousClass3DP A1q;
    public AnonymousClass1HA A1r;
    public AnonymousClass1YD A1s;
    public AnonymousClass1A1 A1t;
    public AnonymousClass1C6 A1u;
    public AnonymousClass1E9 A1v;
    public C32681e1 A1w;
    public C32711e4 A1x;
    public AnonymousClass1SV A1y;
    public AnonymousClass13J A1z;
    public AnonymousClass1RJ A20;
    public C19770wU A21;
    public AnonymousClass1T2 A22;
    public AnonymousClass005 A23;
    public AnonymousClass005 A24;
    public AnonymousClass005 A25;
    public AnonymousClass005 A26;
    public AnonymousClass005 A27;
    public AnonymousClass005 A28;
    public AnonymousClass005 A29;
    public AnonymousClass005 A2A;
    public AnonymousClass005 A2B;
    public AnonymousClass005 A2C;
    public AnonymousClass005 A2D;
    public AnonymousClass005 A2E;
    public Runnable A2F;
    public Runnable A2G;
    public boolean A2H;
    public boolean A2I = false;
    public boolean A2J = false;
    public boolean A2K;
    public boolean A2L = false;
    public boolean A2M = true;
    public int A2N = 0;
    public View A2O;
    public TextView A2P;
    public TextView A2Q;
    public TextEmojiLabel A2R;
    public TextEmojiLabel A2S;
    public WaTextView A2T;
    public ImageView A2U;
    public ImageView A2V;
    public final View.OnLongClickListener A2W = new C89564Xa(this, 6);
    public final AnonymousClass3CO A2X = new AnonymousClass3CO(this);
    public final C87184Nu A2Y = new C70553fL(this);
    public final View.OnClickListener A2Z = new C66953Xy(this, 22);
    public final Runnable A2a = C80233v4.A00(this, 6);
    public final View.OnKeyListener A2b = new AnonymousClass4ZW(this, 2);

    public static void A0V(View view, C225314u r5, AnonymousClass2IR r6, UserJid userJid) {
        AnonymousClass2IR r0 = r6;
        if (view != null) {
            r0 = view;
        }
        AnonymousClass11F r2 = null;
        C64713Pd r1 = new C64713Pd(r0, (AnonymousClass11F) userJid, (Integer) null);
        int i = 1;
        if (view != null) {
            i = 2;
        }
        r1.A00 = i;
        if (r6.getFMessage().A1J.A00 instanceof GroupJid) {
            r2 = r6.getFMessage().A1J.A00;
        }
        r1.A01 = r2;
        r1.A02(r5);
    }

    public int A18() {
        return Math.max(0, super.A18());
    }

    public C63663Kx A1T(AnonymousClass3T1 r6) {
        C19770wU r2;
        C35651j2 r1;
        if (r6 == null) {
            return null;
        }
        if (C36401kF.A1Z(this.A0G)) {
            if (AnonymousClass000.A1S(r6.A0A & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING, EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)) {
                MessageCommentsManager messageCommentsManager = (MessageCommentsManager) this.A0i;
                r2 = messageCommentsManager.A04;
                r1 = new C35651j2(messageCommentsManager, r6, (C009003v) null, 17);
            } else if (r6.A1R(16)) {
                MessageCommentsManager messageCommentsManager2 = (MessageCommentsManager) this.A0i;
                r2 = messageCommentsManager2.A04;
                r1 = new C35651j2(messageCommentsManager2, r6);
            }
            r2.Boy(r1);
        }
        return r6.A0P();
    }

    public void A1Y() {
        A0d(this, false);
    }

    public void A1Z() {
    }

    public void A1b() {
    }

    public void A1d() {
    }

    public void A1f() {
    }

    public void A1h(int i) {
        int i2;
        ImageView imageView = this.A2V;
        if (i == 1) {
            if (imageView == null) {
                this.A2V = C36361kB.A0L(this);
                LinearLayout.LayoutParams A0N2 = C36371kC.A0N();
                A0N2.gravity = 16;
                A0Y(A0N2, this.A07, this.A2V, R.string.f12nameremoved, C36371kC.A02(this), 2);
            }
            AnonymousClass2IQ.A0O(getContext(), this.A2V, this, 2);
            imageView = this.A2V;
            i2 = 0;
        } else if (imageView != null) {
            i2 = 8;
        } else {
            return;
        }
        imageView.setVisibility(i2);
    }

    public void A1i(int i, boolean z) {
        ImageView imageView;
        ScaleAnimation A0M2;
        if (i == 0) {
            imageView = this.A0B;
        } else if (i != 1) {
            imageView = this.A2V;
        } else {
            imageView = this.A2U;
        }
        if (imageView != null) {
            if (z) {
                A0M2 = C36391kE.A0M(0.0f, 1.0f);
                A0M2.setInterpolator(new OvershootInterpolator());
                imageView.getViewTreeObserver().addOnPreDrawListener(new C89904Yi(imageView, i, 0, this));
            } else {
                A0M2 = C36391kE.A0M(1.0f, 0.0f);
                imageView.setVisibility(0);
                C89214Vr.A00(A0M2, this, imageView, 8);
                if (!this.A0d.BLu(getFMessage()) || i != 2) {
                    A0M2.setInterpolator(new AnticipateInterpolator());
                }
            }
            A0M2.setDuration(500);
            imageView.startAnimation(A0M2);
        }
    }

    public void A1j(int i, boolean z) {
        int i2;
        C29601Xg r3 = this.A0a;
        AnonymousClass3T1 fMessage = getFMessage();
        boolean A012 = r3.A01.A00().A01(fMessage.A1J.A00);
        if (C29591Xf.A00(fMessage, 68)) {
            r3.A04.execute(new C80413vM(r3, fMessage, z, A012));
        } else {
            C29601Xg.A00(r3, fMessage, (Runnable) null, 68, false, A012);
        }
        ImageView imageView = this.A2U;
        if (1 == i) {
            if (imageView == null) {
                this.A2U = C36361kB.A0L(this);
                LinearLayout.LayoutParams A0N2 = C36371kC.A0N();
                A0N2.gravity = 16;
                A0Y(A0N2, this.A07, this.A2U, R.string.f12nameremoved, C36371kC.A02(this), 1);
            }
            AnonymousClass2IQ.A0O(getContext(), this.A2U, this, 1);
            imageView = this.A2U;
            i2 = 0;
        } else if (imageView != null) {
            i2 = 8;
        } else {
            return;
        }
        imageView.setVisibility(i2);
    }

    public void A1n(View view, C46852bm r13, boolean z) {
        C46852bm r5 = r13;
        UserJid userJid = r13.A01;
        if (userJid == null) {
            this.A0R.A06(R.string.f12nameremoved, 0);
            return;
        }
        AnonymousClass9Y1 r1 = this.A0e;
        int i = 3;
        boolean z2 = z;
        if (z) {
            i = 14;
        }
        r1.A01(i);
        boolean A0M2 = this.A0T.A0M(userJid);
        View view2 = view;
        AnonymousClass3SM.A02(getContext(), view2, this.A0c, this.A0d, this.A0g, r5, this.A1y, 1, z2, A0M2, A0M2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        if (r1.A02 == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a9, code lost:
        if (r0 != null) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1o(android.view.ViewGroup r13, android.widget.TextView r14, X.AnonymousClass3T1 r15) {
        /*
            r12 = this;
            r11 = 0
            r5 = r12
            if (r14 == 0) goto L_0x0015
            r14.setVisibility(r11)
            X.0ts r1 = r12.A0E
            X.0wo r0 = r12.A19
            X.AnonymousClass3T1.A07(r14, r0, r1, r15)
            int r0 = r12.getBroadcastDrawableId()
            r12.A1q(r14, r15, r0)
        L_0x0015:
            if (r13 == 0) goto L_0x00d4
            r13.setVisibility(r11)
            boolean r0 = r12 instanceof X.AnonymousClass2IM
            if (r0 != 0) goto L_0x00d4
            int r1 = r15.A0E()
            r0 = 1
            r12.A1j(r1, r0)
            X.5J2 r0 = r15.A1V
            if (r0 != 0) goto L_0x011a
            r0 = 0
        L_0x002b:
            r12.A1h(r0)
            boolean r1 = r15.A15
            android.widget.ImageView r0 = r12.A0B
            if (r1 == 0) goto L_0x0115
            if (r0 != 0) goto L_0x0052
            android.widget.ImageView r0 = X.C36361kB.A0L(r12)
            r12.A0B = r0
            android.widget.LinearLayout$LayoutParams r6 = X.C36371kC.A0N()
            r0 = 16
            r6.gravity = r0
            android.widget.ImageView r8 = r12.A0B
            r9 = 2131894475(0x7f1220cb, float:1.9423756E38)
            int r10 = X.C36371kC.A02(r12)
            android.view.ViewGroup r7 = r12.A07
            r5.A0Y(r6, r7, r8, r9, r10, r11)
        L_0x0052:
            android.widget.ImageView r1 = r12.A0B
            android.content.Context r0 = r12.getContext()
            X.AnonymousClass2IQ.A0O(r0, r1, r12, r11)
            android.widget.ImageView r0 = r12.A0B
            r0.setVisibility(r11)
        L_0x0060:
            X.0yC r1 = r12.A0G
            X.AnonymousClass00C.A0D(r1, r11)
            r0 = 4873(0x1309, float:6.829E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x007d
            X.1CF r2 = r12.A1S
            X.3Qa r1 = r15.A1J
            X.11F r0 = r1.A00
            boolean r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x010e
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x010e
        L_0x007d:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            int r0 = r15.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x010e
            android.widget.LinearLayout r0 = r12.A0F
            r3 = 0
            if (r0 != 0) goto L_0x00a7
            android.view.LayoutInflater r1 = X.C36351kA.A0C(r12)
            r0 = 2131626560(0x7f0e0a40, float:1.888036E38)
            android.view.View r2 = X.C36431kI.A0J(r1, r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r12.A0F = r2
            android.view.ViewGroup r1 = r12.A07
            android.widget.TextView r0 = r12.A0G
            int r0 = r1.indexOfChild(r0)
            r1.addView(r2, r0)
        L_0x00a7:
            android.widget.LinearLayout r0 = r12.A0F
            if (r0 == 0) goto L_0x00ae
        L_0x00ab:
            r0.setVisibility(r3)
        L_0x00ae:
            X.3Qa r0 = r15.A1J
            X.11F r1 = r0.A00
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x00d4
            r12.getRowCustomizer()
            X.12q r0 = r12.A0F
            X.3Qp r2 = r0.A09(r1, r11)
            X.2La r2 = (X.C44072La) r2
            X.3A4 r1 = r15.A0Z()
            X.1RJ r4 = r12.A20
            if (r4 == 0) goto L_0x00d4
            boolean r0 = X.C66013Ui.A0n(r15)
            if (r0 == 0) goto L_0x00d5
            r0 = 8
        L_0x00d1:
            r4.A03(r0)
        L_0x00d4:
            return
        L_0x00d5:
            if (r2 == 0) goto L_0x00d4
            if (r1 == 0) goto L_0x00d4
            X.005 r0 = r12.A2B
            java.lang.Object r0 = r0.get()
            X.1GQ r0 = (X.AnonymousClass1GQ) r0
            boolean r0 = X.C65903Tx.A07(r2, r0)
            if (r0 == 0) goto L_0x00d4
            android.widget.TextView r3 = X.C36441kJ.A0V(r4)
            X.0ts r2 = r12.A0E
            X.005 r0 = r12.A2D
            java.lang.Object r0 = r0.get()
            X.3Ov r0 = (X.C64633Ov) r0
            X.C36321k7.A0x(r2, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.C65903Tx.A03(r2, r0, r15)
            r1.append(r0)
            java.lang.String r0 = " • "
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r3.setText(r0)
            r0 = 0
            goto L_0x00d1
        L_0x010e:
            android.widget.LinearLayout r0 = r12.A0F
            if (r0 == 0) goto L_0x00ae
            r3 = 8
            goto L_0x00ab
        L_0x0115:
            X.C36341k9.A0y(r0)
            goto L_0x0060
        L_0x011a:
            int r0 = r0.A00
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IR.A1o(android.view.ViewGroup, android.widget.TextView, X.3T1):void");
    }

    public void A1r(TextView textView, Integer num, List list, long j) {
        Integer valueOf = Integer.valueOf(list.hashCode());
        textView.setTag(valueOf);
        this.A21.Bp6(new C1499573k(this, list, textView, num, valueOf, 1, j), "conversation_row_byte_to_download");
    }

    public void A1u(AnonymousClass11F r1) {
    }

    public void A23(AnonymousClass3T1 r2, boolean z) {
        A22(r2, true);
    }

    public boolean A26() {
        return false;
    }

    public boolean A27() {
        return true;
    }

    public boolean A28() {
        return true;
    }

    public int getMessageCount() {
        return 1;
    }

    public void setMessageText(String str, TextEmojiLabel textEmojiLabel, AnonymousClass3T1 r9) {
        A1s(textEmojiLabel, r9, str, true, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01c0, code lost:
        if (r21 != null) goto L_0x0180;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2IR(android.content.Context r20, X.C89004Uw r21, X.AnonymousClass3T1 r22) {
        /*
            r19 = this;
            r1 = r19
            r9 = r20
            r3 = r21
            r2 = r22
            r1.<init>(r9, r3, r2)
            r4 = 0
            r1.A00 = r4
            r1.A01 = r4
            r1.A2N = r4
            r0 = 1
            r1.A2M = r0
            r1.A2I = r4
            r10 = 6
            X.4Xa r0 = new X.4Xa
            r0.<init>(r1, r10)
            r1.A2W = r0
            r8 = 2
            X.4ZW r0 = new X.4ZW
            r0.<init>(r1, r8)
            r1.A2b = r0
            r1.A2J = r4
            r1.A2L = r4
            X.3fL r0 = new X.3fL
            r0.<init>(r1)
            r1.A2Y = r0
            X.3CO r0 = new X.3CO
            r0.<init>(r1)
            r1.A2X = r0
            X.3v4 r0 = X.C80233v4.A00(r1, r10)
            r1.A2a = r0
            r4 = 22
            X.3Xy r0 = new X.3Xy
            r0.<init>(r1, r4)
            r1.A2Z = r0
            r4 = 1
            r0 = 0
            if (r21 == 0) goto L_0x0056
            int r5 = r3.getContainerType()
            boolean r5 = X.AnonymousClass000.A1S(r5, r8)
            r1.A0O = r5
        L_0x0056:
            X.0yC r7 = r1.A0G
            X.0yV r6 = X.C21000yV.A01
            r5 = 4093(0xffd, float:5.736E-42)
            boolean r5 = X.C20800yB.A01(r6, r7, r5)
            r1.A2J = r5
            X.1EL r6 = r1.A1R
            X.3Qa r5 = r2.A1J
            X.11F r5 = r5.A00
            boolean r5 = r6.A02(r5)
            r1.A2K = r5
            X.4Ux r7 = r1.A0d
            int r5 = r1.getUserNameInGroupLayoutOption()
            int r11 = r7.BFD(r5)
            r5 = -1
            if (r11 == r5) goto L_0x0096
            X.3T1 r6 = r1.getFMessage()
            boolean r5 = r1.A0O
            boolean r5 = r1.A2B(r6, r5)
            if (r5 == 0) goto L_0x0096
            r5 = 2131429238(0x7f0b0776, float:1.8480143E38)
            android.view.ViewStub r5 = X.C36431kI.A0M(r1, r5)
            if (r5 == 0) goto L_0x021e
            r5.setLayoutResource(r11)
            r5.inflate()
        L_0x0096:
            r1.setClipToPadding(r0)
            r1.setClipChildren(r0)
            int r11 = r7.B8z(r9)
            android.content.res.Resources r6 = r1.getResources()
            r5 = 2131167728(0x7f0709f0, float:1.7949738E38)
            int r9 = r6.getDimensionPixelSize(r5)
            boolean r5 = r1.A0O
            if (r5 == 0) goto L_0x01c7
            android.content.res.Resources r6 = X.C36341k9.A0F(r1)
            r5 = 2131165303(0x7f070077, float:1.794482E38)
            int r5 = r6.getDimensionPixelSize(r5)
            r1.setPadding(r0, r5, r0, r5)
        L_0x00bd:
            X.1lO r5 = new X.1lO
            r5.<init>(r1)
            r1.setBackground(r5)
            r5 = 2131432003(0x7f0b1243, float:1.8485751E38)
            android.view.View r6 = r1.findViewById(r5)
            if (r6 == 0) goto L_0x00d5
            X.1RJ r5 = new X.1RJ
            r5.<init>(r6)
            r1.A20 = r5
        L_0x00d5:
            r5 = 2131429373(0x7f0b07fd, float:1.8480417E38)
            android.widget.TextView r5 = X.C36391kE.A0P(r1, r5)
            r1.A0G = r5
            r5 = 2131434239(0x7f0b1aff, float:1.8490286E38)
            android.widget.ImageView r5 = X.C36391kE.A0N(r1, r5)
            r1.A0C = r5
            boolean r5 = r1.A0O
            r8 = 0
            if (r5 != 0) goto L_0x01c3
            int r5 = r1.getUserNameViewId()
            android.view.View r5 = r1.findViewById(r5)
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r5 = (com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView) r5
            r1.A0w = r5
        L_0x00f8:
            r5 = 2131429394(0x7f0b0812, float:1.848046E38)
            android.view.ViewGroup r5 = X.C36411kG.A0P(r1, r5)
            r1.A07 = r5
            int r5 = r1.getProfilePictureFullWidth()
            r1.A03 = r5
            boolean r5 = r7.Btx()
            r6 = 2131166734(0x7f07060e, float:1.7947722E38)
            if (r5 == 0) goto L_0x0113
            r6 = 2131166729(0x7f070609, float:1.7947712E38)
        L_0x0113:
            boolean r18 = r7.Btw()
            boolean r5 = r7.Bty()
            if (r5 == 0) goto L_0x014e
            X.30L r5 = r1.A0Q
            boolean r17 = r1.A28()
            int r16 = X.C36371kC.A03(r1, r6)
            X.1Qd r5 = r5.A00
            X.0tq r6 = r5.A01
            X.0wG r13 = X.C36351kA.A0W(r6)
            X.0yC r14 = X.C36341k9.A0V(r6)
            X.0wQ r9 = X.C36351kA.A0N(r6)
            X.0wU r15 = X.C36341k9.A0Z(r6)
            X.16D r10 = X.C36341k9.A0R(r6)
            X.1Qc r5 = r5.A02
            X.396 r12 = X.C27861Qc.A0T(r5)
            X.1Ps r11 = X.C36361kB.A0W(r6)
            X.1uY r8 = new X.1uY
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x014e:
            r1.A18 = r8
            A0d(r1, r0)
            boolean r5 = r1.A25()
            if (r5 == 0) goto L_0x0161
            r1.setLongClickable(r4)
            android.view.View$OnLongClickListener r5 = r1.A2W
            r1.setOnLongClickListener(r5)
        L_0x0161:
            X.4Uw r5 = r1.A0c
            if (r5 == 0) goto L_0x01b4
            boolean r5 = r5.BK6()
            if (r5 == 0) goto L_0x01b4
            boolean r5 = r1.A27()
            if (r5 == 0) goto L_0x01b4
            r1.A1a()
            X.1mX r5 = r1.A0v
            X.C18740tg.A06(r3)
            boolean r0 = r3.BMT(r2)
            r5.setRowSelected(r0)
        L_0x0180:
            X.1uY r0 = r1.A18
            if (r0 == 0) goto L_0x01a6
            X.08S r5 = r0.A02
            X.012 r2 = r3.getLifecycleOwner()
            r0 = 27
            X.C88554Td.A00(r2, r5, r1, r0)
            X.0yC r2 = r1.A0G
            r0 = 3574(0xdf6, float:5.008E-42)
            boolean r0 = r2.A0E(r0)
            X.1uY r2 = r1.A18
            if (r0 == 0) goto L_0x01ae
            java.util.Objects.requireNonNull(r2)
            r0 = 7
            X.3v4 r0 = X.C80233v4.A00(r2, r0)
            r1.post(r0)
        L_0x01a6:
            X.1fQ r0 = new X.1fQ
            r0.<init>()
            r1.A1j = r0
            return
        L_0x01ae:
            X.00s r0 = r2.A04
            X.C36341k9.A18(r0, r4)
            goto L_0x01a6
        L_0x01b4:
            android.view.View r2 = r1.A05
            X.C36341k9.A0y(r2)
            X.1mX r2 = r1.A0v
            if (r2 == 0) goto L_0x01c0
            r2.setRowSelected(r0)
        L_0x01c0:
            if (r21 == 0) goto L_0x01a6
            goto L_0x0180
        L_0x01c3:
            r1.A0w = r8
            goto L_0x00f8
        L_0x01c7:
            int r5 = r2.A0D
            if (r5 != r10) goto L_0x01f3
            int r6 = r2.A1I
            r5 = 8
            if (r6 == r5) goto L_0x01f3
            X.9Ui r5 = r1.A09
            android.graphics.Rect r8 = r5.A02(r8)
            int r5 = r8.top
            int r9 = r9 + r5
            android.content.res.Resources r5 = r1.getResources()
            r6 = 2131166200(0x7f0703f8, float:1.7946639E38)
            int r5 = r5.getDimensionPixelSize(r6)
            int r9 = r9 - r5
            int r5 = r8.bottom
            int r11 = r11 + r5
            int r5 = X.C36371kC.A03(r1, r6)
            int r11 = r11 - r5
            r1.setPadding(r0, r9, r0, r11)
            goto L_0x00bd
        L_0x01f3:
            X.9Ui r6 = r1.A09
            int r5 = r1.A0a
            android.graphics.Rect r8 = r6.A02(r5)
            X.0ts r6 = r1.A0E
            int r5 = r8.top
            int r9 = r9 + r5
            int r5 = r8.bottom
            int r11 = r11 + r5
            r14 = 0
            r16 = 0
            r12 = r1
            r13 = r6
            r15 = r9
            r17 = r11
            X.AnonymousClass1JZ.A07(r12, r13, r14, r15, r16, r17)
            android.content.res.Resources r6 = r1.getResources()
            r5 = 2131166100(0x7f070394, float:1.7946436E38)
            int r5 = X.C36441kJ.A05(r6, r5)
            r1.setMinimumHeight(r5)
            goto L_0x00bd
        L_0x021e:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r5 = "ConversationRow/setUpUserNameInGroupView/You need to add conversation_row_participant_header_view_stub in your new msg xml file. Msg type = "
            r6.append(r5)
            X.3T1 r5 = r1.getFMessage()
            int r5 = r5.A1I
            java.lang.String r5 = X.C36381kD.A10(r6, r5)
            X.C18740tg.A0D(r0, r5)
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IR.<init>(android.content.Context, X.4Uw, X.3T1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        if (r1 == -1) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0U(int r16) {
        /*
            r15 = this;
            X.4Uw r0 = r15.A0c
            if (r0 == 0) goto L_0x0080
            r15.getRowCustomizer()
            X.3Tm r2 = r15.A0A
            int r1 = r0.getContainerType()
            X.3T1 r0 = r15.getFMessage()
            boolean r0 = r2.A05(r0, r1)
            if (r0 == 0) goto L_0x0080
            android.widget.RelativeLayout r0 = r15.A06
            if (r0 != 0) goto L_0x002e
            android.content.Context r1 = r15.getContext()
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            r0.<init>(r1)
            r15.A06 = r0
            r15.addView(r0)
            android.widget.RelativeLayout r0 = r15.A06
            r0.bringToFront()
        L_0x002e:
            X.4Uq r6 = r15.getMessageReactions()
            X.3Kx r4 = r15.getMessageCommentInfo()
            X.3Tm r7 = r15.A0A
            android.widget.RelativeLayout r5 = r15.A06
            X.3T1 r8 = r15.getFMessage()
            if (r6 != 0) goto L_0x004b
            X.0wQ r1 = r15.A0T
            java.util.List r0 = java.util.Collections.emptyList()
            X.3cm r6 = new X.3cm
            r6.<init>(r1, r0)
        L_0x004b:
            boolean r14 = r15.A1F()
            X.4Ux r11 = r15.getRowCustomizer()
            r0 = 28
            r1 = r16
            if (r1 == r0) goto L_0x005d
            r0 = -1
            r10 = 0
            if (r1 != r0) goto L_0x005e
        L_0x005d:
            r10 = 1
        L_0x005e:
            r1 = 3
            X.3v4 r9 = X.C80233v4.A00(r15, r1)
            r0 = 4
            X.3v4 r2 = X.C80233v4.A00(r15, r0)
            r0 = 5
            X.3v4 r13 = X.C80233v4.A00(r15, r0)
            X.C36321k7.A0w(r5, r8)
            X.AnonymousClass00C.A0D(r11, r1)
        L_0x0073:
            X.C65793Tm.A01(r5, r6, r7, r8, r9, r10)
            X.C65793Tm.A03(r5, r7, r4, r2)
            r9 = r5
            r10 = r7
            r12 = r8
            X.C65793Tm.A02(r9, r10, r11, r12, r13, r14)
        L_0x007f:
            return
        L_0x0080:
            android.widget.RelativeLayout r5 = r15.A06
            if (r5 == 0) goto L_0x007f
            X.3Tm r7 = r15.A0A
            X.3T1 r8 = r15.getFMessage()
            X.0wQ r1 = r15.A0T
            java.util.List r0 = java.util.Collections.emptyList()
            X.3cm r6 = new X.3cm
            r6.<init>(r1, r0)
            r4 = 0
            boolean r14 = r15.A1F()
            r1 = 1
            X.4Ux r11 = r15.getRowCustomizer()
            r10 = 0
            X.3v4 r9 = X.C80233v4.A00(r15, r10)
            X.3v4 r2 = X.C80233v4.A00(r15, r1)
            r0 = 2
            X.3v4 r13 = X.C80233v4.A00(r15, r0)
            X.C36341k9.A1E(r8, r1, r11)
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IR.A0U(int):void");
    }

    public static void A0W(View view, AnonymousClass2IR r2) {
        view.setOnLongClickListener(r2.A2W);
    }

    public static void A0c(AnonymousClass2IR r5) {
        C89004Uw r3;
        Runnable runnable = r5.A2F;
        if (runnable != null) {
            runnable.run();
            return;
        }
        AnonymousClass3T1 fMessage = r5.getFMessage();
        if (C18860tw.A00(r5.getContext()) != null && (r3 = r5.A0c) != null) {
            if (C66013Ui.A0W(r5.A0V, r5.A0G, fMessage, r5.A1o)) {
                r3.B7f(fMessage);
            } else {
                r5.A0R.A04(R.string.f12nameremoved, 1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0382, code lost:
        if (r5 != 0) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (r3 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02a5, code lost:
        if (r5 != 0) goto L_0x02a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0d(X.AnonymousClass2IR r16, boolean r17) {
        /*
            r1 = r16
            X.3T1 r14 = r1.getFMessage()
            r0 = 0
            if (r17 == 0) goto L_0x000e
            r1.A1C()
            r1.A2L = r0
        L_0x000e:
            int r2 = r14.A08
            if (r2 == 0) goto L_0x0050
            X.3T1 r2 = r1.getFMessage()
            r6 = 8
            int r2 = r2.A08
            r2 = r2 & 8
            boolean r2 = X.AnonymousClass000.A1S(r2, r6)
            if (r2 == 0) goto L_0x0050
            boolean r2 = r1.A2L
            if (r2 != 0) goto L_0x0050
            X.0yC r3 = r1.A0G
            r2 = 4900(0x1324, float:6.866E-42)
            boolean r2 = r3.A0E(r2)
            if (r2 == 0) goto L_0x0050
            X.3T1 r5 = r1.getFMessage()
            X.5J2 r3 = r5.A1V
            r4 = 1
            if (r3 == 0) goto L_0x004e
            int r2 = r3.A00
            if (r2 != r4) goto L_0x004e
            X.0wo r2 = r1.A19
            boolean r2 = r3.A1f(r2)
            if (r2 == 0) goto L_0x004e
            r2 = 0
            r5.A1V = r2
            int r3 = r5.A08
            int r2 = ~r6
            r2 = r2 & r3
            r5.A08 = r2
        L_0x004e:
            r1.A2L = r4
        L_0x0050:
            X.3Qa r2 = r14.A1J
            r1.setTag(r2)
            X.1uY r6 = r1.A18
            if (r6 == 0) goto L_0x006b
            X.00s r5 = r6.A07
            X.3T1 r3 = X.C36431kI.A0r(r5)
            if (r3 == r14) goto L_0x006b
            if (r3 == 0) goto L_0x0627
            X.3Qa r3 = r3.A1J
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0627
        L_0x006b:
            boolean r3 = r1.A2A(r14)
            if (r3 == 0) goto L_0x0132
            X.3T1 r4 = r1.getFMessage()
            X.3T1 r6 = r4.A0S()
            if (r6 == 0) goto L_0x0620
            int r5 = r6.A1I
            r3 = 99
            if (r5 > r3) goto L_0x0620
            if (r5 < 0) goto L_0x0620
            android.view.ViewGroup r3 = r1.A08
            if (r3 != 0) goto L_0x0092
            r3 = 2131433098(0x7f0b168a, float:1.8487972E38)
            android.view.ViewGroup r3 = X.C36411kG.A0P(r1, r3)
            r1.A08 = r3
            if (r3 == 0) goto L_0x0132
        L_0x0092:
            r3.setVisibility(r0)
            android.widget.FrameLayout r3 = r1.A09
            r5 = 1
            if (r3 != 0) goto L_0x00f9
            android.content.Context r10 = r1.getContext()
            X.0yC r7 = r1.A0G
            X.AnonymousClass00C.A0D(r10, r0)
            X.AnonymousClass00C.A0D(r7, r5)
            r9 = 2131625992(0x7f0e0808, float:1.8879208E38)
            android.view.ViewGroup r8 = r1.A08
            r3 = 3783(0xec7, float:5.301E-42)
            int r7 = r7.A07(r3)
            if (r7 == r5) goto L_0x0612
            r3 = 2
            if (r7 == r3) goto L_0x0612
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r10)
            android.view.View r8 = r3.inflate(r9, r8, r5)
        L_0x00be:
            r3 = 2131433097(0x7f0b1689, float:1.848797E38)
            android.widget.FrameLayout r7 = X.C36441kJ.A0T(r8, r3)
            r1.A09 = r7
            android.graphics.drawable.Drawable r3 = r1.getInnerFrameForegroundDrawable()
            r7.setForeground(r3)
            r3 = 2131433110(0x7f0b1696, float:1.8487996E38)
            android.view.View r7 = X.C012005e.A02(r8, r3)
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView r7 = (com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView) r7
            r1.A0x = r7
            r3 = 2131433109(0x7f0b1695, float:1.8487994E38)
            android.widget.TextView r9 = X.C36391kE.A0P(r7, r3)
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView r7 = r1.A0x
            r3 = 2131433095(0x7f0b1687, float:1.8487966E38)
            android.widget.TextView r8 = X.C36391kE.A0P(r7, r3)
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView r7 = r1.A0x
            r3 = 2131433106(0x7f0b1692, float:1.8487988E38)
            android.widget.TextView r7 = X.C36391kE.A0P(r7, r3)
            float r3 = r1.getNameInGroupTextFontSize()
            X.C36421kH.A17(r9, r8, r7, r3)
        L_0x00f9:
            X.4V7 r3 = X.AnonymousClass3SS.A02(r1)
            if (r3 == 0) goto L_0x0116
            X.155 r9 = r3.BoP()
            android.widget.FrameLayout r3 = r1.A09
            r12 = 0
            X.2iB r7 = new X.2iB
            r8 = r1
            r10 = r4
            r11 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            r3.setOnClickListener(r7)
            android.widget.FrameLayout r3 = r1.A09
            A0W(r3, r1)
        L_0x0116:
            X.3Qa r3 = r4.A1J
            X.11F r4 = r3.A00
            boolean r3 = r3.A02
            X.3JO r7 = new X.3JO
            r7.<init>(r4, r3, r5)
            X.9g8 r3 = r1.A1p
            boolean r3 = r3.A03(r6)
            if (r3 == 0) goto L_0x0605
            X.9g8 r5 = r1.A1p
            android.widget.FrameLayout r4 = r1.A09
            X.9k9 r3 = r1.A17
            r5.A01(r4, r3, r6, r7)
        L_0x0132:
            X.32g r15 = r1.getFailedMessageBundle()
            java.util.List r3 = r15.A00
            int r3 = r3.size()
            boolean r5 = X.AnonymousClass000.A1R(r3)
            r3 = 0
            android.widget.ImageView r4 = r1.A0A
            if (r5 == 0) goto L_0x05f5
            if (r4 != 0) goto L_0x01af
            android.widget.ImageView r5 = X.C36361kB.A0L(r1)
            r1.A0A = r5
            r4 = 2131430232(0x7f0b0b58, float:1.848216E38)
            r5.setId(r4)
            android.widget.ImageView r6 = r1.A0A
            android.content.Context r5 = r1.getContext()
            r4 = 2131891072(0x7f121380, float:1.9416854E38)
            X.C36331k8.A0q(r5, r6, r4)
            android.widget.ImageView r4 = r1.A0A
            X.C33521fV.A02(r4)
            android.widget.ImageView r4 = r1.A0A
            X.C36441kJ.A1D(r4)
            android.widget.ImageView r5 = r1.A0A
            r4 = 2131232514(0x7f080702, float:1.808114E38)
            r5.setImageResource(r4)
            android.widget.ImageView r6 = r1.A0A
            android.content.Context r5 = r1.getContext()
            r4 = 2131100178(0x7f060212, float:1.781273E38)
            int r4 = X.AnonymousClass00F.A00(r5, r4)
            r6.setColorFilter(r4)
            android.content.res.Resources r5 = X.C36341k9.A0F(r1)
            r4 = 2131166101(0x7f070395, float:1.7946438E38)
            int r5 = r5.getDimensionPixelSize(r4)
            android.widget.ImageView r4 = r1.A0A
            r1.addView(r4, r5, r5)
            android.widget.ImageView r4 = r1.A0A
            android.content.Context r7 = r1.getContext()
            X.17Y r8 = r1.A0R
            X.1XY r9 = r1.A0U
            X.0wU r5 = r1.A21
            X.1X4 r10 = r1.A0Z
            X.1NG r11 = r1.A0h
            X.0xM r12 = r1.A1D
            X.1Jd r13 = r1.A1K
            X.2iD r6 = new X.2iD
            r16 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.setOnClickListener(r6)
        L_0x01af:
            android.widget.ImageView r6 = r1.A0C
            X.C36341k9.A0y(r6)
        L_0x01b4:
            boolean r4 = r1.A0O
            if (r4 == 0) goto L_0x05a8
            X.0ts r4 = r1.A0E
            X.AnonymousClass1JZ.A05(r1, r4, r0, r0)
        L_0x01bd:
            r1.A1v(r14)
            r7 = -1
            r1.A0U(r7)
            if (r6 == 0) goto L_0x0232
            boolean r4 = r2.A02
            if (r4 == 0) goto L_0x0232
            int r9 = r14.A0D
            int r8 = r1.A1Q(r9)
            int r5 = r1.A1R(r9)
            if (r5 != 0) goto L_0x059e
            r4 = r3
        L_0x01d7:
            X.AnonymousClass06T.A00(r4, r6)
            int r4 = r1.A2N
            if (r8 == r4) goto L_0x021a
            if (r17 != 0) goto L_0x0596
            if (r4 == 0) goto L_0x0596
            r4 = 13
            int r4 = X.AnonymousClass3TJ.A00(r9, r4)
            boolean r4 = X.C36401kF.A1U(r4)
            if (r4 == 0) goto L_0x0596
            X.1n3 r9 = new X.1n3
            r9.<init>(r6, r8)
            r4 = 400(0x190, double:1.976E-321)
            X.C36381kD.A1D(r9, r4)
            r6.startAnimation(r9)
        L_0x01fb:
            android.content.Context r10 = r6.getContext()
            int r9 = r14.A0D
            int r11 = r14.A1I
            r4 = 13
            int r4 = X.AnonymousClass3TJ.A00(r9, r4)
            boolean r4 = X.C36401kF.A1U(r4)
            if (r4 == 0) goto L_0x057d
            r5 = 2131891070(0x7f12137e, float:1.941685E38)
            if (r11 != 0) goto L_0x0217
            r5 = 2131891065(0x7f121379, float:1.941684E38)
        L_0x0217:
            X.C36331k8.A0q(r10, r6, r5)
        L_0x021a:
            boolean r4 = X.C66013Ui.A0n(r14)
            if (r4 == 0) goto L_0x0230
            int r4 = r14.A0D
            r5 = 4
            int r4 = X.AnonymousClass3TJ.A00(r4, r5)
            boolean r4 = X.C36401kF.A1U(r4)
            if (r4 == 0) goto L_0x0230
            r6.setVisibility(r5)
        L_0x0230:
            r1.A2N = r8
        L_0x0232:
            boolean r4 = r1.A0O
            boolean r4 = r1.A2B(r14, r4)
            if (r4 == 0) goto L_0x0247
            X.0xf r5 = r1.A1O
            X.11F r4 = r2.A00
            boolean r4 = X.AnonymousClass3M3.A01(r5, r4)
            if (r4 == 0) goto L_0x0578
            r1.setupChatPSAView(r14)
        L_0x0247:
            r1.A1e()
            X.3CP r6 = r1.A0y
            boolean r5 = r1.A0O
            X.3T1 r4 = r1.getFMessage()
            X.36Q r12 = r6.A00(r4, r5)
            r9 = -2
            r8 = 2
            r6 = 1
            android.widget.TextView r4 = r1.A0H
            if (r12 == 0) goto L_0x0562
            if (r4 != 0) goto L_0x02c9
            int r4 = r1.getTopAttributeTextAnchorId()
            android.view.View r13 = r1.findViewById(r4)
            if (r13 == 0) goto L_0x02c9
            android.content.Context r5 = r1.getContext()
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r5)
            r1.A0E = r4
            android.content.Context r4 = r1.getContext()
            com.whatsapp.TextEmojiLabel r11 = new com.whatsapp.TextEmojiLabel
            r11.<init>(r4)
            r1.A0H = r11
            r10 = 2131429248(0x7f0b0780, float:1.8480163E38)
            android.content.res.Resources r5 = r1.getResources()
            r4 = 2131102394(0x7f060aba, float:1.7817225E38)
            int r5 = r5.getColor(r4)
            android.widget.TextView r4 = r1.A0H
            android.graphics.Typeface r4 = r4.getTypeface()
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r8)
            r1.setTopAttributeTextViewAttributes(r11, r10, r5, r4)
            android.widget.LinearLayout r10 = r1.A0E
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r4 = r1.A0w
            if (r4 == 0) goto L_0x02a7
            int r5 = r4.getVisibility()
            r4 = 1
            if (r5 == 0) goto L_0x02a8
        L_0x02a7:
            r4 = 0
        L_0x02a8:
            r1.A0Z(r10, r4)
            android.widget.LinearLayout r5 = r1.A0E
            android.widget.TextView r4 = r1.A0H
            r5.addView(r4, r9, r9)
            android.widget.LinearLayout r11 = r1.A0E
            android.view.ViewParent r10 = r13.getParent()
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r7, r9)
            r4 = 3
            r5.gravity = r4
            int r4 = r10.indexOfChild(r13)
            r10.addView(r11, r4, r5)
        L_0x02c9:
            android.widget.TextView r4 = r1.A0H
            if (r4 == 0) goto L_0x0317
            int r4 = r12.A02
            int r11 = r12.A01
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()
            java.lang.String r5 = X.C19430v1.A09
            r10.append(r5)
            java.lang.String r4 = X.C36381kD.A0t(r1, r4)
            java.lang.String r5 = X.AnonymousClass000.A0p(r4, r5, r10)
            android.widget.TextView r4 = r1.A0H
            r4.setText(r5)
            android.widget.LinearLayout r10 = r1.A0E
            if (r10 == 0) goto L_0x02f4
            android.content.Context r5 = r10.getContext()
            int r4 = r12.A00
            X.C36331k8.A0q(r5, r10, r4)
        L_0x02f4:
            X.0ts r4 = r1.A0E
            boolean r5 = X.C36401kF.A1X(r4)
            android.widget.TextView r4 = r1.A0H
            if (r5 == 0) goto L_0x055d
            r4.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r11, r0)
        L_0x0301:
            android.content.Context r5 = r1.getContext()
            r4 = 2131102393(0x7f060ab9, float:1.7817223E38)
            int r4 = X.AnonymousClass00F.A00(r5, r4)
            android.widget.TextView r5 = r1.A0H
            if (r4 == 0) goto L_0x055a
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
        L_0x0314:
            X.AnonymousClass088.A01(r4, r5)
        L_0x0317:
            int r4 = r1.getTopAttributeTextAnchorId()
            android.view.View r12 = r1.findViewById(r4)
            X.3Jw r5 = r14.A0W()
            if (r12 == 0) goto L_0x0532
            android.widget.LinearLayout r4 = r1.A0E
            if (r4 == 0) goto L_0x0532
            if (r5 == 0) goto L_0x052c
            X.0yC r5 = r1.A0G
            r4 = 4683(0x124b, float:6.562E-42)
            boolean r4 = r5.A0E(r4)
            if (r4 == 0) goto L_0x052c
        L_0x0335:
            com.whatsapp.TextEmojiLabel r4 = r1.A0X
            if (r4 != 0) goto L_0x03a6
            android.content.Context r5 = r1.getContext()
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r5)
            r1.A0D = r4
            android.content.Context r5 = r1.getContext()
            com.whatsapp.TextEmojiLabel r4 = new com.whatsapp.TextEmojiLabel
            r4.<init>(r5)
            r1.A0X = r4
            X.1LI r10 = r1.A08
            android.content.Context r5 = r1.getContext()
            com.whatsapp.TextEmojiLabel r4 = r1.A0X
            X.3SF r4 = r10.B3q(r5, r4)
            r1.A0Y = r4
            com.whatsapp.TextEmojiLabel r11 = r1.A0X
            r10 = 2131432014(0x7f0b124e, float:1.8485773E38)
            android.content.res.Resources r5 = r1.getResources()
            r4 = 2131101101(0x7f0605ad, float:1.7814602E38)
            int r5 = r5.getColor(r4)
            r1.getContext()
            android.graphics.Typeface r4 = X.C33511fU.A02()
            r1.setTopAttributeTextViewAttributes(r11, r10, r5, r4)
            android.widget.LinearLayout r10 = r1.A0D
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r4 = r1.A0w
            if (r4 == 0) goto L_0x0384
            int r5 = r4.getVisibility()
            r4 = 1
            if (r5 == 0) goto L_0x0385
        L_0x0384:
            r4 = 0
        L_0x0385:
            r1.A0Z(r10, r4)
            android.widget.LinearLayout r5 = r1.A0D
            com.whatsapp.TextEmojiLabel r4 = r1.A0X
            r5.addView(r4, r9, r9)
            android.widget.LinearLayout r11 = r1.A0D
            android.view.ViewParent r10 = r12.getParent()
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r7, r9)
            r4 = 3
            r5.gravity = r4
            int r4 = r10.indexOfChild(r12)
            r10.addView(r11, r4, r5)
        L_0x03a6:
            X.4Ux r4 = r1.A0d
            boolean r4 = r4.Bsx()
            if (r4 == 0) goto L_0x04b9
            r1.setClipToPadding(r0)
            r1.setClipChildren(r0)
            android.view.View r4 = r1.A2O
            if (r4 != 0) goto L_0x044d
            android.view.LayoutInflater r5 = X.C36351kA.A0C(r1)
            r4 = 2131626234(0x7f0e08fa, float:1.8879698E38)
            android.view.View r3 = r5.inflate(r4, r3)
            r1.A2O = r3
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.setClipToPadding(r0)
            android.view.View r3 = r1.A2O
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.setClipChildren(r0)
            android.view.View r4 = r1.A2O
            r3 = 2131433885(0x7f0b199d, float:1.8489568E38)
            com.whatsapp.TextEmojiLabel r4 = X.C36401kF.A0P(r4, r3)
            r1.A2S = r4
            float r3 = r1.getNameInGroupTextFontSize()
            r4.setTextSize(r3)
            com.whatsapp.TextEmojiLabel r3 = r1.A2S
            X.C33511fU.A03(r3)
            android.view.View r4 = r1.A2O
            r3 = 2131433186(0x7f0b16e2, float:1.848815E38)
            com.whatsapp.TextEmojiLabel r4 = X.C36401kF.A0P(r4, r3)
            r1.A2R = r4
            float r3 = r1.getNameInGroupTextFontSize()
            r4.setTextSize(r3)
            com.whatsapp.TextEmojiLabel r3 = r1.A2R
            X.C33511fU.A03(r3)
            android.view.View r4 = r1.A2O
            r3 = 2131428269(0x7f0b03ad, float:1.8478178E38)
            android.widget.TextView r5 = X.C36391kE.A0P(r4, r3)
            float r4 = r1.getNameInGroupTextFontSize()
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r3
            r5.setTextSize(r4)
            X.0ts r3 = r1.A0E
            boolean r3 = X.C36351kA.A1Y(r3)
            if (r3 == 0) goto L_0x0528
            java.lang.String r3 = "▶"
        L_0x041c:
            r5.setText(r3)
            android.view.View r4 = r1.A2O
            r3 = 2131431730(0x7f0b1132, float:1.8485197E38)
            android.widget.TextView r3 = X.C36391kE.A0P(r4, r3)
            r1.A2Q = r3
            android.view.View r4 = r1.A2O
            r3 = 2131428825(0x7f0b05d9, float:1.8479305E38)
            android.widget.ImageView r10 = X.C36391kE.A0N(r4, r3)
            X.0ts r5 = r1.A0E
            android.content.Context r4 = r1.getContext()
            r3 = 2131231311(0x7f08024f, float:1.80787E38)
            X.C36321k7.A0L(r4, r10, r5, r3)
            android.view.View r4 = r1.A2O
            android.view.ViewGroup$MarginLayoutParams r3 = new android.view.ViewGroup$MarginLayoutParams
            r3.<init>(r7, r9)
            r1.addView(r4, r3)
            android.view.View r3 = r1.A2O
            r1.A0Y = r3
        L_0x044d:
            X.11F r7 = r2.A00
            boolean r4 = X.AnonymousClass143.A0G(r7)
            int r10 = X.C36391kE.A00(r4)
            boolean r3 = r2.A02
            if (r3 == 0) goto L_0x04f3
            boolean r3 = r7 instanceof X.C28981Uw
            if (r3 != 0) goto L_0x04f3
            android.content.Context r4 = r1.getContext()
            r3 = 2131896229(0x7f1227a5, float:1.9427313E38)
            java.lang.String r9 = r4.getString(r3)
            X.171 r4 = r1.A0n
            X.16D r3 = r1.A0l
            java.lang.String r10 = X.C36381kD.A0u(r3, r4, r7)
        L_0x0472:
            com.whatsapp.TextEmojiLabel r3 = r1.A2S
            r3.A0I(r9)
            com.whatsapp.TextEmojiLabel r3 = r1.A2R
            r3.A0I(r10)
            android.view.View r4 = r1.A2O
            r3 = 2131433888(0x7f0b19a0, float:1.8489574E38)
            android.view.View r7 = X.C012005e.A02(r4, r3)
            android.content.Context r5 = r7.getContext()
            r4 = 2131894477(0x7f1220cd, float:1.942376E38)
            java.lang.Object[] r3 = X.C36431kI.A1a(r9, r10, r8)
            X.C36371kC.A14(r5, r7, r3, r4)
            android.widget.TextView r8 = r1.A2Q
            X.0wo r7 = r1.A19
            X.0ts r5 = r1.A0E
            long r3 = r14.A0I
            long r3 = r7.A08(r3)
            java.lang.String r0 = X.AnonymousClass3UY.A0F(r5, r3, r0)
            r8.setText(r0)
            android.widget.TextView r7 = r1.A2Q
            X.0wo r5 = r1.A19
            X.0ts r0 = r1.A0E
            long r3 = r14.A0I
            long r3 = r5.A08(r3)
            java.lang.String r0 = X.AnonymousClass3UY.A0F(r0, r3, r6)
            r7.setContentDescription(r0)
        L_0x04b9:
            X.11F r0 = r2.A00
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x04f2
            int r3 = r14.A0D
            r0 = 16
            if (r3 == r0) goto L_0x04f2
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x04f2
            boolean r0 = r14 instanceof X.C181798o3
            if (r0 != 0) goto L_0x04f2
            boolean r0 = r14 instanceof X.C46812bi
            if (r0 != 0) goto L_0x04f2
            boolean r0 = r14 instanceof X.AnonymousClass2bO
            if (r0 != 0) goto L_0x04f2
            X.005 r0 = r1.A2B
            java.lang.Object r0 = r0.get()
            X.1GQ r0 = (X.AnonymousClass1GQ) r0
            X.0yC r2 = r0.A00
            r0 = 4760(0x1298, float:6.67E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x04f2
            X.005 r0 = r1.A2E
            java.lang.Object r0 = r0.get()
            X.4V1 r0 = (X.AnonymousClass4V1) r0
            r0.BPq(r14)
        L_0x04f2:
            return
        L_0x04f3:
            if (r4 == 0) goto L_0x0513
            X.171 r5 = r1.A0n
            X.16D r4 = r1.A0l
            X.11F r3 = r14.A0J()
            X.141 r3 = X.C36441kJ.A0i(r4, r3)
            java.lang.String r9 = r5.A0R(r3, r10, r0)
            X.171 r4 = r1.A0n
            X.16D r3 = r1.A0l
            X.141 r3 = r3.A0D(r7)
            java.lang.String r10 = r4.A0R(r3, r10, r0)
            goto L_0x0472
        L_0x0513:
            X.171 r4 = r1.A0n
            X.16D r3 = r1.A0l
            java.lang.String r9 = X.C36381kD.A0u(r3, r4, r7)
            android.content.Context r4 = r1.getContext()
            r3 = 2131896229(0x7f1227a5, float:1.9427313E38)
            java.lang.String r10 = r4.getString(r3)
            goto L_0x0472
        L_0x0528:
            java.lang.String r3 = "◀"
            goto L_0x041c
        L_0x052c:
            boolean r4 = A0e(r1, r14)
            if (r4 != 0) goto L_0x0335
        L_0x0532:
            com.whatsapp.TextEmojiLabel r4 = r1.A0X
            if (r4 == 0) goto L_0x0551
            android.widget.LinearLayout r5 = r1.A0D
            if (r5 == 0) goto L_0x0551
            r5.removeView(r4)
            android.view.ViewParent r4 = r5.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeView(r5)
            android.widget.LinearLayout r4 = r1.A0D
            r4.setOnClickListener(r3)
            r1.A0X = r3
            r1.A0D = r3
            r1.A0Y = r3
        L_0x0551:
            android.widget.LinearLayout r4 = r1.A0E
            if (r4 == 0) goto L_0x03a6
            r4.setOnClickListener(r3)
            goto L_0x03a6
        L_0x055a:
            r4 = 0
            goto L_0x0314
        L_0x055d:
            r4.setCompoundDrawablesWithIntrinsicBounds(r11, r0, r0, r0)
            goto L_0x0301
        L_0x0562:
            if (r4 == 0) goto L_0x0317
            android.widget.LinearLayout r5 = r1.A0E
            r5.removeView(r4)
            android.view.ViewParent r4 = r5.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeView(r5)
            r1.A0H = r3
            r1.A0E = r3
            goto L_0x0317
        L_0x0578:
            r1.setupUsernameInGroupViewContainer(r14)
            goto L_0x0247
        L_0x057d:
            r4 = 5
            int r4 = X.AnonymousClass3TJ.A00(r9, r4)
            boolean r4 = X.C36401kF.A1U(r4)
            r5 = 2131891036(0x7f12135c, float:1.941678E38)
            if (r4 != 0) goto L_0x0217
            r4 = 4
            r5 = 2131891049(0x7f121369, float:1.9416807E38)
            if (r9 != r4) goto L_0x0217
            r5 = 2131891074(0x7f121382, float:1.9416858E38)
            goto L_0x0217
        L_0x0596:
            r6.clearAnimation()
            r6.setImageResource(r8)
            goto L_0x01fb
        L_0x059e:
            android.content.Context r4 = r1.getContext()
            android.content.res.ColorStateList r4 = X.AnonymousClass00F.A04(r4, r5)
            goto L_0x01d7
        L_0x05a8:
            X.9Ui r4 = r1.A09
            int r5 = r4.A01()
            X.4Ux r9 = r1.A0d
            android.content.Context r4 = r1.getContext()
            int r7 = r9.BEy(r4, r5)
            android.content.Context r4 = r1.getContext()
            int r5 = r9.BEv(r4, r5)
            android.content.res.Resources r8 = r1.getResources()
            r4 = 2131165467(0x7f07011b, float:1.7945152E38)
            int r8 = r8.getDimensionPixelSize(r4)
            android.widget.ImageView r4 = r1.A0A
            if (r4 == 0) goto L_0x05e4
            boolean r4 = r9.BLr()
            if (r4 == 0) goto L_0x05eb
            boolean r4 = X.C37541mm.A06(r1)
            if (r4 == 0) goto L_0x05eb
            int r4 = r9.B8x()
            int r4 = X.AnonymousClass001.A02(r8, r4, r0)
            int r5 = r5 + r4
        L_0x05e4:
            X.0ts r4 = r1.A0E
            X.AnonymousClass1JZ.A05(r1, r4, r7, r5)
            goto L_0x01bd
        L_0x05eb:
            int r4 = r9.B8x()
            int r4 = X.AnonymousClass001.A02(r8, r4, r0)
            int r7 = r7 + r4
            goto L_0x05e4
        L_0x05f5:
            if (r4 == 0) goto L_0x05fc
            r1.removeView(r4)
            r1.A0A = r3
        L_0x05fc:
            android.widget.ImageView r6 = r1.A0C
            if (r6 == 0) goto L_0x01b4
            r6.setVisibility(r0)
            goto L_0x01b4
        L_0x0605:
            X.9k9 r5 = r1.A17
            android.widget.FrameLayout r4 = r1.A09
            X.1RY r3 = r1.getContactPhotosLoader()
            r5.A06(r4, r3, r6, r7)
            goto L_0x0132
        L_0x0612:
            com.whatsapp.WaFrameLayout r3 = X.C63803Lm.A00(r10)
            if (r8 == 0) goto L_0x061d
            r8.addView(r3)
            goto L_0x00be
        L_0x061d:
            r8 = r3
            goto L_0x00be
        L_0x0620:
            android.view.ViewGroup r3 = r1.A08
            X.C36341k9.A0y(r3)
            goto L_0x0132
        L_0x0627:
            X.00s r3 = r6.A08
            r4 = 0
            X.AnonymousClass3R7.A01(r3, r4)
            X.00s r3 = r6.A05
            X.AnonymousClass3R7.A01(r3, r4)
            r5.A0D(r14)
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IR.A0d(X.2IR, boolean):void");
    }

    private int getExtraBottomPadding() {
        RelativeLayout relativeLayout;
        int i = this.A01;
        if ((i != 1 && i != 2) || (relativeLayout = this.A06) == null || relativeLayout.getVisibility() == 8) {
            return 0;
        }
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    private C590032g getFailedMessageBundle() {
        C19970wo r4 = this.A19;
        return C66013Ui.A0C(this.A0T, r4, this.A0G, this.A1Y, getFMessage());
    }

    private C600436g getMessagePrivacyStateFromDbOnMainThread() {
        return this.A1I.A00(getFMessage().A1N);
    }

    private float getNameInGroupTextFontSize() {
        return this.A0r.A02(getResources());
    }

    private C38501p4 getOrCreateActionButtonContainer() {
        if (this.A0B == null) {
            this.A0B = new C38501p4(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.setMargins(getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, 0, 0);
            this.A0B.setLayoutParams(marginLayoutParams);
            addView(this.A0B);
            C38501p4 r2 = this.A0B;
            r2.A02.setVisibility(8);
            r2.A01.setVisibility(8);
            r2.A03.setVisibility(8);
        }
        return this.A0B;
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [X.21s, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r18v4, types: [X.21s] */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: type inference failed for: r18v5, types: [X.22v] */
    /* JADX WARNING: type inference failed for: r18v6, types: [X.4Vx] */
    /* JADX WARNING: type inference failed for: r18v7, types: [X.21s] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: setTextWithUrlSpanOverrides */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1m(android.text.Spannable r27, com.whatsapp.TextEmojiLabel r28, X.AnonymousClass3T1 r29) {
        /*
            r26 = this;
            r3 = r26
            android.content.Context r9 = r3.getContext()
            if (r9 == 0) goto L_0x01c6
            X.9Rq r0 = r3.A16
            r5 = r27
            r10 = r29
            int r17 = r0.A00(r9, r5, r10)
            int r2 = r5.length()
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            r0 = 0
            java.lang.Object[] r8 = r5.getSpans(r0, r2, r1)
            android.text.style.URLSpan[] r8 = (android.text.style.URLSpan[]) r8
            r4 = r28
            if (r8 == 0) goto L_0x014d
            int r2 = r8.length
            r7 = 0
        L_0x0025:
            if (r7 >= r2) goto L_0x014f
            r0 = r8[r7]
            if (r0 == 0) goto L_0x0149
            java.lang.String r12 = r0.getURL()
            if (r12 == 0) goto L_0x0149
            int r6 = r5.getSpanStart(r0)
            int r1 = r5.getSpanEnd(r0)
            int r16 = r5.getSpanFlags(r0)
            X.A8P r15 = r3.A1h
            java.lang.String r0 = "wapay"
            boolean r0 = r12.startsWith(r0)
            if (r0 != 0) goto L_0x012b
            java.lang.String r0 = "upi"
            boolean r0 = r12.startsWith(r0)
            if (r0 != 0) goto L_0x012b
            android.net.Uri r11 = android.net.Uri.parse(r12)
            if (r11 == 0) goto L_0x00b5
            X.1DW r0 = r15.A05
            int r11 = r0.A0C(r11)
            r0 = 21
            if (r11 != r0) goto L_0x00b5
            X.17Y r14 = r15.A00
            X.0yb r13 = r15.A03
            X.1e2 r0 = r15.A01
            X.21s r11 = new X.21s
            r21 = r14
            r22 = r13
            r23 = r12
            r18 = r11
            r19 = r9
            r20 = r0
            r18.<init>(r19, r20, r21, r22, r23)
        L_0x0076:
            X.37l r13 = r3.A0f
            X.0yC r14 = r13.A00
            r0 = 355(0x163, float:4.97E-43)
            boolean r0 = r14.A0E(r0)
            if (r0 == 0) goto L_0x009a
            X.62F r0 = r13.A03
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x009a
            X.3Ob r0 = r13.A02
            boolean r0 = r0.A01(r12)
            if (r0 == 0) goto L_0x009a
            r12 = 0
            X.2sB r0 = new X.2sB
            r0.<init>(r13, r12)
            r11.A02 = r0
        L_0x009a:
            java.lang.Class<X.2iK> r0 = X.C48952iK.class
            java.lang.Object[] r15 = r5.getSpans(r6, r1, r0)
            X.AnonymousClass00C.A08(r15)
            X.2iK[] r15 = (X.C48952iK[]) r15
            int r14 = r15.length
            r13 = 0
            if (r14 == 0) goto L_0x0144
            r12 = 1
            r11.A04 = r12
        L_0x00ac:
            r0 = r15[r13]
            r0.A02 = r12
            int r13 = r13 + 1
            if (r13 >= r14) goto L_0x0144
            goto L_0x00ac
        L_0x00b5:
            X.9eY r0 = r3.A15
            X.8Tc r11 = r0.A01(r9, r10, r12)
            if (r11 != 0) goto L_0x0076
            X.380 r14 = r3.A14
            r0 = 2
            X.AnonymousClass00C.A0D(r10, r0)
            java.lang.String r11 = "order"
            r0 = 0
            boolean r0 = X.AnonymousClass098.A07(r12, r11, r0)
            if (r0 == 0) goto L_0x00e9
            X.17Y r0 = r14.A01
            r15 = r0
            X.0yb r13 = r14.A03
            X.1e2 r0 = r14.A02
            X.4Vx r11 = new X.4Vx
            r21 = r0
            r22 = r14
            r23 = r13
            r24 = r10
            r25 = r12
            r18 = r11
            r19 = r9
            r20 = r15
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0076
        L_0x00e9:
            X.36R r11 = r3.A11
            X.4Uw r0 = r3.A0c
            r15 = r0
            java.lang.String r13 = "commands"
            r0 = 0
            boolean r0 = X.AnonymousClass098.A07(r12, r13, r0)
            if (r0 == 0) goto L_0x0112
            X.17Y r14 = r11.A00
            X.0yb r13 = r11.A02
            X.1e2 r0 = r11.A01
            X.22v r11 = new X.22v
            r21 = r0
            r22 = r15
            r23 = r13
            r24 = r12
            r18 = r11
            r19 = r9
            r20 = r14
            r18.<init>(r19, r20, r21, r22, r23, r24)
            goto L_0x0076
        L_0x0112:
            X.3Dg r0 = r3.A13
            X.21s r11 = r0.A00(r9, r10, r12)
            X.0yC r13 = r3.A0G
            r0 = 7578(0x1d9a, float:1.0619E-41)
            boolean r0 = r13.A0E(r0)
            if (r0 == 0) goto L_0x0076
            X.3cS r0 = new X.3cS
            r0.<init>(r3, r10)
            r11.A02 = r0
            goto L_0x0076
        L_0x012b:
            X.17Y r13 = r15.A00
            X.0yb r0 = r15.A03
            X.21s r11 = new X.21s
            r21 = r13
            r22 = r0
            r23 = r10
            r24 = r12
            r18 = r11
            r19 = r9
            r20 = r15
            r18.<init>((android.content.Context) r19, (X.C24791Du) r20, (X.AnonymousClass17Y) r21, (X.C21060yb) r22, (X.AnonymousClass3T1) r23, (java.lang.String) r24)
            goto L_0x0076
        L_0x0144:
            r0 = r16
            r5.setSpan(r11, r6, r1, r0)
        L_0x0149:
            int r7 = r7 + 1
            goto L_0x0025
        L_0x014d:
            r2 = 0
            goto L_0x0166
        L_0x014f:
            if (r2 <= 0) goto L_0x0166
            X.0BN r0 = r4.A00
            if (r0 != 0) goto L_0x0166
            X.0yC r1 = r3.A0G
            X.0yb r0 = r3.A0D
            X.C33521fV.A08(r4, r0, r1)
            r0 = 0
            r4.setFocusable(r0)
            r4.setClickable(r0)
            r4.setLongClickable(r0)
        L_0x0166:
            r0 = 2131434509(0x7f0b1c0d, float:1.8490834E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x01aa
            X.1RJ r9 = new X.1RJ
            r9.<init>(r0)
            if (r17 <= 0) goto L_0x01c0
            android.view.View r1 = r9.A01()
            r0 = 2131434508(0x7f0b1c0c, float:1.8490832E38)
            android.widget.TextView r8 = X.C36391kE.A0P(r1, r0)
            X.C33511fU.A03(r8)
            r7 = 0
            r0 = 1
            if (r2 <= r0) goto L_0x01b4
            X.0ts r6 = r3.A0E
            r1 = 2131755360(0x7f100160, float:1.9141597E38)
            r0 = r17
            java.lang.String r0 = X.C36331k8.A0g(r6, r0, r7, r1)
        L_0x0193:
            r8.setText(r0)
            r9.A03(r7)
            X.1p4 r6 = r3.A0B
            if (r6 == 0) goto L_0x01aa
            java.lang.Integer r1 = X.C023109s.A0C
            java.lang.Integer r0 = r6.A00
            if (r1 != r0) goto L_0x01aa
            android.widget.ImageView r1 = r6.A01
            r0 = 8
            r1.setVisibility(r0)
        L_0x01aa:
            if (r2 <= 0) goto L_0x01c6
            java.lang.CharSequence r0 = r3.A1V(r5)
            X.C36431kI.A1M(r4, r0)
            return
        L_0x01b4:
            android.content.Context r1 = r3.getContext()
            r0 = 2131894762(0x7f1221ea, float:1.9424338E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0193
        L_0x01c0:
            r0 = 8
            r9.A03(r0)
            goto L_0x01aa
        L_0x01c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IR.A1m(android.text.Spannable, com.whatsapp.TextEmojiLabel, X.3T1):void");
    }

    private void setupUIForUserNameInGroup(AnonymousClass3T1 r5, AnonymousClass3SF r6, ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView, AnonymousClass141 r8, int i, AnonymousClass11F r10) {
        AnonymousClass11F r1;
        Context context;
        int i2;
        int A002;
        View.OnClickListener onClickListener;
        if ((r10 instanceof UserJid) && (r1 = r5.A1J.A00) != null) {
            if (AnonymousClass143.A0G(r1)) {
                AnonymousClass6PM A032 = this.A1F.A03((AnonymousClass144) r1, (UserJid) r10);
                if (A032 != null) {
                    A002 = C55772vA.A00(getResources(), A032);
                }
                context = getContext();
                i2 = R.color.f6nameremoved;
                A002 = AnonymousClass00F.A00(context, i2);
            } else {
                if (((AnonymousClass1NU) this.A29.get()).A02(r5)) {
                    context = getContext();
                    i2 = R.color.f6nameremoved;
                    A002 = AnonymousClass00F.A00(context, i2);
                }
                context = getContext();
                i2 = R.color.f6nameremoved;
                A002 = AnonymousClass00F.A00(context, i2);
            }
            TextEmojiLabel textEmojiLabel = r6.A01;
            textEmojiLabel.setTextColor(A002);
            textEmojiLabel.setTextSize(getNameInGroupTextFontSize());
            C33511fU.A03(textEmojiLabel);
            if (AnonymousClass143.A0I(getFMessage().A0L())) {
                conversationRowParticipantHeaderMainView.setOnClickListener((View.OnClickListener) null);
                conversationRowParticipantHeaderMainView.setBackground((Drawable) null);
            } else {
                if (this.A0G.A0E(1825)) {
                    onClickListener = new C66953Xy(this, 24);
                } else {
                    onClickListener = this.A2Z;
                }
                conversationRowParticipantHeaderMainView.setOnClickListener(onClickListener);
                conversationRowParticipantHeaderMainView.setBackgroundResource(R.drawable.selector_orange_gradient);
            }
            A0W(conversationRowParticipantHeaderMainView, this);
            C40011uY r3 = this.A18;
            if (r3 != null) {
                AnonymousClass3R7.A01(r3.A06, this.A0n.A0P(r8, i));
                AnonymousClass3R7.A01(r3.A08, Integer.valueOf(A002));
            }
        }
    }

    private void setupUsernameInGroupViewContainer(AnonymousClass3T1 r21) {
        AnonymousClass11F A0J2;
        ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView = this.A0w;
        if (conversationRowParticipantHeaderMainView != null) {
            TextEmojiLabel A0P2 = C36401kF.A0P(this, R.id.name_in_group_tv);
            AnonymousClass3T1 r8 = r21;
            C64933Qa r3 = r8.A1J;
            boolean z = r3.A02;
            if (z) {
                if (this.A0d.Btw()) {
                    A0J2 = C36371kC.A0e(this.A0T);
                }
                C18740tg.A0D(false, "ConversationRow/setUpUsernameInGroupViewContainer/not allowed state");
                return;
            }
            A0J2 = r8.A0J();
            boolean A022 = ((AnonymousClass1NU) this.A29.get()).A02(r8);
            if (A0J2 == null && A022) {
                A0J2 = r3.A00;
            }
            int i = 8;
            if (A0J2 == null || A0P2 == null) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("conversation_row/missing_rmt_src:");
                C36321k7.A1Z(A0u2, C66013Ui.A0F(r8));
            } else {
                AnonymousClass3SF B3q = this.A08.B3q(getContext(), A0P2);
                AnonymousClass141 A0D2 = this.A0l.A0D(A0J2);
                int A072 = this.A0n.A07(A0D2, r3.A00);
                if (this.A0T.A0M(A0J2)) {
                    A072 = 8;
                }
                setupUIForUserNameInGroup(r8, B3q, conversationRowParticipantHeaderMainView, A0D2, A072, A0J2);
                if (z) {
                    if (this.A0d.Btw()) {
                        A0b(B3q, conversationRowParticipantHeaderMainView, A0D2, A072, false);
                    }
                    C18740tg.A0D(false, "ConversationRow/setUpUsernameInGroupViewContainer/not allowed state");
                    return;
                }
                A0b(B3q, conversationRowParticipantHeaderMainView, A0D2, A072, true);
            }
            AnonymousClass147 A012 = C65533Sl.A01(r3.A00);
            UserJid A0b2 = C36401kF.A0b(A0J2);
            View findViewById = findViewById(R.id.conversation_row_name_in_group_role);
            if (findViewById != null) {
                if (!(getGroupRoleTitle() == null || A0b2 == null || A012 == null || !this.A1F.A0J(A012, A0b2))) {
                    i = 0;
                }
                findViewById.setVisibility(i);
            }
            if (this.A01 < 2) {
                conversationRowParticipantHeaderMainView.setVisibility(0);
            }
        }
    }

    public int A1Q(int i) {
        if (C36401kF.A1U(AnonymousClass3TJ.A00(i, 13)) || C36401kF.A1U(AnonymousClass3TJ.A00(i, 5))) {
            return R.drawable.message_got_receipt_from_target;
        }
        if (i == 4) {
            return R.drawable.message_got_receipt_from_server;
        }
        return R.drawable.message_unsent;
    }

    public int A1R(int i) {
        if (C36401kF.A1U(AnonymousClass3TJ.A00(i, 13))) {
            return R.color.f6nameremoved;
        }
        return R.color.f6nameremoved;
    }

    public C609039u A1S() {
        AnonymousClass17Y r1 = this.A0R;
        C19770wU r5 = this.A21;
        return new C609039u(r1, this.A0W, this.A1E, this.A1U, r5);
    }

    public void A1a() {
        View view = this.A05;
        if (view != null) {
            view.setVisibility(0);
            this.A05.bringToFront();
            return;
        }
        C37511mX r1 = new C37511mX(getContext(), this);
        this.A0v = r1;
        this.A05 = r1;
        r1.setClickable(true);
        C66953Xy.A00(this.A05, this, 23);
        setClipToPadding(false);
        setClipChildren(false);
        addView(this.A05, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r4 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c2, code lost:
        X.C38501p4.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x018c, code lost:
        X.AnonymousClass00C.A08(r2);
        r1 = com.whatsapp.R.dimen.f7nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0192, code lost:
        X.C36331k8.A0q(r4.getContext(), r3, r7);
        r3.setImageDrawable(r2);
        X.C36361kB.A10(X.C36341k9.A0F(r4), r3, r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1e() {
        /*
            r8 = this;
            boolean r0 = r8.A0O
            if (r0 != 0) goto L_0x00db
            X.3T1 r1 = r8.getFMessage()
            boolean r0 = r1 instanceof X.C88854Uh
            if (r0 == 0) goto L_0x0261
            X.4Uh r1 = (X.C88854Uh) r1
            X.3F4 r0 = r1.BIE()
            java.lang.String r1 = r0.A04
        L_0x0014:
            java.lang.String r0 = "MARKETING"
            boolean r4 = r0.equals(r1)
            r1 = 0
            X.0wQ r0 = r8.A0T
            boolean r0 = r0.A0L()
            r2 = 0
            if (r0 != 0) goto L_0x01d6
            X.0yC r3 = r8.A0G
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x01d6
            boolean r0 = r8.A1J()
            if (r0 == 0) goto L_0x01d6
            java.lang.Integer r4 = X.C023109s.A0G
            r0 = 41
        L_0x0038:
            X.2iG r3 = new X.2iG
            r3.<init>(r8, r0)
        L_0x003d:
            android.view.View$OnLongClickListener r0 = r8.A2W
            X.3Q9 r1 = new X.3Q9
            r1.<init>(r3, r0, r4, r2)
        L_0x0044:
            X.0yC r2 = r8.A0G
            r0 = 6806(0x1a96, float:9.537E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x01d0
            if (r1 == 0) goto L_0x01cc
            X.1p4 r4 = r8.getOrCreateActionButtonContainer()
        L_0x0054:
            if (r4 == 0) goto L_0x00c5
        L_0x0056:
            android.widget.ImageView r0 = r4.A02
            r2 = 8
            r0.setVisibility(r2)
            android.widget.ImageView r3 = r4.A01
            r3.setVisibility(r2)
            android.widget.Space r0 = r4.A03
            r0.setVisibility(r2)
            if (r1 == 0) goto L_0x00c5
            java.lang.Integer r6 = r1.A02
            android.view.View$OnClickListener r5 = r1.A00
            android.view.View$OnLongClickListener r2 = r1.A01
            boolean r1 = r1.A03
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            r4.A00 = r6
            r3.setVisibility(r0)
            r3.setOnClickListener(r5)
            r3.setOnLongClickListener(r2)
            int r0 = r6.intValue()
            switch(r0) {
                case 0: goto L_0x0108;
                case 1: goto L_0x00f2;
                case 2: goto L_0x00dc;
                case 3: goto L_0x0125;
                case 4: goto L_0x0145;
                case 5: goto L_0x01a5;
                case 6: goto L_0x017e;
                default: goto L_0x0087;
            }
        L_0x0087:
            android.content.res.Resources r2 = X.C36341k9.A0F(r4)
            android.content.Context r1 = r4.getContext()
            r0 = 2131232125(0x7f08057d, float:1.808035E38)
            android.graphics.drawable.Drawable r1 = X.C36381kD.A0H(r1, r0)
            X.AnonymousClass00C.A08(r1)
            r0 = 2131165302(0x7f070076, float:1.7944817E38)
            int r0 = r2.getDimensionPixelSize(r0)
            android.graphics.drawable.Drawable r5 = X.AnonymousClass3UF.A07(r2, r1, r0)
            X.AnonymousClass00C.A08(r5)
            r0 = -1
            X.AnonymousClass076.A06(r5, r0)
            r2 = 2131886184(0x7f120068, float:1.940694E38)
            r1 = 2131166642(0x7f0705b2, float:1.7947535E38)
            android.content.Context r0 = r4.getContext()
            X.C36331k8.A0q(r0, r3, r2)
            r3.setImageDrawable(r5)
            android.content.res.Resources r0 = X.C36341k9.A0F(r4)
            X.C36361kB.A10(r0, r3, r1)
        L_0x00c2:
            X.C38501p4.A00(r4)
        L_0x00c5:
            boolean r0 = r8.A1M()
            if (r0 == 0) goto L_0x00db
            X.1p4 r2 = r8.getOrCreateActionButtonContainer()
            r0 = 40
            X.2iG r1 = new X.2iG
            r1.<init>(r8, r0)
            android.view.View$OnLongClickListener r0 = r8.A2W
            r2.setupRateButton(r1, r0)
        L_0x00db:
            return
        L_0x00dc:
            r7 = 2131889706(0x7f120e2a, float:1.9414083E38)
            android.content.Context r1 = r4.getContext()
            r0 = 2131231804(0x7f08043c, float:1.80797E38)
            android.graphics.drawable.Drawable r2 = X.C36381kD.A0H(r1, r0)
            X.AnonymousClass00C.A08(r2)
            r1 = 2131166642(0x7f0705b2, float:1.7947535E38)
            goto L_0x0192
        L_0x00f2:
            r7 = 2131886354(0x7f120112, float:1.9407284E38)
            android.content.Context r2 = r4.getContext()
            r1 = 2131232648(0x7f080788, float:1.8081411E38)
            r0 = 2131103013(0x7f060d25, float:1.781848E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass3UF.A01(r2, r1, r0)
            r1 = 2131168159(0x7f070b9f, float:1.7950612E38)
            goto L_0x0192
        L_0x0108:
            r7 = 2131886180(0x7f120064, float:1.9406932E38)
            android.content.Context r6 = r4.getContext()
            r5 = 2131232538(0x7f08071a, float:1.8081188E38)
            android.content.Context r2 = r4.getContext()
            r1 = 2130970441(0x7f040749, float:1.7549592E38)
            r0 = 2131102063(0x7f06096f, float:1.7816553E38)
            int r0 = X.C224514j.A00(r2, r1, r0)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass3UF.A02(r6, r5, r0)
            goto L_0x018c
        L_0x0125:
            r7 = 2131886182(0x7f120066, float:1.9406936E38)
            android.content.Context r6 = r4.getContext()
            r5 = 2131231776(0x7f080420, float:1.8079643E38)
            android.content.Context r2 = r4.getContext()
            r1 = 2130970441(0x7f040749, float:1.7549592E38)
            r0 = 2131102063(0x7f06096f, float:1.7816553E38)
            int r0 = X.C224514j.A00(r2, r1, r0)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass3UF.A01(r6, r5, r0)
            r1 = 2131165366(0x7f0700b6, float:1.7944947E38)
            goto L_0x0192
        L_0x0145:
            android.content.res.Resources r2 = X.C36341k9.A0F(r4)
            android.content.Context r1 = r4.getContext()
            r0 = 2131234123(0x7f080d4b, float:1.8084403E38)
            android.graphics.drawable.Drawable r1 = X.C36381kD.A0H(r1, r0)
            X.AnonymousClass00C.A08(r1)
            r0 = 2131165302(0x7f070076, float:1.7944817E38)
            int r0 = r2.getDimensionPixelSize(r0)
            android.graphics.drawable.Drawable r5 = X.AnonymousClass3UF.A07(r2, r1, r0)
            X.AnonymousClass00C.A08(r5)
            r2 = 2131886183(0x7f120067, float:1.9406938E38)
            r1 = 2131166642(0x7f0705b2, float:1.7947535E38)
            android.content.Context r0 = r4.getContext()
            X.C36331k8.A0q(r0, r3, r2)
            r3.setImageDrawable(r5)
            android.content.res.Resources r0 = X.C36341k9.A0F(r4)
            X.C36361kB.A10(r0, r3, r1)
            goto L_0x00c2
        L_0x017e:
            r7 = 2131886181(0x7f120065, float:1.9406934E38)
            android.content.Context r1 = r4.getContext()
            r0 = 2131232392(0x7f080688, float:1.8080892E38)
            android.graphics.drawable.Drawable r2 = X.C36381kD.A0H(r1, r0)
        L_0x018c:
            X.AnonymousClass00C.A08(r2)
            r1 = 2131167421(0x7f0708bd, float:1.7949115E38)
        L_0x0192:
            android.content.Context r0 = r4.getContext()
            X.C36331k8.A0q(r0, r3, r7)
            r3.setImageDrawable(r2)
            android.content.res.Resources r0 = X.C36341k9.A0F(r4)
            X.C36361kB.A10(r0, r3, r1)
            goto L_0x00c2
        L_0x01a5:
            r2 = 2131232500(0x7f0806f4, float:1.808111E38)
            if (r1 == 0) goto L_0x01ad
            r2 = 2131232130(0x7f080582, float:1.808036E38)
        L_0x01ad:
            android.content.Context r1 = r4.getContext()
            r0 = 2131103013(0x7f060d25, float:1.781848E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass3UF.A01(r1, r2, r0)
            java.lang.String r0 = "Marketing Opt Out"
            r1 = 2131166642(0x7f0705b2, float:1.7947535E38)
            r3.setContentDescription(r0)
            r3.setImageDrawable(r2)
            android.content.res.Resources r0 = X.C36341k9.A0F(r4)
            X.C36361kB.A10(r0, r3, r1)
            goto L_0x00c2
        L_0x01cc:
            X.1p4 r4 = r8.A0B
            goto L_0x0054
        L_0x01d0:
            X.1p4 r4 = r8.getOrCreateActionButtonContainer()
            goto L_0x0056
        L_0x01d6:
            boolean r0 = r8.A1L()
            if (r0 == 0) goto L_0x01e2
            java.lang.Integer r4 = X.C023109s.A0R
            r0 = 36
            goto L_0x0038
        L_0x01e2:
            if (r4 == 0) goto L_0x0212
            X.005 r0 = r8.A29
            java.lang.Object r0 = r0.get()
            X.1NU r0 = (X.AnonymousClass1NU) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0212
            X.3T1 r0 = r8.getFMessage()
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            com.whatsapp.jid.UserJid r1 = X.C36401kF.A0b(r0)
            if (r1 == 0) goto L_0x020c
            X.005 r0 = r8.A24
            java.lang.Object r0 = r0.get()
            X.1NP r0 = (X.AnonymousClass1NP) r0
            boolean r2 = r0.A03(r1)
        L_0x020c:
            java.lang.Integer r4 = X.C023109s.A0S
            r0 = 37
            goto L_0x0038
        L_0x0212:
            boolean r0 = r8.A1E()
            if (r0 == 0) goto L_0x022a
            X.4V7 r0 = X.AnonymousClass3SS.A02(r8)
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.BNM()
            if (r0 != 0) goto L_0x0044
            java.lang.Integer r4 = X.C023109s.A00
            r0 = 34
            goto L_0x0038
        L_0x022a:
            boolean r0 = r8.A1O()
            if (r0 == 0) goto L_0x023b
            java.lang.Integer r4 = X.C023109s.A01
            r0 = 25
            X.3Xy r3 = new X.3Xy
            r3.<init>(r8, r0)
            goto L_0x003d
        L_0x023b:
            X.3T1 r0 = r8.getFMessage()
            boolean r0 = X.C66013Ui.A0l(r0)
            if (r0 != 0) goto L_0x0255
            boolean r0 = r8.A1K()
            if (r0 == 0) goto L_0x0255
            boolean r0 = r8.A2K
            if (r0 != 0) goto L_0x0255
            java.lang.Integer r4 = X.C023109s.A0C
            r0 = 38
            goto L_0x0038
        L_0x0255:
            boolean r0 = r8.A1N()
            if (r0 == 0) goto L_0x0044
            java.lang.Integer r4 = X.C023109s.A0W
            r0 = 39
            goto L_0x0038
        L_0x0261:
            r1 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IR.A1e():void");
    }

    public void A1g(int i) {
        int i2;
        int i3;
        int i4;
        Resources resources;
        int i5;
        this.A01 = i;
        ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView = this.A0w;
        int i6 = 0;
        if (conversationRowParticipantHeaderMainView != null) {
            conversationRowParticipantHeaderMainView.setVisibility(C36351kA.A00(A29(this.A1O, getFMessage(), i, this.A0O) ? 1 : 0));
        }
        C40011uY r0 = this.A18;
        if (r0 != null) {
            AnonymousClass3R7.A01(r0.A05, Integer.valueOf(i));
        }
        int extraBottomPadding = getExtraBottomPadding();
        if (this instanceof C16290ov) {
            i6 = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
            i2 = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        } else {
            i2 = 0;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int A002 = (int) ((C36341k9.A00(getContext()) * 4.0f) / 3.0f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        C89014Ux r1 = this.A0d;
        if (r1.BtC()) {
            i3 = r1.B8z(getContext());
            i4 = r1.B8z(getContext());
        } else {
            i3 = A002;
            i4 = dimensionPixelSize;
        }
        int i7 = this.A01;
        if (i7 != 1) {
            if (i7 == 2) {
                setPadding(paddingLeft, A002 - i6, paddingRight, (i3 - i2) + extraBottomPadding);
            } else if (i7 != 3) {
                if (this.A00) {
                    i6 = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
                }
                setPadding(paddingLeft, dimensionPixelSize - i6, paddingRight, i4 - i2);
                resources = getResources();
                i5 = R.dimen.f7nameremoved;
            } else {
                setPadding(paddingLeft, A002 - i6, paddingRight, (i4 - i2) + extraBottomPadding);
            }
            resources = getResources();
            i5 = R.dimen.f7nameremoved;
        } else {
            if (this.A00) {
                i6 = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
            }
            setPadding(paddingLeft, dimensionPixelSize - i6, paddingRight, (i3 - i2) + extraBottomPadding);
            resources = getResources();
            i5 = R.dimen.f7nameremoved;
        }
        setMinimumHeight(C36441kJ.A05(resources, i5));
    }

    public void A1p(ViewGroup viewGroup, Runnable runnable, int i, boolean z) {
        if (z) {
            View view = this.A06;
            if (view == null) {
                view = C36361kB.A0E(C36351kA.A0C(this), (ViewGroup) null, R.layout.f9nameremoved);
                this.A06 = view;
            }
            TextView A0P2 = C36391kE.A0P(view, R.id.action_btn);
            A0P2.setText(i);
            C33511fU.A03(A0P2);
            if (this.A06.getParent() != null) {
                viewGroup.removeView(this.A06);
            }
            C36401kF.A18(this.A06, viewGroup);
            C48812i6.A00(this.A06, runnable, this, 38);
            return;
        }
        View view2 = this.A06;
        if (view2 != null) {
            viewGroup.removeView(view2);
            this.A06 = null;
        }
    }

    public final void A1q(TextView textView, AnonymousClass3T1 r6, int i) {
        if (r6.A10) {
            C64933Qa r1 = r6.A1J;
            if (r1.A02 && !(r1.A00 instanceof C177618e5)) {
                int i2 = R.color.f6nameremoved;
                if (i == R.drawable.broadcast_status_icon) {
                    i2 = R.color.f6nameremoved;
                }
                Drawable A022 = AnonymousClass3UF.A02(getContext(), i, i2);
                if (C36401kF.A1X(this.A0E)) {
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new C100744vb(A022, this.A0E), (Drawable) null);
                    return;
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(A022, (Drawable) null, (Drawable) null, (Drawable) null);
                    return;
                }
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        if (r0.A00 == Integer.MIN_VALUE) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1s(com.whatsapp.TextEmojiLabel r25, X.AnonymousClass3T1 r26, java.lang.String r27, boolean r28, boolean r29) {
        /*
            r24 = this;
            r3 = r24
            if (r29 == 0) goto L_0x00fe
            float r20 = r3.getTextFontSize()
        L_0x0008:
            X.4Uw r2 = r3.A0c
            r4 = r26
            if (r2 == 0) goto L_0x00fb
            int r5 = r2.BF0(r4)
        L_0x0012:
            r3.getRowCustomizer()
            r1 = 1
            boolean r0 = X.C66013Ui.A0l(r4)
            if (r0 == 0) goto L_0x00f2
            if (r5 != r1) goto L_0x00f2
            r0 = 308(0x134, float:4.32E-43)
            X.3lI r13 = new X.3lI
            r13.<init>(r1, r0)
        L_0x0025:
            android.content.Context r10 = r3.getContext()
            X.1Sj r6 = r3.A1X
            X.1H2 r15 = r3.A1M
            X.0yb r14 = r3.A0D
            X.0wg r5 = r3.A1k
            r0 = 4
            X.2sD r11 = new X.2sD
            r11.<init>(r3, r0)
            int r1 = r4.A1I
            boolean r0 = r3.A2J
            r12 = r25
            r19 = r27
            r22 = r28
            r21 = r1
            r23 = r0
            r17 = r5
            r18 = r4
            r16 = r6
            X.35q r7 = X.C65853Ts.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.0BN r0 = r12.A00
            if (r0 == 0) goto L_0x005a
            int r1 = r0.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 1
            if (r1 != r0) goto L_0x005b
        L_0x005a:
            r11 = 0
        L_0x005b:
            r6 = 0
            if (r2 == 0) goto L_0x0066
            java.lang.Class<X.9SI> r0 = X.AnonymousClass9SI.class
            java.lang.Object r6 = r2.BAB(r0)
            X.9SI r6 = (X.AnonymousClass9SI) r6
        L_0x0066:
            java.lang.Object r5 = r7.A00
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.Object r0 = r7.A01
            boolean r1 = X.AnonymousClass000.A1X(r0)
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0094
            r2 = 0
            if (r1 == 0) goto L_0x00ea
            X.0BN r0 = r12.A00
            if (r0 != 0) goto L_0x00ea
            X.0yC r1 = r3.A0G
            X.0yb r0 = r3.A0D
            X.C33521fV.A08(r12, r0, r1)
            r12.setFocusable(r2)
            r12.setClickable(r2)
            r12.setLongClickable(r2)
        L_0x008d:
            java.lang.CharSequence r0 = r3.A1V(r5)
            X.C36431kI.A1M(r12, r0)
        L_0x0094:
            if (r6 == 0) goto L_0x00bf
            X.16D r10 = r3.A0l
            X.1A5 r9 = r3.A1C
            X.0xQ r8 = r3.A1Q
            X.0wQ r7 = r3.A0T
            X.1C6 r2 = r3.A1u
            X.0yC r1 = r3.A0G
            X.12q r0 = r3.A0F
            r15 = r0
            r16 = r9
            r17 = r1
            r18 = r8
            r19 = r4
            r20 = r2
            r13 = r7
            r14 = r10
            boolean r0 = X.C65853Ts.A06(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x00bf
            X.3fA r0 = new X.3fA
            r0.<init>(r12, r3, r4)
            r6.A00(r12, r0, r4, r5)
        L_0x00bf:
            if (r11 == 0) goto L_0x00c4
            X.C36421kH.A0r(r3)
        L_0x00c4:
            X.3Qa r0 = r4.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0102
            r1 = 2097152(0x200000, float:2.938736E-39)
            int r0 = r4.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x0102
            X.0v5 r1 = r3.A0K
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0102
            r1.A02()
            r3.getContext()
            java.lang.String r0 = "premiumMessageInflatePlaceHolders"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00ea:
            r12.setFocusable(r2)
            r0 = 0
            r12.setAccessibilityHelper(r0)
            goto L_0x008d
        L_0x00f2:
            r0 = 768(0x300, float:1.076E-42)
            X.3lI r13 = new X.3lI
            r13.<init>(r5, r0)
            goto L_0x0025
        L_0x00fb:
            r5 = 0
            goto L_0x0012
        L_0x00fe:
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0008
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IR.A1s(com.whatsapp.TextEmojiLabel, X.3T1, java.lang.String, boolean, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.whatsapp.reactions.ReactionsBottomSheetDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.whatsapp.reactions.ReactionsBottomSheetDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.whatsapp.reactions.ReactionsBottomSheetDialogFragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1t(X.C88944Uq r6, X.AnonymousClass11F r7) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0008
            java.lang.String r0 = "ConversationRow/onReactionViewClicked null message reactions."
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0007:
            return
        L_0x0008:
            android.app.Activity r4 = X.C36361kB.A05(r5)
            X.01I r4 = (X.AnonymousClass01I) r4
            if (r4 == 0) goto L_0x0007
            boolean r0 = r7 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0042
            X.3Ro r0 = X.C28981Uw.A03
            X.C18740tg.A06(r7)
            java.util.List r3 = r5.getAllMessages()
            X.005 r0 = r5.A28
            java.lang.Object r1 = r0.get()
            X.0y9 r1 = (X.C20780y9) r1
            java.lang.Class<X.0xr> r0 = X.C20620xr.class
            r1.A01(r0)
            X.C18740tg.A06(r7)
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet r2 = new com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet
            r2.<init>()
            r2.A0C = r3
            X.01z r1 = r4.getSupportFragmentManager()
            java.lang.String r0 = "newsletter_reaction_sheet"
        L_0x003e:
            r2.A1f(r1, r0)
            return
        L_0x0042:
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment r2 = r5.A1U(r6, r7)
            X.01z r1 = r4.getSupportFragmentManager()
            java.lang.String r0 = "reactionsheet"
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IR.A1t(X.4Uq, X.11F):void");
    }

    public void A1w(AnonymousClass3T1 r5) {
        this.A26.get();
        AnonymousClass00C.A0D(r5, 0);
        boolean A002 = C63903Lw.A00(r5);
        if (!C66013Ui.A0i(r5) || A002) {
            C36341k9.A0y(this.A2P);
            return;
        }
        if (this.A2P == null) {
            TextView textView = (TextView) C36431kI.A0J(C36351kA.A0C(this), R.layout.f9nameremoved);
            this.A2P = textView;
            ViewGroup viewGroup = this.A07;
            viewGroup.addView(textView, viewGroup.indexOfChild(this.A0G));
        }
        boolean z = r5.A1J.A02;
        int i = R.style.f13nameremoved;
        if (z) {
            i = R.style.f13nameremoved;
        }
        AnonymousClass088.A06(this.A2P, i);
        this.A2P.setVisibility(0);
    }

    public void A24(boolean z) {
        int i;
        this.A00 = z;
        WaTextView waTextView = this.A2T;
        if (z) {
            if (waTextView == null) {
                WaTextView waTextView2 = new WaTextView(getContext());
                this.A2T = waTextView2;
                C33511fU.A03(waTextView2);
                this.A2T.setId(R.id.conversation_row_date_divider);
                C36331k8.A0r(getContext(), this.A2T, R.color.f6nameremoved);
                this.A2T.setBackgroundResource(R.drawable.date_balloon_normal);
                this.A2T.setGravity(17);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                int dimensionPixelSize2 = dimensionPixelSize - getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                marginLayoutParams.bottomMargin = dimensionPixelSize2;
                if (this instanceof C16290ov) {
                    marginLayoutParams.bottomMargin = dimensionPixelSize2 - getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                }
                addView(this.A2T, marginLayoutParams);
                waTextView = this.A2T;
                this.A0Y = waTextView;
            }
            waTextView.setText(AnonymousClass3UY.A0E(this.A0E, getFMessage().A0I));
            this.A2T.setTextSize(this.A0r.A01(getResources()));
            waTextView = this.A2T;
            i = 0;
        } else if (waTextView != null) {
            i = 8;
        } else {
            return;
        }
        waTextView.setVisibility(i);
    }

    public boolean A2A(AnonymousClass3T1 r2) {
        return !this.A0O;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r2 == 7) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A2B(X.AnonymousClass3T1 r5, boolean r6) {
        /*
            r4 = this;
            int r2 = r5.A1I
            r0 = 21
            if (r2 == r0) goto L_0x000e
            r0 = 22
            if (r2 == r0) goto L_0x000e
            r1 = 7
            r0 = 1
            if (r2 != r1) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r3 = 0
            if (r0 == 0) goto L_0x0043
            X.3Qa r2 = r5.A1J
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0020
            X.4Ux r0 = r4.A0d
            boolean r0 = r0.Btw()
            if (r0 == 0) goto L_0x0038
        L_0x0020:
            X.11F r0 = r2.A00
            boolean r0 = X.AnonymousClass143.A0G(r0)
            if (r0 != 0) goto L_0x002e
            boolean r0 = X.C63903Lw.A01(r5)
            if (r0 == 0) goto L_0x0038
        L_0x002e:
            if (r6 != 0) goto L_0x0038
            X.4Ux r0 = r4.A0d
            boolean r0 = r0.BLr()
            if (r0 != 0) goto L_0x0042
        L_0x0038:
            X.0xf r1 = r4.A1O
            X.11F r0 = r2.A00
            boolean r0 = X.AnonymousClass3M3.A01(r1, r0)
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            r3 = 1
        L_0x0043:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IR.A2B(X.3T1, boolean):boolean");
    }

    public float getDividerFontSize() {
        return this.A0r.A01(getResources());
    }

    public List getHighlightTerms() {
        C89004Uw r0 = this.A0c;
        if (r0 == null) {
            return null;
        }
        return r0.getSearchTerms();
    }

    public float getTextFontSize() {
        C63193Jc r2 = this.A0r;
        return r2.A03(getResources(), r2.A00);
    }

    public void onMeasure(int i, int i2) {
        int mode;
        if (this.A02 != 0) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int i3 = this.A02;
            if (mode2 == 0) {
                mode = Integer.MIN_VALUE;
            } else {
                i3 = Math.min(i3, View.MeasureSpec.getSize(i2));
                mode = View.MeasureSpec.getMode(i2);
            }
            i2 = View.MeasureSpec.makeMeasureSpec(i3, mode);
        }
        super.onMeasure(i, i2);
    }

    public void setHeaderChevronVisibility(boolean z) {
        this.A2O.findViewById(R.id.chevron).setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    public void setPressed(boolean z) {
        AnonymousClass4V7 A022;
        if (!this.A2I) {
            if (C20800yB.A01(C21000yV.A01, this.A0G, 7308) && (A022 = AnonymousClass3SS.A02(this)) != null) {
                A022.setOneConversationRowPressed(z);
            }
            super.setPressed(z);
        }
    }

    public void setRecipientNameVisibility(boolean z) {
        View view = this.A2O;
        if (view != null && this.A2R != null) {
            View findViewById = view.findViewById(R.id.bullet);
            int A002 = C36351kA.A00(z ? 1 : 0);
            findViewById.setVisibility(A002);
            this.A2R.setVisibility(A002);
        }
    }

    public void setSelected(boolean z) {
        C37511mX r0 = this.A0v;
        if (r0 != null) {
            r0.setRowSelected(z);
        }
    }

    public static void A0X(View view, AnonymousClass2IR r6) {
        C225314u A0N2;
        UserJid A0L2 = r6.getFMessage().A0L();
        if (A0L2 != null && (A0N2 = C225314u.A0N(r6.getContext())) != null) {
            if (C197029b1.A00(A0L2)) {
                AnonymousClass1K6.A00(A0N2, new C69523df(view, A0N2, r6, A0L2), ((AnonymousClass1K4) ((AnonymousClass1K3) r6.A25.get())).A04, C51412nm.INVOKE, C36371kC.A0o());
                return;
            }
            A0V(view, A0N2, r6, A0L2);
        }
    }

    private void A0Y(ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup, ImageView imageView, int i, int i2, int i3) {
        imageView.setLayoutParams(layoutParams);
        C36331k8.A0q(imageView.getContext(), imageView, i);
        AnonymousClass1JZ.A05(imageView, this.A0E, 0, i2);
        if (viewGroup != null) {
            viewGroup.addView(imageView, C63773Lj.A00(new View[]{this.A0B, this.A2U, this.A2V, null}, i3));
            viewGroup.setClipChildren(false);
        }
    }

    private void A0Z(LinearLayout linearLayout, boolean z) {
        int dimensionPixelSize = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        int dimensionPixelSize2 = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        linearLayout.setOrientation(0);
        if (z) {
            linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        } else {
            linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, 0);
        }
    }

    public static void A0a(C225314u r7, AnonymousClass2IR r8) {
        r7.A38(C68693cJ.A00, new AnonymousClass4YD(r7, r8, 0), R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (X.C52022ol.PUSH_NAME != r4.A00) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0b(X.AnonymousClass3SF r10, com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r11, X.AnonymousClass141 r12, int r13, boolean r14) {
        /*
            r9 = this;
            X.3T1 r0 = r9.getFMessage()
            boolean r2 = X.C63903Lw.A01(r0)
            X.005 r0 = r9.A29
            java.lang.Object r1 = r0.get()
            X.1NU r1 = (X.AnonymousClass1NU) r1
            X.3T1 r0 = r9.getFMessage()
            boolean r0 = r1.A02(r0)
            r5 = r12
            r7 = r13
            if (r0 == 0) goto L_0x004e
            X.2ol r1 = X.C52022ol.VERIFIED_NAME
            java.lang.String r0 = "P Message"
            X.34G r4 = new X.34G
            r4.<init>(r1, r0)
        L_0x0025:
            r6 = 0
            boolean r8 = r12.A0O()
            r3 = r10
            r3.A04(r4, r5, r6, r7, r8)
            if (r14 == 0) goto L_0x004d
            if (r2 != 0) goto L_0x004d
            r0 = 7
            if (r0 != r13) goto L_0x003c
            X.2ol r1 = X.C52022ol.PUSH_NAME
            X.2ol r0 = r4.A00
            r3 = 1
            if (r1 == r0) goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            r0 = 2131433702(0x7f0b18e6, float:1.8489197E38)
            com.whatsapp.TextEmojiLabel r2 = X.C36401kF.A0O(r9, r0)
            X.3CR r1 = r9.A12
            X.2ol r0 = r4.A00
            r1.A00(r2, r0, r12, r13)
            r11.A00 = r3
        L_0x004d:
            return
        L_0x004e:
            X.171 r0 = r9.A0n
            X.34G r4 = r0.A0C(r12, r13)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IR.A0b(X.3SF, com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView, X.141, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0e(X.AnonymousClass2IR r4, X.AnonymousClass3T1 r5) {
        /*
            X.3Ky r3 = r5.A0O()
            boolean r1 = r4.A0O
            boolean r0 = X.C66013Ui.A0t(r5)
            if (r0 == 0) goto L_0x000f
            r0 = 1
            if (r1 == 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r2 = 0
            if (r0 == 0) goto L_0x0028
            if (r3 == 0) goto L_0x0028
            X.0yC r1 = r4.A0G
            r0 = 4652(0x122c, float:6.519E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0028
            X.141 r0 = r3.A00
            if (r0 == 0) goto L_0x0028
            X.3L0 r0 = r0.A0E
            if (r0 == 0) goto L_0x0028
            r2 = 1
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IR.A0e(X.2IR, X.3T1):boolean");
    }

    /* access modifiers changed from: private */
    public String getMoreInfoString() {
        Context context;
        int i;
        String str;
        C80113ur r3;
        C600436g messagePrivacyStateFromDbOnMainThread = getMessagePrivacyStateFromDbOnMainThread();
        if (messagePrivacyStateFromDbOnMainThread == null || (r3 = messagePrivacyStateFromDbOnMainThread.A00) == null) {
            context = getContext();
            i = R.string.f12nameremoved;
        } else {
            AnonymousClass3U1 r0 = new AnonymousClass3U1(r3, 3, 1);
            context = getContext();
            switch (r0.A03()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 7:
                case 8:
                    i = R.string.f12nameremoved;
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                    str = null;
                    break;
                default:
                    i = R.string.f12nameremoved;
                    break;
            }
            i = R.string.f12nameremoved;
        }
        str = context.getString(i);
        return AnonymousClass1JZ.A01(this.A0E, str);
    }

    private void setTopAttributeTextViewAttributes(TextView textView, int i, int i2, Typeface typeface) {
        int dimensionPixelSize = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        textView.setId(i);
        textView.setTextColor(i2);
        textView.setTypeface(typeface);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setTextSize(getNameInGroupTextFontSize());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setCompoundDrawablePadding(dimensionPixelSize);
        AnonymousClass088.A02(PorterDuff.Mode.SRC_IN, textView);
        C011504z.A06(textView, 2);
    }

    private void setupChatPSAView(AnonymousClass3T1 r9) {
        TextEmojiLabel A0P2 = C36401kF.A0P(this, R.id.name_in_group_tv);
        if (A0P2 != null) {
            AnonymousClass3SF B3q = this.A08.B3q(getContext(), A0P2);
            AnonymousClass141 A0D2 = this.A0l.A0D(r9.A0J());
            B3q.A04(B3q.A02.A0C(A0D2, 1), A0D2, (List) null, 1, B3q.A0A(A0D2));
            int color = getResources().getColor(R.color.f6nameremoved);
            TextEmojiLabel textEmojiLabel = B3q.A01;
            textEmojiLabel.setTextColor(color);
            textEmojiLabel.setTextSize(getNameInGroupTextFontSize());
            C33511fU.A03(textEmojiLabel);
            textEmojiLabel.setVisibility(0);
        }
    }

    public boolean A1P() {
        AnonymousClass4V7 A022 = AnonymousClass3SS.A02(this);
        if (A022 == null) {
            return false;
        }
        boolean A002 = this.A0H.A00(getFMessage());
        if (this.A0b == null || !A25() || getMessageCount() != 1 || !this.A1p.A02(getFMessage())) {
            return false;
        }
        if (!A022.BMv() || A002) {
            return true;
        }
        return false;
    }

    public ReactionsBottomSheetDialogFragment A1U(C88944Uq r4, AnonymousClass11F r5) {
        C18740tg.A06(r5);
        ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment = new ReactionsBottomSheetDialogFragment();
        reactionsBottomSheetDialogFragment.A0J = r5;
        reactionsBottomSheetDialogFragment.A07 = r4;
        reactionsBottomSheetDialogFragment.A0O = false;
        reactionsBottomSheetDialogFragment.A0D = null;
        return reactionsBottomSheetDialogFragment;
    }

    public CharSequence A1V(CharSequence charSequence) {
        List highlightTerms;
        if (TextUtils.isEmpty(charSequence) || (highlightTerms = getHighlightTerms()) == null || highlightTerms.isEmpty()) {
            return charSequence;
        }
        return C65783Tl.A01(getContext(), this.A0E, charSequence, highlightTerms);
    }

    public void A1W() {
        C89004Uw r1;
        if (A25() && (r1 = this.A0c) != null && !r1.BK6()) {
            r1.Bur(getFMessage());
            AnonymousClass3T1 fMessage = getFMessage();
            getRowCustomizer();
            C80273v8.A00(this.A21, this, fMessage, 39);
            AnonymousClass3O0 r2 = this.A1a;
            r2.A01 = C19970wo.A00(r2.A04);
            r2.A02 = C36361kB.A0l();
            r2.A00 = 1;
            r2.A03 = r2.A06.A00();
            AnonymousClass3O0 r22 = this.A1a;
            if (r22.A03 && r22.A00 == 1) {
                r22.A00 = 2;
                AnonymousClass3O0.A00(r22, 0);
            }
        }
    }

    public void A1X() {
        Handler handler = getHandler();
        if (handler == null) {
            Runnable runnable = this.A2a;
            removeCallbacks(runnable);
            post(runnable);
            return;
        }
        Runnable runnable2 = this.A2a;
        if (!handler.hasMessages(0, runnable2)) {
            Message obtain = Message.obtain(handler, runnable2);
            obtain.what = 0;
            obtain.obj = runnable2;
            obtain.sendToTarget();
        }
    }

    public void A1c() {
        StringBuilder A0u2;
        String str;
        AnonymousClass3T1 fMessage = getFMessage();
        C66013Ui.A0F(fMessage);
        AnonymousClass014 r3 = (AnonymousClass014) C36361kB.A05(this);
        if (r3 != null) {
            UserJid userJid = null;
            if (C66013Ui.A0f(fMessage)) {
                userJid = ((C181248nA) fMessage).A00;
            } else {
                C64933Qa r1 = fMessage.A1J;
                if (AnonymousClass143.A0G(r1.A00) && (!r1.A02 || fMessage.A0D == 6)) {
                    userJid = C20350xQ.A03(fMessage);
                }
            }
            if (userJid == null) {
                A0u2 = AnonymousClass000.A0u();
                str = "conversation/getdialogitems/remote_resource is null! ";
            } else {
                AnonymousClass11F r2 = fMessage.A1J.A00;
                if (!AnonymousClass143.A0G(r2) || !AnonymousClass143.A0I(userJid) || this.A1F.A0B(r2)) {
                    this.A1F.A02(userJid, C36441kJ.A0l(r2)).A08(r3, new C88554Td(r3, 26));
                    return;
                } else {
                    A0u2 = AnonymousClass000.A0u();
                    str = "conversation/getdialogitems/remote_resource is lid ";
                }
            }
            A0u2.append(str);
            C36321k7.A1Q(C66013Ui.A0F(fMessage), "", A0u2);
        }
    }

    public void A1k(Bundle bundle) {
        bundle.putInt("EXTRA_SELECTION_SAVE_STATE_WIDTH", getWidth());
        bundle.putInt("EXTRA_SELECTION_SAVE_STATE_HEIGHT", getHeight());
        bundle.putInt("EXTRA_SELECTION_SAVE_STATE_COLLAPSE_TYPE", this.A01);
        C89004Uw r1 = this.A0c;
        if (r1 != null) {
            bundle.putInt("EXTRA_SELECTION_SAVE_STATE_PAGE_LIMIT", r1.BF0(getFMessage()));
        }
    }

    public void A1l(Spannable spannable) {
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(C429721s.A00(getContext(), uRLSpan, this.A0S, this.A0R, this.A0D), spanStart, spanEnd, 0);
        }
    }

    public void A1v(AnonymousClass3T1 r3) {
        A1o(getDateWrapper(), getDateView(), r3);
    }

    public void A1x(AnonymousClass3T1 r5) {
        Class cls = AnonymousClass4P9.class;
        Activity A002 = C18860tw.A00(getContext());
        Object obj = null;
        if (A002 != null) {
            if (cls.isAssignableFrom(A002.getClass())) {
                obj = cls.cast(A002);
            } else if (A002 instanceof AnonymousClass155) {
                AnonymousClass02E A0N2 = ((AnonymousClass01I) A002).getSupportFragmentManager().A0N("com.whatsapp.HomeActivity.ConversationFragment");
                if (A0N2 instanceof ConversationFragment) {
                    ConversationFragment conversationFragment = (ConversationFragment) A0N2;
                    obj = cls.isAssignableFrom(conversationFragment.A02.getClass()) ? cls.cast(conversationFragment.A02) : null;
                }
            }
        }
        AnonymousClass4P9 r2 = (AnonymousClass4P9) obj;
        if (r2 != null) {
            r2.BNx(r5);
        }
    }

    public void A1y(AnonymousClass3T1 r3) {
        C89004Uw r0;
        if (A25() && (r0 = this.A0c) != null) {
            this.A0v.setRowSelected(r0.Bvv(r3));
        }
    }

    public void A1z(AnonymousClass3T1 r5) {
        String A0R2;
        LinearLayout linearLayout;
        int i;
        C63393Jw A0W2 = r5.A0W();
        C63673Ky A0O2 = r5.A0O();
        if (A0W2 != null && this.A0G.A0E(4683)) {
            String str = A0W2.A04;
            this.A0X.A0E();
            TextEmojiLabel textEmojiLabel = this.A0X;
            if (TextUtils.isEmpty(str)) {
                str = getResources().getString(R.string.f12nameremoved);
            }
            textEmojiLabel.setText(str);
            AnonymousClass3YF.A00(this.A0D, this, r5, 7);
            linearLayout = this.A0E;
            i = 8;
        } else if (A0e(this, r5) && (A0R2 = this.A0n.A0R(A0O2.A00, -1, true)) != null && !TextUtils.isEmpty(A0R2)) {
            this.A0Y.A01.setText(A0R2);
            this.A0Y.A01.A0E();
            AnonymousClass3YF.A00(this.A0D, this, r5, 9);
            linearLayout = this.A0E;
            i = 10;
        } else {
            return;
        }
        AnonymousClass3YF.A00(linearLayout, this, r5, i);
    }

    public void A20(AnonymousClass3T1 r6) {
        int i;
        ViewGroup A0P2 = C36411kG.A0P(this, R.id.main_layout);
        if (A0P2 == null) {
            return;
        }
        if (!A0e(this, r6) || !((i = r6.A1I) == 0 || i == 1 || i == 9 || i == 3)) {
            View view = this.A06;
            if (view != null) {
                A0P2.removeView(view);
                this.A06 = null;
                return;
            }
            return;
        }
        A1p(A0P2, new C80273v8(this, r6, 40), R.string.f12nameremoved, true);
    }

    public void A21(AnonymousClass3T1 r1, int i) {
        setFMessage(r1);
        A0U(i);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A22(X.AnonymousClass3T1 r4, boolean r5) {
        /*
            r3 = this;
            X.3T1 r2 = r3.getFMessage()
            boolean r1 = X.C36371kC.A1W(r2, r4)
            r3.setFMessage(r4)
            if (r1 != 0) goto L_0x000f
            if (r5 == 0) goto L_0x0023
        L_0x000f:
            boolean r0 = X.C64933Qa.A04(r4)
            if (r0 == 0) goto L_0x0020
            X.005 r0 = r3.A2E
            java.lang.Object r0 = r0.get()
            X.4V1 r0 = (X.AnonymousClass4V1) r0
            r0.BPs(r2)
        L_0x0020:
            A0d(r3, r1)
        L_0x0023:
            X.4Uw r2 = r3.A0c
            if (r2 == 0) goto L_0x0045
            boolean r0 = r2.BK6()
            if (r0 == 0) goto L_0x0045
            boolean r0 = r3.A27()
            if (r0 == 0) goto L_0x0045
            r3.A1a()
            X.1mX r1 = r3.A0v
            boolean r0 = r2.BMT(r4)
        L_0x003c:
            r1.setRowSelected(r0)
        L_0x003f:
            X.1fQ r0 = r3.A1j
            java.util.Set r1 = r0.A00
            monitor-enter(r1)
            goto L_0x0050
        L_0x0045:
            android.view.View r0 = r3.A05
            X.C36341k9.A0y(r0)
            X.1mX r1 = r3.A0v
            if (r1 == 0) goto L_0x003f
            r0 = 0
            goto L_0x003c
        L_0x0050:
            r1.clear()     // Catch:{ all -> 0x0055 }
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            return
        L_0x0055:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IR.A22(X.3T1, boolean):void");
    }

    public boolean A25() {
        return this.A2M;
    }

    public boolean A29(C20500xf r7, AnonymousClass3T1 r8, int i, boolean z) {
        if (!A2B(r8, z)) {
            return false;
        }
        if (i <= 1 || r8.A0F != 0 || r8.A1I != 0 || C66013Ui.A0q(r8) || C66013Ui.A0t(r8) || AnonymousClass3M3.A01(r7, r8.A1J.A00)) {
            return true;
        }
        return false;
    }

    public boolean A2C(C64933Qa r2) {
        return getFMessage().A1J.equals(r2);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A1j.A01();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return this.A2b.onKey(this, keyEvent.getKeyCode(), keyEvent);
    }

    public void dispatchSetPressed(boolean z) {
        super.dispatchSetPressed(isPressed());
        for (FrameLayout frameLayout : getInnerFrameLayouts()) {
            if (frameLayout != null) {
                frameLayout.setPressed(isPressed());
                frameLayout.setForeground(getInnerFrameForegroundDrawable());
            }
        }
    }

    public List getAllMessages() {
        return Collections.singletonList(getFMessage());
    }

    public int getBroadcastDrawableId() {
        return R.drawable.broadcast_status_icon;
    }

    public int getCollapseType() {
        return this.A01;
    }

    public int getConfigHash() {
        return this.A01;
    }

    public AnonymousClass1RY getContactPhotosLoader() {
        Activity A002 = C18860tw.A00(getContext());
        if (A002 instanceof C87434Ou) {
            return ((C87434Ou) A002).getContactPhotosLoader();
        }
        return null;
    }

    public TextView getDateView() {
        return this.A0G;
    }

    public ViewGroup getDateWrapper() {
        return this.A07;
    }

    public String getGroupRoleTitle() {
        return getContext().getString(R.string.f12nameremoved);
    }

    public Drawable getInnerFrameForegroundDrawable() {
        Drawable A002;
        int i;
        int i2;
        boolean isPressed = isPressed();
        boolean A062 = C37541mm.A06(this);
        if (isPressed) {
            Context context = getContext();
            if (A062) {
                AnonymousClass00C.A0D(context, 0);
                A002 = AnonymousClass00E.A00(context, R.drawable.balloon_outgoing_frame);
                i = R.attr.f4nameremoved;
                i2 = R.color.f6nameremoved;
            } else {
                AnonymousClass00C.A0D(context, 0);
                A002 = AnonymousClass00E.A00(context, R.drawable.balloon_incoming_frame);
                i = R.attr.f4nameremoved;
                i2 = R.color.f6nameremoved;
            }
            int A012 = C36351kA.A01(context, i, i2);
            C18740tg.A06(A002);
            Drawable A082 = AnonymousClass3UF.A08(A002, A012);
            AnonymousClass00C.A08(A082);
            return A082;
        }
        Context context2 = getContext();
        if (A062) {
            return AnonymousClass3SN.A02(context2);
        }
        return AnonymousClass3SN.A00(context2);
    }

    public Set getInnerFrameLayouts() {
        HashSet A162 = C36441kJ.A16();
        FrameLayout frameLayout = this.A09;
        if (frameLayout != null) {
            A162.add(frameLayout);
        }
        View findViewById = findViewById(R.id.link_preview_frame);
        if (findViewById != null) {
            A162.add(findViewById);
        }
        return A162;
    }

    public Drawable getKeepAnimDrawable() {
        Context context = getContext();
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass3UF.A02(context, R.drawable.message_keep_teal_anim, C36381kD.A02(context));
    }

    public C63663Kx getMessageCommentInfo() {
        return A1T(getFMessage());
    }

    public C88944Uq getMessageReactions() {
        getRowCustomizer();
        AnonymousClass3T1 fMessage = getFMessage();
        this.A0a.A01(fMessage, (Runnable) null, 56);
        return fMessage.A0J;
    }

    public int getMessageType() {
        return getFMessage().A1I;
    }

    public Drawable getPinAnimDrawable() {
        Context context = getContext();
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass3UF.A02(context, R.drawable.vec_message_badge_pinned_anim, C36381kD.A02(context));
    }

    public Drawable getPopupDrawable() {
        Context context = getContext();
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass3UF.A02(context, R.drawable.message_star_teal_anim, C36381kD.A02(context));
    }

    public int getProfilePictureFullWidth() {
        Resources resources = getResources();
        return resources.getDimensionPixelSize(R.dimen.f7nameremoved) + resources.getDimensionPixelSize(R.dimen.f7nameremoved) + resources.getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public int getSecondaryTextColor() {
        boolean A062 = C37541mm.A06(this);
        int i = R.color.f6nameremoved;
        if (A062) {
            i = R.color.f6nameremoved;
        }
        return C36381kD.A05(this, i);
    }

    public int getTopAttributeTextAnchorId() {
        return R.id.quoted_message_holder;
    }

    public boolean isPressed() {
        if (!super.isPressed()) {
            return false;
        }
        C37511mX r0 = this.A0v;
        if (r0 == null || !r0.A02) {
            return true;
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 7) {
            motionEvent.getAction();
        }
        motionEvent.getAction();
        return super.onInterceptHoverEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            motionEvent.getAction();
        }
        motionEvent.getAction();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.A05;
        if (view != null) {
            view.layout(0, 0, getWidth(), getHeight());
        }
        ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView = this.A0w;
        if (conversationRowParticipantHeaderMainView != null && conversationRowParticipantHeaderMainView.getVisibility() == 0) {
            conversationRowParticipantHeaderMainView.A00(C36401kF.A1X(this.A0E));
        }
        ConversationRowParticipantHeaderQuotedView conversationRowParticipantHeaderQuotedView = this.A0x;
        if (!(conversationRowParticipantHeaderQuotedView == null || conversationRowParticipantHeaderQuotedView.getVisibility() != 0 || C012005e.A02(this.A0x, R.id.quoted_bullet_divider).getVisibility() == 0)) {
            this.A0x.A00(C36401kF.A1X(this.A0E));
        }
        ImageView imageView = this.A0A;
        if (imageView != null) {
            int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
            int intrinsicHeight = this.A0A.getDrawable().getIntrinsicHeight();
            View view2 = this.A0b;
            int top = view2.getTop();
            if (this.A0O) {
                paddingTop = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            } else {
                paddingTop = view2.getPaddingTop() + ((AnonymousClass000.A0D(view2, view2.getHeight()) - intrinsicHeight) / 2);
            }
            int i5 = top + paddingTop;
            int A062 = C36441kJ.A06(getResources(), R.dimen.f7nameremoved, C65123Qv.A00(getContext()));
            C89014Ux r1 = this.A0d;
            C18740tg.A06(r1);
            boolean BLr = r1.BLr();
            boolean BNB = r1.BNB();
            if (BLr) {
                BNB = AnonymousClass000.A1S(BNB ? 1 : 0, C37541mm.A06(this) ? 1 : 0);
            }
            ImageView imageView2 = this.A0A;
            if (BNB) {
                imageView2.layout((getWidth() - intrinsicWidth) - A062, i5, getWidth() - A062, intrinsicHeight + i5);
            } else {
                imageView2.layout(A062, i5, intrinsicWidth + A062, intrinsicHeight + i5);
            }
        }
    }

    public void setCacheInflated(boolean z) {
        this.A2H = z;
    }

    public void setConfigHash(int i) {
        this.A01 = i;
    }

    public void setForwardButtonAction(Runnable runnable) {
        this.A2F = runnable;
    }

    public void setIgnorePressedStateUpdates(boolean z) {
        this.A2I = z;
    }

    public void setMaxHeight(int i) {
        this.A02 = i;
    }

    public void setSearchButtonAction(Runnable runnable) {
        this.A2G = runnable;
    }

    public void setSelectable(boolean z) {
        this.A2M = z;
    }
}
