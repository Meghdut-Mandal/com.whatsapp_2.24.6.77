package X;

/* renamed from: X.8zt  reason: invalid class name and case insensitive filesystem */
public enum C188618zt {
    JSON(".json"),
    ZIP(".zip");
    
    public final String extension;

    /* access modifiers changed from: public */
    C188618zt(String str) {
        this.extension = str;
    }

    public String toString() {
        return this.extension;
    }
}
