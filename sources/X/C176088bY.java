package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.Objects;

/* renamed from: X.8bY  reason: invalid class name and case insensitive filesystem */
public final class C176088bY extends C201669k5 implements C22936Aym, AnonymousClass4QL {
    public final AnonymousClass11F A00;
    public final boolean A01;

    public C176088bY(C201539jo r11, AnonymousClass11F r12, String str, long j, boolean z, boolean z2) {
        super(C199769fw.A03, r11, str, "regular_low", 7, j, z);
        this.A00 = r12;
        this.A01 = z2;
    }

    public boolean BNX() {
        return !this.A01;
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8LN A04 = super.A04();
        if (A04 != null) {
            AnonymousClass8NN A0p = AnonymousClass8OE.DEFAULT_INSTANCE.A0p();
            boolean z = this.A01;
            AnonymousClass8OE r1 = (AnonymousClass8OE) C90524aI.A0H(A0p);
            r1.bitField0_ |= 1;
            r1.locked_ = z;
            AnonymousClass8SS A0H = AnonymousClass8NN.A0H(A04);
            AnonymousClass8OE r12 = (AnonymousClass8OE) A0p.A0R();
            int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
            r12.getClass();
            A0H.lockChatAction_ = r12;
            A0H.bitField1_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        } else {
            A04 = null;
        }
        Objects.requireNonNull(A04, "Super returned null builder");
        return A04;
    }

    public AnonymousClass11F getChatJid() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        StringBuilder A0q = C90484aE.A0q("LockChatMutation{", A0u);
        C201669k5.A01(this, "rowId=", A0q);
        A0q.append(", ");
        StringBuilder A0j = C90464aC.A0j(A0q, A0u);
        A0j.append("chatJid=");
        A0j.append(this.A00);
        A0j.append(", ");
        StringBuilder A0j2 = C90464aC.A0j(A0j, A0u);
        A0j2.append("isLocked=");
        A0j2.append(this.A01);
        A0j2.append(", ");
        StringBuilder A0j3 = C90464aC.A0j(A0j2, A0u);
        A0j3.append("timestamp=");
        A0j3.append(this.A04);
        A0j3.append(", ");
        StringBuilder A0j4 = C90464aC.A0j(A0j3, A0u);
        A0j4.append("areDependenciesMissing=");
        A0j4.append(A09());
        A0j4.append(", ");
        StringBuilder A0j5 = C90464aC.A0j(A0j4, A0u);
        A0j5.append("operation=");
        A0j5.append(this.A05);
        A0j5.append(", ");
        StringBuilder A0j6 = C90464aC.A0j(A0j5, A0u);
        A0j6.append("collectionName=");
        A0j6.append(this.A06);
        A0j6.append(", ");
        StringBuilder A0j7 = C90464aC.A0j(A0j6, A0u);
        A0j7.append("keyId=");
        A0j7.append(this.A00);
        A0j7.append(", ");
        C36351kA.A1K(A0j7, A0u);
        String A0q2 = AnonymousClass000.A0q("}", A0u);
        AnonymousClass00C.A08(A0q2);
        return A0q2;
    }
}
