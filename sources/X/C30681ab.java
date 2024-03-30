package X;

/* renamed from: X.1ab  reason: invalid class name and case insensitive filesystem */
public final class C30681ab {
    public static final C64933Qa A01(AnonymousClass8SW r5) {
        boolean z = true;
        if ((r5.bitField0_ & 1) == 0) {
            z = false;
        }
        if (z) {
            AnonymousClass11F A02 = AnonymousClass11F.A00.A02(r5.remoteJid_);
            if (A02 == null) {
                throw new C28541Tb((Integer) 0, "Message Key is malformed: failed to parse remote JID.");
            } else if ((r5.bitField0_ & 4) != 0) {
                String str = r5.id_;
                AnonymousClass00C.A0B(str);
                if (str.length() != 0) {
                    return new C64933Qa(A02, str, r5.fromMe_);
                }
                throw new C28541Tb((Integer) 0, "Message Key is malformed: ID is null or empty");
            } else {
                throw new C28541Tb((Integer) 0, "Message Key is malformed: no message ID set.");
            }
        } else {
            throw new C28541Tb((Integer) 0, "Message Key is malformed: no remote JID set.");
        }
    }

    public final C64933Qa A02(AnonymousClass8SU r4) {
        if ((r4.bitField0_ & 1) != 0) {
            AnonymousClass8SW r0 = r4.key_;
            if (r0 == null) {
                r0 = AnonymousClass8SW.DEFAULT_INSTANCE;
            }
            AnonymousClass00C.A08(r0);
            return A01(r0);
        }
        throw new C28541Tb((Integer) 0, "Message Key was not set.");
    }

    public static final long A00(AnonymousClass8SU r3) {
        if ((r3.bitField0_ & 4) != 0) {
            return r3.messageTimestamp_ * 1000;
        }
        return 0;
    }
}
