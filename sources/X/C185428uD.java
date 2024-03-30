package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8uD  reason: invalid class name and case insensitive filesystem */
public final class C185428uD extends C118095nK implements B06, B07 {
    public static final ArrayList A03 = C36351kA.A10(new String[]{"audio", "avatar_sticker", "cataloglink", "document", "genai_sticker", "gif", "image", "productlink", "ptt", "sticker", "url", "vcard", "video"});
    public final C184078rr A00;
    public final C203399nx A01;
    public final C183888rY A02;

    public void B01(AnonymousClass9OV r36) {
        AnonymousClass9OV r0 = r36;
        AnonymousClass1TZ r34 = r0.A05;
        C28981Uw r33 = r0.A04;
        String str = r0.A08;
        long j = r0.A02;
        long j2 = r0.A00;
        boolean z = r0.A0B;
        long j3 = r0.A01;
        List list = r0.A09;
        List list2 = r0.A0A;
        long j4 = r0.A03;
        boolean z2 = r0.A0C;
        Integer A0n = C36371kC.A0n();
        Long l = r0.A07;
        List list3 = list2;
        byte[] bArr = (byte[]) this.A00.A00;
        long j5 = j;
        Long l2 = l;
        Long l3 = r0.A06;
        String str2 = str;
        List list4 = list;
        C28981Uw r14 = r33;
        AnonymousClass1TZ r15 = r34;
        AnonymousClass1TZ.A00(r14, r15, A0n, l2, l3, str2, list4, list3, bArr, j5, j2, j3, j4, z, z2);
    }

    public void B02(AnonymousClass9OW r33) {
        AnonymousClass9OW r8 = r33;
        AnonymousClass1TZ r14 = r8.A05;
        C28981Uw r13 = r8.A04;
        String str = r8.A08;
        long j = r8.A02;
        long j2 = r8.A00;
        boolean z = r8.A0B;
        long j3 = r8.A01;
        List list = r8.A09;
        long j4 = r8.A03;
        long j5 = j2;
        byte[] bArr = (byte[]) this.A00.A00;
        long j6 = j;
        String str2 = str;
        List list2 = list;
        AnonymousClass1TZ.A00(r13, r14, (Integer) null, (Long) null, (Long) null, str2, list2, (List) null, bArr, j6, j5, j3, j4, z, r8.A0C);
    }

    public C185428uD(C203399nx r4) {
        C203399nx.A09(r4);
        C203379ns.A0F(r4, "plaintext", "mediatype", A03);
        this.A00 = (C184078rr) C203539oF.A03(r4, APW.A00, "plaintext");
        this.A02 = (C183888rY) C203539oF.A02(r4, APX.A00, 0);
        this.A01 = (C203399nx) C203539oF.A05(r4, APY.A00, C165607th.A1b(r4, this, "plaintext"));
    }
}
