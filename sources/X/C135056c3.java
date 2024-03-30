package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.AREffectAsyncAsset;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.6c3  reason: invalid class name and case insensitive filesystem */
public class C135056c3 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(10);
    public final long A00;
    public final AnonymousClass6VA A01;
    public final C135146cD A02;
    public final C23931Ak A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final long A0C;
    public final String A0D;

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != null) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 == r8) goto L_0x00b2
            boolean r1 = r8 instanceof X.C135056c3
            r0 = 0
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            X.6c3 r8 = (X.C135056c3) r8
            X.6cD r1 = r7.A02
            X.6cD r0 = r8.A02
            if (r1 != 0) goto L_0x00a9
            r5 = 1
            if (r0 == 0) goto L_0x0015
        L_0x0014:
            r5 = 0
        L_0x0015:
            X.6VA r0 = r7.A01
            java.lang.String r1 = r0.A0A
            X.6VA r0 = r8.A01
            java.lang.String r0 = r0.A0A
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            java.lang.String r1 = r7.A06
            java.lang.String r0 = r8.A06
            if (r1 != 0) goto L_0x00a2
            if (r0 != 0) goto L_0x00b1
        L_0x002b:
            java.lang.String r1 = r7.A08
            java.lang.String r0 = r8.A08
            if (r1 != 0) goto L_0x009b
            if (r0 != 0) goto L_0x00b1
        L_0x0033:
            java.lang.String r1 = r7.A0D
            java.lang.String r0 = r8.A0D
            if (r1 != 0) goto L_0x0094
            if (r0 != 0) goto L_0x00b1
        L_0x003b:
            boolean r1 = r7.A0A
            boolean r0 = r8.A0A
            if (r1 != r0) goto L_0x00b1
            java.lang.String r1 = r7.A05
            java.lang.String r0 = r8.A05
            if (r1 != 0) goto L_0x008d
            if (r0 != 0) goto L_0x00b1
        L_0x0049:
            java.lang.Integer r1 = r7.A04
            java.lang.Integer r0 = r8.A04
            if (r1 != r0) goto L_0x00b1
            long r3 = r7.A00
            long r1 = r8.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b1
            java.util.List r1 = r7.A09
            java.util.List r0 = r8.A09
            if (r1 != 0) goto L_0x0086
            if (r0 != 0) goto L_0x00b1
        L_0x005f:
            java.lang.String r1 = r7.A07
            java.lang.String r0 = r8.A07
            if (r1 != 0) goto L_0x007f
            if (r0 != 0) goto L_0x00b1
        L_0x0067:
            X.1Ak r1 = r7.A03
            X.1Ak r0 = r8.A03
            if (r1 != 0) goto L_0x0078
            if (r0 != 0) goto L_0x00b1
        L_0x006f:
            boolean r1 = r7.A0B
            boolean r0 = r8.A0B
            if (r1 != r0) goto L_0x00b1
            if (r5 == 0) goto L_0x00b1
            return r6
        L_0x0078:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x006f
        L_0x007f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x0067
        L_0x0086:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x005f
        L_0x008d:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x0049
        L_0x0094:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x003b
        L_0x009b:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x0033
        L_0x00a2:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x002b
        L_0x00a9:
            if (r0 == 0) goto L_0x0014
            boolean r5 = r1.equals(r0)
            goto L_0x0015
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135056c3.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return this.A01.A0A.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass6VA r1 = this.A01;
        ByteBuffer allocate = ByteBuffer.allocate(ZipDecompressor.UNZIP_BUFFER_SIZE);
        allocate.putLong(7310021016723351138L);
        AnonymousClass6VA.A01(r1.A0A, allocate);
        AnonymousClass6VA.A01(r1.A0B, allocate);
        AnonymousClass6VA.A01(r1.A0C, allocate);
        AnonymousClass6VA.A01(r1.A02.name(), allocate);
        AnonymousClass6VA.A01(r1.A04(), allocate);
        AnonymousClass6VA.A01(r1.A0D, allocate);
        AnonymousClass6VA.A01(r1.A03.name(), allocate);
        allocate.putInt(r1.A01);
        AnonymousClass6VA.A01(r1.A09, allocate);
        AnonymousClass6VA.A01(r1.A08.toString(), allocate);
        AnonymousClass6VA.A01(C36331k8.A0h(r1.A06), allocate);
        AnonymousClass6VA.A01(r1.A07.toString(), allocate);
        AnonymousClass6VA.A01(r1.A0E, allocate);
        parcel.writeByteArray(Arrays.copyOf(allocate.array(), allocate.position()));
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0D);
        parcel.writeByte(this.A0A ? (byte) 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A0C);
        parcel.writeTypedList(this.A09);
        parcel.writeString(this.A07);
        parcel.writeTypedList(this.A03);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        int i2 = 0;
        parcel.writeParcelable(this.A02, 0);
        Integer num = this.A04;
        if (num != null) {
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }

    public C135056c3(Parcel parcel) {
        C23931Ak copyOf;
        try {
            this.A01 = new AnonymousClass6VA(ByteBuffer.wrap(parcel.createByteArray()));
            this.A06 = parcel.readString();
            this.A08 = parcel.readString();
            this.A0D = parcel.readString();
            boolean z = true;
            this.A0A = AnonymousClass000.A1P(parcel.readByte());
            this.A05 = parcel.readString();
            this.A00 = parcel.readLong();
            this.A0C = parcel.readLong();
            this.A09 = parcel.createTypedArrayList(ARCapabilityMinVersionModeling.CREATOR);
            this.A07 = parcel.readString();
            ArrayList createTypedArrayList = parcel.createTypedArrayList(AREffectAsyncAsset.CREATOR);
            if (createTypedArrayList == null) {
                copyOf = null;
            } else {
                copyOf = C23931Ak.copyOf((Collection) createTypedArrayList);
            }
            this.A03 = copyOf;
            this.A0B = parcel.readByte() == 0 ? false : z;
            this.A02 = (C135146cD) C36411kG.A0H(parcel, C135146cD.class);
            this.A04 = C023109s.A00(2)[parcel.readInt()];
        } catch (IOException e) {
            throw AnonymousClass001.A0B(e);
        }
    }

    public String toString() {
        String A002;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("id: ");
        AnonymousClass6VA r5 = this.A01;
        A0u.append(r5.A0A);
        A0u.append(", name: ");
        A0u.append(r5.A0C);
        A0u.append(", instance id: ");
        A0u.append(r5.A0B);
        A0u.append(", cache key: ");
        A0u.append(r5.A09);
        A0u.append(", asset type: ");
        ARAssetType aRAssetType = r5.A02;
        A0u.append(aRAssetType);
        A0u.append(", sub asset type: ");
        A0u.append(r5.A04());
        A0u.append(", compression method: ");
        A0u.append(r5.A03);
        A0u.append(", uri: ");
        A0u.append(this.A08);
        A0u.append(", file size bytes: ");
        A0u.append(this.A00);
        A0u.append(", hash value: ");
        A0u.append(this.A05);
        A0u.append(", hash type: ");
        Integer num = this.A04;
        if (num == null) {
            A002 = "null";
        } else {
            A002 = AnonymousClass5YE.A00(num);
        }
        A0u.append(A002);
        A0u.append(", is logging disabled: ");
        A0u.append(this.A0A);
        A0u.append(", is asset encrypted: ");
        A0u.append(r5.A07.booleanValue());
        A0u.append(", uses flm capability: ");
        A0u.append(this.A0B);
        if (aRAssetType == ARAssetType.EFFECT) {
            A0u.append(", model capability minVersion: ");
            A0u.append(this.A09);
        }
        return A0u.toString();
    }

    public C135056c3(ARAssetType aRAssetType, ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod, EffectAssetType effectAssetType, C108425Tl r22, VersionedCapability versionedCapability, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, long j, long j2) {
        String str10 = str;
        ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod2 = aRRequestAsset$CompressionMethod;
        if (aRRequestAsset$CompressionMethod != null) {
            String str11 = str2;
            VersionedCapability versionedCapability2 = versionedCapability;
            C108425Tl r7 = r22;
            EffectAssetType effectAssetType2 = effectAssetType;
            ARAssetType aRAssetType2 = aRAssetType;
            this.A01 = new AnonymousClass6VA(aRAssetType2, aRRequestAsset$CompressionMethod2, effectAssetType2, (AnonymousClass5TN) null, r7, versionedCapability2, false, (Boolean) null, str10, str11, str3, str7, str8, (String) null, i);
            this.A08 = str5;
            this.A06 = str4;
            this.A05 = str6;
            this.A0A = false;
            this.A0D = str10;
            this.A00 = j;
            this.A0C = j2;
            this.A09 = list;
            this.A07 = str9;
            this.A03 = null;
            this.A02 = null;
            this.A0B = false;
            this.A04 = num;
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Compression method must not be null: id=");
        throw AnonymousClass000.A0c(str10, A0u);
    }
}
