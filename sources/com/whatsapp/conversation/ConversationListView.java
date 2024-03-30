package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass13J;
import X.AnonymousClass19I;
import X.AnonymousClass1G5;
import X.AnonymousClass1GQ;
import X.AnonymousClass1N2;
import X.AnonymousClass1Q0;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass1YX;
import X.AnonymousClass2IB;
import X.AnonymousClass2IC;
import X.AnonymousClass2IE;
import X.AnonymousClass2IN;
import X.AnonymousClass2IQ;
import X.AnonymousClass2IR;
import X.AnonymousClass2IS;
import X.AnonymousClass2bU;
import X.AnonymousClass3K9;
import X.AnonymousClass3T1;
import X.AnonymousClass4VT;
import X.AnonymousClass4W6;
import X.C166287vT;
import X.C18700tb;
import X.C18740tg;
import X.C18800tq;
import X.C19420v0;
import X.C19460v5;
import X.C19730wQ;
import X.C19970wo;
import X.C20810yC;
import X.C26341Ju;
import X.C33471fP;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import X.C38051nd;
import X.C43482Hx;
import X.C43492Hy;
import X.C54732tQ;
import X.C596934x;
import X.C64933Qa;
import X.C66013Ui;
import X.C80223v3;
import X.C88944Uq;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;

public class ConversationListView extends ListView implements C18700tb {
    public int A00;
    public int A01;
    public int A02;
    public C19460v5 A03;
    public C19730wQ A04;
    public C33471fP A05;
    public AnonymousClass1YX A06;
    public AnonymousClass1G5 A07;
    public C19970wo A08;
    public C19420v0 A09;
    public C20810yC A0A;
    public AnonymousClass3K9 A0B;
    public AnonymousClass19I A0C;
    public AnonymousClass1GQ A0D;
    public C26341Ju A0E;
    public AnonymousClass1Q0 A0F;
    public AnonymousClass1N2 A0G;
    public AnonymousClass13J A0H;
    public AnonymousClass1QZ A0I;
    public Runnable A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final Handler A0S;

    public static final void A00(View view) {
        boolean z;
        AnonymousClass00C.A0D(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            z = true;
        } else {
            z = layoutParams instanceof AbsListView.LayoutParams;
        }
        C18740tg.A0D(z, "Layout params for header/footer view should be of type AbsListView.LayoutParams");
    }

    public void A04() {
        if (!this.A0Q) {
            this.A0Q = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A08 = C36351kA.A0V(A0W);
            this.A0A = C36341k9.A0V(A0W);
            this.A0G = C36401kF.A0f(A0W);
            this.A04 = C36351kA.A0N(A0W);
            this.A0H = C36351kA.A0q(A0W);
            this.A0F = (AnonymousClass1Q0) A0W.A0L.get();
            this.A0C = (AnonymousClass19I) A0W.A45.get();
            this.A0D = C36371kC.A0f(A0W);
            this.A09 = C36351kA.A0Y(A0W);
            this.A03 = C36381kD.A0Q(A0W.A0y);
            this.A0E = A0W.AHt();
            this.A06 = (AnonymousClass1YX) A0W.A2Q.get();
            this.A0B = (AnonymousClass3K9) A0W.A00.A2s.get();
            this.A07 = (AnonymousClass1G5) A0W.A2O.get();
        }
    }

    public void A06() {
        if (this.A0O) {
            A0A(true);
            this.A0O = false;
        } else if (getLastVisiblePosition() >= getCount() - 2) {
            A0A(true);
        } else {
            smoothScrollBy(C36441kJ.A05(getResources(), R.dimen.f7nameremoved), 100);
        }
    }

