package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0BN  reason: invalid class name */
public abstract class AnonymousClass0BN extends C011705b {
    public static final Rect A0A = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final AnonymousClass0BO A0B = new AnonymousClass0BP();
    public int A00 = Integer.MIN_VALUE;
    public int A01 = Integer.MIN_VALUE;
    public int A02 = Integer.MIN_VALUE;
    public AnonymousClass0H8 A03;
    public final View A04;
    public final AccessibilityManager A05;
    public final Rect A06 = new Rect();
    public final Rect A07 = new Rect();
    public final Rect A08 = new Rect();
    public final int[] A09 = new int[2];

    public abstract int A0m(float f, float f2);

    public C07650Ys A0n(int i) {
        if (i != -1) {
            return A04(i);
        }
        View view = this.A04;
        C07650Ys r5 = new C07650Ys(AccessibilityNodeInfo.obtain(view));
        AccessibilityNodeInfo accessibilityNodeInfo = r5.A02;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ArrayList arrayList = new ArrayList();
        A0t(arrayList);
        if (accessibilityNodeInfo.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                accessibilityNodeInfo.addChild(view, ((Number) arrayList.get(i2)).intValue());
            }
            return r5;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public void A0q(int i, boolean z) {
    }

    public void A0r(C07650Ys r1) {
    }

    public abstract void A0s(C07650Ys r1, int i);

    public abstract void A0t(List list);

    public abstract boolean A0w(int i, int i2, Bundle bundle);

    public static int A02(Rect rect, Rect rect2, int i) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i2 - i3);
    }

    public static int A03(Rect rect, Rect rect2, int i) {
        int i2;
        int i3;
        int i4;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            i2 = rect.left + (rect.width() / 2);
            i3 = rect2.left;
            i4 = rect2.width();
            return Math.abs(i2 - (i3 + (i4 / 2)));
        }
        i2 = rect.top + (rect.height() / 2);
        i3 = rect2.top;
        i4 = rect2.height();
        return Math.abs(i2 - (i3 + (i4 / 2)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(android.graphics.Rect r3, android.graphics.Rect r4, int r5) {
        /*
            r0 = 17
            r2 = 1
            if (r5 == r0) goto L_0x0024
            r0 = 33
            if (r5 == r0) goto L_0x0019
            r0 = 66
            if (r5 == r0) goto L_0x0024
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L_0x0019
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0019:
            int r1 = r4.right
            int r0 = r3.left
            if (r1 < r0) goto L_0x0031
            int r1 = r4.left
            int r0 = r3.right
            goto L_0x002e
        L_0x0024:
            int r1 = r4.bottom
            int r0 = r3.top
            if (r1 < r0) goto L_0x0031
            int r1 = r4.top
            int r0 = r3.bottom
        L_0x002e:
            if (r1 > r0) goto L_0x0031
            return r2
        L_0x0031:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BN.A06(android.graphics.Rect, android.graphics.Rect, int):boolean");
    }

    public static boolean A07(Rect rect, Rect rect2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i == 17) {
            int i6 = rect.right;
            int i7 = rect2.right;
            if (i6 <= i7 && rect.left < i7) {
                return false;
            }
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i != 33) {
            if (i == 66) {
                int i8 = rect.left;
                int i9 = rect2.left;
                if (i8 >= i9 && rect.right > i9) {
                    return false;
                }
                i4 = rect.right;
                i5 = rect2.right;
            } else if (i == 130) {
                int i10 = rect.top;
                int i11 = rect2.top;
                if (i10 >= i11 && rect.bottom > i11) {
                    return false;
                }
                i4 = rect.bottom;
                i5 = rect2.bottom;
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            if (i4 < i5) {
                return true;
            }
            return false;
        } else {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            if (i12 <= i13 && rect.top < i13) {
                return false;
            }
            i2 = rect.top;
            i3 = rect2.top;
        }
        if (i2 > i3) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0173, code lost:
        if (r0 < r1) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x019a, code lost:
        if (r0 >= 0) goto L_0x0175;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A09(android.graphics.Rect r13, X.AnonymousClass0BN r14, int r15) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r14.A0t(r4)
            X.0fO r3 = new X.0fO
            r3.<init>()
            r2 = 0
        L_0x000e:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x0032
            java.lang.Object r0 = r4.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            X.0Ys r1 = r14.A04(r0)
            java.lang.Object r0 = r4.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3.A02(r0, r1)
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0032:
            int r0 = r14.A02
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r6) goto L_0x0057
            r8 = 0
        L_0x0039:
            r9 = 1
            if (r15 == r9) goto L_0x0140
            r0 = 2
            if (r15 == r0) goto L_0x0140
            r0 = 17
            if (r15 == r0) goto L_0x005c
            r0 = 33
            if (r15 == r0) goto L_0x005c
            r0 = 66
            if (r15 == r0) goto L_0x005c
            r0 = 130(0x82, float:1.82E-43)
            if (r15 == r0) goto L_0x005c
            java.lang.String r1 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0057:
            java.lang.Object r8 = X.C06840Vh.A00(r3, r0)
            goto L_0x0039
        L_0x005c:
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            int r0 = r14.A02
            if (r0 == r6) goto L_0x00f9
            X.0Ys r0 = r14.A0n(r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.A02
            r0.getBoundsInParent(r7)
        L_0x006e:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r7)
            r0 = 17
            r4 = 0
            if (r15 == r0) goto L_0x00e7
            r0 = 33
            if (r15 == r0) goto L_0x00e0
            r0 = 66
            if (r15 == r0) goto L_0x00ee
            r0 = 130(0x82, float:1.82E-43)
            if (r15 != r0) goto L_0x0130
            int r0 = r7.height()
            int r0 = r0 + 1
            int r0 = -r0
        L_0x008b:
            r5.offset(r4, r0)
        L_0x008e:
            r9 = 0
            int r13 = r3.A00
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
        L_0x0096:
            if (r4 >= r13) goto L_0x0179
            java.lang.Object[] r0 = r3.A02
            r11 = r0[r4]
            X.0Ys r11 = (X.C07650Ys) r11
            if (r11 == r8) goto L_0x00dd
            android.view.accessibility.AccessibilityNodeInfo r0 = r11.A02
            r0.getBoundsInParent(r12)
            boolean r0 = A07(r7, r12, r15)
            if (r0 == 0) goto L_0x00dd
            boolean r0 = A07(r7, r5, r15)
            if (r0 == 0) goto L_0x00d9
            boolean r0 = A08(r7, r12, r5, r15)
            if (r0 != 0) goto L_0x00d9
            boolean r0 = A08(r7, r5, r12, r15)
            if (r0 != 0) goto L_0x00dd
            int r1 = A02(r7, r12, r15)
            int r0 = A03(r7, r12, r15)
            int r10 = r1 * 13
            int r10 = r10 * r1
            int r0 = r0 * r0
            int r10 = r10 + r0
            int r2 = A02(r7, r5, r15)
            int r1 = A03(r7, r5, r15)
            int r0 = r2 * 13
            int r0 = r0 * r2
            int r1 = r1 * r1
            int r0 = r0 + r1
            if (r10 >= r0) goto L_0x00dd
        L_0x00d9:
            r5.set(r12)
            r9 = r11
        L_0x00dd:
            int r4 = r4 + 1
            goto L_0x0096
        L_0x00e0:
            int r0 = r7.height()
            int r0 = r0 + 1
            goto L_0x008b
        L_0x00e7:
            int r0 = r7.width()
            int r0 = r0 + 1
            goto L_0x00f5
        L_0x00ee:
            int r0 = r7.width()
            int r0 = r0 + 1
            int r0 = -r0
        L_0x00f5:
            r5.offset(r0, r4)
            goto L_0x008e
        L_0x00f9:
            if (r13 == 0) goto L_0x0100
            r7.set(r13)
            goto L_0x006e
        L_0x0100:
            android.view.View r0 = r14.A04
            int r5 = r0.getWidth()
            int r4 = r0.getHeight()
            r0 = 17
            r2 = 0
            if (r15 == r0) goto L_0x012b
            r0 = 33
            if (r15 == r0) goto L_0x0126
            r0 = 66
            r1 = -1
            if (r15 == r0) goto L_0x0121
            r0 = 130(0x82, float:1.82E-43)
            if (r15 != r0) goto L_0x0138
            r7.set(r2, r1, r5, r1)
            goto L_0x006e
        L_0x0121:
            r7.set(r1, r2, r1, r4)
            goto L_0x006e
        L_0x0126:
            r7.set(r2, r4, r5, r4)
            goto L_0x006e
        L_0x012b:
            r7.set(r5, r2, r5, r4)
            goto L_0x006e
        L_0x0130:
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0138:
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0140:
            android.view.View r0 = r14.A04
            int r0 = X.AnonymousClass04F.A01(r0)
            r7 = 0
            if (r0 != r9) goto L_0x014a
            r7 = 1
        L_0x014a:
            X.0BO r5 = A0B
            int r4 = r3.A00
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r4)
            r1 = 0
        L_0x0154:
            if (r1 >= r4) goto L_0x0160
            java.lang.Object[] r0 = r3.A02
            r0 = r0[r1]
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0154
        L_0x0160:
            X.0ha r0 = new X.0ha
            r0.<init>(r5, r7)
            java.util.Collections.sort(r2, r0)
            if (r15 == r9) goto L_0x018e
            int r1 = r2.size()
            if (r8 != 0) goto L_0x0189
            r0 = -1
        L_0x0171:
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x01a2
        L_0x0175:
            java.lang.Object r9 = r2.get(r0)
        L_0x0179:
            if (r9 == 0) goto L_0x01a2
            r2 = 0
            int r1 = r3.A00
        L_0x017e:
            if (r2 >= r1) goto L_0x019d
            java.lang.Object[] r0 = r3.A02
            r0 = r0[r2]
            if (r0 == r9) goto L_0x019e
            int r2 = r2 + 1
            goto L_0x017e
        L_0x0189:
            int r0 = r2.lastIndexOf(r8)
            goto L_0x0171
        L_0x018e:
            int r0 = r2.size()
            if (r8 == 0) goto L_0x0198
            int r0 = r2.indexOf(r8)
        L_0x0198:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x01a2
            goto L_0x0175
        L_0x019d:
            r2 = -1
        L_0x019e:
            int[] r0 = r3.A01
            r6 = r0[r2]
        L_0x01a2:
            boolean r0 = r14.A0v(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BN.A09(android.graphics.Rect, X.0BN, int):boolean");
    }

    public AnonymousClass0X7 A0l(View view) {
        AnonymousClass0H8 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0H8 r02 = new AnonymousClass0H8(this);
        this.A03 = r02;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r3 = r4.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0o() {
        /*
            r4 = this;
            android.view.accessibility.AccessibilityManager r0 = r4.A05
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0020
            android.view.View r3 = r4.A04
            android.view.ViewParent r2 = r3.getParent()
            if (r2 == 0) goto L_0x0020
            r0 = 2048(0x800, float:2.87E-42)
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain(r0)
            r3.onInitializeAccessibilityEvent(r1)
            r0 = 1
            X.AnonymousClass0Q5.A00(r1, r0)
            r2.requestSendAccessibilityEvent(r3, r1)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BN.A0o():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r6.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0p(int r7, int r8) {
        /*
            r6 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r0) goto L_0x0083
            android.view.accessibility.AccessibilityManager r0 = r6.A05
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0083
            android.view.View r3 = r6.A04
            android.view.ViewParent r2 = r3.getParent()
            if (r2 == 0) goto L_0x0083
            r0 = -1
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain(r8)
            if (r7 == r0) goto L_0x007d
            X.0Ys r5 = r6.A0n(r7)
            java.util.List r4 = r1.getText()
            java.lang.CharSequence r0 = r5.A05()
            r4.add(r0)
            android.view.accessibility.AccessibilityNodeInfo r4 = r5.A02
            java.lang.CharSequence r0 = r4.getContentDescription()
            r1.setContentDescription(r0)
            boolean r0 = r4.isScrollable()
            r1.setScrollable(r0)
            boolean r0 = r4.isPassword()
            r1.setPassword(r0)
            boolean r0 = r4.isEnabled()
            r1.setEnabled(r0)
            boolean r0 = r4.isChecked()
            r1.setChecked(r0)
            java.util.List r0 = r1.getText()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0067
            java.lang.CharSequence r0 = r1.getContentDescription()
            if (r0 != 0) goto L_0x0067
            java.lang.String r1 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0067:
            java.lang.CharSequence r0 = r4.getClassName()
            r1.setClassName(r0)
            A05(r3, r1, r7)
            android.content.Context r0 = r3.getContext()
            java.lang.String r0 = r0.getPackageName()
            r1.setPackageName(r0)
            goto L_0x0080
        L_0x007d:
            r3.onInitializeAccessibilityEvent(r1)
        L_0x0080:
            r2.requestSendAccessibilityEvent(r3, r1)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BN.A0p(int, int):void");
    }

    public final boolean A0u(int i) {
        if (this.A02 != i) {
            return false;
        }
        this.A02 = Integer.MIN_VALUE;
        A0q(i, false);
        A0p(i, 8);
        return true;
    }

    public final boolean A0v(int i) {
        int i2;
        View view = this.A04;
        if ((view.isFocused() || view.requestFocus()) && (i2 = this.A02) != i) {
            if (i2 != Integer.MIN_VALUE) {
                A0u(i2);
            }
            if (i != Integer.MIN_VALUE) {
                this.A02 = i;
                A0q(i, true);
                A0p(i, 8);
                return true;
            }
        }
        return false;
    }

    public final boolean A0y(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.A05;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int A0m = A0m(motionEvent.getX(), motionEvent.getY());
            int i2 = this.A01;
            if (i2 != A0m) {
                this.A01 = A0m;
                A0p(A0m, 128);
                A0p(i2, 256);
            }
            if (A0m != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || (i = this.A01) == Integer.MIN_VALUE) {
            return false;
        } else {
            this.A01 = Integer.MIN_VALUE;
            A0p(i, 256);
            return true;
        }
    }

    public AnonymousClass0BN(View view) {
        if (view != null) {
            this.A04 = view;
            this.A05 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C011504z.A00(view) == 0) {
                C011504z.A06(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private C07650Ys A04(int i) {
        boolean z;
        C07650Ys r5 = new C07650Ys(AccessibilityNodeInfo.obtain());
        AccessibilityNodeInfo accessibilityNodeInfo = r5.A02;
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setFocusable(true);
        r5.A0C("android.view.View");
        Rect rect = A0A;
        accessibilityNodeInfo.setBoundsInParent(rect);
        accessibilityNodeInfo.setBoundsInScreen(rect);
        View view = this.A04;
        r5.A00 = -1;
        accessibilityNodeInfo.setParent(view);
        A0s(r5, i);
        if (r5.A05() == null && accessibilityNodeInfo.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.A06;
        accessibilityNodeInfo.getBoundsInParent(rect2);
        if (!rect2.equals(rect)) {
            int actions = accessibilityNodeInfo.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                accessibilityNodeInfo.setPackageName(view.getContext().getPackageName());
                r5.A01 = i;
                accessibilityNodeInfo.setSource(view, i);
                if (this.A00 == i) {
                    accessibilityNodeInfo.setAccessibilityFocused(true);
                    accessibilityNodeInfo.addAction(128);
                } else {
                    accessibilityNodeInfo.setAccessibilityFocused(false);
                    accessibilityNodeInfo.addAction(64);
                }
                if (this.A02 == i) {
                    z = true;
                    accessibilityNodeInfo.addAction(2);
                } else {
                    z = false;
                    if (accessibilityNodeInfo.isFocusable()) {
                        accessibilityNodeInfo.addAction(1);
                    }
                }
                accessibilityNodeInfo.setFocused(z);
                int[] iArr = this.A09;
                view.getLocationOnScreen(iArr);
                Rect rect3 = this.A07;
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                if (rect3.equals(rect)) {
                    accessibilityNodeInfo.getBoundsInParent(rect3);
                    if (r5.A00 != -1) {
                        C07650Ys r11 = new C07650Ys(AccessibilityNodeInfo.obtain());
                        for (int i2 = r5.A00; i2 != -1; i2 = r11.A00) {
                            r11.A00 = -1;
                            AccessibilityNodeInfo accessibilityNodeInfo2 = r11.A02;
                            accessibilityNodeInfo2.setParent(view, -1);
                            accessibilityNodeInfo2.setBoundsInParent(rect);
                            A0s(r11, i2);
                            accessibilityNodeInfo2.getBoundsInParent(rect2);
                            rect3.offset(rect2.left, rect2.top);
                        }
                    }
                    rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                }
                Rect rect4 = this.A08;
                if (view.getLocalVisibleRect(rect4)) {
                    rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    if (rect3.intersect(rect4)) {
                        accessibilityNodeInfo.setBoundsInScreen(rect3);
                        if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                            ViewParent parent = view.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view2 = (View) parent;
                                    if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view2.getParent();
                                } else if (parent != null) {
                                    accessibilityNodeInfo.setVisibleToUser(true);
                                }
                            }
                        }
                    }
                }
                return r5;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r1 <= r0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0063, code lost:
        if (r1 < r0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0066, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A08(android.graphics.Rect r5, android.graphics.Rect r6, android.graphics.Rect r7, int r8) {
        /*
            boolean r1 = A06(r5, r6, r8)
            boolean r0 = A06(r5, r7, r8)
            r4 = 0
            if (r0 != 0) goto L_0x004a
            if (r1 == 0) goto L_0x004a
            r0 = 17
            r3 = 1
            if (r8 == r0) goto L_0x005a
            r0 = 33
            if (r8 == r0) goto L_0x005f
            r0 = 66
            if (r8 == r0) goto L_0x0055
            r0 = 130(0x82, float:1.82E-43)
            if (r8 != r0) goto L_0x0071
            int r1 = r5.bottom
            int r0 = r7.top
        L_0x0022:
            if (r1 > r0) goto L_0x0066
        L_0x0024:
            r2 = 1
            if (r3 == 0) goto L_0x0070
            r0 = 17
            if (r8 == r0) goto L_0x0070
            r1 = 66
            if (r8 == r1) goto L_0x0070
            int r2 = A02(r5, r6, r8)
            r0 = 33
            if (r8 == r0) goto L_0x0050
            if (r8 == r1) goto L_0x004b
            r0 = 130(0x82, float:1.82E-43)
            if (r8 != r0) goto L_0x0068
            int r1 = r7.bottom
            int r0 = r5.bottom
        L_0x0041:
            int r1 = r1 - r0
            r0 = 1
            int r0 = java.lang.Math.max(r0, r1)
            if (r2 >= r0) goto L_0x004a
            r4 = 1
        L_0x004a:
            return r4
        L_0x004b:
            int r1 = r7.right
            int r0 = r5.right
            goto L_0x0041
        L_0x0050:
            int r1 = r5.top
            int r0 = r7.top
            goto L_0x0041
        L_0x0055:
            int r1 = r5.right
            int r0 = r7.left
            goto L_0x0022
        L_0x005a:
            int r1 = r5.left
            int r0 = r7.right
            goto L_0x0063
        L_0x005f:
            int r1 = r5.top
            int r0 = r7.bottom
        L_0x0063:
            if (r1 < r0) goto L_0x0066
            goto L_0x0024
        L_0x0066:
            r3 = 0
            goto L_0x0024
        L_0x0068:
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0070:
            return r2
        L_0x0071:
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BN.A08(android.graphics.Rect, android.graphics.Rect, android.graphics.Rect, int):boolean");
    }

    public void A0k(View view, C07650Ys r2) {
        super.A0k(view, r2);
        A0r(r2);
    }

    public final boolean A0x(KeyEvent keyEvent) {
        int i;
        int i2 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i = 33;
                                } else if (keyCode != 21) {
                                    i = 66;
                                    if (keyCode != 22) {
                                        i = 130;
                                    }
                                } else {
                                    i = 17;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && A09((Rect) null, this, i)) {
                                    i2++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = this.A02;
                    if (i3 == Integer.MIN_VALUE) {
                        return true;
                    }
                    A0w(i3, 16, (Bundle) null);
                    return true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                return A09((Rect) null, this, 2);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return A09((Rect) null, this, 1);
                }
            }
        }
        return false;
    }

    public static void A05(View view, AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setSource(view, i);
    }
}
