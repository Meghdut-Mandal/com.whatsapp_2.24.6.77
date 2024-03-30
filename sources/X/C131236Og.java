package X;

/* renamed from: X.6Og  reason: invalid class name and case insensitive filesystem */
public final class C131236Og {
    public final boolean A00 = false;

    public C131236Og(boolean z) {
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C131236Og) && this.A00 == ((C131236Og) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0) * 31;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PlatformParagraphStyle(includeFontPadding=");
        A0u.append(this.A00);
        A0u.append(", emojiSupportMatch=");
        return AnonymousClass000.A0m("EmojiSupportMatch.Default", A0u);
    }

    public C131236Og() {
    }
}
