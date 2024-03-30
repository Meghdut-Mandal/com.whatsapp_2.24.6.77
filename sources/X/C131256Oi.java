package X;

/* renamed from: X.6Oi  reason: invalid class name and case insensitive filesystem */
public final class C131256Oi {
    public final int A00;

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C131256Oi) || i != ((C131256Oi) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        return A00(this.A00);
    }

    public /* synthetic */ C131256Oi(int i) {
        this.A00 = i;
    }

    public static String A00(int i) {
        String str;
        String str2;
        String str3;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LineBreak(strategy=");
        int i2 = i & 255;
        if (i2 == 1) {
            str = "Strategy.Simple";
        } else if (i2 == 2) {
            str = "Strategy.HighQuality";
        } else if (i2 == 3) {
            str = "Strategy.Balanced";
        } else if (i2 == 0) {
            str = "Strategy.Unspecified";
        } else {
            str = "Invalid";
        }
        A0u.append(str);
        A0u.append(", strictness=");
        int i3 = (i >> 8) & 255;
        if (i3 == 1) {
            str2 = "Strictness.None";
        } else if (i3 == 2) {
            str2 = "Strictness.Loose";
        } else if (i3 == 3) {
            str2 = "Strictness.Normal";
        } else if (i3 == 4) {
            str2 = "Strictness.Strict";
        } else if (i3 == 0) {
            str2 = "Strictness.Unspecified";
        } else {
            str2 = "Invalid";
        }
        A0u.append(str2);
        A0u.append(", wordBreak=");
        int i4 = (i >> 16) & 255;
        if (i4 == 1) {
            str3 = "WordBreak.None";
        } else if (i4 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i4 == 0) {
            str3 = "WordBreak.Unspecified";
        } else {
            str3 = "Invalid";
        }
        return AnonymousClass000.A0m(str3, A0u);
    }
}
