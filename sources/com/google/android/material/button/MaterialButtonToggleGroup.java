package com.google.android.material.button;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass04F;
import X.AnonymousClass06J;
import X.AnonymousClass0SK;
import X.AnonymousClass0YO;
import X.C011504z;
import X.C012005e;
import X.C013205s;
import X.C07060We;
import X.C07650Ys;
import X.C10700ey;
import X.C16930qR;
import X.C18120se;
import X.C18400t6;
import X.C27891Qg;
import X.C27931Qk;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class MaterialButtonToggleGroup extends LinearLayout {
    public boolean A00;
    public boolean A01;
    public Integer[] A02;
    public Set A03;
    public boolean A04;
    public final Comparator A05;
    public final LinkedHashSet A06;
    public final List A07;
    public final int A08;
    public final C10700ey A09;

    public static void A01(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", AnonymousClass000.A0r("Button ID is not valid: ", AnonymousClass000.A0u(), i));
            return;
        }
        HashSet hashSet = new HashSet(materialButtonToggleGroup.A03);
        if (z) {
            Integer valueOf = Integer.valueOf(i);
            if (!hashSet.contains(valueOf)) {
                if (materialButtonToggleGroup.A00 && !hashSet.isEmpty()) {
                    hashSet.clear();
                }
                hashSet.add(valueOf);
            } else {
                return;
            }
        } else {
            Integer valueOf2 = Integer.valueOf(i);
            if (!hashSet.contains(valueOf2)) {
                return;
            }
            if (!materialButtonToggleGroup.A04 || hashSet.size() > 1) {
                hashSet.remove(valueOf2);
            }
        }
        materialButtonToggleGroup.A02(hashSet);
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && AnonymousClass001.A05(this, i2) != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.A02 = this.A09;
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private void A02(Set set) {
        Set set2 = this.A03;
        this.A03 = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = getChildAt(i).getId();
            Integer valueOf = Integer.valueOf(id);
            boolean contains = set.contains(valueOf);
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.A01 = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.A01 = false;
            }
            if (set2.contains(valueOf) != set.contains(valueOf)) {
                boolean A1Z = AnonymousClass000.A1Z(set, id);
                Iterator it = this.A06.iterator();
                while (it.hasNext()) {
                    ((C16930qR) it.next()).BSU(this, id, A1Z);
                }
            }
        }
        invalidate();
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        A01(this, materialButton.getId(), materialButton.isChecked());
        AnonymousClass06J shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.A07.add(new C07060We(shapeAppearanceModel.A06, shapeAppearanceModel.A04, shapeAppearanceModel.A07, shapeAppearanceModel.A05));
        materialButton.setEnabled(isEnabled());
        C012005e.A0V(materialButton, new C18120se(this, 3));
    }

    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.A05);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(getChildAt(i), Integer.valueOf(i));
        }
        this.A02 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public int getCheckedButtonId() {
        if (!this.A00 || this.A03.isEmpty()) {
            return -1;
        }
        return AnonymousClass000.A0I(this.A03.iterator().next());
    }

    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.A02;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    public void setSingleSelection(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            A02(new HashSet());
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    private void A00() {
        ViewGroup.MarginLayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i);
                int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    AnonymousClass0YO.A02(layoutParams, 0);
                    AnonymousClass0YO.A03(layoutParams, -min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    AnonymousClass0YO.A03(layoutParams, 0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(getChildAt(firstVisibleChildIndex));
                if (getOrientation() == 1) {
                    A0a.topMargin = 0;
                    A0a.bottomMargin = 0;
                    return;
                }
                AnonymousClass0YO.A02(A0a, 0);
                AnonymousClass0YO.A03(A0a, 0);
                A0a.leftMargin = 0;
                A0a.rightMargin = 0;
            }
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (AnonymousClass001.A05(this, i) != 8) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        int childCount = getChildCount();
        do {
            childCount--;
            if (childCount < 0) {
                return -1;
            }
        } while (AnonymousClass001.A05(this, childCount) == 8);
        return childCount;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(AnonymousClass04F.A00());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (X.AnonymousClass04F.A01(r10) == 1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (X.AnonymousClass04F.A01(r10) == 1) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        r2 = r3.A02;
        r1 = r3.A00;
        r0 = X.C07060We.A04;
        r3 = new X.C07060We(r2, r1, r0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        if (r3 == null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r10 = this;
            int r9 = r10.getChildCount()
            int r8 = r10.getFirstVisibleChildIndex()
            int r7 = r10.getLastVisibleChildIndex()
            r6 = 0
        L_0x000d:
            if (r6 >= r9) goto L_0x009f
            android.view.View r5 = r10.getChildAt(r6)
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            int r1 = r5.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x003e
            X.06J r0 = r5.getShapeAppearanceModel()
            X.06M r4 = new X.06M
            r4.<init>(r0)
            java.util.List r0 = r10.A07
            java.lang.Object r3 = r0.get(r6)
            X.0We r3 = (X.C07060We) r3
            if (r8 != r7) goto L_0x0041
            if (r3 != 0) goto L_0x005f
        L_0x0032:
            r0 = 0
            r4.A00(r0)
        L_0x0036:
            X.06J r0 = new X.06J
            r0.<init>(r4)
            r5.setShapeAppearanceModel(r0)
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x000d
        L_0x0041:
            int r0 = r10.getOrientation()
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r6 != r8) goto L_0x007c
            if (r0 == 0) goto L_0x0070
            int r1 = X.AnonymousClass04F.A01(r10)
            r0 = 1
            if (r1 != r0) goto L_0x0087
        L_0x0054:
            X.06K r2 = X.C07060We.A04
            X.06K r1 = r3.A03
            X.06K r0 = r3.A01
            X.0We r3 = new X.0We
            r3.<init>(r2, r2, r1, r0)
        L_0x005f:
            X.06K r0 = r3.A02
            r4.A02 = r0
            X.06K r0 = r3.A00
            r4.A00 = r0
            X.06K r0 = r3.A03
            r4.A03 = r0
            X.06K r0 = r3.A01
            r4.A01 = r0
            goto L_0x0036
        L_0x0070:
            X.06K r2 = r3.A02
            X.06K r1 = X.C07060We.A04
            X.06K r0 = r3.A03
            X.0We r3 = new X.0We
            r3.<init>(r2, r1, r0, r1)
            goto L_0x005f
        L_0x007c:
            if (r6 != r7) goto L_0x0032
            if (r0 == 0) goto L_0x0093
            int r1 = X.AnonymousClass04F.A01(r10)
            r0 = 1
            if (r1 != r0) goto L_0x0054
        L_0x0087:
            X.06K r2 = r3.A02
            X.06K r1 = r3.A00
            X.06K r0 = X.C07060We.A04
            X.0We r3 = new X.0We
            r3.<init>(r2, r1, r0, r0)
            goto L_0x005f
        L_0x0093:
            X.06K r2 = X.C07060We.A04
            X.06K r1 = r3.A00
            X.06K r0 = r3.A01
            X.0We r3 = new X.0We
            r3.<init>(r2, r1, r2, r0)
            goto L_0x005f
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.A03():void");
    }

    public List getCheckedButtonIds() {
        ArrayList A0I = AnonymousClass001.A0I();
        for (int i = 0; i < getChildCount(); i++) {
            int id = getChildAt(i).getId();
            if (AnonymousClass000.A1Z(this.A03, id)) {
                AnonymousClass000.A1F(A0I, id);
            }
        }
        return A0I;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.A08;
        if (i != -1) {
            A02(Collections.singleton(Integer.valueOf(i)));
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C07650Ys r4 = new C07650Ys(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        int i = 2;
        if (this.A00) {
            i = 1;
        }
        r4.A0J(new AnonymousClass0SK(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i)));
    }

    public void onMeasure(int i, int i2) {
        A03();
        A00();
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).A02 = null;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.A07.remove(indexOfChild);
        }
        A03();
        A00();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.A04 = z;
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(C27891Qg.A00(context, attributeSet, i, R.style.f13nameremoved), attributeSet, i);
        this.A07 = AnonymousClass001.A0I();
        this.A09 = new C10700ey(this);
        this.A06 = new LinkedHashSet();
        this.A05 = new C18400t6(this, 1);
        this.A01 = false;
        this.A03 = new HashSet();
        TypedArray A002 = C013205s.A00(getContext(), attributeSet, C27931Qk.A0J, new int[0], i, R.style.f13nameremoved);
        setSingleSelection(A002.getBoolean(3, false));
        this.A08 = A002.getResourceId(1, -1);
        this.A04 = A002.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(A002.getBoolean(0, true));
        A002.recycle();
        C011504z.A06(this, 1);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, (AttributeSet) null);
    }
}
