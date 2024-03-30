package X;

import com.whatsapp.util.Log;

/* renamed from: X.6xi  reason: invalid class name and case insensitive filesystem */
public class C147746xi implements C236119d {
    public final /* synthetic */ C101514xp A00;
    public final /* synthetic */ C24441Cl A01;
    public final /* synthetic */ C35911jS A02;
    public final /* synthetic */ byte[] A03;
    public final /* synthetic */ byte[] A04;

    public C147746xi(C101514xp r1, C24441Cl r2, C35911jS r3, byte[] bArr, byte[] bArr2) {
        this.A01 = r2;
        this.A04 = bArr;
        this.A03 = bArr2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void BWw(C203399nx r2, String str) {
        C24441Cl.A00(r2, this.A00, str);
    }

    public void BiM(C203399nx r20, String str) {
        byte[] bArr = this.A04;
        byte[] bArr2 = this.A03;
        C35911jS r3 = this.A02;
        C101514xp r0 = this.A00;
        String str2 = str;
        C36321k7.A1Q("encb/EncryptedBackupProtocolHelper/beginRegOnSuccess id=", str2, AnonymousClass000.A0u());
        C203399nx r12 = r20;
        try {
            C203399nx A0e = C90514aH.A0e(r12, r3);
            Class<byte[]> cls = byte[].class;
            byte[] bArr3 = (byte[]) C203379ns.A03(r12, cls, C90474aD.A0Y(), 1024L, (Object) null, new String[]{"r2", "#elementValue"}, false);
            Object A032 = C203379ns.A03(r12, cls, 32L, 32, (Object) null, new String[]{"opaque_c", "#elementValue"}, false);
            C203539oF.A06(r12, new C165017sk(A0e, 5), new String[0]);
            byte[] bArr4 = C24441Cl.A02;
            int length = bArr3.length;
            byte[] bArr5 = new byte[(length + 1)];
            System.arraycopy(bArr4, 0, bArr5, 0, 1);
            System.arraycopy(bArr3, 0, bArr5, 1, length);
            if (!C132936Vw.A02(bArr5, (byte[]) C203379ns.A03(r12, cls, 64L, 64, (Object) null, new String[]{"r2_sig", "#elementValue"}, false), bArr2)) {
                C36321k7.A1P("encb/EncryptedBackupProtocolHelper/beginRegOnSuccess/r2 cannot be verified with r2_sig and ed_pub id=", str2, AnonymousClass000.A0u());
                r0.BWq("r2 cannot be verified with r2_sig and ed_pub", 2, -1);
                return;
            }
            r0.A00.A01();
            r0.A01.Boy(new C1503474x((Object) bArr3, (Object) r0, (Object) bArr, A032, 11));
        } catch (C235919b e) {
            Log.e("encb/EncryptedBackupProtocolHelper/beginRegOnSuccess/invalid server response", e);
            r0.BWq("invalid server response", 1, -1);
        }
    }

    public void BVN(String str) {
        C36321k7.A1P("encb/EncryptedBackupProtocolHelper/sendBeginRegI/onDeliveryFailure id=", str, AnonymousClass000.A0u());
        this.A00.BWq("delivery failure", 3, -1);
    }
}
