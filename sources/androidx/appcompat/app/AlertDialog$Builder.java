package androidx.appcompat.app;

import X.AnonymousClass0FM;
import X.AnonymousClass0TX;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;

public class AlertDialog$Builder {
    public final AnonymousClass0TX A00;
    public final int A01;

    public AlertDialog$Builder A0K(int i) {
        AnonymousClass0TX r1 = this.A00;
        r1.A0F = r1.A0P.getText(i);
        return this;
    }

    public AlertDialog$Builder A0L(int i) {
        AnonymousClass0TX r1 = this.A00;
        r1.A0J = r1.A0P.getText(i);
        return this;
    }

    public AlertDialog$Builder A0M(int i) {
        AnonymousClass0TX r1 = this.A00;
        r1.A0D = null;
        r1.A02 = i;
        return this;
    }

    public AlertDialog$Builder A0N(DialogInterface.OnCancelListener onCancelListener) {
        this.A00.A03 = onCancelListener;
        return this;
    }

    public AlertDialog$Builder A0O(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter) {
        AnonymousClass0TX r0 = this.A00;
        r0.A0E = listAdapter;
        r0.A06 = onClickListener;
        return this;
    }

    public AlertDialog$Builder A0P(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter, int i) {
        AnonymousClass0TX r1 = this.A00;
        r1.A0E = listAdapter;
        r1.A06 = onClickListener;
        r1.A00 = i;
        r1.A0M = true;
        return this;
    }

    public AlertDialog$Builder A0Q(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        AnonymousClass0TX r0 = this.A00;
        r0.A0G = charSequence;
        r0.A04 = onClickListener;
        return this;
    }

    public AlertDialog$Builder A0R(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        AnonymousClass0TX r0 = this.A00;
        r0.A0H = charSequence;
        r0.A05 = onClickListener;
        return this;
    }

    public AlertDialog$Builder A0S(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        AnonymousClass0TX r0 = this.A00;
        r0.A0I = charSequence;
        r0.A07 = onClickListener;
        return this;
    }

    public AlertDialog$Builder A0T(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr) {
        AnonymousClass0TX r0 = this.A00;
        r0.A0N = charSequenceArr;
        r0.A06 = onClickListener;
        return this;
    }

    public AlertDialog$Builder A0U(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr, int i) {
        AnonymousClass0TX r1 = this.A00;
        r1.A0N = charSequenceArr;
        r1.A06 = onClickListener;
        r1.A00 = i;
        r1.A0M = true;
        return this;
    }

    public AlertDialog$Builder A0V(DialogInterface.OnDismissListener onDismissListener) {
        this.A00.A08 = onDismissListener;
        return this;
    }

    public AlertDialog$Builder A0W(DialogInterface.OnKeyListener onKeyListener) {
        this.A00.A09 = onKeyListener;
        return this;
    }

    public AlertDialog$Builder A0X(DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener, CharSequence[] charSequenceArr, boolean[] zArr) {
        AnonymousClass0TX r1 = this.A00;
        r1.A0N = charSequenceArr;
        r1.A0A = onMultiChoiceClickListener;
        r1.A0O = zArr;
        r1.A0L = true;
        return this;
    }

    public AlertDialog$Builder A0Y(View view) {
        this.A00.A0C = view;
        return this;
    }

    public AlertDialog$Builder A0Z(CharSequence charSequence) {
        this.A00.A0F = charSequence;
        return this;
    }

