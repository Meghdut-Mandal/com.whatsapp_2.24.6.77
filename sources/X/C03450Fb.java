package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Fb  reason: invalid class name and case insensitive filesystem */
public final class C03450Fb extends C09450cO implements AnonymousClass07X, PopupWindow.OnDismissListener, View.OnKeyListener {
    public boolean A00;
    public int A01 = 0;
    public int A02;
    public View A03;
    public View A04;
    public ViewTreeObserver A05;
    public int A06 = 0;
    public int A07;
    public int A08;
    public PopupWindow.OnDismissListener A09;
    public C16990qX A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Handler A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;
    public final ViewTreeObserver.OnGlobalLayoutListener A0J = new C18560tM(this, 0);
    public final C17010qZ A0K = new C09490cS(this);
    public final List A0L = AnonymousClass001.A0I();
    public final int A0M;
    public final View.OnAttachStateChangeListener A0N = new C18320sy(this, 0);
    public final List A0O = AnonymousClass001.A0I();
    public final boolean A0P;

    public void A03(int i) {
        this.A0C = true;
        this.A07 = i;
    }

    public void A04(int i) {
        this.A0D = true;
        this.A08 = i;
    }

    public boolean A0A() {
        return false;
    }

    public boolean B7R() {
        return false;
    }

    public void Bf3(Parcelable parcelable) {
    }

    public Parcelable Bfg() {
        return null;
    }

