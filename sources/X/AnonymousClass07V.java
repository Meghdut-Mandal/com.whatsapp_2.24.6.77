package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.07V  reason: invalid class name */
public abstract class AnonymousClass07V extends FrameLayout {
    public AnonymousClass02L A00;
    public AnonymousClass02I A01;
    public MenuInflater A02;
    public final C016407b A03;
    public final C016807f A04;
    public final AnonymousClass07Y A05;

    public abstract C016807f A00(Context context);

    public abstract int getMaxItemCount();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass07V(android.content.Context r16, android.util.AttributeSet r17, int r18, int r19) {
        /*
            r15 = this;
            r0 = r16
            r10 = r17
            r13 = r18
            r14 = r19
            android.content.Context r0 = X.C27891Qg.A00(r0, r10, r13, r14)
            r15.<init>(r0, r10, r13)
            X.07Y r2 = new X.07Y
            r2.<init>()
            r15.A05 = r2
            android.content.Context r9 = r15.getContext()
            int[] r11 = X.C27931Qk.A0U
            r0 = 2
            int[] r12 = new int[r0]
            r0 = 10
            r5 = 0
            r12[r5] = r0
            r0 = 9
            r1 = 1
            r12[r1] = r0
            X.04j r3 = X.C013205s.A01(r9, r10, r11, r12, r13, r14)
            java.lang.Class r4 = r15.getClass()
            int r0 = r15.getMaxItemCount()
            X.07b r7 = new X.07b
            r7.<init>(r9, r4, r0)
            r15.A03 = r7
            X.07f r8 = r15.A00(r9)
            r15.A04 = r8
            r2.A01 = r8
            r2.A00 = r1
            r8.A0H = r2
            android.content.Context r0 = r7.A0N
            r7.A08(r0, r2)
            android.content.Context r0 = r15.getContext()
            r2.BKa(r0, r7)
            r2 = 5
            android.content.res.TypedArray r6 = r3.A02
            boolean r0 = r6.hasValue(r2)
            if (r0 == 0) goto L_0x01a8
            android.content.res.ColorStateList r0 = r3.A01(r2)
        L_0x0061:
            r8.setIconTintList(r0)
            android.content.res.Resources r2 = r15.getResources()
            r0 = 2131167547(0x7f07093b, float:1.794937E38)
            int r2 = r2.getDimensionPixelSize(r0)
            r0 = 4
            int r0 = r6.getDimensionPixelSize(r0, r2)
            r15.setItemIconSize(r0)
            r0 = 10
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L_0x0088
            r0 = 10
            int r0 = r6.getResourceId(r0, r5)
            r15.setItemTextAppearanceInactive(r0)
        L_0x0088:
            r0 = 9
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L_0x0099
            r0 = 9
            int r0 = r6.getResourceId(r0, r5)
            r15.setItemTextAppearanceActive(r0)
        L_0x0099:
            r2 = 11
            boolean r0 = r6.hasValue(r2)
            if (r0 == 0) goto L_0x00a8
            android.content.res.ColorStateList r0 = r3.A01(r2)
            r15.setItemTextColor(r0)
        L_0x00a8:
            android.graphics.drawable.Drawable r0 = r15.getBackground()
            if (r0 == 0) goto L_0x00b6
            android.graphics.drawable.Drawable r0 = r15.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x00d6
        L_0x00b6:
            X.05l r4 = new X.05l
            r4.<init>()
            android.graphics.drawable.Drawable r2 = r15.getBackground()
            boolean r0 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x00d0
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            int r0 = r2.getColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r4.A0C(r0)
        L_0x00d0:
            r4.A0B(r9)
            X.C011504z.A04(r4, r15)
        L_0x00d6:
            r0 = 7
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L_0x00e5
            r0 = 7
            int r0 = r6.getDimensionPixelSize(r0, r5)
            r15.setItemPaddingTop(r0)
        L_0x00e5:
            r0 = 6
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L_0x00f4
            r0 = 6
            int r0 = r6.getDimensionPixelSize(r0, r5)
            r15.setItemPaddingBottom(r0)
        L_0x00f4:
            boolean r0 = r6.hasValue(r1)
            if (r0 == 0) goto L_0x0102
            int r0 = r6.getDimensionPixelSize(r1, r5)
            float r0 = (float) r0
            r15.setElevation(r0)
        L_0x0102:
            android.content.res.ColorStateList r2 = X.AnonymousClass061.A01(r9, r3, r5)
            android.graphics.drawable.Drawable r0 = r15.getBackground()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            X.AnonymousClass076.A01(r2, r0)
            r2 = 12
            r0 = -1
            int r0 = r6.getInteger(r2, r0)
            r15.setLabelVisibilityMode(r0)
            r0 = 3
            int r0 = r6.getResourceId(r0, r5)
            if (r0 == 0) goto L_0x019d
            r8.setItemBackgroundRes(r0)
        L_0x0125:
            r0 = 2
            int r2 = r6.getResourceId(r0, r5)
            if (r2 == 0) goto L_0x016d
            r15.setItemActiveIndicatorEnabled(r1)
            int[] r0 = X.C27931Qk.A0T
            android.content.res.TypedArray r3 = r9.obtainStyledAttributes(r2, r0)
            int r0 = r3.getDimensionPixelSize(r1, r5)
            r15.setItemActiveIndicatorWidth(r0)
            int r0 = r3.getDimensionPixelSize(r5, r5)
            r15.setItemActiveIndicatorHeight(r0)
            r0 = 3
            int r0 = r3.getDimensionPixelOffset(r0, r5)
            r15.setItemActiveIndicatorMarginHorizontal(r0)
            r0 = 2
            android.content.res.ColorStateList r0 = X.AnonymousClass061.A00(r9, r3, r0)
            r15.setItemActiveIndicatorColor(r0)
            r0 = 4
            int r2 = r3.getResourceId(r0, r5)
            float r1 = (float) r5
            X.06P r0 = new X.06P
            r0.<init>(r1)
            X.06M r1 = X.AnonymousClass06J.A03(r9, r0, r2, r5)
            X.06J r0 = new X.06J
            r0.<init>(r1)
            r15.setItemActiveIndicatorShapeAppearance(r0)
            r3.recycle()
        L_0x016d:
            r0 = 13
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L_0x018e
            r0 = 13
            int r4 = r6.getResourceId(r0, r5)
            X.07Y r3 = r15.A05
            r2 = 1
            r3.A02 = r2
            android.view.MenuInflater r1 = r15.getMenuInflater()
            X.07b r0 = r15.A03
            r1.inflate(r4, r0)
            r3.A02 = r5
            r3.Bwl(r2)
        L_0x018e:
            r6.recycle()
            r15.addView(r8)
            X.07t r0 = new X.07t
            r0.<init>(r15)
            r7.A0C(r0)
            return
        L_0x019d:
            r0 = 8
            android.content.res.ColorStateList r0 = X.AnonymousClass061.A01(r9, r3, r0)
            r15.setItemRippleColor(r0)
            goto L_0x0125
        L_0x01a8:
            android.content.res.ColorStateList r0 = r8.A01()
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass07V.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    private MenuInflater getMenuInflater() {
        MenuInflater menuInflater = this.A02;
        if (menuInflater != null) {
            return menuInflater;
        }
        AnonymousClass0EG r1 = new AnonymousClass0EG(getContext());
        this.A02 = r1;
        return r1;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.A04.A0C;
    }

    public int getItemActiveIndicatorHeight() {
        return this.A04.A00;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.A04.A01;
    }

    public AnonymousClass06J getItemActiveIndicatorShapeAppearance() {
        return this.A04.A0I;
    }

    public int getItemActiveIndicatorWidth() {
        return this.A04.A02;
    }

    public Drawable getItemBackground() {
        return this.A04.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.A04.A03;
    }

    public int getItemIconSize() {
        return this.A04.A04;
    }

    public ColorStateList getItemIconTintList() {
        return this.A04.A0D;
    }

    public int getItemPaddingBottom() {
        return this.A04.A05;
    }

    public int getItemPaddingTop() {
        return this.A04.A06;
    }

    public ColorStateList getItemRippleColor() {
        return this.A04.A0E;
    }

    public int getItemTextAppearanceActive() {
        return this.A04.A07;
    }

    public int getItemTextAppearanceInactive() {
        return this.A04.A08;
    }

    public ColorStateList getItemTextColor() {
        return this.A04.A0F;
    }

    public int getLabelVisibilityMode() {
        return this.A04.A09;
    }

    public int getSelectedItemId() {
        return this.A04.A0A;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof AnonymousClass0HN)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass0HN r6 = (AnonymousClass0HN) parcelable;
        super.onRestoreInstanceState(r6.A00);
        C016407b r2 = this.A03;
        SparseArray sparseParcelableArray = r6.A00.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = r2.A09;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    Reference reference = (Reference) it.next();
                    AnonymousClass07X r1 = (AnonymousClass07X) reference.get();
                    if (r1 == null) {
                        copyOnWriteArrayList.remove(reference);
                    } else {
                        int id = r1.getId();
                        if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                            r1.Bf3(parcelable2);
                        }
                    }
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.A04.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.A04.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.A04.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.A04.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(AnonymousClass06J r2) {
        this.A04.setItemActiveIndicatorShapeAppearance(r2);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.A04.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.A04.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.A04.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.A04.setItemIconSize(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.A04.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.A04.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.A04.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.A04.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.A04.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.A04.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.A04.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        C016807f r1 = this.A04;
        if (r1.A09 != i) {
            r1.A09 = i;
            this.A05.Bwl(false);
        }
    }

    public void setSelectedItemId(int i) {
        C016407b r3 = this.A03;
        MenuItem findItem = r3.findItem(i);
        if (findItem != null && !r3.A0K(findItem, this.A05, 0)) {
            findItem.setChecked(true);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass06R.A01(this);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable Bfg;
        AnonymousClass0HN r6 = new AnonymousClass0HN(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        r6.A00 = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03.A09;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                AnonymousClass07X r0 = (AnonymousClass07X) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    int id = r0.getId();
                    if (id > 0 && (Bfg = r0.Bfg()) != null) {
                        sparseArray.put(id, Bfg);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return r6;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        AnonymousClass06R.A02(this, f);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setOnItemReselectedListener(AnonymousClass02L r1) {
        this.A00 = r1;
    }

    public void setOnItemSelectedListener(AnonymousClass02I r1) {
        this.A01 = r1;
    }

    public Menu getMenu() {
        return this.A03;
    }

    public C016707e getMenuView() {
        return this.A04;
    }

    public AnonymousClass07Y getPresenter() {
        return this.A05;
    }
}
