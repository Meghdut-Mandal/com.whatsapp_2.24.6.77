package X;

/* renamed from: X.7Iw  reason: invalid class name and case insensitive filesystem */
public final class C152017Iw extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C130536Ll this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152017Iw(C130536Ll r2) {
        super(0);
        this.this$0 = r2;
    }

    /* JADX INFO: finally extract failed */
    public /* bridge */ /* synthetic */ Object invoke() {
        do {
            C130536Ll r12 = this.this$0;
            synchronized (r12.A05) {
                if (!r12.A04) {
                    r12.A04 = true;
                    try {
                        C1506776e r0 = r12.A05;
                        int i = r0.A00;
                        if (i > 0) {
                            Object[] objArr = r0.A01;
                            int i2 = 0;
                            do {
                                C130596Lr r02 = (C130596Lr) objArr[i2];
                                AnonymousClass0GB r9 = r02.A05;
                                C006302t r8 = r02.A0B;
                                Object[] objArr2 = r9.A03;
                                long[] jArr = r9.A02;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    while (true) {
                                        long j = jArr[i3];
                                        if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((255 & j) < 128) {
                                                    r8.invoke(objArr2[(i3 << 3) + i5]);
                                                }
                                                j >>= 8;
                                            }
                                            if (i4 != 8) {
                                                break;
                                            }
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                                r9.A04();
                                i2++;
                            } while (i2 < i);
                        }
                        r12.A04 = false;
                    } catch (Throwable th) {
                        r12.A04 = false;
                        throw th;
                    }
                }
            }
        } while (C130536Ll.A01(this.this$0));
        return AnonymousClass0AJ.A00;
    }
}
