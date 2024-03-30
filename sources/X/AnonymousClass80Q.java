package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.80Q  reason: invalid class name */
public class AnonymousClass80Q extends RecyclerView {
    public int A00 = -1;
    public int A01;
    public int A02 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    public int A03;
    public int A04 = -1;
    public View A05;
    public ViewGroup A06;
    public TextView A07;
    public AnonymousClass31W A08;
    public C197989ci A09 = new C197989ci(this);
    public C197989ci A0A = new C197989ci(this);
    public C167957zT A0B;
    public AnonymousClass1N2 A0C;
    public List A0D;
    public boolean A0E = false;

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r1 = r19
            r9 = r17
            android.view.View r0 = r9.A05
            boolean r0 = X.AnonymousClass1N2.A00(r0)
            if (r0 == 0) goto L_0x010c
            X.9ci r8 = r9.A09
        L_0x000e:
            boolean r0 = r8.A03
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L_0x003b
            r8.A03 = r5
            X.80Q r0 = r8.A04
            android.view.View r0 = r0.A05
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.9vC r0 = new X.9vC
            r0.<init>(r8)
            r1.addOnPreDrawListener(r0)
        L_0x0028:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
        L_0x002c:
            int r0 = r9.getVisibility()
            if (r0 != 0) goto L_0x0035
            android.view.View.MeasureSpec.getSize(r1)
        L_0x0035:
            r0 = r18
            super.onMeasure(r0, r1)
            return
        L_0x003b:
            X.80Q r4 = r8.A04
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x002c
            int r10 = r4.A00
            r1 = -1
            if (r10 != r1) goto L_0x00f3
            int r0 = r4.A03
            if (r0 == r1) goto L_0x00e5
            int r0 = r4.A04
            if (r0 == r1) goto L_0x00dd
            int r12 = r0 + 1
        L_0x0050:
            r11 = 0
            r10 = 0
            r3 = 0
        L_0x0053:
            if (r11 >= r12) goto L_0x00e8
            X.7zT r0 = r4.A0B
            int r13 = r0.getItemViewType(r11)
            java.util.Map r2 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r2.get(r0)
            X.80C r1 = (X.AnonymousClass80C) r1
            if (r1 != 0) goto L_0x0070
            X.80C r1 = X.C167957zT.A00(r4, r13)
            r2.put(r0, r1)
        L_0x0070:
            java.util.List r0 = r4.A0D
            java.lang.Object r0 = r0.get(r11)
            X.9TY r0 = (X.AnonymousClass9TY) r0
            r1.A0B(r0)
            android.view.ViewGroup r0 = r4.A06
            r16 = r0
            android.view.View r13 = r1.A0H
            int r1 = r16.getWidth()
            r0 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = r16.getHeight()
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            if (r15 != 0) goto L_0x00a0
            r1 = -1
            r0 = -2
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r1, r0)
        L_0x00a0:
            int r1 = r16.getPaddingLeft()
            int r0 = r16.getPaddingRight()
            int r1 = r1 + r0
            int r0 = r15.width
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r2, r1, r0)
            int r1 = r16.getPaddingTop()
            int r0 = r16.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r15.height
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r14, r1, r0)
            r13.measure(r2, r0)
            int r2 = r13.getMeasuredHeight()
            int r1 = r4.A03
            int r0 = r1 + 1
            if (r11 >= r0) goto L_0x00d0
            if (r11 != r1) goto L_0x00db
            int r0 = r2 / 2
        L_0x00cf:
            int r3 = r3 + r0
        L_0x00d0:
            int r0 = r4.A04
            if (r11 != r0) goto L_0x00d6
            int r2 = r2 / 2
        L_0x00d6:
            int r10 = r10 + r2
            int r11 = r11 + 1
            goto L_0x0053
        L_0x00db:
            r0 = r2
            goto L_0x00cf
        L_0x00dd:
            X.7zT r0 = r4.A0B
            int r12 = r0.A0J()
            goto L_0x0050
        L_0x00e5:
            int r10 = r4.A02
            goto L_0x00f3
        L_0x00e8:
            r4.A00 = r10
            r4.A01 = r3
            X.7zT r0 = r4.A0B
            java.util.Map r0 = r0.A00
            r0.clear()
        L_0x00f3:
            int r1 = r8.A01
            int r0 = r1 + r10
            int r2 = r8.A00
            if (r0 <= r2) goto L_0x010a
            int r2 = r2 - r1
            if (r2 < 0) goto L_0x0106
            int r1 = r4.A01
            r0 = -1
            if (r1 == r0) goto L_0x0106
            if (r2 < r1) goto L_0x0106
            r6 = r2
        L_0x0106:
            r8.A02 = r5
            goto L_0x0028
        L_0x010a:
            r6 = r10
            goto L_0x0106
        L_0x010c:
            X.9ci r8 = r9.A0A
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass80Q.onMeasure(int, int):void");
    }

    public AnonymousClass80Q(Context context, View view, ViewGroup viewGroup, TextView textView, AnonymousClass31W r10, AnonymousClass1N2 r11) {
        super(context);
        this.A05 = view;
        this.A07 = textView;
        this.A06 = viewGroup;
        this.A0C = r11;
        this.A08 = r10;
        C36341k9.A0q(getContext(), this, C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.A0B = new C167957zT();
        getContext();
        C36321k7.A0Q(this);
        setAdapter(this.A0B);
    }

    public void setData(String str, List list, AnonymousClass4O1 r7) {
        this.A0D = AnonymousClass001.A0I();
        if (str != null && !TextUtils.isEmpty(str)) {
            this.A0D.add(new C175498aa(str));
        }
        this.A00 = -1;
        this.A04 = -1;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                this.A0D.add(new C175508ab((C62363Fw) list.get(i), r7));
                if (i == 0) {
                    this.A03 = C36431kI.A07(this.A0D);
                } else if (i == 2) {
                    this.A04 = C36431kI.A07(this.A0D);
                }
                this.A0D.add(new AnonymousClass9TY(3));
            }
        }
        this.A0B.A0M(this.A0D);
    }
}
