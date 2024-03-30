package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* renamed from: X.6n4  reason: invalid class name and case insensitive filesystem */
public class C141336n4 implements C160937lp {
    public int A00 = 0;
    public long A01 = 0;
    public Context A02;
    public Uri A03;
    public C125085zI A04;
    public C159107ip A05;
    public boolean A06;
    public boolean A07;
    public int A08 = -1;
    public AU0 A09;
    public AnonymousClass63I A0A;
    public C160917ln A0B;
    public long A0C = C112915ef.A00;

    public AnonymousClass6D7 BDz() {
        return null;
    }

    public boolean BLY() {
        return false;
    }

    public void cancel() {
    }

    /* JADX INFO: finally extract failed */
    private void A00() {
        AU0 au0;
        if (!this.A06) {
            au0 = null;
            try {
                AU0 au02 = this.A09;
                Objects.requireNonNull(au02);
                C160917ln r1 = this.A0B;
                Objects.requireNonNull(r1);
                r1.Bwa(this.A08, (Bitmap) au02.A01());
                AU0 au03 = this.A09;
                if (au03 != null) {
                    au03.close();
                    this.A09 = null;
                }
                this.A06 = true;
            } catch (Throwable th) {
                AU0 au04 = this.A09;
                if (au04 != null) {
                    au04.close();
                    this.A09 = au0;
                }
                throw th;
            }
        } else if (this.A07) {
            au0 = null;
            AU0 A002 = this.A0A.A00();
            this.A09 = A002;
            if (A002 != null) {
                C160917ln r12 = this.A0B;
                Objects.requireNonNull(r12);
                r12.Bwa(this.A08, (Bitmap) A002.A01());
            }
            AU0 au05 = this.A09;
            if (au05 != null) {
                au05.close();
                this.A09 = null;
            }
        }
    }

    public void B3P(int i) {
        this.A08 = i;
        AnonymousClass6QD r2 = this.A04.A05;
        Objects.requireNonNull(r2);
        C128956Eg A012 = r2.A01(AnonymousClass5TE.VIDEO, this.A08);
        if (A012 != null) {
            List list = A012.A01;
            if (!C36441kJ.A15(list).isEmpty()) {
                C36441kJ.A15(list).get(0);
                C36441kJ.A15(list).get(0);
                this.A0C = C112915ef.A00;
            }
        }
        this.A0B = this.A05.B4S();
    }

