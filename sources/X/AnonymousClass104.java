package X;

/* renamed from: X.104  reason: invalid class name */
public class AnonymousClass104 extends AnonymousClass103 {
    public long blkIoTicks;
    public long cancelledWriteBytes;
    public long majorFaults;
    public long rcharBytes;
    public long readBytes;
    public long syscrCount;
    public long syscwCount;
    public long wcharBytes;
    public long writeBytes;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass104 r7 = (AnonymousClass104) obj;
            if (!(r7.rcharBytes == this.rcharBytes && r7.wcharBytes == this.wcharBytes && r7.syscrCount == this.syscrCount && r7.syscwCount == this.syscwCount && r7.readBytes == this.readBytes && r7.writeBytes == this.writeBytes && r7.cancelledWriteBytes == this.cancelledWriteBytes && r7.majorFaults == this.majorFaults && r7.blkIoTicks == this.blkIoTicks)) {
                return false;
            }
        }
        return true;
    }

    public void A03(AnonymousClass104 r3) {
        this.rcharBytes = r3.rcharBytes;
        this.wcharBytes = r3.wcharBytes;
        this.syscrCount = r3.syscrCount;
        this.syscwCount = r3.syscwCount;
        this.readBytes = r3.readBytes;
        this.writeBytes = r3.writeBytes;
        this.cancelledWriteBytes = r3.cancelledWriteBytes;
        this.majorFaults = r3.majorFaults;
        this.blkIoTicks = r3.blkIoTicks;
    }

    public int hashCode() {
        long j = this.rcharBytes;
        long j2 = this.wcharBytes;
        long j3 = this.syscrCount;
        long j4 = this.syscwCount;
        long j5 = this.readBytes;
        long j6 = this.writeBytes;
        long j7 = this.cancelledWriteBytes;
        long j8 = this.majorFaults;
        long j9 = this.blkIoTicks;
        return (((((((((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiskMetrics{rcharBytes=");
        sb.append(this.rcharBytes);
        sb.append(", wcharBytes=");
        sb.append(this.wcharBytes);
        sb.append(", syscrCount=");
        sb.append(this.syscrCount);
        sb.append(", syscwCount=");
        sb.append(this.syscwCount);
        sb.append(", readBytes=");
        sb.append(this.readBytes);
        sb.append(", writeBytes=");
        sb.append(this.writeBytes);
        sb.append(", cancelledWriteBytes=");
        sb.append(this.cancelledWriteBytes);
        sb.append(", majorFaults=");
        sb.append(this.majorFaults);
        sb.append(", blkIoTicks=");
        sb.append(this.blkIoTicks);
        sb.append("}");
        return sb.toString();
    }
}
