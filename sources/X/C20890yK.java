package X;

import java.util.Map;

/* renamed from: X.0yK  reason: invalid class name and case insensitive filesystem */
public abstract class C20890yK implements Cloneable {
    public static final C20910yM Companion = new C20910yM();
    public static final C18950u5 DEFAULT_SAMPLING_RATE = new C18950u5(1, 20, 20, false);
    public static final int NOT_ALLOWED_PS_ID = -1;
    public final int bufferChannel;
    public final int code;
    public final int psId;
    public final C18950u5 samplingRate;

    public C20890yK(int i, C18950u5 r3, int i2, int i3) {
        AnonymousClass00C.A0D(r3, 2);
        this.code = i;
        this.samplingRate = r3;
        this.bufferChannel = i2;
        this.psId = i3;
    }

    public abstract Map getFieldsMap();

    public abstract void serialize(C28991Ux r1);

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }

    public final C18950u5 getSamplingRate() {
        return this.samplingRate;
    }
}
