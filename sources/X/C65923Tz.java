package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.R;
import java.lang.ref.Reference;
import java.util.HashMap;

/* renamed from: X.3Tz  reason: invalid class name and case insensitive filesystem */
public class C65923Tz {
    public static HandlerThread A0W;
    public static C37061lk A0X;
    public static C37101lo A0Y;
    public static final int A0Z = ViewConfiguration.getKeyRepeatDelay();
    public static final int A0a = ViewConfiguration.getKeyRepeatTimeout();
    public static final HashMap A0b = AnonymousClass001.A0J();
    public int A00;
    public int A01;
    public C88314Sf A02;
    public C38881qN A03;
    public C38851qK A04;
    public boolean A05 = false;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final Paint A0B = C36441kJ.A0K();
    public final LayoutInflater A0C;
    public final View.OnClickListener A0D;
    public final View A0E;
    public final ViewGroup A0F;
    public final ViewTreeObserver.OnGlobalLayoutListener A0G = new C90104Zc(this, 0);
    public final AbsListView.OnScrollListener A0H;
    public final AbsListView.OnScrollListener A0I = new C55932vQ(this, 0);
    public final ImageView A0J;
    public final ViewPager A0K;
    public final C19420v0 A0L;
    public final AnonymousClass1H2 A0M;
    public final C19890wg A0N;
    public final boolean A0O;
    public final C37921nQ[] A0P;
    public final AnonymousClass3PU[] A0Q;
    public final View A0R;
    public final C19700wN A0S;
    public final C1261362r A0T;
    public final AnonymousClass1XN A0U;
    public final C20810yC A0V;

    public static void A01(C37501mW r6, C65923Tz r7) {
        C37501mW r2 = r6;
        if (AnonymousClass3UO.A02(r6.A04)) {
            C38881qN r1 = new C38881qN(r2, new C63913Lx(r2, r7, 0), r7.A0M, r6.A04, false);
            r7.A03 = r1;
            AnonymousClass3TC.A01(r2, r7.A0R, r1);
        }
    }

    public static void A02(C37501mW r6, C65923Tz r7) {
        C37501mW r2 = r6;
        C38851qK r1 = new C38851qK(r2, new C63913Lx(r6, r7, 1), r7.A0M, r6.A04, false);
        r7.A04 = r1;
        AnonymousClass3TC.A01(r2, r7.A0R, r1);
    }

    public static Drawable A00(long j) {
        Reference reference = (Reference) A0b.get(Long.valueOf(j));
        if (reference == null) {
            return null;
        }
        return (Drawable) reference.get();
    }

