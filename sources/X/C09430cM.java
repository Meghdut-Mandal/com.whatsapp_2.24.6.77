package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: X.0cM  reason: invalid class name and case insensitive filesystem */
public class C09430cM implements AnonymousClass07X {
    public C016307a A00;
    public C018707z A01;
    public final /* synthetic */ Toolbar A02;

    public boolean B7R() {
        return false;
    }

    public void BTt(C016307a r1, boolean z) {
    }

    public void Bf3(Parcelable parcelable) {
    }

    public Parcelable Bfg() {
        return null;
    }

    public boolean Bhy(AnonymousClass0FZ r2) {
        return false;
    }

    public void BqL(C16990qX r2) {
        throw null;
    }

    public int getId() {
        return 0;
    }

    public C09430cM(Toolbar toolbar) {
        this.A02 = toolbar;
    }

    public boolean B35(C016307a r6, C018707z r7) {
        Toolbar toolbar = this.A02;
        View view = toolbar.A01;
        if (view instanceof C16980qW) {
            ((C16980qW) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.A01);
        toolbar.removeView(toolbar.A02);
        toolbar.A01 = null;
        ArrayList arrayList = toolbar.A0a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar.addView(AnonymousClass000.A0Z(arrayList, size));
            } else {
                arrayList.clear();
                this.A01 = null;
                toolbar.requestLayout();
                r7.A0F = false;
                r7.A0A.A0E(false);
                return true;
            }
        }
    }

    public boolean B77(C016307a r6, C018707z r7) {
        Toolbar toolbar = this.A02;
        toolbar.A0E();
        ViewParent parent = toolbar.A02.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.A02);
            }
            toolbar.addView(toolbar.A02);
        }
        View actionView = r7.getActionView();
        toolbar.A01 = actionView;
        this.A01 = r7;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.A01);
            }
            C013505w r2 = new C013505w();
            r2.A00 = 8388611 | (toolbar.A00 & 112);
            r2.A00 = 2;
            toolbar.A01.setLayoutParams(r2);
            toolbar.addView(toolbar.A01);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (!(((C013505w) childAt.getLayoutParams()).A00 == 2 || childAt == toolbar.A09)) {
                toolbar.removeViewAt(childCount);
                toolbar.A0a.add(childAt);
            }
        }
        toolbar.requestLayout();
        r7.A0F = true;
        r7.A0A.A0E(false);
        View view = toolbar.A01;
        if (view instanceof C16980qW) {
            ((C16980qW) view).onActionViewExpanded();
        }
        return true;
    }

    public void BKa(Context context, C016307a r4) {
        C018707z r0;
        C016307a r1 = this.A00;
        if (!(r1 == null || (r0 = this.A01) == null)) {
            r1.A0L(r0);
        }
        this.A00 = r4;
    }

    public void Bwl(boolean z) {
        C018707z r4 = this.A01;
        if (r4 != null) {
            C016307a r3 = this.A00;
            if (r3 != null) {
                int size = r3.size();
                int i = 0;
                while (i < size) {
                    if (r3.getItem(i) != r4) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            B35(r3, r4);
        }
    }
}
