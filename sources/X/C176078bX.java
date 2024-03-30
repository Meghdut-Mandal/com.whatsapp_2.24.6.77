package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.8bX  reason: invalid class name and case insensitive filesystem */
public class C176078bX extends C201669k5 implements C22936Aym, AnonymousClass4QK, AnonymousClass4QL {
    public final C202679mP A00;
    public final AnonymousClass11F A01;
    public final boolean A02;

    public C176078bX(C202679mP r10, AnonymousClass11F r11, long j, boolean z) {
        this((C201539jo) null, r10, r11, (String) null, j, z, true);
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8NN A0p = AnonymousClass8PN.DEFAULT_INSTANCE.A0p();
        boolean z = this.A02;
        AnonymousClass8PN r1 = (AnonymousClass8PN) C90524aI.A0H(A0p);
        r1.bitField0_ |= 1;
        r1.archived_ = z;
        AnonymousClass8QJ A04 = this.A00.A04();
        AnonymousClass8PN r12 = (AnonymousClass8PN) C90524aI.A0H(A0p);
        A04.getClass();
        r12.messageRange_ = A04;
        r12.bitField0_ |= 2;
        AnonymousClass8LN A042 = super.A04();
        C18740tg.A06(A042);
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(A042);
        AnonymousClass8PN r13 = (AnonymousClass8PN) A0p.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r13.getClass();
        A0H.archiveChatAction_ = r13;
        A0H.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        return A042;
    }

    public boolean BNX() {
        return !this.A02;
    }

    public C202679mP BE5() {
        return this.A00;
    }

    public AnonymousClass11F getChatJid() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C201669k5.A01(this, "ArchiveChatMutation{rowId=", A0u);
        A0u.append(", chatJid=");
        A0u.append(this.A01);
        A0u.append(", isArchived=");
        A0u.append(this.A02);
        A0u.append(", messageRange=");
        A0u.append(this.A00);
        C201669k5.A02(this, A0u);
        C36361kB.A1G(this, A0u);
        return AnonymousClass000.A0s(A0u);
    }

    public C176078bX(C201539jo r11, C202679mP r12, AnonymousClass11F r13, String str, long j, boolean z, boolean z2) {
        super(C199769fw.A03, r11, str, "regular_low", 3, j, z2);
        this.A01 = r13;
        this.A02 = z;
        this.A00 = r12;
    }
}
