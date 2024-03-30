package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.1AL  reason: invalid class name */
public final class AnonymousClass1AL implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134406az();
    public final byte A00;
    public final Jid A01;
    public final String A02;
    public final String A03;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if ((r4 instanceof X.C177628e6) != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1AL(com.whatsapp.jid.Jid r4, java.lang.String r5, java.lang.String r6, byte r7) {
        /*
            r3 = this;
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            r0 = 2
            X.AnonymousClass00C.A0D(r6, r0)
            r3.<init>()
            r3.A02 = r5
            r3.A03 = r6
            r3.A01 = r4
            r3.A00 = r7
            if (r4 == 0) goto L_0x003e
            boolean r0 = r4.isProtocolCompliant()
            if (r0 != 0) goto L_0x0020
            boolean r0 = r4 instanceof X.C177628e6
            r2 = 0
            if (r0 == 0) goto L_0x0021
        L_0x0020:
            r2 = 1
        L_0x0021:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Jid: "
            r1.append(r0)
            java.lang.String r0 = r4.getRawString()
            r1.append(r0)
            java.lang.String r0 = " is not protocol compliant"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C18740tg.A0E(r2, r0)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AL.<init>(com.whatsapp.jid.Jid, java.lang.String, java.lang.String, byte):void");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass00C.A0J(getClass(), obj.getClass())) {
                return false;
            }
            AnonymousClass1AL r5 = (AnonymousClass1AL) obj;
            if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeByte(this.A00);
    }

    public int hashCode() {
        return ((this.A02.hashCode() + 31) * 31) + this.A03.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyValue{key='");
        sb.append(this.A02);
        sb.append("', value='");
        sb.append(this.A03);
        sb.append("', type='");
        sb.append(this.A00);
        sb.append("'}");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass1AL(Jid jid, String str) {
        this(jid, str, jid.getRawString(), (byte) 1);
        AnonymousClass00C.A0D(str, 1);
        AnonymousClass00C.A0D(jid, 2);
    }

    public AnonymousClass1AL(String str, int i) {
        this(str, String.valueOf(i));
    }

    public AnonymousClass1AL(String str, long j) {
        this(str, String.valueOf(j));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass1AL(String str, String str2) {
        this((Jid) null, str, str2, (byte) 0);
        AnonymousClass00C.A0D(str, 1);
        AnonymousClass00C.A0D(str2, 2);
    }
}
