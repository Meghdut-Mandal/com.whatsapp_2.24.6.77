package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.0cP  reason: invalid class name and case insensitive filesystem */
public class C09460cP implements AnonymousClass07X, C15720ns {
    public int A00;
    public int A01;
    public int A02;
    public Context A03;
    public Context A04;
    public Drawable A05;
    public LayoutInflater A06;
    public LayoutInflater A07;
    public C016307a A08;
    public C16990qX A09;
    public C016707e A0A;
    public AnonymousClass0Fd A0B;
    public AnonymousClass0FW A0C;
    public C11410gG A0D;
    public C03480Fl A0E;
    public C03460Fe A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public int A0K;
    public int A0L;
    public final C09400cJ A0M = new C09400cJ(this);
    public final SparseBooleanArray A0N = new SparseBooleanArray();

    public boolean B35(C016307a r2, C018707z r3) {
        return false;
    }

    public boolean B77(C016307a r2, C018707z r3) {
        return false;
    }

    public boolean A01() {
        C016707e r0;
        C11410gG r2 = this.A0D;
        if (r2 == null || (r0 = this.A0A) == null) {
            C03460Fe r02 = this.A0F;
            if (r02 == null) {
                return false;
            }
            r02.A01();
            return true;
        }
        ((View) r0).removeCallbacks(r2);
        this.A0D = null;
        return true;
    }

    public boolean A02() {
        C09450cO r0;
        C03460Fe r02 = this.A0F;
        if (r02 == null || (r0 = r02.A03) == null || !r0.BNH()) {
            return false;
        }
        return true;
    }

