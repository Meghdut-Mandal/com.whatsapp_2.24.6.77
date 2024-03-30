package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertDialog$Builder;
import com.whatsapp.R;

@Deprecated
/* renamed from: X.1qm  reason: invalid class name and case insensitive filesystem */
public class C39001qm extends AlertDialog$Builder {
    public final AlertDialog$Builder A00;
    public final AnonymousClass3V7 A01 = new AnonymousClass3V7();
    public final AnonymousClass3V4 A02 = new AnonymousClass3V4();

    public static void A05(AnonymousClass012 r1, C39001qm r2, int i, int i2) {
        r2.A0m(r1, new C65993Ug(r1, i), i2);
    }

    public static void A06(AnonymousClass012 r1, C39001qm r2, int i, int i2) {
        r2.A0m(r1, new C66023Uj(r1, i), i2);
    }

    public static void A0B(C39001qm r1, Object obj, int i, int i2) {
        r1.A0h(new AnonymousClass4XN(obj, i), i2);
    }

    public static void A0C(C39001qm r1, Object obj, int i, int i2) {
        r1.A0f(new AnonymousClass4XO(obj, i), i2);
    }

    public static void A0D(C39001qm r1, Object obj, int i, int i2) {
        r1.A0h(new AnonymousClass4XO(obj, i), i2);
    }

    public static void A0E(C39001qm r1, Object obj, int i, int i2) {
        r1.A0f(new AnonymousClass4XM(obj, i), i2);
    }

    public static void A0F(C39001qm r1, Object obj, int i, int i2) {
        r1.A0h(new AnonymousClass4XP(obj, i), i2);
    }

    public static void A0G(C39001qm r1, Object obj, int i, int i2) {
        r1.A0f(new AnonymousClass4XN(obj, i), i2);
    }

    public static void A0H(C39001qm r1, Object obj, int i, int i2) {
        r1.A0h(new AnonymousClass4XM(obj, i), i2);
    }

    public static void A0I(C39001qm r1, Object obj, int i, int i2) {
        r1.A0h(new AnonymousClass4XL(obj, i), i2);
    }

    public static void A0J(C39001qm r1, Object obj, Object obj2, int i, int i2) {
        r1.A0h(new C89714Xp(obj, obj2, i), i2);
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0M(int i) {
        this.A00.A0M(i);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0O(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter) {
        this.A00.A0O(onClickListener, listAdapter);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0P(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter, int i) {
        this.A00.A0P(onClickListener, listAdapter, i);
        return this;
    }

    @Deprecated
    public /* bridge */ /* synthetic */ AlertDialog$Builder A0Q(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.A0Q(onClickListener, charSequence);
        return this;
    }

    @Deprecated
    public /* bridge */ /* synthetic */ AlertDialog$Builder A0R(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.A0R(onClickListener, charSequence);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0T(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr) {
        this.A00.A0T(onClickListener, charSequenceArr);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0U(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr, int i) {
        this.A00.A0U(onClickListener, charSequenceArr, i);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0V(DialogInterface.OnDismissListener onDismissListener) {
        this.A00.A0V(onDismissListener);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0W(DialogInterface.OnKeyListener onKeyListener) {
        this.A00.A0W(onKeyListener);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0X(DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener, CharSequence[] charSequenceArr, boolean[] zArr) {
        this.A00.A0X(onMultiChoiceClickListener, charSequenceArr, zArr);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0Y(View view) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        alertDialog$Builder.A0Y(view);
        alertDialog$Builder.A0Y(view);
        return this;
    }

    public AnonymousClass0FM A0b() {
        return this.A00.A0b();
    }

    public void A0c(int i) {
        this.A00.A0K(i);
    }

    public void A0d(int i) {
        this.A00.A0L(i);
    }

    public void A0e(DialogInterface.OnCancelListener onCancelListener) {
        this.A00.A0N(onCancelListener);
    }

    @Deprecated
    public void A0f(DialogInterface.OnClickListener onClickListener, int i) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        alertDialog$Builder.A0Q(onClickListener, alertDialog$Builder.getContext().getString(i));
    }

    @Deprecated
    public void A0g(DialogInterface.OnClickListener onClickListener, int i) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        alertDialog$Builder.A0R(onClickListener, alertDialog$Builder.getContext().getString(i));
    }

    @Deprecated
    public void A0h(DialogInterface.OnClickListener onClickListener, int i) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        alertDialog$Builder.A0S(onClickListener, alertDialog$Builder.getContext().getString(i));
    }

    @Deprecated
    public void A0i(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.A0S(onClickListener, charSequence);
    }

    public void A0j(View view) {
        this.A00.setView(view);
    }

    public void A0k(AnonymousClass012 r3, AnonymousClass04S r4) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        AnonymousClass3V4 r0 = this.A02;
        alertDialog$Builder.A0V(r0);
        r0.A01.A08(r3, r4);
    }

    public void A0l(AnonymousClass012 r4, AnonymousClass04S r5, int i) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        String string = alertDialog$Builder.getContext().getString(i);
        AnonymousClass3V7 r0 = this.A01;
        alertDialog$Builder.A0Q(r0, string);
        if (r5 != null) {
            r0.A00.A08(r4, r5);
        }
    }

    public void A0m(AnonymousClass012 r4, AnonymousClass04S r5, int i) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        String string = alertDialog$Builder.getContext().getString(i);
        AnonymousClass3V7 r0 = this.A01;
        alertDialog$Builder.A0S(r0, string);
        if (r5 != null) {
            r0.A02.A08(r4, r5);
        }
    }

    public void A0n(AnonymousClass012 r3, AnonymousClass04S r4, CharSequence charSequence) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        AnonymousClass3V7 r0 = this.A01;
        alertDialog$Builder.A0Q(r0, charSequence);
        if (r4 != null) {
            r0.A00.A08(r3, r4);
        }
    }

    public void A0o(AnonymousClass012 r3, AnonymousClass04S r4, CharSequence charSequence) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        AnonymousClass3V7 r0 = this.A01;
        alertDialog$Builder.A0S(r0, charSequence);
        r0.A02.A08(r3, r4);
    }