    public void A09(AnonymousClass3T1 r7, int i, boolean z) {
        boolean z2;
        C38051nd conversationCursorAdapter;
        HashSet hashSet;
        C64933Qa r2 = r7.A1J;
        AnonymousClass2IR A022 = A02(r2);
        if (A022 == null || A022.getFMessage().A1I != r7.A1I) {
            if (getConversationCursorAdapter().A0N.add(r2)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("conversation/refresh: no view for ");
                A0u.append(r2.A01);
                C36421kH.A1N(A0u);
                A0u.append(getFirstVisiblePosition());
                A0u.append("-");
                A0u.append(getLastVisiblePosition());
                A0u.append(" (");
                A0u.append(getCount());
                C36321k7.A1a(A0u, ")");
            }
        } else if (i == 8) {
            A022.A1d();
        } else if (i == 12) {
            A022.A1Z();
        } else if (i == 20) {
            getConversationCursorAdapter().A0N.add(r2);
        } else {
            if (i == 27 || i == 28 || i == 39 || i == 40) {
                C19970wo r4 = this.A08;
                C19730wQ r3 = this.A04;
                AnonymousClass19I r22 = this.A0C;
                C20810yC r1 = this.A0A;
                C88944Uq r0 = r7.A0J;
                if (r0 == null || C66013Ui.A09(r3, r4, r1, r22, r0.B8Y()) == null) {
                    A022.A21(r7, i);
                    A022.A1g(A022.A01);
                    if (this.A0K) {
                        A0A(false);
                        return;
                    }
                    return;
                }
                z2 = true;
            } else {
                if (i == 30) {
                    conversationCursorAdapter = getConversationCursorAdapter();
                    hashSet = conversationCursorAdapter.A0M;
                } else if (i == 34) {
                    conversationCursorAdapter = getConversationCursorAdapter();
                    hashSet = conversationCursorAdapter.A0O;
                } else if (i != 35 || !(A022 instanceof AnonymousClass2IB)) {
                    z2 = true;
                    if (z) {
                        A022.A23(r7, true);
                        return;
                    }
                } else {
                    AnonymousClass2IB r5 = (AnonymousClass2IB) A022;
                    if (r5.A04 != null && AnonymousClass2IB.A0M(r5)) {
                        AnonymousClass2IB.A0G(r5, new AnonymousClass4W6(r5, 1));
                        return;
                    }
                    return;
                }
                hashSet.add(r2);
                conversationCursorAdapter.notifyDataSetChanged();
                return;
            }
            A022.A22(r7, z2);
        }
    }

    public void A0A(boolean z) {
        if (this.A0L) {
            this.A0M = false;
            this.A0P = false;
        }
        this.A0K = true;
        C80223v3 A002 = C80223v3.A00(this, 27);
        if (z) {
            post(A002);
        } else {
            A002.run();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0I;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0I = r0;
        }
        return r0.generatedComponent();
    }

    public int getDefaultDividerOffset() {
        Point point = new Point();
        C36321k7.A0K(C36361kB.A06(this), point);
        return (point.y - (getResources().getDimensionPixelSize(R.dimen.f7nameremoved) * 2)) / 5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.2IR} */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (((X.AnonymousClass4V7) X.C36361kB.A06(r7)).BMX() != false) goto L_0x002e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            boolean r0 = r7.A0R
            r6 = 0
            if (r0 == 0) goto L_0x0008
            r7.A0R = r6
            return
        L_0x0008:
            X.1fP r5 = r7.A05
            r5.A01()
            X.0yC r2 = r7.A0A
            X.0yV r1 = X.C21000yV.A01
            r0 = 7308(0x1c8c, float:1.024E-41)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x002e
            android.app.Activity r0 = X.C36361kB.A06(r7)
            boolean r0 = r0 instanceof X.AnonymousClass4V7
            if (r0 == 0) goto L_0x002e
            android.app.Activity r0 = X.C36361kB.A06(r7)
            X.4V7 r0 = (X.AnonymousClass4V7) r0
            boolean r1 = r0.BMX()
            r0 = 1
            if (r1 == 0) goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r4 = 0
            if (r0 != 0) goto L_0x004d
            int r3 = r7.getChildCount()
            r2 = 0
        L_0x0037:
            if (r2 >= r3) goto L_0x004d
            android.view.View r1 = r7.getChildAt(r2)
            boolean r0 = r1.isPressed()
            if (r0 == 0) goto L_0x0058
            boolean r0 = r1 instanceof X.AnonymousClass2IR
            if (r0 == 0) goto L_0x0058
            r4 = r1
            X.2IR r4 = (X.AnonymousClass2IR) r4
            r0 = 1
            r4.A2I = r0
        L_0x004d:
            super.onLayout(r8, r9, r10, r11, r12)
            if (r4 == 0) goto L_0x0054
            r4.A2I = r6
        L_0x0054:
            r5.A00()
            return
        L_0x0058:
            int r2 = r2 + 1
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationListView.onLayout(boolean, int, int, int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C166287vT r2 = (C166287vT) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A0N = r2.A02;
        this.A01 = r2.A00;
        this.A02 = r2.A01;
        requestLayout();
    }

    public ConversationListView(Context context) {
        super(context);
        this.A0S = AnonymousClass4VT.A00(this);
        this.A05 = new C33471fP();
    }

