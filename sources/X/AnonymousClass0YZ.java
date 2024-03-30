package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.R;

/* renamed from: X.0YZ  reason: invalid class name */
public class AnonymousClass0YZ {
    public int A00;
    public int A01 = -1;
    public int A02 = 0;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Drawable A08;
    public Handler A09;
    public Message A0A;
    public Message A0B;
    public Message A0C;
    public View A0D;
    public View A0E;
    public Button A0F;
    public Button A0G;
    public Button A0H;
    public ImageView A0I;
    public ListAdapter A0J;
    public ListView A0K;
    public TextView A0L;
    public TextView A0M;
    public NestedScrollView A0N;
    public CharSequence A0O;
    public CharSequence A0P;
    public CharSequence A0Q;
    public CharSequence A0R;
    public CharSequence A0S;
    public boolean A0T;
    public final Context A0U;
    public final View.OnClickListener A0V = new C18340t0(this, 0);
    public final Window A0W;
    public final AnonymousClass0DT A0X;

    public static void A01(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            int i2 = 4;
            if (view.canScrollVertically(-1)) {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    public static ViewGroup A00(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: android.widget.ListView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: androidx.core.widget.NestedScrollView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: android.widget.ListView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: android.widget.ListView} */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x014e, code lost:
        if (r9.getVisibility() == 8) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004c, code lost:
        if (r11 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0053, code lost:
        if (A02(r11) == false) goto L_0x0055;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r13 = this;
            int r1 = r13.A00
            X.0DT r0 = r13.A0X
            r0.setContentView((int) r1)
            android.view.Window r6 = r13.A0W
            r0 = 2131432319(0x7f0b137f, float:1.8486392E38)
            android.view.View r1 = r6.findViewById(r0)
            r0 = 2131434785(0x7f0b1d21, float:1.8491394E38)
            r2 = 2131434785(0x7f0b1d21, float:1.8491394E38)
            android.view.View r7 = r1.findViewById(r0)
            r0 = 2131429152(0x7f0b0720, float:1.8479969E38)
            r9 = 2131429152(0x7f0b0720, float:1.8479969E38)
            android.view.View r4 = r1.findViewById(r0)
            r0 = 2131428381(0x7f0b041d, float:1.8478405E38)
            r8 = 2131428381(0x7f0b041d, float:1.8478405E38)
            android.view.View r3 = r1.findViewById(r0)
            r0 = 2131429344(0x7f0b07e0, float:1.8480358E38)
            android.view.View r5 = r1.findViewById(r0)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r11 = r13.A0E
            r10 = 0
            if (r11 != 0) goto L_0x004e
            int r0 = r13.A07
            if (r0 == 0) goto L_0x034b
            android.content.Context r0 = r13.A0U
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            int r0 = r13.A07
            android.view.View r11 = r1.inflate(r0, r5, r10)
            if (r11 == 0) goto L_0x0055
        L_0x004e:
            r10 = 1
            boolean r0 = A02(r11)
            if (r0 != 0) goto L_0x032a
        L_0x0055:
            r0 = 131072(0x20000, float:1.83671E-40)
            r6.setFlags(r0, r0)
            if (r10 != 0) goto L_0x032a
            r0 = 8
            r5.setVisibility(r0)
        L_0x0061:
            android.view.View r2 = r5.findViewById(r2)
            android.view.View r1 = r5.findViewById(r9)
            android.view.View r0 = r5.findViewById(r8)
            android.view.ViewGroup r9 = A00(r2, r7)
            android.view.ViewGroup r8 = A00(r1, r4)
            android.view.ViewGroup r7 = A00(r0, r3)
            r0 = 2131433563(0x7f0b185b, float:1.8488915E38)
            android.view.View r0 = r6.findViewById(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r13.A0N = r0
            r1 = 0
            r0.setFocusable(r1)
            androidx.core.widget.NestedScrollView r0 = r13.A0N
            r0.setNestedScrollingEnabled(r1)
            r0 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r1 = r8.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r13.A0L = r1
            if (r1 == 0) goto L_0x00a1
            java.lang.CharSequence r0 = r13.A0R
            if (r0 == 0) goto L_0x02f7
            r1.setText(r0)
        L_0x00a1:
            r0 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r13.A0H = r0
            android.view.View$OnClickListener r10 = r13.A0V
            r0.setOnClickListener(r10)
            java.lang.CharSequence r0 = r13.A0Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r4 = 1
            r3 = 8
            r2 = 0
            if (r0 == 0) goto L_0x02e8
            android.widget.Button r0 = r13.A0H
            r0.setVisibility(r3)
            r11 = 0
        L_0x00c3:
            r0 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r13.A0F = r0
            r0.setOnClickListener(r10)
            java.lang.CharSequence r0 = r13.A0O
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x02d8
            android.widget.Button r0 = r13.A0F
            r0.setVisibility(r3)
        L_0x00de:
            r0 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r13.A0G = r0
            r0.setOnClickListener(r10)
            java.lang.CharSequence r0 = r13.A0P
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x02c8
            android.widget.Button r0 = r13.A0G
            r0.setVisibility(r3)
        L_0x00f9:
            android.content.Context r0 = r13.A0U
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r0.getTheme()
            r0 = 2130968646(0x7f040046, float:1.7545952E38)
            r1.resolveAttribute(r0, r2, r4)
            int r0 = r2.data
            if (r0 == 0) goto L_0x02c1
            if (r11 != r4) goto L_0x02b3
            android.widget.Button r2 = r13.A0H
        L_0x0112:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r1.gravity = r4
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.weight = r0
            r2.setLayoutParams(r1)
        L_0x0121:
            r1 = r9
            android.view.View r0 = r13.A0D
            if (r0 == 0) goto L_0x023f
            r1 = -1
            r0 = -2
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r1, r0)
            android.view.View r1 = r13.A0D
            r0 = 0
            r9.addView(r1, r0, r2)
            r0 = 2131434749(0x7f0b1cfd, float:1.849132E38)
            android.view.View r1 = r6.findViewById(r0)
        L_0x013a:
            r1.setVisibility(r3)
        L_0x013d:
            r2 = 1
            r10 = 0
            int r0 = r5.getVisibility()
            r12 = 0
            if (r0 == r3) goto L_0x0147
            r12 = 1
        L_0x0147:
            if (r9 == 0) goto L_0x0150
            int r0 = r9.getVisibility()
            r5 = 1
            if (r0 != r3) goto L_0x0151
        L_0x0150:
            r5 = 0
        L_0x0151:
            int r0 = r7.getVisibility()
            r11 = 1
            if (r0 != r3) goto L_0x0165
            r11 = 0
            r0 = 2131434596(0x7f0b1c64, float:1.849101E38)
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L_0x0165
            r0.setVisibility(r10)
        L_0x0165:
            if (r5 == 0) goto L_0x0236
            androidx.core.widget.NestedScrollView r0 = r13.A0N
            if (r0 == 0) goto L_0x016e
            r0.setClipToPadding(r2)
        L_0x016e:
            java.lang.CharSequence r0 = r13.A0R
            if (r0 != 0) goto L_0x0176
            android.widget.ListView r0 = r13.A0K
            if (r0 == 0) goto L_0x0182
        L_0x0176:
            r0 = 2131434726(0x7f0b1ce6, float:1.8491274E38)
            android.view.View r0 = r9.findViewById(r0)
        L_0x017d:
            if (r0 == 0) goto L_0x0182
            r0.setVisibility(r10)
        L_0x0182:
            android.widget.ListView r7 = r13.A0K
            boolean r0 = r7 instanceof androidx.appcompat.app.AlertController$RecycleListView
            if (r0 == 0) goto L_0x01a5
            androidx.appcompat.app.AlertController$RecycleListView r7 = (androidx.appcompat.app.AlertController$RecycleListView) r7
            if (r11 == 0) goto L_0x018e
            if (r5 != 0) goto L_0x01a5
        L_0x018e:
            int r4 = r7.getPaddingLeft()
            if (r5 == 0) goto L_0x0232
            int r3 = r7.getPaddingTop()
        L_0x0198:
            int r1 = r7.getPaddingRight()
            if (r11 == 0) goto L_0x022e
            int r0 = r7.getPaddingBottom()
        L_0x01a2:
            r7.setPadding(r4, r3, r1, r0)
        L_0x01a5:
            if (r12 != 0) goto L_0x01d4
            android.widget.ListView r7 = r13.A0K
            if (r7 != 0) goto L_0x01af
            androidx.core.widget.NestedScrollView r7 = r13.A0N
            if (r7 == 0) goto L_0x01d4
        L_0x01af:
            if (r11 == 0) goto L_0x01b2
            r10 = 2
        L_0x01b2:
            r5 = r5 | r10
            r0 = 2131433562(0x7f0b185a, float:1.8488913E38)
            android.view.View r3 = r6.findViewById(r0)
            r0 = 2131433561(0x7f0b1859, float:1.8488911E38)
            android.view.View r4 = r6.findViewById(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x01eb
            X.C012005e.A0T(r7, r5)
        L_0x01ca:
            if (r3 == 0) goto L_0x01cf
            r8.removeView(r3)
        L_0x01cf:
            if (r4 == 0) goto L_0x01d4
            r8.removeView(r4)
        L_0x01d4:
            android.widget.ListView r3 = r13.A0K
            if (r3 == 0) goto L_0x01ea
            android.widget.ListAdapter r0 = r13.A0J
            if (r0 == 0) goto L_0x01ea
            r3.setAdapter(r0)
            int r1 = r13.A01
            r0 = -1
            if (r1 <= r0) goto L_0x01ea
            r3.setItemChecked(r1, r2)
            r3.setSelection(r1)
        L_0x01ea:
            return
        L_0x01eb:
            r1 = 0
            if (r3 == 0) goto L_0x01f6
            r0 = r5 & 1
            if (r0 != 0) goto L_0x01f6
            r8.removeView(r3)
            r3 = r1
        L_0x01f6:
            if (r4 == 0) goto L_0x0200
            r0 = r5 & 2
            if (r0 != 0) goto L_0x0200
            r8.removeView(r4)
            r4 = r1
        L_0x0200:
            if (r3 != 0) goto L_0x0204
            if (r4 == 0) goto L_0x01d4
        L_0x0204:
            java.lang.CharSequence r0 = r13.A0R
            if (r0 == 0) goto L_0x021a
            androidx.core.widget.NestedScrollView r1 = r13.A0N
            X.0d3 r0 = new X.0d3
            r0.<init>(r3, r4, r13)
            r1.A0A = r0
            X.0gv r0 = new X.0gv
            r0.<init>(r3, r4, r13)
        L_0x0216:
            r1.post(r0)
            goto L_0x01d4
        L_0x021a:
            android.widget.ListView r1 = r13.A0K
            if (r1 == 0) goto L_0x01ca
            X.0c4 r0 = new X.0c4
            r0.<init>(r3, r4, r13)
            r1.setOnScrollListener(r0)
            android.widget.ListView r1 = r13.A0K
            X.0gw r0 = new X.0gw
            r0.<init>(r3, r4, r13)
            goto L_0x0216
        L_0x022e:
            int r0 = r7.A00
            goto L_0x01a2
        L_0x0232:
            int r3 = r7.A01
            goto L_0x0198
        L_0x0236:
            r0 = 2131434597(0x7f0b1c65, float:1.8491012E38)
            android.view.View r0 = r8.findViewById(r0)
            goto L_0x017d
        L_0x023f:
            r0 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r13.A0I = r0
            java.lang.CharSequence r0 = r13.A0S
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02a2
            boolean r0 = r13.A0T
            if (r0 == 0) goto L_0x02a2
            r0 = 2131427681(0x7f0b0161, float:1.8476985E38)
            android.view.View r1 = r6.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r13.A0M = r1
            java.lang.CharSequence r0 = r13.A0S
            r1.setText(r0)
            int r1 = r13.A02
            if (r1 == 0) goto L_0x0273
            android.widget.ImageView r0 = r13.A0I
            r0.setImageResource(r1)
            goto L_0x013d
        L_0x0273:
            android.graphics.drawable.Drawable r1 = r13.A08
            if (r1 == 0) goto L_0x027e
            android.widget.ImageView r0 = r13.A0I
            r0.setImageDrawable(r1)
            goto L_0x013d
        L_0x027e:
            android.widget.TextView r10 = r13.A0M
            android.widget.ImageView r0 = r13.A0I
            int r4 = r0.getPaddingLeft()
            android.widget.ImageView r0 = r13.A0I
            int r2 = r0.getPaddingTop()
            android.widget.ImageView r0 = r13.A0I
            int r1 = r0.getPaddingRight()
            android.widget.ImageView r0 = r13.A0I
            int r0 = r0.getPaddingBottom()
            r10.setPadding(r4, r2, r1, r0)
            android.widget.ImageView r0 = r13.A0I
            r0.setVisibility(r3)
            goto L_0x013d
        L_0x02a2:
            r0 = 2131434749(0x7f0b1cfd, float:1.849132E38)
            android.view.View r0 = r6.findViewById(r0)
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r13.A0I
            r0.setVisibility(r3)
            goto L_0x013a
        L_0x02b3:
            r0 = 2
            if (r11 != r0) goto L_0x02ba
            android.widget.Button r2 = r13.A0F
            goto L_0x0112
        L_0x02ba:
            r0 = 4
            if (r11 != r0) goto L_0x02c1
            android.widget.Button r2 = r13.A0G
            goto L_0x0112
        L_0x02c1:
            if (r11 != 0) goto L_0x0121
            r7.setVisibility(r3)
            goto L_0x0121
        L_0x02c8:
            android.widget.Button r1 = r13.A0G
            java.lang.CharSequence r0 = r13.A0P
            r1.setText(r0)
            android.widget.Button r0 = r13.A0G
            r0.setVisibility(r2)
            r11 = r11 | 4
            goto L_0x00f9
        L_0x02d8:
            android.widget.Button r1 = r13.A0F
            java.lang.CharSequence r0 = r13.A0O
            r1.setText(r0)
            android.widget.Button r0 = r13.A0F
            r0.setVisibility(r2)
            r11 = r11 | 2
            goto L_0x00de
        L_0x02e8:
            android.widget.Button r1 = r13.A0H
            java.lang.CharSequence r0 = r13.A0Q
            r1.setText(r0)
            android.widget.Button r0 = r13.A0H
            r0.setVisibility(r2)
            r11 = 1
            goto L_0x00c3
        L_0x02f7:
            r2 = 8
            r1.setVisibility(r2)
            androidx.core.widget.NestedScrollView r1 = r13.A0N
            android.widget.TextView r0 = r13.A0L
            r1.removeView(r0)
            android.widget.ListView r0 = r13.A0K
            if (r0 == 0) goto L_0x0325
            androidx.core.widget.NestedScrollView r0 = r13.A0N
            android.view.ViewParent r4 = r0.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            androidx.core.widget.NestedScrollView r0 = r13.A0N
            int r3 = r4.indexOfChild(r0)
            r4.removeViewAt(r3)
            android.widget.ListView r2 = r13.A0K
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r4.addView(r2, r3, r0)
            goto L_0x00a1
        L_0x0325:
            r8.setVisibility(r2)
            goto L_0x00a1
        L_0x032a:
            r0 = 2131429343(0x7f0b07df, float:1.8480356E38)
            android.view.View r10 = r6.findViewById(r0)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r10.addView(r11, r0)
            android.widget.ListView r0 = r13.A0K
            if (r0 == 0) goto L_0x0061
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r0 = 0
            r1.weight = r0
            goto L_0x0061
        L_0x034b:
            r11 = 0
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YZ.A03():void");
    }

    public AnonymousClass0YZ(Context context, Window window, AnonymousClass0DT r7) {
        this.A0U = context;
        this.A0X = r7;
        this.A0W = window;
        this.A09 = new AnonymousClass0E4(r7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, AnonymousClass1MJ.A04, R.attr.f4nameremoved, 0);
        this.A00 = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.A04 = obtainStyledAttributes.getResourceId(4, 0);
        this.A05 = obtainStyledAttributes.getResourceId(5, 0);
        this.A06 = obtainStyledAttributes.getResourceId(7, 0);
        this.A03 = obtainStyledAttributes.getResourceId(3, 0);
        this.A0T = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        r7.A02().A0T(1);
    }

    public static boolean A02(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (A02(viewGroup.getChildAt(childCount))) {
                }
            }
        }
        return false;
        return true;
    }
}