    public void A0p(CharSequence charSequence) {
        this.A00.A0Z(charSequence);
    }

    public void A0q(CharSequence charSequence) {
        this.A00.setTitle(charSequence);
    }

    public void A0r(boolean z) {
        this.A00.A0a(z);
    }

    public AnonymousClass0FM create() {
        if (this.A02.A01.A02.A00 <= 0) {
            this.A00.A0V((DialogInterface.OnDismissListener) null);
        }
        return this.A00.create();
    }

    public Context getContext() {
        return this.A00.getContext();
    }

    public C39001qm(AlertDialog$Builder alertDialog$Builder) {
        super(alertDialog$Builder.getContext());
        this.A00 = alertDialog$Builder;
    }

    public static C39001qm A00(Context context) {
        C39001qm A002 = AnonymousClass3LW.A00(context);
        A002.A0d(R.string.f12nameremoved);
        A002.A0c(R.string.f12nameremoved);
        return A002;
    }

    public static C39001qm A01(Context context, CharSequence charSequence) {
        C39001qm A002 = AnonymousClass3LW.A00(context);
        A002.A0p(charSequence);
        return A002;
    }

    public static void A02(Context context, C39001qm r1, int i) {
        r1.A0p(context.getString(i));
    }

    public static void A03(DialogInterface.OnClickListener onClickListener, C39001qm r2, int i) {
        r2.A0h(onClickListener, i);
        r2.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
    }

    public static void A04(AnonymousClass012 r2, C39001qm r3) {
        r3.A0m(r2, (AnonymousClass04S) null, R.string.f12nameremoved);
    }

    public static void A07(C39001qm r2) {
        r2.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
    }

    public static void A08(C39001qm r1, int i) {
        r1.A0c(i);
        r1.A0r(true);
    }

    public static void A09(C39001qm r1, CharSequence charSequence) {
        r1.A0p(charSequence);
        r1.A0r(true);
    }

    public static void A0A(C39001qm r2, CharSequence charSequence) {
        r2.A0p(charSequence);
        r2.A0h((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0K(int i) {
        A0c(i);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0L(int i) {
        A0d(i);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0N(DialogInterface.OnCancelListener onCancelListener) {
        A0e(onCancelListener);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0Z(CharSequence charSequence) {
        A0p(charSequence);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0a(boolean z) {
        A0r(z);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder setTitle(CharSequence charSequence) {
        A0q(charSequence);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder setView(View view) {
        A0j(view);
        return this;
    }

    @Deprecated
    public /* bridge */ /* synthetic */ AlertDialog$Builder A0S(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        A0i(onClickListener, charSequence);
        return this;
    }

    @Deprecated
    public /* bridge */ /* synthetic */ AlertDialog$Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        A0f(onClickListener, i);
        return this;
    }

    @Deprecated
    public /* bridge */ /* synthetic */ AlertDialog$Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        A0h(onClickListener, i);
        return this;
    }
}
