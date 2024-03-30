package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.protobuf.CodedOutputStream;

/* renamed from: X.A7k  reason: case insensitive filesystem */
public final class C21073A7k implements C23073B3d {
    public final C1897995q A00;
    public final B63 A01;
    public final AnonymousClass9TG A02;

    public boolean B6j(Object obj, Object obj2) {
        return C90504aG.A1T(((C170918Hz) obj).unknownFields.equals(((C170918Hz) obj2).unknownFields) ? 1 : 0);
    }

    public int BHM(Object obj) {
        C202229lJ r7 = ((C170918Hz) obj).unknownFields;
        int i = r7.A00;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < r7.count; i2++) {
                int i3 = r7.A02[i2] >>> 3;
                boolean z = CodedOutputStream.A01;
                int A002 = 2 + 1 + C165567td.A00(i3);
                int A05 = C1897895p.A05(3);
                int A022 = ((C21674AUx) r7.A03[i2]).A02();
                i += A002 + A05 + C165567td.A00(A022) + A022;
            }
            r7.A00 = i;
        }
        return i;
    }

    public int BK8(Object obj) {
        return ((C170918Hz) obj).unknownFields.hashCode();
    }

    public final boolean BM3(Object obj) {
        throw AnonymousClass001.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public void BP1(Object obj) {
        ((C170918Hz) obj).unknownFields.A01 = false;
        throw AnonymousClass001.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public void BPn(C203179nT r2, C201979ko r3, Object obj) {
        this.A02.A00(obj);
        throw AnonymousClass001.A0A("ensureExtensionsAreMutable");
    }

    public void BPo(C197909ca r3, Object obj, byte[] bArr, int i, int i2) {
        C170918Hz r4 = (C170918Hz) obj;
        if (r4.unknownFields == C202229lJ.A04) {
            r4.unknownFields = new C202229lJ();
        }
        throw AnonymousClass001.A0A("ensureExtensionsAreMutable");
    }

    public C170918Hz BQ8() {
        B63 b63 = this.A01;
        boolean z = b63 instanceof C170918Hz;
        C170918Hz r1 = (C170918Hz) b63;
        if (z) {
            return (C170918Hz) C170918Hz.A0S(r1, C023109s.A0G);
        }
        AnonymousClass8NN r2 = (AnonymousClass8NN) C170918Hz.A0S(r1, C023109s.A0R);
        C170918Hz r12 = r2.A00;
        if (r12.A0t()) {
            r12.A0s();
        }
        return r2.A00;
    }

    public void Bxf(AnonymousClass9TV r2, Object obj) {
        throw AnonymousClass001.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public C21073A7k(C1897995q r1, B63 b63, AnonymousClass9TG r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = b63;
    }

    public void BPm(Object obj, Object obj2) {
        C203849oy.A0R(obj, obj2);
    }
}