    public AlertDialog$Builder A0a(boolean z) {
        this.A00.A0K = z;
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0FM create() {
        /*
            r11 = this;
            X.0TX r7 = r11.A00
            android.content.Context r6 = r7.A0P
            int r0 = r11.A01
            X.0FM r3 = new X.0FM
            r3.<init>(r6, r0)
            X.0YZ r2 = r3.A00
            android.view.View r0 = r7.A0C
            if (r0 == 0) goto L_0x00f3
            r2.A0D = r0
        L_0x0013:
            java.lang.CharSequence r1 = r7.A0F
            if (r1 == 0) goto L_0x0020
            r2.A0R = r1
            android.widget.TextView r0 = r2.A0L
            if (r0 == 0) goto L_0x0020
            r0.setText(r1)
        L_0x0020:
            java.lang.CharSequence r5 = r7.A0I
            if (r5 == 0) goto L_0x0034
            android.content.DialogInterface$OnClickListener r4 = r7.A07
            r1 = -1
            r0 = 0
            if (r4 == 0) goto L_0x0030
            android.os.Handler r0 = r2.A09
            android.os.Message r0 = r0.obtainMessage(r1, r4)
        L_0x0030:
            r2.A0Q = r5
            r2.A0C = r0
        L_0x0034:
            java.lang.CharSequence r5 = r7.A0G
            if (r5 == 0) goto L_0x0048
            android.content.DialogInterface$OnClickListener r4 = r7.A04
            r1 = -2
            r0 = 0
            if (r4 == 0) goto L_0x0044
            android.os.Handler r0 = r2.A09
            android.os.Message r0 = r0.obtainMessage(r1, r4)
        L_0x0044:
            r2.A0O = r5
            r2.A0A = r0
        L_0x0048:
            java.lang.CharSequence r5 = r7.A0H
            if (r5 == 0) goto L_0x005c
            android.content.DialogInterface$OnClickListener r4 = r7.A05
            r1 = -3
            r0 = 0
            if (r4 == 0) goto L_0x0058
            android.os.Handler r0 = r2.A09
            android.os.Message r0 = r0.obtainMessage(r1, r4)
        L_0x0058:
            r2.A0P = r5
            r2.A0B = r0
        L_0x005c:
            java.lang.CharSequence[] r0 = r7.A0N
            if (r0 != 0) goto L_0x0064
            android.widget.ListAdapter r0 = r7.A0E
            if (r0 == 0) goto L_0x0099
        L_0x0064:
            android.view.LayoutInflater r4 = r7.A0Q
            int r1 = r2.A04
            r0 = 0
            android.view.View r8 = r4.inflate(r1, r0)
            androidx.appcompat.app.AlertController$RecycleListView r8 = (androidx.appcompat.app.AlertController$RecycleListView) r8
            boolean r0 = r7.A0L
            r4 = 1
            if (r0 == 0) goto L_0x00de
            int r10 = r2.A05
            java.lang.CharSequence[] r9 = r7.A0N
            X.0Ea r5 = new X.0Ea
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x007d:
            r2.A0J = r5
            int r0 = r7.A00
            r2.A01 = r0
            android.content.DialogInterface$OnClickListener r0 = r7.A06
            if (r0 == 0) goto L_0x00d4
            r1 = 0
            X.0t2 r0 = new X.0t2
            r0.<init>(r7, r2, r1)
        L_0x008d:
            r8.setOnItemClickListener(r0)
        L_0x0090:
            boolean r0 = r7.A0M
            if (r0 == 0) goto L_0x00cb
            r8.setChoiceMode(r4)
        L_0x0097:
            r2.A0K = r8
        L_0x0099:
            android.view.View r0 = r7.A0D
            if (r0 == 0) goto L_0x00c1
            r2.A0E = r0
            r0 = 0
            r2.A07 = r0
        L_0x00a2:
            boolean r0 = r7.A0K
            r3.setCancelable(r0)
            boolean r0 = r7.A0K
            if (r0 == 0) goto L_0x00af
            r0 = 1
            r3.setCanceledOnTouchOutside(r0)
        L_0x00af:
            android.content.DialogInterface$OnCancelListener r0 = r7.A03
            r3.setOnCancelListener(r0)
            android.content.DialogInterface$OnDismissListener r0 = r7.A08
            r3.setOnDismissListener(r0)
            android.content.DialogInterface$OnKeyListener r0 = r7.A09
            if (r0 == 0) goto L_0x00c0
            r3.setOnKeyListener(r0)
        L_0x00c0:
            return r3
        L_0x00c1:
            int r1 = r7.A02
            if (r1 == 0) goto L_0x00a2
            r0 = 0
            r2.A0E = r0
            r2.A07 = r1
            goto L_0x00a2
        L_0x00cb:
            boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x0097
            r0 = 2
            r8.setChoiceMode(r0)
            goto L_0x0097
        L_0x00d4:
            android.content.DialogInterface$OnMultiChoiceClickListener r0 = r7.A0A
            if (r0 == 0) goto L_0x0090
            X.0c6 r0 = new X.0c6
            r0.<init>(r7, r8, r2)
            goto L_0x008d
        L_0x00de:
            boolean r0 = r7.A0M
            if (r0 == 0) goto L_0x00f0
            int r1 = r2.A06
        L_0x00e4:
            android.widget.ListAdapter r5 = r7.A0E
            if (r5 != 0) goto L_0x007d
            java.lang.CharSequence[] r0 = r7.A0N
            X.0Eb r5 = new X.0Eb
            r5.<init>(r6, r0, r1)
            goto L_0x007d
        L_0x00f0:
            int r1 = r2.A03
            goto L_0x00e4
        L_0x00f3:
            java.lang.CharSequence r1 = r7.A0J
            if (r1 == 0) goto L_0x0100
            r2.A0S = r1
            android.widget.TextView r0 = r2.A0M
            if (r0 == 0) goto L_0x0100
            r0.setText(r1)
        L_0x0100:
            android.graphics.drawable.Drawable r4 = r7.A0B
            if (r4 == 0) goto L_0x0115
            r2.A08 = r4
            r1 = 0
            r2.A02 = r1
            android.widget.ImageView r0 = r2.A0I
            if (r0 == 0) goto L_0x0115
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.A0I
            r0.setImageDrawable(r4)
        L_0x0115:
            int r1 = r7.A01
            if (r1 == 0) goto L_0x0013
            r0 = 0
            r2.A08 = r0
            r2.A02 = r1
            android.widget.ImageView r1 = r2.A0I
            if (r1 == 0) goto L_0x0013
            r0 = 0
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r2.A0I
            int r0 = r2.A02
            r1.setImageResource(r0)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertDialog$Builder.create():X.0FM");
    }

    public Context getContext() {
        return this.A00.A0P;
    }

    public AlertDialog$Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass0TX r1 = this.A00;
        r1.A0G = r1.A0P.getText(i);
        r1.A04 = onClickListener;
        return this;
    }

    public AlertDialog$Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass0TX r1 = this.A00;
        r1.A0I = r1.A0P.getText(i);
        r1.A07 = onClickListener;
        return this;
    }

    public AlertDialog$Builder setTitle(CharSequence charSequence) {
        this.A00.A0J = charSequence;
        return this;
    }

    public AlertDialog$Builder setView(View view) {
        AnonymousClass0TX r1 = this.A00;
        r1.A0D = view;
        r1.A02 = 0;
        return this;
    }

    public AlertDialog$Builder(Context context, int i) {
        this.A00 = new AnonymousClass0TX(new ContextThemeWrapper(context, AnonymousClass0FM.A00(context, i)));
        this.A01 = i;
    }

    public AnonymousClass0FM A0b() {
        AnonymousClass0FM create = create();
        create.show();
        return create;
    }

    public AlertDialog$Builder(Context context) {
        this(context, AnonymousClass0FM.A00(context, 0));
    }
}
