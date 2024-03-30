package X;

/* renamed from: X.7Ub  reason: invalid class name and case insensitive filesystem */
public final class C154917Ub extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass0G9 $instances;
    public final /* synthetic */ int $token;
    public final /* synthetic */ C136976fO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154917Ub(AnonymousClass0G9 r2, C136976fO r3, int i) {
        super(1);
        this.this$0 = r3;
        this.$token = i;
        this.$instances = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C158777iD r9 = (C158777iD) obj;
        C136976fO r2 = this.this$0;
        if (r2.A00 == this.$token && AnonymousClass00C.A0J(this.$instances, r2.A02) && (r9 instanceof C136986fP)) {
            AnonymousClass0G9 r8 = this.$instances;
            int i = this.$token;
            C136976fO r5 = this.this$0;
            long[] jArr = r8.A03;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                        int A06 = C90484aE.A06(i2, length);
                        for (int i3 = 0; i3 < A06; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i2 << 3) + i3;
                                Object obj2 = r8.A04[i4];
                                if (r8.A02[i4] != i) {
                                    C136986fP r13 = (C136986fP) r9;
                                    AnonymousClass68K r14 = r13.A0B;
                                    r14.A02(obj2, r5);
                                    if ((obj2 instanceof C161537n4) && obj2 != null) {
                                        if (!r14.A00.A03(obj2)) {
                                            r13.A0A.A00(obj2);
                                        }
                                        AnonymousClass0GA r0 = r5.A03;
                                        if (r0 != null) {
                                            r0.A07(obj2);
                                            if (r0.A01 == 0) {
                                                r5.A03 = null;
                                            }
                                        }
                                    }
                                    r8.A04(i4);
                                }
                            }
                            j >>= 8;
                        }
                        if (A06 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            if (this.$instances.A01 == 0) {
                this.this$0.A02 = null;
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
