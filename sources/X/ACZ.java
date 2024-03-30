package X;

public final class ACZ implements C16320oy {
    public final C188458zc A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ACZ) && this.A00 == ((ACZ) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public ACZ(C188458zc r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupError(groupLevelError=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
