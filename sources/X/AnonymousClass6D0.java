package X;

/* renamed from: X.6D0  reason: invalid class name */
public final class AnonymousClass6D0 {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;

    public AnonymousClass6D0(C99984uH r8) {
        Integer num;
        String str;
        Integer num2;
        Integer num3;
        AnonymousClass00C.A0D(r8, 1);
        int i = r8.bitField0_;
        Integer num4 = null;
        if ((i & 1) == 0 ? false : true) {
            num = Integer.valueOf(r8.sentiment_);
        } else {
            num = null;
        }
        if ((i & 2) != 0) {
            str = r8.behaviorGraph_;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            num2 = Integer.valueOf(r8.action_);
        } else {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = Integer.valueOf(r8.intensity_);
        } else {
            num3 = null;
        }
        num4 = (i & 16) != 0 ? Integer.valueOf(r8.wordCount_) : num4;
        this.A02 = num;
        this.A04 = str;
        this.A00 = num2;
        this.A01 = num3;
        this.A03 = num4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6D0) {
                AnonymousClass6D0 r5 = (AnonymousClass6D0) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((AnonymousClass000.A0H(this.A02) * 31) + C36341k9.A09(this.A04)) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A03);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BotAvatarMetadata(sentiment=");
        A0u.append(this.A02);
        A0u.append(", behaviorGraph=");
        A0u.append(this.A04);
        A0u.append(", action=");
        A0u.append(this.A00);
        A0u.append(", intensity=");
        A0u.append(this.A01);
        A0u.append(", wordCount=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