    public static void A03(C65923Tz r9, int i) {
        for (AnonymousClass3PU r2 : r9.A0Q) {
            ViewGroup viewGroup = r9.A0F;
            View findViewById = viewGroup.findViewById(r2.A01);
            View findViewById2 = viewGroup.findViewById(r2.A00);
            if (findViewById2 != null) {
                if (r2.A04 == i) {
                    findViewById2.setSelected(true);
                    C36341k9.A0q(findViewById.getContext(), findViewById, C224514j.A00(findViewById.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
                } else {
                    findViewById2.setSelected(false);
                    findViewById.setBackgroundColor(0);
                }
            }
        }
    }

    public static void A04(C65923Tz r3, int[] iArr) {
        if (iArr == null) {
            r3.A0S.A0E("EmojiPicker/onEmojiSelected/emoji being added is null", (String) null, true);
            return;
        }
        r3.A0U.A09(iArr);
        if (r3.A00 != 0) {
            r3.A0P[0].notifyDataSetChanged();
        }
        C88314Sf r0 = r3.A02;
        if (r0 != null) {
            r0.BWN(iArr);
        }
        r3.A0T.A00(0, 0, 7);
    }

    public C65923Tz(Context context, View view, ViewGroup viewGroup, AbsListView.OnScrollListener onScrollListener, C19700wN r21, C19420v0 r22, C18820ts r23, C1261362r r24, AnonymousClass1XN r25, AnonymousClass1H2 r26, C20810yC r27, C19890wg r28) {
        int length;
        int length2;
        AbsListView.OnScrollListener onScrollListener2 = onScrollListener;
        this.A0H = onScrollListener2;
        this.A0O = AnonymousClass000.A1V(onScrollListener2);
        this.A0R = view;
        Context context2 = context;
        this.A0A = context2;
        C20810yC r10 = r27;
        this.A0V = r10;
        this.A0S = r21;
        this.A0M = r26;
        AnonymousClass1XN r7 = r25;
        this.A0U = r7;
        C19420v0 r6 = r22;
        this.A0L = r6;
        C19890wg r15 = r28;
        this.A0N = r15;
        C1261362r r14 = r24;
        this.A0T = r14;
        this.A07 = C36351kA.A01(context2, R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A09 = AnonymousClass00F.A00(context2, R.color.f6nameremoved);
        ViewGroup viewGroup2 = viewGroup;
        this.A0F = C36411kG.A0P(viewGroup2, R.id.emoji_group_layout);
        AnonymousClass6JA.A00(r10);
        AnonymousClass3PU[] r1 = new AnonymousClass3PU[9];
        this.A0Q = r1;
        r1[0] = new AnonymousClass222(r7);
        int i = 1;
        while (true) {
            AnonymousClass3PU[] r8 = this.A0Q;
            length = r8.length;
            if (i >= length) {
                break;
            }
            r8[i] = new AnonymousClass3PU(AnonymousClass6JA.A00(r10)[i - 1], i);
            i++;
        }
        C37921nQ[] r12 = new C37921nQ[length];
        this.A0P = r12;
        C18820ts r13 = r23;
        r12[0] = new C37921nQ(context2, this, r13, 0);
        this.A00 = r7.A02() > 0 ? 0 : 1;
        ViewPager viewPager = (ViewPager) viewGroup2.findViewById(R.id.pager);
        this.A0K = viewPager;
        viewPager.setAdapter(new AnonymousClass229(this, r13));
        viewPager.A0K(new C68273bd(context2, this, r13, r14, r15));
        this.A0C = (LayoutInflater) C21060yb.A02(context2, "layout_inflater");
        this.A06 = context2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A08 = context2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        for (AnonymousClass3PU r72 : this.A0Q) {
            View findViewById = this.A0F.findViewById(r72.A00);
            C36331k8.A0q(context2, findViewById, r72.A02);
            C67113Yo.A00(findViewById, this, r13, r72, 2);
        }
        if (C36351kA.A1Y(r13)) {
            length2 = this.A00;
        } else {
            length2 = (this.A0P.length - 1) - this.A00;
        }
        this.A0K.A0J(length2, false);
        A03(this, this.A00);
        this.A0D = new C67113Yo((Object) this, (Object) r15, (Object) r6, 3);
        ImageView A0N2 = C36391kE.A0N(viewGroup2, R.id.delete_symbol_tb);
        this.A0J = A0N2;
        if (A0N2 != null) {
            AnonymousClass4VT r16 = new AnonymousClass4VT(Looper.getMainLooper(), this, 0);
            A0N2.setClickable(true);
            A0N2.setLongClickable(true);
            A0N2.setOnTouchListener(new C53782rs(r16, this, 0));
            C66923Xv.A01(A0N2, this, 13);
            C36321k7.A0L(this.A0A, A0N2, r13, R.drawable.emoji_x);
            C36331k8.A0q(context2, A0N2, R.string.f12nameremoved);
        }
        View findViewById2 = viewGroup2.findViewById(R.id.emoji_tip);
        this.A0E = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
            C66923Xv.A01(findViewById2.findViewById(R.id.ok), this, 14);
            C66923Xv.A01(findViewById2, this, 15);
        }
    }
}
