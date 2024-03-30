package X;

import com.facebook.wearable.applinks.AppLinkLinkInfoResponse;
import java.util.List;
import java.util.UUID;

/* renamed from: X.89I  reason: invalid class name */
public final class AnonymousClass89I extends C165997ur {
    public final /* synthetic */ C203689oX A00;
    public final /* synthetic */ UUID A01;
    public final /* synthetic */ C020008m A02;

    public void BWa(int i, String str) {
        AnonymousClass00C.A0D(str, 1);
        Object A0r = C36371kC.A0r(C108455To.A00, i);
        if (A0r == null) {
            A0r = C108455To.UNKNOWN;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("getDeviceLinkInfo: onError ");
        A0u.append(A0r);
        A0u.append(". ");
        A0u.append(str);
        AnonymousClass6YR.A09("lam:LinkedAppManager", AnonymousClass000.A0t(A0u, '.'), (Throwable) null);
    }

    public void Bf4(AppLinkLinkInfoResponse appLinkLinkInfoResponse) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AnonymousClass00C.A0D(appLinkLinkInfoResponse, 0);
        byte[] bArr = appLinkLinkInfoResponse.firmwareVersion;
        String str6 = null;
        if (bArr != null) {
            str6 = C165607th.A0w(bArr);
        }
        String str7 = "";
        if (str6 == null) {
            str6 = str7;
        }
        byte[] bArr2 = appLinkLinkInfoResponse.deviceSerial;
        if (bArr2 != null) {
            str = C165607th.A0w(bArr2);
        } else {
            str = str7;
        }
        byte[] bArr3 = appLinkLinkInfoResponse.deviceImageAssetURI;
        if (bArr3 != null) {
            str2 = C165607th.A0w(bArr3);
        } else {
            str2 = str7;
        }
        byte[] bArr4 = appLinkLinkInfoResponse.deviceModelName;
        if (bArr4 != null) {
            str3 = C165607th.A0w(bArr4);
        } else {
            str3 = str7;
        }
        byte[] bArr5 = appLinkLinkInfoResponse.buildFlavor;
        if (bArr5 != null) {
            str4 = C165607th.A0w(bArr5);
        } else {
            str4 = str7;
        }
        byte[] bArr6 = appLinkLinkInfoResponse.deviceName;
        if (bArr6 != null) {
            str5 = C165607th.A0w(bArr6);
        } else {
            str5 = str7;
        }
        byte[] bArr7 = appLinkLinkInfoResponse.hardwareType;
        if (bArr7 != null) {
            str7 = C165607th.A0w(bArr7);
        }
        C020008m r0 = this.A02;
        UUID uuid = this.A01;
        List list = appLinkLinkInfoResponse.addressList;
        AnonymousClass00C.A07(list);
        r0.BKw(uuid, list, str6, str, str2, str3, str4, str5, str7);
    }

    public AnonymousClass89I(C203689oX r1, UUID uuid, C020008m r3) {
        this.A02 = r3;
        this.A01 = uuid;
        this.A00 = r1;
    }
}
