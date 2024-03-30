package X;

import android.content.ComponentName;
import android.net.Uri;

/* renamed from: X.0YA  reason: invalid class name */
public final class AnonymousClass0YA {
    public static final Uri A04 = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final ComponentName A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0YA) {
                AnonymousClass0YA r5 = (AnonymousClass0YA) obj;
                if (!AnonymousClass0QM.A00(this.A01, r5.A01) || !AnonymousClass0QM.A00(this.A02, r5.A02) || !AnonymousClass0QM.A00(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A01;
        objArr[1] = this.A02;
        objArr[2] = this.A00;
        objArr[3] = 4225;
        return AnonymousClass000.A0M(Boolean.valueOf(this.A03), objArr, 4);
    }

    public final String toString() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.A00;
        AnonymousClass006.A01(componentName);
        return componentName.flattenToString();
    }

    public AnonymousClass0YA(ComponentName componentName) {
        this.A01 = null;
        this.A02 = null;
        AnonymousClass006.A01(componentName);
        this.A00 = componentName;
        this.A03 = false;
    }

    public AnonymousClass0YA(String str, String str2, boolean z) {
        AnonymousClass006.A03(str);
        this.A01 = str;
        AnonymousClass006.A03(str2);
        this.A02 = str2;
        this.A00 = null;
        this.A03 = z;
    }
}
