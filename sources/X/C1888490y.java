package X;

/* renamed from: X.90y  reason: invalid class name and case insensitive filesystem */
public enum C1888490y implements C22899AyB {
    UnknownUserEvent(0),
    Don(1),
    Doff(2),
    CloseArms(3),
    OpenArms(4),
    DoubleCapturePress(5),
    LongCapturePress(6),
    ShortCapturePress(7),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BEY() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw C165597tg.A0c();
    }

    /* access modifiers changed from: public */
    C1888490y(int i) {
        this.value = i;
    }
}