    public static void A01(ConversationListView conversationListView, AnonymousClass1RJ r3, int i, int i2, boolean z) {
        int i3;
        if (conversationListView.getFirstVisiblePosition() >= i || conversationListView.getLastVisiblePosition() <= i) {
            if (z) {
                int i4 = -1;
                if (conversationListView.getFirstVisiblePosition() < i) {
                    i4 = 1;
                }
                i3 = ((i4 * conversationListView.getHeight()) / 4) + i2;
            } else {
                i3 = i2;
            }
            conversationListView.setTranscriptMode(0);
            conversationListView.setSelectionFromTop(i, i3);
            conversationListView.smoothScrollToPositionFromTop(i, i2);
            r3.A03(0);
        }
    }

    private C596934x getDisplayedDownloadableMediaMessages() {
        HashSet A16 = C36441kJ.A16();
        HashSet A162 = C36441kJ.A16();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof AnonymousClass2IQ) {
                AnonymousClass2bU fMessage = ((AnonymousClass2IQ) childAt).getFMessage();
                if (C54732tQ.A00(fMessage)) {
                    A16.add(fMessage);
                }
            } else if (childAt instanceof AnonymousClass2IN) {
                AnonymousClass3T1 r1 = ((AnonymousClass2IS) childAt).A0K;
                if (r1.A0a != null && !r1.A0a.A09) {
                    A162.add(r1);
                }
            } else if (childAt instanceof AnonymousClass2IC) {
                Iterator it = ((AnonymousClass2IC) childAt).A08.subList(0, 4).iterator();
                while (it.hasNext()) {
                    AnonymousClass2bU A0r = C36441kJ.A0r(it);
                    if (C54732tQ.A00(A0r)) {
                        A16.add(A0r);
                    }
                }
            }
        }
        return new C596934x(A16, A162);
    }

    public AnonymousClass2IR A02(C64933Qa r6) {
        AnonymousClass2IQ A2D;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof AnonymousClass2IR) {
                AnonymousClass2IR r1 = (AnonymousClass2IR) childAt;
                if ((childAt instanceof AnonymousClass2IE) && (A2D = ((AnonymousClass2IE) childAt).A2D(r6)) != null) {
                    r1 = A2D;
                }
                if (r1.A2C(r6)) {
                    return r1;
                }
            }
        }
        return null;
    }

    public void A03() {
        if (getConversationCursorAdapter() != null && getConversationCursorAdapter().getCursor() != null) {
            this.A0B.A01(getDisplayedDownloadableMediaMessages());
        }
    }

    public void A05() {
        getConversationCursorAdapter().notifyDataSetChanged();
        if (this.A0L) {
            this.A0M = false;
            this.A0P = false;
        }
    }

    public void A07() {
        int A042;
        C38051nd conversationCursorAdapter = getConversationCursorAdapter();
        if (conversationCursorAdapter != null && conversationCursorAdapter.getCursor() != null) {
            if (conversationCursorAdapter.A0J.A0p("fmx_card_view_pending_chats").contains(conversationCursorAdapter.A0K.toString())) {
                A042 = 0;
            } else {
                A042 = conversationCursorAdapter.A04();
            }
            int defaultDividerOffset = getDefaultDividerOffset();
            conversationCursorAdapter.A04();
            setTranscriptMode(0);
            setSelectionFromTop(A042 + getHeaderViewsCount(), defaultDividerOffset);
            this.A0M = false;
            this.A0L = false;
        }
    }

    public void A08(Cursor cursor) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("conversationListView/changeCursor/size: ");
        Log.w(C36381kD.A10(A0u, cursor.getCount()));
        C38051nd conversationCursorAdapter = getConversationCursorAdapter();
        if (conversationCursorAdapter != null && !cursor.isClosed()) {
            conversationCursorAdapter.A0H.clear();
            conversationCursorAdapter.changeCursor(cursor);
        }
    }

    public boolean A0B(int i) {
        if (getLastVisiblePosition() < (getHeaderViewsCount() + getConversationCursorAdapter().getCount()) - 1 || getChildCount() == 0) {
            return false;
        }
        int bottom = getLastRow().getBottom();
        if (bottom < getHeight() || (bottom >= getHeight() && bottom <= getHeight() + i)) {
            return true;
        }
        return false;
    }

    public void addFooterView(View view) {
        A00(view);
        super.addFooterView(view);
    }

    public void addHeaderView(View view) {
        A00(view);
        super.addHeaderView(view);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View selectedView;
        if (keyEvent.getKeyCode() != 23 || (selectedView = getSelectedView()) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return selectedView.dispatchKeyEvent(keyEvent);
    }

    public Activity getActivity() {
        return C36361kB.A06(this);
    }

    public int getAdjustedVisibleItemCount() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View lastRow = getLastRow();
        if ((lastRow instanceof C43482Hx) || (lastRow instanceof C43492Hy)) {
            return 0 + (((AnonymousClass2IR) lastRow).getMessageCount() - 1);
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if ((r3 instanceof X.C38051nd) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C38051nd getConversationCursorAdapter() {
        /*
            r4 = this;
            android.widget.ListAdapter r3 = r4.getAdapter()
            r2 = 0
            r1 = 1
            if (r3 != 0) goto L_0x000f
            r1 = 0
            java.lang.String r0 = "adapter should be NonNull"
        L_0x000b:
            X.C18740tg.A0D(r1, r0)
            return r2
        L_0x000f:
            boolean r0 = r3 instanceof X.C38051nd
            if (r0 != 0) goto L_0x0026
            boolean r0 = r3 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x0029
            android.widget.HeaderViewListAdapter r3 = (android.widget.HeaderViewListAdapter) r3
            android.widget.ListAdapter r3 = r3.getWrappedAdapter()
            if (r3 != 0) goto L_0x0022
            java.lang.String r0 = "wrapped adapter should be NonNull"
            goto L_0x000b
        L_0x0022:
            boolean r0 = r3 instanceof X.C38051nd
            if (r0 == 0) goto L_0x0029
        L_0x0026:
            X.1nd r3 = (X.C38051nd) r3
            return r3
        L_0x0029:
            java.lang.String r0 = "Unknown adapter type"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationListView.getConversationCursorAdapter():X.1nd");
    }

    public int getFirstPosition() {
        int firstVisiblePosition = getFirstVisiblePosition() - getHeaderViewsCount();
        for (int i = 1; i < getChildCount(); i++) {
            firstVisiblePosition = (getFirstVisiblePosition() + i) - getHeaderViewsCount();
            if (getChildAt(i).getTop() >= getResources().getDimensionPixelSize(R.dimen.f7nameremoved)) {
                break;
            }
        }
        return firstVisiblePosition;
    }

    public View getLastRow() {
        return getChildAt(getChildCount() - 1);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, int i, AccessibilityNodeInfo accessibilityNodeInfo) {
        ListAdapter adapter = getAdapter();
        if (i != -1 && adapter != null) {
            if (i >= adapter.getCount()) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("conversationvistview/onInitializeAccessibilityNodeInfoForItem pos:");
                A0u.append(i);
                A0u.append(" count:");
                Log.w(C36381kD.A10(A0u, adapter.getCount()));
                return;
            }
            super.onInitializeAccessibilityNodeInfoForItem(view, i, accessibilityNodeInfo);
        }
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return super.onInterceptHoverEvent(motionEvent);
    }

    public void onMeasure(int i, int i2) {
        if (getTranscriptMode() == 2) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if ((mode == Integer.MIN_VALUE || mode == 1073741824) && size == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(1, mode);
            }
        }
        super.onMeasure(i, i2);
    }

    public Parcelable onSaveInstanceState() {
        C166287vT r1 = new C166287vT(super.onSaveInstanceState());
        r1.A02 = this.A0N;
        r1.A00 = this.A01;
        r1.A01 = this.A02;
        return r1;
    }

    public void setScrollToBottom(boolean z) {
        this.A0O = z;
    }

    public void setScrollToTop(boolean z) {
        this.A0P = z;
    }

    public void setShouldIgnoreLayoutUpdate(boolean z) {
        this.A0R = z;
    }

    public ConversationListView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A04();
    }

    public void addFooterView(View view, Object obj, boolean z) {
        A00(view);
        super.addFooterView(view, obj, z);
    }

    public void addHeaderView(View view, Object obj, boolean z) {
        A00(view);
        super.addHeaderView(view, obj, z);
    }

    public ConversationListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0S = AnonymousClass4VT.A00(this);
        this.A05 = new C33471fP();
    }

    public ConversationListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A0S = AnonymousClass4VT.A00(this);
        this.A05 = new C33471fP();
    }

    public ConversationListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0S = AnonymousClass4VT.A00(this);
        this.A05 = new C33471fP();
    }
}
