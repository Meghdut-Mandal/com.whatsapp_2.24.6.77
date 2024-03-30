package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import com.whatsapp.R;
import java.util.HashSet;

/* renamed from: X.07f  reason: invalid class name and case insensitive filesystem */
public abstract class C016807f extends ViewGroup implements C016707e {
    public static final int[] A0T = {16842912};
    public static final int[] A0U = {-16842910};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = -1;
    public int A06 = -1;
    public int A07;
    public int A08;
    public int A09;
    public int A0A = 0;
    public int A0B = 0;
    public ColorStateList A0C;
    public ColorStateList A0D;
    public ColorStateList A0E;
    public ColorStateList A0F;
    public C016307a A0G;
    public AnonymousClass07Y A0H;
    public AnonymousClass06J A0I;
    public AnonymousClass081[] A0J;
    public Drawable A0K;
    public boolean A0L;
    public boolean A0M = false;
    public final SparseArray A0N = new SparseArray(5);
    public final C017307k A0O;
    public final ColorStateList A0P = A01();
    public final SparseArray A0Q = new SparseArray(5);
    public final View.OnClickListener A0R;
    public final C017007h A0S = new C017207j(5);

    public abstract AnonymousClass081 A03(Context context);

    public int getWindowAnimations() {
        return 0;
    }

    private AnonymousClass081 getNewItem() {
        AnonymousClass081 r0 = (AnonymousClass081) this.A0S.B09();
        if (r0 == null) {
            return A03(getContext());
        }
        return r0;
    }

