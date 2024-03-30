package androidx.constraintlayout.widget;

import X.AnonymousClass0B3;
import X.AnonymousClass0BI;
import X.AnonymousClass0BJ;
import X.AnonymousClass0BM;
import X.AnonymousClass0GG;
import X.AnonymousClass0OI;
import X.AnonymousClass0T9;
import X.AnonymousClass0UV;
import X.C02500Aq;
import X.C02520As;
import X.C07690Yx;
import X.C33961gD;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayout extends ViewGroup {
    public int A00 = -1;
    public int A01 = Integer.MAX_VALUE;
    public int A02 = Integer.MAX_VALUE;
    public int A03 = 0;
    public int A04 = 0;
    public SparseArray A05 = new SparseArray();
    public SparseArray A06 = new SparseArray();
    public C02520As A07 = new C02520As();
    public AnonymousClass0BI A08 = new AnonymousClass0BI(this, this);
    public AnonymousClass0T9 A09 = null;
    public C07690Yx A0A = null;
    public ArrayList A0B = new ArrayList(4);
    public HashMap A0C = new HashMap();
    public boolean A0D = true;
    public int A0E = 263;
    public AnonymousClass0OI A0F;

    public void forceLayout() {
        this.A0D = true;
        super.forceLayout();
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass0BJ(-2, -2);
    }

    public void requestLayout() {
        this.A0D = true;
        super.requestLayout();
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    private void A00(AttributeSet attributeSet, int i, int i2) {
        C02520As r7 = this.A07;
        r7.A0e = this;
        AnonymousClass0BI r1 = this.A08;
        r7.A05 = r1;
        r7.A07.A03 = r1;
        this.A05.put(getId(), this);
        this.A0A = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C33961gD.A01, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.A04 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A04);
                } else if (index == 10) {
                    this.A03 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A03);
                } else if (index == 7) {
                    this.A02 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A02);
                } else if (index == 8) {
                    this.A01 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A01);
                } else if (index == 89) {
                    this.A0E = obtainStyledAttributes.getInt(index, this.A0E);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.A09 = new AnonymousClass0T9(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.A09 = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C07690Yx r11 = new C07690Yx();
                        this.A0A = r11;
                        Context context = getContext();
                        XmlResourceParser xml = context.getResources().getXml(resourceId2);
                        try {
                            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                if (eventType == 0) {
                                    xml.getName();
                                } else if (eventType == 2) {
                                    String name = xml.getName();
                                    AnonymousClass0UV A022 = C07690Yx.A02(context, Xml.asAttributeSet(xml));
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        A022.A02.A0y = true;
                                    }
                                    r11.A00.put(Integer.valueOf(A022.A00), A022);
                                }
                            }
                        } catch (XmlPullParserException e) {
                            e.printStackTrace();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Resources.NotFoundException unused2) {
                        this.A0A = null;
                    }
                    this.A00 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i4 = this.A0E;
        r7.A01 = i4;
        boolean z = false;
        if ((i4 & 256) == 256) {
            z = true;
        }
        AnonymousClass0B3.A0F = z;
    }

    public final C02500Aq A05(View view) {
        if (view == this) {
            return this.A07;
        }
        if (view == null) {
            return null;
        }
        return ((AnonymousClass0BJ) view.getLayoutParams()).A0s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r24) {
        /*
            r23 = this;
            r10 = r23
            java.util.ArrayList r2 = r10.A0B
            r16 = 0
            if (r2 == 0) goto L_0x0017
            int r1 = r2.size()
            if (r1 <= 0) goto L_0x0017
            r0 = 0
        L_0x000f:
            r2.get(r0)
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x0017
            goto L_0x000f
        L_0x0017:
            r11 = r24
            super.dispatchDraw(r11)
            boolean r0 = r10.isInEditMode()
            if (r0 == 0) goto L_0x00d2
            int r9 = r10.getChildCount()
            int r0 = r10.getWidth()
            float r8 = (float) r0
            int r0 = r10.getHeight()
            float r7 = (float) r0
            r15 = 1149698048(0x44870000, float:1080.0)
            r14 = 1156579328(0x44f00000, float:1920.0)
            r6 = 0
        L_0x0035:
            if (r6 >= r9) goto L_0x00d2
            android.view.View r2 = r10.getChildAt(r6)
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00ce
            java.lang.Object r1 = r2.getTag()
            if (r1 == 0) goto L_0x00ce
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00ce
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ","
            java.lang.String[] r1 = r1.split(r0)
            int r2 = r1.length
            r0 = 4
            if (r2 != r0) goto L_0x00ce
            r0 = r1[r16]
            int r4 = java.lang.Integer.parseInt(r0)
            r0 = 1
            r0 = r1[r0]
            int r3 = java.lang.Integer.parseInt(r0)
            r0 = 2
            r0 = r1[r0]
            int r2 = java.lang.Integer.parseInt(r0)
            r0 = 3
            r0 = r1[r0]
            int r1 = java.lang.Integer.parseInt(r0)
            float r0 = (float) r4
            float r0 = r0 / r15
            float r0 = r0 * r8
            int r13 = (int) r0
            float r0 = (float) r3
            float r0 = r0 / r14
            float r0 = r0 * r7
            int r12 = (int) r0
            float r0 = (float) r2
            float r0 = r0 / r15
            float r0 = r0 * r8
            int r2 = (int) r0
            float r0 = (float) r1
            float r0 = r0 / r14
            float r0 = r0 * r7
            int r1 = (int) r0
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r5.setColor(r0)
            float r4 = (float) r13
            float r3 = (float) r12
            int r13 = r13 + r2
            float r2 = (float) r13
            r19 = r3
            r20 = r2
            r21 = r3
            r22 = r5
            r18 = r4
            r17 = r11
            r17.drawLine(r18, r19, r20, r21, r22)
            int r12 = r12 + r1
            float r1 = (float) r12
            r18 = r2
            r21 = r1
            r17.drawLine(r18, r19, r20, r21, r22)
            r19 = r1
            r20 = r4
            r17.drawLine(r18, r19, r20, r21, r22)
            r21 = r3
            r18 = r4
            r17.drawLine(r18, r19, r20, r21, r22)
            r0 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r5.setColor(r0)
            r19 = r3
            r20 = r2
            r21 = r1
            r17.drawLine(r18, r19, r20, r21, r22)
            r19 = r1
            r21 = r3
            r17.drawLine(r18, r19, r20, r21, r22)
        L_0x00ce:
            int r6 = r6 + 1
            goto L_0x0035
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public int getOptimizationLevel() {
        return this.A07.A01;
    }

    public void setId(int i) {
        SparseArray sparseArray = this.A05;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.A01) {
            this.A01 = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.A02) {
            this.A02 = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.A03) {
            this.A03 = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.A04) {
            this.A04 = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(AnonymousClass0OI r2) {
        this.A0F = r2;
        AnonymousClass0T9 r0 = this.A09;
        if (r0 != null) {
            r0.A02 = r2;
        }
    }

    public void setOptimizationLevel(int i) {
        this.A0E = i;
        this.A07.A01 = i;
        boolean z = false;
        if ((i & 256) == 256) {
            z = true;
        }
        AnonymousClass0B3.A0F = z;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(attributeSet, i, i2);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass0BJ(getContext(), attributeSet);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            AnonymousClass0BJ r2 = (AnonymousClass0BJ) childAt.getLayoutParams();
            C02500Aq r4 = r2.A0s;
            if (childAt.getVisibility() != 8 || r2.A0y || r2.A01 || isInEditMode) {
                int A042 = r4.A04();
                int A052 = r4.A05();
                childAt.layout(A042, A052, r4.A03() + A042, r4.A02() + A052);
            }
        }
        ArrayList arrayList = this.A0B;
        int size = arrayList.size();
        if (size > 0) {
            do {
                ((AnonymousClass0BM) arrayList.get(i5)).A08(this);
                i5++;
            } while (i5 < size);
        }
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C02500Aq A052 = A05(view);
        if ((view instanceof Guideline) && !(A052 instanceof AnonymousClass0GG)) {
            AnonymousClass0BJ r0 = (AnonymousClass0BJ) view.getLayoutParams();
            AnonymousClass0GG r1 = new AnonymousClass0GG();
            r0.A0s = r1;
            r0.A0y = true;
            r1.A0K(r0.A0c);
        }
        if (view instanceof AnonymousClass0BM) {
            AnonymousClass0BM r2 = (AnonymousClass0BM) view;
            r2.A04();
            ((AnonymousClass0BJ) view.getLayoutParams()).A01 = true;
            ArrayList arrayList = this.A0B;
            if (!arrayList.contains(r2)) {
                arrayList.add(r2);
            }
        }
        this.A05.put(view.getId(), view);
        this.A0D = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A05.remove(view.getId());
        C02500Aq A052 = A05(view);
        this.A07.A00.remove(A052);
        A052.A0Z = null;
        this.A0B.remove(view);
        this.A0D = true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass0BJ;
    }

    public void setConstraintSet(C07690Yx r1) {
        this.A0A = r1;
    }

    public int getMaxHeight() {
        return this.A01;
    }

    public int getMaxWidth() {
        return this.A02;
    }

    public int getMinHeight() {
        return this.A03;
    }

    public int getMinWidth() {
        return this.A04;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 710 */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0670, code lost:
        if (r14.A01 <= 0.0f) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0684, code lost:
        if (r1 != false) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0704, code lost:
        if (r16 == 0) goto L_0x070b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0709, code lost:
        if (r16 == 0) goto L_0x070b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x070b, code lost:
        r10 = java.lang.Math.max(0, r7.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0718, code lost:
        if (r16 == 0) goto L_0x071f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x071d, code lost:
        if (r16 == 0) goto L_0x071f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x071f, code lost:
        r14 = java.lang.Math.max(0, r7.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x08e7, code lost:
        if (r2 != 2) goto L_0x08e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0453 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0948  */
    /* JADX WARNING: Removed duplicated region for block: B:631:0x08d4 A[EDGE_INSN: B:631:0x08d4->B:445:0x08d4 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            X.0As r9 = r7.A07
            r3 = 0
            android.content.Context r0 = r7.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r2 = r0.flags
            r0 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 & r0
            r1 = 1
            if (r2 == 0) goto L_0x001c
            int r0 = r7.getLayoutDirection()
            if (r1 != r0) goto L_0x001c
            r3 = 1
        L_0x001c:
            r9.A09 = r3
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x054a
            r11 = 0
            r7.A0D = r11
            int r2 = r7.getChildCount()
            r1 = 0
        L_0x002a:
            if (r1 >= r2) goto L_0x054a
            android.view.View r0 = r7.getChildAt(r1)
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto L_0x0052
            r10 = 1
            boolean r16 = r7.isInEditMode()
            int r8 = r7.getChildCount()
            r1 = 0
        L_0x0040:
            if (r1 >= r8) goto L_0x0055
            android.view.View r0 = r7.getChildAt(r1)
            X.0Aq r0 = r7.A05(r0)
            if (r0 == 0) goto L_0x004f
            r0.A07()
        L_0x004f:
            int r1 = r1 + 1
            goto L_0x0040
        L_0x0052:
            int r1 = r1 + 1
            goto L_0x002a
        L_0x0055:
            r4 = -1
            if (r16 == 0) goto L_0x00d8
            r5 = 0
        L_0x0059:
            if (r5 >= r8) goto L_0x00d8
            android.view.View r6 = r7.getChildAt(r5)
            android.content.res.Resources r1 = r7.getResources()     // Catch:{ NotFoundException -> 0x00d5 }
            int r0 = r6.getId()     // Catch:{ NotFoundException -> 0x00d5 }
            java.lang.String r3 = r1.getResourceName(r0)     // Catch:{ NotFoundException -> 0x00d5 }
            int r0 = r6.getId()     // Catch:{ NotFoundException -> 0x00d5 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x00d5 }
            if (r3 == 0) goto L_0x0094
            java.util.HashMap r0 = r7.A0C     // Catch:{ NotFoundException -> 0x00d5 }
            if (r0 != 0) goto L_0x0080
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ NotFoundException -> 0x00d5 }
            r0.<init>()     // Catch:{ NotFoundException -> 0x00d5 }
            r7.A0C = r0     // Catch:{ NotFoundException -> 0x00d5 }
        L_0x0080:
            r1 = r3
            java.lang.String r0 = "/"
            int r0 = r3.indexOf(r0)     // Catch:{ NotFoundException -> 0x00d5 }
            if (r0 == r4) goto L_0x008f
            int r0 = r0 + 1
            java.lang.String r1 = r3.substring(r0)     // Catch:{ NotFoundException -> 0x00d5 }
        L_0x008f:
            java.util.HashMap r0 = r7.A0C     // Catch:{ NotFoundException -> 0x00d5 }
            r0.put(r1, r2)     // Catch:{ NotFoundException -> 0x00d5 }
        L_0x0094:
            r0 = 47
            int r0 = r3.indexOf(r0)     // Catch:{ NotFoundException -> 0x00d5 }
            if (r0 == r4) goto L_0x00a2
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)     // Catch:{ NotFoundException -> 0x00d5 }
        L_0x00a2:
            int r2 = r6.getId()     // Catch:{ NotFoundException -> 0x00d5 }
            if (r2 == 0) goto L_0x00c9
            android.util.SparseArray r0 = r7.A05     // Catch:{ NotFoundException -> 0x00d5 }
            java.lang.Object r1 = r0.get(r2)     // Catch:{ NotFoundException -> 0x00d5 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ NotFoundException -> 0x00d5 }
            if (r1 != 0) goto L_0x00c6
            android.view.View r1 = r7.findViewById(r2)     // Catch:{ NotFoundException -> 0x00d5 }
            if (r1 == 0) goto L_0x00c4
            if (r1 == r7) goto L_0x00c6
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ NotFoundException -> 0x00d5 }
            if (r0 != r7) goto L_0x00c6
            r7.onViewAdded(r1)     // Catch:{ NotFoundException -> 0x00d5 }
            goto L_0x00c6
        L_0x00c4:
            r0 = 0
            goto L_0x00d3
        L_0x00c6:
            if (r1 == r7) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            r0 = r9
            goto L_0x00d3
        L_0x00cb:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()     // Catch:{ NotFoundException -> 0x00d5 }
            X.0BJ r0 = (X.AnonymousClass0BJ) r0     // Catch:{ NotFoundException -> 0x00d5 }
            X.0Aq r0 = r0.A0s     // Catch:{ NotFoundException -> 0x00d5 }
        L_0x00d3:
            r0.A0f = r3     // Catch:{ NotFoundException -> 0x00d5 }
        L_0x00d5:
            int r5 = r5 + 1
            goto L_0x0059
        L_0x00d8:
            int r0 = r7.A00
            if (r0 == r4) goto L_0x00e9
            r1 = 0
        L_0x00dd:
            if (r1 >= r8) goto L_0x00e9
            android.view.View r0 = r7.getChildAt(r1)
            r0.getId()
            int r1 = r1 + 1
            goto L_0x00dd
        L_0x00e9:
            X.0Yx r0 = r7.A0A
            if (r0 == 0) goto L_0x00f0
            r0.A0A(r7)
        L_0x00f0:
            java.util.ArrayList r0 = r9.A00
            r0.clear()
            java.util.ArrayList r12 = r7.A0B
            int r6 = r12.size()
            if (r6 <= 0) goto L_0x0185
            r5 = 0
        L_0x00fe:
            java.lang.Object r4 = r12.get(r5)
            X.0BM r4 = (X.AnonymousClass0BM) r4
            boolean r0 = r4.isInEditMode()
            if (r0 == 0) goto L_0x010f
            java.lang.String r0 = r4.A02
            r4.setIds(r0)
        L_0x010f:
            X.0pr r0 = r4.A01
            if (r0 == 0) goto L_0x017f
            X.0GK r0 = (X.AnonymousClass0GK) r0
            r0.A00 = r11
            X.0Aq[] r1 = r0.A01
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            r3 = 0
        L_0x011e:
            int r0 = r4.A00
            if (r3 >= r0) goto L_0x017f
            int[] r0 = r4.A04
            r1 = r0[r3]
            android.util.SparseArray r14 = r7.A05
            java.lang.Object r0 = r14.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L_0x0155
            java.util.HashMap r13 = r4.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r13.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            int r1 = X.AnonymousClass0BM.A00(r4, r7, r2)
            if (r1 == 0) goto L_0x017c
            int[] r0 = r4.A04
            r0[r3] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r13.put(r0, r2)
            java.lang.Object r0 = r14.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x017c
        L_0x0155:
            X.0pr r2 = r4.A01
            X.0Aq r13 = r7.A05(r0)
            X.0GK r2 = (X.AnonymousClass0GK) r2
            if (r13 == r2) goto L_0x017c
            if (r13 == 0) goto L_0x017c
            int r0 = r2.A00
            int r14 = r0 + 1
            X.0Aq[] r1 = r2.A01
            int r0 = r1.length
            if (r14 <= r0) goto L_0x0174
            int r0 = r0 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            X.0Aq[] r1 = (X.C02500Aq[]) r1
            r2.A01 = r1
        L_0x0174:
            int r0 = r2.A00
            r1[r0] = r13
            int r0 = r0 + 1
            r2.A00 = r0
        L_0x017c:
            int r3 = r3 + 1
            goto L_0x011e
        L_0x017f:
            int r5 = r5 + 1
            if (r5 >= r6) goto L_0x0185
            goto L_0x00fe
        L_0x0185:
            r0 = 0
        L_0x0186:
            if (r0 >= r8) goto L_0x018e
            r7.getChildAt(r0)
            int r0 = r0 + 1
            goto L_0x0186
        L_0x018e:
            android.util.SparseArray r6 = r7.A06
            r6.clear()
            r6.put(r11, r9)
            int r0 = r7.getId()
            r6.put(r0, r9)
            r2 = 0
        L_0x019e:
            if (r2 >= r8) goto L_0x01b2
            android.view.View r0 = r7.getChildAt(r2)
            X.0Aq r1 = r7.A05(r0)
            int r0 = r0.getId()
            r6.put(r0, r1)
            int r2 = r2 + 1
            goto L_0x019e
        L_0x01b2:
            r5 = 0
        L_0x01b3:
            if (r5 >= r8) goto L_0x050c
            android.view.View r1 = r7.getChildAt(r5)
            X.0Aq r4 = r7.A05(r1)
            if (r4 == 0) goto L_0x020f
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            X.0BJ r3 = (X.AnonymousClass0BJ) r3
            java.util.ArrayList r0 = r9.A00
            r0.add(r4)
            X.0Aq r0 = r4.A0Z
            if (r0 == 0) goto L_0x01d8
            X.0Ar r0 = (X.C02510Ar) r0
            java.util.ArrayList r0 = r0.A00
            r0.remove(r4)
            r0 = 0
            r4.A0Z = r0
        L_0x01d8:
            r4.A0Z = r9
            r3.A00()
            int r0 = r1.getVisibility()
            r4.A0N = r0
            r4.A0e = r1
            boolean r0 = r1 instanceof X.AnonymousClass0BM
            if (r0 == 0) goto L_0x01f0
            X.0BM r1 = (X.AnonymousClass0BM) r1
            boolean r0 = r9.A09
            r1.A07(r4, r0)
        L_0x01f0:
            boolean r0 = r3.A0y
            r2 = -1
            if (r0 == 0) goto L_0x022a
            X.0GG r4 = (X.AnonymousClass0GG) r4
            int r13 = r3.A0f
            int r12 = r3.A0g
            float r1 = r3.A08
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0212
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x020f
            r4.A00 = r1
            r4.A02 = r2
        L_0x020d:
            r4.A03 = r2
        L_0x020f:
            int r5 = r5 + 1
            goto L_0x01b3
        L_0x0212:
            if (r13 == r2) goto L_0x021d
            if (r13 <= r2) goto L_0x020f
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.A00 = r0
            r4.A02 = r13
            goto L_0x020d
        L_0x021d:
            if (r12 == r2) goto L_0x020f
            if (r12 <= r2) goto L_0x020f
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.A00 = r0
            r4.A02 = r2
            r4.A03 = r12
            goto L_0x020f
        L_0x022a:
            int r13 = r3.A0h
            int r1 = r3.A0i
            int r0 = r3.A0j
            r19 = r0
            int r14 = r3.A0k
            int r0 = r3.A0d
            r18 = r0
            int r0 = r3.A0e
            r17 = r0
            float r12 = r3.A09
            int r0 = r3.A0F
            if (r0 == r2) goto L_0x0353
            java.lang.Object r14 = r6.get(r0)
            X.0Aq r14 = (X.C02500Aq) r14
            if (r14 == 0) goto L_0x025d
            float r13 = r3.A02
            int r12 = r3.A0G
            java.lang.Integer r0 = X.C023109s.A0V
            X.0Az r1 = r4.A06(r0)
            X.0Az r0 = r14.A06(r0)
            r1.A05(r0, r12, r11, r10)
            r4.A00 = r13
        L_0x025d:
            if (r16 == 0) goto L_0x026d
            int r1 = r3.A0H
            if (r1 != r2) goto L_0x0267
            int r0 = r3.A0I
            if (r0 == r2) goto L_0x026d
        L_0x0267:
            int r0 = r3.A0I
            r4.A0P = r1
            r4.A0Q = r0
        L_0x026d:
            boolean r0 = r3.A0x
            r12 = -2
            if (r0 != 0) goto L_0x033e
            int r0 = r3.width
            if (r0 != r2) goto L_0x0333
            boolean r0 = r3.A0w
            if (r0 == 0) goto L_0x032f
            java.lang.Integer r1 = X.C023109s.A0C
        L_0x027c:
            java.lang.Integer[] r0 = r4.A0q
            r0[r11] = r1
            java.lang.Integer r0 = X.C023109s.A01
            X.0Az r1 = r4.A06(r0)
            int r0 = r3.leftMargin
            r1.A01 = r0
            java.lang.Integer r0 = X.C023109s.A0G
            X.0Az r1 = r4.A06(r0)
            int r0 = r3.rightMargin
            r1.A01 = r0
        L_0x0294:
            boolean r0 = r3.A10
            if (r0 != 0) goto L_0x031b
            int r0 = r3.height
            if (r0 != r2) goto L_0x0311
            boolean r0 = r3.A0v
            if (r0 == 0) goto L_0x030e
            java.lang.Integer r1 = X.C023109s.A0C
        L_0x02a2:
            java.lang.Integer[] r0 = r4.A0q
            r0[r10] = r1
            java.lang.Integer r0 = X.C023109s.A0C
            X.0Az r1 = r4.A06(r0)
            int r0 = r3.topMargin
            r1.A01 = r0
            java.lang.Integer r0 = X.C023109s.A0R
            X.0Az r1 = r4.A06(r0)
            int r0 = r3.bottomMargin
            r1.A01 = r0
        L_0x02ba:
            java.lang.String r1 = r3.A0u
            r12 = 0
            if (r1 == 0) goto L_0x04a3
            int r13 = r1.length()
            if (r13 == 0) goto L_0x04a3
            r0 = 44
            int r14 = r1.indexOf(r0)
            r15 = 0
            if (r14 <= 0) goto L_0x02e1
            int r0 = r13 + -1
            if (r14 >= r0) goto L_0x02e1
            java.lang.String r15 = r1.substring(r11, r14)
            java.lang.String r0 = "W"
            boolean r0 = r15.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0304
            r2 = 0
        L_0x02df:
            int r15 = r14 + 1
        L_0x02e1:
            r0 = 58
            int r0 = r1.indexOf(r0)
            if (r0 < 0) goto L_0x0494
            int r13 = r13 - r10
            if (r0 >= r13) goto L_0x0494
            java.lang.String r13 = r1.substring(r15, r0)
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            int r0 = r13.length()
            if (r0 <= 0) goto L_0x04ae
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x04ae
            goto L_0x0476
        L_0x0304:
            java.lang.String r0 = "H"
            boolean r0 = r15.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x02df
            r2 = 1
            goto L_0x02df
        L_0x030e:
            java.lang.Integer r1 = X.C023109s.A0G
            goto L_0x02a2
        L_0x0311:
            java.lang.Integer r1 = X.C023109s.A0C
            java.lang.Integer[] r0 = r4.A0q
            r0[r10] = r1
            r4.A08(r11)
            goto L_0x02ba
        L_0x031b:
            java.lang.Integer r1 = X.C023109s.A00
            java.lang.Integer[] r0 = r4.A0q
            r0[r10] = r1
            int r0 = r3.height
            r4.A08(r0)
            if (r0 != r12) goto L_0x02ba
            java.lang.Integer r1 = X.C023109s.A01
            java.lang.Integer[] r0 = r4.A0q
            r0[r10] = r1
            goto L_0x02ba
        L_0x032f:
            java.lang.Integer r1 = X.C023109s.A0G
            goto L_0x027c
        L_0x0333:
            java.lang.Integer r1 = X.C023109s.A0C
            java.lang.Integer[] r0 = r4.A0q
            r0[r11] = r1
            r4.A09(r11)
            goto L_0x0294
        L_0x033e:
            java.lang.Integer r1 = X.C023109s.A00
            java.lang.Integer[] r0 = r4.A0q
            r0[r11] = r1
            int r0 = r3.width
            r4.A09(r0)
            if (r0 != r12) goto L_0x0294
            java.lang.Integer r1 = X.C023109s.A01
            java.lang.Integer[] r0 = r4.A0q
            r0[r11] = r1
            goto L_0x0294
        L_0x0353:
            if (r13 == r2) goto L_0x0464
            java.lang.Object r13 = r6.get(r13)
            X.0Aq r13 = (X.C02500Aq) r13
            if (r13 == 0) goto L_0x036f
            java.lang.Integer r1 = X.C023109s.A01
            int r15 = r3.leftMargin
            r0 = r1
        L_0x0362:
            X.0Az r1 = r4.A06(r1)
            X.0Az r0 = r13.A06(r0)
            r13 = r18
            r1.A05(r0, r15, r13, r10)
        L_0x036f:
            r0 = r19
            if (r0 == r2) goto L_0x0453
            java.lang.Object r15 = r6.get(r0)
            X.0Aq r15 = (X.C02500Aq) r15
            if (r15 == 0) goto L_0x038e
            java.lang.Integer r1 = X.C023109s.A0G
            java.lang.Integer r0 = X.C023109s.A01
            int r14 = r3.rightMargin
        L_0x0381:
            X.0Az r13 = r4.A06(r1)
            X.0Az r1 = r15.A06(r0)
            r0 = r17
            r13.A05(r1, r14, r0, r10)
        L_0x038e:
            int r0 = r3.A0q
            if (r0 == r2) goto L_0x043d
            java.lang.Object r15 = r6.get(r0)
            X.0Aq r15 = (X.C02500Aq) r15
            if (r15 == 0) goto L_0x03ac
            java.lang.Integer r1 = X.C023109s.A0C
            int r14 = r3.topMargin
            int r13 = r3.A0Q
            r0 = r1
        L_0x03a1:
            X.0Az r1 = r4.A06(r1)
            X.0Az r0 = r15.A06(r0)
            r1.A05(r0, r14, r13, r10)
        L_0x03ac:
            int r0 = r3.A0E
            if (r0 == r2) goto L_0x0429
            java.lang.Object r15 = r6.get(r0)
            X.0Aq r15 = (X.C02500Aq) r15
            if (r15 == 0) goto L_0x03cb
            java.lang.Integer r1 = X.C023109s.A0R
            java.lang.Integer r0 = X.C023109s.A0C
            int r14 = r3.bottomMargin
            int r13 = r3.A0L
        L_0x03c0:
            X.0Az r1 = r4.A06(r1)
            X.0Az r0 = r15.A06(r0)
            r1.A05(r0, r14, r13, r10)
        L_0x03cb:
            int r13 = r3.A0C
            if (r13 == r2) goto L_0x0418
            android.util.SparseArray r0 = r7.A05
            java.lang.Object r1 = r0.get(r13)
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r14 = r6.get(r13)
            X.0Aq r14 = (X.C02500Aq) r14
            if (r14 == 0) goto L_0x0418
            if (r1 == 0) goto L_0x0418
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            boolean r0 = r0 instanceof X.AnonymousClass0BJ
            if (r0 == 0) goto L_0x0418
            android.view.ViewGroup$LayoutParams r13 = r1.getLayoutParams()
            X.0BJ r13 = (X.AnonymousClass0BJ) r13
            r3.A0z = r10
            r13.A0z = r10
            java.lang.Integer r0 = X.C023109s.A0S
            X.0Az r1 = r4.A06(r0)
            X.0Az r0 = r14.A06(r0)
            r1.A05(r0, r11, r2, r10)
            r4.A0h = r10
            X.0Aq r0 = r13.A0s
            r0.A0h = r10
            java.lang.Integer r0 = X.C023109s.A0C
            X.0Az r0 = r4.A06(r0)
            r0.A02()
            java.lang.Integer r0 = X.C023109s.A0R
            X.0Az r0 = r4.A06(r0)
            r0.A02()
        L_0x0418:
            r13 = 0
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x041f
            r4.A02 = r12
        L_0x041f:
            float r1 = r3.A0A
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x025d
            r4.A06 = r1
            goto L_0x025d
        L_0x0429:
            int r0 = r3.A0D
            if (r0 == r2) goto L_0x03cb
            java.lang.Object r15 = r6.get(r0)
            X.0Aq r15 = (X.C02500Aq) r15
            if (r15 == 0) goto L_0x03cb
            java.lang.Integer r1 = X.C023109s.A0R
            int r14 = r3.bottomMargin
            int r13 = r3.A0L
            r0 = r1
            goto L_0x03c0
        L_0x043d:
            int r0 = r3.A0p
            if (r0 == r2) goto L_0x03ac
            java.lang.Object r15 = r6.get(r0)
            X.0Aq r15 = (X.C02500Aq) r15
            if (r15 == 0) goto L_0x03ac
            java.lang.Integer r1 = X.C023109s.A0C
            java.lang.Integer r0 = X.C023109s.A0R
            int r14 = r3.topMargin
            int r13 = r3.A0Q
            goto L_0x03a1
        L_0x0453:
            if (r14 == r2) goto L_0x038e
            java.lang.Object r15 = r6.get(r14)
            X.0Aq r15 = (X.C02500Aq) r15
            if (r15 == 0) goto L_0x038e
            java.lang.Integer r1 = X.C023109s.A0G
            int r14 = r3.rightMargin
            r0 = r1
            goto L_0x0381
        L_0x0464:
            if (r1 == r2) goto L_0x036f
            java.lang.Object r13 = r6.get(r1)
            X.0Aq r13 = (X.C02500Aq) r13
            if (r13 == 0) goto L_0x036f
            java.lang.Integer r1 = X.C023109s.A01
            java.lang.Integer r0 = X.C023109s.A0G
            int r15 = r3.leftMargin
            goto L_0x0362
        L_0x0476:
            float r13 = java.lang.Float.parseFloat(r13)     // Catch:{ NumberFormatException -> 0x04ae }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x04ae }
            int r0 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04ae
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04ae
            if (r2 != r10) goto L_0x048e
            float r1 = r1 / r13
            float r1 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x04ae }
            goto L_0x04a6
        L_0x048e:
            float r13 = r13 / r1
            float r1 = java.lang.Math.abs(r13)     // Catch:{ NumberFormatException -> 0x04ae }
            goto L_0x04a6
        L_0x0494:
            java.lang.String r1 = r1.substring(r15)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x04ae
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x04ae }
            goto L_0x04a6
        L_0x04a3:
            r4.A01 = r12
            goto L_0x04ae
        L_0x04a6:
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04ae
            r4.A01 = r1
            r4.A08 = r2
        L_0x04ae:
            float r0 = r3.A05
            float[] r1 = r4.A0j
            r1[r11] = r0
            float r0 = r3.A0B
            r1[r10] = r0
            int r0 = r3.A0T
            r4.A0A = r0
            int r0 = r3.A0r
            r4.A0L = r0
            int r2 = r3.A0X
            int r0 = r3.A0b
            int r13 = r3.A0Z
            float r1 = r3.A07
            r4.A0D = r2
            r4.A0H = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r13 != r0) goto L_0x04d2
            r13 = 0
        L_0x04d2:
            r4.A0F = r13
            r4.A04 = r1
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04e5
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x04e5
            if (r2 != 0) goto L_0x04e5
            r0 = 2
            r4.A0D = r0
        L_0x04e5:
            int r2 = r3.A0W
            int r0 = r3.A0a
            int r13 = r3.A0Y
            float r1 = r3.A06
            r4.A0C = r2
            r4.A0G = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r13 != r0) goto L_0x04f7
            r13 = 0
        L_0x04f7:
            r4.A0E = r13
            r4.A03 = r1
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x020f
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x020f
            if (r2 != 0) goto L_0x020f
            r0 = 2
            r4.A0C = r0
            goto L_0x020f
        L_0x050c:
            X.0B0 r0 = r9.A06
            java.util.ArrayList r8 = r0.A02
            r8.clear()
            java.util.ArrayList r6 = r9.A00
            int r5 = r6.size()
            r4 = 0
        L_0x051a:
            if (r4 >= r5) goto L_0x0545
            java.lang.Object r3 = r6.get(r4)
            X.0Aq r3 = (X.C02500Aq) r3
            java.lang.Integer[] r0 = r3.A0q
            r0 = r0[r11]
            java.lang.Integer r10 = X.C023109s.A0C
            if (r0 == r10) goto L_0x053f
            java.lang.Integer[] r0 = r3.A0q
            r0 = r0[r11]
            java.lang.Integer r2 = X.C023109s.A0G
            if (r0 == r2) goto L_0x053f
            java.lang.Integer[] r0 = r3.A0q
            r1 = 1
            r0 = r0[r1]
            if (r0 == r10) goto L_0x053f
            java.lang.Integer[] r0 = r3.A0q
            r0 = r0[r1]
            if (r0 != r2) goto L_0x0542
        L_0x053f:
            r8.add(r3)
        L_0x0542:
            int r4 = r4 + 1
            goto L_0x051a
        L_0x0545:
            X.0B2 r1 = r9.A07
            r0 = 1
            r1.A05 = r0
        L_0x054a:
            int r0 = r7.A0E
            r20 = r0
            r29 = r31
            int r13 = android.view.View.MeasureSpec.getMode(r29)
            int r3 = android.view.View.MeasureSpec.getSize(r29)
            r28 = r32
            int r12 = android.view.View.MeasureSpec.getMode(r28)
            int r2 = android.view.View.MeasureSpec.getSize(r28)
            int r0 = r7.getPaddingTop()
            r1 = 0
            int r8 = java.lang.Math.max(r1, r0)
            int r0 = r7.getPaddingBottom()
            int r0 = java.lang.Math.max(r1, r0)
            int r5 = r8 + r0
            int r4 = r7.getPaddingWidth()
            X.0BI r11 = r7.A08
            r11.A04 = r8
            r11.A02 = r0
            r11.A05 = r4
            r11.A03 = r5
            r0 = r29
            r11.A01 = r0
            r0 = r28
            r11.A00 = r0
            int r0 = r7.getPaddingStart()
            int r15 = java.lang.Math.max(r1, r0)
            int r0 = r7.getPaddingEnd()
            int r10 = java.lang.Math.max(r1, r0)
            if (r15 > 0) goto L_0x072a
            if (r10 > 0) goto L_0x072a
            int r0 = r7.getPaddingLeft()
            int r15 = java.lang.Math.max(r1, r0)
        L_0x05a7:
            int r3 = r3 - r4
            int r2 = r2 - r5
            r14 = r3
            r10 = r2
            int r6 = r11.A03
            int r1 = r11.A05
            java.lang.Integer r19 = X.C023109s.A00
            r25 = r19
            r17 = r19
            int r16 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            if (r13 == r0) goto L_0x0716
            if (r13 == 0) goto L_0x071b
            if (r13 != r4) goto L_0x0727
            int r14 = r7.A02
            int r14 = r14 - r1
            int r14 = java.lang.Math.min(r14, r3)
        L_0x05cb:
            if (r12 == r0) goto L_0x0702
            if (r12 == 0) goto L_0x0707
            if (r12 != r4) goto L_0x0713
            int r0 = r7.A01
            int r0 = r0 - r6
            int r10 = java.lang.Math.min(r0, r2)
        L_0x05d8:
            int r0 = r9.A03()
            if (r14 != r0) goto L_0x05e4
            int r0 = r9.A02()
            if (r10 == r0) goto L_0x05e9
        L_0x05e4:
            X.0B2 r4 = r9.A07
            r0 = 1
            r4.A06 = r0
        L_0x05e9:
            r9.A0P = r5
            r9.A0Q = r5
            int r0 = r7.A02
            int r0 = r0 - r1
            int[] r4 = r9.A0k
            r4[r5] = r0
            int r0 = r7.A01
            int r0 = r0 - r6
            r18 = 1
            r4[r18] = r0
            r9.A0J = r5
            r9.A0I = r5
            java.lang.Integer[] r0 = r9.A0q
            r24 = r0
            r0[r5] = r19
            r9.A09(r14)
            r0[r18] = r17
            r9.A08(r10)
            int r0 = r7.A04
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0613
            r0 = 0
        L_0x0613:
            r9.A0J = r0
            int r0 = r7.A03
            int r0 = r0 - r6
            if (r0 >= 0) goto L_0x061b
            r0 = 0
        L_0x061b:
            r9.A0I = r0
            r9.A02 = r15
            r9.A03 = r8
            X.0B0 r10 = r9.A06
            X.0BH r0 = r9.A05
            r27 = r0
            java.util.ArrayList r6 = r9.A00
            int r23 = r6.size()
            int r22 = r9.A03()
            int r21 = r9.A02()
            r0 = 128(0x80, float:1.794E-43)
            r8 = r20 & r0
            r1 = 0
            if (r8 != r0) goto L_0x063d
            r1 = 1
        L_0x063d:
            r8 = 0
            if (r1 != 0) goto L_0x0646
            r14 = 64
            r0 = r20 & 64
            if (r0 != r14) goto L_0x067b
        L_0x0646:
            r0 = r23
            if (r5 >= r0) goto L_0x067d
            java.lang.Object r14 = r6.get(r5)
            X.0Aq r14 = (X.C02500Aq) r14
            java.lang.Integer[] r0 = r14.A0q
            r0 = r0[r8]
            java.lang.Integer r15 = X.C023109s.A0C
            r17 = 0
            if (r0 != r15) goto L_0x065c
            r17 = 1
        L_0x065c:
            java.lang.Integer[] r0 = r14.A0q
            r0 = r0[r18]
            r16 = 0
            if (r0 != r15) goto L_0x0666
            r16 = 1
        L_0x0666:
            if (r17 == 0) goto L_0x0672
            if (r16 == 0) goto L_0x0672
            float r0 = r14.A01
            r15 = 0
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            r15 = 1
            if (r0 > 0) goto L_0x0673
        L_0x0672:
            r15 = 0
        L_0x0673:
            boolean r0 = r14.A0H()
            if (r0 == 0) goto L_0x06e5
            if (r15 == 0) goto L_0x06e5
        L_0x067b:
            r18 = 0
        L_0x067d:
            r6 = 1073741824(0x40000000, float:2.0)
            if (r13 != r6) goto L_0x0683
            if (r12 == r6) goto L_0x0686
        L_0x0683:
            r0 = 0
            if (r1 == 0) goto L_0x0687
        L_0x0686:
            r0 = 1
        L_0x0687:
            r18 = r18 & r0
            if (r18 == 0) goto L_0x08e9
            r0 = r4[r8]
            int r3 = java.lang.Math.min(r0, r3)
            r5 = 1
            r0 = r4[r5]
            int r2 = java.lang.Math.min(r0, r2)
            if (r13 != r6) goto L_0x06a5
            r0 = r22
            if (r0 == r3) goto L_0x06a5
            r9.A09(r3)
            X.0B2 r0 = r9.A07
            r0.A05 = r5
        L_0x06a5:
            if (r12 != r6) goto L_0x06b2
            r0 = r21
            if (r0 == r2) goto L_0x06b2
            r9.A08(r2)
            X.0B2 r0 = r9.A07
            r0.A05 = r5
        L_0x06b2:
            if (r13 != r6) goto L_0x0841
            if (r12 != r6) goto L_0x0841
            X.0B2 r4 = r9.A07
            r16 = 1
            r15 = r1 & 1
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x06c4
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x0751
        L_0x06c4:
            X.0As r1 = r4.A01
            java.util.ArrayList r0 = r1.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x06cc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0743
            java.lang.Object r2 = r3.next()
            X.0Aq r2 = (X.C02500Aq) r2
            r2.A0i = r8
            X.0Av r0 = r2.A0c
            r0.A0D()
            X.0Ay r0 = r2.A0d
            r0.A0D()
            goto L_0x06cc
        L_0x06e5:
            boolean r0 = r14.A0I()
            if (r0 == 0) goto L_0x06ee
            if (r15 == 0) goto L_0x06ee
            goto L_0x067b
        L_0x06ee:
            boolean r0 = r14 instanceof X.AnonymousClass0GJ
            if (r0 != 0) goto L_0x067b
            boolean r0 = r14.A0H()
            if (r0 != 0) goto L_0x067b
            boolean r0 = r14.A0I()
            if (r0 != 0) goto L_0x067b
            int r5 = r5 + 1
            goto L_0x0646
        L_0x0702:
            java.lang.Integer r17 = X.C023109s.A01
            if (r16 != 0) goto L_0x05d8
            goto L_0x070b
        L_0x0707:
            java.lang.Integer r17 = X.C023109s.A01
            if (r16 != 0) goto L_0x0713
        L_0x070b:
            int r0 = r7.A03
            int r10 = java.lang.Math.max(r5, r0)
            goto L_0x05d8
        L_0x0713:
            r10 = 0
            goto L_0x05d8
        L_0x0716:
            java.lang.Integer r19 = X.C023109s.A01
            if (r16 != 0) goto L_0x05cb
            goto L_0x071f
        L_0x071b:
            java.lang.Integer r19 = X.C023109s.A01
            if (r16 != 0) goto L_0x0727
        L_0x071f:
            int r14 = r7.A04
            int r14 = java.lang.Math.max(r5, r14)
            goto L_0x05cb
        L_0x0727:
            r14 = 0
            goto L_0x05cb
        L_0x072a:
            android.content.Context r0 = r7.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r6 = r0.flags
            r0 = 4194304(0x400000, float:5.877472E-39)
            r6 = r6 & r0
            r1 = 1
            if (r6 == 0) goto L_0x05a7
            int r0 = r7.getLayoutDirection()
            if (r1 != r0) goto L_0x05a7
            r15 = r10
            goto L_0x05a7
        L_0x0743:
            r1.A0i = r8
            X.0Av r0 = r1.A0c
            r0.A0D()
            X.0Ay r0 = r1.A0d
            r0.A0D()
            r4.A06 = r8
        L_0x0751:
            X.0As r0 = r4.A02
            X.AnonymousClass0B2.A02(r0, r4)
            X.0As r3 = r4.A01
            r3.A0P = r8
            r3.A0Q = r8
            java.lang.Integer[] r2 = r3.A0q
            r20 = r2[r8]
            r19 = r2[r5]
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0769
            r4.A05()
        L_0x0769:
            int r18 = r3.A04()
            int r17 = r3.A05()
            X.0Av r0 = r3.A0c
            r26 = r0
            X.0Aw r1 = r0.A05
            r0 = r18
            r1.A01(r0)
            X.0Ay r1 = r3.A0d
            X.0Aw r14 = r1.A05
            r0 = r17
            r14.A01(r0)
            r4.A06()
            java.lang.Integer r14 = X.C023109s.A01
            r0 = r20
            if (r0 == r14) goto L_0x0792
            r0 = r19
            if (r0 != r14) goto L_0x07ac
        L_0x0792:
            if (r15 == 0) goto L_0x07ac
            java.util.ArrayList r0 = r4.A04
            java.util.Iterator r15 = r0.iterator()
        L_0x079a:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0810
            java.lang.Object r0 = r15.next()
            X.0Au r0 = (X.C02540Au) r0
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x079a
        L_0x07ac:
            r14 = r2[r8]
            r0 = r25
            if (r14 == r0) goto L_0x07d6
            java.lang.Integer r0 = X.C023109s.A0G
            if (r14 == r0) goto L_0x07d6
            r15 = 0
        L_0x07b7:
            java.util.ArrayList r4 = r4.A04
            java.util.Iterator r14 = r4.iterator()
        L_0x07bd:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x093e
            java.lang.Object r1 = r14.next()
            X.0Au r1 = (X.C02540Au) r1
            X.0Aq r0 = r1.A03
            if (r0 != r3) goto L_0x07d2
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x07d2
            goto L_0x07bd
        L_0x07d2:
            r1.A0A()
            goto L_0x07bd
        L_0x07d6:
            int r14 = r3.A03()
            int r14 = r14 + r18
            r0 = r26
            X.0Aw r0 = r0.A04
            r0.A01(r14)
            r0 = r26
            X.0Ax r0 = r0.A06
            int r14 = r14 - r18
            r0.A01(r14)
            r4.A06()
            r14 = r2[r5]
            r0 = r25
            if (r14 == r0) goto L_0x07f9
            java.lang.Integer r0 = X.C023109s.A0G
            if (r14 != r0) goto L_0x080b
        L_0x07f9:
            int r14 = r3.A02()
            int r14 = r14 + r17
            X.0Aw r0 = r1.A04
            r0.A01(r14)
            X.0Ax r0 = r1.A06
            int r14 = r14 - r17
            r0.A01(r14)
        L_0x080b:
            r4.A06()
            r15 = 1
            goto L_0x07b7
        L_0x0810:
            r0 = r20
            if (r0 != r14) goto L_0x0829
            r2[r8] = r25
            int r0 = X.AnonymousClass0B2.A00(r3, r4, r8)
            r3.A09(r0)
            r0 = r26
            X.0Ax r0 = r0.A06
            r15 = r0
            int r0 = r3.A03()
            r15.A01(r0)
        L_0x0829:
            r0 = r19
            if (r0 != r14) goto L_0x07ac
            r2[r5] = r25
            int r0 = X.AnonymousClass0B2.A00(r3, r4, r5)
            r3.A08(r0)
            X.0Ax r0 = r1.A06
            int r14 = r3.A02()
            r0.A01(r14)
            goto L_0x07ac
        L_0x0841:
            X.0B2 r3 = r9.A07
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x088f
            X.0As r4 = r3.A01
            java.util.ArrayList r0 = r4.A00
            java.util.Iterator r15 = r0.iterator()
        L_0x084f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0874
            java.lang.Object r14 = r15.next()
            X.0Aq r14 = (X.C02500Aq) r14
            r14.A0i = r8
            X.0Av r2 = r14.A0c
            X.0Ax r0 = r2.A06
            r0.A0B = r8
            r2.A08 = r8
            r2.A0D()
            X.0Ay r2 = r14.A0d
            X.0Ax r0 = r2.A06
            r0.A0B = r8
            r2.A08 = r8
            r2.A0D()
            goto L_0x084f
        L_0x0874:
            r4.A0i = r8
            X.0Av r2 = r4.A0c
            X.0Ax r0 = r2.A06
            r0.A0B = r8
            r2.A08 = r8
            r2.A0D()
            X.0Ay r2 = r4.A0d
            X.0Ax r0 = r2.A06
            r0.A0B = r8
            r2.A08 = r8
            r2.A0D()
            r3.A05()
        L_0x088f:
            X.0As r0 = r3.A02
            X.AnonymousClass0B2.A02(r0, r3)
            X.0As r2 = r3.A01
            r2.A0P = r8
            r2.A0Q = r8
            X.0Av r0 = r2.A0c
            X.0Aw r0 = r0.A05
            r0.A01(r8)
            X.0Ay r0 = r2.A0d
            X.0Aw r0 = r0.A05
            r0.A01(r8)
            r0 = 1
            if (r13 != r6) goto L_0x08bd
            boolean r0 = r9.A0L(r8, r1)
            r0 = r0 & 1
            r2 = 1
        L_0x08b2:
            if (r12 != r6) goto L_0x08bf
            boolean r16 = r9.A0L(r5, r1)
            r16 = r16 & r0
            int r2 = r2 + 1
            goto L_0x08d9
        L_0x08bd:
            r2 = 0
            goto L_0x08b2
        L_0x08bf:
            r16 = r0
            goto L_0x08d9
        L_0x08c2:
            X.0Aw r0 = r1.A05
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x08d2
            X.0Aw r0 = r1.A04
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x092f
            boolean r0 = r1 instanceof X.AnonymousClass0GM
            if (r0 != 0) goto L_0x092f
        L_0x08d2:
            r16 = 0
        L_0x08d4:
            r2[r8] = r20
            r2[r5] = r19
            r2 = 2
        L_0x08d9:
            if (r16 == 0) goto L_0x08e9
            r1 = 0
            if (r13 != r6) goto L_0x08df
            r1 = 1
        L_0x08df:
            r0 = 0
            if (r12 != r6) goto L_0x08e3
            r0 = 1
        L_0x08e3:
            r9.A0F(r1, r0)
            r0 = 2
            if (r2 == r0) goto L_0x0b27
        L_0x08e9:
            if (r23 <= 0) goto L_0x0977
            java.util.ArrayList r0 = r9.A00
            int r12 = r0.size()
            X.0BH r6 = r9.A05
            r5 = 0
        L_0x08f4:
            if (r5 >= r12) goto L_0x0955
            java.util.ArrayList r0 = r9.A00
            java.lang.Object r4 = r0.get(r5)
            X.0Aq r4 = (X.C02500Aq) r4
            boolean r0 = r4 instanceof X.AnonymousClass0GG
            if (r0 != 0) goto L_0x0912
            X.0Av r0 = r4.A0c
            X.0Ax r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0915
            X.0Ay r0 = r4.A0d
            X.0Ax r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0915
        L_0x0912:
            int r5 = r5 + 1
            goto L_0x08f4
        L_0x0915:
            java.lang.Integer[] r1 = r4.A0q
            r0 = r1[r8]
            r3 = 1
            r2 = r1[r3]
            java.lang.Integer r1 = X.C023109s.A0C
            if (r0 != r1) goto L_0x092b
            int r0 = r4.A0D
            if (r0 == r3) goto L_0x092b
            if (r2 != r1) goto L_0x092b
            int r0 = r4.A0C
            if (r0 == r3) goto L_0x092b
            goto L_0x0912
        L_0x092b:
            X.AnonymousClass0B0.A00(r4, r6, r10, r8)
            goto L_0x0912
        L_0x092f:
            X.0Ax r0 = r1.A06
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0942
            boolean r0 = r1 instanceof X.AnonymousClass0GO
            if (r0 != 0) goto L_0x0942
            boolean r0 = r1 instanceof X.AnonymousClass0GM
            if (r0 != 0) goto L_0x0942
            goto L_0x08d2
        L_0x093e:
            java.util.Iterator r4 = r4.iterator()
        L_0x0942:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x08d4
            java.lang.Object r1 = r4.next()
            X.0Au r1 = (X.C02540Au) r1
            if (r15 != 0) goto L_0x08c2
            X.0Aq r0 = r1.A03
            if (r0 != r3) goto L_0x08c2
            goto L_0x0942
        L_0x0955:
            X.0BI r6 = (X.AnonymousClass0BI) r6
            androidx.constraintlayout.widget.ConstraintLayout r3 = r6.A06
            int r1 = r3.getChildCount()
            r2 = 0
            r0 = 0
        L_0x095f:
            if (r0 >= r1) goto L_0x0967
            r3.getChildAt(r0)
            int r0 = r0 + 1
            goto L_0x095f
        L_0x0967:
            java.util.ArrayList r1 = r3.A0B
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0977
        L_0x096f:
            r1.get(r2)
            int r2 = r2 + 1
            if (r2 >= r0) goto L_0x0977
            goto L_0x096f
        L_0x0977:
            int r6 = r9.A01
            java.util.ArrayList r5 = r10.A02
            int r4 = r5.size()
            if (r23 <= 0) goto L_0x099c
            int r2 = r9.A0J
            int r1 = r9.A0I
            r9.A0J = r8
            r9.A0I = r8
            r0 = r22
            r9.A09(r0)
            r0 = r21
            r9.A08(r0)
            r9.A0J = r2
            r9.A0I = r1
            X.0As r0 = r10.A00
            r0.A0K()
        L_0x099c:
            if (r4 <= 0) goto L_0x0b1a
            r0 = r24[r8]
            java.lang.Integer r1 = X.C023109s.A01
            r19 = 0
            if (r0 != r1) goto L_0x09a8
            r19 = 1
        L_0x09a8:
            r0 = 1
            r0 = r24[r0]
            r18 = 0
            if (r0 != r1) goto L_0x09b1
            r18 = 1
        L_0x09b1:
            int r1 = r9.A03()
            X.0As r8 = r10.A00
            int r0 = r8.A0J
            int r3 = java.lang.Math.max(r1, r0)
            int r1 = r9.A02()
            int r0 = r8.A0I
            int r2 = java.lang.Math.max(r1, r0)
            r1 = 0
            r17 = 0
        L_0x09ca:
            java.lang.Object r12 = r5.get(r1)
            X.0Aq r12 = (X.C02500Aq) r12
            boolean r0 = r12 instanceof X.AnonymousClass0GJ
            if (r0 == 0) goto L_0x0a43
            int r13 = r12.A03()
            int r14 = r12.A02()
            r15 = 1
            r0 = r27
            boolean r0 = X.AnonymousClass0B0.A00(r12, r0, r10, r15)
            r17 = r17 | r0
            int r0 = r12.A03()
            int r15 = r12.A02()
            if (r0 == r13) goto L_0x0a15
            r12.A09(r0)
            if (r19 == 0) goto L_0x0a13
            int r13 = r12.A04()
            int r0 = r12.A0O
            int r13 = r13 + r0
            if (r13 <= r3) goto L_0x0a13
            int r13 = r12.A04()
            int r0 = r12.A0O
            int r13 = r13 + r0
            java.lang.Integer r0 = X.C023109s.A0G
            X.0Az r0 = r12.A06(r0)
            int r0 = r0.A00()
            int r13 = r13 + r0
            int r3 = java.lang.Math.max(r3, r13)
        L_0x0a13:
            r17 = 1
        L_0x0a15:
            if (r15 == r14) goto L_0x0a3d
            r12.A08(r15)
            if (r18 == 0) goto L_0x0a3b
            int r13 = r12.A05()
            int r0 = r12.A09
            int r13 = r13 + r0
            if (r13 <= r2) goto L_0x0a3b
            int r13 = r12.A05()
            int r0 = r12.A09
            int r13 = r13 + r0
            java.lang.Integer r0 = X.C023109s.A0R
            X.0Az r0 = r12.A06(r0)
            int r0 = r0.A00()
            int r13 = r13 + r0
            int r2 = java.lang.Math.max(r2, r13)
        L_0x0a3b:
            r17 = 1
        L_0x0a3d:
            X.0GJ r12 = (X.AnonymousClass0GJ) r12
            boolean r0 = r12.A0A
            r17 = r17 | r0
        L_0x0a43:
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x09ca
            r1 = 0
        L_0x0a48:
            r12 = 0
        L_0x0a49:
            java.lang.Object r13 = r5.get(r12)
            X.0Aq r13 = (X.C02500Aq) r13
            boolean r0 = r13 instanceof X.C16650pr
            if (r0 == 0) goto L_0x0a57
            boolean r0 = r13 instanceof X.AnonymousClass0GJ
            if (r0 == 0) goto L_0x0a71
        L_0x0a57:
            boolean r0 = r13 instanceof X.AnonymousClass0GG
            if (r0 != 0) goto L_0x0a71
            int r14 = r13.A0N
            r0 = 8
            if (r14 == r0) goto L_0x0a71
            X.0Av r0 = r13.A0c
            X.0Ax r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0a99
            X.0Ay r0 = r13.A0d
            X.0Ax r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0a99
        L_0x0a71:
            int r12 = r12 + 1
            if (r12 < r4) goto L_0x0a49
            if (r17 == 0) goto L_0x0a93
            int r13 = r9.A0J
            int r12 = r9.A0I
            r0 = 0
            r9.A0J = r0
            r9.A0I = r0
            r0 = r22
            r9.A09(r0)
            r0 = r21
            r9.A08(r0)
            r9.A0J = r13
            r9.A0I = r12
            r8.A0K()
            r17 = 0
        L_0x0a93:
            int r1 = r1 + 1
            r0 = 2
            if (r1 >= r0) goto L_0x0b1a
            goto L_0x0a48
        L_0x0a99:
            boolean r0 = r13 instanceof X.AnonymousClass0GJ
            if (r0 != 0) goto L_0x0a71
            int r14 = r13.A03()
            int r16 = r13.A02()
            int r0 = r13.A07
            r20 = r0
            r15 = 1
            r0 = r27
            boolean r0 = X.AnonymousClass0B0.A00(r13, r0, r10, r15)
            r17 = r17 | r0
            int r0 = r13.A03()
            int r15 = r13.A02()
            if (r0 == r14) goto L_0x0ae2
            r13.A09(r0)
            if (r19 == 0) goto L_0x0ae0
            int r14 = r13.A04()
            int r0 = r13.A0O
            int r14 = r14 + r0
            if (r14 <= r3) goto L_0x0ae0
            int r14 = r13.A04()
            int r0 = r13.A0O
            int r14 = r14 + r0
            java.lang.Integer r0 = X.C023109s.A0G
            X.0Az r0 = r13.A06(r0)
            int r0 = r0.A00()
            int r14 = r14 + r0
            int r3 = java.lang.Math.max(r3, r14)
        L_0x0ae0:
            r17 = 1
        L_0x0ae2:
            r0 = r16
            if (r15 == r0) goto L_0x0b0c
            r13.A08(r15)
            if (r18 == 0) goto L_0x0b0a
            int r14 = r13.A05()
            int r0 = r13.A09
            int r14 = r14 + r0
            if (r14 <= r2) goto L_0x0b0a
            int r14 = r13.A05()
            int r0 = r13.A09
            int r14 = r14 + r0
            java.lang.Integer r0 = X.C023109s.A0R
            X.0Az r0 = r13.A06(r0)
            int r0 = r0.A00()
            int r14 = r14 + r0
            int r2 = java.lang.Math.max(r2, r14)
        L_0x0b0a:
            r17 = 1
        L_0x0b0c:
            boolean r0 = r13.A0h
            if (r0 == 0) goto L_0x0a71
            int r13 = r13.A07
            r0 = r20
            if (r0 == r13) goto L_0x0a71
            r17 = 1
            goto L_0x0a71
        L_0x0b1a:
            r9.A01 = r6
            r0 = 256(0x100, float:3.59E-43)
            r6 = r6 & r0
            r1 = 256(0x100, float:3.59E-43)
            r0 = 0
            if (r6 != r1) goto L_0x0b25
            r0 = 1
        L_0x0b25:
            X.AnonymousClass0B3.A0F = r0
        L_0x0b27:
            int r2 = r9.A03()
            int r5 = r9.A02()
            boolean r3 = r9.A0A
            boolean r4 = r9.A08
            int r1 = r11.A03
            int r0 = r11.A05
            int r2 = r2 + r0
            int r5 = r5 + r1
            r1 = 0
            r0 = r29
            int r2 = android.view.View.resolveSizeAndState(r2, r0, r1)
            r0 = r28
            int r1 = android.view.View.resolveSizeAndState(r5, r0, r1)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            r1 = r1 & r0
            int r0 = r7.A02
            int r2 = java.lang.Math.min(r0, r2)
            int r0 = r7.A01
            int r1 = java.lang.Math.min(r0, r1)
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r3 == 0) goto L_0x0b5c
            r2 = r2 | r0
        L_0x0b5c:
            if (r4 == 0) goto L_0x0b5f
            r1 = r1 | r0
        L_0x0b5f:
            r7.setMeasuredDimension(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet, i, 0);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AnonymousClass0BJ(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context) {
        super(context);
        A00((AttributeSet) null, 0, 0);
    }
}
