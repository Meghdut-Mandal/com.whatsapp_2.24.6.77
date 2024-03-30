package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.NoSuchElementException;

/* renamed from: X.2bd  reason: invalid class name and case insensitive filesystem */
public final class C46762bd extends AnonymousClass2bM {
    public long A00;
    public C52292pC A01;
    public final byte[] A02;

    public void A1c(Cursor cursor, C219712j r10, HashMap hashMap) {
        AnonymousClass00C.A0D(r10, 0);
        C36321k7.A0x(cursor, hashMap);
        super.A1c(cursor, r10, hashMap);
        int A002 = C224014d.A00(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, hashMap);
        int A003 = C224014d.A00("sender_timestamp", hashMap);
        int i = cursor.getInt(A002);
        long j = cursor.getLong(A003);
        int i2 = C52292pC.UNKNOWN.value;
        int i3 = C52292pC.NOT_GOING.value;
        if (i < i2) {
            i = i2;
        } else if (i > i3) {
            i = i3;
        }
        for (C52292pC r1 : C52292pC.values()) {
            if (r1.value == i) {
                this.A01 = r1;
                this.A00 = j;
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public C46762bd(C52292pC r2, C64933Qa r3, long j) {
        super(r3, 93, j);
        this.A00 = j;
        this.A01 = r2;
        this.A02 = null;
    }

    public C46762bd(C52292pC r2, C64933Qa r3, C195759Vv r4, long j, long j2) {
        super(r3, 93, j);
        this.A00 = j2;
        this.A01 = r2;
        this.A02 = null;
        this.A04 = r4;
    }

    public C46762bd(C64933Qa r3, C195759Vv r4, byte[] bArr, long j) {
        super(r3, 93, j);
        this.A00 = this.A00;
        this.A01 = this.A01;
        this.A02 = bArr;
        this.A04 = r4;
    }

    public C46762bd(C64933Qa r2, long j) {
        super(r2, 93, j);
        this.A02 = null;
    }
}
