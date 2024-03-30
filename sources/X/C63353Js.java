package X;

/* renamed from: X.3Js  reason: invalid class name and case insensitive filesystem */
public final class C63353Js {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63353Js) {
                C63353Js r5 = (C63353Js) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((this.A00 * 31) + C36341k9.A09(this.A04)) * 31) + C36341k9.A09(this.A03)) * 31) + C36341k9.A09(this.A02)) * 31) + C36411kG.A09(this.A01);
    }

    public C63353Js(Integer num, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ScreenshotUploadResult(result=");
        A0u.append(this.A00);
        A0u.append(", uploadUrl=");
        A0u.append(this.A04);
        A0u.append(", iv=");
        A0u.append(this.A03);
        A0u.append(", cipherKey=");
        A0u.append(this.A02);
        A0u.append(", mediaType=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
