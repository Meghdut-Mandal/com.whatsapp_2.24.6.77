package X;

/* renamed from: X.5Tw  reason: invalid class name and case insensitive filesystem */
public enum C108535Tw {
    EMOJI,
    GIFS,
    AVATAR_STICKERS,
    STICKERS;

    /* access modifiers changed from: public */
    static {
        C108535Tw[] r0;
        A00 = C000900k.A00(r0);
    }

    public String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "EMOJI";
        }
        if (ordinal == 1) {
            return "GIFS";
        }
        if (ordinal == 2) {
            return "AVATAR_STICKERS";
        }
        if (ordinal == 3) {
            return "STICKERS";
        }
        throw C36441kJ.A18();
    }
}
