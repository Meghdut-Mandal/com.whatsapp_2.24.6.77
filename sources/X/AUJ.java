package X;

import java.io.Serializable;

public final class AUJ implements Serializable {
    public static final long serialVersionUID = 6776230050133633619L;
    public final int minBufferMs;
    public final int minRebufferMs;

    public boolean equals(Object obj) {
        if (obj instanceof AUJ) {
            AUJ auj = (AUJ) obj;
            if (this.minBufferMs == auj.minBufferMs && this.minRebufferMs == auj.minRebufferMs) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.minBufferMs * 31) + this.minRebufferMs;
    }

    public AUJ(int i, int i2) {
        this.minBufferMs = i;
        this.minRebufferMs = i2;
    }
}