    public Drawable getItemBackground() {
        AnonymousClass081[] r1 = this.A0J;
        if (r1 == null || r1.length <= 0) {
            return this.A0K;
        }
        return r1[0].getBackground();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.A0D = colorStateList;
        AnonymousClass081[] r3 = this.A0J;
        if (r3 != null) {
            for (AnonymousClass081 iconTintList : r3) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        C012505l r1;
        this.A0C = colorStateList;
        AnonymousClass081[] r6 = this.A0J;
        if (r6 != null) {
            for (AnonymousClass081 r3 : r6) {
                AnonymousClass06J r2 = this.A0I;
                if (r2 == null || this.A0C == null) {
                    r1 = null;
                } else {
                    r1 = new C012505l(r2);
                    r1.A0C(this.A0C);
                }
                r3.setActiveIndicatorDrawable(r1);
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.A0L = z;
        AnonymousClass081[] r3 = this.A0J;
        if (r3 != null) {
            for (AnonymousClass081 activeIndicatorEnabled : r3) {
                activeIndicatorEnabled.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.A00 = i;
        AnonymousClass081[] r3 = this.A0J;
        if (r3 != null) {
            for (AnonymousClass081 activeIndicatorHeight : r3) {
                activeIndicatorHeight.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.A01 = i;
        AnonymousClass081[] r3 = this.A0J;
        if (r3 != null) {
            for (AnonymousClass081 activeIndicatorMarginHorizontal : r3) {
                activeIndicatorMarginHorizontal.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.A0M = z;
        AnonymousClass081[] r3 = this.A0J;
        if (r3 != null) {
            for (AnonymousClass081 r0 : r3) {
                r0.A09 = z;
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(AnonymousClass06J r8) {
        C012505l r1;
        this.A0I = r8;
        AnonymousClass081[] r6 = this.A0J;
        if (r6 != null) {
            for (AnonymousClass081 r3 : r6) {
                AnonymousClass06J r2 = this.A0I;
                if (r2 == null || this.A0C == null) {
                    r1 = null;
                } else {
                    r1 = new C012505l(r2);
                    r1.A0C(this.A0C);
                }
                r3.setActiveIndicatorDrawable(r1);
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.A02 = i;
        AnonymousClass081[] r3 = this.A0J;
        if (r3 != null) {
            for (AnonymousClass081 activeIndicatorWidth : r3) {
                activeIndicatorWidth.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.A0K = drawable;
        AnonymousClass081[] r3 = this.A0J;
        if (r3 != null) {
            for (AnonymousClass081 itemBackground : r3) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.A03 = i;
        AnonymousClass081[] r3 = this.A0J;
        if (r3 != null) {
            for (AnonymousClass081 itemBackground : r3) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.A04 = i;
        AnonymousClass081[] r3 = this.A0J;
        if (r3 != null) {
            for (AnonymousClass081 iconSize : r3) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.A05 = i;
        AnonymousClass081[] r3 = this.A0J;
        if (r3 != null) {
            for (AnonymousClass081 itemPaddingBottom : r3) {
                itemPaddingBottom.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.A06 = i;
        AnonymousClass081[] r3 = this.A0J;
        if (r3 != null) {
            for (AnonymousClass081 itemPaddingTop : r3) {
                itemPaddingTop.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.A0E = colorStateList;
        AnonymousClass081[] r3 = this.A0J;
        if (r3 != null) {
            for (AnonymousClass081 itemRippleColor : r3) {
                itemRippleColor.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.A07 = i;
        AnonymousClass081[] r4 = this.A0J;
        if (r4 != null) {
            for (AnonymousClass081 r1 : r4) {
                r1.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.A0F;
                if (colorStateList != null) {
                    r1.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.A08 = i;
        AnonymousClass081[] r4 = this.A0J;
        if (r4 != null) {
            for (AnonymousClass081 r1 : r4) {
                r1.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.A0F;
                if (colorStateList != null) {
                    r1.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.A0F = colorStateList;
        AnonymousClass081[] r3 = this.A0J;
        if (r3 != null) {
            for (AnonymousClass081 textColor : r3) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public C016807f(Context context) {
        super(context);
        if (isInEditMode()) {
            this.A0O = null;
        } else {
            C017407l r3 = new C017407l();
            this.A0O = r3;
            r3.A03 = true;
            r3.A0X((long) C014506h.A00(getContext(), R.attr.f4nameremoved, getResources().getInteger(R.integer.f8nameremoved)));
            r3.A0Y(C017807p.A01(AnonymousClass064.A02, getContext(), R.attr.f4nameremoved));
            r3.A0a(new C018007r());
        }
        this.A0R = new C18330sz(this, 1);
        C011504z.A06(this, 1);
    }

    private void setBadgeIfNeeded(AnonymousClass081 r3) {
        AnonymousClass08H r0;
        int id = r3.getId();
        if (id != -1 && (r0 = (AnonymousClass08H) this.A0N.get(id)) != null) {
            r3.setBadge(r0);
        }
    }

    public ColorStateList A01() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            ColorStateList A002 = C013105r.A00(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(R.attr.f4nameremoved, typedValue, true)) {
                int i = typedValue.data;
                int defaultColor = A002.getDefaultColor();
                int[] iArr = A0U;
                return new ColorStateList(new int[][]{iArr, A0T, View.EMPTY_STATE_SET}, new int[]{A002.getColorForState(iArr, defaultColor), i, defaultColor});
            }
        }
        return null;
    }

    public void A02() {
        C012505l r1;
        removeAllViews();
        AnonymousClass081[] r6 = this.A0J;
        if (r6 != null) {
            for (AnonymousClass081 r2 : r6) {
                if (r2 != null) {
                    this.A0S.BnO(r2);
                    ImageView imageView = r2.A0O;
                    if (r2.A06 != null) {
                        if (imageView != null) {
                            r2.setClipChildren(true);
                            r2.setClipToPadding(true);
                            AnonymousClass0VX.A01(imageView, r2.A06);
                        }
                        r2.A06 = null;
                    }
                    r2.A05 = null;
                    r2.A01 = 0.0f;
                    r2.A0A = false;
                }
            }
        }
        if (this.A0G.size() == 0) {
            this.A0A = 0;
            this.A0B = 0;
            this.A0J = null;
            return;
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        int i2 = 0;
        while (true) {
            C016307a r12 = this.A0G;
            if (i2 >= r12.size()) {
                break;
            }
            hashSet.add(Integer.valueOf(r12.getItem(i2).getItemId()));
            i2++;
        }
        while (true) {
            SparseArray sparseArray = this.A0N;
            if (i >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i++;
        }
        C016307a r13 = this.A0G;
        this.A0J = new AnonymousClass081[r13.size()];
        int i3 = this.A09;
        int size = r13.A04().size();
        boolean z = true;
        if (i3 != -1 ? i3 != 0 : size <= 3) {
            z = false;
        }
        int i4 = 0;
        while (true) {
            C016307a r62 = this.A0G;
            if (i4 < r62.size()) {
                this.A0H.A02 = true;
                r62.getItem(i4).setCheckable(true);
                this.A0H.A02 = false;
                AnonymousClass081 newItem = getNewItem();
                this.A0J[i4] = newItem;
                newItem.setIconTintList(this.A0D);
                newItem.setIconSize(this.A04);
                newItem.setTextColor(this.A0P);
                newItem.setTextAppearanceInactive(this.A08);
                newItem.setTextAppearanceActive(this.A07);
                newItem.setTextColor(this.A0F);
                int i5 = this.A06;
                if (i5 != -1) {
                    newItem.setItemPaddingTop(i5);
                }
                int i6 = this.A05;
                if (i6 != -1) {
                    newItem.setItemPaddingBottom(i6);
                }
                newItem.setActiveIndicatorWidth(this.A02);
                newItem.setActiveIndicatorHeight(this.A00);
                newItem.setActiveIndicatorMarginHorizontal(this.A01);
                AnonymousClass06J r63 = this.A0I;
                if (r63 == null || this.A0C == null) {
                    r1 = null;
                } else {
                    r1 = new C012505l(r63);
                    r1.A0C(this.A0C);
                }
                newItem.setActiveIndicatorDrawable(r1);
                newItem.A09 = this.A0M;
                newItem.setActiveIndicatorEnabled(this.A0L);
                Drawable drawable = this.A0K;
                if (drawable != null) {
                    newItem.setItemBackground(drawable);
                } else {
                    newItem.setItemBackground(this.A03);
                }
                newItem.setItemRippleColor(this.A0E);
                newItem.setShifting(z);
                newItem.setLabelVisibilityMode(this.A09);
                C018707z r0 = (C018707z) this.A0G.getItem(i4);
                newItem.BKf(r0, 0);
                newItem.A02 = i4;
                int itemId = r0.getItemId();
                newItem.setOnTouchListener((View.OnTouchListener) this.A0Q.get(itemId));
                newItem.setOnClickListener(this.A0R);
                int i7 = this.A0A;
                if (i7 != 0 && itemId == i7) {
                    this.A0B = i4;
                }
                setBadgeIfNeeded(newItem);
                addView(newItem);
                i4++;
            } else {
                int min = Math.min(r62.size() - 1, this.A0B);
                this.A0B = min;
                r62.getItem(min).setChecked(true);
                return;
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C07650Ys(accessibilityNodeInfo).A0J(new AnonymousClass0SK(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.A0G.A04().size(), false, 1)));
    }

    public void BKe(C016307a r1) {
        this.A0G = r1;
    }

    public void setLabelVisibilityMode(int i) {
        this.A09 = i;
    }

    public void setPresenter(AnonymousClass07Y r1) {
        this.A0H = r1;
    }

    public SparseArray getBadgeDrawables() {
        return this.A0N;
    }

    public ColorStateList getIconTintList() {
        return this.A0D;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.A0C;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.A0L;
    }

    public int getItemActiveIndicatorHeight() {
        return this.A00;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.A01;
    }

    public AnonymousClass06J getItemActiveIndicatorShapeAppearance() {
        return this.A0I;
    }

    public int getItemActiveIndicatorWidth() {
        return this.A02;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.A03;
    }

    public int getItemIconSize() {
        return this.A04;
    }

    public int getItemPaddingBottom() {
        return this.A05;
    }

    public int getItemPaddingTop() {
        return this.A06;
    }

    public ColorStateList getItemRippleColor() {
        return this.A0E;
    }

    public int getItemTextAppearanceActive() {
        return this.A07;
    }

    public int getItemTextAppearanceInactive() {
        return this.A08;
    }

    public ColorStateList getItemTextColor() {
        return this.A0F;
    }

    public int getLabelVisibilityMode() {
        return this.A09;
    }

    public C016307a getMenu() {
        return this.A0G;
    }

    public int getSelectedItemId() {
        return this.A0A;
    }

    public int getSelectedItemPosition() {
        return this.A0B;
    }
}
