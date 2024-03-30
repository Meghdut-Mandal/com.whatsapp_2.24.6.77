package X;

import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.82N  reason: invalid class name */
public abstract class AnonymousClass82N extends Timeline {
    public final int A00;
    public final B3L A01;

    public int A0A(int i) {
        if (this instanceof AnonymousClass82C) {
            return i * ((AnonymousClass82C) this).A01;
        }
        return ((AnonymousClass82D) this).A04[i];
    }

    public Timeline A0B(int i) {
        if (this instanceof AnonymousClass82C) {
            return ((AnonymousClass82C) this).A03;
        }
        return ((AnonymousClass82D) this).A06[i];
    }

    public AnonymousClass82N(B3L b3l) {
        this.A01 = b3l;
        this.A00 = b3l.getLength();
    }
}
