package X;

import android.media.MediaCrypto;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import com.facebook.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

/* renamed from: X.9k8  reason: invalid class name and case insensitive filesystem */
public final class C201699k8 {
    public static final C196439Zq A02 = C196439Zq.A00;
    public final UUID A00;
    public final MediaDrm A01;

    public AnonymousClass9GD A01(String str, byte[] bArr, byte[] bArr2, int i) {
        MediaDrm.KeyRequest keyRequest = this.A01.getKeyRequest(bArr, bArr2, str, i, (HashMap) null);
        return new AnonymousClass9GD(keyRequest.getData(), keyRequest.getDefaultUrl());
    }

    public static C201699k8 A00(UUID uuid) {
        try {
            return new C201699k8(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new AnonymousClass924(e, 1);
        } catch (Exception e2) {
            throw new AnonymousClass924(e2, 2);
        }
    }

    public AnonymousClass9GE A02() {
        MediaDrm.ProvisionRequest provisionRequest = this.A01.getProvisionRequest();
        return new AnonymousClass9GE(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public /* bridge */ /* synthetic */ C209029zL A03(byte[] bArr) {
        UUID uuid = this.A00;
        MediaCrypto mediaCrypto = new MediaCrypto(uuid, bArr);
        if (Util.A00 < 27 && AnonymousClass9B7.A00.equals(uuid)) {
            uuid = AnonymousClass9B7.A01;
        }
        return new C209029zL(mediaCrypto, uuid, bArr);
    }

    public HashMap A04(byte[] bArr) {
        return this.A01.queryKeyStatus(bArr);
    }

    public void A05() {
        this.A01.setPropertyString("securityLevel", "L3");
    }

    public void A06(C191029Bh r3) {
        this.A01.setOnEventListener(new C204299pm(r3, this));
    }

    public /* synthetic */ void A07(C191029Bh r2, byte[] bArr, int i) {
        C165577te.A0w(r2.A00.A09, bArr, i);
    }

    public void A08(byte[] bArr) {
        this.A01.closeSession(bArr);
    }

    public void A09(byte[] bArr) {
        this.A01.provideProvisionResponse(bArr);
    }

    public void A0A(byte[] bArr, byte[] bArr2) {
        this.A01.restoreKeys(bArr, bArr2);
    }

    public byte[] A0B() {
        return this.A01.openSession();
    }

    public byte[] A0C(byte[] bArr, byte[] bArr2) {
        if (AnonymousClass9B7.A00.equals(this.A00)) {
            bArr2 = AnonymousClass5Y8.A00(bArr2);
        }
        return this.A01.provideKeyResponse(bArr, bArr2);
    }

    public C201699k8(UUID uuid) {
        Objects.requireNonNull(uuid);
        UUID uuid2 = AnonymousClass9B7.A01;
        if (!uuid2.equals(uuid)) {
            this.A00 = uuid;
            UUID uuid3 = uuid;
            if (Util.A00 < 27 && AnonymousClass9B7.A00.equals(uuid)) {
                uuid3 = uuid2;
            }
            MediaDrm mediaDrm = new MediaDrm(uuid3);
            this.A01 = mediaDrm;
            if (AnonymousClass9B7.A04.equals(uuid) && "ASUS_Z00AD".equals(Util.A04)) {
                mediaDrm.setPropertyString("securityLevel", "L3");
                return;
            }
            return;
        }
        throw AnonymousClass001.A08(String.valueOf("Use C.CLEARKEY_UUID instead"));
    }
}
