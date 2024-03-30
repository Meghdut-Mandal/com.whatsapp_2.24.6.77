package X;

/* renamed from: X.5Hz  reason: invalid class name and case insensitive filesystem */
public final class C106005Hz extends C108685Um {
    public final boolean hasAvatarConfigCached;
    public final boolean hasAvatarStickerPackInstalled;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106005Hz) {
                C106005Hz r5 = (C106005Hz) obj;
                if (!(this.hasAvatarConfigCached == r5.hasAvatarConfigCached && this.hasAvatarStickerPackInstalled == r5.hasAvatarStickerPackInstalled)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A01(this.hasAvatarConfigCached ? 1 : 0) * 31) + C36341k9.A01(this.hasAvatarStickerPackInstalled ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C106005Hz(boolean r3, boolean r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "No Avatar (has config cached: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", has pack installed: "
            r1.append(r0)
            java.lang.String r0 = X.C36321k7.A0H(r1, r4)
            r2.<init>(r0)
            r2.hasAvatarConfigCached = r3
            r2.hasAvatarStickerPackInstalled = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106005Hz.<init>(boolean, boolean):void");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NoAvatar(hasAvatarConfigCached=");
        A0u.append(this.hasAvatarConfigCached);
        A0u.append(", hasAvatarStickerPackInstalled=");
        return C36321k7.A0H(A0u, this.hasAvatarStickerPackInstalled);
    }
}
