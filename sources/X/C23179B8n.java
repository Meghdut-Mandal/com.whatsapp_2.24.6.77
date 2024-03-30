package X;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;

/* renamed from: X.B8n  reason: case insensitive filesystem */
public class C23179B8n implements Parcelable.Creator {
    public final int A00;

    public C23179B8n(int i) {
        this.A00 = i;
    }

    public static C23179B8n A00(int i) {
        return new C23179B8n(i);
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 1:
                return MediaDescriptionCompat.A00(MediaDescription.CREATOR.createFromParcel(parcel));
            case 2:
                return new MediaMetadataCompat(parcel);
            case 3:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 4:
                return new MediaSessionCompat$QueueItem(parcel);
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper(parcel);
            case 6:
                return new MediaSessionCompat$Token(parcel.readParcelable((ClassLoader) null));
            case 7:
                return new ParcelableVolumeInfo(parcel);
            case 8:
                return new PlaybackStateCompat(parcel);
            case 9:
                return new PlaybackStateCompat.CustomAction(parcel);
            case 10:
                return new C167827z3(parcel);
            case 11:
                return new C167837z4(parcel);
            case 12:
                return new C167847z5(parcel);
            case 13:
                return new C166227vN(parcel);
            case 14:
                return new C167857z6(parcel);
            case 15:
                return new C167877z8(parcel);
            case 16:
                return new C167867z7(parcel);
            case 17:
                return new C166307vV(parcel);
            case 18:
                C194119Oe r1 = new C194119Oe();
                r1.A05 = parcel.readString();
                r1.A0F = AnonymousClass000.A1P(parcel.readInt());
                r1.A0G = AnonymousClass000.A1P(parcel.readInt());
                r1.A0C = AnonymousClass000.A1P(parcel.readInt());
                r1.A0B = AnonymousClass000.A1P(parcel.readInt());
                r1.A0A = AnonymousClass000.A1P(parcel.readInt());
                r1.A09 = AnonymousClass000.A1P(parcel.readInt());
                r1.A08 = AnonymousClass000.A1P(parcel.readInt());
                r1.A07 = AnonymousClass000.A1P(parcel.readInt());
                r1.A0H = AnonymousClass000.A1P(parcel.readInt());
                r1.A03 = parcel.readString();
                r1.A04 = parcel.readString();
                r1.A02 = parcel.readString();
                r1.A06 = parcel.readString();
                r1.A01 = parcel.readString();
                r1.A0E = AnonymousClass000.A1P(parcel.readInt());
                r1.A00 = parcel.readInt();
                r1.A0D = AnonymousClass000.A1P(parcel.readInt());
                r1.A0I = AnonymousClass000.A1P(parcel.readInt());
                return new C206379tI(r1);
            case 19:
                return new C21709AXg(parcel);
            case 20:
                return new C207069uV(parcel);
            case 21:
                return new C209309zn(parcel);
            case 22:
                return new C207029uR(parcel);
            case 23:
                return new C209319zo(parcel);
            case 24:
                return new C1689482q(parcel);
            case 25:
                return new C1689282o(parcel);
            case 26:
                return new C1689382p(parcel);
            case 27:
                return new C1689182n(parcel);
            case 28:
                return new C209299zm(parcel);
            case 29:
                return new AnonymousClass83A(parcel);
            case 30:
                return new C206399tL(parcel);
            case 31:
                return new EffectAttribution(parcel);
            case 32:
                return new EffectAttribution.AttributedAsset(parcel);
            case 33:
                return new EffectAttribution.License(parcel);
            case 34:
                return new C206309t6(parcel);
            case 35:
                return new DeviceConfig(parcel);
            case 36:
                return new C206999uO(parcel);
            case 37:
                return new C207229ul(parcel);
            case 38:
                return new C207039uS(parcel);
            case 39:
                return new C207019uQ(parcel);
            case 40:
                return new C207129ub(parcel);
            case 41:
                return new C206299t4(parcel.readLong(), parcel.readLong());
            case 42:
                return new AnonymousClass89E(parcel);
            case 43:
                return new AnonymousClass89C(parcel);
            case 44:
                return new AnonymousClass89D(parcel);
            case 45:
                return new AnonymousClass89F(parcel);
            case 46:
                return new C207179ug(parcel);
            case 47:
                int readInt = parcel.readInt();
                SparseArray sparseArray = AnonymousClass909.A00;
                if (sparseArray.get(readInt) != null) {
                    return sparseArray.get(readInt);
                }
                throw AnonymousClass001.A08("Invalid VideoMemoryState value");
            case 48:
                return new C206849u6(parcel);
            default:
                return new C207169uf(parcel);
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i];
            case 1:
                return new MediaDescriptionCompat[i];
            case 2:
                return new MediaMetadataCompat[i];
            case 3:
                return new RatingCompat[i];
            case 4:
                return new MediaSessionCompat$QueueItem[i];
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 6:
                return new MediaSessionCompat$Token[i];
            case 7:
                return new ParcelableVolumeInfo[i];
            case 8:
                return new PlaybackStateCompat[i];
            case 9:
                return new PlaybackStateCompat.CustomAction[i];
            case 10:
                return new C167827z3[i];
            case 11:
                return new C167837z4[i];
            case 12:
                return new C167847z5[i];
            case 13:
                return new C166227vN[i];
            case 14:
                return new C167857z6[i];
            case 15:
                return new C167877z8[i];
            case 16:
                return new C167867z7[i];
            case 17:
                return new C166307vV[i];
            case 18:
                return new C206379tI[i];
            case 19:
                return new C21709AXg[i];
            case 20:
                return new C207069uV[i];
            case 21:
                return new C209309zn[i];
            case 22:
                return new C207029uR[i];
            case 23:
                return new C209319zo[i];
            case 24:
                return new C1689482q[i];
            case 25:
                return new C1689282o[i];
            case 26:
                return new C1689382p[i];
            case 27:
                return new C1689182n[i];
            case 28:
                return new C209299zm[i];
            case 29:
                return new AnonymousClass83A[i];
            case 30:
                return new C206399tL[i];
            case 31:
                return new EffectAttribution[i];
            case 32:
                return new EffectAttribution.AttributedAsset[i];
            case 33:
                return new EffectAttribution.License[i];
            case 34:
                return new C206309t6[i];
            case 35:
                return new DeviceConfig[i];
            case 36:
                return new C206999uO[i];
            case 37:
                return new C207229ul[i];
            case 38:
                return new C207039uS[i];
            case 39:
                return new C207019uQ[i];
            case 40:
                return new C207129ub[i];
            case 41:
                return new C206299t4[i];
            case 42:
                return new AnonymousClass89E[i];
            case 43:
                return new AnonymousClass89C[i];
            case 44:
                return new AnonymousClass89D[i];
            case 45:
                return new AnonymousClass89F[i];
            case 46:
                return new C207179ug[i];
            case 47:
                return new AnonymousClass909[i];
            case 48:
                return new C206849u6[i];
            default:
                return new C207169uf[i];
        }
    }
}
