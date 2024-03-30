package X;

/* renamed from: X.172  reason: invalid class name */
public final class AnonymousClass172 extends Exception {
    public final C188178zA errorType;
    public final String message;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass172(C188178zA r2, String str) {
        super(str);
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(str, 2);
        this.errorType = r2;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass172) {
                AnonymousClass172 r5 = (AnonymousClass172) obj;
                if (this.errorType != r5.errorType || !AnonymousClass00C.A0J(this.message, r5.message)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.errorType.hashCode() * 31) + this.message.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Error type: ");
        sb.append(this.errorType);
        sb.append(". ");
        sb.append(this.message);
        return sb.toString();
    }

    public String getMessage() {
        return this.message;
    }
}