    public void release() {
        C160917ln r0 = this.A0B;
        if (r0 != null) {
            r0.finish();
        }
        AU0 au0 = this.A09;
        if (au0 != null) {
            au0.close();
        }
        AnonymousClass63I r2 = this.A0A;
        r2.A01 = null;
        r2.A03 = null;
        AU0 au02 = r2.A02;
        if (au02 != null) {
            au02.close();
        }
        r2.A02 = null;
        r2.A00 = 0;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00ef */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ea A[Catch:{ Exception -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r18 = this;
            r4 = r18
            X.5zI r0 = r4.A04
            X.6QD r2 = r0.A05
            java.util.Objects.requireNonNull(r2)
            X.5TE r1 = X.AnonymousClass5TE.VIDEO
            int r0 = r4.A08
            X.6Eg r0 = r2.A01(r1, r0)
            java.util.Objects.requireNonNull(r0)
            java.util.List r0 = r0.A01
            java.util.ArrayList r0 = X.C36441kJ.A15(r0)
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            X.6F1 r0 = (X.AnonymousClass6F1) r0
            java.io.File r0 = r0.A01
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
            r4.A03 = r1
            X.63I r9 = r4.A0A
            android.content.Context r0 = r4.A02
            boolean r8 = X.C36341k9.A1a(r0, r1)
            r6 = 0
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x0115 }
            java.io.InputStream r5 = r0.openInputStream(r1)     // Catch:{ all -> 0x0115 }
            if (r5 == 0) goto L_0x00f7
            java.io.ByteArrayOutputStream r2 = X.C90524aI.A0Q()     // Catch:{ Exception -> 0x00ee, all -> 0x00e3 }
            X.6Ws r11 = new X.6Ws     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            r11.<init>(r5, r2)     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            r11.A04()     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            int r0 = r2.size()     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            if (r0 <= 0) goto L_0x0059
            r5.close()     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            byte[] r0 = r2.toByteArray()     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            java.io.ByteArrayInputStream r5 = X.C90524aI.A0P(r0)     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
        L_0x0059:
            boolean r0 = r5 instanceof java.io.FileInputStream     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            if (r0 == 0) goto L_0x007e
            r0 = r5
            java.io.FileInputStream r0 = (java.io.FileInputStream) r0     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            java.nio.channels.FileChannel r7 = r0.getChannel()     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            r0 = 0
            r7.position(r0)     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
        L_0x0069:
            android.graphics.Movie r16 = android.graphics.Movie.decodeStream(r5)     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            boolean r0 = r11.A01     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            if (r0 == 0) goto L_0x00da
            java.util.List r0 = r11.A05     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            r17 = r0
            int r14 = r17.size()     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            goto L_0x0082
        L_0x007e:
            r5.reset()     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            goto L_0x0069
        L_0x0082:
            r13 = 0
            r12 = 0
        L_0x0084:
            if (r13 >= r14) goto L_0x00b7
            boolean r0 = r11.A01     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            if (r0 == 0) goto L_0x00b0
            int r0 = r17.size()     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            if (r13 < r0) goto L_0x0092
            r15 = 1
            goto L_0x009c
        L_0x0092:
            r0 = r17
            java.lang.Object r0 = r0.get(r13)     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            int[] r0 = (int[]) r0     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            r15 = r0[r8]     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
        L_0x009c:
            int r12 = r12 + r15
            int r7 = r16.width()     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            int r1 = r16.height()     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            X.5uL r0 = new X.5uL     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            r0.<init>(r12, r15, r7, r1)     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            r10.add(r0)     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            int r13 = r13 + 1
            goto L_0x0084
        L_0x00b0:
            java.lang.String r0 = "getFrameDurationMs called before extract"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            goto L_0x00e0
        L_0x00b7:
            r0 = r16
            r9.A01 = r0     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            r9.A03 = r10     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            X.AU0 r1 = r9.A00()     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            r9.A02 = r1     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            int r0 = r10.size()     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            if (r0 <= r8) goto L_0x00d0
            X.5Ra r0 = X.C107825Ra.AnimatedImage     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
        L_0x00cb:
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r0)     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            goto L_0x00d3
        L_0x00d0:
            X.5Ra r0 = X.C107825Ra.StaticImage     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
            goto L_0x00cb
        L_0x00d3:
            r5.close()     // Catch:{ Exception -> 0x00fc }
            r2.close()     // Catch:{ Exception -> 0x00fc }
            goto L_0x00fc
        L_0x00da:
            java.lang.String r0 = "getFrameCount called before extract"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
        L_0x00e0:
            throw r0     // Catch:{ Exception -> 0x00ef, all -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            goto L_0x00e5
        L_0x00e3:
            r0 = move-exception
            r2 = r6
        L_0x00e5:
            r5.close()     // Catch:{ Exception -> 0x0116 }
            if (r2 == 0) goto L_0x0116
            r2.close()     // Catch:{ Exception -> 0x0116 }
            throw r0
        L_0x00ee:
            r2 = r6
        L_0x00ef:
            r5.close()     // Catch:{ Exception -> 0x00f7 }
            if (r2 == 0) goto L_0x00f7
            r2.close()     // Catch:{ Exception -> 0x00f7 }
        L_0x00f7:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r6, r6)
        L_0x00fc:
            java.lang.Object r2 = r0.first
            X.AU0 r2 = (X.AU0) r2
            r4.A09 = r2
            java.lang.Object r1 = r0.second
            X.5Ra r0 = X.C107825Ra.AnimatedImage
            if (r1 != r0) goto L_0x0109
            r3 = 1
        L_0x0109:
            r4.A07 = r3
            if (r2 == 0) goto L_0x010e
            return
        L_0x010e:
            java.lang.String r0 = "Bitmap cannot be loaded"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x0115:
            r0 = move-exception
        L_0x0116:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C141336n4.start():void");
    }

    public C141336n4(Context context, AnonymousClass63I r4, C125085zI r5, C159107ip r6) {
        this.A02 = context;
        this.A0A = r4;
        this.A04 = r5;
        this.A05 = r6;
    }

    public long B57() {
        int i;
        A00();
        if (this.A07) {
            AnonymousClass63I r4 = this.A0A;
            if (r4.A02 != null) {
                long j = this.A01;
                int i2 = this.A00;
                List list = r4.A03;
                if (list == null || list.size() <= i2) {
                    i = 0;
                } else {
                    i = ((C122125uL) list.get(i2)).A00;
                }
                this.A01 = j + C36371kC.A07(i);
                int i3 = this.A00 + 1;
                this.A00 = i3;
                if (i3 >= C90484aE.A0F(r4.A03)) {
                    this.A00 = 0;
                }
                int i4 = this.A00;
                Movie movie = r4.A01;
                List list2 = r4.A03;
                if (!(movie == null || list2 == null || list2.size() <= i4)) {
                    r4.A00 = i4;
                    movie.setTime(((C122125uL) list2.get(i4)).A02);
                }
                return this.A01;
            }
        }
        this.A01 += this.A0C;
        return this.A01;
    }

    public void B58(long j) {
        A00();
        this.A01 = j;
    }

    public long BAp() {
        return this.A01;
    }

    public void BpZ(long j) {
        A00();
        this.A01 = j;
    }
}
