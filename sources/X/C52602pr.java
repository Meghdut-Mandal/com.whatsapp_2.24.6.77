package X;

/* renamed from: X.2pr  reason: invalid class name and case insensitive filesystem */
public enum C52602pr {
    HIDE(false, false),
    SHOW_APP_EXIST(true, true);
    
    public final boolean isEnabled;
    public final boolean isVisible;

    /* access modifiers changed from: public */
    static {
        C52602pr[] r0;
        A00 = C000900k.A00(r0);
    }

    /* access modifiers changed from: public */
    C52602pr(boolean z, boolean z2) {
        this.isVisible = z;
        this.isEnabled = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("visible: ");
        A0u.append(this.isVisible);
        A0u.append(" enabled: ");
        return C36421kH.A0d(A0u, this.isEnabled);
    }
}