    public boolean A03() {
        C016307a r1;
        if (!this.A0I || A02() || (r1 = this.A08) == null || this.A0A == null || this.A0D != null) {
            return false;
        }
        r1.A05();
        if (r1.A08.isEmpty()) {
            return false;
        }
        C11410gG r12 = new C11410gG(new C03460Fe(this.A03, this.A0E, this.A08, this), this);
        this.A0D = r12;
        ((View) this.A0A).post(r12);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fb, code lost:
        if (r13 != false) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean B7R() {
        /*
            r17 = this;
            r14 = r17
            X.07a r0 = r14.A08
            r2 = 0
            r13 = 0
            if (r0 == 0) goto L_0x004b
            java.util.ArrayList r12 = r0.A04()
            int r11 = r12.size()
        L_0x0010:
            int r10 = r14.A02
            int r9 = r14.A0K
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r13)
            X.07e r7 = r14.A0A
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r4 = 0
            r15 = 0
            r6 = 0
            r3 = 0
        L_0x0020:
            if (r4 >= r11) goto L_0x004e
            java.lang.Object r5 = r12.get(r4)
            X.07z r5 = (X.C018707z) r5
            int r0 = r5.A05
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x003f
            int r6 = r6 + 1
        L_0x0031:
            boolean r0 = r14.A0G
            if (r0 == 0) goto L_0x003c
            boolean r0 = r5.isActionViewExpanded()
            if (r0 == 0) goto L_0x003c
            r10 = 0
        L_0x003c:
            int r4 = r4 + 1
            goto L_0x0020
        L_0x003f:
            int r0 = r5.A05
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0049
            int r3 = r3 + 1
            goto L_0x0031
        L_0x0049:
            r15 = 1
            goto L_0x0031
        L_0x004b:
            r12 = r2
            r11 = 0
            goto L_0x0010
        L_0x004e:
            boolean r0 = r14.A0I
            if (r0 == 0) goto L_0x0059
            if (r15 != 0) goto L_0x0057
            int r3 = r3 + r6
            if (r3 <= r10) goto L_0x0059
        L_0x0057:
            int r10 = r10 + -1
        L_0x0059:
            int r10 = r10 - r6
            android.util.SparseBooleanArray r6 = r14.A0N
            r6.clear()
            r5 = 0
            r16 = 0
        L_0x0062:
            if (r5 >= r11) goto L_0x00fe
            java.lang.Object r4 = r12.get(r5)
            X.07z r4 = (X.C018707z) r4
            int r0 = r4.A05
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x0096
            android.view.View r0 = r14.A00(r2, r7, r4)
            r0.measure(r8, r8)
            int r0 = r0.getMeasuredWidth()
            int r9 = r9 - r0
            if (r16 != 0) goto L_0x0081
            r16 = r0
        L_0x0081:
            int r1 = r4.getGroupId()
            r0 = 1
            if (r1 == 0) goto L_0x008b
            r6.put(r1, r0)
        L_0x008b:
            int r0 = r4.A02
        L_0x008d:
            r0 = r0 | 32
        L_0x008f:
            r4.A02 = r0
            int r5 = r5 + 1
            r2 = 0
            r13 = 0
            goto L_0x0062
        L_0x0096:
            int r0 = r4.A05
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x00cd
            int r3 = r4.getGroupId()
            boolean r2 = r6.get(r3)
            if (r10 > 0) goto L_0x00a9
            if (r2 == 0) goto L_0x00cd
        L_0x00a9:
            if (r9 <= 0) goto L_0x00d4
            r0 = 0
            android.view.View r0 = r14.A00(r0, r7, r4)
            r0.measure(r8, r8)
            int r0 = r0.getMeasuredWidth()
            int r9 = r9 - r0
            if (r16 != 0) goto L_0x00bc
            r16 = r0
        L_0x00bc:
            int r0 = r9 + r16
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r13 = r0 & 1
            if (r13 == 0) goto L_0x00d4
            if (r3 == 0) goto L_0x00d4
            r6.put(r3, r1)
        L_0x00cb:
            int r10 = r10 + -1
        L_0x00cd:
            int r0 = r4.A02
            if (r13 != 0) goto L_0x008d
            r0 = r0 & -33
            goto L_0x008f
        L_0x00d4:
            if (r2 == 0) goto L_0x00fb
            r2 = 0
            r6.put(r3, r2)
        L_0x00da:
            if (r2 >= r5) goto L_0x00fb
            java.lang.Object r1 = r12.get(r2)
            X.07z r1 = (X.C018707z) r1
            int r0 = r1.getGroupId()
            if (r0 != r3) goto L_0x00f8
            int r0 = r1.A02
            r15 = 32
            r0 = r0 & 32
            if (r0 != r15) goto L_0x00f2
            int r10 = r10 + 1
        L_0x00f2:
            int r0 = r1.A02
            r0 = r0 & -33
            r1.A02 = r0
        L_0x00f8:
            int r2 = r2 + 1
            goto L_0x00da
        L_0x00fb:
            if (r13 == 0) goto L_0x00cd
            goto L_0x00cb
        L_0x00fe:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09460cP.B7R():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        if (r2 > 640) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (r3 >= 360) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BKa(android.content.Context r7, X.C016307a r8) {
        /*
            r6 = this;
            r6.A03 = r7
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r7)
            r6.A06 = r0
            r6.A08 = r8
            android.content.res.Resources r5 = r7.getResources()
            X.0SG r1 = new X.0SG
            r1.<init>(r7)
            boolean r0 = r6.A0J
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r6.A0I = r0
        L_0x001a:
            android.content.Context r1 = r1.A00
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0X(r1)
            int r0 = r0.widthPixels
            int r0 = r0 / 2
            r6.A0L = r0
            android.content.res.Configuration r0 = X.AnonymousClass000.A0U(r1)
            int r3 = r0.screenWidthDp
            int r2 = r0.screenHeightDp
            int r1 = r0.smallestScreenWidthDp
            r0 = 600(0x258, float:8.41E-43)
            if (r1 > r0) goto L_0x0087
            if (r3 > r0) goto L_0x0087
            r0 = 500(0x1f4, float:7.0E-43)
            if (r3 >= r0) goto L_0x0042
            r1 = 480(0x1e0, float:6.73E-43)
            r0 = 640(0x280, float:8.97E-43)
            if (r3 <= r1) goto L_0x0080
            if (r2 <= r0) goto L_0x0085
        L_0x0042:
            r1 = 4
        L_0x0043:
            r6.A02 = r1
            int r4 = r6.A0L
            boolean r0 = r6.A0I
            r3 = 0
            if (r0 == 0) goto L_0x007d
            X.0Fl r0 = r6.A0E
            if (r0 != 0) goto L_0x0070
            android.content.Context r0 = r6.A04
            X.0Fl r2 = new X.0Fl
            r2.<init>(r0, r6)
            r6.A0E = r2
            boolean r0 = r6.A0H
            r1 = 0
            if (r0 == 0) goto L_0x0067
            android.graphics.drawable.Drawable r0 = r6.A05
            r2.setImageDrawable(r0)
            r6.A05 = r3
            r6.A0H = r1
        L_0x0067:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            X.0Fl r0 = r6.A0E
            r0.measure(r1, r1)
        L_0x0070:
            X.0Fl r0 = r6.A0E
            int r0 = r0.getMeasuredWidth()
            int r4 = r4 - r0
        L_0x0077:
            r6.A0K = r4
            r5.getDisplayMetrics()
            return
        L_0x007d:
            r6.A0E = r3
            goto L_0x0077
        L_0x0080:
            r0 = 360(0x168, float:5.04E-43)
            r1 = 2
            if (r3 < r0) goto L_0x0043
        L_0x0085:
            r1 = 3
            goto L_0x0043
        L_0x0087:
            r1 = 5
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09460cP.BKa(android.content.Context, X.07a):void");
    }

    public void Bf3(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof C08730bE) && (i = ((C08730bE) parcelable).A00) > 0 && (findItem = this.A08.findItem(i)) != null) {
            Bhy((AnonymousClass0FZ) findItem.getSubMenu());
        }
    }

    public Parcelable Bfg() {
        C08730bE r1 = new C08730bE();
        r1.A00 = this.A00;
        return r1;
    }

    public void Bwl(boolean z) {
        ArrayList arrayList;
        C016707e r1;
        int size;
        C018707z r0;
        ViewGroup viewGroup = (ViewGroup) this.A0A;
        if (viewGroup != null) {
            C016307a r02 = this.A08;
            int i = 0;
            if (r02 != null) {
                r02.A05();
                ArrayList A042 = this.A08.A04();
                int size2 = A042.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    C018707z r9 = (C018707z) A042.get(i3);
                    if ((r9.A02 & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof AnonymousClass080) {
                            r0 = ((AnonymousClass080) childAt).getItemData();
                        } else {
                            r0 = null;
                        }
                        View A002 = A00(childAt, viewGroup, r9);
                        if (r9 != r0) {
                            A002.setPressed(false);
                            A002.jumpDrawablesToCurrentState();
                        }
                        if (A002 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) A002.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(A002);
                            }
                            ((ViewGroup) this.A0A).addView(A002, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.A0E) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.A0A).requestLayout();
        C016307a r03 = this.A08;
        if (r03 != null) {
            r03.A05();
            ArrayList arrayList2 = r03.A06;
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                C06030Sa r04 = ((C018707z) arrayList2.get(i4)).A0C;
                if (r04 != null) {
                    r04.A00 = this;
                }
            }
        }
        C016307a r05 = this.A08;
        if (r05 != null) {
            r05.A05();
            arrayList = r05.A08;
        } else {
            arrayList = null;
        }
        if (!this.A0I || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!((C018707z) arrayList.get(0)).isActionViewExpanded()))) {
            C03480Fl r06 = this.A0E;
            if (r06 != null && r06.getParent() == (r1 = this.A0A)) {
                ((ViewGroup) r1).removeView(this.A0E);
            }
        } else {
            C03480Fl r12 = this.A0E;
            if (r12 == null) {
                r12 = new C03480Fl(this.A04, this);
                this.A0E = r12;
            }
            ViewGroup viewGroup3 = (ViewGroup) r12.getParent();
            if (viewGroup3 != this.A0A) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.A0E);
                }
                C03480Fl r2 = this.A0E;
                C03530Fu r13 = new C03530Fu();
                r13.gravity = 16;
                r13.A04 = true;
                ((ViewGroup) this.A0A).addView(r2, r13);
            }
        }
        ((ActionMenuView) this.A0A).A06 = this.A0I;
    }

    public C09460cP(Context context) {
        this.A04 = context;
        this.A07 = LayoutInflater.from(context);
    }

    public View A00(View view, ViewGroup viewGroup, C018707z r6) {
        View actionView = r6.getActionView();
        if (actionView == null || r6.A01()) {
            if (!(view instanceof AnonymousClass080)) {
                view = this.A07.inflate(R.layout.f9nameremoved, viewGroup, false);
            }
            AnonymousClass080 r4 = (AnonymousClass080) view;
            r4.BKf(r6, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) r4;
            actionMenuItemView.A02 = (ActionMenuView) this.A0A;
            AnonymousClass0FW r0 = this.A0C;
            if (r0 == null) {
                r0 = new AnonymousClass0FW(this);
                this.A0C = r0;
            }
            actionMenuItemView.A01 = r0;
            actionView = (View) r4;
        }
        int i = 0;
        if (r6.isActionViewExpanded()) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof C03530Fu)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public void BTt(C016307a r2, boolean z) {
        A01();
        AnonymousClass0Fd r0 = this.A0B;
        if (r0 != null) {
            r0.A01();
        }
        C16990qX r02 = this.A09;
        if (r02 != null) {
            r02.BTt(r2, z);
        }
    }

    public boolean Bhy(AnonymousClass0FZ r8) {
        boolean z = false;
        if (r8.hasVisibleItems()) {
            AnonymousClass0FZ r0 = r8;
            while (r0.A00 != this.A08) {
                r0 = (AnonymousClass0FZ) r0.A00;
            }
            MenuItem item = r0.getItem();
            ViewGroup viewGroup = (ViewGroup) this.A0A;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (!(childAt instanceof AnonymousClass080) || ((AnonymousClass080) childAt).getItemData() != item) {
                        i++;
                    } else if (childAt != null) {
                        this.A00 = r8.getItem().getItemId();
                        int size = r8.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                break;
                            }
                            MenuItem item2 = r8.getItem(i2);
                            if (item2.isVisible() && item2.getIcon() != null) {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                        AnonymousClass0Fd r1 = new AnonymousClass0Fd(this.A03, childAt, r8, this);
                        this.A0B = r1;
                        r1.A05 = z;
                        C09450cO r02 = r1.A03;
                        if (r02 != null) {
                            r02.A08(z);
                        }
                        if (r1.A03()) {
                            C16990qX r03 = this.A09;
                            if (r03 != null) {
                                r03.Bbv(r8);
                            }
                            return true;
                        }
                        throw AnonymousClass001.A09("MenuPopupHelper cannot be used without an anchor");
                    }
                }
            }
        }
        return false;
    }

    public void BqL(C16990qX r1) {
        this.A09 = r1;
    }

    public int getId() {
        return this.A01;
    }
}
