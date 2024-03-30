package X;

import android.view.accessibility.AccessibilityManager;

/* renamed from: X.0c1  reason: invalid class name and case insensitive filesystem */
public final class C09220c1 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final C16700pw A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09220c1)) {
            return false;
        }
        return this.A00.equals(((C09220c1) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void onTouchExplorationStateChanged(boolean z) {
        this.A00.onTouchExplorationStateChanged(z);
    }

    public C09220c1(C16700pw r1) {
        this.A00 = r1;
    }
}