    private void A00(C016307a r18) {
        C06140Sl r2;
        View view;
        Rect rect;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        C03340Ee r14;
        int i5;
        int firstVisiblePosition;
        Context context = this.A0I;
        LayoutInflater from = LayoutInflater.from(context);
        C016307a r7 = r18;
        C03340Ee r10 = new C03340Ee(from, r7, R.layout.f9nameremoved, this.A0P);
        if (!BNH() && this.A0B) {
            r10.A01 = true;
        } else if (BNH()) {
            int size = r7.size();
            boolean z2 = false;
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    break;
                }
                MenuItem item = r7.getItem(i6);
                if (item.isVisible() && item.getIcon() != null) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            r10.A01 = z2;
        }
        int A012 = C09450cO.A01(context, r10, this.A0M);
        AnonymousClass0G1 r4 = new AnonymousClass0G1(context, this.A0G, this.A0H);
        r4.A00 = this.A0K;
        r4.A07 = this;
        PopupWindow popupWindow = r4.A0A;
        popupWindow.setOnDismissListener(this);
        r4.A06 = this.A03;
        r4.A00 = this.A01;
        r4.A0F = true;
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(2);
        r4.Bq4(r10);
        r4.A03(A012);
        r4.A00 = this.A01;
        List list = this.A0L;
        if (list.size() > 0) {
            r2 = (C06140Sl) list.get(list.size() - 1);
            C016307a r12 = r2.A01;
            int size2 = r12.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    break;
                }
                MenuItem item2 = r12.getItem(i7);
                if (!item2.hasSubMenu() || r7 != item2.getSubMenu()) {
                    i7++;
                } else {
                    AnonymousClass0F6 r13 = r2.A02.A0B;
                    ListAdapter adapter = r13.getAdapter();
                    int i8 = 0;
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        i5 = headerViewListAdapter.getHeadersCount();
                        r14 = (C03340Ee) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        r14 = (C03340Ee) adapter;
                        i5 = 0;
                    }
                    int count = r14.getCount();
                    while (true) {
                        if (i8 >= count) {
                            break;
                        } else if (item2 != r14.getItem(i8)) {
                            i8++;
                        } else if (i8 != -1 && (firstVisiblePosition = (i8 + i5) - r13.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < r13.getChildCount()) {
                            view = r13.getChildAt(firstVisiblePosition);
                        }
                    }
                }
            }
            view = null;
        } else {
            r2 = null;
            view = null;
        }
        if (view != null) {
            r4.A06();
            r4.A04();
            AnonymousClass0F6 r142 = ((C06140Sl) list.get(list.size() - 1)).A02.A0B;
            int[] iArr = new int[2];
            r142.getLocationOnScreen(iArr);
            Rect A062 = AnonymousClass001.A06();
            this.A04.getWindowVisibleDisplayFrame(A062);
            if (this.A02 != 1 ? iArr[0] - A012 >= 0 : iArr[0] + r142.getWidth() + A012 > A062.right) {
                i = 0;
                z = false;
            } else {
                i = 1;
                z = true;
            }
            this.A02 = i;
            if (Build.VERSION.SDK_INT >= 26) {
                r4.A06 = view;
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.A03.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.A01 & 7) == 5) {
                    iArr2[0] = iArr2[0] + this.A03.getWidth();
                    iArr3[0] = iArr3[0] + view.getWidth();
                }
                i2 = iArr3[0] - iArr2[0];
                i3 = iArr3[1] - iArr2[1];
            }
            if ((this.A01 & 5) == 5) {
                if (!z) {
                    A012 = view.getWidth();
                }
                i4 = i2 + A012;
                r4.A01 = i4;
                r4.A0H = true;
                r4.A0G = true;
                r4.Bsg(i3);
            } else if (z) {
                A012 = view.getWidth();
                i4 = i2 + A012;
                r4.A01 = i4;
                r4.A0H = true;
                r4.A0G = true;
                r4.Bsg(i3);
            }
            i4 = i2 - A012;
            r4.A01 = i4;
            r4.A0H = true;
            r4.A0G = true;
            r4.Bsg(i3);
        } else {
            if (this.A0C) {
                r4.A01 = this.A07;
            }
            if (this.A0D) {
                r4.Bsg(this.A08);
            }
            Rect rect2 = this.A00;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            r4.A05 = rect;
        }
        list.add(new C06140Sl(r7, r4, this.A02));
        r4.Btc();
        AnonymousClass0F6 r3 = r4.A0B;
        r3.setOnKeyListener(this);
        if (r2 == null && this.A0E && r7.A05 != null) {
            View inflate = from.inflate(R.layout.f9nameremoved, r3, false);
            inflate.setEnabled(false);
            ((TextView) inflate.findViewById(16908310)).setText(r7.A05);
            r3.addHeaderView(inflate, (Object) null, false);
            r4.Btc();
        }
    }

    public void A02(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            this.A01 = Gravity.getAbsoluteGravity(i, AnonymousClass04F.A01(this.A03));
        }
    }

    public void A05(View view) {
        if (this.A03 != view) {
            this.A03 = view;
            this.A01 = Gravity.getAbsoluteGravity(this.A06, AnonymousClass04F.A01(view));
        }
    }

    public void A07(C016307a r2) {
        r2.A08(this.A0I, this);
        if (BNH()) {
            A00(r2);
        } else {
            this.A0O.add(r2);
        }
    }

    public AnonymousClass0F6 BDZ() {
        List list = this.A0L;
        if (list.isEmpty()) {
            return null;
        }
        return ((C06140Sl) list.get(list.size() - 1)).A02.A0B;
    }

    public boolean BNH() {
        List list = this.A0L;
        if (list.size() <= 0 || !((C06140Sl) list.get(0)).A02.A0A.isShowing()) {
            return false;
        }
        return true;
    }

    public void BTt(C016307a r7, boolean z) {
        List list = this.A0L;
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (r7 != ((C06140Sl) list.get(i)).A01) {
                i++;
            } else if (i >= 0) {
                int i2 = i + 1;
                if (i2 < list.size()) {
                    ((C06140Sl) list.get(i2)).A01.A0F(false);
                }
                C06140Sl r1 = (C06140Sl) list.remove(i);
                r1.A01.A0D(this);
                if (this.A00) {
                    AnonymousClass0G1 r0 = r1.A02;
                    r0.A05();
                    r0.A0A.setAnimationStyle(0);
                }
                r1.A02.dismiss();
                int size2 = list.size();
                if (size2 > 0) {
                    this.A02 = ((C06140Sl) list.get(size2 - 1)).A00;
                } else {
                    int i3 = 1;
                    if (AnonymousClass04F.A01(this.A03) == 1) {
                        i3 = 0;
                    }
                    this.A02 = i3;
                    if (size2 == 0) {
                        dismiss();
                        C16990qX r12 = this.A0A;
                        if (r12 != null) {
                            r12.BTt(r7, true);
                        }
                        ViewTreeObserver viewTreeObserver = this.A05;
                        if (viewTreeObserver != null) {
                            if (viewTreeObserver.isAlive()) {
                                this.A05.removeGlobalOnLayoutListener(this.A0J);
                            }
                            this.A05 = null;
                        }
                        this.A04.removeOnAttachStateChangeListener(this.A0N);
                        this.A09.onDismiss();
                        return;
                    }
                }
                if (z) {
                    ((C06140Sl) list.get(0)).A01.A0F(false);
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    public boolean Bhy(AnonymousClass0FZ r5) {
        Iterator it = this.A0L.iterator();
        while (true) {
            if (it.hasNext()) {
                C06140Sl r1 = (C06140Sl) it.next();
                if (r5 == r1.A01) {
                    r1.A02.A0B.requestFocus();
                    break;
                }
            } else if (!r5.hasVisibleItems()) {
                return false;
            } else {
                A07(r5);
                C16990qX r0 = this.A0A;
                if (r0 != null) {
                    r0.Bbv(r5);
                    return true;
                }
            }
        }
        return true;
    }

    public void Bwl(boolean z) {
        for (C06140Sl r0 : this.A0L) {
            ListAdapter adapter = r0.A02.A0B.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C03340Ee) adapter).notifyDataSetChanged();
        }
    }

    public void dismiss() {
        List list = this.A0L;
        int size = list.size();
        if (size > 0) {
            C06140Sl[] r2 = (C06140Sl[]) list.toArray(new C06140Sl[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    C06140Sl r1 = r2[size];
                    if (r1.A02.A0A.isShowing()) {
                        r1.A02.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void onDismiss() {
        List list = this.A0L;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C06140Sl r1 = (C06140Sl) list.get(i);
            if (!r1.A02.A0A.isShowing()) {
                r1.A01.A0F(false);
                return;
            }
        }
    }

    public C03450Fb(Context context, View view, int i, int i2, boolean z) {
        this.A0I = context;
        this.A03 = view;
        this.A0G = i;
        this.A0H = i2;
        this.A0P = z;
        this.A0B = false;
        this.A02 = AnonymousClass04F.A01(view) == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.A0M = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.f7nameremoved));
        this.A0F = new Handler();
    }

    public void Btc() {
        if (!BNH()) {
            List<C016307a> list = this.A0O;
            for (C016307a A002 : list) {
                A00(A002);
            }
            list.clear();
            View view = this.A03;
            this.A04 = view;
            if (view != null) {
                boolean A1W = AnonymousClass000.A1W(this.A05);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.A05 = viewTreeObserver;
                if (A1W) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.A0J);
                }
                this.A04.addOnAttachStateChangeListener(this.A0N);
            }
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void A06(PopupWindow.OnDismissListener onDismissListener) {
        this.A09 = onDismissListener;
    }

    public void A08(boolean z) {
        this.A0B = z;
    }

    public void A09(boolean z) {
        this.A0E = z;
    }

    public void BqL(C16990qX r1) {
        this.A0A = r1;
    }
}
