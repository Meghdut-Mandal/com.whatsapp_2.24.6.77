package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.8ma  reason: invalid class name and case insensitive filesystem */
public class C180888ma extends C207209uj {
    public static final Parcelable.Creator CREATOR = new C23181B8p(4);
    public long A00;
    public long A01;
    public DeviceJid A02;
    public String A03;

    public C180888ma(Parcel parcel) {
        super(parcel);
        this.A02 = (DeviceJid) C36411kG.A0H(parcel, DeviceJid.class);
        this.A03 = C90514aH.A0u(parcel);
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
    }

    public C180888ma(DeviceJid deviceJid, C207209uj r2, String str, long j, long j2) {
        super(r2);
        this.A02 = deviceJid;
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
    }
}
