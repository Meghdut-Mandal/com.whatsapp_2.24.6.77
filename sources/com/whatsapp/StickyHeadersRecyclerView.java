package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0CZ;
import X.AnonymousClass0D3;
import X.AnonymousClass1QZ;
import X.AnonymousClass2xF;
import X.C06360Th;
import X.C138586iM;
import X.C160717lT;
import X.C162397oW;
import X.C162477oe;
import X.C162507oh;
import X.C18700tb;
import X.C18820ts;
import X.C36341k9;
import X.C36351kA;
import X.C36441kJ;
import X.C41211wq;
import X.C90494aF;
import X.C90504aG;
import X.C96094mm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class StickyHeadersRecyclerView extends RecyclerView implements C18700tb {
    public int A00;
    public int A01;
    public int A02;
    public C06360Th A03;
    public AnonymousClass0D3 A04;
    public C18820ts A05;
    public AnonymousClass1QZ A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public boolean A0B;
    public final Rect A0C;

    private void A06(Context context, AttributeSet attributeSet) {
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0M);
            this.A08 = obtainStyledAttributes.getDimensionPixelSize(0, this.A08);
            i = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
        }
        if (this.A08 > 0) {
            A0t(new C41211wq(this.A05, i));
        }
        this.A0U = true;
        this.A03 = new C06360Th(context, new C162397oW(this, 1));
        this.A13.add(new C138586iM(this));
    }

    private C96094mm getStickyHeadersAdapter() {
        return (C96094mm) this.A0G;
    }

    public void A16() {
        if (!this.A0B) {
            this.A0B = true;
            this.A05 = C36341k9.A0U(generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A06;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public void setAdapter(AnonymousClass0CZ r5) {
        super.setAdapter(new C96094mm(r5));
        this.A0G.BnA(new C162507oh(this, 1));
        if (this.A08 > 0) {
            int measuredWidth = getMeasuredWidth();
            int i = this.A08;
            int max = Math.max(1, (measuredWidth + (i / 2)) / i);
            getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(max);
            gridLayoutManager.A02 = new C162477oe(this, gridLayoutManager, 0);
            setLayoutManager(gridLayoutManager);
        } else {
            getContext();
            C36351kA.A1F(this, 1);
        }
        this.A04 = this.A0G.BUw(this, -1000);
    }

    public StickyHeadersRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A16();
        this.A01 = -1;
        this.A00 = -1;
        this.A0C = AnonymousClass001.A06();
        A06(context, attributeSet);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        C96094mm r8 = (C96094mm) this.A0G;
        int A1T = linearLayoutManager.A1T();
        if (A1T != -1) {
            if (A1T != this.A00) {
                this.A00 = A1T;
                long A002 = C96094mm.A00(r8, A1T);
                this.A09 = A002;
                int A082 = C90494aF.A08(A002);
                if (this.A01 != A082) {
                    this.A01 = A082;
                    ((C160717lT) r8.A00).BSC(this.A04, A082);
                    C90494aF.A0w(this.A04.A0H, C90504aG.A08(getWidth()), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
            }
            this.A02 = 0;
            if (!AnonymousClass000.A1Q(((this.A09 & 4294967295L) > 4294967295L ? 1 : ((this.A09 & 4294967295L) == 4294967295L ? 0 : -1)))) {
                int A1S = linearLayoutManager.A1S();
                if (this.A07 != A1S) {
                    this.A07 = A1S;
                    this.A0A = C96094mm.A00(r8, A1S);
                }
                if (AnonymousClass000.A1Q(((this.A0A & 4294967295L) > 4294967295L ? 1 : ((this.A0A & 4294967295L) == 4294967295L ? 0 : -1)))) {
                    View A0k = linearLayoutManager.A0k(A1S);
                    this.A02 = A0k.getTop() - this.A04.A0H.getMeasuredHeight();
                    Rect rect = this.A0C;
                    linearLayoutManager.A0Z(A0k, rect);
                    int i = this.A02 - rect.top;
                    this.A02 = i;
                    if (i > 0) {
                        this.A02 = 0;
                    }
                }
            }
            canvas.save();
            canvas.clipRect(0, this.A02, this.A04.A0H.getMeasuredWidth(), this.A02 + this.A04.A0H.getMeasuredHeight());
            canvas.translate(0.0f, (float) this.A02);
            this.A04.A0H.draw(canvas);
            canvas.restore();
        }
    }

    public void onMeasure(int i, int i2) {
        View view;
        super.onMeasure(i, i2);
        if (this.A08 > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.A08;
            ((GridLayoutManager) getLayoutManager()).A1o(Math.max(1, (measuredWidth + (i3 / 2)) / i3));
        }
        AnonymousClass0D3 r0 = this.A04;
        if (r0 != null && (view = r0.A0H) != null) {
            C90494aF.A0w(view, C90504aG.A08(getMeasuredWidth()), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public StickyHeadersRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A16();
    }

    public StickyHeadersRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A16();
        this.A01 = -1;
        this.A00 = -1;
        this.A0C = AnonymousClass001.A06();
        A06(context, attributeSet);
    }

    public StickyHeadersRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        A16();
        this.A01 = -1;
        this.A00 = -1;
        this.A0C = AnonymousClass001.A06();
        A06(context, (AttributeSet) null);
    }
}
