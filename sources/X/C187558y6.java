package X;

/* renamed from: X.8y6  reason: invalid class name and case insensitive filesystem */
public enum C187558y6 {
    A00(0),
    A02(1),
    A01(2),
    A03(3),
    A06(5),
    A07(6),
    A08(7),
    A09(8),
    A04(9),
    A0A(10),
    A0B(11),
    A05(12);
    
    public final C201289jH mHttpPriority;

    /* access modifiers changed from: public */
    static {
        A00 = new C187558y6(new C201289jH((byte) 3, true), "DEFAULT", 0);
        A02 = new C187558y6(new C201289jH((byte) 4, false), "PREFETCH", 1);
        A01 = new C187558y6(new C201289jH((byte) 3, false), "IMPORTANT_PREFETCH", 2);
        A03 = new C187558y6(new C201289jH((byte) 4, true), "PREFETCH_INCREMENTAL", 3);
        new C187558y6(new C201289jH((byte) 3, true), "IMPORTANT_PREFETCH_INCREMENTAL", 4);
        A06 = new C187558y6(new C201289jH((byte) 5, false), "UNIMPORTANT_PREFETCH", 5);
        A07 = new C187558y6(new C201289jH((byte) 5, true), "UNIMPORTANT_PREFETCH_INCREMENTAL", 6);
        A08 = new C187558y6(new C201289jH((byte) 6, false), "VERY_UNIMPORTANT_PREFETCH", 7);
        A09 = new C187558y6(new C201289jH((byte) 6, true), "VERY_UNIMPORTANT_PREFETCH_INCREMENTAL", 8);
        A04 = new C187558y6(new C201289jH((byte) 0, false), "STREAMING", 9);
        A0A = new C187558y6(new C201289jH((byte) 2, false), "WARMUP", 10);
        A0B = new C187558y6(new C201289jH((byte) 2, true), "WARMUP_INCREMENTAL", 11);
        A05 = new C187558y6(new C201289jH((byte) 0, true), "STREAMING_INCREMENTAL", 12);
    }

    /* access modifiers changed from: public */
    C187558y6(int i) {
        this.mHttpPriority = r1;
    }
}
