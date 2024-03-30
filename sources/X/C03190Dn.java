package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* renamed from: X.0Dn  reason: invalid class name and case insensitive filesystem */
public abstract class C03190Dn extends Drawable.ConstantState {
    public int A00;
    public ColorStateList A01;
    public Resources A02;
    public ColorFilter A03;
    public PorterDuff.Mode A04;
    public SparseArray A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H = 0;
    public int A0I = 0;
    public int A0J;
    public int A0K;
    public int A0L;
    public Rect A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U = false;
    public boolean A0V = true;
    public boolean A0W = false;
    public Drawable[] A0X;
    public final AnonymousClass0Ds A0Y;

    public void A03() {
        this.A0P = true;
        A00(this);
        int i = this.A0K;
        Drawable[] drawableArr = this.A0X;
        this.A0D = -1;
        this.A0G = -1;
        this.A0E = 0;
        this.A0F = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.A0G) {
                this.A0G = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.A0D) {
                this.A0D = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.A0F) {
                this.A0F = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.A0E) {
                this.A0E = minimumHeight;
            }
        }
    }

    public static void A00(C03190Dn r7) {
        SparseArray sparseArray = r7.A05;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = r7.A05.keyAt(i);
                Drawable[] drawableArr = r7.A0X;
                Drawable newDrawable = ((Drawable.ConstantState) r7.A05.valueAt(i)).newDrawable(r7.A02);
                if (Build.VERSION.SDK_INT >= 23) {
                    AnonymousClass08I.A05(r7.A0J, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(r7.A0Y);
                drawableArr[keyAt] = mutate;
            }
            r7.A05 = null;
        }
    }

    public final int A01(Drawable drawable) {
        int i = this.A0K;
        if (i >= this.A0X.length) {
            A04(i, i + 10);
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.A0Y);
        this.A0X[i] = drawable;
        this.A0K++;
        this.A0C = drawable.getChangingConfigurations() | this.A0C;
        this.A0R = false;
        this.A0T = false;
        this.A0M = null;
        this.A0S = false;
        this.A0P = false;
        this.A0Q = false;
        return i;
    }

    public final Drawable A02(int i) {
        int indexOfKey;
        Drawable drawable = this.A0X[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.A05;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.A05.valueAt(indexOfKey)).newDrawable(this.A02);
        if (Build.VERSION.SDK_INT >= 23) {
            AnonymousClass08I.A05(this.A0J, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.A0Y);
        this.A0X[i] = mutate;
        this.A05.removeAt(indexOfKey);
        if (this.A05.size() == 0) {
            this.A05 = null;
        }
        return mutate;
    }

    public void A04(int i, int i2) {
        Drawable[] drawableArr = new Drawable[i2];
        Drawable[] drawableArr2 = this.A0X;
        if (drawableArr2 != null) {
            System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
        }
        this.A0X = drawableArr;
    }

    public final void A05(Resources resources) {
        if (resources != null) {
            this.A02 = resources;
            int i = resources.getDisplayMetrics().densityDpi;
            if (i == 0) {
                i = 160;
            }
            int i2 = this.A00;
            this.A00 = i;
            if (i2 != i) {
                this.A0P = false;
                this.A0S = false;
            }
        }
    }

    public final boolean A06(int i, int i2) {
        boolean z;
        int i3 = this.A0K;
        Drawable[] drawableArr = this.A0X;
        boolean z2 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z = AnonymousClass08I.A05(i, drawableArr[i4]);
                } else {
                    z = false;
                }
                if (i4 == i2) {
                    z2 = z;
                }
            }
        }
        this.A0J = i;
        return z2;
    }

    public boolean canApplyTheme() {
        boolean canApplyTheme;
        int i = this.A0K;
        Drawable[] drawableArr = this.A0X;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                canApplyTheme = AnonymousClass076.A08(drawable);
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.A05.get(i2);
                if (constantState != null) {
                    canApplyTheme = constantState.canApplyTheme();
                } else {
                    continue;
                }
            }
            if (canApplyTheme) {
                return true;
            }
        }
        return false;
    }

    public int getChangingConfigurations() {
        return this.A0B | this.A0C;
    }

    public C03190Dn(Resources resources, C03190Dn r7, AnonymousClass0Ds r8) {
        Resources resources2;
        int i;
        SparseArray sparseArray;
        this.A0Y = r8;
        Rect rect = null;
        if (resources != null) {
            resources2 = resources;
        } else if (r7 != null) {
            resources2 = r7.A02;
        } else {
            resources2 = null;
        }
        this.A02 = resources2;
        if (r7 != null) {
            i = r7.A00;
        } else {
            i = 0;
        }
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.A00 = i;
        if (r7 != null) {
            this.A0B = r7.A0B;
            this.A0C = r7.A0C;
            this.A0Q = true;
            this.A0O = true;
            this.A0W = r7.A0W;
            this.A0U = r7.A0U;
            this.A0V = r7.A0V;
            this.A09 = r7.A09;
            this.A0J = r7.A0J;
            this.A0H = r7.A0H;
            this.A0I = r7.A0I;
            this.A0N = r7.A0N;
            this.A03 = r7.A03;
            this.A06 = r7.A06;
            this.A01 = r7.A01;
            this.A04 = r7.A04;
            this.A07 = r7.A07;
            this.A08 = r7.A08;
            if (r7.A00 == i) {
                if (r7.A0S) {
                    Rect rect2 = r7.A0M;
                    this.A0M = rect2 != null ? new Rect(rect2) : rect;
                    this.A0S = true;
                }
                if (r7.A0P) {
                    this.A0G = r7.A0G;
                    this.A0D = r7.A0D;
                    this.A0F = r7.A0F;
                    this.A0E = r7.A0E;
                    this.A0P = true;
                }
            }
            if (r7.A0R) {
                this.A0L = r7.A0L;
                this.A0R = true;
            }
            if (r7.A0T) {
                this.A0A = r7.A0A;
                this.A0T = true;
            }
            Drawable[] drawableArr = r7.A0X;
            this.A0X = new Drawable[drawableArr.length];
            int i2 = r7.A0K;
            this.A0K = i2;
            SparseArray sparseArray2 = r7.A05;
            if (sparseArray2 != null) {
                sparseArray = sparseArray2.clone();
            } else {
                sparseArray = new SparseArray(i2);
            }
            this.A05 = sparseArray;
            int i3 = this.A0K;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    Drawable.ConstantState constantState = drawableArr[i4].getConstantState();
                    if (constantState != null) {
                        this.A05.put(i4, constantState);
                    } else {
                        this.A0X[i4] = drawableArr[i4];
                    }
                }
            }
            return;
        }
        this.A0X = new Drawable[10];
        this.A0K = 0;
    }
}
