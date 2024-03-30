package X;

import java.util.Locale;

/* renamed from: X.68T  reason: invalid class name */
public final class AnonymousClass68T {
    public final C157067bm A00;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass68T)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AnonymousClass00C.A0J(((C138136hM) this.A00).A00.toLanguageTag(), ((C138136hM) ((AnonymousClass68T) obj).A00).A00.toLanguageTag());
    }

    public static Locale A00(Object obj) {
        C157067bm r1 = ((AnonymousClass68T) obj).A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        return ((C138136hM) r1).A00;
    }

    public int hashCode() {
        return ((C138136hM) this.A00).A00.toLanguageTag().hashCode();
    }

    public String toString() {
        return ((C138136hM) this.A00).A00.toLanguageTag();
    }

    public AnonymousClass68T(C157067bm r1) {
        this.A00 = r1;
    }
}
