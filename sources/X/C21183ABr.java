package X;

import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.ABr  reason: case insensitive filesystem */
public class C21183ABr implements C22938Ayo, C22942Ays, C17740rx {
    public final C20810yC A00;
    public final AnonymousClass16D A01;
    public final C21060yb A02;
    public final C19630wG A03;
    public final C18820ts A04;
    public final C202029kv A05;

    public void B24(C196159Xy r12, AnonymousClass3T1 r13) {
        AnonymousClass2bW r5 = (AnonymousClass2bW) r13;
        AnonymousClass8NL r4 = r12.A00;
        C172948Pu r0 = ((AnonymousClass8SX) r4.A00).contactsArrayMessage_;
        if (r0 == null) {
            r0 = C172948Pu.DEFAULT_INSTANCE;
        }
        AnonymousClass8NN A0q = r0.A0q();
        if (!TextUtils.isEmpty(r5.A00)) {
            String str = r5.A00;
            C172948Pu r1 = (C172948Pu) C90524aI.A0H(A0q);
            int i = C172948Pu.CONTACTS_FIELD_NUMBER;
            str.getClass();
            r1.bitField0_ |= 1;
            r1.displayName_ = str;
        }
        List A1X = r5.A1X();
        int i2 = 0;
        while (i2 < A1X.size() && i2 < 257) {
            String A0s = C36401kF.A0s(A1X, i2);
            AnonymousClass8NN A0p = C172938Pt.DEFAULT_INSTANCE.A0p();
            String A002 = new C65033Ql(this.A01, this.A02, this.A03, this.A04).A00(A0s);
            if (A002 != null) {
                C172938Pt r14 = (C172938Pt) C90524aI.A0H(A0p);
                r14.bitField0_ |= 1;
                r14.displayName_ = A002;
            }
            C172938Pt r15 = (C172938Pt) C90524aI.A0H(A0p);
            A0s.getClass();
            r15.bitField0_ |= 2;
            r15.vcard_ = A0s;
            C170918Hz A0R = A0p.A0R();
            C172948Pu r2 = (C172948Pu) C90524aI.A0H(A0q);
            int i3 = C172948Pu.CONTACTS_FIELD_NUMBER;
            A0R.getClass();
            C23122B6c b6c = r2.contacts_;
            if (!((C21886AcE) b6c).A00) {
                b6c = C170918Hz.A0A(b6c);
                r2.contacts_ = b6c;
            }
            b6c.add(A0R);
            i2++;
        }
        if (!Collections.unmodifiableList(((C172948Pu) A0q.A00).contacts_).isEmpty() || !r12.A03 || !C165597tg.A1R(this.A00)) {
            C80103un r22 = r12.A02;
            byte[] bArr = r12.A0B;
            if (C202029kv.A02(r22, r13, bArr)) {
                AnonymousClass8SG A003 = C196159Xy.A00(this.A05, r12, r22, r13, bArr);
                C172948Pu r16 = (C172948Pu) C90524aI.A0H(A0q);
                A003.getClass();
                r16.contextInfo_ = A003;
                r16.bitField0_ |= 2;
            }
            AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r4);
            C172948Pu r02 = (C172948Pu) A0q.A0R();
            r02.getClass();
            A0E.contactsArrayMessage_ = r02;
            A0E.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            return;
        }
        Log.w("FMessageContactArrayProtobuf/buildProtobufMessage/empty contact list");
        throw C165567td.A0K(11);
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r7) {
        AnonymousClass8SX r1 = r7.A0A;
        if ((r1.bitField0_ & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0) {
            return null;
        }
        C172948Pu r3 = r1.contactsArrayMessage_;
        if (r3 == null) {
            r3 = C172948Pu.DEFAULT_INSTANCE;
        }
        AnonymousClass2bW r5 = new AnonymousClass2bW(r7.A0C, r7.A04);
        if ((r3.bitField0_ & 1) != 0) {
            r5.A00 = r3.displayName_;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (C172938Pt r2 : r3.contacts_) {
            if ((r2.bitField0_ & 2) != 0) {
                if (A0I.size() >= 257) {
                    break;
                }
                A0I.add(r2.vcard_);
            }
        }
        if (!A0I.isEmpty() || !this.A00.A0E(4466)) {
            r5.A1Y(A0I);
            return r5;
        }
        throw C165617ti.A0S(C36421kH.A0U(), "Not valid contacts");
    }

    public C21183ABr(AnonymousClass16D r1, C21060yb r2, C19630wG r3, C18820ts r4, C20810yC r5, C202029kv r6) {
        this.A03 = r3;
        this.A00 = r5;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r6;
    }
}
