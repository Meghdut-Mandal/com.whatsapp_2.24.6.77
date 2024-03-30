package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;

/* renamed from: X.2M8  reason: invalid class name */
public final class AnonymousClass2M8 extends AnonymousClass22t implements AnonymousClass4QD {
    public int A00;
    public View A01;
    public AnonymousClass11F A02;
    public C78053rU A03;
    public AnonymousClass5H9 A04;
    public boolean A05 = false;
    public boolean A06;
    public View A07;
    public final AnonymousClass0UE A08 = new C89144Vk(this, 3);
    public final C21100yf A09;
    public final AnonymousClass3H8 A0A;
    public final C609239w A0B;
    public final C74983mU A0C;
    public final AnonymousClass3HE A0D;
    public final C20810yC A0E;
    public final AnonymousClass1BF A0F;
    public final C24251Bs A0G;
    public final C161317mY A0H = new C76423oq(this);
    public final C23871Ae A0I;
    public final C19730wQ A0J;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r14 != 0) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (r14 != 0) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.AnonymousClass2M8 r13, int r14) {
        /*
            r11 = 1
            if (r14 == 0) goto L_0x0011
            if (r14 == r11) goto L_0x0011
            r0 = 2
            if (r14 != r0) goto L_0x00ac
            X.3HE r0 = r13.A0D
            if (r0 == 0) goto L_0x0010
            X.5H9 r0 = r0.A05
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r14 = 0
        L_0x0011:
            X.62r r2 = r13.A0S
            int r1 = r13.A00
            r0 = 4
            r2.A00(r1, r14, r0)
            r10 = 8
            r1 = 1
            r7 = 8
            if (r14 != r11) goto L_0x0021
            r7 = 0
        L_0x0021:
            r2 = 2
            r5 = 0
            if (r14 == r2) goto L_0x002a
            r5 = 8
            r8 = 0
            if (r14 == 0) goto L_0x002c
        L_0x002a:
            r8 = 8
        L_0x002c:
            r4 = 3
            r3 = 8
            if (r14 != r4) goto L_0x0032
            r3 = 0
        L_0x0032:
            android.view.View r9 = r13.A07
            r6 = 0
            if (r14 == 0) goto L_0x0039
            if (r14 == r11) goto L_0x0041
        L_0x0039:
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r13.A0M
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0041
            r6 = 8
        L_0x0041:
            r9.setVisibility(r6)
            boolean r0 = r13.A08()
            if (r0 == 0) goto L_0x009e
            android.view.View r6 = r13.A01
            if (r14 == 0) goto L_0x009b
            r0 = 0
        L_0x004f:
            r6.setVisibility(r0)
        L_0x0052:
            X.34d r0 = r13.A09
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x005b
            r0 = 1
            if (r14 == 0) goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            r13.A0J(r0)
            com.whatsapp.WaEditText r0 = r13.A0L
            if (r0 == 0) goto L_0x0068
            if (r14 != 0) goto L_0x0097
            r0.requestFocus()
        L_0x0068:
            android.view.View r0 = r13.getContentView()
            android.content.Context r9 = r0.getContext()
            r6 = 2130969812(0x7f0404d4, float:1.7548316E38)
            r0 = 2131101064(0x7f060588, float:1.7814527E38)
            int r6 = X.C224514j.A00(r9, r6, r0)
            boolean r0 = X.AnonymousClass000.A1Q(r14)
            X.39w r10 = r13.A0B
            r11 = 2131232253(0x7f0805fd, float:1.808061E38)
            r12 = 2131101065(0x7f060589, float:1.781453E38)
            if (r0 == 0) goto L_0x008c
            r11 = 2131232255(0x7f0805ff, float:1.8080614E38)
            r12 = r6
        L_0x008c:
            X.36d r0 = r10.A01
            if (r0 != 0) goto L_0x00b7
            java.lang.String r0 = "emojiKeyboardViewController"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0097:
            r0.clearFocus()
            goto L_0x0068
        L_0x009b:
            r0 = 8
            goto L_0x004f
        L_0x009e:
            android.view.View r0 = r13.A01
            r0.setVisibility(r10)
            android.view.ViewGroup r6 = r13.A05
            r0 = 2131434361(0x7f0b1b79, float:1.8490534E38)
            X.C36341k9.A10(r6, r0, r5)
            goto L_0x0052
        L_0x00ac:
            r0 = 3
            if (r14 != r0) goto L_0x0010
            int r0 = A03(r13)
            if (r0 != 0) goto L_0x0010
            goto L_0x0011
        L_0x00b7:
            boolean r9 = X.C222013h.A07
            X.00T r0 = r0.A02
            if (r9 == 0) goto L_0x00cb
            A07(r0, r12)
        L_0x00c0:
            X.36d r0 = r10.A01
            if (r0 != 0) goto L_0x00d5
            java.lang.String r0 = "emojiKeyboardViewController"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00cb:
            java.lang.Object r0 = r0.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageResource(r11)
            goto L_0x00c0
        L_0x00d5:
            X.00T r0 = r0.A01
            X.C36341k9.A1R(r0, r8)
            X.36d r0 = r10.A01
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = "emojiKeyboardViewController"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00e5:
            X.00T r0 = r0.A00
            X.C36341k9.A1R(r0, r8)
            X.3mU r9 = r13.A0C
            if (r9 == 0) goto L_0x013c
            r10 = 2131232327(0x7f080647, float:1.808076E38)
            r8 = 2131101065(0x7f060589, float:1.781453E38)
            if (r14 != r1) goto L_0x00fa
            r10 = 2131232333(0x7f08064d, float:1.8080772E38)
            r8 = r6
        L_0x00fa:
            X.3FB r0 = r9.A01
            if (r0 != 0) goto L_0x0105
            java.lang.String r0 = "gifKeyboardView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0105:
            boolean r1 = X.C222013h.A07
            X.00T r0 = r0.A04
            if (r1 == 0) goto L_0x0119
            A07(r0, r8)
        L_0x010e:
            X.3FB r0 = r9.A01
            if (r0 != 0) goto L_0x0123
            java.lang.String r0 = "gifKeyboardView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0119:
            java.lang.Object r0 = r0.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageResource(r10)
            goto L_0x010e
        L_0x0123:
            android.view.View r0 = r0.A01
            if (r0 == 0) goto L_0x012a
            r0.setVisibility(r7)
        L_0x012a:
            X.3FB r0 = r9.A01
            if (r0 != 0) goto L_0x0135
            java.lang.String r0 = "gifKeyboardView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0135:
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x013c
            r0.setVisibility(r7)
        L_0x013c:
            X.3HE r8 = r13.A0D
            if (r8 == 0) goto L_0x0178
            boolean r7 = X.AnonymousClass000.A1S(r14, r2)
            X.5H9 r1 = r8.A05
            if (r1 == 0) goto L_0x0161
            androidx.viewpager.widget.ViewPager r0 = r1.A07
            r0.setVisibility(r5)
            X.6xB r2 = r1.A0b
            if (r2 == 0) goto L_0x0161
            android.view.View r0 = r2.A08
            r0.setVisibility(r5)
            if (r5 != 0) goto L_0x0161
            int r1 = r2.A01
            if (r1 < 0) goto L_0x0161
            androidx.recyclerview.widget.LinearLayoutManager r0 = r2.A09
            r0.A17(r1)
        L_0x0161:
            r5 = 2131232824(0x7f080838, float:1.8081768E38)
            r2 = 2131101065(0x7f060589, float:1.781453E38)
            if (r7 == 0) goto L_0x016d
            r5 = 2131232826(0x7f08083a, float:1.8081772E38)
            r2 = r6
        L_0x016d:
            X.399 r0 = r8.A02
            boolean r1 = X.C222013h.A07
            X.00T r0 = r0.A03
            if (r1 == 0) goto L_0x01c5
            A07(r0, r2)
        L_0x0178:
            X.3H8 r5 = r13.A0A
            if (r5 == 0) goto L_0x01b1
            r2 = 2131231952(0x7f0804d0, float:1.808E38)
            if (r14 == r4) goto L_0x0187
            r2 = 2131231950(0x7f0804ce, float:1.8079995E38)
            r6 = 2131101065(0x7f060589, float:1.781453E38)
        L_0x0187:
            X.38A r1 = r5.A01
            if (r1 == 0) goto L_0x019c
            boolean r0 = X.C222013h.A07
            if (r0 == 0) goto L_0x01bf
            android.widget.ImageView r1 = r1.A03
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r0 = X.AnonymousClass00F.A04(r0, r6)
            X.AnonymousClass06T.A00(r0, r1)
        L_0x019c:
            X.5HA r1 = r5.A04
            if (r1 == 0) goto L_0x01ac
            androidx.viewpager.widget.ViewPager r0 = r1.A07
            r0.setVisibility(r3)
            X.6xA r0 = r1.A0K
            android.view.View r0 = r0.A02
            r0.setVisibility(r3)
        L_0x01ac:
            if (r14 != r4) goto L_0x01b1
            r5.A00()
        L_0x01b1:
            r13.A00 = r14
            X.0v0 r0 = r13.A06
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "emoji_popup_window_tab_state"
            X.C36341k9.A0v(r1, r0, r14)
            return
        L_0x01bf:
            android.widget.ImageView r0 = r1.A03
            r0.setImageResource(r2)
            goto L_0x019c
        L_0x01c5:
            java.lang.Object r0 = r0.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageResource(r5)
            goto L_0x0178
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2M8.A05(X.2M8, int):void");
    }

    public static void A04(AnonymousClass2M8 r4) {
        ImageButton imageButton = r4.A0K;
        if (imageButton != null) {
            Activity activity = r4.A03;
            AnonymousClass3UF.A0B(activity, imageButton, r4.A00, R.color.f6nameremoved);
            C36331k8.A0q(activity, imageButton, R.string.f12nameremoved);
            imageButton.setOnClickListener(r4.A0H);
        }
    }

    public static void A06(AnonymousClass2M8 r7, int i) {
        ImageButton imageButton = r7.A0K;
        if (imageButton == null) {
            return;
        }
        if (i != 0) {
            int i2 = r7.A01;
            if (i != 1) {
                if (i2 != 2) {
                    Activity activity = r7.A03;
                    AnonymousClass3UF.A0B(activity, imageButton, R.drawable.sticker_rec, C224514j.A00(activity, R.attr.f4nameremoved, R.color.f6nameremoved));
                    C36331k8.A0q(activity, imageButton, R.string.f12nameremoved);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageButton, "alpha", new float[]{0.7f, 1.0f});
                    ofFloat.setDuration(100);
                    ofFloat.start();
                    AnonymousClass3Y2.A00(imageButton, r7, 17);
                    r7.A01 = 2;
                }
            } else if (i2 != 1) {
                r7.A0F();
            }
        } else {
            int i3 = r7.A01;
            if (i3 != 0) {
                if (i3 == 2) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageButton, "alpha", new float[]{1.0f, 0.7f});
                    ofFloat2.setDuration(75);
                    ofFloat2.addListener(new C89394Wj(r7, 5));
                    ofFloat2.start();
                } else {
                    A04(r7);
                }
                r7.A01 = 0;
            }
        }
    }

    private boolean A08() {
        if (this.A0J.A0L() || !this.A0E.A0E(1396)) {
            return false;
        }
        return true;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    public void A0E() {
        /*
            r7 = this;
            X.0v0 r0 = r7.A06
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "emoji_popup_window_tab_state"
            int r3 = X.C36371kC.A01(r1, r0)
            r2 = 4
            if (r3 == 0) goto L_0x001b
            r0 = 1
            r1 = 6
            if (r3 == r0) goto L_0x005c
            r0 = 2
            r1 = 10
            if (r3 == r0) goto L_0x005c
            r1 = 3
            if (r3 == r1) goto L_0x005c
        L_0x001b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x001f:
            java.lang.Integer r1 = r7.A0N
            java.lang.Integer r0 = r7.A0E
            r7.A0I(r2, r1, r0)
            super.A0E()
            X.3mU r0 = r7.A0C
            if (r0 == 0) goto L_0x0030
            r0.A00()
        L_0x0030:
            X.3HE r4 = r7.A0D
            if (r4 == 0) goto L_0x0082
            X.5H9 r6 = r4.A05
            if (r6 == 0) goto L_0x0082
            androidx.viewpager.widget.ViewPager r0 = r6.A07
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r6.A0Q
            r1.addOnGlobalLayoutListener(r0)
            X.6Xz r0 = r6.A0c
            r0.A03 = r6
            r0.A04()
            X.0yW r1 = r6.A0U
            X.2N2 r0 = new X.2N2
            r0.<init>()
            r1.Bly(r0)
            X.1Au r0 = r6.A0V
            X.1At r1 = r0.A01
            java.lang.Object r5 = r1.A03
            monitor-enter(r5)
            goto L_0x0061
        L_0x005c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            goto L_0x001f
        L_0x0061:
            android.content.SharedPreferences r0 = X.C24021At.A00(r1)     // Catch:{ all -> 0x007a }
            java.lang.String r3 = "sticker_picker_opened_count"
            int r2 = X.C36371kC.A01(r0, r3)     // Catch:{ all -> 0x007a }
            android.content.SharedPreferences r0 = X.C24021At.A00(r1)     // Catch:{ all -> 0x007c }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x007c }
            int r0 = r2 + 1
            X.C36341k9.A0v(r1, r3, r0)     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            goto L_0x007f
        L_0x007a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0
        L_0x007f:
            r0 = 1
            r6.A0E = r0
        L_0x0082:
            X.3H8 r0 = r7.A0A
            if (r0 == 0) goto L_0x009f
            X.5HA r2 = r0.A04
            if (r2 == 0) goto L_0x009f
            androidx.viewpager.widget.ViewPager r0 = r2.A07
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r2.A0C
            r1.addOnGlobalLayoutListener(r0)
            X.6Xz r0 = r2.A0J
            r0.A03 = r2
            r0.A04()
            r0 = 1
            r2.A06 = r0
        L_0x009f:
            if (r4 == 0) goto L_0x00c2
            boolean r0 = r4.A01()
            if (r0 == 0) goto L_0x00c2
            X.5H9 r2 = r4.A05
            if (r2 == 0) goto L_0x00c2
            int r1 = r7.A00
            r0 = 2
            if (r1 != r0) goto L_0x00bd
            X.6x9 r0 = r2.A0C
            if (r0 != 0) goto L_0x00c3
            r1 = 0
        L_0x00b5:
            java.lang.String r0 = "contextual_suggestion"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c2
        L_0x00bd:
            java.lang.String r0 = "contextual_suggestion"
            r7.A0M(r0)
        L_0x00c2:
            return
        L_0x00c3:
            java.lang.String r1 = r0.getId()
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2M8.A0E():void");
    }

    public void A0G() {
        super.A0G();
        C600136d r3 = new C600136d(this.A05);
        C609239w r0 = this.A0B;
        r0.A00 = this;
        r0.A01 = r3;
        C33541fX r2 = r0.A05;
        AnonymousClass00C.A0D(r2, 0);
        C36401kF.A0F(r3.A02).setOnClickListener(r2);
        this.A07 = this.A05.findViewById(R.id.search_button);
        this.A01 = getContentView().findViewById(R.id.store_button_view);
        this.A07.setVisibility(C36351kA.A00(this.A0M.A02 ? 1 : 0));
        C48742hy.A01(this.A07, this, 39);
        C74983mU r8 = this.A0C;
        if (r8 != null) {
            AnonymousClass0UE r32 = this.A08;
            AnonymousClass3FB r9 = new AnonymousClass3FB(this.A03, this.A05);
            C78053rU r02 = this.A03;
            AnonymousClass00C.A0D(r32, 0);
            r8.A01 = r9;
            r8.A04 = r02;
            r8.A00 = this;
            C36401kF.A0F(r9.A04).setOnClickListener(r8.A08);
            AnonymousClass2UT r7 = new AnonymousClass2UT(r8);
            r8.A03 = r7;
            ViewGroup viewGroup = r9.A03;
            r9.A01 = C012005e.A02(viewGroup, R.id.gif_trending);
            r9.A00 = C012005e.A02(viewGroup, R.id.gif_trending_additions);
            AnonymousClass00T r5 = r9.A05;
            ((RecyclerView) r5.getValue()).A0v(r32);
            ((RecyclerView) r5.getValue()).A0t(new C89124Vi(r9.A02.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 1));
            C48902iF.A00(C36401kF.A0F(r9.A08), r7, r9, 2);
            ((RecyclerView) r5.getValue()).setAdapter(r7);
            AnonymousClass3FB r03 = r8.A01;
            if (r03 == null) {
                throw C36331k8.A0d("gifKeyboardView");
            }
            C36341k9.A1R(r03.A04, 0);
        }
        AnonymousClass3H8 r52 = this.A0A;
        if (r52 != null) {
            AnonymousClass38A r82 = new AnonymousClass38A(this.A05);
            AnonymousClass3BO r33 = r52.A06;
            C20810yC r18 = this.A0E;
            Activity activity = this.A03;
            AnonymousClass17Y r30 = r33.A01;
            C19730wQ r17 = r33.A02;
            C19770wU r16 = r33.A0G;
            ViewGroup viewGroup2 = r82.A02;
            C23871Ae r14 = this.A0I;
            C18820ts r12 = r33.A05;
            AnonymousClass1AP r11 = r52.A08;
            AnonymousClass3N8 r10 = r33.A0B;
            StickerPackDownloader stickerPackDownloader = r33.A0F;
            AnonymousClass0UE r6 = this.A08;
            AnonymousClass1HA r22 = r52.A07;
            AnonymousClass6WF r15 = r33.A0A;
            C19770wU r28 = r16;
            AnonymousClass6WF r20 = r15;
            C23871Ae r21 = r14;
            Activity activity2 = activity;
            ViewGroup viewGroup3 = viewGroup2;
            AnonymousClass0UE r142 = r6;
            AnonymousClass17Y r152 = r30;
            AnonymousClass5HA r112 = new AnonymousClass5HA(activity2, viewGroup3, r142, r152, r17, r12, r18, this.A02, r20, r21, r10, (C104665Ar) C36411kG.A0v(r33.A0H), r22, r11, (C133356Xz) r33.A0I.getValue(), stickerPackDownloader, r28);
            r52.A01 = r82;
            r52.A02 = this;
            r52.A04 = r112;
            C33541fX r23 = r52.A0C;
            AnonymousClass00C.A0D(r23, 0);
            r82.A03.setOnClickListener(r23);
            if (r52.A03 != null) {
                r112.A04 = r52.A05;
            }
            r52.A01(A03(this));
        }
        AnonymousClass3HE r34 = this.A0D;
        if (r34 != null) {
            ViewGroup viewGroup4 = this.A05;
            Activity activity3 = this.A03;
            AnonymousClass399 r4 = new AnonymousClass399(activity3, viewGroup4);
            AnonymousClass3BO r62 = r34.A06;
            C20810yC r35 = r62.A06;
            C19700wN r342 = r62.A00;
            C19730wQ r332 = r62.A02;
            C19770wU r282 = r62.A0G;
            C21010yW r172 = r62.A07;
            AnonymousClass005 r29 = r34.A0J;
            C18820ts r322 = r62.A05;
            AnonymousClass1BB r222 = r34.A0B;
            AnonymousClass1AP r53 = r34.A0C;
            C19420v0 r31 = r62.A04;
            StickerPackDownloader stickerPackDownloader2 = r62.A0F;
            C24031Au r162 = r34.A09;
            ViewGroup viewGroup5 = r4.A00;
            C78053rU r143 = this.A03;
            AnonymousClass1HA r13 = r34.A0A;
            AnonymousClass0UE r122 = this.A08;
            C133356Xz r113 = r34.A0H;
            C95494lK r102 = r34.A0F;
            Activity activity4 = activity3;
            ViewGroup viewGroup6 = viewGroup5;
            AnonymousClass0UE r114 = r122;
            C19700wN r123 = r342;
            C19730wQ r132 = r332;
            C19420v0 r144 = r31;
            C18820ts r153 = r322;
            C20810yC r163 = r35;
            AnonymousClass5H9 r83 = new AnonymousClass5H9(activity4, viewGroup6, r114, r123, r132, r144, r153, r163, r172, this.A02, r143, r162, r13, r222, r53, r34.A0E, r102, r113, stickerPackDownloader2, r282, r29, this.A06);
            this.A04 = r83;
            C78053rU r24 = this.A03;
            boolean z = this.A09.A00;
            r34.A03 = r24;
            r34.A02 = r4;
            r34.A05 = r83;
            C33541fX r25 = r34.A0I;
            AnonymousClass00C.A0D(r25, 0);
            C36401kF.A0F(r4.A03).setOnClickListener(r25);
            if (r34.A04 != null) {
                r83.A08 = r34.A0D;
                if (!C36341k9.A0E(r31).getBoolean("sticker_picker_initial_download", false)) {
                    r53.A0N.Box(new C107035Mh(new C47652fN(r34, z), r53), new Object[0]);
                } else {
                    r34.A00(z);
                }
            }
            if (r34.A01()) {
                A05((AnonymousClass2M8) r34.A01, 2);
            }
        }
        A05(this, C36371kC.A01(C36341k9.A0E(this.A06), "emoji_popup_window_tab_state"));
        if (A08()) {
            this.A0G.registerObserver(this.A0H);
            this.A0I.A01(2);
        }
    }

    public void A0L(C88234Rx r2) {
        AnonymousClass3HE r0 = this.A0D;
        if (r0 != null) {
            r0.A04 = r2;
        }
        AnonymousClass3H8 r02 = this.A0A;
        if (r02 != null) {
            r02.A03 = r2;
        }
    }

    public void A0M(String str) {
        AnonymousClass3HE r3 = this.A0D;
        if (r3 != null) {
            if (r3.A05 == null || !isShowing()) {
                A0I(C36401kF.A0j(), this.A0N, this.A0E);
                A0E();
            }
            A05(this, 2);
            AnonymousClass5H9 r0 = r3.A05;
            if (r0 != null) {
                r0.A09(str);
            }
        }
    }

    public void dismiss() {
        AnonymousClass5H9 r2;
        AnonymousClass3HE r0 = this.A0D;
        if (!(r0 == null || (r2 = r0.A05) == null)) {
            r2.A07.getViewTreeObserver().removeGlobalOnLayoutListener(r2.A0Q);
            r2.A0E = false;
        }
        C74983mU r3 = this.A0C;
        if (r3 != null) {
            r3.A05.A0G.Boy(new C81113wU((Object) r3, 25));
        }
        C19420v0 r02 = this.A06;
        C36341k9.A0v(C19420v0.A00(r02), "emoji_popup_window_tab_state", this.A00);
        super.dismiss();
    }

    public static int A03(AnonymousClass2M8 r1) {
        if (r1.A08()) {
            boolean A012 = r1.A0F.A01();
            if (Boolean.valueOf(A012) == null || !A012) {
                return 8;
            }
            return 0;
        }
        return 8;
    }

    public static void A07(AnonymousClass00T r2, int i) {
        AnonymousClass06T.A00(AnonymousClass00F.A04(((View) r2.getValue()).getContext(), i), (ImageView) r2.getValue());
    }

    public void A0K() {
        if (isShowing()) {
            dismiss();
        }
        AnonymousClass3HE r3 = this.A0D;
        if (r3 != null) {
            AnonymousClass5H9 r1 = r3.A05;
            if (r1 != null) {
                C133356Xz r2 = r1.A0c;
                r2.A03 = null;
                r2.A01 = null;
                r2.A00 = null;
                r1.A07 = null;
                r2.A0B.unregisterObserver(r2.A0A);
            }
            ObjectAnimator objectAnimator = r3.A00;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                r3.A00 = null;
            }
            r3.A04 = null;
            r3.A01 = null;
        }
        AnonymousClass3H8 r32 = this.A0A;
        if (r32 != null) {
            AnonymousClass5HA r0 = r32.A04;
            if (r0 != null) {
                C133356Xz r22 = r0.A0J;
                r22.A03 = null;
                r22.A01 = null;
                r22.A00 = null;
                r22.A0B.unregisterObserver(r22.A09);
                r22.A0B.unregisterObserver(r22.A08);
            }
            ObjectAnimator objectAnimator2 = r32.A00;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                r32.A00 = null;
            }
            r32.A03 = null;
            r32.A02 = null;
        }
        C74983mU r12 = this.A0C;
        if (r12 != null) {
            r12.A02 = null;
            r12.A00 = null;
        }
        if (A08()) {
            this.A0G.unregisterObserver(this.A0H);
            C23871Ae r13 = this.A0I;
            r13.A02 = null;
            r13.A00 = null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2M8(android.app.Activity r26, android.widget.ImageButton r27, X.C19700wN r28, com.whatsapp.KeyboardPopupLayout r29, X.C19730wQ r30, X.C21100yf r31, com.whatsapp.WaEditText r32, X.C21060yb r33, X.C19420v0 r34, X.C18820ts r35, X.AnonymousClass3H8 r36, X.C609239w r37, X.C74983mU r38, X.AnonymousClass3HE r39, X.C1261362r r40, X.AnonymousClass6O1 r41, X.C20810yC r42, X.AnonymousClass11F r43, X.C19890wg r44, X.AnonymousClass1BF r45, X.C24251Bs r46, X.C23871Ae r47, X.AnonymousClass1N2 r48, java.lang.Integer r49, java.lang.Integer r50, boolean r51) {
        /*
            r25 = this;
            r5 = r37
            r7 = r26
            r4 = r36
            X.1H2 r2 = r5.A03
            X.1XN r1 = r5.A02
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r5.A04
            r6 = r25
            r14 = r35
            r13 = r34
            r12 = r33
            r11 = r32
            r10 = r29
            r9 = r28
            r8 = r27
            r15 = r40
            r23 = r49
            r24 = r50
            r22 = r48
            r21 = r44
            r3 = r42
            r16 = r41
            r20 = r3
            r17 = r1
            r18 = r2
            r19 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = 0
            r6.A05 = r0
            X.3oq r0 = new X.3oq
            r0.<init>(r6)
            r6.A0H = r0
            r1 = 3
            X.4Vk r0 = new X.4Vk
            r0.<init>(r6, r1)
            r6.A08 = r0
            r6.A0E = r3
            r0 = r30
            r6.A0J = r0
            r0 = r31
            r6.A09 = r0
            r0 = r47
            r6.A0I = r0
            r0 = r46
            r6.A0G = r0
            r0 = r45
            r6.A0F = r0
            r3 = r39
            r6.A0D = r3
            r0 = r38
            r6.A0C = r0
            r6.A0B = r5
            boolean r0 = r6.A08()
            if (r0 != 0) goto L_0x006e
            r4 = 0
        L_0x006e:
            r6.A0A = r4
            r0 = r51
            r6.A06 = r0
            r0 = r43
            r6.A02 = r0
            if (r39 == 0) goto L_0x00a7
            r3.A01 = r6
            X.005 r0 = r3.A0J
            java.lang.Object r2 = r0.get()
            X.5Ar r2 = (X.C104665Ar) r2
            r0 = 47
            X.3wa r1 = new X.3wa
            r1.<init>((java.lang.Object) r2, (int) r0)
            java.util.List r0 = r2.A03
            if (r0 == 0) goto L_0x00a8
            r1.run()
        L_0x0092:
            X.3GT r0 = r3.A0E
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00a7
            X.4lK r0 = r3.A0F
            if (r0 == 0) goto L_0x00a7
            X.00s r1 = r0.A02
            X.012 r7 = (X.AnonymousClass012) r7
            r0 = 30
            X.C66033Uk.A00(r7, r1, r3, r0)
        L_0x00a7:
            return
        L_0x00a8:
            X.0wk r0 = r2.A0C
            r0.execute(r1)
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2M8.<init>(android.app.Activity, android.widget.ImageButton, X.0wN, com.whatsapp.KeyboardPopupLayout, X.0wQ, X.0yf, com.whatsapp.WaEditText, X.0yb, X.0v0, X.0ts, X.3H8, X.39w, X.3mU, X.3HE, X.62r, X.6O1, X.0yC, X.11F, X.0wg, X.1BF, X.1Bs, X.1Ae, X.1N2, java.lang.Integer, java.lang.Integer, boolean):void");
    }
}
