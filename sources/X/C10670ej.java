package X;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;

/* renamed from: X.0ej  reason: invalid class name and case insensitive filesystem */
public final class C10670ej implements OnCompleteListener {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AnonymousClass0US A03;
    public final C07720Za A04;

    public C10670ej(AnonymousClass0US r1, C07720Za r2, int i, long j, long j2) {
        this.A04 = r2;
        this.A00 = i;
        this.A03 = r1;
        this.A01 = j;
        this.A02 = j2;
    }

    public static AnonymousClass0KD A00(C10350e6 r6, C07560Yg r7, int i) {
        AnonymousClass0KD r5;
        C04510Kx r0 = r7.A0Q;
        if (r0 == null) {
            r5 = null;
        } else {
            r5 = r0.A02;
        }
        if (r5 != null && r5.A02) {
            int[] iArr = r5.A04;
            if (iArr != null) {
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (iArr[i2] == i) {
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            } else {
                int[] iArr2 = r5.A05;
                if (iArr2 != null) {
                    int length2 = iArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            if (iArr2[i3] == i) {
                                break;
                            }
                            i3++;
                        } else {
                            break;
                        }
                    }
                }
            }
            if (r6.A00 < r5.A00) {
                return r5;
            }
        }
        return null;
    }

    public final void onComplete(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        C07720Za r7 = this.A04;
        if (r7.A08()) {
            AnonymousClass0KC r8 = AnonymousClass0Xx.A00().A00;
            if (r8 == null || r8.A03) {
                C10350e6 r9 = (C10350e6) r7.A09.get(this.A03);
                if (r9 != null) {
                    C17590rf r3 = r9.A04;
                    if (r3 instanceof C07560Yg) {
                        C07560Yg r32 = (C07560Yg) r3;
                        long j2 = this.A01;
                        boolean z = true;
                        long j3 = 0;
                        boolean A1R = AnonymousClass000.A1R((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)));
                        int i7 = r32.A0E;
                        if (r8 != null) {
                            A1R &= r8.A04;
                            i2 = r8.A01;
                            i3 = r8.A02;
                            i = r8.A00;
                            if (r32.A0Q != null && !r32.BLT()) {
                                AnonymousClass0KD A002 = A00(r9, r32, this.A00);
                                if (A002 != null) {
                                    if (!A002.A03 || j2 <= 0) {
                                        z = false;
                                    }
                                    i3 = A002.A00;
                                    A1R = z;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            i = 0;
                            i2 = 5000;
                            i3 = 100;
                        }
                        if (task.isSuccessful()) {
                            i4 = 0;
                            i5 = 0;
                        } else {
                            if (((zzw) task).zzd) {
                                i4 = 100;
                            } else {
                                Exception exception = task.getException();
                                if (exception instanceof ApiException) {
                                    Status status = ((ApiException) exception).mStatus;
                                    i4 = status.A01;
                                    AnonymousClass0L0 r2 = status.A03;
                                    if (r2 != null) {
                                        i5 = r2.A01;
                                    }
                                } else {
                                    i4 = 101;
                                }
                            }
                            i5 = -1;
                        }
                        if (A1R) {
                            j3 = j2;
                            j = System.currentTimeMillis();
                            i6 = (int) (SystemClock.elapsedRealtime() - this.A02);
                        } else {
                            j = 0;
                            i6 = -1;
                        }
                        AnonymousClass000.A14(r7.A06, new AnonymousClass0TC(new AnonymousClass0KE((String) null, (String) null, this.A00, i4, i5, i7, i6, j3, j), i, i3, (long) i2), 18);
                    }
                }
            }
        }
    }
}
