package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.EmojiPopupFooter;
import com.whatsapp.emoji.search.EmojiSearchProvider;

/* renamed from: X.22t  reason: invalid class name */
public class AnonymousClass22t extends C38871qM implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00 = R.drawable.ib_emoji;
    public int A01;
    public int A02;
    public int A03 = R.drawable.ib_keyboard;
    public int A04;
    public ViewGroup A05;
    public C88314Sf A06;
    public C65923Tz A07;
    public EmojiPopupFooter A08;
    public C594934d A09 = new C594934d(true, true);
    public AnonymousClass4QT A0A;
    public AnonymousClass3E4 A0B;
    public AnonymousClass3J6 A0C;
    public C64263Nh A0D;
    public Integer A0E;
    public Runnable A0F;
    public boolean A0G = false;
    public final View.OnClickListener A0H;
    public final View A0I;
    public final AbsListView.OnScrollListener A0J = new C55932vQ(this, 7);
    public final ImageButton A0K;
    public final WaEditText A0L;
    public final EmojiSearchProvider A0M;
    public final Integer A0N;
    public final C88314Sf A0O = new C89604Xe(this, 7);
    public final AnonymousClass1H2 A0P;
    public final C20810yC A0Q;
    public final C18820ts A0R;
    public final C1261362r A0S;
    public final AnonymousClass6O1 A0T;
    public final AnonymousClass1XN A0U;
    public final C19890wg A0V;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass22t(android.app.Activity r11, android.widget.ImageButton r12, X.C19700wN r13, X.C87484Oz r14, com.whatsapp.WaEditText r15, X.C21060yb r16, X.C19420v0 r17, X.C18820ts r18, X.C1261362r r19, X.AnonymousClass6O1 r20, X.AnonymousClass1XN r21, X.AnonymousClass1H2 r22, com.whatsapp.emoji.search.EmojiSearchProvider r23, X.C20810yC r24, X.C19890wg r25, X.AnonymousClass1N2 r26, java.lang.Integer r27, java.lang.Integer r28) {
        /*
            r10 = this;
            r6 = r14
            r3 = r10
            r9 = r26
            r5 = r13
            r4 = r11
            r7 = r16
            r8 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0 = 0
            r10.A0G = r0
            r1 = 1
            X.34d r0 = new X.34d
            r0.<init>(r1, r1)
            r10.A09 = r0
            r0 = 2131231746(0x7f080402, float:1.8079582E38)
            r2 = 2131231746(0x7f080402, float:1.8079582E38)
            r10.A00 = r0
            r0 = 2131231748(0x7f080404, float:1.8079586E38)
            r10.A03 = r0
            r1 = 7
            X.4Xe r0 = new X.4Xe
            r0.<init>(r10, r1)
            r10.A0O = r0
            X.2vQ r0 = new X.2vQ
            r0.<init>(r10, r1)
            r10.A0J = r0
            r0 = 32
            X.3Y0 r1 = new X.3Y0
            r1.<init>(r10, r0)
            r10.A0H = r1
            android.view.View r6 = (android.view.View) r6
            r10.A0I = r6
            r0 = r24
            r10.A0Q = r0
            r0 = r22
            r10.A0P = r0
            r0 = r21
            r10.A0U = r0
            r0 = r18
            r10.A0R = r0
            r0 = r19
            r10.A0S = r0
            r0 = r23
            r10.A0M = r0
            r0 = r25
            r10.A0V = r0
            r10.A0K = r12
            r10.A0L = r15
            r0 = r27
            r10.A0N = r0
            r0 = r28
            r10.A0E = r0
            r0 = r20
            r10.A0T = r0
            android.view.ViewTreeObserver r0 = r6.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r10)
            if (r12 == 0) goto L_0x007f
            r0 = 2131101055(0x7f06057f, float:1.7814509E38)
            X.AnonymousClass3UF.A0B(r11, r12, r2, r0)
            r12.setOnClickListener(r1)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass22t.<init>(android.app.Activity, android.widget.ImageButton, X.0wN, X.4Oz, com.whatsapp.WaEditText, X.0yb, X.0v0, X.0ts, X.62r, X.6O1, X.1XN, X.1H2, com.whatsapp.emoji.search.EmojiSearchProvider, X.0yC, X.0wg, X.1N2, java.lang.Integer, java.lang.Integer):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r3.A00 != 0) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E() {
        /*
            r6 = this;
            r4 = 0
            r6.A02 = r4
            java.lang.Class r1 = r6.getClass()
            java.lang.Class<X.22t> r0 = X.AnonymousClass22t.class
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r2 = X.C36371kC.A0o()
            java.lang.Integer r1 = r6.A0N
            java.lang.Integer r0 = r6.A0E
            r6.A0I(r2, r1, r0)
        L_0x001a:
            r6.A09()
            X.4Oz r0 = r6.A04
            r0.setKeyboardPopup(r6)
            X.3Tz r0 = r6.A07
            if (r0 != 0) goto L_0x0029
            r6.A0G()
        L_0x0029:
            r3 = r6
            boolean r0 = r6 instanceof X.AnonymousClass2M8
            if (r0 == 0) goto L_0x006b
            X.2M8 r3 = (X.AnonymousClass2M8) r3
            X.34d r0 = r3.A09
            boolean r0 = r0.A01
            r1 = 0
            if (r0 == 0) goto L_0x003c
            int r2 = r3.A00
            r0 = 1
            if (r2 == 0) goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            r3.A0J(r0)
            X.34d r0 = r3.A09
            boolean r0 = r0.A00
            r2 = 8
            if (r0 != 0) goto L_0x004a
            r1 = 8
        L_0x004a:
            X.39w r0 = r3.A0B
            X.36d r0 = r0.A01
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "emojiKeyboardViewController"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0057:
            X.00T r0 = r0.A02
            X.C36341k9.A1R(r0, r1)
            X.3mU r0 = r3.A0C
            if (r0 == 0) goto L_0x0078
            X.3FB r0 = r0.A01
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = "gifKeyboardView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x006b:
            X.34d r0 = r6.A09
            boolean r0 = r0.A01
            r6.A0J(r0)
            goto L_0x0090
        L_0x0073:
            X.00T r0 = r0.A04
            X.C36341k9.A1R(r0, r1)
        L_0x0078:
            X.3HE r0 = r3.A0D
            if (r0 == 0) goto L_0x0083
            X.399 r0 = r0.A02
            X.00T r0 = r0.A02
            X.C36341k9.A1R(r0, r1)
        L_0x0083:
            X.3H8 r1 = r3.A0A
            if (r1 == 0) goto L_0x0090
            X.34d r0 = r3.A09
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x011b
            r1.A01(r2)
        L_0x0090:
            X.3Tz r5 = r6.A07
            android.os.HandlerThread r0 = X.C65923Tz.A0W
            if (r0 != 0) goto L_0x00c2
            java.lang.String r1 = "Emoji Thread"
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r1)
            X.C65923Tz.A0W = r0
            r0.start()
            android.content.Context r0 = r5.A0A
            android.content.Context r3 = r0.getApplicationContext()
            X.1H2 r2 = r5.A0M
            android.os.HandlerThread r0 = X.C65923Tz.A0W
            android.os.Looper r1 = r0.getLooper()
            X.1lo r0 = new X.1lo
            r0.<init>(r3, r1, r2)
            X.C65923Tz.A0Y = r0
            android.os.Looper r1 = r3.getMainLooper()
            X.1lk r0 = new X.1lk
            r0.<init>(r1)
            X.C65923Tz.A0X = r0
        L_0x00c2:
            androidx.viewpager.widget.ViewPager r0 = r5.A0K
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r5.A0G
            r1.addOnGlobalLayoutListener(r0)
            r6.A0F()
            r1 = -1
            int r0 = r6.A0D(r1)
            r6.A01 = r0
            r6.setHeight(r0)
            r6.setWidth(r1)
            android.view.View r3 = r6.A0I
            if (r3 == 0) goto L_0x00f9
            r1 = 8388659(0x800033, float:1.1755015E-38)
            r0 = 1000000(0xf4240, float:1.401298E-39)
            r6.showAtLocation(r3, r1, r4, r0)
            java.util.Objects.requireNonNull(r3)
            r0 = 48
            X.3wU r2 = new X.3wU
            r2.<init>((java.lang.Object) r3, (int) r0)
            r0 = 60
            r3.postDelayed(r2, r0)
        L_0x00f9:
            r6.BoZ()
            com.whatsapp.WaEditText r2 = r6.A0L
            if (r2 == 0) goto L_0x010e
            r0 = 2
            X.72k r1 = new X.72k
            r1.<init>(r6, r0)
            X.4a0 r0 = new X.4a0
            r0.<init>(r2, r4)
            X.C38871qM.A01(r0, r6, r2, r1)
        L_0x010e:
            X.62r r1 = r6.A0S
            java.lang.String r0 = r1.A00
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = X.C36361kB.A0l()
            r1.A00 = r0
        L_0x011a:
            return
        L_0x011b:
            int r0 = X.AnonymousClass2M8.A03(r3)
            r1.A01(r0)
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass22t.A0E():void");
    }

    public void A0F() {
        ImageButton imageButton;
        if (this.A01 != 1 && (imageButton = this.A0K) != null) {
            Activity activity = this.A03;
            AnonymousClass3UF.A0B(activity, imageButton, this.A03, R.color.f6nameremoved);
            C36331k8.A0q(activity, imageButton, R.string.f12nameremoved);
            imageButton.setOnClickListener(this.A0H);
            this.A01 = 1;
        }
    }

    public void A0G() {
        EmojiSearchProvider emojiSearchProvider;
        C158327gk r0;
        Activity activity = this.A03;
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        activity.getLayoutInflater().inflate(R.layout.f9nameremoved, relativeLayout, true);
        ViewGroup A0P2 = C36411kG.A0P(relativeLayout, R.id.emoji_view);
        this.A05 = A0P2;
        A0P2.getLayoutParams().height = -1;
        this.A05.setVisibility(0);
        setContentView(relativeLayout);
        relativeLayout.setLayoutDirection(3);
        C38871qM.A00(this);
        int i = 8;
        this.A05.findViewById(R.id.fallback_divider).setVisibility(8);
        C20810yC r16 = this.A0Q;
        C19700wN r17 = this.A09;
        AnonymousClass1H2 r15 = this.A0P;
        AnonymousClass1XN r14 = this.A0U;
        C18820ts r12 = this.A0R;
        C1261362r r11 = this.A0S;
        C19420v0 r10 = this.A06;
        C19890wg r8 = this.A0V;
        ViewGroup viewGroup = this.A05;
        View view = this.A0I;
        AnonymousClass1XN r21 = r14;
        C19420v0 r18 = r10;
        C18820ts r19 = r12;
        AbsListView.OnScrollListener onScrollListener = this.A0J;
        View view2 = view;
        ViewGroup viewGroup2 = viewGroup;
        C65923Tz r122 = new C65923Tz(activity, view2, viewGroup2, onScrollListener, r17, r18, r19, r11, r21, r15, r16, r8);
        this.A07 = r122;
        r122.A02 = this.A0O;
        EmojiPopupFooter emojiPopupFooter = (EmojiPopupFooter) this.A05.findViewById(R.id.footer_toolbar);
        this.A08 = emojiPopupFooter;
        emojiPopupFooter.setClickable(true);
        A0J(true);
        View findViewById = this.A05.findViewById(R.id.gif_tab);
        View findViewById2 = this.A05.findViewById(R.id.emoji_tab);
        View findViewById3 = this.A05.findViewById(R.id.search_button);
        findViewById.setVisibility(8);
        findViewById2.setVisibility(8);
        if (this instanceof AnonymousClass2M8) {
            AnonymousClass2M8 r2 = (AnonymousClass2M8) this;
            emojiSearchProvider = r2.A0M;
            r0 = new C75413nB(findViewById3, r2);
        } else {
            emojiSearchProvider = this.A0M;
            r0 = new C75403nA(findViewById3);
        }
        emojiSearchProvider.A00 = r0;
        EmojiSearchProvider emojiSearchProvider2 = this.A0M;
        if (emojiSearchProvider2.A02) {
            i = 0;
        }
        findViewById3.setVisibility(i);
        emojiSearchProvider2.A01((Integer) null);
        C48742hy.A01(findViewById3, this, 31);
        C36341k9.A10(this.A05, R.id.delete_symbol_tb, 0);
        setTouchInterceptor(new C53912s6(this, 5));
        setFocusable(false);
    }

    public void A0H(C88314Sf r3) {
        this.A06 = r3;
        C65923Tz r1 = this.A07;
        if (r1 != null) {
            r1.A02 = this.A0O;
        }
    }

    public void A0I(Integer num, Integer num2, Integer num3) {
        if (!this.A0G) {
            this.A0G = true;
            this.A0T.A03(num3, 20, num.intValue(), num2.intValue(), false);
        }
    }

    public void A0J(boolean z) {
        ImageView imageView = this.A07.A0J;
        if (imageView != null) {
            imageView.setVisibility(C36351kA.A00(z ? 1 : 0));
        }
    }

    public void BoZ() {
        if (this.A08.getVisibility() != 0) {
            this.A08.setVisibility(0);
        }
        Animation animation = this.A08.getAnimation();
        if (animation instanceof C37651mz) {
            animation.cancel();
        }
        this.A08.setTopOffset(0);
    }

    public void onGlobalLayout() {
        boolean A002;
        if (AnonymousClass000.A0U(this.A03).keyboard != 1) {
            A002 = false;
        } else {
            A002 = AnonymousClass1N2.A00(this.A0I);
        }
        this.A00 = A002 ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r2.A0E.A0E(3403) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A() {
        /*
            r5 = this;
            super.A0A()
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r5.A0M
            r4 = 0
            r0.A00 = r4
            r2 = r5
            boolean r0 = r5 instanceof X.AnonymousClass2M8
            if (r0 == 0) goto L_0x0046
            X.2M8 r2 = (X.AnonymousClass2M8) r2
            X.3HE r0 = r2.A0D
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0024
            X.0yC r1 = r2.A0E
            r0 = 3403(0xd4b, float:4.769E-42)
            boolean r1 = r1.A0E(r0)
            r0 = 2
            if (r1 == 0) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            X.AnonymousClass2M8.A06(r2, r0)
        L_0x0028:
            X.3Tz r2 = r5.A07
            if (r2 == 0) goto L_0x003e
            android.view.View r1 = r2.A0E
            r0 = 8
            r1.setVisibility(r0)
            androidx.viewpager.widget.ViewPager r0 = r2.A0K
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r2.A0G
            r1.removeGlobalOnLayoutListener(r0)
        L_0x003e:
            X.62r r0 = r5.A0S
            r0.A00 = r4
            r0 = 0
            r5.A0G = r0
            return
        L_0x0046:
            int r0 = r5.A01
            if (r0 == 0) goto L_0x0028
            android.widget.ImageButton r3 = r5.A0K
            if (r3 == 0) goto L_0x0028
            android.app.Activity r2 = r5.A03
            int r1 = r5.A00
            r0 = 2131101055(0x7f06057f, float:1.7814509E38)
            X.AnonymousClass3UF.A0B(r2, r3, r1, r0)
            r0 = 2131896537(0x7f1228d9, float:1.9427938E38)
            X.C36331k8.A0q(r2, r3, r0)
            android.view.View$OnClickListener r0 = r5.A0H
            r3.setOnClickListener(r0)
            r0 = 0
            r5.A01 = r0
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass22t.A0A():void");
    }
}
