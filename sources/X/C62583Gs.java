package X;

import android.graphics.Bitmap;

/* renamed from: X.3Gs  reason: invalid class name and case insensitive filesystem */
public class C62583Gs {
    public Bitmap A00;
    public AnonymousClass141 A01;
    public String A02;
    public boolean A03;
    public final long A04;
    public final String A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C62583Gs) && this.A04 == ((C62583Gs) obj).A04;
        }
        return true;
    }

    public C62583Gs(String str, long j, String str2) {
        this.A06 = str;
        this.A04 = j;
        this.A05 = str2;
    }

    public int hashCode() {
        return AnonymousClass000.A0M(Long.valueOf(this.A04), AnonymousClass001.A0L(), 0);
    }
}
