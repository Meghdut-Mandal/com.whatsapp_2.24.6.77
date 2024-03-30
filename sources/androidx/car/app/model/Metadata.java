package androidx.car.app.model;

import java.util.Objects;

public final class Metadata {
    public static final Metadata A00 = new Metadata((Place) null);
    public final Place mPlace = null;

    public Metadata(Place place) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        return Objects.equals(this.mPlace, ((Metadata) obj).mPlace);
    }

    public int hashCode() {
        return Objects.hashCode(this.mPlace);
    }

    public Metadata() {
    }
}
