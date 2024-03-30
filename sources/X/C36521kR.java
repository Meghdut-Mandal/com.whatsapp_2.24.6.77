package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.SharedPreferences;
import android.view.View;

/* renamed from: X.1kR  reason: invalid class name and case insensitive filesystem */
public final class C36521kR extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C65293Rm A01;
    public final /* synthetic */ C10770fC A02;

    public void onAnimationEnd(Animator animator) {
        SharedPreferences.Editor putInt;
        AnonymousClass00C.A0D(animator, 0);
        super.onAnimationEnd(animator);
        View view = this.A00;
        view.getLayoutParams().height = C65293Rm.A09;
        view.requestLayout();
        if (this.A02.element) {
            C51062nA r1 = (C51062nA) this.A01.A08.getValue();
            AnonymousClass00T r7 = r1.A01;
            SharedPreferences A0E = C36411kG.A0E(r7);
            AnonymousClass00C.A08(A0E);
            SharedPreferences.Editor edit = A0E.edit();
            if (!r1.A04()) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("should not occur: ");
                A0u.append(C36411kG.A0E(r7).getInt("shown", 3));
                A0u.append(' ');
                A0u.append(C36411kG.A0E(r7).getInt("left", 3));
                A0u.append(' ');
                C18740tg.A0D(false, C36411kG.A11(A0u, C36411kG.A0E(r7).getLong("ts", -C51062nA.A03)));
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences A0E2 = C36411kG.A0E(r7);
                long j = C51062nA.A03;
                if (currentTimeMillis - A0E2.getLong("ts", -j) >= j || C36411kG.A0E(r7).getInt("shown", 3) >= 3) {
                    edit.putInt("left", C36411kG.A0E(r7).getInt("left", 3) - 1);
                    putInt = edit.putInt("shown", 1);
                } else {
                    putInt = edit.putInt("shown", C36411kG.A0E(r7).getInt("shown", 3) + 1);
                }
                AnonymousClass00C.A08(putInt);
                AnonymousClass00C.A08(edit.putLong("ts", System.currentTimeMillis()));
            }
            edit.apply();
        }
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass00C.A0D(animator, 0);
        super.onAnimationStart(animator);
        this.A00.setVisibility(0);
    }

    public C36521kR(View view, C65293Rm r2, C10770fC r3) {
        this.A00 = view;
        this.A02 = r3;
        this.A01 = r2;
    }
}
