package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass187;
import X.AnonymousClass189;
import X.AnonymousClass18I;
import X.AnonymousClass19A;
import X.AnonymousClass5J3;
import X.AnonymousClass79X;
import X.AnonymousClass7i8;
import X.AnonymousClass9KO;
import X.C121865tq;
import X.C163727qf;
import X.C18800tq;
import X.C20300xL;
import X.C203239na;
import X.C36321k7;
import X.C36341k9;
import X.C36361kB;
import X.C36411kG;
import X.C80293vA;
import X.C90464aC;
import X.C90504aG;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.whispersystems.jobqueue.Job;

public final class RotateSignedPreKeyJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass189 A00;
    public transient AnonymousClass187 A01;
    public transient C20300xL A02;
    public transient AnonymousClass18I A03;
    public transient AnonymousClass19A A04;
    public final byte[] data;
    public final byte[] id;
    public final byte[] signature;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RotateSignedPreKeyJob(byte[] r4, byte[] r5, byte[] r6) {
        /*
            r3 = this;
            X.673 r1 = new X.673
            r1.<init>()
            java.lang.String r0 = "RotateSignedPreKeyJob"
            r1.A00 = r0
            X.AnonymousClass673.A00(r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r3.<init>(r0)
            X.C18740tg.A0G(r4)
            r3.id = r4
            X.C18740tg.A0G(r5)
            r3.data = r5
            X.C18740tg.A0G(r6)
            r3.signature = r6
            int r2 = r4.length
            r0 = 3
            if (r2 != r0) goto L_0x0047
            int r2 = r5.length
            r0 = 32
            if (r2 != r0) goto L_0x003c
            int r2 = r6.length
            r0 = 64
            if (r2 != r0) goto L_0x0031
            return
        L_0x0031:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "invalid signed pre-key signature length: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r0
        L_0x003c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "invalid signed pre-key length: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r0
        L_0x0047:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "invalid signed pre-key id length: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.RotateSignedPreKeyJob.<init>(byte[], byte[], byte[]):void");
    }

    public static void A00(RotateSignedPreKeyJob rotateSignedPreKeyJob, byte[] bArr) {
        AnonymousClass79X A07 = rotateSignedPreKeyJob.A03.A07();
        try {
            if (!MessageDigest.isEqual(bArr, rotateSignedPreKeyJob.A00.A0c())) {
                rotateSignedPreKeyJob.A00.A0O();
                rotateSignedPreKeyJob.A02.A07();
            }
            if (A07 != null) {
                A07.close();
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        byte[] bArr = this.id;
        if (bArr != null) {
            byte[] bArr2 = this.data;
            if (bArr2 != null) {
                byte[] bArr3 = this.signature;
                if (bArr3 != null) {
                    int length = bArr.length;
                    if (length == 3) {
                        int length2 = bArr2.length;
                        if (length2 == 32) {
                            int length3 = bArr3.length;
                            if (length3 != 64) {
                                throw new InvalidObjectException(AnonymousClass000.A0r("invalid signed pre-key signature length: ", AnonymousClass000.A0u(), length3));
                            }
                            return;
                        }
                        throw new InvalidObjectException(AnonymousClass000.A0r("invalid signed pre-key length: ", AnonymousClass000.A0u(), length2));
                    }
                    throw new InvalidObjectException(AnonymousClass000.A0r("invalid signed pre-key id length: ", AnonymousClass000.A0u(), length));
                }
                throw new InvalidObjectException("signature cannot be null");
            }
            throw new InvalidObjectException("data cannot be null");
        }
        throw new InvalidObjectException("id cannot be null");
    }

    public void A0B() {
        C121865tq r0;
        StringBuilder A0h;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("starting rotate signed pre key job");
        C36321k7.A1a(A0u, A0E());
        if (this.A00.A0X()) {
            r0 = this.A00.A0G();
        } else {
            r0 = (C121865tq) C90504aG.A0i(this.A01, new C163727qf(this, 14));
        }
        if (!Arrays.equals(this.id, r0.A01)) {
            A0h = AnonymousClass000.A0u();
            A0h.append("aborting rotate signed pre key job due to id mismatch with latest");
        } else {
            String A09 = this.A04.A09();
            AtomicInteger atomicInteger = new AtomicInteger();
            AtomicReference atomicReference = new AtomicReference();
            this.A04.A06(Message.obtain((Handler) null, 0, 86, 0, new AnonymousClass9KO(new AnonymousClass5J3(this, atomicInteger, atomicReference), new C121865tq(this.id, this.data, this.signature), A09)), A09).get();
            int i = atomicInteger.get();
            if (i == 503) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("server 503 error during rotate signed pre key job");
                throw new Exception(AnonymousClass000.A0q(A0E(), A0u2));
            } else if (i == 409) {
                C36341k9.A1O(C90464aC.A0h(i, "server error code returned during rotate signed pre key job; errorCode="), A0E());
                byte[] bArr = (byte[]) atomicReference.get();
                if (bArr == null) {
                    return;
                }
                if (this.A00.A0X()) {
                    A00(this, bArr);
                    return;
                }
                AnonymousClass187 r2 = this.A01;
                r2.A00.submit(new C80293vA(this, bArr, 28));
                return;
            } else if (i != 0) {
                A0h = C90464aC.A0h(i, "server error code returned during rotate signed pre key job; errorCode=");
            } else {
                return;
            }
        }
        C36341k9.A1O(A0h, A0E());
    }

    public String A0E() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("; signedPreKeyId=");
        A0u.append(C203239na.A00(this.id));
        A0u.append("; persistentId=");
        return C36411kG.A11(A0u, this.A01);
    }

    public void Bqf(Context context) {
        C18800tq A0I = C90464aC.A0I(context);
        this.A03 = (AnonymousClass18I) A0I.A7o.get();
        this.A04 = C36361kB.A0c(A0I);
        this.A01 = (AnonymousClass187) A0I.A7n.get();
        this.A02 = (C20300xL) A0I.A5R.get();
        this.A00 = A0I.AzT();
    }
}
