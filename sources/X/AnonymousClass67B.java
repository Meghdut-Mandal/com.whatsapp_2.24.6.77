package X;

import java.util.Iterator;

/* renamed from: X.67B  reason: invalid class name */
public class AnonymousClass67B {
    public AnonymousClass5TE A00;
    public C128956Eg A01;
    public Iterator A02;
    public final AnonymousClass6QD A03;

    public void A00(AnonymousClass5TE r2, int i) {
        this.A00 = r2;
        C128956Eg A012 = this.A03.A01(r2, i);
        this.A01 = A012;
        if (A012 != null) {
            Iterator A0r = C90474aD.A0r(A012.A04);
            this.A02 = A0r;
            if (A0r.hasNext()) {
                this.A02.next();
                return;
            }
            return;
        }
        throw AnonymousClass001.A08("Requested Track is not available");
    }

    public AnonymousClass67B(AnonymousClass6QD r1) {
        this.A03 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TimelineSpeedProvider{mMediaComposition=");
        A0u.append(this.A03);
        A0u.append(", mTimelineSpeedIterator=");
        A0u.append(this.A02);
        C90474aD.A1M(A0u, ", mCurrentTimelineSpeed=");
        A0u.append(", mMediaTrackComposition=");
        A0u.append(this.A01);
        A0u.append(", mSelectedTrackType=");
        return C90464aC.A0X(this.A00, A0u);
    }
}
