package X;

/* renamed from: X.90l  reason: invalid class name and case insensitive filesystem */
public enum C1887190l implements C22899AyB {
    CODEC_TYPE_NONE(0),
    CODEC_TYPE_AUDIO(1),
    CODEC_TYPE_VIDEO(2),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BEY() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw C165597tg.A0c();
    }

    /* access modifiers changed from: public */
    C1887190l(int i) {
        this.value = i;
    }
}
