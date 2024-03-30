package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;

/* renamed from: X.3FP  reason: invalid class name */
public class AnonymousClass3FP {
    public boolean A00;
    public AnonymousClass1N0 A01;
    public final Context A02;
    public final ViewGroup A03;
    public final ViewGroup A04;
    public final TextEmojiLabel A05;
    public final TextEmojiLabel A06;
    public final WaEditText A07;
    public final WaImageView A08;
    public final C28371Sj A09;
    public final AnonymousClass1A1 A0A;
    public final C39481sU A0B = new C39481sU();
    public final C39481sU A0C;
    public final AnonymousClass1SV A0D;
    public final C34831hi A0E;
    public final C19770wU A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final C21060yb A0J;
    public final C18820ts A0K;
    public final AnonymousClass1A3 A0L;
    public final AnonymousClass1H2 A0M;
    public final C19890wg A0N;

    public AnonymousClass3FP(ViewGroup viewGroup, AnonymousClass012 r29, C21060yb r30, C18820ts r31, AnonymousClass1A3 r32, AnonymousClass1H2 r33, C28371Sj r34, C19890wg r35, AnonymousClass1A1 r36, AnonymousClass1SV r37, C19770wU r38, boolean z, boolean z2, boolean z3, boolean z4) {
        C39481sU r1 = new C39481sU();
        this.A0C = r1;
        C34831hi A0s = C36441kJ.A0s(C36381kD.A0j());
        this.A0E = A0s;
        this.A09 = r34;
        this.A0F = r38;
        this.A0A = r36;
        this.A0D = r37;
        this.A0L = r32;
        ViewGroup viewGroup2 = viewGroup;
        Context context = viewGroup2.getContext();
        this.A02 = context;
        this.A04 = viewGroup2;
        AnonymousClass1H2 r15 = r33;
        this.A0M = r15;
        C21060yb r17 = r30;
        this.A0J = r17;
        C19890wg r14 = r35;
        this.A0N = r14;
        C18820ts r12 = r31;
        this.A0K = r12;
        this.A01 = new AnonymousClass1N1();
        FrameLayout A0T = C36441kJ.A0T(viewGroup2, R.id.thumbnail_container);
        FrameLayout A0T2 = C36441kJ.A0T(viewGroup2, R.id.caption_container);
        this.A06 = C36401kF.A0O(viewGroup2, R.id.title);
        this.A05 = C36401kF.A0O(viewGroup2, R.id.subtitle);
        this.A08 = C36431kI.A0X(A0T, R.id.thumbnail);
        boolean z5 = z;
        this.A0G = z5;
        this.A0H = z2;
        this.A0I = z3;
        ViewGroup A0O = C36411kG.A0O(viewGroup2, R.id.appended_message_container);
        this.A03 = A0O;
        WaEditText waEditText = (WaEditText) C012005e.A02(A0O, R.id.appended_message);
        this.A07 = waEditText;
        A0T2.setForeground(AnonymousClass00E.A00(context, R.drawable.forward_preview_rounded_corners));
        A0T.setForeground(AnonymousClass00E.A00(context, R.drawable.forward_preview_rounded_corners));
        viewGroup2.setClickable(true);
        viewGroup2.setImportantForAccessibility(2);
        A0T2.setClickable(true);
        A0T2.setImportantForAccessibility(2);
        AnonymousClass012 r13 = r29;
        C88554Td.A00(r13, r1, this, 0);
        View A022 = C012005e.A02(viewGroup2, R.id.cancel);
        int i = !z3 ? 0 : 8;
        C66943Xx.A00(A022, this, 43);
        A022.setEnabled(!z3);
        A022.setVisibility(i);
        LayoutTransition layoutTransition = viewGroup2.getLayoutTransition();
        Animator animator = layoutTransition.getAnimator(1);
        if (animator instanceof ObjectAnimator) {
            AnimatorSet A0C2 = C36441kJ.A0C();
            A0C2.setStartDelay(animator.getStartDelay());
            animator.setStartDelay(0);
            A0C2.play(animator);
            layoutTransition.setAnimator(1, A0C2);
        }
        layoutTransition.setDuration(3, 100);
        layoutTransition.setInterpolator(3, new AccelerateDecelerateInterpolator());
        layoutTransition.setDuration(1, 200);
        layoutTransition.setStartDelay(1, 100);
        layoutTransition.setInterpolator(1, new AccelerateDecelerateInterpolator());
        boolean z6 = z4;
        if (z4) {
            AnonymousClass1H2 r20 = r15;
            waEditText.addTextChangedListener(new AnonymousClass2gA(waEditText, (TextView) null, r17, r12, this.A01, r20, r14, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 30, true, false, z6));
            waEditText.addTextChangedListener(new AnonymousClass2g8(waEditText, r12));
        }
        A0s.A08(r13, new C65933Ua(A0T2, this, 1, z5));
        A0T2.getViewTreeObserver().addOnGlobalLayoutListener(new C90124Ze(viewGroup2, A0T2, this, 1));
    }
}
