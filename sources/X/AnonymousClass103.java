package X;

import java.io.Serializable;

/* renamed from: X.103  reason: invalid class name */
public abstract class AnonymousClass103 implements Serializable {
    public AnonymousClass103 A01(AnonymousClass103 r2) {
        AnonymousClass104 r0 = (AnonymousClass104) this;
        r0.A03((AnonymousClass104) r2);
        return r0;
    }

    public AnonymousClass103 A02(AnonymousClass103 r6, AnonymousClass103 r7) {
        AnonymousClass104 r4 = (AnonymousClass104) this;
        AnonymousClass104 r62 = (AnonymousClass104) r6;
        AnonymousClass104 r72 = (AnonymousClass104) r7;
        if (r72 == null) {
            r72 = new AnonymousClass104();
        }
        if (r62 == null) {
            r72.A03(r4);
            return r72;
        }
        r72.rcharBytes = r4.rcharBytes - r62.rcharBytes;
        r72.wcharBytes = r4.wcharBytes - r62.wcharBytes;
        r72.syscrCount = r4.syscrCount - r62.syscrCount;
        r72.syscwCount = r4.syscwCount - r62.syscwCount;
        r72.readBytes = r4.readBytes - r62.readBytes;
        r72.writeBytes = r4.writeBytes - r62.writeBytes;
        r72.cancelledWriteBytes = r4.cancelledWriteBytes - r62.cancelledWriteBytes;
        r72.majorFaults = r4.majorFaults - r62.majorFaults;
        r72.blkIoTicks = r4.blkIoTicks - r62.blkIoTicks;
        return r72;
    }
}
