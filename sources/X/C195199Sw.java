package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* renamed from: X.9Sw  reason: invalid class name and case insensitive filesystem */
public class C195199Sw {
    public int A00;
    public int A01;
    public int A02;
    public C201539jo A03;
    public C100024uL A04;
    public Integer A05;
    public Long A06;
    public List A07;
    public boolean A08;
    public byte[] A09 = null;
    public byte[] A0A;
    public byte[] A0B;
    public byte[] A0C;
    public final String A0D;
    public final List A0E;
    public final byte[] A0F;

    public C604137t A00() {
        String str;
        List list;
        C173408Ro r0;
        byte[] bArr;
        if (this.A07 == null && this.A04 == null) {
            str = this.A0D;
            list = this.A0E;
            r0 = null;
        } else {
            AnonymousClass8NN A0p = C173408Ro.DEFAULT_INSTANCE.A0p();
            List list2 = this.A07;
            if (list2 != null) {
                C173408Ro r2 = (C173408Ro) C90524aI.A0H(A0p);
                C23122B6c b6c = r2.mutations_;
                if (!((C21886AcE) b6c).A00) {
                    b6c = C170918Hz.A0A(b6c);
                    r2.mutations_ = b6c;
                }
                C21071A7i.A0O(list2, b6c);
            } else {
                C100024uL r02 = this.A04;
                if (r02 != null) {
                    C173408Ro r1 = (C173408Ro) C90524aI.A0H(A0p);
                    r1.externalMutations_ = r02;
                    r1.bitField0_ |= 2;
                }
            }
            if (this.A03 != null) {
                AnonymousClass8NN A0p2 = AnonymousClass8O0.DEFAULT_INSTANCE.A0p();
                AnonymousClass8I5 A0O = C90474aD.A0O(A0p2, this.A03.A00);
                AnonymousClass8O0 r12 = (AnonymousClass8O0) A0p2.A00;
                r12.bitField0_ |= 1;
                r12.id_ = A0O;
                C173408Ro r13 = (C173408Ro) C90524aI.A0H(A0p);
                AnonymousClass8O0 r03 = (AnonymousClass8O0) A0p2.A0R();
                r03.getClass();
                r13.keyId_ = r03;
                r13.bitField0_ |= 16;
            }
            byte[] bArr2 = this.A0C;
            if (bArr2 != null) {
                AnonymousClass8I5 A0O2 = C90474aD.A0O(A0p, bArr2);
                C173408Ro r14 = (C173408Ro) A0p.A00;
                r14.bitField0_ |= 4;
                r14.snapshotMac_ = A0O2;
            }
            byte[] bArr3 = this.A0B;
            if (bArr3 != null) {
                AnonymousClass8I5 A0O3 = C90474aD.A0O(A0p, bArr3);
                C173408Ro r15 = (C173408Ro) A0p.A00;
                r15.bitField0_ |= 8;
                r15.patchMac_ = A0O3;
            }
            Integer num = this.A05;
            if (num != null) {
                int intValue = num.intValue();
                C173408Ro r16 = (C173408Ro) C90524aI.A0H(A0p);
                r16.bitField0_ |= 64;
                r16.deviceIndex_ = intValue;
            }
            if (!(this.A09 == null || this.A06 == null || (bArr = this.A0F) == null)) {
                AnonymousClass8NN A0p3 = C173478Rv.DEFAULT_INSTANCE.A0p();
                AnonymousClass8I5 A0O4 = C90474aD.A0O(A0p3, this.A09);
                C173478Rv r17 = (C173478Rv) A0p3.A00;
                r17.bitField0_ |= 1;
                r17.currentLthash_ = A0O4;
                AnonymousClass8I5 A0O5 = C90474aD.A0O(A0p3, bArr);
                C173478Rv r18 = (C173478Rv) A0p3.A00;
                r18.bitField0_ |= 2;
                r18.newLthash_ = A0O5;
                long longValue = this.A06.longValue();
                ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
                order.putLong(longValue);
                AnonymousClass8I5 A0O6 = C90474aD.A0O(A0p3, order.array());
                C173478Rv r19 = (C173478Rv) A0p3.A00;
                r19.bitField0_ |= 4;
                r19.patchVersion_ = A0O6;
                AnonymousClass8I5 A0O7 = C90474aD.A0O(A0p3, this.A0D.getBytes(C19430v1.A0D));
                C173478Rv r110 = (C173478Rv) A0p3.A00;
                r110.bitField0_ |= 8;
                r110.collectionName_ = A0O7;
                AnonymousClass8I5 A0l = A0p3.A0R().A0l();
                C173408Ro r111 = (C173408Ro) C90524aI.A0H(A0p);
                r111.bitField0_ |= 128;
                r111.clientDebugData_ = A0l;
                byte[] bArr4 = this.A0A;
                if (bArr4 != null) {
                    AnonymousClass8I5 A0O8 = C90474aD.A0O(A0p3, bArr4);
                    C173478Rv r112 = (C173478Rv) A0p3.A00;
                    r112.bitField0_ |= 32;
                    r112.newLthashSubtract_ = A0O8;
                }
                int i = this.A00;
                C173478Rv r113 = (C173478Rv) C90524aI.A0H(A0p3);
                r113.bitField0_ |= 64;
                r113.numberAdd_ = i;
                int i2 = this.A02;
                C173478Rv r114 = (C173478Rv) C90524aI.A0H(A0p3);
                r114.bitField0_ |= 128;
                r114.numberRemove_ = i2;
                int i3 = this.A01;
                C173478Rv r115 = (C173478Rv) C90524aI.A0H(A0p3);
                r115.bitField0_ |= 256;
                r115.numberOverride_ = i3;
                AnonymousClass90K r04 = AnonymousClass90K.Android;
                C173478Rv r116 = (C173478Rv) C90524aI.A0H(A0p3);
                r116.senderPlatform_ = r04.value;
                r116.bitField0_ |= 512;
                boolean z = this.A08;
                C173478Rv r117 = (C173478Rv) C90524aI.A0H(A0p3);
                r117.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                r117.isSenderPrimary_ = z;
            }
            str = this.A0D;
            list = this.A0E;
            r0 = (C173408Ro) A0p.A0R();
        }
        return new C604137t(r0, str, list, this.A0F);
    }

    public C195199Sw(String str, List list, byte[] bArr) {
        this.A0D = str;
        this.A0E = list;
        this.A0F = bArr;
    }
}
